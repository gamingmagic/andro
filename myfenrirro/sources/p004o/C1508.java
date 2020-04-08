package p004o;

import android.opengl.Matrix;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import p004o.C0786tf.C0790;

/* renamed from: o.䬦 */
final class C1508 {

    /* renamed from: Ą */
    C1341[] f7244;

    /* renamed from: ą */
    C1647[] f7245;

    /* renamed from: Ć */
    String[] f7246;

    /* renamed from: ȃ */
    FloatBuffer f7247;

    /* renamed from: ˮ͈ */
    FloatBuffer f7248;

    /* renamed from: 櫯 */
    FloatBuffer f7249;

    /* renamed from: 鷭 */
    String f7250;

    C1508() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4365(C0786tf tfVar) {
        int i = 0;
        for (C0790 r0 : tfVar.f4804) {
            i += r0.f4828.length * 3;
        }
        float[] fArr = new float[(i * 4)];
        float[] fArr2 = new float[(i * 4)];
        float[] fArr3 = new float[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < tfVar.f4804.length; i4++) {
            float[] fArr4 = new float[tfVar.f4804[i4].f4834.length];
            float[] fArr5 = new float[4];
            for (int i5 = 0; i5 < fArr4.length; i5 += 3) {
                fArr5[0] = tfVar.f4804[i4].f4834[i5 + 0];
                fArr5[1] = tfVar.f4804[i4].f4834[i5 + 1];
                fArr5[2] = tfVar.f4804[i4].f4834[i5 + 2];
                float[] fArr6 = fArr5;
                fArr4[i5 + 0] = fArr6[0];
                fArr4[i5 + 1] = fArr6[1];
                fArr4[i5 + 2] = fArr6[2];
            }
            for (int i6 = 0; i6 < tfVar.f4804[i4].f4828.length; i6++) {
                short s = tfVar.f4804[i4].f4828[i6].f4850;
                if (s >= 0) {
                    for (int i7 = 0; i7 < 3; i7++) {
                        short s2 = tfVar.f4804[i4].f4828[i6].f4852[i7];
                        fArr[i2 + 0] = fArr4[(s2 * 3) + 0];
                        fArr[i2 + 1] = fArr4[(s2 * 3) + 1];
                        fArr[i2 + 2] = fArr4[(s2 * 3) + 2];
                        fArr3[i2 / 4] = (float) i4;
                        i2 += 4;
                        short s3 = tfVar.f4804[i4].f4828[i6].f4851[i7];
                        fArr2[i3 + 0] = tfVar.f4804[i4].f4830[s3].f4844;
                        fArr2[i3 + 1] = tfVar.f4804[i4].f4830[s3].f4843;
                        fArr2[i3 + 2] = (float) s;
                        i3 += 4;
                    }
                }
            }
        }
        this.f7249 = FloatBuffer.wrap(fArr);
        this.f7249.position(0);
        this.f7248 = FloatBuffer.wrap(fArr3);
        this.f7248.position(0);
        this.f7247 = FloatBuffer.wrap(fArr2);
        this.f7247.position(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4364(C0441in inVar) {
        float[] array = this.f7249.array();
        float[] array2 = this.f7248.array();
        float[] array3 = this.f7247.array();
        this.f7248 = ByteBuffer.allocateDirect(array2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f7248.put(array2);
        this.f7248.position(0);
        int i = -1;
        C0442if ifVar = null;
        short s = C0595nv.f2860 ? (short) 1 : 0;
        for (int i2 = 0; i2 < array3.length; i2 += 4) {
            int i3 = (int) array3[i2 + 2];
            if (i3 != i) {
                i = i3;
                ifVar = (C0442if) inVar.f1316.get(this.f7246[i3]);
            }
            if (ifVar != null) {
                int i4 = i2 + 0;
                array3[i4] = array3[i4] * ((float) (ifVar.f1325 - s));
                int i5 = i2 + 1;
                array3[i5] = array3[i5] * ((float) (ifVar.f1326 - s));
                array3[i2 + 2] = (float) ifVar.f1330;
                array3[i2 + 3] = (float) ifVar.f1329;
                array[i2 + 3] = (float) ifVar.f1327;
            }
        }
        this.f7247 = ByteBuffer.allocateDirect(array3.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f7247.put(array3);
        this.f7247.position(0);
        this.f7249 = ByteBuffer.allocateDirect(array.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f7249.put(array);
        this.f7249.position(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4367(C0786tf tfVar, C0441in inVar) {
        this.f7246 = new String[tfVar.f4806.length];
        String[] strArr = new String[tfVar.f4806.length];
        String[] strArr2 = new String[tfVar.f4806.length];
        int i = 0;
        for (int i2 = 0; i2 < tfVar.f4806.length; i2++) {
            this.f7246[i2] = C0622ot.m741(tfVar.f4806[i2].f4823, C0618op.KOREAN);
            if (!(inVar.f1316.get(this.f7246[i2]) != null)) {
                strArr[i] = this.f7246[i2];
                strArr2[i] = "data\\texture\\" + this.f7246[i2];
                i++;
            }
        }
        if (i != 0) {
            String[] strArr3 = (String[]) Arrays.copyOf(strArr2, i);
            for (int i3 = 0; i3 < strArr3.length; i3++) {
                String str = strArr3[i3];
                byte[] bArr = (byte[]) C1014.f6158.f677.mo3613(str, false);
                if (bArr == null) {
                    String str2 = "Failed to load texture " + str;
                    Log.e("AndRO", str2);
                    throw new C0588no(str2);
                }
                C1621 r10 = C0596nw.m683(str, bArr);
                if (r10 == null) {
                    String str3 = "Failed to decode texture (" + str + ")";
                    Log.e("AndRO", str3);
                    throw new C0588no(str3);
                }
                C0441in inVar2 = inVar;
                C0441in inVar3 = inVar2;
                inVar3.mo3837(r10.f7548, r10.f7547, r10.f7546.x, r10.f7546.y, strArr[i3], null, inVar2.f1308);
            }
        }
    }

    /* renamed from: 鷭 */
    private static C1647 m2203(C0790 r6) {
        C1647 r3 = new C1647();
        r3.f7608 = new float[]{-999999.0f, -999999.0f, -999999.0f};
        r3.f7609 = new float[]{999999.0f, 999999.0f, 999999.0f};
        for (int i = 0; i < r6.f4834.length / 3; i++) {
            for (int i2 = 0; i2 < 3; i2++) {
                if (r3.f7608[i2] < r6.f4834[(i * 3) + i2]) {
                    r3.f7608[i2] = r6.f4834[(i * 3) + i2];
                }
                if (r3.f7609[i2] > r6.f4834[(i * 3) + i2]) {
                    r3.f7609[i2] = r6.f4834[(i * 3) + i2];
                }
            }
        }
        return r3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4366(C0786tf tfVar, int i, C1341 r17, int i2) {
        C1341 r2;
        if (i2 > 20) {
            throw new RuntimeException("Infinity loop in calc mesh transformation, rsm=" + C0622ot.m741(tfVar.f4809, C0618op.KOREAN));
        }
        C0790 r6 = tfVar.f4804[i];
        C1647 r7 = m2203(r6);
        this.f7245[i] = r7.clone();
        C1341 r1 = new C1341(Arrays.copyOf(r17.f6874, 16));
        Matrix.translateM(r1.f6874, 0, r6.f4825[0], r6.f4825[1], r6.f4825[2]);
        C1341 r11 = r1;
        float[] fArr = new float[16];
        float[] fArr2 = fArr;
        Matrix.multiplyMM(fArr2, 0, r11.f6874, 0, C1341.m2060(r6.f4826, r6.f4827[0], r6.f4827[1], r6.f4827[2]).f6874, 0);
        r11.f6874 = fArr;
        Matrix.scaleM(r1.f6874, 0, r6.f4832[0], r6.f4832[1], r6.f4832[2]);
        C1341 r8 = new C1341(Arrays.copyOf(r1.f6874, 16));
        if (!r6.f4833) {
            Matrix.translateM(r8.f6874, 0, r6.f4824[0], r6.f4824[1], r6.f4824[2]);
        }
        C1341 r112 = r8;
        float[] fArr3 = new float[16];
        float[] fArr4 = fArr3;
        Matrix.multiplyMM(fArr4, 0, r112.f6874, 0, C1341.m2061(r6.f4829).f6874, 0);
        r112.f6874 = fArr3;
        r7.f7609 = C1341.m2063(r7.f7609, r8);
        r7.f7608 = C1341.m2063(r7.f7608, r8);
        r7.mo4436();
        float f = -r7.f7606[0];
        float f2 = -r7.f7608[1];
        float f3 = -r7.f7606[2];
        C1341 r13 = new C1341();
        Matrix.setIdentityM(r13.f6874, 0);
        C1341 r12 = r13;
        float f4 = f2;
        Matrix.translateM(r13.f6874, 0, f, f4, f3);
        C1341 r72 = r12;
        if (i2 == 0) {
            r1 = C1341.m2062(r72, r1);
        }
        C1341[] r0 = this.f7244;
        C1341[] r14 = new C1341[3];
        r14[0] = r1;
        if (r6.f4833) {
            C1341 r9 = new C1341();
            Matrix.setIdentityM(r9.f6874, 0);
            r2 = r9;
        } else {
            float f5 = r6.f4824[0];
            float f6 = r6.f4824[1];
            float f7 = r6.f4824[2];
            C1341 r132 = new C1341();
            Matrix.setIdentityM(r132.f6874, 0);
            C1341 r122 = r132;
            float f8 = f6;
            Matrix.translateM(r132.f6874, 0, f5, f8, f7);
            r2 = r122;
        }
        r14[1] = r2;
        r14[2] = C1341.m2061(r6.f4829);
        r0[i] = C1341.m2062(r14);
        String r16 = C0622ot.m741(r6.f4838, C0618op.KOREAN);
        if (!r16.equals(C0622ot.m741(r6.f4835, C0618op.KOREAN))) {
            for (int i3 = 0; i3 < tfVar.f4804.length; i3++) {
                if (r16.equals(C0622ot.m741(tfVar.f4804[i3].f4835, C0618op.KOREAN))) {
                    int i4 = i2 + 1;
                    mo4366(tfVar, i3, r1, i4);
                    i2 = i4 - 1;
                }
            }
        }
    }
}
