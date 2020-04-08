package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ŭ */
final class C1052 extends C0328ew {
    C1052(String str, boolean z, C1053[] r7) {
        this.f4671 = 434;
        this.f4538.put(C0622ot.m749(str, C0618op.LOCAL, 80));
        this.f4538.put(z ? (byte) 1 : 0);
        if (r7 != null) {
            for (C1053 r6 : r7) {
                ByteBuffer byteBuffer = this.f4538;
                byteBuffer.putShort(r6.f6201);
                byteBuffer.putShort(r6.f6200);
                byteBuffer.putInt(r6.f6199);
            }
        }
        this.f4540 = (short) (this.f4538.position() + 4);
    }
}
