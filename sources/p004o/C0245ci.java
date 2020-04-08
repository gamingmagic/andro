package p004o;

import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* renamed from: o.ci */
class C0245ci {

    /* renamed from: đ */
    C0616on f586 = new C0616on();

    /* renamed from: Ē */
    C0525li f587 = new C0525li();

    /* renamed from: ē */
    C0525li f588 = new C0525li(1.0f, 1.0f);

    /* renamed from: ܕ */
    ShortBuffer f589;

    /* renamed from: 䒧 */
    FloatBuffer f590;

    /* renamed from: 庸 */
    C1341 f591;

    /* renamed from: 躆 */
    FloatBuffer f592;

    /* renamed from: 띥 */
    float f593;

    C0245ci() {
        C1341 r3 = new C1341();
        Matrix.setIdentityM(r3.f6874, 0);
        this.f591 = r3;
    }

    /* renamed from: 鷭 */
    private void m224(FloatBuffer floatBuffer, FloatBuffer floatBuffer2, ShortBuffer shortBuffer, C0525li liVar) {
        ShortBuffer shortBuffer2 = shortBuffer;
        FloatBuffer floatBuffer3 = floatBuffer2;
        FloatBuffer floatBuffer4 = floatBuffer;
        this.f590 = floatBuffer4;
        this.f592 = floatBuffer3;
        this.f589 = shortBuffer2;
        C0616on onVar = this.f586;
        onVar.f3008 = 1.0f;
        onVar.f3007 = 1.0f;
        onVar.f3006 = 1.0f;
        onVar.f3009 = 1.0f;
        if (liVar != null) {
            C0525li liVar2 = liVar;
            C0525li liVar3 = this.f587;
            C0525li liVar4 = liVar2;
            liVar3.f1649 = liVar4.f1649;
            liVar3.f1648 = liVar4.f1648;
        }
        mo3591();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3597(String str, C0441in inVar, C0525li liVar, C0525li liVar2) {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(64).order(ByteOrder.nativeOrder()).asFloatBuffer();
        ShortBuffer asShortBuffer = ByteBuffer.allocateDirect(12).order(ByteOrder.nativeOrder()).asShortBuffer();
        C0441in inVar2 = inVar;
        C0442if ifVar = (C0442if) inVar2.f1316.get(str);
        if (ifVar != null) {
            asFloatBuffer.put(new float[]{(-liVar2.f1649) / 2.0f, liVar2.f1648 / 2.0f, (float) ifVar.f1327, (-liVar2.f1649) / 2.0f, (-liVar2.f1648) / 2.0f, (float) ifVar.f1327, liVar2.f1649 / 2.0f, liVar2.f1648 / 2.0f, (float) ifVar.f1327, liVar2.f1649 / 2.0f, (-liVar2.f1648) / 2.0f, (float) ifVar.f1327});
            asFloatBuffer2.put(ifVar.mo3839());
            short[] sArr = new short[6];
            sArr[0] = 1;
            sArr[2] = 3;
            sArr[3] = 3;
            sArr[5] = 2;
            asShortBuffer.put(sArr);
        }
        asFloatBuffer.position(0);
        asFloatBuffer2.position(0);
        asShortBuffer.position(0);
        m224(asFloatBuffer, asFloatBuffer2, asShortBuffer, liVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public void mo3591() {
        float f = this.f587.f1649;
        float f2 = this.f587.f1648;
        C1341 r9 = new C1341();
        Matrix.setIdentityM(r9.f6874, 0);
        Matrix.translateM(r9.f6874, 0, f, f2, 0.0f);
        float f3 = this.f588.f1649;
        float f4 = this.f588.f1648;
        C1341 r8 = new C1341();
        Matrix.setIdentityM(r8.f6874, 0);
        Matrix.scaleM(r8.f6874, 0, f3, f4, 1.0f);
        C1341 r6 = r9;
        C1341 r7 = r9;
        float[] fArr = new float[16];
        float[] fArr2 = fArr;
        Matrix.multiplyMM(fArr2, 0, r7.f6874, 0, r8.f6874, 0);
        r7.f6874 = fArr;
        C1341 r0 = r6;
        C1341 r62 = r0;
        C1341 r72 = r0;
        float[] fArr3 = new float[16];
        float[] fArr4 = fArr3;
        Matrix.multiplyMM(fArr4, 0, r72.f6874, 0, C1341.m2060(this.f593, 0.0f, 0.0f, 1.0f).f6874, 0);
        r72.f6874 = fArr3;
        this.f591 = r62;
    }
}
