package p004o;

import android.graphics.Point;
import java.nio.ByteBuffer;

/* renamed from: o.Σ */
final class C1263 extends C0762sz {
    C1263() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 318;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        if (!z) {
            m2014(i3, i4, s, s2, s3, i5);
        }
    }

    /* renamed from: 鷭 */
    static void m2014(int i, int i2, short s, short s2, short s3, int i3) {
        C1919 r5;
        C1919 r0;
        C0520le leVar = (C0520le) C1014.f6137.f1637.get(i);
        if (leVar == null) {
            r5 = null;
        } else {
            C0520le leVar2 = leVar;
            r5 = C1919.class.isAssignableFrom(leVar2.getClass()) ? leVar2 : null;
        }
        Cloneable cloneable = (C0520le) C1014.f6137.f1637.get(i2);
        if (cloneable == null) {
            r0 = null;
        } else {
            Cloneable cloneable2 = cloneable;
            r0 = (C1919) (C1919.class.isAssignableFrom(cloneable2.getClass()) ? cloneable2 : null);
        }
        C1919 r3 = r0;
        if (r5 != null) {
            r5.mo4577(i2, s3, (long) i3);
            C0540lv r6 = C1014.f6142.mo3978(r5.f1630);
            if (!(r6 == null || r6.f1769.f1629 == C0587nn.MOB)) {
                C0381gq gqVar = (C0381gq) C1014.f6158.f674.f609.f1055.get(Integer.valueOf(s3));
                r6.mo3999(new StringBuilder(String.valueOf(gqVar != null ? gqVar.f1071 : "Unknown Skill")).append(" !!").toString(), -1);
            }
            if (!(r3 == null || r3 == r5)) {
                r5.mo4578((C0520le) r3);
            }
            if (s != 0 || s2 != 0) {
                r5.f8639 = C1919.m2591(new Point(s - r5.f1634, s2 - r5.f1631));
            }
        }
    }
}
