package p004o;

import android.graphics.Point;
import java.nio.ByteBuffer;

/* renamed from: o.γ */
final class C1265 extends C0762sz {

    /* renamed from: 鷭 */
    static int f6429 = 1;

    /* renamed from: Ą */
    short f6430;

    /* renamed from: ą */
    short f6431;

    /* renamed from: Ć */
    int f6432;

    /* renamed from: ȃ */
    short f6433;

    /* renamed from: ˮ͈ */
    int f6434;

    /* renamed from: 櫯 */
    short f6435;

    C1265() {
    }

    static {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 279;
        this.f6435 = byteBuffer.getShort();
        this.f6434 = byteBuffer.getInt();
        this.f6433 = byteBuffer.getShort();
        this.f6430 = byteBuffer.getShort();
        this.f6431 = byteBuffer.getShort();
        this.f6432 = byteBuffer.getInt();
        if (!z && this.f6433 >= 0) {
            C0540lv r4 = C1014.f6142.mo3978(this.f6434);
            if (r4 != null) {
                C1919 r5 = r4.f1732;
                r5.f8639 = C1919.m2591(new Point(this.f6430 - r5.f1634, this.f6431 - r5.f1631));
                r4.mo3999(new StringBuilder(String.valueOf(C1014.f6158.f674.f609.mo3752(this.f6435).f1071)).append(" !!").toString(), -1);
                C0561mo moVar = C0561mo.CAST;
                C0540lv lvVar = r4;
                r4.mo4634(((C1720) r4.f8954).mo4468(moVar, lvVar.f1776), System.currentTimeMillis());
                lvVar.f1772 = moVar;
                lvVar.mo3991();
                r4.f8951 = C2043.LOOP_ONCE;
                r4.f1734 = null;
                f6429++;
            }
        }
    }
}
