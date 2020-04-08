package p004o;

import java.util.HashMap;
import org.keplerproject.luajava.LuaState;
import org.keplerproject.luajava.LuaStateFactory;

/* renamed from: o.dq */
final class C0284dq {

    /* renamed from: 鷭 */
    HashMap<Integer, C0285> f770 = new HashMap<>();

    /* renamed from: o.dq$鷭 */
    class C0285 {

        /* renamed from: 櫯 */
        String f772;

        /* renamed from: 鷭 */
        String f773;

        private C0285() {
        }

        /* synthetic */ C0285(C0284dq dqVar, C0285 r2) {
            this();
        }
    }

    /* renamed from: 鷭 */
    private void m313(C0248cl clVar) {
        C0453ix ixVar = C1014.f6147.f51;
        String str = "Reading sprite robe db...";
        if (ixVar.f1370 != null) {
            C1014.f6147.mo3387((Runnable) new C0473jm(ixVar));
        }
        C1014.f6147.mo3387((Runnable) new C0471jk(ixVar, str));
        LuaState newLuaState = LuaStateFactory.newLuaState();
        byte[] bArr = (byte[]) clVar.mo3613("data\\lua files\\datainfo\\spriterobeid.lub", false);
        byte[] bArr2 = (byte[]) clVar.mo3613("data\\lua files\\datainfo\\spriterobename.lub", false);
        try {
            C0591nr.m673(newLuaState, bArr);
            try {
                C0591nr.m673(newLuaState, bArr2);
                newLuaState.getGlobal("RobeNameTable");
                newLuaState.pushNil();
                while (newLuaState.next(-2) != 0) {
                    int integer = newLuaState.toInteger(-2);
                    C0285 r4 = new C0285(this, null);
                    r4.f773 = C0591nr.m671(newLuaState, C0618op.KOREAN);
                    this.f770.put(Integer.valueOf(integer), r4);
                    newLuaState.pop(1);
                }
                newLuaState.pop(1);
                newLuaState.getGlobal("RobeNameTable_Eng");
                newLuaState.pushNil();
                while (newLuaState.next(-2) != 0) {
                    int integer2 = newLuaState.toInteger(-2);
                    String r42 = C0591nr.m671(newLuaState, C0618op.KOREAN);
                    C0285 r5 = (C0285) this.f770.get(Integer.valueOf(integer2));
                    if (r5 == null) {
                        C0592ns.m674("RobeNameTable_Eng: failed to find RobeNameTable entry for robe. robe_id=" + integer2 + " spritename=" + r42);
                    } else {
                        r5.f772 = r42;
                    }
                    newLuaState.pop(1);
                }
                newLuaState.pop(1);
                newLuaState.close();
            } catch (C0589np e) {
                throw new C0590nq("spriterobename.lub", e.getMessage());
            }
        } catch (C0589np e2) {
            throw new C0590nq("spriterobeid.lub", e2.getMessage());
        }
    }

    public C0284dq(C0248cl clVar) {
        m313(clVar);
    }
}
