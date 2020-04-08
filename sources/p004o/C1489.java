package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.䕖 */
final class C1489 extends C0762sz {

    /* renamed from: o.䕖$鷭 */
    class C1490 {

        /* renamed from: ȃ */
        int f7166;

        /* renamed from: ˮ͈ */
        int f7167;

        /* renamed from: 櫯 */
        int f7168;

        /* renamed from: 鷭 */
        byte f7169;

        C1490(ByteBuffer byteBuffer) {
            this.f7169 = byteBuffer.get();
            this.f7168 = byteBuffer.getInt();
            this.f7167 = byteBuffer.getInt();
            this.f7166 = byteBuffer.getInt();
        }
    }

    C1489() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2427;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        C1490[] r7 = new C1490[i];
        for (int i6 = 0; i6 < i; i6++) {
            r7[i6] = new C1490(byteBuffer);
        }
        if (!z && i >= 2) {
            C1746 r0 = C1014.f6147.f51.f1427;
            C0252cp cpVar = C1014.f6158;
            String r11 = C1014.f6160.mo3796(2810);
            r0.mo4490(String.format(r11 == null ? "MSG2810" : r11, new Object[]{Float.valueOf(((float) i3) / 1000.0f), Float.valueOf(((float) r7[0].f7168) / 1000.0f), "Server", Float.valueOf(((float) r7[1].f7168) / 1000.0f)}), 16776960);
            C1746 r02 = C1014.f6147.f51.f1427;
            C0252cp cpVar2 = C1014.f6158;
            String r112 = C1014.f6160.mo3796(2811);
            r02.mo4490(String.format(r112 == null ? "MSG2811" : r112, new Object[]{Float.valueOf(((float) i5) / 1000.0f), Float.valueOf(((float) r7[0].f7166) / 1000.0f), "Server", Float.valueOf(((float) r7[1].f7166) / 1000.0f)}), 16776960);
            C1746 r03 = C1014.f6147.f51.f1427;
            C0252cp cpVar3 = C1014.f6158;
            String r113 = C1014.f6160.mo3796(2812);
            r03.mo4490(String.format(r113 == null ? "MSG2812" : r113, new Object[]{Float.valueOf(((float) i4) / 1000.0f), Float.valueOf(((float) r7[0].f7167) / 1000.0f), "Server", Float.valueOf(((float) r7[1].f7167) / 1000.0f)}), 16776960);
        }
    }
}
