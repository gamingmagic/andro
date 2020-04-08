package p004o;

import java.util.HashMap;

/* renamed from: o.亶 */
final class C1517 {

    /* renamed from: 鷭 */
    HashMap<String, String> f7268 = new HashMap<>();

    C1517(C0248cl clVar) {
        C0453ix ixVar = C1014.f6147.f51;
        String str = "Reading mapnametable...";
        if (ixVar.f1370 != null) {
            C1014.f6147.mo3387((Runnable) new C0473jm(ixVar));
        }
        C1014.f6147.mo3387((Runnable) new C0471jk(ixVar, str));
        String[] r7 = C0622ot.m751(C0622ot.m741((byte[]) clVar.mo3613("data\\mapnametable.txt", false), C0618op.LOCAL), true, "#");
        for (int i = 0; i < r7.length / 2; i++) {
            String trim = r7[(i * 2) + 0].trim();
            String trim2 = r7[(i * 2) + 1].trim();
            if (trim.length() > 0 && trim2.length() > 0) {
                this.f7268.put(trim, trim2);
            }
        }
    }
}
