package p004o;

import android.support.p000v4.internal.view.SupportMenu;

/* renamed from: o.zn */
public class C1001zn {

    /* renamed from: 䆬 */
    protected byte[] f6013 = new byte[32768];

    /* renamed from: 麹 */
    protected int f6014;

    /* renamed from: 윬 */
    protected int f6015;

    /* renamed from: Ą */
    public final void mo4246() {
        this.f6014 = 0;
        this.f6015 = 0;
    }

    /* renamed from: 鷭 */
    public final void mo4251(int i) {
        int i2 = i + this.f6015;
        this.f6014 += i2 >> 3;
        this.f6015 = i2 & 7;
    }

    /* renamed from: ą */
    public final int mo4247() {
        return (((((this.f6013[this.f6014] & 255) << 16) + ((this.f6013[this.f6014 + 1] & 255) << 8)) + (this.f6013[this.f6014 + 2] & 255)) >>> (8 - this.f6015)) & SupportMenu.USER_MASK;
    }

    /* renamed from: 櫯 */
    public final void mo4250(int i) {
        int i2 = i;
        int i3 = i2 + this.f6015;
        this.f6014 += i3 >> 3;
        this.f6015 = i3 & 7;
    }

    /* renamed from: Ć */
    public final boolean mo4248() {
        return this.f6014 + 3 >= 32768;
    }

    /* renamed from: ć */
    public final byte[] mo4249() {
        return this.f6013;
    }
}
