package p004o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: o.th */
public class C0804th {

    /* renamed from: Ą */
    public C0806[] f4926;

    /* renamed from: ą */
    public C0805if[] f4927;

    /* renamed from: Ć */
    public C0615om[] f4928;

    /* renamed from: ȃ */
    public short f4929;

    /* renamed from: ˮ͈ */
    public short f4930;

    /* renamed from: 櫯 */
    public short f4931;

    /* renamed from: 鷭 */
    public byte[] f4932;

    /* renamed from: o.th$if */
    public class C0805if {

        /* renamed from: ˮ͈ */
        public byte[] f4934;

        /* renamed from: 櫯 */
        public short f4935;

        /* renamed from: 鷭 */
        public short f4936;

        public C0805if(C1355 r1) {
            C0804th.this = r1;
        }

        public C0805if(ByteBuffer byteBuffer) {
            this.f4936 = byteBuffer.getShort();
            this.f4935 = byteBuffer.getShort();
            int i = this.f4936 * this.f4935 * 4;
            if (i <= 0) {
                throw new C0823ts("Invalid SPR rgba frame length: " + i);
            }
            this.f4934 = new byte[i];
            byteBuffer.get(this.f4934);
        }
    }

    /* renamed from: o.th$鷭 */
    public class C0806 {

        /* renamed from: ȃ */
        public byte[] f4938;

        /* renamed from: ˮ͈ */
        public int f4939;

        /* renamed from: 櫯 */
        public short f4940;

        /* renamed from: 鷭 */
        public short f4941;

        public C0806(ByteBuffer byteBuffer) {
            this.f4941 = byteBuffer.getShort();
            this.f4940 = byteBuffer.getShort();
            if (this.f4941 <= 0 || this.f4940 < 0) {
                this.f4941 = 1;
                this.f4940 = 1;
                this.f4939 = 1;
                this.f4938 = new byte[1];
                return;
            }
            if (C0804th.this.f4931 >= 513) {
                this.f4939 = C0622ot.m731(byteBuffer.getShort());
            } else {
                this.f4939 = this.f4941 * this.f4940;
            }
            if (this.f4939 <= 0) {
                throw new C0823ts("Invalid SPR frame length: " + this.f4939);
            }
            this.f4938 = new byte[this.f4939];
            byteBuffer.get(this.f4938);
            if (C0804th.this.f4931 >= 513) {
                byte[] bArr = new byte[(this.f4941 * this.f4940)];
                int i = 0;
                int i2 = 0;
                while (i2 < this.f4939 && i < bArr.length) {
                    if (this.f4938[i2] != 0 || (i2 + 1 < this.f4939 && this.f4938[i2 + 1] == 0)) {
                        bArr[i] = this.f4938[i2];
                        i++;
                    } else if (i2 != this.f4939 - 1) {
                        byte b = this.f4938[i2 + 1] & 255;
                        for (int i3 = 0; i3 < b && i < bArr.length; i3++) {
                            bArr[i] = 0;
                            i++;
                        }
                        i2++;
                    }
                    i2++;
                }
                this.f4938 = bArr;
                this.f4939 = (short) bArr.length;
            }
        }
    }

