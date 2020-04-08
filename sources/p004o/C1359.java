package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ᒈ */
final class C1359 extends C0762sz {
    C1359() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 180;
        int i3 = byteBuffer.getInt();
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        if (!z) {
            C0360g gVar = C1014.f6147.f51.f1432;
            int i4 = i3;
            gVar.f992.append(C0453ix.m483(C0622ot.m741(bArr, C0618op.LOCAL) + "\n", false));
            gVar.f994 = i4;
            gVar.mo3537h_();
        }
    }
}
