package org.apache.http.concurrent;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.http.util.Args;

public class BasicFuture<T> implements Future<T>, Cancellable {
    private final FutureCallback<T> callback;
    private volatile boolean cancelled;
    private volatile boolean completed;

    /* renamed from: ex */
    private volatile Exception f9009ex;
    private volatile T result;

    public BasicFuture(FutureCallback<T> futureCallback) {
        this.callback = futureCallback;
    }

    public boolean isCancelled() {
        return this.cancelled;
    }

    public boolean isDone() {
        return this.completed;
    }

    private T getResult() {
        if (this.f9009ex != null) {
            throw new ExecutionException(this.f9009ex);
        } else if (!this.cancelled) {
            return this.result;
        } else {
            throw new CancellationException();
        }
    }

    public synchronized T get() {
        while (!this.completed) {
            wait();
        }
        return getResult();
    }

    public synchronized T get(long j, TimeUnit timeUnit) {
        long currentTimeMillis;
        Args.notNull(timeUnit, "Time unit");
        long millis = timeUnit.toMillis(j);
        long j2 = millis;
        long currentTimeMillis2 = millis <= 0 ? 0 : System.currentTimeMillis();
        long j3 = j2;
        if (this.completed) {
            return getResult();
        } else if (j2 <= 0) {
            throw new TimeoutException();
        } else {
            do {
                wait(j3);
                if (this.completed) {
                    return getResult();
                }
                currentTimeMillis = j2 - (System.currentTimeMillis() - currentTimeMillis2);
                j3 = currentTimeMillis;
            } while (currentTimeMillis > 0);
            throw new TimeoutException();
        }
    }

    public boolean completed(T t) {
        synchronized (this) {
            if (this.completed) {
                return false;
            }
            this.completed = true;
            this.result = t;
            notifyAll();
            if (this.callback != null) {
                this.callback.completed(t);
            }
            return true;
        }
    }

    public boolean failed(Exception exc) {
        synchronized (this) {
            if (this.completed) {
                return false;
            }
            this.completed = true;
            this.f9009ex = exc;
            notifyAll();
            if (this.callback != null) {
                this.callback.failed(exc);
            }
            return true;
        }
    }

    public boolean cancel(boolean z) {
        synchronized (this) {
            if (this.completed) {
                return false;
            }
            this.completed = true;
            this.cancelled = true;
            notifyAll();
            if (this.callback != null) {
                this.callback.cancelled();
            }
            return true;
        }
    }

    public boolean cancel() {
        return cancel(true);
    }
}
