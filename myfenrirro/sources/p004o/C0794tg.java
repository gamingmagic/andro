package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.tg */
public final class C0794tg {

    /* renamed from: Ć */
    private static /* synthetic */ int[] f4853;

    /* renamed from: Ą */
    public C0796[] f4854;

    /* renamed from: ą */
    public double f4855;

    /* renamed from: ȃ */
    public C0795if f4856;

    /* renamed from: ˮ͈ */
    public C0797 f4857;

    /* renamed from: 櫯 */
    public C0800 f4858;

    /* renamed from: 鷭 */
    public C0802 f4859;

    /* renamed from: o.tg$aux */
    public class aux extends C0796 {

        /* renamed from: Ą */
        public int f4860;

        /* renamed from: ą */
        public int f4861;

        /* renamed from: Ć */
        public float f4862;

        /* renamed from: ć */
        public float f4863;

        /* renamed from: ȃ */
        public float f4864;

        /* renamed from: ˮ͈ */
        public float[] f4865 = new float[3];

        /* renamed from: 櫯 */
        public byte[] f4867 = new byte[80];

        /* renamed from: 鷭 */
        public byte[] f4868 = new byte[80];

        public aux() {
            super();
        }

        /* renamed from: 鷭 */
        public final boolean mo4112(ByteBuffer byteBuffer) {
            byteBuffer.get(this.f4868);
            byteBuffer.get(this.f4867);
            float[] fArr = this.f4865;
            ByteBuffer byteBuffer2 = byteBuffer;
            fArr[0] = byteBuffer2.getFloat();
            fArr[1] = byteBuffer2.getFloat();
            fArr[2] = byteBuffer2.getFloat();
            this.f4864 = byteBuffer.getFloat();
            this.f4860 = byteBuffer.getInt();
            this.f4861 = byteBuffer.getInt();
            this.f4862 = byteBuffer.getFloat();
            this.f4863 = C0794tg.this.f4855 >= 2.0d ? byteBuffer.getFloat() : 0.0f;
            return true;
        }
    }

    /* renamed from: o.tg$if */
    public class C0795if {

        /* renamed from: ȃ */
        public int f4870;

        /* renamed from: ˮ͈ */
        public int f4871;

        /* renamed from: 櫯 */
        public int f4872;

        /* renamed from: 鷭 */
        public int f4873;

        public C0795if() {
        }
    }

    /* renamed from: o.tg$Ą */
    public abstract class C0796 {

        /* renamed from: Ȋ */
        public C0801 f4875;

        /* renamed from: 鷭 */
        public abstract boolean mo4112(ByteBuffer byteBuffer);

        public C0796() {
        }
    }

    /* renamed from: o.tg$Ć */
    public class C0797 {

        /* renamed from: Ą */
        public float f4876;

        /* renamed from: ȃ */
        public float[] f4878 = new float[3];

        /* renamed from: ˮ͈ */
        public float[] f4879 = new float[3];

        /* renamed from: 櫯 */
        public int f4880;

        /* renamed from: 鷭 */
        public int f4881;

        public C0797() {
        }
    }

    /* renamed from: o.tg$ȃ */
    public class C0798 extends C0796 {

        /* renamed from: Ą */
        public byte[] f4882 = new byte[80];

        /* renamed from: ą */
        public byte[] f4883 = new byte[80];

        /* renamed from: Ć */
        public float[] f4884 = new float[3];

        /* renamed from: ć */
        public float[] f4885 = new float[3];

        /* renamed from: ȃ */
        public int f4886;

        /* renamed from: ˮ͈ */
        public float f4887;

        /* renamed from: ˮ͍ */
        public float[] f4888 = new float[3];

        /* renamed from: 櫯 */
        public int f4890;

        /* renamed from: 鷭 */
        public byte[] f4891 = new byte[40];

        public C0798() {
            super();
        }

        /* renamed from: 鷭 */
        public final boolean mo4112(ByteBuffer byteBuffer) {
            if (C0794tg.this.f4855 >= 1.3d) {
                byteBuffer.get(this.f4891);
                this.f4890 = byteBuffer.getInt();
                this.f4887 = byteBuffer.getFloat();
                this.f4886 = byteBuffer.getInt();
            }
            byteBuffer.get(this.f4882);
            byteBuffer.get(this.f4883);
            float[] fArr = this.f4884;
            ByteBuffer byteBuffer2 = byteBuffer;
            fArr[0] = byteBuffer2.getFloat();
            fArr[1] = byteBuffer2.getFloat();
            fArr[2] = byteBuffer2.getFloat();
            float[] fArr2 = this.f4885;
            ByteBuffer byteBuffer3 = byteBuffer;
            fArr2[0] = byteBuffer3.getFloat();
            fArr2[1] = byteBuffer3.getFloat();
            fArr2[2] = byteBuffer3.getFloat();
            float[] fArr3 = this.f4888;
            ByteBuffer byteBuffer4 = byteBuffer;
            fArr3[0] = byteBuffer4.getFloat();
            fArr3[1] = byteBuffer4.getFloat();
            fArr3[2] = byteBuffer4.getFloat();
            return true;
        }
    }

