package p004o;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* renamed from: o.柫 */
final class C1632 extends C0245ci {

    /* renamed from: ć */
    static long f7572 = 1500;

    /* renamed from: ċ */
    static float f7573 = 0.1f;

    /* renamed from: Ȋ */
    static float f7574 = 0.08f;

    /* renamed from: ˮ͍ */
    static float f7575 = 0.06f;

    /* renamed from: 岱 */
    static float f7576 = 0.5f;

    /* renamed from: 纫 */
    static float f7577 = 0.5f;

    /* renamed from: Ą */
    C1633 f7578;

    /* renamed from: ą */
    C0548mb f7579;

    /* renamed from: Ć */
    float f7580 = 1.0f;

    /* renamed from: ȃ */
    C0570mx f7581;

    /* renamed from: ˮ͈ */
    boolean f7582;

    /* renamed from: 櫯 */
    long f7583;

    /* renamed from: 鷭 */
    int f7584;

    /* renamed from: o.柫$鷭 */
    enum C1633 {
        LEFT,
        RIGHT,
        UP
    }

    static {
    }

    C1632(int i, C0540lv lvVar, long j, C0570mx mxVar) {
        C1633 r1;
        C1632 r0;
        C0405hk hkVar = C1014.f6142.f1680.f1184;
        C0405hk hkVar2 = C1014.f6142.f1680.f1185;
        boolean z = lvVar.f1769.f1629 == C0587nn.PC;
        int i2 = mxVar == C0570mx.CRITICAL ? 1 : 0;
        this.f7581 = mxVar;
        this.f7584 = i;
        this.f7583 = j;
        this.f7579 = lvVar;
        this.f7582 = z;
        if (this.f7581 == C0570mx.HEAL || this.f7581 == C0570mx.SP_HEAL) {
            r0 = this;
            r1 = C1633.UP;
        } else {
            if (this.f7581 == C0570mx.FIXED_DIR) {
                r0 = this;
            } else {
                r0 = this;
                if (Math.random() > 0.5d) {
                    r1 = C1633.LEFT;
                }
            }
            r1 = C1633.RIGHT;
        }
        r0.f7578 = r1;
        int[] iArr = new int[12];
        int i3 = 0;
        while (i3 < iArr.length) {
            iArr[i3] = i % 10;
            i /= 10;
            if (i == 0) {
                break;
            }
            i3++;
        }
        int[] copyOf = Arrays.copyOf(iArr, i3 + 1);
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect((copyOf.length + 1) * 48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect((copyOf.length + 1) * 64).order(ByteOrder.nativeOrder()).asFloatBuffer();
        ShortBuffer wrap = ShortBuffer.wrap(new short[((copyOf.length + 1) * 6)]);
        C0525li liVar = new C0525li(f7575 / (((float) C1014.f6142.f1690.x) / ((float) C1014.f6142.f1690.y)), f7575);
        C0525li liVar2 = new C0525li();
        C0525li liVar3 = new C0525li();
        if (mxVar == C0570mx.CRITICAL && !this.f7582) {
            liVar2.f1649 = liVar.f1649 * ((((((float) copyOf.length) / 2.0f) - 0.5f) - ((float) copyOf.length)) - 1.0f);
            liVar2.f1648 = liVar.f1648 * 3.0f;
            liVar3.f1649 = liVar.f1649 * (((((float) copyOf.length) / 2.0f) - 0.5f) + 2.0f);
            liVar3.f1648 = liVar.f1648 * -3.0f;
            C1014.f6142.f1680.f1198.mo3836(hkVar2.f1144[3].f1164, hkVar2.f1146 != null ? hkVar2.f1146 : hkVar2.f1144[3].f1162, hkVar2.f1144[3].f1157, hkVar2.f1144[3].f1158, hkVar2.f1151 + 3, null);
            C1812 r15 = C1014.f6142.f1698;
            C1343 r02 = new C1343(this);
            C1812 r16 = r15;
            synchronized (r15) {
                r16.f8360.add(r02);
            }
            C0442if ifVar = (C0442if) C1014.f6142.f1680.f1198.f1316.get(hkVar2.f1151 + 3);
            if (ifVar != null) {
                float[] fArr = {liVar2.f1649, liVar2.f1648, (float) ifVar.f1327, liVar2.f1649, liVar3.f1648, (float) ifVar.f1327, liVar3.f1649, liVar2.f1648, (float) ifVar.f1327, liVar3.f1649, liVar3.f1648, (float) ifVar.f1327};
                asFloatBuffer2.put(ifVar.mo3839());
                asFloatBuffer.put(fArr);
                short[] sArr = new short[6];
                sArr[1] = 1;
                sArr[2] = 2;
                sArr[3] = 2;
                sArr[4] = 1;
                sArr[5] = 3;
                wrap.put(sArr);
            }
        }
        for (int i4 = 0; i4 < copyOf.length; i4++) {
            float length = ((((float) copyOf.length) / 2.0f) - 0.5f) - ((float) i4);
            int i5 = copyOf[i4];
            liVar2.f1649 = liVar.f1649 * (length - ((((float) hkVar.f1144[i5].f1157) * 0.5f) / 8.0f));
            liVar2.f1648 = liVar.f1648 * ((((float) hkVar.f1144[i5].f1158) * 1.0f) / 11.0f);
            liVar3.f1649 = liVar.f1649 * (length + ((((float) hkVar.f1144[i5].f1157) * 0.5f) / 8.0f));
            liVar3.f1648 = liVar.f1648 * ((((float) hkVar.f1144[i5].f1158) * -1.0f) / 11.0f);
            String str = hkVar.f1151 + i5;
            if (!(C1014.f6142.f1680.f1198.f1316.get(str) != null)) {
                C1014.f6142.f1680.f1198.mo3836(hkVar.f1144[i5].f1164, hkVar.f1146 != null ? hkVar.f1146 : hkVar.f1144[i5].f1162, hkVar.f1144[i5].f1157, hkVar.f1144[i5].f1158, str, hkVar.f1151);
                C1812 r152 = C1014.f6142.f1698;
                C1410 r03 = new C1410(this);
                C1812 r162 = r152;
                synchronized (r152) {
                    r162.f8360.add(r03);
                }
            }
            C0442if ifVar2 = (C0442if) C1014.f6142.f1680.f1198.f1316.get(str);
            if (ifVar2 != null) {
                float[] fArr2 = {liVar2.f1649, liVar2.f1648, (float) ifVar2.f1327, liVar2.f1649, liVar3.f1648, (float) ifVar2.f1327, liVar3.f1649, liVar2.f1648, (float) ifVar2.f1327, liVar3.f1649, liVar3.f1648, (float) ifVar2.f1327};
                asFloatBuffer2.put(ifVar2.mo3839());
                asFloatBuffer.put(fArr2);
                wrap.put(new short[]{(short) (((i4 + i2) * 4) + 0), (short) (((i4 + i2) * 4) + 1), (short) (((i4 + i2) * 4) + 2), (short) (((i4 + i2) * 4) + 2), (short) (((i4 + i2) * 4) + 1), (short) (((i4 + i2) * 4) + 3)});
            }
        }
        asFloatBuffer.position(0);
        wrap.position(0);
        asFloatBuffer2.position(0);
        ShortBuffer shortBuffer = wrap;
        FloatBuffer floatBuffer = asFloatBuffer2;
        this.f590 = asFloatBuffer;
        this.f592 = floatBuffer;
        this.f589 = shortBuffer;
        mo4422(j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final boolean mo4422(long j) {
        float f = (float) (((j - this.f7583) * 100) / f7572);
        float f2 = 100.0f - f;
        if (f2 < 50.0f) {
            this.f7580 = f2 / 50.0f;
        } else {
            this.f7580 = 1.0f;
        }
        if (this.f7580 < 0.0f) {
            this.f7580 = 0.0f;
        }
        if (this.f7580 > 0.0f) {
            if (this.f7578 == C1633.LEFT || this.f7578 == C1633.RIGHT) {
                float f3 = ((f7577 * f) * f7576) / 100.0f;
                float pow = f7577 * 7.0f * (f7574 - ((float) Math.pow(((double) ((f7576 * f) - 30.0f)) / 100.0d, 2.0d)));
                if (this.f7578 == C1633.LEFT) {
                    f3 = -f3;
                }
                C0548mb mbVar = this.f7579;
                C0534lq lqVar = C1014.f6142;
                C0525li r8 = C0534lq.m593(mbVar.f1707);
                C0525li liVar = r8;
                float f4 = pow;
                r8.f1649 += f3;
                r8.f1648 += f4;
                C0525li liVar2 = liVar;
                C0525li liVar3 = this.f587;
                C0525li liVar4 = liVar2;
                liVar3.f1649 = liVar4.f1649;
                liVar3.f1648 = liVar4.f1648;
                C0525li liVar5 = new C0525li(1.0f, 1.0f);
                if (f2 < 70.0f) {
                    float f5 = (f2 / 100.0f) + 0.3f;
                    liVar5.f1648 = f5;
                    liVar5.f1649 = f5;
                }
                C0525li liVar6 = this.f588;
                C0525li liVar7 = liVar5;
                liVar6.f1649 = liVar7.f1649;
                liVar6.f1648 = liVar7.f1648;
                mo3591();
            } else if (this.f7578 == C1633.UP) {
                C0548mb mbVar2 = this.f7579;
                C0534lq lqVar2 = C1014.f6142;
                C0525li r82 = C0534lq.m593(mbVar2.f1707);
                C0525li liVar8 = r82;
                float f6 = f7573 + (f / 500.0f);
                r82.f1649 += 0.0f;
                r82.f1648 += f6;
                C0525li liVar9 = liVar8;
                C0525li liVar10 = this.f587;
                C0525li liVar11 = liVar9;
                liVar10.f1649 = liVar11.f1649;
                liVar10.f1648 = liVar11.f1648;
                C0525li liVar12 = new C0525li(0.5f, 0.5f);
                C0525li liVar13 = this.f588;
                C0525li liVar14 = liVar12;
                liVar13.f1649 = liVar14.f1649;
                liVar13.f1648 = liVar14.f1648;
                mo3591();
            } else {
                String str = "unexpected damage direction: " + this.f7578;
                Log.e("AndRO", str);
                throw new C0588no(str);
            }
        }
        if (this.f7581 == C0570mx.HEAL) {
            float f7 = this.f7580;
            C0616on onVar = this.f586;
            float f8 = f7;
            onVar.f3008 = 0.0f;
            onVar.f3007 = 1.0f;
            onVar.f3006 = 0.0f;
            onVar.f3009 = f8;
        } else if (this.f7581 == C0570mx.SP_HEAL) {
            float f9 = this.f7580;
            C0616on onVar2 = this.f586;
            float f10 = f9;
            onVar2.f3008 = 0.0f;
            onVar2.f3007 = 0.0f;
            onVar2.f3006 = 1.0f;
            onVar2.f3009 = f10;
        } else if (this.f7582) {
            float f11 = this.f7580;
            C0616on onVar3 = this.f586;
            float f12 = f11;
            onVar3.f3008 = 1.0f;
            onVar3.f3007 = 0.0f;
            onVar3.f3006 = 0.0f;
            onVar3.f3009 = f12;
        } else {
            float f13 = this.f7580;
            C0616on onVar4 = this.f586;
            float f14 = f13;
            onVar4.f3008 = 1.0f;
            onVar4.f3007 = 1.0f;
            onVar4.f3006 = 1.0f;
            onVar4.f3009 = f14;
        }
        return this.f7580 == 0.0f;
    }
}
