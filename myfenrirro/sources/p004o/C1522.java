package p004o;

import java.nio.ByteBuffer;
import p004o.C0772tc.C0774;

/* renamed from: o.倻 */
final class C1522 extends C0762sz {
    C1522() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 402;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        C0618op opVar = C0618op.KOREAN;
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        String r6 = C0622ot.m741(bArr, opVar);
        if (!z) {
            if (C1014.f6142.f1695 == null || C1014.f6142.f1695.f7353 == null) {
                C0592ns.m674("Map not loaded: didn't change map cell.");
            } else if (!r6.equals(new StringBuilder(String.valueOf(C1014.f6142.f1695.f7353)).append(".gat").toString())) {
                C0592ns.m674("Attempt to modify cell of another map " + r6 + " (current one: " + C1014.f6142.f1695 + ".gat)");
            } else {
                C0772tc tcVar = C1014.f6142.f1695.f7342;
                short s4 = s2;
                byte b = (byte) s3;
                if (s < 0 || s >= tcVar.f4721 || s4 < 0 || s4 >= tcVar.f4721) {
                    C0624ov.m759("Invalid x/y while trying to change map cell.");
                    return;
                }
                C0774 r62 = tcVar.mo4103((tcVar.f4721 * s4) + s);
                if (r62 == null) {
                    C0624ov.m759("Attempt to change unexistant block type");
                } else {
                    r62.f4725 = b;
                }
            }
        }
    }
}
