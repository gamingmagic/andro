package p004o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.DataFormatException;

/* renamed from: o.lo */
final class C0531lo {

    /* renamed from: Ą */
    byte[] f1668;

    /* renamed from: ą */
    int f1669;

    /* renamed from: Ć */
    int f1670;

    /* renamed from: ȃ */
    int f1671;

    /* renamed from: ˮ͈ */
    int f1672;

    /* renamed from: 櫯 */
    int f1673;

    /* renamed from: 鷭 */
    int f1674;

    public C0531lo(byte[] bArr) {
        byte[] bArr2;
        int i;
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        ByteBuffer byteBuffer = order;
        C0618op opVar = C0618op.LATIN;
        byte[] bArr3 = new byte[4];
        order.get(bArr3);
        if (!C0622ot.m741(bArr3, opVar).equals("RIFF")) {
            throw new DataFormatException("Invalid magic");
        }
        int i2 = byteBuffer.getInt();
        if (i2 < 0 || i2 > bArr.length) {
            throw new DataFormatException("Unexpected ChunkSize=" + i2);
        }
        C0618op opVar2 = C0618op.LATIN;
        byte[] bArr4 = new byte[4];
        byteBuffer.get(bArr4);
        String r5 = C0622ot.m741(bArr4, opVar2);
        if (!r5.equals("WAVE")) {
            throw new DataFormatException("Unexpected Format=" + r5);
        }
        C0618op opVar3 = C0618op.LATIN;
        byte[] bArr5 = new byte[4];
        byteBuffer.get(bArr5);
        String r52 = C0622ot.m741(bArr5, opVar3);
        if (!r52.equals("fmt ")) {
            throw new DataFormatException("Unexpected Subchunk1ID=" + r52);
        }
        int i3 = byteBuffer.getInt();
        if (i3 < 0 || i3 > i2) {
            throw new DataFormatException("Unexpected Subchunk1Size=" + i3);
        }
        this.f1674 = byteBuffer.getShort();
        switch (this.f1674) {
            case 1:
                this.f1673 = byteBuffer.getShort();
                if (this.f1673 == 1 || this.f1673 == 2) {
                    this.f1672 = byteBuffer.getInt();
                    byteBuffer.getInt();
                    byteBuffer.getShort();
                    this.f1671 = byteBuffer.getShort();
                    if (this.f1674 != 1) {
                        byteBuffer.get(new byte[byteBuffer.getShort()]);
                    }
                    while (true) {
                        bArr2 = new byte[4];
                        byteBuffer.get(bArr2);
                        if (!C0622ot.m741(bArr2, C0618op.LATIN).equals("data")) {
                            i = byteBuffer.getInt();
                            if (i >= 0 && i <= byteBuffer.remaining()) {
                                byteBuffer.get(new byte[i]);
                            }
                        } else {
                            int i4 = byteBuffer.getInt();
                            if (i4 < 0 || i4 > byteBuffer.remaining()) {
                                throw new DataFormatException("Unexpected Subchunk2Size=" + i4 + " (remaining=" + byteBuffer.remaining() + ")");
                            }
                            this.f1670 = i4;
                            this.f1669 = byteBuffer.position();
                            this.f1668 = bArr;
                            return;
                        }
                    }
                    throw new C0588no("Failed to skip subchunk " + bArr2[0] + bArr2[1] + bArr2[2] + bArr2[3] + ": invalid size (" + i + ")\n");
                }
                throw new DataFormatException("Unsupported channels: " + this.f1673);
            default:
                throw new DataFormatException("Unsupported encoding: " + this.f1674);
        }
    }
}
