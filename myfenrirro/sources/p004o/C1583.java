package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.怖 */
final class C1583 extends C0762sz {
    C1583() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 215;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        String r13 = C0622ot.m741(bArr, opVar);
        if (!z) {
            C0540lv r14 = C1014.f6142.mo3978(i3);
            if (r14 != null) {
                C0540lv lvVar = r14;
                int i5 = i4;
                C0565ms msVar = b == 1 ? C0565ms.NORMAL : C0565ms.PROTECTED;
                short s3 = s;
                short s4 = s2;
                short s5 = s3;
                String str = r13;
                C0540lv lvVar2 = lvVar;
                if (lvVar.f1728 == null) {
                    lvVar2.f1728 = new C0955y(lvVar2);
                }
                C0955y yVar = lvVar2.f1728;
                yVar.f5682 = new C0958(str, i5, msVar, s5, s4);
                yVar.mo4155();
            }
        }
    }
}
