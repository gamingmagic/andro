package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.td */
public final class C0776td {

    /* renamed from: Ą */
    public C0784[] f4738;

    /* renamed from: ą */
    public short[] f4739;

    /* renamed from: Ć */
    public int f4740;

    /* renamed from: ć */
    public int f4741;

    /* renamed from: ȃ */
    public C0778 f4742;

    /* renamed from: ˮ͈ */
    public C0782 f4743;

    /* renamed from: 櫯 */
    public C0780 f4744;

    /* renamed from: 鷭 */
    public C0777if f4745;

    /* renamed from: o.td$if */
    public class C0777if {

        /* renamed from: Ą */
        public float f4746;

        /* renamed from: ȃ */
        public int f4748;

        /* renamed from: ˮ͈ */
        public int f4749;

        /* renamed from: 櫯 */
        public byte[] f4750 = new byte[2];

        /* renamed from: 鷭 */
        public byte[] f4751 = new byte[4];

        public C0777if() {
        }
    }

    /* renamed from: o.td$ȃ */
    public class C0778 {

        /* renamed from: 櫯 */
        public C0779[] f4753;

        /* renamed from: 鷭 */
        public int f4754;

        /* renamed from: o.td$ȃ$鷭 */
        public class C0779 {

            /* renamed from: Ą */
            public float f4755;

            /* renamed from: ą */
            public float f4756;

            /* renamed from: Ć */
            public float f4757;

            /* renamed from: ć */
            public float f4758;

            /* renamed from: ȃ */
            public float f4760;

            /* renamed from: Ȋ */
            public int f4761;

            /* renamed from: ˮ͈ */
            public float f4762;

            /* renamed from: ˮ͍ */
            public short f4763;

            /* renamed from: 岱 */
            public short f4764;

            /* renamed from: 櫯 */
            public float f4765;

            /* renamed from: 鷭 */
            public float f4766;

            public C0779(ByteBuffer byteBuffer) {
                this.f4766 = byteBuffer.getFloat();
                this.f4765 = byteBuffer.getFloat();
                this.f4762 = byteBuffer.getFloat();
                this.f4760 = byteBuffer.getFloat();
                this.f4755 = byteBuffer.getFloat();
                this.f4756 = byteBuffer.getFloat();
                this.f4757 = byteBuffer.getFloat();
                this.f4758 = byteBuffer.getFloat();
                this.f4763 = byteBuffer.getShort();
                if (this.f4763 < 0) {
                    throw new RuntimeException("Incorrect GND tile texture index: " + this.f4763);
                }
                this.f4764 = byteBuffer.getShort();
                this.f4761 = byteBuffer.getInt();
            }
        }

        public C0778() {
        }
    }

    /* renamed from: o.td$ˮ͈ */
    public class C0780 {

        /* renamed from: ˮ͈ */
        public C0781[] f4768;

        /* renamed from: 櫯 */
        public int f4769;

        /* renamed from: 鷭 */
        public int f4770;

        /* renamed from: o.td$ˮ͈$鷭 */
        public class C0781 {

            /* renamed from: 鷭 */
            public byte[] f4772;

            public C0781() {
            }
        }

        public C0780() {
        }
    }

    /* renamed from: o.td$櫯 */
    public class C0782 {

        /* renamed from: Ą */
        public C0783[] f4773;

        /* renamed from: ȃ */
        public int f4775;

        /* renamed from: ˮ͈ */
        public int f4776;

        /* renamed from: 櫯 */
        public int f4777;

        /* renamed from: 鷭 */
        public int f4778;

        /* renamed from: o.td$櫯$鷭 */
        public class C0783 {

            /* renamed from: 櫯 */
            public byte[] f4780 = new byte[192];

            /* renamed from: 鷭 */
            public byte[] f4781 = new byte[64];

            public C0783(ByteBuffer byteBuffer) {
                byteBuffer.get(this.f4781);
                byteBuffer.get(this.f4780);
            }

            public C0783(byte b) {
                for (int i = 0; i < this.f4781.length; i++) {
                    this.f4781[i] = -1;
                }
                for (int i2 = 0; i2 < this.f4780.length; i2++) {
                    this.f4780[i2] = -1;
                }
            }
        }

        public C0782() {
        }
    }

    /* renamed from: o.td$鷭 */
    public class C0784 {

        /* renamed from: Ą */
        public int f4782;

        /* renamed from: ą */
        public int f4783;

        /* renamed from: Ć */
        public int f4784;

        /* renamed from: ȃ */
        public float f4786;

        /* renamed from: ˮ͈ */
        public float f4787;

        /* renamed from: 櫯 */
        public float f4788;

        /* renamed from: 鷭 */
        public float f4789;

        public C0784(ByteBuffer byteBuffer) {
            this.f4789 = byteBuffer.getFloat();
            this.f4788 = byteBuffer.getFloat();
            this.f4787 = byteBuffer.getFloat();
            this.f4786 = byteBuffer.getFloat();
            this.f4782 = byteBuffer.getInt();
            this.f4783 = byteBuffer.getInt();
            this.f4784 = byteBuffer.getInt();
        }
    }

    /* renamed from: 鷭 */
    public final int mo4107(int i, int i2) {
        int i3 = this.f4738[(this.f4745.f4749 * i2) + i].f4782;
        if (i3 < 0) {
            return 0;
        }
        return this.f4742.f4753[i3].f4761;
    }
}
