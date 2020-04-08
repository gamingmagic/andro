package p004o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: o.pd */
public abstract class C0652pd extends C0762sz implements C0839ue {

    /* renamed from: Ą */
    public ByteBuffer f4538 = ByteBuffer.wrap(this.f4539).order(ByteOrder.LITTLE_ENDIAN);

    /* renamed from: ȃ */
    byte[] f4539 = new byte[2048];

    /* renamed from: ˮ͈ */
    public short f4540;

    /* renamed from: 鷭 */
    public abstract void mo3699(ByteBuffer byteBuffer, int i);

    /* renamed from: 鷭 */
    public final void mo4051() {
        throw new C0828tx(this);
    }

    /* renamed from: 鷭 */
    public void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4538 = null;
        this.f4539 = null;
        mo3699(byteBuffer, i);
        if (!z) {
            throw new C0828tx(this);
        }
    }

    /* renamed from: 鷭 */
    public final void mo4053(ByteBuffer byteBuffer, boolean z) {
        if (z) {
            byteBuffer.putShort(this.f4671);
        }
        if (this.f4540 != 0) {
            byteBuffer.putShort(this.f4540);
        }
        byteBuffer.put(this.f4538.array(), 0, this.f4538.position());
    }

    /* renamed from: 櫯 */
    public final int mo4050() {
        if (this.f4538.position() <= 0) {
            throw new RuntimeException("get_expected_length called for uninitialized packet");
        } else if (this.f4540 > 0) {
            return -1;
        } else {
            return this.f4538.position();
        }
    }
}
