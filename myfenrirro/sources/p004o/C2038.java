package p004o;

import android.util.FloatMath;
import p004o.C0794tg.aux;

/* renamed from: o.툀 */
final class C2038 {

    /* renamed from: Ą */
    C1647 f8929;

    /* renamed from: ą */
    long f8930;

    /* renamed from: Ć */
    long f8931;

    /* renamed from: ȃ */
    float f8932;

    /* renamed from: ˮ͈ */
    float f8933;

    /* renamed from: 櫯 */
    C0526lj f8934;

    /* renamed from: 鷭 */
    String f8935;

    /* renamed from: 櫯 */
    private void m2705() {
        this.f8929 = new C1647();
        C1647 r0 = this.f8929;
        C0526lj ljVar = this.f8934;
        r0.f7606 = new float[]{ljVar.f1652, ljVar.f1651, ljVar.f1650};
        float[] fArr = {this.f8929.f7606[0] + this.f8932, this.f8929.f7606[1] + this.f8932, this.f8929.f7606[2] + this.f8932};
        this.f8929.f7608 = fArr;
        float[] fArr2 = {this.f8929.f7606[0] - this.f8932, this.f8929.f7606[1] - this.f8932, this.f8929.f7606[2] - this.f8932};
        this.f8929.f7609 = fArr2;
        this.f8929.mo4436();
    }

    C2038(aux aux) {
        this.f8935 = C0622ot.m741(aux.f4867, C0618op.KOREAN);
        this.f8934 = new C0526lj(aux.f4865[0], -aux.f4865[1], aux.f4865[2]);
        this.f8933 = aux.f4864;
        this.f8932 = aux.f4862;
        this.f8930 = (long) (aux.f4863 * 1000.0f);
        m2705();
        C1641 r0 = C1014.f6136;
        if (!r0.f7599.containsKey(this.f8935)) {
            C1014.f6136.mo4429(this.f8935, (byte[]) C1014.f6158.f677.mo3613("data\\wav\\" + this.f8935, false));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4629() {
        if (C1014.f6142.f1680.f1195 != null && C1014.f6142.f1680.f1195.f1707 != null) {
            C0526lj ljVar = C1014.f6142.f1680.f1195.f1707;
            C0525li liVar = new C0525li(new C0525li(ljVar.f1652, ljVar.f1650));
            C0525li liVar2 = liVar;
            C0526lj ljVar2 = this.f8934;
            C0525li liVar3 = new C0525li(ljVar2.f1652, ljVar2.f1650);
            C0525li liVar4 = liVar;
            liVar.f1649 -= liVar3.f1649;
            liVar4.f1648 -= liVar3.f1648;
            C0525li liVar5 = liVar2;
            float sqrt = 1.0f - (FloatMath.sqrt((liVar2.f1649 * liVar5.f1649) + (liVar5.f1648 * liVar5.f1648)) / this.f8932);
            if (sqrt >= 0.0f) {
                C1014.f6136.mo4428(this.f8935, this.f8933 * sqrt);
                this.f8931 = System.currentTimeMillis();
            }
        }
    }
}
