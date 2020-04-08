package p004o;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: o.ˮ̰ */
final class C1233 extends C0762sz {
    C1233() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 489;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String r13 = C0622ot.m741(bArr, opVar);
        C0618op opVar2 = C0618op.LOCAL;
        byte[] bArr2 = new byte[24];
        byteBuffer.get(bArr2);
        String r14 = C0622ot.m741(bArr2, opVar2);
        C0618op opVar3 = C0618op.KOREAN;
        byte[] bArr3 = new byte[16];
        byteBuffer.get(bArr3);
        String r15 = C0622ot.m741(bArr3, opVar3);
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        if (!z) {
            m1986(i3, i4, s, s2, b, r13, r14, r15, b2, b3);
        }
    }

    /* renamed from: 鷭 */
    static void m1986(int i, int i2, short s, short s2, byte b, String str, String str2, String str3, byte b2, byte b3) {
        if (C1014.f6137.f1636.f6502 == null) {
            C1014.f6137.f1636.f6502 = new C0187ak();
        }
        C1014.f6137.f1636.f6502.f390 = str;
        if (b3 != -1) {
            C1014.f6137.f1636.f6502.f388 = C0580ng.values()[b3];
        }
        if (b2 != -1) {
            C1014.f6137.f1636.f6502.f387 = C0581nh.values()[b2];
        }
        C0188 r13 = null;
        C0188[] r7 = C1014.f6137.f1636.f6502.f386;
        int length = r7.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            C0188 r16 = r7[i3];
            if (r16.f398 == i) {
                r13 = r16;
                break;
            }
            i3++;
        }
        if (r13 == null) {
            r13 = new C0188();
            C1014.f6137.f1636.f6502.f386 = (C0188[]) Arrays.copyOf(C1014.f6137.f1636.f6502.f386, C1014.f6137.f1636.f6502.f386.length + 1);
            C1014.f6137.f1636.f6502.f386[C1014.f6137.f1636.f6502.f386.length - 1] = r13;
        }
        r13.mo3534(i, str2, str3, (byte) i2, b);
        C1014.f6147.f51.f1381.mo3545();
        if (!(C1014.f6142.f1695 == null || C1014.f6142.f1695.f7347 == null)) {
            if (r13.f396.equals(C1014.f6142.f1695.f7353)) {
                C1014.f6142.f1695.f7347.mo4482(i, s, s2, C1014.f6137.f1636.f6502.mo3533(i));
                return;
            }
            C1739 r0 = C1014.f6142.f1695.f7347;
            int i4 = i;
            C1739 r8 = r0;
            r0.f8014 = (HashMap) r0.f8014.clone();
            r8.f8014.remove(Integer.valueOf(i4));
        }
    }
}
