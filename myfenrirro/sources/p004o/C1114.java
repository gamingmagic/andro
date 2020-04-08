package p004o;

import com.libroserver.apk.R;

/* renamed from: o.Ȋ */
class C1114 implements Runnable {

    /* renamed from: 鷭 */
    final /* synthetic */ C1564 f6220;

    C1114(C1564 r1) {
        this.f6220 = r1;
    }

    public final void run() {
        if (C0595nv.f2876 == null || C0595nv.f2876.f442 == null || C0595nv.f2876.f442.length() <= 0) {
            C1014.f6147.setContentView(R.layout.login);
            C1014.f6147.f51.f1436 = new C1916();
            return;
        }
        C1014.m1843(C1014.f6140, C0595nv.f2876.f442, C0595nv.f2876.f441);
        C0595nv.f2876.f442 = null;
        C0595nv.f2876.f441 = null;
    }
}
