package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.tf */
public final class C0786tf {

    /* renamed from: Ą */
    public int f4798;

    /* renamed from: ą */
    public byte f4799;

    /* renamed from: Ć */
    public byte[] f4800 = new byte[16];

    /* renamed from: ć */
    public int f4801;

    /* renamed from: ċ */
    public int f4802;

    /* renamed from: ȃ */
    public int f4803;

    /* renamed from: Ȋ */
    public C0790[] f4804;

    /* renamed from: ˮ͈ */
    public byte f4805;

    /* renamed from: ˮ͍ */
    public C0789[] f4806;

    /* renamed from: ܕ */
    public double f4807;

    /* renamed from: 䒧 */
    public int f4808;

    /* renamed from: 岱 */
    public byte[] f4809 = new byte[40];

    /* renamed from: 櫯 */
    public byte f4810;

    /* renamed from: 纫 */
    public C0787if[] f4811;

    /* renamed from: 躆 */
    public C0788[] f4812;

    /* renamed from: 鷭 */
    public byte[] f4813 = new byte[4];

    /* renamed from: o.tf$if */
    public class C0787if {

        /* renamed from: 櫯 */
        float[] f4815;

        /* renamed from: 鷭 */
        public int f4816;

        public C0787if() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: 鷭 */
        public final boolean mo4110(ByteBuffer byteBuffer) {
            this.f4816 = byteBuffer.getInt();
            if (this.f4816 < 0) {
                throw new RuntimeException("Invalid RSM posframe ID: " + this.f4816);
            }
            this.f4815 = new float[3];
            for (int i = 0; i < 3; i++) {
                this.f4815[i] = byteBuffer.getFloat();
            }
            return true;
        }
    }

    /* renamed from: o.tf$ˮ͈ */
    public class C0788 {

        /* renamed from: ȃ */
        public int f4818;

        /* renamed from: ˮ͈ */
        public float[] f4819;

        /* renamed from: 櫯 */
        public float[] f4820;

        /* renamed from: 鷭 */
        public float[] f4821;

        public C0788() {
        }
    }

    /* renamed from: o.tf$櫯 */
    public class C0789 {

        /* renamed from: 鷭 */
        public byte[] f4823 = new byte[40];

        public C0789() {
        }
    }

    /* renamed from: o.tf$鷭 */
    public class C0790 {

        /* renamed from: Ą */
        public float[] f4824;

        /* renamed from: ą */
        public float[] f4825;

        /* renamed from: Ć */
        public float f4826;

        /* renamed from: ć */
        public float[] f4827;

        /* renamed from: ċ */
        public C0793[] f4828;

        /* renamed from: ȃ */
        public float[] f4829 = new float[9];

        /* renamed from: Ȋ */
        public C0792[] f4830;

        /* renamed from: ˮ͈ */
        public int[] f4831;

        /* renamed from: ˮ͍ */
        public float[] f4832;

        /* renamed from: 䒧 */
        public boolean f4833;

        /* renamed from: 岱 */
        public float[] f4834;

        /* renamed from: 櫯 */
        public byte[] f4835 = new byte[40];

        /* renamed from: 纫 */
        public C0791if[] f4836;

        /* renamed from: 鷭 */
        public byte[] f4838 = new byte[40];

        /* renamed from: o.tf$鷭$if */
        public class C0791if {

            /* renamed from: 櫯 */
            float[] f4840 = new float[4];

            /* renamed from: 鷭 */
            int f4841;

            C0791if(ByteBuffer byteBuffer) {
                this.f4841 = byteBuffer.getInt();
                if (this.f4841 < 0) {
                    C0624ov.m759("time < 0");
                }
                C0620or.m714(byteBuffer, this.f4840);
            }
        }

        /* renamed from: o.tf$鷭$櫯 */
        public class C0792 {

            /* renamed from: ˮ͈ */
            public float f4843;

            /* renamed from: 櫯 */
            public float f4844;

            /* renamed from: 鷭 */
            public int f4845;

            C0792(ByteBuffer byteBuffer) {
                if (C0786tf.this.f4807 >= 1.2d) {
                    this.f4845 = byteBuffer.getInt();
                } else {
                    this.f4845 = -1;
                }
                this.f4844 = byteBuffer.getFloat();
                this.f4843 = byteBuffer.getFloat();
            }
        }

        /* renamed from: o.tf$鷭$鷭 */
        public class C0793 {

            /* renamed from: Ą */
            public int f4846;

            /* renamed from: ą */
            public int f4847;

            /* renamed from: ȃ */
            public short f4849;

            /* renamed from: ˮ͈ */
            public short f4850;

            /* renamed from: 櫯 */
            public short[] f4851 = new short[3];

            /* renamed from: 鷭 */
            public short[] f4852 = new short[3];

            C0793(ByteBuffer byteBuffer) {
                C0620or.m715(byteBuffer, this.f4852);
                C0620or.m715(byteBuffer, this.f4851);
                this.f4850 = byteBuffer.getShort();
                this.f4849 = byteBuffer.getShort();
                this.f4846 = byteBuffer.getInt();
                if (C0786tf.this.f4807 >= 1.2d) {
                    this.f4847 = byteBuffer.getInt();
                }
            }
        }

