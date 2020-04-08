package p004o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: o.뭃 */
final class C1966 extends C0762sz {

    /* renamed from: o.뭃$鷭 */
    class C1967 {

        /* renamed from: Ą */
        short f8764;

        /* renamed from: ą */
        C1968[] f8765 = new C1968[this.f8764];

        /* renamed from: ȃ */
        int f8767;

        /* renamed from: ˮ͈ */
        int f8768;

        /* renamed from: 櫯 */
        byte f8769;

        /* renamed from: 鷭 */
        int f8770;

        /* renamed from: o.뭃$鷭$鷭 */
        class C1968 {

            /* renamed from: ȃ */
            String f8772;

            /* renamed from: ˮ͈ */
            short f8773;

            /* renamed from: 櫯 */
            short f8774;

            /* renamed from: 鷭 */
            int f8775;

            C1968(ByteBuffer byteBuffer) {
                this.f8775 = byteBuffer.getInt();
                this.f8774 = byteBuffer.getShort();
                this.f8773 = byteBuffer.getShort();
                C0618op opVar = C0618op.LOCAL;
                ByteBuffer byteBuffer2 = byteBuffer;
                byte[] bArr = new byte[24];
                byteBuffer2.get(bArr);
                this.f8772 = C0622ot.m741(bArr, opVar);
            }
        }

        C1967(ByteBuffer byteBuffer) {
            this.f8770 = byteBuffer.getInt();
            this.f8769 = byteBuffer.get();
            this.f8768 = byteBuffer.getInt();
            this.f8767 = byteBuffer.getInt();
            this.f8764 = byteBuffer.getShort();
            for (int i = 0; i < this.f8764; i++) {
                this.f8765[i] = new C1968(byteBuffer);
            }
        }
    }

    C1966() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2426;
        int position = byteBuffer.position();
        short s = byteBuffer.getShort();
        byteBuffer.getShort();
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        byte[] bArr2 = bArr;
        if (!z) {
            ByteBuffer byteBuffer2 = (ByteBuffer) ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN).position(0);
            int i3 = 0;
            while (i3 < s) {
                try {
                    C1967 r9 = new C1967(byteBuffer2);
                    C0238ce ceVar = new C0238ce();
                    ceVar.f565 = C0239if.values()[r9.f8769];
                    ceVar.f564 = (long) r9.f8768;
                    ceVar.f563 = (long) r9.f8767;
                    ceVar.f562 = new C0240[r9.f8764];
                    for (int i4 = 0; i4 < r9.f8764; i4++) {
                        C1968 r12 = r9.f8765[i4];
                        ceVar.f562[i4] = new C0240(0, r12.f8775, r12.f8774, r12.f8773, r12.f8772);
                    }
                    C1014.f6152.f7979.put(Integer.valueOf(r9.f8770), ceVar);
                    i3++;
                } catch (Throwable unused) {
                    int position2 = byteBuffer.position();
                    byteBuffer.position(position);
                    StringBuilder sb = new StringBuilder("questlist1 ");
                    byte[] bArr3 = new byte[(position2 - position)];
                    byteBuffer.get(bArr3);
                    C0592ns.m674(sb.append(C0622ot.m723(bArr3)).toString());
                    byteBuffer.position(position2);
                }
            }
            C1014.f6147.f51.f1392.mo3594();
        }
    }
}
