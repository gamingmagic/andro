package p004o;

import android.graphics.Point;
import android.opengl.Matrix;
import com.roworkshop.andro.c_point;

/* renamed from: o.䀠 */
class C1443 extends C0245ci {

    /* renamed from: ȃ */
    byte f7062;

    /* renamed from: ˮ͈ */
    Point f7063 = new Point(0, 0);

    /* renamed from: 櫯 */
    C0525li f7064 = new C0525li();

    /* renamed from: 鷭 */
    C1739 f7065;

    @Deprecated
    C1443() {
    }

    C1443(C1739 r4, C0441in inVar, String str, float f) {
        mo4341(r4, inVar, str, 4.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4341(C1739 r16, C0441in inVar, String str, float f) {
        c_point c_point;
        this.f7065 = r16;
        C0442if ifVar = (C0442if) inVar.f1316.get(str);
        if (ifVar == null) {
            C1621 r9 = C0596nw.m683(str, (byte[]) C1014.f6158.f677.mo3613(str, false));
            C0441in inVar2 = inVar;
            C0441in inVar3 = inVar2;
            inVar3.mo3837(r9.f7548, r9.f7547, r9.f7546.x, r9.f7546.y, str, null, inVar2.f1308);
            c_point = r9.f7546;
        } else {
            c_point = new c_point(ifVar.f1325, ifVar.f1326);
        }
        float f2 = ((((float) C1014.f6147.getResources().getDisplayMetrics().densityDpi) / 160.0f) * 80.0f) / 512.0f;
        this.f7064 = new C0525li((float) c_point.x, (float) c_point.y);
        C0525li liVar = this.f7064;
        float f3 = f2 * f;
        liVar.f1649 *= f3;
        liVar.f1648 *= f3;
        C0525li r162 = r16.mo4480(new Point(0, 0));
        mo3597(str, inVar, r162, this.f7064);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4340(Point point, byte b) {
        this.f7063 = point;
        this.f7062 = b;
        mo3591();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4339(Point point) {
        Point point2 = point;
        this.f7063 = point2;
        this.f7062 = 0;
        mo3591();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final void mo3591() {
        if (C1014.f6137.f1636 != null) {
            float f = (((float) C1014.f6137.f1636.f8639) * 3.1415927f) / 4.0f;
            C0525li r4 = this.f7065.mo4480(this.f7063);
            C0525li liVar = this.f587;
            C0525li liVar2 = r4;
            C0525li liVar3 = liVar;
            liVar.f1649 = liVar2.f1649;
            liVar3.f1648 = liVar2.f1648;
            this.f593 = f;
            super.mo3591();
            float f2 = (float) C1014.f6142.f1690.x;
            float f3 = (float) C1014.f6142.f1690.y;
            C1341 r6 = new C1341();
            Matrix.setIdentityM(r6.f6874, 0);
            Matrix.translateM(r6.f6874, 0, f2, f3, 0.0f);
            C1341 r3 = r6;
            if (C1014.f6142.f1683 != null) {
                this.f591 = C1341.m2062(C1014.f6142.f1683, r3, this.f591);
            }
        }
    }
}
