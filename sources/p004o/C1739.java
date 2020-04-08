package p004o;

import android.graphics.Point;
import android.opengl.Matrix;
import java.util.HashMap;

/* renamed from: o.脢 */
final class C1739 extends C0245ci {

    /* renamed from: Ą */
    HashMap<Integer, C0189al> f8014 = new HashMap<>();

    /* renamed from: ą */
    HashMap<Integer, C1346> f8015 = new HashMap<>();

    /* renamed from: ȃ */
    C1443 f8016;

    /* renamed from: ˮ͈ */
    Point f8017 = new Point();

    /* renamed from: 櫯 */
    C0525li f8018 = new C0525li();

    /* renamed from: 鷭 */
    C0525li f8019 = new C0525li();

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final C0525li mo4480(Point point) {
        if (point == null) {
            return new C0525li();
        }
        C0525li liVar = new C0525li();
        Point point2 = new Point(point.x - (this.f8017.x / 2), point.y - (this.f8017.y / 2));
        float max = ((float) Math.max(this.f8017.x, this.f8017.y)) / this.f8018.f1648;
        liVar.f1649 = this.f8019.f1649 + (((float) point2.x) / (((float) Math.max(this.f8017.x, this.f8017.y)) / this.f8018.f1649));
        liVar.f1648 = this.f8019.f1648 + (((float) point2.y) / max);
        return liVar;
    }

    C1739(String str, C0441in inVar, Point point) {
        if (str.contains(".")) {
            str = str.split(".")[0];
        }
        String sb = new StringBuilder(String.valueOf(C1014.f6158.f674.f623.f7904.f7928)).append("\\map\\").append(str).append(".bmp").toString();
        if (C1014.f6158.f674.f610.f719.get(sb) != null) {
            sb = (String) C1014.f6158.f674.f610.f719.get(sb);
        }
        String str2 = "data\\texture\\" + sb;
        C1621 r8 = C0596nw.m683(str2, (byte[]) C1014.f6158.f677.mo3613(str2, false));
        C0441in inVar2 = inVar;
        C0441in inVar3 = inVar2;
        inVar3.mo3837(r8.f7548, r8.f7547, r8.f7546.x, r8.f7546.y, str2, null, inVar2.f1308);
        C0525li liVar = new C0525li(((float) r8.f7546.x) / 512.0f, ((float) r8.f7546.y) / 512.0f);
        C0525li liVar2 = this.f8018;
        float f = (((float) C1014.f6147.getResources().getDisplayMetrics().densityDpi) / 160.0f) * 80.0f * liVar.f1648;
        liVar2.f1649 = (((float) C1014.f6147.getResources().getDisplayMetrics().densityDpi) / 160.0f) * 80.0f * liVar.f1649;
        liVar2.f1648 = f;
        C0525li liVar3 = this.f8019;
        float f2 = (-this.f8018.f1648) / 2.0f;
        liVar3.f1649 = (-this.f8018.f1649) / 2.0f;
        liVar3.f1648 = f2;
        mo3597(str2, inVar, this.f8019, this.f8018);
        C0616on onVar = this.f586;
        onVar.f3008 = 1.0f;
        onVar.f3007 = 1.0f;
        onVar.f3006 = 1.0f;
        onVar.f3009 = 0.5f;
        this.f8017.set(point.x, point.y);
        this.f8016 = new C1443(this, inVar, "data\\texture\\" + C1014.f6158.f674.f623.f7904.f7928 + "\\map\\map_arrow.bmp", 4.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4482(int i, int i2, int i3, int i4) {
        if (C1014.f6142.f1695 != null && i4 >= 0) {
            C0189al alVar = (C0189al) this.f8014.get(Integer.valueOf(i));
            if (alVar == null) {
                alVar = new C0189al(this, i4);
                this.f8014 = (HashMap) this.f8014.clone();
                this.f8014.put(Integer.valueOf(i), alVar);
            }
            alVar.mo4339(new Point(i2, i3));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4481() {
        if (C1014.f6137.f1636.f6502 != null) {
            for (int i = 0; i < C1014.f6137.f1636.f6502.f386.length; i++) {
                C0188 r4 = C1014.f6137.f1636.f6502.f386[i];
                if (r4.f391 && r4.f396.equals(C1014.f6142.f1695.f7353) && r4.f392 > 0 && r4.f393 > 0) {
                    mo4482(r4.f398, r4.f392, r4.f393, i);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final void mo3591() {
        super.mo3591();
        float f = (float) C1014.f6142.f1690.x;
        float f2 = (float) C1014.f6142.f1690.y;
        C1341 r6 = new C1341();
        Matrix.setIdentityM(r6.f6874, 0);
        Matrix.translateM(r6.f6874, 0, f, f2, 0.0f);
        C1341 r3 = r6;
        if (C1014.f6142.f1683 != null) {
            this.f591 = C1341.m2062(C1014.f6142.f1683, r3, this.f591);
        }
        if (this.f8016 != null) {
            this.f8016.mo3591();
        }
        for (C1443 r0 : this.f8014.values()) {
            r0.mo3591();
        }
        for (C1443 r02 : this.f8015.values()) {
            r02.mo3591();
        }
    }
}
