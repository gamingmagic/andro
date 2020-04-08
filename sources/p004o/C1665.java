package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.溚 */
final class C1665 {

    /* renamed from: 鷭 */
    C1666[] f7643 = new C1666[5];

    /* renamed from: o.溚$鷭 */
    class C1666 {

        /* renamed from: ˮ͈ */
        byte f7645;

        /* renamed from: 櫯 */
        short f7646;

        /* renamed from: 鷭 */
        short f7647;

        C1666(ByteBuffer byteBuffer) {
            this.f7647 = byteBuffer.getShort();
            this.f7646 = byteBuffer.getShort();
            this.f7645 = byteBuffer.get();
        }

        C1666(C0842uh uhVar) {
            this.f7647 = uhVar.f5061;
            this.f7646 = uhVar.f5060;
            this.f7645 = uhVar.f5059;
        }
    }

    C1665(ByteBuffer byteBuffer) {
        for (int i = 0; i < 5; i++) {
            this.f7643[i] = new C1666(byteBuffer);
        }
    }

    public C1665(C0842uh[] uhVarArr) {
        for (int i = 0; i < 5; i++) {
            this.f7643[i] = new C1666(uhVarArr[i]);
        }
    }
}
