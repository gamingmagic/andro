package p004o;

import android.graphics.Point;
import com.roworkshop.andro.c_point;

/* renamed from: o.mf */
final class C0552mf extends C0538lu {

    /* renamed from: ċ */
    byte f1783;

    /* renamed from: ē */
    C0562mp f1784 = C0562mp.NUM8;

    /* renamed from: Ȋ */
    C0548mb f1785;

    /* renamed from: 㥳 */
    c_point f1786 = new c_point();

    /* renamed from: 纫 */
    int f1787;

    /* renamed from: 띥 */
    c_point f1788 = new c_point();

    C0552mf(C0540lv lvVar, int i) {
        this.f1785 = lvVar;
        this.f1787 = i;
        C0520le leVar = lvVar.f1769;
        byte b = (C1919.class.isAssignableFrom(leVar.getClass()) ? leVar : null).f8639;
        if (b == -1 || b >= C0562mp.values().length) {
            b = 0;
        }
        c_point c_point = new c_point(this.f1785.f1769.f1634 - C0593nt.f2859[b], this.f1785.f1769.f1631 - C0593nt.f2858[b]);
        this.f1788 = c_point;
        this.f1786.set(this.f1785.f1769.f1632.x, this.f1785.f1769.f1632.y);
        this.f1783 = C1919.m2591((Point) m659());
        super.mo3988(C1014.f6142.f1680.f1196, c_point, this.f1785.f1769.f1632);
        C0616on onVar = this.f8948;
        onVar.f3008 = 0.0f;
        onVar.f3007 = 0.0f;
        onVar.f3006 = 0.0f;
        onVar.f3009 = 1.0f;
        C1014.f6158.mo3387((Runnable) new C0553mg(this, i, lvVar));
    }

    /* renamed from: ą */
    private c_point m659() {
        Point point = new Point((this.f1785.f1769.f1634 * 100) + this.f1785.f1769.f1632.x, (this.f1785.f1769.f1631 * 100) + this.f1785.f1769.f1632.y);
        Point point2 = new Point((this.f1708.x * 100) + this.f1705.x, (this.f1708.y * 100) + this.f1705.y);
        return new c_point(point.x - point2.x, point.y - point2.y);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˮ͈ */
    public final void mo3987() {
        c_point r5 = m659();
        c_point c_point = r5;
        double d = (double) r5.x;
        double d2 = (double) r5.y;
        int sqrt = (int) Math.sqrt((d * d) + (d2 * d2));
        if (sqrt > 100) {
            double d3 = 100.0d / ((double) sqrt);
            c_point.x = (int) (((double) c_point.x) * d3);
            c_point.y = (int) (((double) c_point.y) * d3);
        }
        c_point c_point2 = new c_point();
        Point point = new Point(this.f1785.f1769.f1634, this.f1785.f1769.f1631);
        c_point c_point3 = this.f1785.f1769.f1632;
        c_point2.set((point.x * 100) + c_point3.x, (point.y * 100) + c_point3.y);
        c_point c_point4 = c_point;
        c_point2.set(c_point2.x - c_point4.x, c_point2.y - c_point4.y);
        Point point2 = this.f1708;
        Point point3 = this.f1705;
        c_point c_point5 = c_point2;
        point2.x = c_point5.x / 100;
        point3.x = c_point5.x % 100;
        if (point3.x > 50) {
            point2.x++;
            point3.x -= 100;
        }
        point2.y = c_point5.y / 100;
        point3.y = c_point5.y % 100;
        if (point3.y > 50) {
            point2.y++;
            point3.y -= 100;
        }
        this.f1783 = C1919.m2591((Point) m659());
    }
}
