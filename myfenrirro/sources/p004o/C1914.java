package p004o;

import java.util.ArrayList;

/* renamed from: o.데 */
class C1914 implements Runnable {

    /* renamed from: 櫯 */
    private final /* synthetic */ C0599nz[] f8608;

    /* renamed from: 鷭 */
    final /* synthetic */ C1904 f8609;

    C1914(C1904 r1, C0599nz[] nzVarArr) {
        this.f8609 = r1;
        this.f8608 = nzVarArr;
    }

    public final void run() {
        C0599nz[] nzVarArr;
        C0453ix ixVar = C1014.f6147.f51;
        String str = "Loading characters";
        if (ixVar.f1370 != null) {
            C1014.f6147.mo3387((Runnable) new C0473jm(ixVar));
        }
        C1014.f6147.mo3387((Runnable) new C0471jk(ixVar, str));
        if (this.f8609.f8551 == null) {
            C0453ix ixVar2 = C1014.f6147.f51;
            String str2 = "Loading new character sprite";
            if (ixVar2.f1370 != null) {
                C1014.f6147.mo3387((Runnable) new C0473jm(ixVar2));
            }
            C1014.f6147.mo3387((Runnable) new C0471jk(ixVar2, str2));
            this.f8609.f8551 = new C1906(C1761.NOVICE, C1977.values()[C1014.f6161.f6163]);
        }
        ArrayList arrayList = new ArrayList();
        for (C0599nz nzVar : this.f8608) {
            String r11 = C0622ot.m741(nzVar.f2909, C0618op.LOCAL);
            C0453ix ixVar3 = C1014.f6147.f51;
            String str3 = "Loading " + r11;
            if (ixVar3.f1370 != null) {
                C1014.f6147.mo3387((Runnable) new C0473jm(ixVar3));
            }
            C1014.f6147.mo3387((Runnable) new C0471jk(ixVar3, str3));
            C1908 r12 = new C1908();
            r12.f8598 = nzVar;
            r12.f8599 = r11;
            r12.f8600 = C1014.f6158.mo3618(nzVar, nzVar.f2901);
            arrayList.add(r12);
        }
        C1014.f6147.mo3387((Runnable) new C1648(this, arrayList));
    }
}