    /* renamed from: 鷭 */
    private static void m1505(C0615om[] omVarArr) {
        int[] iArr = new int[30];
        iArr[3] = 128;
        iArr[7] = 128;
        iArr[9] = 128;
        iArr[10] = 128;
        iArr[14] = 128;
        iArr[15] = 128;
        iArr[17] = 128;
        iArr[19] = 128;
        iArr[20] = 128;
        iArr[21] = 192;
        iArr[22] = 192;
        iArr[23] = 192;
        iArr[24] = 192;
        iArr[25] = 220;
        iArr[26] = 192;
        iArr[27] = 166;
        iArr[28] = 202;
        iArr[29] = 240;
        int[] iArr2 = new int[30];
        iArr2[0] = 255;
        iArr2[1] = 251;
        iArr2[2] = 240;
        iArr2[3] = 160;
        iArr2[4] = 160;
        iArr2[5] = 164;
        iArr2[6] = 128;
        iArr2[7] = 128;
        iArr2[8] = 128;
        iArr2[9] = 255;
        iArr2[13] = 255;
        iArr2[15] = 255;
        iArr2[16] = 255;
        iArr2[20] = 255;
        iArr2[21] = 255;
        iArr2[23] = 255;
        iArr2[25] = 255;
        iArr2[26] = 255;
        iArr2[27] = 255;
        iArr2[28] = 255;
        iArr2[29] = 255;
        for (int i = 0; i < omVarArr.length; i++) {
            omVarArr[i] = new C0615om();
        }
        for (int i2 = 0; i2 < 10; i2++) {
            omVarArr[i2].f3005 = (byte) iArr[(i2 * 3) + 0];
            omVarArr[i2].f3004 = (byte) iArr[(i2 * 3) + 1];
            omVarArr[i2].f3003 = (byte) iArr[(i2 * 3) + 2];
            omVarArr[(omVarArr.length - 10) + i2].f3005 = (byte) iArr2[(i2 * 3) + 0];
            omVarArr[(omVarArr.length - 10) + i2].f3004 = (byte) iArr2[(i2 * 3) + 1];
            omVarArr[(omVarArr.length - 10) + i2].f3003 = (byte) iArr2[(i2 * 3) + 2];
        }
        int i3 = 10;
        for (int i4 = 0; i4 <= 255; i4 += 51) {
            for (int i5 = 0; i5 <= 255; i5 += 51) {
                for (int i6 = 0; i6 <= 255; i6 += 51) {
                    omVarArr[i3].f3002 = 0;
                    omVarArr[i3].f3005 = (byte) i4;
                    omVarArr[i3].f3004 = (byte) i5;
                    omVarArr[i3].f3003 = (byte) i6;
                    i3++;
                }
            }
        }
        omVarArr[0].f3002 = 0;
        omVarArr[0].f3005 = -1;
        omVarArr[0].f3004 = -1;
        omVarArr[0].f3003 = -1;
        omVarArr[255].f3002 = 0;
        omVarArr[255].f3005 = 0;
        omVarArr[255].f3004 = 0;
        omVarArr[255].f3003 = 0;
    }

    public C0804th() {
        this.f4932 = new byte[2];
        this.f4928 = new C0615om[256];
    }

    private C0804th(ByteBuffer byteBuffer) {
        this.f4932 = new byte[2];
        this.f4928 = new C0615om[256];
        byteBuffer.get(this.f4932);
        if (C0622ot.m741(this.f4932, C0618op.LATIN).compareTo("SP") != 0) {
            throw new C0823ts("Invalid SPR magic");
        }
        this.f4931 = byteBuffer.getShort();
        this.f4930 = byteBuffer.getShort();
        if (this.f4931 >= 512) {
            this.f4929 = byteBuffer.getShort();
        }
        if (this.f4930 <= 0 && this.f4929 <= 0) {
            throw new C0823ts("SPR contains no frames / rgba frames");
        } else if (this.f4930 < 0 || this.f4930 > 1000) {
            throw new C0823ts("Invalid SPR frames count: " + this.f4930);
        } else if (this.f4929 < 0 || this.f4929 > 1000) {
            throw new C0823ts("Invalid SPR rgba frames count: " + this.f4929);
        } else {
            if (this.f4930 > 0) {
                this.f4926 = new C0806[this.f4930];
                for (int i = 0; i < this.f4930; i++) {
                    this.f4926[i] = new C0806(byteBuffer);
                }
            }
            if (this.f4929 > 0) {
                this.f4927 = new C0805if[this.f4929];
                for (int i2 = 0; i2 < this.f4929; i2++) {
                    this.f4927[i2] = new C0805if(byteBuffer);
                }
            }
            if (this.f4931 < 257 || this.f4930 <= 0) {
                m1505(this.f4928);
                return;
            }
            if (byteBuffer.remaining() < 1024) {
                byteBuffer.position(byteBuffer.capacity() - 1024);
            }
            m1504(byteBuffer, this.f4928);
        }
    }

    /* renamed from: 鷭 */
    public static void m1504(ByteBuffer byteBuffer, C0615om[] omVarArr) {
        for (int i = 0; i < omVarArr.length; i++) {
            omVarArr[i] = new C0615om();
            omVarArr[i].f3005 = byteBuffer.get();
            omVarArr[i].f3004 = byteBuffer.get();
            omVarArr[i].f3003 = byteBuffer.get();
            omVarArr[i].f3002 = byteBuffer.get();
            if (i == 0) {
                omVarArr[i].f3002 = 0;
            } else {
                omVarArr[i].f3002 = -1;
            }
        }
    }

    public C0804th(byte[] bArr) {
        this(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN));
    }
}
