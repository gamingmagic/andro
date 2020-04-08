package p004o;

import org.keplerproject.luajava.JavaFunction;
import org.keplerproject.luajava.LuaState;

/* renamed from: o.斮 */
class C1623 extends JavaFunction {

    /* renamed from: 鷭 */
    final /* synthetic */ C2045 f7549;

    C1623(C2045 r1, LuaState luaState) {
        this.f7549 = r1;
        super(luaState);
    }

    public final int execute() {
        C1919 r0;
        C1919 r02;
        int integer = this.f9036L.toInteger(2);
        int integer2 = this.f9036L.toInteger(3);
        int i = 0;
        C0520le leVar = (C0520le) C1014.f6137.f1637.get(integer2);
        if (leVar == null) {
            r0 = null;
        } else {
            r0 = C1919.class.isAssignableFrom(leVar.getClass()) ? leVar : null;
        }
        if (r0 == null) {
            this.f9036L.pushNumber(0.0d);
            return 1;
        }
        C0520le leVar2 = (C0520le) C1014.f6137.f1637.get(integer2);
        if (leVar2 == null) {
            r02 = null;
        } else {
            r02 = C1919.class.isAssignableFrom(leVar2.getClass()) ? leVar2 : null;
        }
        C1919 r9 = r02;
        if (r02.f1634 == 0 && r9.f1631 == 0) {
            r9.f1634 = C1014.f6137.f1636.f1634;
            r9.f1631 = C1014.f6137.f1636.f1631;
        }
        switch (integer) {
            case 0:
                this.f9036L.pushNumber((double) C1014.f6137.f1636.f1630);
                i = 1;
                break;
            case 1:
                this.f9036L.pushNumber((double) r9.f1634);
                this.f9036L.pushNumber((double) r9.f1631);
                break;
            case 2:
                this.f9036L.pushNumber(0.0d);
                i = 1;
                break;
            case 3:
                this.f9036L.pushNumber((double) r9.f1635.ordinal());
                r9.f1635 = C0578ne.MOTION_STAND;
                i = 1;
                break;
            case 4:
                this.f9036L.pushNumber((double) r9.f8659);
                i = 1;
                break;
            case 5:
                if (r9.f8643 != null) {
                    this.f9036L.pushNumber((double) r9.f8643.f8698);
                } else {
                    this.f9036L.pushNumber(0.0d);
                }
                i = 1;
                break;
            case 6:
                C0377gm gmVar = (C0377gm) this.f7549.f8965.f6572.f6579.get(Integer.valueOf(this.f9036L.toInteger(4)));
                if (gmVar == null) {
                    this.f9036L.pushNumber(3.0d);
                } else {
                    this.f9036L.pushNumber((double) gmVar.f1048);
                }
                i = 1;
                break;
            case 7:
                if (this.f7549.f8965.f6559 == null) {
                    this.f9036L.pushNumber(1.0d);
                } else {
                    this.f9036L.pushNumber((double) (this.f7549.f8965.f6559.ordinal() + 1));
                }
                i = 1;
                break;
            case 8:
                this.f9036L.pushNumber((double) r9.f8635);
                i = 1;
                break;
            case 9:
                this.f9036L.pushNumber((double) r9.f8653);
                i = 1;
                break;
            case 10:
                this.f9036L.pushNumber((double) r9.f8647);
                i = 1;
                break;
            case 11:
                this.f9036L.pushNumber((double) r9.f8645);
                i = 1;
                break;
            case 12:
                this.f9036L.pushNumber(0.0d);
                i = 1;
                break;
            case 13:
            case 14:
                int integer3 = this.f9036L.toInteger(4);
                int integer4 = this.f9036L.toInteger(5);
                if (integer3 != 0 && integer4 != 0) {
                    if (((int) Math.sqrt(Math.pow((double) (r9.f1634 - ((C0520le) C1014.f6137.f1637.get(this.f7549.f8965.f6567.f6595)).f1634), 2.0d) + Math.pow((double) (r9.f1631 - ((C0520le) C1014.f6137.f1637.get(this.f7549.f8965.f6567.f6595)).f1631), 2.0d))) <= ((C0377gm) this.f7549.f8965.f6572.f6579.get(Integer.valueOf(integer3))).f1048) {
                        C1014.f6144.mo3652((C0839ue) new C1085(integer3, integer4, integer2));
                        break;
                    }
                } else {
                    this.f9036L.pushNumber((double) r9.f1634);
                    this.f9036L.pushNumber((double) r9.f1631);
                    break;
                }
                break;
        }
        i = 2;
        return i;
    }
}
