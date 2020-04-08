package p004o;

import java.util.Comparator;

/* renamed from: o.ls */
class C0536ls implements Comparator<C1413> {

    /* renamed from: 鷭 */
    final /* synthetic */ C0534lq f1700;

    C0536ls(C0534lq lqVar) {
        this.f1700 = lqVar;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C1413 r0 = (C1413) obj;
        C1413 r4 = (C1413) obj2;
        C1413 r3 = r0;
        if (r0.f6970 > r4.f6970) {
            return -1;
        }
        return r3.f6970 < r4.f6970 ? 1 : 0;
    }
}
