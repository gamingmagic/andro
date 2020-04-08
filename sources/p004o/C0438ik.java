package p004o;

import com.roworkshop.andro.c_activity;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import p004o.C0776td.C0778.C0779;
import p004o.C0776td.C0784;

/* renamed from: o.ik */
final class C0438ik {

    /* renamed from: Ą */
    int f1296;

    /* renamed from: ą */
    int f1297;

    /* renamed from: Ć */
    int f1298;

    /* renamed from: ć */
    int f1299;

    /* renamed from: ȃ */
    C0441in f1300;

    /* renamed from: ˮ͈ */
    String[] f1301;

    /* renamed from: ˮ͍ */
    boolean f1302;

    /* renamed from: 櫯 */
    float f1303;

    /* renamed from: 鷭 */
    C0604od[] f1304;

    C0438ik() {
        this.f1300 = new C0441in(C0595nv.f2868 ? 1 : 2, 0, 0, false);
        this.f1302 = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final boolean mo3831(C0776td tdVar, C0441in inVar) {
        byte[] bArr;
        this.f1301 = new String[tdVar.f4744.f4770];
        int i = tdVar.f4744.f4770 > 0 ? 600 / tdVar.f4744.f4770 : 0;
        for (int i2 = 0; i2 < tdVar.f4744.f4770; i2++) {
            this.f1301[i2] = C0622ot.m741(tdVar.f4744.f4768[i2].f4772, C0618op.KOREAN);
            String str = "data\\texture\\" + this.f1301[i2];
            try {
                bArr = (byte[]) C1014.f6158.f677.mo3613(str, false);
            } catch (C0825tu unused) {
                bArr = (byte[]) C1014.f6158.f677.mo3613("data\\texture\\black.bmp", false);
            }
            C1621 r10 = C0596nw.m683(str, bArr);
            if (r10 == null) {
                throw new C0588no("Failed to decode texture " + i2 + "(" + str + ")");
            }
            C0441in inVar2 = inVar;
            inVar2.mo3837(r10.f7548, r10.f7547, r10.f7546.x, r10.f7546.y, this.f1301[i2], null, inVar2.f1308);
            int i3 = ((i * i2) / 100) + 45;
            c_activity c_activity = C1014.f6147;
            c_activity.mo3387((Runnable) new C1561(c_activity, i3));
        }
        return true;
    }

    /* renamed from: 鷭 */
    private final void m450(C0779 r5, FloatBuffer floatBuffer, ShortBuffer shortBuffer, FloatBuffer floatBuffer2, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, C1647 r13) {
        int position = floatBuffer.position() / 4;
        floatBuffer.put(fArr);
        floatBuffer.put(fArr2);
        floatBuffer.put(fArr3);
        floatBuffer.put(fArr4);
        r13.mo4438(fArr);
        r13.mo4438(fArr2);
        r13.mo4438(fArr3);
        r13.mo4438(fArr4);
        short[] sArr = new short[6];
        sArr[1] = 2;
        sArr[2] = 1;
        sArr[3] = 1;
        sArr[4] = 2;
        sArr[5] = 3;
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = (short) (sArr[i] + position);
        }
        shortBuffer.put(sArr);
        if (!this.f1302) {
            floatBuffer2.put(new float[]{r5.f4766, r5.f4755, (float) r5.f4763, 0.0f});
            floatBuffer2.put(new float[]{r5.f4765, r5.f4756, (float) r5.f4763, 0.0f});
            floatBuffer2.put(new float[]{r5.f4762, r5.f4757, (float) r5.f4763, 0.0f});
            floatBuffer2.put(new float[]{r5.f4760, r5.f4758, (float) r5.f4763, 0.0f});
            return;
        }
        floatBuffer2.put(new float[]{r5.f4765, r5.f4756, (float) r5.f4763, 0.0f});
        floatBuffer2.put(new float[]{r5.f4760, r5.f4758, (float) r5.f4763, 0.0f});
        floatBuffer2.put(new float[]{r5.f4766, r5.f4755, (float) r5.f4763, 0.0f});
        floatBuffer2.put(new float[]{r5.f4762, r5.f4757, (float) r5.f4763, 0.0f});
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final boolean mo3830(C0776td tdVar) {
        c_activity c_activity = C1014.f6147;
        c_activity.mo3387((Runnable) new C1561(c_activity, 51));
        this.f1303 = tdVar.f4745.f4746;
        this.f1296 = tdVar.f4745.f4749;
        this.f1297 = tdVar.f4745.f4748;
        int i = 0;
        for (int i2 = 0; i2 < this.f1297; i2++) {
            for (int i3 = 0; i3 < this.f1296; i3++) {
                if (tdVar.f4738[(this.f1296 * i2) + i3].f4782 >= 0) {
                    i++;
                }
                if (tdVar.f4738[(this.f1296 * i2) + i3].f4783 >= 0) {
                    i++;
                }
                if (tdVar.f4738[(this.f1296 * i2) + i3].f4784 >= 0) {
                    i++;
                }
            }
        }
        int i4 = i * 16;
        short[] sArr = new short[(i * 6)];
        float[] fArr = new float[(i * 16)];
        FloatBuffer wrap = FloatBuffer.wrap(new float[i4]);
        ShortBuffer wrap2 = ShortBuffer.wrap(sArr);
        FloatBuffer wrap3 = FloatBuffer.wrap(fArr);
        this.f1298 = (this.f1296 / 8) + (this.f1296 % 8 > 0 ? 1 : 0);
        this.f1299 = (this.f1297 / 8) + (this.f1297 % 8 > 0 ? 1 : 0);
        this.f1304 = new C0604od[(this.f1298 * this.f1299)];
        c_activity c_activity2 = C1014.f6147;
        c_activity2.mo3387((Runnable) new C1561(c_activity2, 52));
        int i5 = 1300 / this.f1299;
        for (int i6 = 0; i6 < this.f1299; i6++) {
            for (int i7 = 0; i7 < this.f1298; i7++) {
                wrap.position(0);
                wrap3.position(0);
                wrap2.position(0);
                int i8 = i7 * 8;
                int min = Math.min(i8 + 8, this.f1296);
                int i9 = i6 * 8;
                int min2 = Math.min(i9 + 8, this.f1297);
                C1647 r0 = new C1647();
                while (i9 < min2) {
                    for (int i10 = i8; i10 < min; i10++) {
                        C1647 r29 = r0;
                        FloatBuffer floatBuffer = wrap3;
                        ShortBuffer shortBuffer = wrap2;
                        FloatBuffer floatBuffer2 = wrap;
                        int i11 = i9;
                        int i12 = i10;
                        C0776td tdVar2 = tdVar;
                        int i13 = this.f1296;
                        int i14 = this.f1297;
                        C0784 r32 = tdVar2.f4738[(i11 * i13) + i12];
                        float f = (float) i12;
                        float f2 = (float) i11;
                        if (r32.f4782 >= 0) {
                            float[] fArr2 = {(-(f - ((float) (this.f1296 / 2)))) * this.f1303, -r32.f4789, (f2 - ((float) (this.f1297 / 2))) * this.f1303, 0.0f};
                            float[] fArr3 = {(-((f + 1.0f) - ((float) (this.f1296 / 2)))) * this.f1303, -r32.f4788, (f2 - ((float) (this.f1297 / 2))) * this.f1303, 0.0f};
                            float[] fArr4 = {(-(f - ((float) (this.f1296 / 2)))) * this.f1303, -r32.f4787, ((f2 + 1.0f) - ((float) (this.f1297 / 2))) * this.f1303, 0.0f};
                            m450(tdVar2.f4742.f4753[r32.f4782], floatBuffer2, shortBuffer, floatBuffer, fArr2, fArr3, fArr4, new float[]{(-((f + 1.0f) - ((float) (this.f1296 / 2)))) * this.f1303, -r32.f4786, ((f2 + 1.0f) - ((float) (this.f1297 / 2))) * this.f1303, 0.0f}, r29);
                        }
                        if (r32.f4784 >= 0 && i12 + 1 < i13) {
                            C0784 r35 = tdVar2.f4738[(i11 * i13) + i12 + 1];
                            float[] fArr5 = {(-((f + 1.0f) - ((float) (this.f1296 / 2)))) * this.f1303, -r32.f4788, (f2 - ((float) (this.f1297 / 2))) * this.f1303, 0.0f};
                            float[] fArr6 = {(-((f + 1.0f) - ((float) (this.f1296 / 2)))) * this.f1303, -r35.f4789, (f2 - ((float) (this.f1297 / 2))) * this.f1303, 0.0f};
                            float[] fArr7 = {(-((f + 1.0f) - ((float) (this.f1296 / 2)))) * this.f1303, -r32.f4786, ((f2 + 1.0f) - ((float) (this.f1297 / 2))) * this.f1303, 0.0f};
                            float[] fArr8 = {(-((f + 1.0f) - ((float) (this.f1296 / 2)))) * this.f1303, -r35.f4787, ((f2 + 1.0f) - ((float) (this.f1297 / 2))) * this.f1303, 0.0f};
                            this.f1302 = true;
                            m450(tdVar2.f4742.f4753[r32.f4784], floatBuffer2, shortBuffer, floatBuffer, fArr5, fArr6, fArr7, fArr8, r29);
                            this.f1302 = false;
                        }
                        if (r32.f4783 >= 0 && i11 + 1 < i14) {
                            C0784 r352 = tdVar2.f4738[((i11 + 1) * i13) + i12];
                            float[] fArr9 = {(-(f - ((float) (this.f1296 / 2)))) * this.f1303, -r32.f4787, ((f2 + 1.0f) - ((float) (this.f1297 / 2))) * this.f1303, 0.0f};
                            float[] fArr10 = {(-((f + 1.0f) - ((float) (this.f1296 / 2)))) * this.f1303, -r32.f4786, ((f2 + 1.0f) - ((float) (this.f1297 / 2))) * this.f1303, 0.0f};
                            float[] fArr11 = {(-(f - ((float) (this.f1296 / 2)))) * this.f1303, -r352.f4789, ((f2 + 1.0f) - ((float) (this.f1297 / 2))) * this.f1303, 0.0f};
                            m450(tdVar2.f4742.f4753[r32.f4783], floatBuffer2, shortBuffer, floatBuffer, fArr9, fArr10, fArr11, new float[]{(-((f + 1.0f) - ((float) (this.f1296 / 2)))) * this.f1303, -r352.f4788, ((f2 + 1.0f) - ((float) (this.f1297 / 2))) * this.f1303, 0.0f}, r29);
                        }
                    }
                    i9++;
                }
                r0.mo4436();
                this.f1304[(this.f1298 * i6) + i7] = new C0604od();
                this.f1304[(this.f1298 * i6) + i7].f2970 = FloatBuffer.wrap(Arrays.copyOf(wrap.array(), wrap.position()));
                this.f1304[(this.f1298 * i6) + i7].f2968 = ShortBuffer.wrap(Arrays.copyOf(wrap2.array(), wrap2.position()));
                this.f1304[(this.f1298 * i6) + i7].f2969 = FloatBuffer.wrap(Arrays.copyOf(wrap3.array(), wrap3.position()));
                this.f1304[(this.f1298 * i6) + i7].f2967 = r0;
            }
            int i15 = i6;
            c_activity c_activity3 = C1014.f6147;
            c_activity3.mo3387((Runnable) new C1561(c_activity3, ((i5 * i15) / 100) + 51));
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3829() {
        C0604od[] odVarArr;
        short s = C0595nv.f2860 ? (short) 1 : 0;
        for (C0604od odVar : this.f1304) {
            float[] array = odVar.f2969.array();
            float[] array2 = odVar.f2970.array();
            for (int i = 0; i < array.length; i += 4) {
                C0442if ifVar = (C0442if) this.f1300.f1316.get(this.f1301[(int) array[i + 2]]);
                int i2 = i + 0;
                array[i2] = array[i2] * ((float) (ifVar.f1325 - s));
                int i3 = i + 1;
                array[i3] = array[i3] * ((float) (ifVar.f1326 - s));
                array[i + 2] = (float) ifVar.f1330;
                array[i + 3] = (float) ifVar.f1329;
                array2[i + 3] = (float) ifVar.f1327;
            }
            odVar.f2969 = ByteBuffer.allocateDirect(array.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            odVar.f2969.put(array);
            odVar.f2969.position(0);
            odVar.f2970 = ByteBuffer.allocateDirect(array2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            odVar.f2970.put(array2);
            odVar.f2970.position(0);
        }
    }
}
