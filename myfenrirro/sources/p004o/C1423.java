package p004o;

import android.graphics.Point;
import java.nio.ByteBuffer;

/* renamed from: o.㨐 */
final class C1423 extends C0762sz {

    /* renamed from: ˮ͈ */
    short f6993;

    /* renamed from: 櫯 */
    short f6994;

    /* renamed from: 鷭 */
    int f6995;

    C1423() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 511;
        this.f6995 = byteBuffer.getInt();
        this.f6994 = byteBuffer.getShort();
        this.f6993 = byteBuffer.getShort();
        if (!z) {
            C0540lv r6 = C1014.f6142.mo3978(this.f6995);
            if (r6 != null) {
                C0540lv lvVar = r6;
                short s = this.f6994;
                short s2 = this.f6993;
                C0540lv lvVar2 = lvVar;
                C1919 r0 = lvVar.f1732;
                short s3 = s2;
                short s4 = s;
                C1919 r7 = r0;
                Point point = new Point(s4, s3);
                Point point2 = point;
                int i3 = point.x;
                int i4 = point2.y;
                C1919 r8 = r0;
                r0.f1634 = i3;
                r8.f1631 = i4;
                r8.f1632.x = 0;
                r8.f1632.y = 0;
                r7.f8642 = null;
                C0540lv lvVar3 = lvVar2;
                C0561mo moVar = C0561mo.STAND;
                C0540lv lvVar4 = lvVar3;
                lvVar3.mo4634(((C1720) lvVar3.f8954).mo4468(moVar, lvVar4.f1776), System.currentTimeMillis());
                lvVar4.f1772 = moVar;
                lvVar4.mo3991();
                throw new C0828tx(this);
            }
        }
    }
}
