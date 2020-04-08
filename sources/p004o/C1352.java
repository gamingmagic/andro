package p004o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: o.ᆇ */
class C1352 extends C0762sz {

    /* renamed from: o.ᆇ$鷭 */
    class C1353 {

        /* renamed from: Ą */
        short f6882;

        /* renamed from: ą */
        C1354[] f6883 = new C1354[this.f6882];

        /* renamed from: ȃ */
        int f6885;

        /* renamed from: ˮ͈ */
        int f6886;

        /* renamed from: 櫯 */
        byte f6887;

        /* renamed from: 鷭 */
        int f6888;

        /* renamed from: o.ᆇ$鷭$鷭 */
        class C1354 {

            /* renamed from: Ą */
            short f6889;

            /* renamed from: ą */
            short f6890;

            /* renamed from: Ć */
            short f6891;

            /* renamed from: ć */
            String f6892;

            /* renamed from: ȃ */
            short f6893;

            /* renamed from: ˮ͈ */
            int f6894;

            /* renamed from: 櫯 */
            int f6896;

            /* renamed from: 鷭 */
            int f6897;

            C1354(ByteBuffer byteBuffer) {
                this.f6897 = byteBuffer.getInt();
                this.f6896 = byteBuffer.getInt();
                this.f6894 = byteBuffer.getInt();
                this.f6893 = byteBuffer.getShort();
                this.f6889 = byteBuffer.getShort();
                this.f6890 = byteBuffer.getShort();
                this.f6891 = byteBuffer.getShort();
                C0618op opVar = C0618op.LOCAL;
                ByteBuffer byteBuffer2 = byteBuffer;
                byte[] bArr = new byte[24];
                byteBuffer2.get(bArr);
                this.f6892 = C0622ot.m741(bArr, opVar);
            }
        }

        C1353(ByteBuffer byteBuffer) {
            this.f6888 = byteBuffer.getInt();
            this.f6887 = byteBuffer.get();
            this.f6886 = byteBuffer.getInt();
            this.f6885 = byteBuffer.getInt();
            this.f6882 = byteBuffer.getShort();
            for (int i = 0; i < this.f6882; i++) {
                this.f6883[i] = new C1354(byteBuffer);
            }
        }
    }

    C1352() {
    }

    /* renamed from: 鷭 */
    public void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2552;
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
                    C1353 r9 = new C1353(byteBuffer2);
                    C0622ot.m737((Object) r9);
                    C0238ce ceVar = new C0238ce();
                    ceVar.f565 = C0239if.values()[r9.f6887];
                    ceVar.f564 = (long) r9.f6886;
                    ceVar.f563 = (long) r9.f6885;
                    ceVar.f562 = new C0240[r9.f6882];
                    for (int i4 = 0; i4 < r9.f6882; i4++) {
                        C1354 r12 = r9.f6883[i4];
                        ceVar.f562[i4] = new C0240(r12.f6897, r12.f6894, r12.f6890, r12.f6891, r12.f6892);
                    }
                    C1014.f6152.f7979.put(Integer.valueOf(r9.f6888), ceVar);
                    i3++;
                } catch (Throwable th) {
                    int position2 = byteBuffer.position();
                    byteBuffer.position(position);
                    StringBuilder append = new StringBuilder("questlist1 parse error ").append(th.getMessage()).append(". at position ").append(position2 - position).append(" on dump:\n");
                    byte[] bArr3 = new byte[(position2 - position)];
                    byteBuffer.get(bArr3);
                    C0592ns.m674(append.append(C0622ot.m723(bArr3)).toString());
                    byteBuffer.position(position2);
                }
            }
            C1014.f6147.f51.f1392.mo3594();
        }
    }
}
