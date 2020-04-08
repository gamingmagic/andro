package p004o;

import java.util.HashSet;

/* renamed from: o.ﮍ */
final class C2052 {

    /* renamed from: 鷭 */
    HashSet<String> f8976 = new HashSet<>();

    C2052(C0248cl clVar) {
        C0453ix ixVar = C1014.f6147.f51;
        String str = "Reading indoors_db...";
        if (ixVar.f1370 != null) {
            C1014.f6147.mo3387((Runnable) new C0473jm(ixVar));
        }
        C1014.f6147.mo3387((Runnable) new C0471jk(ixVar, str));
        for (String trim : C0622ot.m751(C0622ot.m741((byte[]) clVar.mo3613("data\\indoorrswtable.txt", false), C0618op.KOREAN), true, "#")) {
            String trim2 = trim.trim();
            if (trim2.endsWith(".rsw")) {
                this.f8976.add(trim2);
            }
        }
    }
}
