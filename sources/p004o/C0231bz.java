package p004o;

import com.roworkshop.andro.c_point;
import p004o.C0653pe.C0654if;

/* renamed from: o.bz */
class C0231bz implements Runnable {

    /* renamed from: Ą */
    private final /* synthetic */ String f524;

    /* renamed from: ą */
    private final /* synthetic */ String f525;

    /* renamed from: Ć */
    private final /* synthetic */ boolean[] f526;

    /* renamed from: ȃ */
    private final /* synthetic */ String f527;

    /* renamed from: ˮ͈ */
    private final /* synthetic */ String f528;

    /* renamed from: 櫯 */
    private final /* synthetic */ String f529;

    /* renamed from: 鷭 */
    final /* synthetic */ C0214bi f530;

    C0231bz(C0214bi biVar, String str, String str2, String str3, String str4, String str5, boolean[] zArr) {
        this.f530 = biVar;
        this.f529 = str;
        this.f528 = str2;
        this.f527 = str3;
        this.f524 = str4;
        this.f525 = str5;
        this.f526 = zArr;
    }

    public final void run() {
        C0412hn hnVar = C1014.f6142.f1680;
        C0412hn hnVar2 = hnVar;
        C0603oc ocVar = new C0603oc();
        ocVar.f2965 = 5;
        ocVar.f2934 = 1002;
        ocVar.f2962 = 10000000;
        hnVar.f1196 = new C1720(new C1756(ocVar));
        C0599nz nzVar = new C0599nz();
        nzVar.f2916 = (short) C1761.NOVICE.f8294;
        nzVar.f2887 = 1;
        nzVar.f2917 = 1;
        nzVar.f2892 = 40;
        nzVar.f2890 = 53;
        nzVar.f2907 = 150;
        hnVar.f1192 = new C1720(new C0206bb(nzVar, 1000000, 0, 0));
        C0603oc ocVar2 = new C0603oc();
        ocVar2.f2965 = -1;
        ocVar2.f2934 = 48;
        hnVar.f1191 = new C1720(new C0232c(ocVar2));
        C1645 r0 = new C1645(0, 512, 0, 0, 0, 0, 0, 1);
        hnVar.f1197 = new C1720(r0);
        hnVar2.f1184 = new C0405hk(new StringBuilder(String.valueOf(C1014.f6158.f674.f623.f7903.f7908.f7924)).append("\\").append(C1014.f6158.f674.f623.f7903.f7908.f7921).toString());
        hnVar2.f1185 = new C0405hk(new StringBuilder(String.valueOf(C1014.f6158.f674.f623.f7903.f7908.f7924)).append("\\msg").toString());
        hnVar2.f1186 = new C0408hl(new C0405hk(new StringBuilder(String.valueOf(C1014.f6158.f674.f623.f7903.f7908.f7924)).append("\\emotion").toString(), false, true, false));
        hnVar2.f1193 = new C0408hl(new C0405hk("cursors"));
        C0405hk hkVar = new C0405hk("cursors", false, true, false);
        hkVar.mo3779();
        hnVar2.f1188 = new C0408hl(hkVar);
        C0252cp cpVar = C1014.f6158;
        C0252cp cpVar2 = C1014.f6158;
        cpVar.f661 = C0252cp.m269(C1014.f6142.f1680.f1188, 17, new c_point(50, 50));
        C0252cp cpVar3 = C1014.f6158;
        C0252cp cpVar4 = C1014.f6158;
        cpVar3.f660 = C0252cp.m269(C1014.f6142.f1680.f1188, 19, new c_point(50, 50));
        C0252cp cpVar5 = C1014.f6158;
        C0252cp cpVar6 = C1014.f6158;
        cpVar5.f659 = C0252cp.m269(C1014.f6142.f1680.f1188, 7, new c_point(50, 50));
        C0252cp cpVar7 = C1014.f6158;
        C0252cp cpVar8 = C1014.f6158;
        cpVar7.f662 = C0252cp.m269(C1014.f6142.f1680.f1188, 22, new c_point(50, 50));
        try {
            C1014.f6142.f1695 = new C1558(this.f529, false);
            for (String r9 : new String[]{this.f528, this.f527, this.f524, this.f525}) {
                try {
                    C0248cl.m253(C0595nv.f2869, r9, false, C0654if.SKIP, null);
                } catch (C0825tu unused) {
                }
            }
            C0246cj.m231();
            this.f526[0] = true;
        } catch (C0822tr e) {
            throw e;
        } catch (Exception e2) {
            throw new C0588no(e2, "Failed to load map: " + this.f529);
        }
    }
}