        public C0790() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: 鷭 */
        public final boolean mo4111(ByteBuffer byteBuffer) {
            byteBuffer.get(this.f4838);
            byteBuffer.get(this.f4835);
            int i = byteBuffer.getInt();
            if (i < 0 || i > 50) {
                throw new RuntimeException("Invalid RSM textures count: " + i);
            }
            this.f4831 = C0620or.m716(byteBuffer, i);
            this.f4829 = C0620or.m713(byteBuffer, this.f4829.length);
            this.f4824 = C0620or.m713(byteBuffer, 3);
            this.f4825 = C0620or.m713(byteBuffer, 3);
            this.f4826 = byteBuffer.getFloat();
            this.f4827 = C0620or.m713(byteBuffer, 3);
            this.f4832 = C0620or.m713(byteBuffer, 3);
            int i2 = byteBuffer.getInt();
            if (i2 < 0) {
                throw new RuntimeException("Invalid RSM vertices count: " + i2);
            } else if (i2 * 3 < 0) {
                throw new RuntimeException("Invalid RSM vertices count: " + i2);
            } else {
                this.f4834 = C0620or.m713(byteBuffer, i2 * 3);
                int i3 = byteBuffer.getInt();
                if (i3 < 0) {
                    throw new RuntimeException("Invalid RSM texcoord sets count: " + i3);
                }
                this.f4830 = new C0792[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    this.f4830[i4] = new C0792(byteBuffer);
                }
                int i5 = byteBuffer.getInt();
                if (i5 < 0) {
                    throw new RuntimeException("Invalid RSM faces count: " + i5);
                }
                this.f4828 = new C0793[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    this.f4828[i6] = new C0793(byteBuffer);
                }
                int i7 = byteBuffer.getInt();
                if (i7 < 0) {
                    throw new RuntimeException("Invalid RSM rotation frames count: " + i7);
                }
                this.f4836 = new C0791if[i7];
                for (int i8 = 0; i8 < i7; i8++) {
                    this.f4836[i8] = new C0791if(byteBuffer);
                }
                return true;
            }
        }
    }

    /* renamed from: 鷭 */
    public final boolean mo4109(ByteBuffer byteBuffer) {
        byteBuffer.get(this.f4813);
        if (C0622ot.m741(this.f4813, C0618op.LATIN).compareTo("GRSM") != 0) {
            throw new RuntimeException("Invalid RSM magic:" + C0622ot.m741(this.f4813, C0618op.LATIN));
        }
        this.f4810 = byteBuffer.get();
        this.f4805 = byteBuffer.get();
        this.f4807 = ((double) this.f4810) + (((double) this.f4805) / 10.0d);
        this.f4803 = byteBuffer.getInt();
        this.f4798 = byteBuffer.getInt();
        this.f4799 = this.f4807 >= 1.4d ? byteBuffer.get() : -1;
        byteBuffer.get(this.f4800);
        this.f4801 = byteBuffer.getInt();
        if (this.f4801 <= 0 || this.f4801 > 50) {
            throw new RuntimeException("Invalid RSM textures number: " + this.f4801);
        }
        this.f4806 = new C0789[this.f4801];
        for (int i = 0; i < this.f4801; i++) {
            this.f4806[i] = new C0789();
            byteBuffer.get(this.f4806[i].f4823);
        }
        byteBuffer.get(this.f4809);
        int i2 = byteBuffer.getInt();
        if (i2 <= 0) {
            throw new RuntimeException("Invalid RSM meshes count: " + i2);
        }
        this.f4804 = new C0790[Math.min(i2, 50)];
        for (int i3 = 0; i3 < i2; i3++) {
            C0790 r8 = new C0790();
            r8.mo4111(byteBuffer);
            if (i3 < 50) {
                this.f4804[i3] = r8;
            }
        }
        if (this.f4807 >= 1.5d) {
            this.f4802 = byteBuffer.getInt();
            this.f4811 = new C0787if[this.f4802];
            for (int i4 = 0; i4 < this.f4802; i4++) {
                this.f4811[i4] = new C0787if();
                this.f4811[i4].mo4110(byteBuffer);
            }
        }
        this.f4808 = byteBuffer.getInt();
        this.f4812 = new C0788[this.f4808];
        for (int i5 = 0; i5 < this.f4808; i5++) {
            this.f4812[i5] = new C0788();
            this.f4812[i5].f4821 = new float[]{byteBuffer.getFloat(), byteBuffer.getFloat(), byteBuffer.getFloat()};
            this.f4812[i5].f4820 = new float[]{byteBuffer.getFloat(), byteBuffer.getFloat(), byteBuffer.getFloat()};
            this.f4812[i5].f4819 = new float[]{byteBuffer.getFloat(), byteBuffer.getFloat(), byteBuffer.getFloat()};
            this.f4812[i5].f4818 = this.f4807 >= 1.3d ? byteBuffer.getInt() : 0;
        }
        return true;
    }
}
