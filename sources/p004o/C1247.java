package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ˮ͋ */
class C1247 extends C0762sz {

    /* renamed from: o.ˮ͋$鷭 */
    class C1248 {

        /* renamed from: Ą */
        short f6400;

        /* renamed from: ą */
        short f6401;

        /* renamed from: Ć */
        String f6402;

        /* renamed from: ȃ */
        short f6404;

        /* renamed from: ˮ͈ */
        int f6405;

        /* renamed from: 櫯 */
        int f6406;

        /* renamed from: 鷭 */
        int f6407;

        C1248(ByteBuffer byteBuffer) {
            this.f6407 = byteBuffer.getInt();
            this.f6406 = byteBuffer.getInt();
            this.f6405 = byteBuffer.getInt();
            this.f6404 = byteBuffer.getShort();
            this.f6400 = byteBuffer.getShort();
            this.f6401 = byteBuffer.getShort();
            C0618op opVar = C0618op.LOCAL;
            ByteBuffer byteBuffer2 = byteBuffer;
            byte[] bArr = new byte[24];
            byteBuffer2.get(bArr);
            this.f6402 = C0622ot.m741(bArr, opVar);
        }
    }

    C1247() {
    }

    /* renamed from: 鷭 */
    public void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2553;
        int i3 = byteBuffer.getInt();
        byte b = byteBuffer.get();
        int i4 = byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        C1248[] r11 = new C1248[3];
        for (int i6 = 0; i6 < r11.length; i6++) {
            r11[i6] = new C1248(byteBuffer);
        }
        if (!z) {
            if (s > 3) {
                C0592ns.m674("PKT_MC_QUESTADD_0x9f9: nobjectives " + s + " > Const.MAX_QUEST_OBJECTIVES 3!!!!");
                s = 3;
            }
            C0238ce ceVar = new C0238ce();
            ceVar.f565 = C0239if.values()[b];
            ceVar.f564 = (long) i4;
            ceVar.f563 = (long) i5;
            ceVar.f562 = new C0240[s];
            for (int i7 = 0; i7 < s; i7++) {
                C1248 r16 = r11[i7];
                ceVar.f562[i7] = new C0240(r16.f6407, r16.f6405, 0, r16.f6401, r16.f6402);
            }
            C1014.f6152.f7979.put(Integer.valueOf(i3), ceVar);
            C1014.f6147.f51.f1392.mo3594();
        }
    }
}
