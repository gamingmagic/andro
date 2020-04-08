package p004o;

import android.app.AlertDialog.Builder;
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaState;
import org.keplerproject.luajava.LuaStateFactory;

/* renamed from: o.휺 */
final class C2045 {

    /* renamed from: Ą */
    private boolean f8960 = true;

    /* renamed from: ą */
    private boolean f8961 = true;

    /* renamed from: ȃ */
    private boolean f8962 = false;

    /* renamed from: ˮ͈ */
    private LuaState f8963;

    /* renamed from: 櫯 */
    private LuaState f8964;

    /* renamed from: 鷭 */
    C1302if f8965;

    C2045() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4635(C0587nn nnVar) {
        boolean z;
        LuaState luaState;
        C1302if ifVar;
        LuaState luaState2;
        if (nnVar == C0587nn.MER) {
            this.f8965 = C1014.f6137.f1636.f6538;
            z = this.f8961;
            luaState = this.f8963;
            ifVar = C1014.f6137.f1636.f6538;
        } else if (nnVar == C0587nn.HOM) {
            this.f8965 = C1014.f6137.f1636.f6524;
            z = this.f8960;
            luaState = this.f8964;
            ifVar = C1014.f6137.f1636.f6524;
        } else {
            return;
        }
        if (z) {
            if (luaState == null) {
                C0587nn nnVar2 = nnVar;
                if (nnVar2 == C0587nn.HOM) {
                    this.f8964 = LuaStateFactory.newLuaState();
                    luaState2 = this.f8964;
                    this.f8960 = true;
                } else {
                    this.f8963 = LuaStateFactory.newLuaState();
                    luaState2 = this.f8963;
                    this.f8961 = true;
                }
                String str = "/AI/";
                if (C0595nv.f2877) {
                    str = new StringBuilder(String.valueOf(str)).append("USER_AI/").toString();
                }
                String str2 = nnVar2 == C0587nn.HOM ? C0595nv.f2869 + str + "AI.lua" : C0595nv.f2869 + str + "AI_M.lua";
                luaState2.openLibs();
                luaState2.LdoFile(str2);
                if (luaState2.toString(-1) != null) {
                    Builder builder = new Builder(C1014.f6147);
                    builder.setTitle("AI.lua error!").setMessage(luaState2.toString(-1)).setCancelable(false).setNegativeButton("OK", new C1767(this));
                    builder.create().show();
                }
            }
            if (nnVar == C0587nn.HOM) {
                this.f8960 = false;
                luaState = this.f8964;
            } else if (nnVar == C0587nn.MER) {
                this.f8961 = false;
                luaState = this.f8963;
            }
            LuaState luaState3 = luaState;
            C1996 r7 = new C1996(this, luaState3);
            C1420 r8 = new C1420(this, luaState3);
            C1758 r9 = new C1758(this, luaState3);
            C1623 r10 = new C1623(this, luaState3);
            C1723 r11 = new C1723(this, luaState3);
            C1986 r0 = new C1986(this, luaState3);
            C2044 r12 = new C2044(this, luaState3);
            C1994 r13 = new C1994(this, luaState3);
            C2022 r14 = new C2022(this, luaState3);
            C1852 r15 = new C1852(this, luaState3);
            C1547 r02 = new C1547(this, luaState3);
            C1577 r5 = new C1577(this, luaState3);
            try {
                r7.register("GetMsg");
                r8.register("GetResMsg");
                r9.register("TraceAI");
                r10.register("GetV");
                r11.register("GetActors");
                r0.register("IsMonster");
                r02.register("SkillGround");
                r15.register("SkillObject");
                r5.register("GetTick");
                r14.register("Attack");
                r13.register("Move");
                r12.register("MoveToOwner");
            } catch (LuaException e) {
                throw new C0588no((Exception) e);
            }
        }
        C1302if ifVar2 = ifVar;
        LuaState luaState4 = luaState;
        if (ifVar2 != null && luaState4 != null && ifVar2.f6567.f6599 > 0) {
            luaState4.pushInteger(ifVar2.f6571);
            luaState4.setGlobal("MyEnemy");
            luaState4.setTop(0);
            luaState4.getGlobal("AI");
            luaState4.pushInteger(ifVar2.f6567.f6595);
            if (luaState4.pcall(1, 0, 0) != 0) {
                C0592ns.m674("LUA runtime error " + (luaState4.isString(-1) ? luaState4.toString(-1) : ""));
                C0591nr.m672(luaState4);
                luaState4.setTop(0);
            } else {
                luaState4.getGlobal("MyEnemy");
                if (!luaState4.isNumber(-1)) {
                    throw new C0588no();
                }
                ifVar2.f6571 = luaState4.toInteger(-1);
                luaState4.pop(1);
            }
            luaState4.setTop(0);
        }
    }
}
