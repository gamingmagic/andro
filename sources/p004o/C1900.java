package p004o;

import android.graphics.Point;
import java.nio.ByteBuffer;

/* renamed from: o.놟 */
final class C1900 extends C0762sz {
    C1900() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        C0520le leVar;
        this.f4671 = 2258;
        int i3 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        if (!z) {
            C0520le leVar2 = (C0520le) C1014.f6137.f1637.get(i3);
            if (leVar2 == null) {
                leVar = null;
            } else {
                C0520le leVar3 = leVar2;
                leVar = C1919.class.isAssignableFrom(leVar3.getClass()) ? leVar3 : null;
            }
            if (leVar != null) {
                C0520le leVar4 = leVar;
                Point point = new Point(s, s2);
                int i4 = point.x;
                int i5 = point.y;
                C0520le leVar5 = leVar4;
                leVar4.f1634 = i4;
                leVar5.f1631 = i5;
                leVar5.f1632.x = 0;
                leVar5.f1632.y = 0;
            }
        }
    }
}
