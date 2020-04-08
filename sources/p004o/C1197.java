package p004o;

/* renamed from: o.ː */
abstract class C1197 {
    C1197() {
    }

    /* renamed from: 鷭 */
    static void m1952(C1510[] r7) {
        if (C1014.f6137.f1636 != null) {
            C1510[] r5 = r7;
            int length = r7.length;
            for (int i = 0; i < length; i++) {
                C1510 r72 = r5[i];
                C1992 r6 = new C1992(r72);
                C1014.f6137.f1636.f6528.put(Integer.valueOf(r72.f7263 - 2), r6);
                C1014.f6147.f51.mo3861(r6.f8848);
            }
            if (C1014.f6137.f1636.f6546 != -1) {
                C1992 r73 = (C1992) C1014.f6137.f1636.f6528.get(Integer.valueOf(C1014.f6137.f1636.f6546));
                if (r73 != null) {
                    r73.f8836 = 32768;
                    C1842 r0 = C1014.f6147.f51.f1445;
                    C1472 r3 = r73.f8839;
                    C1842 r74 = r0;
                    if (r0.f1626.getParent() != null) {
                        r74.mo4533(C0572mz.m662(r3));
                    }
                }
                C1014.f6137.f1636.f6546 = -1;
                C1014.f6147.f51.f1420.mo4588();
            }
            C1014.f6147.f51.f1445.mo4531();
        }
    }
}
