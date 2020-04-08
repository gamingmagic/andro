package p004o;

import android.os.RemoteException;

/* renamed from: o.櫂 */
public final class C1652 extends Exception {

    /* renamed from: 鷭 */
    C1375 f7614;

    private C1652(C1375 r2) {
        this(r2, (RemoteException) null);
    }

    public C1652(int i, String str) {
        this(new C1375(i, str));
    }

    private C1652(C1375 r2, RemoteException remoteException) {
        super(r2.f6935, remoteException);
        this.f7614 = r2;
    }

    public C1652(int i, String str, RemoteException remoteException) {
        this(new C1375(-1001, str), remoteException);
    }
}
