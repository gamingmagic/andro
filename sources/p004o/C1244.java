package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ˮ̓ */
final class C1244 extends C0762sz {
    C1244() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2046;
        C0618op opVar = C0618op.KOREAN;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String r3 = C0622ot.m741(bArr, opVar);
        if (!z) {
            if (!r3.toLowerCase().endsWith(".mp3")) {
                r3 = new StringBuilder(String.valueOf(r3)).append(".mp3").toString();
            }
            C1014.f6158.mo3387((Runnable) new C1245(this, r3));
        }
    }
}
