package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.鬱 */
final class C1836 extends C0762sz {
    C1836() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2105;
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String r5 = C0622ot.m741(bArr, opVar);
        C0618op opVar2 = C0618op.LOCAL;
        byte[] bArr2 = new byte[40];
        byteBuffer.get(bArr2);
        String r4 = C0622ot.m741(bArr2, opVar2);
        if (!z) {
            m2503(this, r5, r4);
        }
    }

    /* renamed from: 鷭 */
    static void m2503(C0762sz szVar, String str, String str2) {
        if (C1014.f6137.f1636.f6541 == null) {
            C1014.f6137.f1636.f6541 = new C1503();
        }
        C1014.f6137.f1636.f6541.f7212.add(new C1504if(str, str2));
        C1746 r0 = C1014.f6147.f51.f1427;
        C0252cp cpVar = C1014.f6158;
        String r4 = C1014.f6160.mo3796(371);
        r0.mo4490(String.format(r4 == null ? "MSG371" : r4, new Object[]{str}), 16776960);
        if (str2.length() > 0) {
            C1746 r02 = C1014.f6147.f51.f1427;
            C0252cp cpVar2 = C1014.f6158;
            String r42 = C1014.f6160.mo3796(372);
            r02.mo4490(String.format(r42 == null ? "MSG372" : r42, new Object[]{str2}), 16776960);
        }
        throw new C0828tx(szVar);
    }
}
