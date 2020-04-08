package p004o;

import android.opengl.Matrix;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import p004o.C0766tb.C0767if;
import p004o.C0766tb.C0768;
import p004o.C0766tb.C0768.C0769;
import p004o.C0766tb.C0768.C0769.C0770if;
import p004o.C0766tb.C0768.C0769.C0771;

/* renamed from: o.hl */
class C0408hl {

    /* renamed from: ċ */
    C0405hk[] f1165;

    /* renamed from: Ȋ */
    C0405hk f1166;

    /* renamed from: 䒧 */
    C0405hk[] f1167;

    /* renamed from: 纫 */
    C0409[] f1168;

    /* renamed from: 躆 */
    String[] f1169;

    /* renamed from: o.hl$鷭 */
    class C0409 {

        /* renamed from: 鷭 */
        C0410[] f1171;

        /* renamed from: o.hl$鷭$鷭 */
        class C0410 {

            /* renamed from: Ą */
            ArrayList<C0601oa> f1172;

            /* renamed from: ą */
            String[] f1173;

            /* renamed from: ȃ */
            FloatBuffer f1175;

            /* renamed from: ˮ͈ */
            FloatBuffer f1176;

            /* renamed from: 櫯 */
            ShortBuffer f1177;

            /* renamed from: 鷭 */
            ByteBuffer f1178;

            /* synthetic */ C0410(C0409 r1, C0405hk[] hkVarArr, int i, int i2, C0405hk[] hkVarArr2, String[] strArr, C0410 r7) {
                this(hkVarArr, i, i2, hkVarArr2, strArr);
            }

