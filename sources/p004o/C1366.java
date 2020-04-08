package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ᠻ */
class C1366 extends C0328ew {
    C1366(int i, byte b, String str, C1064[] r7) {
        this.f4671 = 2065;
        this.f4538.putInt(i);
        this.f4538.put(1);
        this.f4538.put(C0622ot.m749(str, C0618op.LOCAL, 80));
        if (r7 != null) {
            for (C1064 r5 : r7) {
                ByteBuffer byteBuffer = this.f4538;
                if (C1014.f6140.f4506) {
                    byteBuffer.putInt(r5.f6204);
                } else {
                    byteBuffer.putShort((short) r5.f6204);
                }
                byteBuffer.putShort(r5.f6203);
                byteBuffer.putInt(r5.f6202);
            }
        }
        this.f4540 = (short) (this.f4538.position() + 4);
    }
}
