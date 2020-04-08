package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ʰ */
final class C1182 extends C0762sz {
    C1182() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2813;
        int i3 = byteBuffer.getInt();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        String r3 = C0622ot.m741(bArr, opVar);
        if (!z) {
            C0540lv r4 = C1014.f6142.mo3978(i3);
            if (r4 != null) {
                r4.f1732.f8648 = r3;
                if (C1014.f6142.f1693 == r4) {
                    C0540lv lvVar = r4;
                    if (r4.f1775 != null) {
                        lvVar.f1775.mo4495(lvVar);
                        return;
                    }
                    lvVar.f1775 = new C1752(lvVar);
                }
            }
        }
    }
}
