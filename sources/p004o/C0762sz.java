package p004o;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: o.sz */
public abstract class C0762sz implements C0838ud {

    /* renamed from: đ */
    C0763 f4668 = new C0763();

    /* renamed from: ܕ */
    public int f4669;

    /* renamed from: 庸 */
    public int f4670;

    /* renamed from: 躆 */
    public short f4671;

    /* renamed from: o.sz$鷭 */
    class C0763 {

        /* renamed from: ˮ͈ */
        int f4673;

        /* renamed from: 櫯 */
        int f4674;

        /* renamed from: 鷭 */
        ByteBuffer f4675;

        C0763() {
        }
    }

    /* renamed from: 鷭 */
    public abstract void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2);

    /* renamed from: ȃ */
    public final short mo4090() {
        return this.f4671;
    }

    /* renamed from: 櫯 */
    public final void mo4096(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        mo4052(byteBuffer, 0, true, 0);
        this.f4669 = byteBuffer.position() - position;
        byteBuffer.position(position);
        mo4052(byteBuffer, 1, true, 0);
        this.f4670 = (byteBuffer.position() - position) - this.f4669;
        if (this.f4671 == 0) {
            throw new C0824tt(this);
        }
    }

    /* renamed from: 鷭 */
    public final void mo4097(ByteBuffer byteBuffer) {
        if (this.f4669 == 0 && this.f4670 == 0) {
            mo4096(ByteBuffer.allocate(2048));
        }
        this.f4668.f4675 = byteBuffer;
        if (this.f4670 > 0) {
            try {
                short s = byteBuffer.getShort();
                if (s > byteBuffer.remaining() + 4) {
                    throw new C0823ts("Packet 0x" + Integer.toHexString(C0622ot.m731(this.f4671)) + ": full packet length is less than buffer remaining");
                }
                int i = (s - 4) - this.f4669;
                if (i < 0) {
                    throw new C0823ts("Packet 0x" + Integer.toHexString(C0622ot.m731(this.f4671)) + ": user sent a packet with negative calculated dynamic size. Dump: " + C0622ot.m723(Arrays.copyOf(byteBuffer.array(), byteBuffer.limit())));
                }
                this.f4668.f4674 = i / this.f4670;
                if (i % this.f4670 > 0) {
                    C0624ov.m759("Packet 0x" + Integer.toHexString(this.f4671) + ": total size doesn't fit into blocks. Expected block size=" + this.f4670 + " received dynamic size = " + i);
                }
            } catch (BufferUnderflowException e) {
                throw new RuntimeException("class=" + getClass() + " bb.position()=" + byteBuffer.position() + " bb.remaining()=" + byteBuffer.remaining(), e);
            }
        } else {
            this.f4668.f4674 = 0;
        }
        this.f4668.f4673 = this.f4669 + (this.f4668.f4674 * this.f4670);
    }

    /* renamed from: 鷭 */
    public void mo4051() {
        try {
            mo4052(this.f4668.f4675, this.f4668.f4674, false, this.f4668.f4673);
        } catch (C0828tx unused) {
            new StringBuilder("Received unsupported packet ").append(getClass()).append(" (0x").append(Integer.toHexString(this.f4671)).append(")");
            C0624ov.m756();
        }
    }

    /* renamed from: 櫯 */
    public int mo4050() {
        if (this.f4670 > 0) {
            return -1;
        }
        return this.f4669;
    }
}
