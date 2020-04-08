package p004o;

import android.opengl.Matrix;
import android.util.FloatMath;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* renamed from: o.䌮 */
final class C1452 {

    /* renamed from: ˮ͈ */
    static ShortBuffer f7073 = ByteBuffer.allocateDirect(1854).order(ByteOrder.nativeOrder()).asShortBuffer();

    /* renamed from: 㵼 */
    private static /* synthetic */ int[] f7074;

    /* renamed from: 櫯 */
    static FloatBuffer f7075 = ByteBuffer.allocateDirect(2616).order(ByteOrder.nativeOrder()).asFloatBuffer();

    /* renamed from: 鷭 */
    static FloatBuffer f7076 = ByteBuffer.allocateDirect(2616).order(ByteOrder.nativeOrder()).asFloatBuffer();

    /* renamed from: Ą */
    public int f7077;

    /* renamed from: ą */
    boolean f7078 = false;

    /* renamed from: Ć */
    boolean f7079 = false;

    /* renamed from: ć */
    boolean f7080 = false;

    /* renamed from: ċ */
    C1453if[] f7081 = new C1453if[4];

    /* renamed from: đ */
    float[] f7082 = null;

    /* renamed from: Ē */
    float f7083 = 1.0f;

    /* renamed from: ē */
    C0433if f7084;

    /* renamed from: Ė */
    C0526lj f7085;

    /* renamed from: ė */
    long f7086 = 20000;

    /* renamed from: Ę */
    long f7087;

    /* renamed from: ę */
    long f7088;

    /* renamed from: ȃ */
    public int f7089;

    /* renamed from: Ȋ */
    C1453if[] f7090 = new C1453if[4];

    /* renamed from: ˮ͍ */
    float f7091;

    /* renamed from: ܕ */
    float f7092 = 0.0f;

    /* renamed from: ঽ্ */
    C1454[] f7093;

    /* renamed from: 㥳 */
    C0526lj f7094 = new C0526lj(0.0f, 0.0f, 0.0f);

    /* renamed from: 䒧 */
    float f7095 = 0.0f;

    /* renamed from: 囃 */
    C1454 f7096;

    /* renamed from: 岱 */
    float f7097;

    /* renamed from: 庸 */
    float f7098 = 0.0f;

    /* renamed from: 廂 */
    long f7099;

    /* renamed from: 廅 */
    C1885 f7100;

    /* renamed from: 纫 */
    C1453if[] f7101 = new C1453if[4];

    /* renamed from: 躆 */
    float f7102 = 1.0f;

    /* renamed from: 띥 */
    C0405hk f7103;

    /* renamed from: o.䌮$if */
    public class C1453if {

        /* renamed from: 鷭 */
        float[] f7105 = {0.0f, 0.0f, 0.0f};

        public C1453if() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: 鷭 */
        public final void mo4346(float f, float f2, float f3, float f4, float f5, float f6) {
            float f7 = 1.0f / f6;
            this.f7105[0] = f3 != 0.0f ? ((((float) Math.random()) * 2.0f) - 1.0f) * f3 : 0.0f;
            this.f7105[1] = (f3 < 0.0f ? 0.0f : -this.f7105[0]) + (((((float) Math.random()) * 2.0f) - 1.0f) * f4);
            float[] fArr = this.f7105;
            fArr[0] = fArr[0] + f;
            float[] fArr2 = this.f7105;
            fArr2[1] = fArr2[1] + (f2 - f);
            this.f7105[2] = ((f5 + f7) - 1.0f) * this.f7105[1] * f7;
            float[] fArr3 = this.f7105;
            fArr3[1] = fArr3[1] * (1.0f - f5);
        }
    }

    /* renamed from: o.䌮$鷭 */
    class C1454 {

        /* renamed from: Ą */
        float[] f7106 = {0.0f, 0.0f, 0.0f};

        /* renamed from: ą */
        float[] f7107 = {0.0f, 0.0f, 0.0f, 0.0f};

        /* renamed from: Ć */
        float[] f7108 = {10.0f, 10.0f, 0.0f, 0.0f};

        /* renamed from: ć */
        C1341 f7109;

        /* renamed from: ȃ */
        float[] f7110 = {1.0f, 1.0f, 1.0f, 1.0f};

        /* renamed from: ˮ͈ */
        C0407 f7111;

        /* renamed from: ˮ͍ */
        C1341 f7112;

        /* renamed from: 櫯 */
        float f7114 = 0.0f;

        /* renamed from: 鷭 */
        long f7115;

        C1454() {
            C1341 r4 = new C1341();
            Matrix.setIdentityM(r4.f6874, 0);
            this.f7109 = r4;
            C1341 r42 = new C1341();
            Matrix.setIdentityM(r42.f6874, 0);
            this.f7112 = r42;
        }

