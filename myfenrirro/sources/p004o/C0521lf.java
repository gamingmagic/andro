package p004o;

import android.util.SparseArray;

/* renamed from: o.lf */
public final class C0521lf {

    /* renamed from: 櫯 */
    public C1301 f1636;

    /* renamed from: 鷭 */
    public SparseArray<C0520le> f1637 = new SparseArray<>();

    C0521lf() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final C0206bb mo3953(String str) {
        int size = this.f1637.size();
        for (int i = 0; i < size; i++) {
            C0520le leVar = (C0520le) this.f1637.valueAt(i);
            C0206bb bbVar = C0206bb.class.isAssignableFrom(leVar.getClass()) ? leVar : null;
            C0206bb bbVar2 = bbVar;
            if (bbVar != null && bbVar2.f8657 != null && bbVar2.f8657.equals(str)) {
                return bbVar2;
            }
        }
        return null;
    }
}
