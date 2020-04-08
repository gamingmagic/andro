package p004o;

import android.graphics.Point;
import java.nio.ByteBuffer;

/* renamed from: o.䓆 */
final class C1475 extends C0762sz {
    C1475() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 136;
        int i3 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        if (!z) {
            C0540lv r7 = C1014.f6142.mo3978(i3);
            if (r7 != null) {
                C0540lv lvVar = r7;
                short s3 = s2;
                short s4 = s;
                C0540lv lvVar2 = lvVar;
                C1919 r0 = lvVar.f1732;
                short s5 = s3;
                short s6 = s4;
                C1919 r72 = r0;
                Point point = new Point(s6, s5);
                Point point2 = point;
                int i4 = point.x;
                int i5 = point2.y;
                C1919 r8 = r0;
                r0.f1634 = i4;
                r8.f1631 = i5;
                r8.f1632.x = 0;
                r8.f1632.y = 0;
                r72.f8642 = null;
                C0540lv lvVar3 = lvVar2;
                C0561mo moVar = C0561mo.STAND;
                C0540lv lvVar4 = lvVar3;
                lvVar3.mo4634(((C1720) lvVar3.f8954).mo4468(moVar, lvVar4.f1776), System.currentTimeMillis());
                lvVar4.f1772 = moVar;
                lvVar4.mo3991();
            }
        }
    }
}
