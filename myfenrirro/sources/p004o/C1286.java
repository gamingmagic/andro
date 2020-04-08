package p004o;

import java.util.HashMap;
import java.util.Map;

/* renamed from: o.ѥ */
final class C1286 {

    /* renamed from: 鷭 */
    Map<Integer, String> f6452 = new HashMap();

    C1286(C0248cl clVar) {
        C0453ix ixVar = C1014.f6147.f51;
        String str = "Reading metalprocessitemlist_db...";
        if (ixVar.f1370 != null) {
            C1014.f6147.mo3387((Runnable) new C0473jm(ixVar));
        }
        C1014.f6147.mo3387((Runnable) new C0471jk(ixVar, str));
        String[] r7 = C0622ot.m751(C0622ot.m741((byte[]) clVar.mo3613("data\\metalprocessitemlist.txt", false), C0618op.LOCAL), true, "#");
        for (int i = 0; i < r7.length - 1; i += 2) {
            this.f6452.put(Integer.valueOf(Integer.parseInt(r7[i].trim())), r7[i + 1]);
        }
    }
}