        C1454(C1454 r5) {
            for (int i = 0; i < 4; i++) {
                this.f7111 = r5.f7111;
                this.f7110[i] = r5.f7110[i];
                this.f7107[i] = r5.f7107[i];
                this.f7108[i] = r5.f7108[i];
                if (i <= 2) {
                    this.f7106[i] = r5.f7106[i];
                }
            }
            this.f7109 = new C1341((float[]) r5.f7109.f6874.clone());
            this.f7112 = new C1341((float[]) r5.f7112.f6874.clone());
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(25:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0034 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x004a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0055 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x005f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x006a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0074 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: 櫯 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ int[] m2152() {
        /*
            int[] r0 = f7074
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.if[] r0 = p004o.C0433if.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.if r0 = p004o.C0433if.EP_2DFLASH     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.if r0 = p004o.C0433if.EP_2DTEXTURE     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.if r0 = p004o.C0433if.EP_2DTEXTURE_BOTTOM     // Catch:{ NoSuchFieldError -> 0x002a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            o.if r0 = p004o.C0433if.EP_3DCIRCLE     // Catch:{ NoSuchFieldError -> 0x0034 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
            r1 = 6
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0034 }
        L_0x0034:
            o.if r0 = p004o.C0433if.EP_3DCYLINDER     // Catch:{ NoSuchFieldError -> 0x003f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003f }
            r1 = 8
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x003f }
        L_0x003f:
            o.if r0 = p004o.C0433if.EP_3DHALFSPHERE     // Catch:{ NoSuchFieldError -> 0x004a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004a }
            r1 = 10
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x004a }
        L_0x004a:
            o.if r0 = p004o.C0433if.EP_3DPARTICLE     // Catch:{ NoSuchFieldError -> 0x0055 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0055 }
            r1 = 11
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0055 }
        L_0x0055:
            o.if r0 = p004o.C0433if.EP_3DRING     // Catch:{ NoSuchFieldError -> 0x005f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x005f }
            r1 = 7
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x005f }
        L_0x005f:
            o.if r0 = p004o.C0433if.EP_3DSPHERE     // Catch:{ NoSuchFieldError -> 0x006a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
            r1 = 9
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
        L_0x006a:
            o.if r0 = p004o.C0433if.EP_CIRCLE     // Catch:{ NoSuchFieldError -> 0x0074 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0074 }
        L_0x0074:
            o.if r0 = p004o.C0433if.EP_RING     // Catch:{ NoSuchFieldError -> 0x007e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x007e }
        L_0x007e:
            f7074 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1452.m2152():int[]");
    }

    /* renamed from: 鷭 */
    private static void m2154(int i, float[] fArr) {
        if (i >= 0) {
            f7076.position(i * 3);
            f7075.position(i * 3);
        }
        for (int i2 = 0; i2 < fArr.length; i2 += 6) {
            f7076.put(fArr, i2, 3);
            f7075.put(fArr, i2 + 3, 3);
        }
    }

    /* renamed from: 鷭 */
    private static void m2153(int i, int i2, int i3, int i4, int i5) {
        if (i >= 0) {
            f7073.position(i * 3);
        }
        f7073.put(new short[]{(short) (i2 + i3), (short) (i2 + i4), (short) (i2 + i5)});
    }

    static {
        m2154(-1, new float[]{-0.5f, 0.5f, 0.0f, 0.0f, 0.0f, 4.0f, 0.5f, 0.5f, 0.0f, 1.0f, 0.0f, 4.0f, -0.5f, -0.5f, 0.0f, 0.0f, 1.0f, 4.0f, 0.5f, -0.5f, 0.0f, 1.0f, 1.0f, 4.0f});
        m2153(-1, 0, 0, 1, 2);
        m2153(-1, 0, 2, 1, 3);
        m2154(-1, new float[]{-0.5f, 1.0f, 0.0f, 0.0f, 0.0f, 4.0f, 0.5f, 1.0f, 0.0f, 1.0f, 0.0f, 4.0f, -0.5f, 0.0f, 0.0f, 0.0f, 1.0f, 4.0f, 0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 4.0f});
        m2153(-1, 4, 0, 1, 2);
        m2153(-1, 4, 2, 1, 3);
        m2154(-1, new float[]{0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 4.0f, 0.5f, 1.0f, 0.0f, 1.0f, 1.0f, 4.0f, -0.5f, 1.0f, 0.0f, 0.0f, 1.0f, 4.0f});
        m2153(-1, 8, 0, 1, 2);
        m2154(-1, new float[]{0.0f, 0.0f, 0.0f, 0.5f, 1.0f, 4.0f});
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        short position = (short) (f7076.position() / 3);
        int i = 0;
        while (i < 16) {
            double d = 0.39269908169872414d * ((double) i);
            fArr[0] = FloatMath.sin((float) d);
            fArr[1] = FloatMath.cos((float) d);
            fArr[2] = 0.0f;
            fArr[3] = ((float) ((i & 4) > 0 ? 4 - (i & 3) : i & 3)) * 0.25f;
            fArr[4] = 0.0f;
            fArr[5] = 4.0f;
            m2154(position + i, fArr);
            fArr[4] = 1.0f;
            fArr[5] = 44.0f;
            m2154(position + 16 + i, fArr);
            fArr[5] = 2.0f;
            m2154(position + 32 + i, fArr);
            fArr[2] = 1.0f;
            fArr[4] = 0.0f;
            fArr[5] = 22.0f;
            m2154(position + 48 + i, fArr);
            m2153(i + 5, position, -1, i % 16, (i + 1) % 16);
            int i2 = (i % 16) + 16;
            int i3 = (i + 1) % 16;
            int i4 = ((i + 1) % 16) + 16;
            m2153((i * 2) + 21, position, i % 16, i2, i3);
            m2153(-1, position, i3, i2, i4);
            int i5 = position + 32;
            int i6 = (i % 16) + 16;
            int i7 = (i + 1) % 16;
            int i8 = ((i + 1) % 16) + 16;
            m2153((i * 2) + 53, i5, i % 16, i6, i7);
            m2153(-1, i5, i7, i6, i8);
            i++;
        }
        m2154(-1, new float[]{0.0f, 1.0f, 0.0f, 0.5f, 0.0f, 6.0f});
        short position2 = (short) (f7076.position() / 3);
        fArr[5] = 6.0f;
        for (int i9 = 2; i9 < 16; i9 += 2) {
            double d2 = 0.19634954084936207d * ((double) i9);
            fArr[1] = FloatMath.cos((float) d2);
            fArr[4] = (((float) i9) * 1.0f) / 16.0f;
            double sin = Math.sin(d2);
            for (int i10 = 0; i10 <= 16; i10++) {
                double d3 = 0.39269908169872414d * ((double) i10);
                fArr[0] = (float) (Math.sin(d3) * sin);
                fArr[2] = (float) (Math.cos(d3) * sin);
                fArr[3] = (((float) i10) * 1.0f) / 16.0f;
                m2154(-1, fArr);
            }
        }
        m2154(-1, new float[]{0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 6.0f});
        for (int i11 = 0; i11 < 16; i11++) {
            m2153(-1, position2, -1, i11, i11 + 1);
        }
        int i12 = 1;
        while (i12 * 2 < 14) {
            for (int i13 = 0; i13 < 16; i13++) {
                int i14 = position2 + ((i12 - 1) * 17);
                int i15 = i13 + 16 + 1;
                int i16 = i13 + 1;
                int i17 = i13 + 16 + 2;
                m2153(-1, i14, i13, i15, i16);
                m2153(-1, i14, i16, i15, i17);
            }
            i12++;
        }
        for (int i18 = 0; i18 < 16; i18++) {
            m2153(-1, ((i12 - 1) * 17) + position2, 17, i18 + 1, i18);
        }
        f7076.position(0);
        f7075.position(0);
        f7073.position(0);
    }

    /* renamed from: 鷭 */
    public final void mo4344() {
        if (this.f7103 != null) {
            this.f7103.mo3601();
        }
        this.f7103 = null;
        this.f7090 = null;
        this.f7081 = null;
        this.f7101 = null;
        this.f7093 = null;
    }

    C1452(C1885 r5, C0433if ifVar) {
        this.f7100 = r5;
        this.f7096 = new C1454();
        this.f7093 = new C1454[1];
        this.f7093[0] = this.f7096;
        int[] r0 = m2152();
        this.f7084 = ifVar;
        switch (r0[ifVar.ordinal()]) {
            case 1:
                this.f7089 = 0;
                this.f7077 = 2;
                this.f7083 = 0.14285715f;
                break;
            case 2:
                this.f7089 = 2;
                this.f7077 = 2;
                this.f7083 = 0.14285715f;
                break;
            case 3:
                this.f7089 = 5;
                this.f7077 = 16;
                this.f7083 = 0.14285715f;
                break;
            case 4:
                this.f7089 = 21;
                this.f7077 = 32;
                this.f7083 = 0.14285715f;
                break;
            case 5:
                this.f7089 = 4;
                this.f7077 = 1;
                this.f7083 = 0.14285715f;
                break;
            case 6:
                this.f7089 = 5;
                this.f7077 = 16;
                this.f7080 = true;
                break;
            case 7:
                this.f7089 = 21;
                this.f7077 = 32;
                this.f7080 = true;
                break;
            case 8:
                this.f7089 = 53;
                this.f7077 = 32;
                this.f7080 = true;
                break;
            case 9:
                this.f7089 = 85;
                this.f7077 = 224;
                this.f7080 = true;
                break;
            case 10:
                this.f7089 = 85;
                this.f7077 = 112;
                this.f7080 = true;
                break;
            case 11:
                this.f7089 = 0;
                this.f7077 = 2;
                this.f7083 = 0.14285715f;
                this.f7093 = null;
                break;
        }
        this.f7087 = r5.f8509;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4345(C1453if[] ifVarArr, int i, float f, float f2, float f3, float f4, float f5, float f6) {
        if (ifVarArr[i] == null) {
            ifVarArr[i] = new C1453if();
        }
        ifVarArr[i].mo4346(f, f2, f3, f4, f5, f6 > 0.0f ? f6 : ((float) this.f7086) / ((float) this.f7088));
    }
}
