package p004o;

import java.util.HashMap;
import org.keplerproject.luajava.LuaState;
import org.keplerproject.luajava.LuaStateFactory;

/* renamed from: o.dp */
final class C0282dp {

    /* renamed from: 櫯 */
    int f766 = 0;

    /* renamed from: 鷭 */
    HashMap<Integer, C0283> f767 = new HashMap<>();

    /* renamed from: o.dp$鷭 */
    class C0283 {

        /* renamed from: 鷭 */
        String f769;

        private C0283() {
        }

        /* synthetic */ C0283(C0282dp dpVar, C0283 r2) {
            this();
        }
    }

    /* renamed from: 鷭 */
    private void m312(C0248cl clVar) {
        C0453ix ixVar = C1014.f6147.f51;
        String str = "Reading random option db...";
        if (ixVar.f1370 != null) {
            C1014.f6147.mo3387((Runnable) new C0473jm(ixVar));
        }
        C1014.f6147.mo3387((Runnable) new C0471jk(ixVar, str));
        LuaState newLuaState = LuaStateFactory.newLuaState();
        byte[] bArr = (byte[]) clVar.mo3613("data\\lua files\\datainfo\\enumvar.lub", false);
        byte[] bArr2 = (byte[]) clVar.mo3613("data\\lua files\\datainfo\\addrandomoptionnametable.lub", false);
        try {
            C0591nr.m673(newLuaState, bArr);
            try {
                C0591nr.m673(newLuaState, bArr2);
                newLuaState.getGlobal("NameTable_VAR");
                newLuaState.pushNil();
                while (newLuaState.next(-2) != 0) {
                    int integer = newLuaState.toInteger(-2);
                    C0283 r4 = new C0283(this, null);
                    r4.f769 = C0591nr.m671(newLuaState, C0618op.LOCAL);
                    if (r4.f769.equals("END")) {
                        this.f766 = integer;
                    }
                    this.f767.put(Integer.valueOf(integer), r4);
                    newLuaState.pop(1);
                }
                newLuaState.pop(1);
                newLuaState.close();
            } catch (C0589np e) {
                throw new C0590nq("addrandomoptionnametable.lub", e.getMessage());
            }
        } catch (C0589np e2) {
            throw new C0590nq("enumvar.lub", e2.getMessage());
        }
    }

    public C0282dp(C0248cl clVar) {
        m312(clVar);
    }
}
