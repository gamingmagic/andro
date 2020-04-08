package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.骡 */
final class C1821 extends C0762sz {

    /* renamed from: 鷭 */
    byte[] f8418 = new byte[80];

    C1821() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2068;
        int i3 = byteBuffer.getInt();
        byteBuffer.get(this.f8418);
        if (!z) {
            C0540lv r4 = C1014.f6142.mo3978(i3);
            if (r4 != null) {
                C0540lv lvVar = r4;
                String r5 = C0622ot.m741(this.f8418, C0618op.LOCAL);
                C0540lv lvVar2 = lvVar;
                if (lvVar.f1728 == null) {
                    lvVar2.f1728 = new C0955y(lvVar2);
                }
                C0955y yVar = lvVar2.f1728;
                yVar.f5683 = new C0959(r5);
                yVar.mo4155();
            }
        }
    }
}
