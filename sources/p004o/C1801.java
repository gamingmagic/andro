package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.鞺 */
final class C1801 extends C0762sz {

    /* renamed from: 櫯 */
    byte[] f8330 = new byte[80];

    /* renamed from: 鷭 */
    int f8331;

    C1801() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 305;
        this.f8331 = byteBuffer.getInt();
        byteBuffer.get(this.f8330);
        if (!z) {
            C0540lv r4 = C1014.f6142.mo3978(this.f8331);
            if (r4 != null) {
                C0540lv lvVar = r4;
                String r5 = C0622ot.m741(this.f8330, C0618op.LOCAL);
                C0540lv lvVar2 = lvVar;
                if (lvVar.f1728 == null) {
                    lvVar2.f1728 = new C0955y(lvVar2);
                }
                C0955y yVar = lvVar2.f1728;
                yVar.f5686 = new C0957(r5);
                yVar.mo4155();
            }
        }
    }
}
