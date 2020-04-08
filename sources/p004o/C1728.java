package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.縼 */
final class C1728 extends C0762sz {
    C1728() {
    }

    /* renamed from: 鷭 */
    public static void m2385(byte[] bArr, byte b, short s, short s2, short s3, int i, short s4, short s5, short s6, short s7, short s8, short s9, short s10, short s11, int i2, int i3, short s12, short s13, int i4, int i5, short s14, short s15) {
        C1919 r0;
        C1919 r10;
        if (C1014.f6137.f1636.f6524 == null) {
            C1014.f6137.f1636.f6524 = new C1302if();
        }
        if (C1014.f6137.f1636.f6524.f6567 == null) {
            C1014.f6137.f1636.f6524.f6567 = new C1305();
        }
        C1302if ifVar = C1014.f6137.f1636.f6524;
        C1305 r7 = C1014.f6137.f1636.f6524.f6567;
        C0520le leVar = (C0520le) C1014.f6137.f1637.get(r7.f6595);
        if (leVar == null) {
            r0 = null;
        } else {
            r0 = C1919.class.isAssignableFrom(leVar.getClass()) ? leVar : null;
        }
        if (r0 != null) {
            ifVar.f6576 = i;
            ifVar.f6573 = s4;
            ifVar.f6564 = s5;
            ifVar.f6562 = s6;
            ifVar.f6550 = s7;
            ifVar.f6551 = s8;
            ifVar.f6552 = s9;
            ifVar.f6553 = s10;
            ifVar.f6565 = (short) (200 - (s11 / 10));
            ifVar.f6563 = i4;
            ifVar.f6554 = i5;
            ifVar.f6574 = s14;
            ifVar.f6570 = s15;
            ifVar.f6558 = b;
            r7.f6596 = C0622ot.m741(bArr, C0618op.LOCAL);
            r7.f6590 = C0587nn.HOM;
            r7.f6589 = s3;
            r7.f6599 = i2;
            r7.f6597 = i3;
            r7.f6594 = s12;
            r7.f6592 = s13;
            r7.f6587 = s2;
            r7.f6593 = s;
            C0520le leVar2 = (C0520le) C1014.f6137.f1637.get(r7.f6595);
            if (leVar2 == null) {
                r10 = null;
            } else {
                r10 = C1919.class.isAssignableFrom(leVar2.getClass()) ? leVar2 : null;
            }
            r10.f8659 = ifVar.f6570;
            C1014.f6147.f51.f1376.mo4620();
            boolean z = false;
            int i6 = 0;
            while (true) {
                if (i6 >= C1014.f6147.f51.f1429.size()) {
                    break;
                } else if (((C0500kn) C1014.f6147.f51.f1429.get(i6)).f1566 == C0501.HOMUN) {
                    z = true;
                    break;
                } else {
                    i6++;
                }
            }
            if (!z && !C1014.f6137.f1636.f6524.f6567.f6591) {
                C1919 r8 = r10;
                C1014.f6147.f51.mo3876(C0501.HOMUN, (C1339.class.isAssignableFrom(r8.getClass()) ? r8 : null).f1633, -1, 0, 0);
            }
            if (C1014.f6137.f1636.f6524.f6567.f6599 <= 0) {
                C1014.f6147.f51.mo3879(C0501.HOMUN, -1);
            }
        }
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2551;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        byte[] bArr2 = bArr;
        byte b = byteBuffer.get();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        int i3 = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
        short s4 = byteBuffer.getShort();
        short s5 = byteBuffer.getShort();
        short s6 = byteBuffer.getShort();
        short s7 = byteBuffer.getShort();
        short s8 = byteBuffer.getShort();
        short s9 = byteBuffer.getShort();
        short s10 = byteBuffer.getShort();
        short s11 = byteBuffer.getShort();
        int i4 = byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        short s12 = byteBuffer.getShort();
        short s13 = byteBuffer.getShort();
        int i6 = byteBuffer.getInt();
        int i7 = byteBuffer.getInt();
        short s14 = byteBuffer.getShort();
        short s15 = byteBuffer.getShort();
        if (!z) {
            m2385(bArr2, b, s, s2, s3, i3, s4, s5, s6, s7, s8, s9, s10, s11, i4, i5, s12, s13, i6, i7, s14, s15);
        }
    }
}
