package p004o;

import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import java.text.NumberFormat;

/* renamed from: o.m */
final class C0546m {

    /* renamed from: Ą */
    int f1751;

    /* renamed from: ą */
    int f1752;

    /* renamed from: Ć */
    C1695 f1753;

    /* renamed from: ć */
    C1695 f1754;

    /* renamed from: ċ */
    OnClickListener f1755 = new C0600o(this);

    /* renamed from: ȃ */
    Button f1756;

    /* renamed from: Ȋ */
    OnClickListener f1757 = new C0573n(this);

    /* renamed from: ˮ͈ */
    Button f1758;

    /* renamed from: ˮ͍ */
    boolean f1759;

    /* renamed from: 䒧 */
    OnClickListener f1760 = new C0681q(this);

    /* renamed from: 岱 */
    boolean f1761;

    /* renamed from: 櫯 */
    C0512ky f1762;

    /* renamed from: 纫 */
    OnClickListener f1763 = new C0637p(this);

    /* renamed from: 躆 */
    OnClickListener f1764 = new C0708r(this);

    /* renamed from: 鷭 */
    RelativeLayout f1765;

    C0546m(C1992 r2, int i, int i2, boolean z) {
        this.f1762 = new C0512ky(r2, i);
        this.f1751 = i2;
        this.f1759 = z;
    }

    C0546m(C1992 r2, int i, int i2, int i3, boolean z) {
        this.f1762 = new C0512ky(r2, i);
        this.f1751 = i2;
        this.f1752 = i3;
        this.f1759 = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4011() {
        if (this.f1761 && this.f1762.f1595 != null) {
            C1992 r2 = (C1992) C1014.f6137.f1636.f6498.get(Integer.valueOf(this.f1762.f1598));
            if (r2 == null) {
                C1014.f6137.f1636.f6498.put(Integer.valueOf(this.f1762.f1598), this.f1762.f1595);
            } else {
                r2.f8846 += this.f1762.f1595.f8846;
            }
            C1014.f6147.f51.f1445.mo4533(C0572mz.CART);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4013(int i, boolean z) {
        if (this.f1762.f1595 != null) {
            C0515l lVar = (C0515l) C1014.f6147.f51.f1385.f1657.getAdapter();
            if (this.f1761) {
                if (i == -1) {
                    i = this.f1762.f1595.f8846;
                }
                this.f1762.f1595.f8846 -= i;
                if (this.f1762.f1595.f8846 <= 0) {
                    lVar.f1619.remove(this);
                    lVar.f1619.add(new C0546m(null, 0, 0, false));
                }
            } else {
                lVar.f1619.remove(this);
                lVar.f1619.add(new C0546m(null, 0, 0, 0, false));
            }
            C1014.f6147.f51.f1385.f1657.setAdapter(new C0515l(lVar.f1619, z));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4012(int i) {
        this.f1751 = i;
        if (this.f1758 != null) {
            this.f1758.setText(new StringBuilder(String.valueOf(NumberFormat.getInstance().format((long) this.f1751))).append(" Z").toString());
        }
    }
}
