package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.䞚 */
final class C1498 extends C0762sz {

    /* renamed from: 櫯 */
    int f7195;

    /* renamed from: 鷭 */
    short f7196;

    C1498() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2018;
        this.f7196 = byteBuffer.getShort();
        this.f7195 = byteBuffer.getInt();
        if (!z) {
            C0252cp cpVar = C1014.f6158;
            int i3 = this.f7196 + 1;
            String r5 = C1014.f6160.mo3796(i3);
            String str = r5 == null ? "MSG" + i3 : r5;
            if (str != null) {
                C1014.f6147.f51.f1427.mo4490(String.format(str, new Object[]{Integer.valueOf(this.f7195)}), 16776960);
            }
        }
    }
}
