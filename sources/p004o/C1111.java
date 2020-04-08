package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ȃ */
final class C1111 {

    /* renamed from: 鷭 */
    public int[] f6219 = new int[4];

    public C1111(ByteBuffer byteBuffer) {
        for (int i = 0; i < this.f6219.length; i++) {
            this.f6219[i] = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
        }
    }

    public C1111(short[] sArr) {
        if (C1014.f6140.f4506) {
            C0592ns.m674("attempt to create short equipslotinfo while packetver wants long");
        }
        for (int i = 0; i < this.f6219.length; i++) {
            this.f6219[i] = C0622ot.m731(sArr[i]);
        }
    }
}
