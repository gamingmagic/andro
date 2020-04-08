package p004o;

import org.keplerproject.luajava.JavaFunction;
import org.keplerproject.luajava.LuaState;

/* renamed from: o.鰤 */
class C1852 extends JavaFunction {

    /* renamed from: 鷭 */
    final /* synthetic */ C2045 f8443;

    C1852(C2045 r1, LuaState luaState) {
        this.f8443 = r1;
        super(luaState);
    }

    public final int execute() {
        this.f9036L.toInteger(2);
        int integer = this.f9036L.toInteger(3);
        int integer2 = this.f9036L.toInteger(4);
        int integer3 = this.f9036L.toInteger(5);
        this.f8443.f8965.f6571 = integer3;
        if (this.f8443.f8965.f6567.f6590 == C0587nn.HOM) {
            C1014.f6144.mo3652((C0839ue) new C1085(integer2, integer, integer3));
        } else {
            C1014.f6144.mo3652((C0839ue) new C1575((short) integer2, (short) integer, integer3));
        }
        this.f9036L.pushNil();
        return 1;
    }
}
