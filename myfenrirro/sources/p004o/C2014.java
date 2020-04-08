package p004o;

import android.opengl.Matrix;
import android.util.Log;
import java.nio.BufferUnderflowException;
import p004o.C0794tg.C0798;

/* renamed from: o.쭅 */
final class C2014 {

    /* renamed from: ˮ͈ */
    C1647 f8908 = new C1647();

    /* renamed from: 櫯 */
    float[] f8909;

    /* renamed from: 鷭 */
    C1508 f8910;

    C2014() {
    }

    /* renamed from: 鷭 */
    private static C1341 m2684(C0798 r12) {
        float f = r12.f4888[0];
        float f2 = r12.f4888[1];
        float f3 = r12.f4888[2];
        C1341 r11 = new C1341();
        Matrix.setIdentityM(r11.f6874, 0);
        Matrix.scaleM(r11.f6874, 0, f, f2, f3);
        C1341 r6 = r11;
        C1341 r8 = new C1341();
        Matrix.setIdentityM(r8.f6874, 0);
        C1341 r0 = r8;
        float f4 = (r12.f4885[0] / 180.0f) * 3.1415927f;
        float f5 = (r12.f4885[1] / 180.0f) * 3.1415927f;
        C1341 r82 = r0;
        r0.mo4307((r12.f4885[2] / 180.0f) * 3.1415927f);
        r82.mo4309(f4);
        r82.mo4308(f5);
        C1341 r7 = r82;
        float f6 = r12.f4884[0];
        float f7 = r12.f4884[1];
        float f8 = r12.f4884[2];
        C1341 r112 = new C1341();
        Matrix.setIdentityM(r112.f6874, 0);
        Matrix.translateM(r112.f6874, 0, f6, f7, f8);
        C1341 r122 = r112;
        C1341 r113 = new C1341();
        Matrix.setIdentityM(r113.f6874, 0);
        Matrix.scaleM(r113.f6874, 0, -1.0f, -1.0f, 1.0f);
        C1341[] r83 = {r113, r122, r7, r6};
        C1341 r114 = new C1341();
        Matrix.setIdentityM(r114.f6874, 0);
        C1341 r9 = r114;
        for (C1341 r02 : r83) {
            C1341 r123 = r9;
            float[] fArr = new float[16];
            Matrix.multiplyMM(fArr, 0, r123.f6874, 0, r02.f6874, 0);
            r123.f6874 = fArr;
        }
        return r9;
    }

    /* renamed from: 鷭 */
    static C2014 m2685(C1508 r18, C0798 r19) {
        C2014 r6 = new C2014();
        r6.f8910 = r18;
        r6.f8909 = new float[(r18.f7244.length * 16)];
        C2014 r7 = r6;
        C1341 r8 = m2684(r19);
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f};
        float[] fArr2 = new float[4];
        for (int i = 0; i < r7.f8910.f7244.length; i++) {
            C1341[] r12 = {r8, r7.f8910.f7244[i]};
            C1341 r15 = new C1341();
            Matrix.setIdentityM(r15.f6874, 0);
            C1341 r13 = r15;
            for (C1341 r0 : r12) {
                C1341 r152 = r13;
                float[] fArr3 = new float[16];
                Matrix.multiplyMM(fArr3, 0, r152.f6874, 0, r0.f6874, 0);
                r152.f6874 = fArr3;
            }
            C1341 r122 = r13;
            C1647 r132 = new C1647();
            float[] array = r7.f8910.f7249.array();
            float[] array2 = r7.f8910.f7248.array();
            int i2 = 0;
            while (i2 < array.length) {
                try {
                    if (array2[i2 / 4] == ((float) i)) {
                        fArr[0] = array[i2];
                        fArr[1] = array[i2 + 1];
                        fArr[2] = array[i2 + 2];
                        Matrix.multiplyMV(fArr2, 0, r122.f6874, 0, fArr, 0);
                        r132.mo4438(fArr2);
                    }
                    i2 += 4;
                } catch (BufferUnderflowException e) {
                    String bufferUnderflowException = e.toString();
                    Log.e("AndRO", bufferUnderflowException);
                    throw new C0588no(bufferUnderflowException);
                }
            }
            r132.mo4436();
            C1647 r123 = r7.f8908;
            for (int i3 = 0; i3 < 3; i3++) {
                if (r123.f7609[i3] > r132.f7609[i3]) {
                    r123.f7609[i3] = r132.f7609[i3];
                }
                if (r123.f7608[i3] < r132.f7608[i3]) {
                    r123.f7608[i3] = r132.f7608[i3];
                }
            }
        }
        r7.f8908.mo4436();
        C1341 r192 = m2684(r19);
        for (int i4 = 0; i4 < r18.f7244.length; i4++) {
            C1341[] r124 = {r192, r6.f8910.f7244[i4]};
            C1341 r153 = new C1341();
            Matrix.setIdentityM(r153.f6874, 0);
            C1341 r133 = r153;
            for (C1341 r02 : r124) {
                C1341 r154 = r133;
                float[] fArr4 = new float[16];
                Matrix.multiplyMM(fArr4, 0, r154.f6874, 0, r02.f6874, 0);
                r154.f6874 = fArr4;
            }
            System.arraycopy(r133.f6874, 0, r6.f8909, i4 * 16, 16);
        }
        return r6;
    }
}
