package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.䃢 */
final class C1448 extends C0762sz {
    C1448() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 743;
        short s = byteBuffer.getShort();
        byteBuffer.get(new byte[i]);
        if (!z) {
            if (s < 0 || s >= C0575nb.values().length) {
                C0592ns.m674("Unknown map property: " + s);
                return;
            }
            C1014.f6142.f1695.f7350 = C0575nb.values()[s];
        }
    }
}
