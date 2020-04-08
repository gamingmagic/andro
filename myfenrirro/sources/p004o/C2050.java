package p004o;

/* renamed from: o.ﬤ */
class C2050 implements Runnable {

    /* renamed from: 鷭 */
    final /* synthetic */ C1812 f8975;

    C2050(C1812 r1) {
        this.f8975 = r1;
    }

    public final void run() {
        C0214bi biVar = C1014.f6148;
        C1014.f6142.f1698.f8351 = C0574na.UNLOADED;
        C1014.f6144.mo4336(true);
        C0453ix ixVar = C1014.f6147.f51;
        String str = "Loading resources";
        if (ixVar.f1370 != null) {
            C1014.f6147.mo3387((Runnable) new C0473jm(ixVar));
        }
        C1014.f6147.mo3387((Runnable) new C0471jk(ixVar, str));
        C1558[] r3 = new C1558[1];
        boolean[] zArr = new boolean[1];
        C1014.f6158.mo3387((Runnable) new C0221bp(biVar, r3, zArr));
        C0214bi.m203(zArr);
        zArr[0] = false;
        C1812 r0 = C1014.f6142.f1698;
        C0222bq bqVar = new C0222bq(biVar, r3, zArr);
        C1812 r5 = r0;
        C1812 r32 = r0;
        synchronized (r0) {
            r5.f8360.add(bqVar);
            C0214bi.m203(zArr);
            C1014.f6147.mo3387((Runnable) new C0473jm(C1014.f6147.f51));
            C1014.f6144.mo4336(false);
        }
    }
}