            private C0410(C0405hk[] hkVarArr, int i, int i2, C0405hk[] hkVarArr2, String[] strArr) {
                this.f1172 = new ArrayList<>();
                this.f1173 = new String[hkVarArr.length];
                int i3 = 0;
                C0405hk[] hkVarArr3 = hkVarArr;
                int length = hkVarArr.length;
                for (int i4 = 0; i4 < length; i4++) {
                    C0405hk hkVar = hkVarArr3[i4];
                    if (hkVar != null) {
                        int i5 = i;
                        int i6 = i2;
                        if (i >= hkVar.f1148.f4682.length) {
                            i5 = 0;
                        }
                        C0768 r17 = hkVar.f1148.f4682[i5];
                        if (r17.f4692.length > 0) {
                            if (i2 >= r17.f4692.length) {
                                i6 = 0;
                            }
                            C0769 r18 = r17.f4692[i6];
                            if (r18.f4694 >= 0 && r18.f4694 < hkVar.f1148.f4683.length) {
                                String r19 = C0622ot.m741(hkVar.f1148.f4683[r18.f4694].f4689, C0618op.KOREAN);
                                if (r19.contains("worm_tail_damage.wav")) {
                                    r18.f4694 = -1;
                                } else {
                                    if (r19.equals("atk")) {
                                        C0767if[] ifVarArr = hkVar.f1148.f4683;
                                        int length2 = ifVarArr.length;
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 >= length2) {
                                                break;
                                            }
                                            String r24 = C0622ot.m741(ifVarArr[i7].f4689, C0618op.KOREAN);
                                            if (r24.endsWith("_attack.wav")) {
                                                r19 = r24;
                                                break;
                                            }
                                            i7++;
                                        }
                                    }
                                    if (r19.equals("atk")) {
                                        r18.f4694 = -1;
                                    } else {
                                        int i8 = i3;
                                        i3++;
                                        this.f1173[i8] = r19;
                                        if (!C1014.f6136.f7599.containsKey(r19)) {
                                            C1014.f6158.mo3387((Runnable) new C0411hm(this, r19, hkVar));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.f1173 = (String[]) Arrays.copyOf(this.f1173, i3);
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                C0405hk[] hkVarArr4 = hkVarArr;
                int length3 = hkVarArr.length;
                for (int i12 = 0; i12 < length3; i12++) {
                    C0405hk hkVar2 = hkVarArr4[i12];
                    if (hkVar2 != null) {
                        int i13 = i;
                        if (i >= hkVar2.f1148.f4682.length) {
                            i13 = 0;
                        }
                        i11 = Math.max(i11, hkVar2.f1148.f4682[i13].f4692.length);
                    }
                }
                C0405hk[] hkVarArr5 = hkVarArr;
                int length4 = hkVarArr.length;
                for (int i14 = 0; i14 < length4; i14++) {
                    C0405hk hkVar3 = hkVarArr5[i14];
                    if (hkVar3 != null) {
                        int i15 = i;
                        int i16 = i2;
                        if (i >= hkVar3.f1148.f4682.length) {
                            i15 = 0;
                        }
                        C0768 r20 = hkVar3.f1148.f4682[i15];
                        if (r20.f4692.length != i11) {
                            i16 = (i2 * r20.f4692.length) / i11;
                        }
                        if (i16 < r20.f4692.length) {
                            C0769 r21 = r20.f4692[i16];
                            i9 += r21.f4697.length * 4;
                            i10 += r21.f4697.length * 6;
                        }
                    }
                }
                FloatBuffer wrap = FloatBuffer.wrap(new float[(i9 * 4)]);
                ShortBuffer wrap2 = ShortBuffer.wrap(new short[i10]);
                FloatBuffer wrap3 = FloatBuffer.wrap(new float[(i9 * 4)]);
                ByteBuffer wrap4 = ByteBuffer.wrap(new byte[(i9 * 4)]);
                C0405hk[] hkVarArr6 = hkVarArr;
                int length5 = hkVarArr.length;
                for (int i17 = 0; i17 < length5; i17++) {
                    C0405hk hkVar4 = hkVarArr6[i17];
                    if (hkVar4 != null) {
                        int i18 = i;
                        int i19 = i2;
                        if (i >= hkVar4.f1148.f4682.length) {
                            i18 = 0;
                        }
                        C0768 r242 = hkVar4.f1148.f4682[i18];
                        if (r242.f4692.length != i11) {
                            i19 = (i2 * r242.f4692.length) / i11;
                        }
                        if (i19 < r242.f4692.length) {
                            C0769 r26 = r242.f4692[i19];
                            for (int i20 = 0; i20 < r26.f4697.length; i20++) {
                                if (r26.f4697[i20].f4708 != -1) {
                                    m409(hkVar4, i18, i19, i20, wrap, wrap3, wrap4, wrap2, hkVarArr2, strArr);
                                }
                            }
                        }
                    }
                }
                try {
                    this.f1176 = ByteBuffer.allocateDirect(wrap.position() * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                    this.f1176.put(wrap.array(), 0, wrap.position());
                    this.f1176.position(0);
                    this.f1175 = ByteBuffer.allocateDirect(wrap3.position() * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                    this.f1175.put(wrap3.array(), 0, wrap3.position());
                    this.f1175.position(0);
                    this.f1178 = ByteBuffer.allocateDirect(wrap4.position()).order(ByteOrder.nativeOrder());
                    this.f1178.put(wrap4.array(), 0, wrap4.position());
                    this.f1178.position(0);
                    this.f1177 = ByteBuffer.allocateDirect(wrap2.position() * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
                    this.f1177.put(wrap2.array(), 0, wrap2.position());
                    this.f1177.position(0);
                } catch (IllegalArgumentException e) {
                    throw new C0588no(e, "tmp_vb.position()=" + wrap.position());
                }
            }

            /* renamed from: 鷭 */
            private void m409(C0405hk hkVar, int i, int i2, int i3, FloatBuffer floatBuffer, FloatBuffer floatBuffer2, ByteBuffer byteBuffer, ShortBuffer shortBuffer, C0405hk[] hkVarArr, String[] strArr) {
                C0405hk hkVar2 = C0408hl.this.f1166;
                C0768 r7 = hkVar.f1148.f4682[i];
                C0769 r8 = r7.f4692[i2];
                C0770if ifVar = r8.f4697[i3];
                C0407 r9 = ifVar.f4709 > 0 ? hkVar.f1145[ifVar.f4708] : hkVar.f1144[ifVar.f4708];
                C0526lj ljVar = new C0526lj(0.0f, (float) r9.f1158, 0.0f);
                C0526lj ljVar2 = new C0526lj(0.0f, 0.0f, 0.0f);
                C0526lj ljVar3 = new C0526lj((float) r9.f1157, (float) r9.f1158, 0.0f);
                C0526lj ljVar4 = new C0526lj((float) r9.f1157, 0.0f, 0.0f);
                C0526lj[] ljVarArr = {ljVar, ljVar2, ljVar3, ljVar4};
                C0526lj[] ljVarArr2 = ljVarArr;
                int length = ljVarArr.length;
                for (int i4 = 0; i4 < length; i4++) {
                    C0526lj ljVar5 = ljVarArr[i4];
                    ljVar5.f1652 = (float) (((double) ljVar5.f1652) - Math.ceil(((double) r9.f1157) / 2.0d));
                    ljVar5.f1651 = (float) (((double) ljVar5.f1651) - Math.ceil(((double) r9.f1158) / 2.0d));
                }
                C0526lj[] ljVarArr3 = ljVarArr2;
                int length2 = ljVarArr2.length;
                for (int i5 = 0; i5 < length2; i5++) {
                    C0526lj ljVar6 = ljVarArr3[i5];
                    ljVar6.f1652 *= ifVar.f4702;
                    ljVar6.f1651 *= ifVar.f4703;
                }
                if (ifVar.f4704 != 0) {
                    C1341 r15 = C1341.m2060((((float) ifVar.f4704) / 180.0f) * 3.1415927f, 0.0f, 0.0f, 1.0f);
                    C0526lj[] ljVarArr4 = ljVarArr2;
                    int length3 = ljVarArr2.length;
                    for (int i6 = 0; i6 < length3; i6++) {
                        C0526lj ljVar7 = ljVarArr4[i6];
                        float[] fArr = new float[4];
                        Matrix.multiplyMV(fArr, 0, r15.f6874, 0, new float[]{ljVar7.f1652, ljVar7.f1651, ljVar7.f1650, 1.0f}, 0);
                        ljVar7.f1652 = fArr[0];
                        ljVar7.f1651 = fArr[1];
                        ljVar7.f1650 = fArr[2];
                    }
                }
                C0526lj[] ljVarArr5 = ljVarArr2;
                int length4 = ljVarArr2.length;
                for (int i7 = 0; i7 < length4; i7++) {
                    C0526lj ljVar8 = ljVarArr5[i7];
                    ljVar8.f1652 += (float) ifVar.f4713;
                    ljVar8.f1651 += (float) ifVar.f4711;
                }
                if (!(hkVar2 == null || hkVar == hkVar2 || r8.f4695 == null)) {
                    int i8 = i;
                    int i9 = i2;
                    C0769 r26 = r8;
                    C0768 r25 = r7;
                    C0405hk hkVar3 = hkVar2;
                    C0526lj[] ljVarArr6 = ljVarArr2;
                    if (!(hkVar3 == null || hkVar3.f1148 == null || hkVar3.f1148.f4682 == null || r26.f4695 == null || r26.f4695.length <= 0)) {
                        int min = Math.min(i8, hkVar3.f1148.f4682.length - 1);
                        if (!(hkVar3.f1148.f4682[min] == null || hkVar3.f1148.f4682[min].f4692 == null)) {
                            C0768 r6 = hkVar3.f1148.f4682[min];
                            C0769 r252 = r6.f4692[(i9 * r6.f4692.length) / r25.f4692.length];
                            if (!(r252 == null || r252.f4695 == null || r252.f4695.length <= 0)) {
                                C0526lj[] ljVarArr7 = ljVarArr6;
                                int length5 = ljVarArr6.length;
                                for (int i10 = 0; i10 < length5; i10++) {
                                    C0526lj ljVar9 = ljVarArr7[i10];
                                    ljVar9.f1652 += (float) r252.f4695[0].f4717;
                                    ljVar9.f1651 += (float) r252.f4695[0].f4716;
                                    ljVar9.f1652 -= (float) r26.f4695[0].f4717;
                                    ljVar9.f1651 -= (float) r26.f4695[0].f4716;
                                }
                            }
                        }
                    }
                }
                short position = (short) (floatBuffer.position() / 4);
                if (position < 0) {
                    String str = "Index buffer too large";
                    Log.e("AndRO", str);
                    throw new C0588no(str);
                }
                short[] sArr = {(short) (position + 0), (short) (position + 1), (short) (position + 2), (short) (position + 2), (short) (position + 1), (short) (position + 3)};
                float f = 0.05f * ((float) position);
                float[] fArr2 = {ljVar.f1652, -ljVar.f1651, -f, 0.0f, ljVar2.f1652, -ljVar2.f1651, -f, 0.0f, ljVar3.f1652, -ljVar3.f1651, -f, 0.0f, ljVar4.f1652, -ljVar4.f1651, -f, 0.0f};
                float[] fArr3 = ifVar.f4706 == 1 ? new float[]{(float) r9.f1157, (float) r9.f1158, 0.0f, 0.0f, (float) r9.f1157, 0.0f, 0.0f, 0.0f, 0.0f, (float) r9.f1158, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f} : new float[]{0.0f, (float) r9.f1158, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (float) r9.f1157, (float) r9.f1158, 0.0f, 0.0f, (float) r9.f1157, 0.0f, 0.0f, 0.0f};
                String str2 = null;
                if (hkVarArr != null && strArr != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < hkVarArr.length) {
                            if (hkVarArr[i11] == hkVar && strArr[i11] != null) {
                                str2 = strArr[i11];
                                break;
                            }
                            i11++;
                        } else {
                            break;
                        }
                    }
                }
                C0615om omVar = new C0615om();
                int i12 = ifVar.f4701;
                omVar.f3002 = (byte) ((i12 >> 24) & 255);
                omVar.f3005 = (byte) ((i12 >> 16) & 255);
                omVar.f3004 = (byte) ((i12 >> 8) & 255);
                omVar.f3003 = (byte) ((i12 >> 0) & 255);
                C0615om omVar2 = omVar;
                byte[] bArr = {omVar2.f3005, omVar2.f3004, omVar2.f3003, omVar2.f3002, omVar2.f3005, omVar2.f3004, omVar2.f3003, omVar2.f3002, omVar2.f3005, omVar2.f3004, omVar2.f3003, omVar2.f3002, omVar2.f3005, omVar2.f3004, omVar2.f3003, omVar2.f3002};
                floatBuffer.put(fArr2);
                floatBuffer2.put(fArr3);
                byteBuffer.put(bArr);
                shortBuffer.put(sArr);
                this.f1172.add(new C0601oa(r9, (C0253if) C0252cp.f651.get(str2)));
            }
        }

        C0409(C0405hk[] hkVarArr, int i, C0405hk[] hkVarArr2, String[] strArr) {
            int i2 = 0;
            C0405hk[] hkVarArr3 = hkVarArr;
            int length = hkVarArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                C0405hk hkVar = hkVarArr3[i3];
                if (hkVar != null) {
                    int i4 = i;
                    if (i >= hkVar.f1148.f4682.length) {
                        i4 = 0;
                    }
                    i2 = Math.max(hkVar.f1148.f4682[i4].f4692.length, i2);
                }
            }
            this.f1171 = new C0410[Math.max(1, i2)];
            for (int i5 = 0; i5 < this.f1171.length; i5++) {
                this.f1171[i5] = new C0410(this, hkVarArr, i, i5, hkVarArr2, strArr, null);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        C0405hk[] hkVarArr;
        if (this.f1165 != null) {
            for (C0405hk hkVar : this.f1165) {
                if (hkVar != null) {
                    hkVar.mo3601();
                }
            }
        }
        this.f1165 = null;
    }

    protected C0408hl() {
    }

    C0408hl(C0405hk hkVar, C0405hk[] hkVarArr) {
        mo3786(hkVar, hkVarArr);
    }

    C0408hl(C0405hk hkVar) {
        mo3786(hkVar, (C0405hk[]) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public final void mo3786(C0405hk hkVar, C0405hk[] hkVarArr) {
        this.f1166 = hkVar;
        if (hkVarArr != null) {
            this.f1165 = hkVarArr;
        } else {
            this.f1165 = new C0405hk[]{hkVar};
        }
        m403();
    }

    /* renamed from: 鷭 */
    private void m403() {
        C0405hk[] hkVarArr;
        int i = 0;
        for (C0405hk hkVar : this.f1165) {
            if (!(hkVar == null || hkVar.f1148 == null)) {
                i = Math.max(hkVar.f1148.f4682.length, i);
            }
        }
        if (i == 0) {
            i = 1;
        }
        this.f1168 = new C0409[i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public void mo3785(int i) {
        if (this.f1168[i] == null) {
            this.f1168[i] = new C0409(this.f1165, i, this.f1167, this.f1169);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final C0410 mo3784(int i, int i2) {
        int i3 = i;
        if (i3 >= this.f1168.length) {
            i3 = 0;
        }
        if (this.f1168[i3] == null) {
            mo3785(i3);
        }
        C0409 r4 = this.f1168[i3];
        return r4.f1171[i2 % r4.f1171.length];
    }

    /* renamed from: 鷭 */
    private static void m404(C0405hk hkVar, int i, int i2, C0405hk hkVar2, int[] iArr, int[] iArr2, int i3, int i4, int i5) {
        C0770if[] ifVarArr;
        C0769 r8 = hkVar.f1148.f4682[i].f4692[i2];
        for (C0770if ifVar : r8.f4697) {
            if (ifVar.f4708 != -1) {
                C0407 r13 = ifVar.f4709 > 0 ? hkVar.f1145[ifVar.f4708] : hkVar.f1144[ifVar.f4708];
                if (r13 != null) {
                    byte[] bArr = r13.f1164;
                    int[] iArr3 = new int[256];
                    int[] iArr4 = iArr;
                    if (iArr == null) {
                        iArr4 = r13.f1162;
                    }
                    if (iArr4 == null) {
                        iArr4 = hkVar.f1146;
                    }
                    for (int i6 = 0; i6 < 256; i6++) {
                        int i7 = iArr4[i6];
                        iArr3[i6] = (i7 & -16711936) | ((i7 & 16711680) >> 16) | ((i7 & 255) << 16);
                    }
                    int[] iArr5 = new int[bArr.length];
                    for (int i8 = 0; i8 < bArr.length; i8++) {
                        iArr5[i8] = iArr3[C0622ot.m730(bArr[i8])];
                    }
                    int[] iArr6 = {r13.f1157 / 1, r13.f1158 / 1};
                    int ceil = ifVar.f4713 - ((int) Math.ceil(((double) iArr6[0]) / 2.0d));
                    int ceil2 = ifVar.f4711 - ((int) Math.ceil(((double) iArr6[1]) / 2.0d));
                    if (hkVar2 != null) {
                        C0771[] r15 = hkVar2.f1148.f4682[i].f4692[i2].f4695;
                        ceil += (r15 != null ? r15[0].f4717 : 0) - r8.f4695[0].f4717;
                        ceil2 += (r15 != null ? r15[0].f4716 : 0) - r8.f4695[0].f4716;
                    }
                    C0622ot.m745(iArr2, i3, i5 + (ceil / 1), ((i4 * 4) / 5) + (ceil2 / 1), iArr5, r13.f1157, r13.f1157, r13.f1158);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final int[] mo3787(int[][] iArr, int i, int i2, int i3, int i4, int i5) {
        C0405hk hkVar;
        int[] iArr2 = new int[(i3 * i4)];
        C0405hk hkVar2 = this.f1165[0];
        for (int i6 = 0; i6 < this.f1165.length; i6++) {
            if (this.f1165[i6] != null) {
                if (i6 == 0) {
                    hkVar = null;
                } else {
                    hkVar = hkVar2;
                }
                int[] iArr3 = null;
                if (iArr != null && i6 < iArr.length) {
                    iArr3 = iArr[i6];
                }
                m404(this.f1165[i6], i, i2, hkVar, iArr3, iArr2, i3, i4, i5);
            }
        }
        return iArr2;
    }
}
