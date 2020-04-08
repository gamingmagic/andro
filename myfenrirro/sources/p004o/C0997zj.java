package p004o;

import android.support.p000v4.internal.view.SupportMenu;

/* renamed from: o.zj */
public final class C0997zj {

    /* renamed from: ˮ͈ */
    int f5986;

    /* renamed from: 櫯 */
    int f5987;

    /* renamed from: 鷭 */
    int f5988;

    /* renamed from: 鷭 */
    public final void mo4223() {
        if (this.f5987 < 7) {
            int i = this.f5986 - 1;
            this.f5986 = i;
            if (i == 0) {
                this.f5988 += this.f5988;
                int i2 = this.f5987;
                this.f5987 = i2 + 1;
                this.f5986 = 3 << i2;
            }
        }
        this.f5988 &= SupportMenu.USER_MASK;
        this.f5986 &= 255;
        this.f5987 &= 255;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SEE2Context[");
        sb.append("\n  size=");
        sb.append(4);
        sb.append("\n  summ=");
        sb.append(this.f5988);
        sb.append("\n  shift=");
        sb.append(this.f5987);
        sb.append("\n  count=");
        sb.append(this.f5986);
        sb.append("\n]");
        return sb.toString();
    }
}
