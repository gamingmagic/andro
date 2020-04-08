package p004o;

import org.keplerproject.luajava.JavaFunction;
import org.keplerproject.luajava.LuaState;

/* renamed from: o.욝 */
class C1996 extends JavaFunction {

    /* renamed from: 櫯 */
    private static /* synthetic */ int[] f8861;

    /* renamed from: 鷭 */
    final /* synthetic */ C2045 f8862;

    C1996(C2045 r1, LuaState luaState) {
        this.f8862 = r1;
        super(luaState);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(22:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|(2:22|23)|24|26) */
    /* JADX WARNING: Can't wrap try/catch for region: R(23:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0035 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0049 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0053 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x005e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0069 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m2670() {
        /*
            int[] r0 = f8861
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.mv[] r0 = p004o.C0568mv.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.mv r0 = p004o.C0568mv.ATTACK_AREA_CMD     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.mv r0 = p004o.C0568mv.ATTACK_OBJECT_CMD     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.mv r0 = p004o.C0568mv.FOLLOW_CMD     // Catch:{ NoSuchFieldError -> 0x002b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
            r1 = 10
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002b }
        L_0x002b:
            o.mv r0 = p004o.C0568mv.HOLD_CMD     // Catch:{ NoSuchFieldError -> 0x0035 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = 7
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            o.mv r0 = p004o.C0568mv.MOVE_CMD     // Catch:{ NoSuchFieldError -> 0x003f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003f }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x003f }
        L_0x003f:
            o.mv r0 = p004o.C0568mv.NONE_CMD     // Catch:{ NoSuchFieldError -> 0x0049 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0049 }
        L_0x0049:
            o.mv r0 = p004o.C0568mv.PATROL_CMD     // Catch:{ NoSuchFieldError -> 0x0053 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
            r1 = 6
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0053 }
        L_0x0053:
            o.mv r0 = p004o.C0568mv.SKILL_AREA_CMD     // Catch:{ NoSuchFieldError -> 0x005e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
            r1 = 9
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x005e }
        L_0x005e:
            o.mv r0 = p004o.C0568mv.SKILL_OBJECT_CMD     // Catch:{ NoSuchFieldError -> 0x0069 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
            r1 = 8
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0069 }
        L_0x0069:
            o.mv r0 = p004o.C0568mv.STOP_CMD     // Catch:{ NoSuchFieldError -> 0x0073 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0073 }
        L_0x0073:
            f8861 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1996.m2670():int[]");
    }

    public final int execute() {
        int integer = this.f9036L.toInteger(2);
        this.f9036L.newTable();
        C1302if ifVar = this.f8862.f8965;
        if (integer == 0 || ifVar == null || integer != this.f8862.f8965.f6567.f6595) {
            return 0;
        }
        int i = this.f8862.f8965.f6571;
        switch (m2670()[this.f8862.f8965.f6560.ordinal()]) {
            case 1:
            case 3:
            case 7:
            case 10:
                this.f9036L.pushNumber(1.0d);
                this.f9036L.pushNumber((double) this.f8862.f8965.f6560.ordinal());
                this.f9036L.setTable(-3);
                break;
            case 2:
                this.f9036L.pushNumber(1.0d);
                this.f9036L.pushNumber((double) this.f8862.f8965.f6560.ordinal());
                this.f9036L.setTable(-3);
                this.f9036L.pushNumber(2.0d);
                this.f9036L.pushNumber((double) ifVar.f6555);
                this.f9036L.setTable(-3);
                this.f9036L.pushNumber(3.0d);
                this.f9036L.pushNumber((double) ifVar.f6556);
                this.f9036L.setTable(-3);
                break;
            case 4:
                this.f9036L.pushNumber(1.0d);
                this.f9036L.pushNumber((double) this.f8862.f8965.f6560.ordinal());
                this.f9036L.setTable(-3);
                this.f9036L.pushNumber(2.0d);
                this.f9036L.pushNumber((double) i);
                this.f9036L.setTable(-3);
                break;
            case 8:
                this.f9036L.pushNumber(1.0d);
                this.f9036L.pushNumber((double) this.f8862.f8965.f6560.ordinal());
                this.f9036L.setTable(-3);
                this.f9036L.pushNumber(2.0d);
                this.f9036L.pushNumber((double) ifVar.f6577);
                this.f9036L.setTable(-3);
                this.f9036L.pushNumber(3.0d);
                this.f9036L.pushNumber((double) ifVar.f6557);
                this.f9036L.setTable(-3);
                this.f9036L.pushNumber(4.0d);
                this.f9036L.pushNumber((double) i);
                this.f9036L.setTable(-3);
                break;
            case 9:
                this.f9036L.pushNumber(1.0d);
                this.f9036L.pushNumber((double) this.f8862.f8965.f6560.ordinal());
                this.f9036L.setTable(-3);
                this.f9036L.pushNumber(1.0d);
                this.f9036L.pushNumber((double) ifVar.f6577);
                this.f9036L.setTable(-3);
                this.f9036L.pushNumber(2.0d);
                this.f9036L.pushNumber((double) ifVar.f6557);
                this.f9036L.setTable(-3);
                this.f9036L.pushNumber(3.0d);
                this.f9036L.pushNumber((double) ifVar.f6555);
                this.f9036L.setTable(-3);
                this.f9036L.pushNumber(4.0d);
                this.f9036L.pushNumber((double) ifVar.f6556);
                this.f9036L.setTable(-3);
                break;
        }
        this.f8862.f8965.f6560 = C0568mv.NONE_CMD;
        return 1;
    }
}
