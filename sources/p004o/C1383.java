package p004o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: o.〤 */
final class C1383 extends C0762sz {

    /* renamed from: o.〤$鷭 */
    class C1384 {

        /* renamed from: Ą */
        byte f6947;

        /* renamed from: ą */
        C1111 f6948;

        /* renamed from: Ć */
        int f6949;

        /* renamed from: ć */
        byte f6950;

        /* renamed from: ȃ */
        byte f6952;

        /* renamed from: Ȋ */
        C1665 f6953;

        /* renamed from: ˮ͈ */
        byte f6954;

        /* renamed from: ˮ͍ */
        short f6955;

        /* renamed from: 岱 */
        short f6956;

        /* renamed from: 櫯 */
        int f6957;

        /* renamed from: 鷭 */
        short f6958;

        C1384(ByteBuffer byteBuffer) {
            this.f6958 = byteBuffer.getShort();
            this.f6957 = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
            this.f6954 = byteBuffer.get();
            this.f6952 = byteBuffer.get();
            this.f6947 = byteBuffer.get();
            this.f6948 = new C1111(byteBuffer);
            this.f6949 = byteBuffer.getInt();
            this.f6950 = byteBuffer.get();
            this.f6955 = byteBuffer.getShort();
            this.f6956 = byteBuffer.getShort();
            this.f6953 = new C1665(byteBuffer);
        }
    }

    C1383() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        C1973 r25;
        this.f4671 = 2539;
        C0560mn mnVar = C0560mn.values()[byteBuffer.get()];
        long j = byteBuffer.getLong();
        short s = byteBuffer.getShort();
        long j2 = byteBuffer.getLong();
        byte b = byteBuffer.get();
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        byte[] bArr2 = bArr;
        if (!z) {
            ByteBuffer byteBuffer2 = (ByteBuffer) ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN).position(0);
            ByteBuffer byteBuffer3 = byteBuffer2;
            C0618op opVar = C0618op.LOCAL;
            byte[] bArr3 = new byte[s];
            byteBuffer2.get(bArr3);
            String r26 = C0622ot.m741(bArr3, opVar);
            C1384[] r27 = new C1384[b];
            C1992[] r15 = new C1992[b];
            for (int i3 = 0; i3 < r15.length; i3++) {
                r27[i3] = new C1384(byteBuffer3);
                C1384 r21 = r27[i3];
                r15[i3] = new C1992(r21.f6957, r21.f6958, r21.f6947, C1472.values()[r21.f6950], r21.f6952 != 0, r21.f6954 != 0, false, r21.f6949, 0, r21.f6955, r21.f6948, 0, r21.f6956, r21.f6953);
            }
            C0286dr drVar = C1014.f6147.f51.f1433;
            C1992[] r272 = r15;
            long j3 = j;
            C0300[] r16 = (C0300[]) ((C0298if) ((C0299) ((C0185ai) C1014.f6147.f51.f1451.f813.getAdapter()).f384.get(mnVar.ordinal())).f817.getAdapter()).f8049;
            int length = r16.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    r25 = null;
                    break;
                }
                C0300 r252 = r16[i4];
                if (r252.f827.f8782 == j3) {
                    r25 = r252.f827;
                    break;
                }
                i4++;
            }
            if (r25 != null) {
                drVar.f782 = r25;
                drVar.f783 = r26;
                drVar.f780 = j2;
                drVar.f778 = r272;
                drVar.f785.setText(r25.f8776);
                drVar.f784.setText(r25.f8779);
                drVar.f781.setText(r26);
                drVar.mo3657(r272);
                drVar.mo3656(j2);
                drVar.mo3537h_();
            }
        }
    }
}
