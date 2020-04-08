package p004o;

import java.util.Comparator;

/* renamed from: o.io */
class C0444io implements Comparator<C0442if> {

    /* renamed from: 鷭 */
    final /* synthetic */ C0441in f1340;

    C0444io(C0441in inVar) {
        this.f1340 = inVar;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C0442if ifVar = (C0442if) obj2;
        C0442if ifVar2 = (C0442if) obj;
        int i = ifVar2.f1330 + (ifVar2.f1329 * this.f1340.f1313);
        int i2 = ifVar.f1330 + (ifVar.f1329 * this.f1340.f1313);
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }
}