    /* renamed from: o.tg$ˮ͈ */
    public class C0799 extends C0796 {

        /* renamed from: ȃ */
        public float f4893;

        /* renamed from: ˮ͈ */
        public float[] f4894 = new float[3];

        /* renamed from: 櫯 */
        public float[] f4895 = new float[3];

        /* renamed from: 鷭 */
        public byte[] f4896 = new byte[80];

        public C0799() {
            super();
        }

        /* renamed from: 鷭 */
        public final boolean mo4112(ByteBuffer byteBuffer) {
            byteBuffer.get(this.f4896);
            float[] fArr = this.f4895;
            ByteBuffer byteBuffer2 = byteBuffer;
            for (int i = 0; i < fArr.length; i++) {
                fArr[i] = byteBuffer2.getFloat();
            }
            float[] fArr2 = this.f4894;
            ByteBuffer byteBuffer3 = byteBuffer;
            for (int i2 = 0; i2 < fArr2.length; i2++) {
                fArr2[i2] = byteBuffer3.getFloat();
            }
            this.f4893 = byteBuffer.getFloat();
            return true;
        }
    }

    /* renamed from: o.tg$ˮ͍ */
    public class C0800 {

        /* renamed from: Ą */
        public float f4897;

        /* renamed from: ą */
        public int f4898;

        /* renamed from: ȃ */
        public float f4900;

        /* renamed from: ˮ͈ */
        public float f4901;

        /* renamed from: 櫯 */
        public int f4902;

        /* renamed from: 鷭 */
        public float f4903;

        public C0800() {
        }
    }

    /* renamed from: o.tg$岱 */
    public enum C0801 {
        NONE,
        MODEL,
        LIGHT,
        SOUND,
        EFFECT
    }

    /* renamed from: o.tg$櫯 */
    public class C0802 {

        /* renamed from: Ą */
        public byte[] f4910 = new byte[40];

        /* renamed from: ą */
        public byte[] f4911 = new byte[40];

        /* renamed from: ȃ */
        public byte[] f4913 = new byte[40];

        /* renamed from: ˮ͈ */
        public byte[] f4914 = new byte[40];

        /* renamed from: 櫯 */
        public byte[] f4915 = new byte[2];

        /* renamed from: 鷭 */
        public byte[] f4916 = new byte[4];

        public C0802() {
        }
    }

    /* renamed from: o.tg$鷭 */
    public class C0803 extends C0796 {

        /* renamed from: Ą */
        public float f4917;

        /* renamed from: ą */
        public float f4918;

        /* renamed from: Ć */
        public int f4919;

        /* renamed from: ć */
        public int f4920;

        /* renamed from: ȃ */
        public float f4921;

        /* renamed from: ˮ͈ */
        public int f4922;

        /* renamed from: 櫯 */
        public float[] f4924 = new float[3];

        /* renamed from: 鷭 */
        public byte[] f4925 = new byte[80];

        public C0803() {
            super();
        }

        /* renamed from: 鷭 */
        public final boolean mo4112(ByteBuffer byteBuffer) {
            byteBuffer.get(this.f4925);
            float[] fArr = this.f4924;
            ByteBuffer byteBuffer2 = byteBuffer;
            fArr[0] = byteBuffer2.getFloat();
            fArr[1] = byteBuffer2.getFloat();
            fArr[2] = byteBuffer2.getFloat();
            this.f4922 = byteBuffer.getInt();
            this.f4921 = byteBuffer.getFloat();
            this.f4917 = byteBuffer.getFloat();
            this.f4918 = byteBuffer.getFloat();
            this.f4919 = byteBuffer.getInt();
            this.f4920 = byteBuffer.getInt();
            return true;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:3|4|5|6|7|8|9|10|11|12|13|14|16) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0034 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ int[] m1498() {
        /*
            int[] r0 = f4853
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.tg$岱[] r0 = p004o.C0794tg.C0801.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.tg$岱 r0 = p004o.C0794tg.C0801.EFFECT     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.tg$岱 r0 = p004o.C0794tg.C0801.LIGHT     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.tg$岱 r0 = p004o.C0794tg.C0801.MODEL     // Catch:{ NoSuchFieldError -> 0x002a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            o.tg$岱 r0 = p004o.C0794tg.C0801.NONE     // Catch:{ NoSuchFieldError -> 0x0034 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0034 }
        L_0x0034:
            o.tg$岱 r0 = p004o.C0794tg.C0801.SOUND     // Catch:{ NoSuchFieldError -> 0x003e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x003e }
        L_0x003e:
            f4853 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0794tg.m1498():int[]");
    }
}
