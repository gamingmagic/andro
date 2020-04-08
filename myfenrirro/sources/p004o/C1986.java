package p004o;

import org.keplerproject.luajava.JavaFunction;
import org.keplerproject.luajava.LuaState;

/* renamed from: o.섿 */
class C1986 extends JavaFunction {

    /* renamed from: 鷭 */
    final /* synthetic */ C2045 f8810;

    C1986(C2045 r1, LuaState luaState) {
        this.f8810 = r1;
        super(luaState);
    }

    public final int execute() {
        C0520le leVar = (C0520le) C1014.f6137.f1637.get(this.f9036L.toInteger(2));
        if (leVar != null) {
            C0520le leVar2 = leVar;
            if ((C1919.class.isAssignableFrom(leVar2.getClass()) ? leVar2 : null) != null) {
                if (leVar.f1629 == C0587nn.MOB) {
                    C0520le leVar3 = leVar;
                    if (!(C1919.class.isAssignableFrom(leVar3.getClass()) ? leVar3 : null).f8660) {
                        this.f9036L.pushNumber(1.0d);
                        return 1;
                    }
                }
                this.f9036L.pushNumber(0.0d);
                return 1;
            }
        }
        this.f9036L.pushNumber(0.0d);
        return 1;
    }
}
