package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.魭 */
final class C1845 extends C0762sz {
    C1845() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 470;
        short s = byteBuffer.getShort();
        if (!z) {
            if (s < 0 || s >= C0576nc.values().length) {
                C0592ns.m674("Unknown map property: " + s);
                return;
            }
            C1014.f6142.f1695.f7345 = C0576nc.values()[s];
            throw new C0828tx(this);
        }
    }
}
