package p004o;

import android.graphics.Point;
import com.roworkshop.andro.c_point;

/* renamed from: o.me */
class C0551me extends C0538lu {

    /* renamed from: ē */
    c_point f1781 = new c_point();

    /* renamed from: 纫 */
    C0548mb f1782;

    C0551me(C0548mb mbVar, C0408hl hlVar, c_point c_point) {
        c_point c_point2 = c_point;
        C0408hl hlVar2 = hlVar;
        C0548mb mbVar2 = mbVar;
        this.f1782 = mbVar2;
        this.f1781.set(c_point2.x, c_point2.y);
        super.mo3988(hlVar2, new Point(mbVar2.f1769.f1634, mbVar2.f1769.f1631), mbVar2.f1769.f1632);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˮ͈ */
    public final void mo3987() {
        if (this.f1782 != null) {
            this.f1708.set(this.f1782.f1769.f1634, this.f1782.f1769.f1631);
            this.f1705.set(this.f1782.f1769.f1632.x, this.f1782.f1769.f1632.y);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ȃ */
    public final void mo3986() {
        super.mo3986();
        this.f1707.f1652 += (float) this.f1781.x;
        this.f1707.f1651 += (float) this.f1781.y;
    }
}
