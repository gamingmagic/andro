package p004o;

import android.util.Log;
import com.roworkshop.andro.c_activity;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import p004o.C0776td.C0784;
import p004o.C0794tg.C0800;

/* renamed from: o.ln */
final class C0530ln {

    /* renamed from: ˮ͈ */
    C0604od[] f1665;

    /* renamed from: 櫯 */
    float[] f1666;

    /* renamed from: 鷭 */
    String[] f1667;

    /* renamed from: 鷭 */
    private static int[] m588(C0776td tdVar, float f) {
        int[] iArr = new int[(tdVar.f4745.f4749 * tdVar.f4745.f4748)];
        int i = 0;
        for (int i2 = 0; i2 < tdVar.f4738.length; i2++) {
            C0784 r5 = tdVar.f4738[i2];
            if ((-f) > (-r5.f4789) || (-f) > (-r5.f4788) || (-f) > (-r5.f4787) || (-f) > (-r5.f4786)) {
                int i3 = i;
                i++;
                iArr[i3] = i2;
            }
        }
        return Arrays.copyOf(iArr, i);
    }

    /* renamed from: 鷭 */
    private void m587(C0438ik ikVar, int[] iArr, int i, float f) {
        c_activity c_activity = C1014.f6147;
        c_activity.mo3387((Runnable) new C1561(c_activity, 69));
        short[] sArr = new short[(iArr.length * 6)];
        float[] fArr = new float[(iArr.length * 16)];
        FloatBuffer wrap = FloatBuffer.wrap(new float[(iArr.length * 16)]);
        ShortBuffer wrap2 = ShortBuffer.wrap(sArr);
        FloatBuffer wrap3 = FloatBuffer.wrap(fArr);
        int i2 = ikVar.f1298;
        this.f1665 = new C0604od[(i2 * ikVar.f1299)];
        int i3 = 0;
        int length = 500 / this.f1665.length;
        for (int i4 = 0; i4 < this.f1665.length; i4++) {
            wrap.position(0);
            wrap2.position(0);
            wrap3.position(0);
            C1647 r10 = new C1647();
            int i5 = i4 % i2;
            int i6 = i4 / i2;
            int i7 = i5 * 8;
            int i8 = ((i5 + 1) * 8) - 1;
            int i9 = i6 * 8;
            int i10 = ((i6 + 1) * 8) - 1;
            for (int i11 : iArr) {
                int i12 = i11 % i;
                int i13 = i11 / i;
                if (i12 >= i7 && i12 <= i8 && i13 >= i9 && i13 <= i10) {
                    int position = wrap.position() / 4;
                    C0438ik ikVar2 = ikVar;
                    C0438ik ikVar3 = ikVar;
                    float[] fArr2 = {(-(((float) i12) - ((float) (ikVar2.f1296 / 2)))) * ikVar2.f1303, -f, (((float) i13) - ((float) (ikVar3.f1297 / 2))) * ikVar3.f1303, 0.0f};
                    C0438ik ikVar4 = ikVar;
                    C0438ik ikVar5 = ikVar;
                    float[] fArr3 = {(-(((float) (i12 + 1)) - ((float) (ikVar4.f1296 / 2)))) * ikVar4.f1303, -f, (((float) i13) - ((float) (ikVar5.f1297 / 2))) * ikVar5.f1303, 0.0f};
                    C0438ik ikVar6 = ikVar;
                    C0438ik ikVar7 = ikVar;
                    float[] fArr4 = {(-(((float) i12) - ((float) (ikVar6.f1296 / 2)))) * ikVar6.f1303, -f, (((float) (i13 + 1)) - ((float) (ikVar7.f1297 / 2))) * ikVar7.f1303, 0.0f};
                    C0438ik ikVar8 = ikVar;
                    C0438ik ikVar9 = ikVar;
                    float[] fArr5 = {(-(((float) (i12 + 1)) - ((float) (ikVar8.f1296 / 2)))) * ikVar8.f1303, -f, (((float) (i13 + 1)) - ((float) (ikVar9.f1297 / 2))) * ikVar9.f1303, 0.0f};
                    short[] sArr2 = {(short) (position + 0), (short) (position + 2), (short) (position + 1), (short) (position + 1), (short) (position + 2), (short) (position + 3)};
                    wrap.put(fArr2);
                    wrap.put(fArr3);
                    wrap.put(fArr4);
                    wrap.put(fArr5);
                    r10.mo4438(fArr2);
                    r10.mo4438(fArr3);
                    r10.mo4438(fArr4);
                    r10.mo4438(fArr5);
                    wrap2.put(sArr2);
                    float f2 = 0.25f * ((float) (i12 % 4));
                    float f3 = f2 + 0.25f;
                    float f4 = 0.25f * ((float) (i13 % 4));
                    float f5 = f4 + 0.25f;
                    wrap3.put(new float[]{f2, f4, 0.0f, 0.0f, f3, f4, 0.0f, 0.0f, f2, f5, 0.0f, 0.0f, f3, f5, 0.0f, 0.0f});
                }
            }
            r10.mo4436();
            if (wrap.position() != 0) {
                this.f1665[i3] = new C0604od();
                this.f1665[i3].f2970 = FloatBuffer.wrap(Arrays.copyOf(wrap.array(), wrap.position()));
                this.f1665[i3].f2968 = ShortBuffer.wrap(Arrays.copyOf(wrap2.array(), wrap2.position()));
                this.f1665[i3].f2969 = FloatBuffer.wrap(Arrays.copyOf(wrap3.array(), wrap3.position()));
                this.f1665[i3].f2967 = r10;
                i3++;
                c_activity c_activity2 = C1014.f6147;
                c_activity2.mo3387((Runnable) new C1561(c_activity2, ((length * i4) / 100) + 69));
            }
        }
        this.f1665 = (C0604od[]) Arrays.copyOf(this.f1665, i3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3972(C0441in inVar) {
        C0604od[] odVarArr;
        short s = C0595nv.f2860 ? (short) 1 : 0;
        for (C0604od odVar : this.f1665) {
            float[] array = odVar.f2969.array();
            float[] array2 = odVar.f2970.array();
            for (int i = 0; i < array.length; i += 4) {
                C0442if ifVar = (C0442if) inVar.f1316.get(this.f1667[(int) array[i + 2]]);
                int i2 = i + 0;
                array[i2] = array[i2] * ((float) (ifVar.f1325 - s));
                int i3 = i + 1;
                array[i3] = array[i3] * ((float) (ifVar.f1326 - s));
            }
            odVar.f2969 = ByteBuffer.allocateDirect(odVar.f2969.capacity() * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            odVar.f2969.put(array);
            odVar.f2969.position(0);
            odVar.f2970 = ByteBuffer.allocateDirect(odVar.f2970.capacity() * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            odVar.f2970.put(array2);
            odVar.f2970.position(0);
            odVar.f2968.position(0);
        }
    }

    /* renamed from: 鷭 */
    private void m586(C0438ik ikVar, C0776td tdVar, C0800 r21, C0441in inVar, boolean z) {
        c_activity c_activity = C1014.f6147;
        c_activity.mo3387((Runnable) new C1561(c_activity, 65));
        C0441in inVar2 = inVar;
        String str = "data\\texture\\" + C1014.f6158.f674.f623.f7904.f7927 + "\\water" + r21.f4902;
        c_activity c_activity2 = C1014.f6147;
        c_activity2.mo3387((Runnable) new C1561(c_activity2, 66));
        this.f1667 = new String[32];
        int length = 400 / this.f1667.length;
        for (int i = 0; i < this.f1667.length; i++) {
            this.f1667[i] = String.format("%1$s%2$02d.jpg", new Object[]{str, Integer.valueOf(i)});
            byte[] bArr = (byte[]) C1014.f6158.f677.mo3613(this.f1667[i], false);
            if (bArr == null) {
                String str2 = "File not found: " + this.f1667[i];
                Log.e("AndRO", str2);
                throw new C0588no(str2);
            }
            C1621 r12 = C0596nw.m683(this.f1667[i], bArr);
            C0441in inVar3 = inVar2;
            inVar3.mo3837(r12.f7548, r12.f7547, r12.f7546.x, r12.f7546.y, this.f1667[i], null, inVar3.f1308);
            c_activity c_activity3 = C1014.f6147;
            c_activity3.mo3387((Runnable) new C1561(c_activity3, ((length * i) / 100) + 66));
        }
        if (!z) {
            int[] r22 = m588(tdVar, r21.f4903);
            if (r22.length == 0) {
                c_activity c_activity4 = C1014.f6147;
                c_activity4.mo3387((Runnable) new C1561(c_activity4, 75));
                return;
            }
            m587(ikVar, r22, tdVar.f4745.f4749, r21.f4903);
        }
    }

    C0530ln(C0438ik ikVar, C0776td tdVar, C0800 r9, C0441in inVar, int i, int i2, boolean z) {
        m586(ikVar, tdVar, r9, inVar, z);
    }
}
