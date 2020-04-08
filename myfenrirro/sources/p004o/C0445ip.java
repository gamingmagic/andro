package p004o;

import java.util.LinkedList;

/* renamed from: o.ip */
class C0445ip implements C0598ny {

    /* renamed from: Ĥ */
    Thread f1341;

    /* renamed from: ĥ */
    LinkedList<Runnable> f1342 = new LinkedList<>();

    /* renamed from: 鷭 */
    public synchronized void mo3387(Runnable runnable) {
        synchronized (this.f1342) {
            this.f1342.add(runnable);
        }
        synchronized (this.f1341) {
            this.f1341.notify();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Ć */
    public final synchronized Runnable mo3841() {
        Runnable runnable;
        synchronized (this.f1342) {
            runnable = (Runnable) this.f1342.poll();
        }
        return runnable;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˮ͈ */
    public void mo3842() {
        while (true) {
            Runnable r3 = mo3841();
            if (r3 != null) {
                r3.run();
            } else {
                synchronized (this.f1341) {
                    this.f1341.wait(1000);
                }
            }
        }
    }

    C0445ip(String str) {
        this.f1341 = new Thread(new C0446iq(this), str);
        this.f1341.start();
    }
}
