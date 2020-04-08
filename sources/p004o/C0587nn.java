package p004o;

/* renamed from: o.nn */
enum C0587nn {
    NUL(0),
    PC(1),
    MOB(2),
    PET(4),
    HOM(8),
    MER(16),
    ITEM(32),
    SKILL(64),
    NPC(128),
    CHAT(256),
    ELEM(512),
    ALL(4095);
    

    /* renamed from: 纫 */
    int f2850;

    static {
        C0587nn[] values = values();
        int i = -1;
        for (int i2 = 0; i2 < values.length; i2++) {
            if (values[i2].f2850 != 0) {
                i = values[i2].f2850;
            } else {
                values[i2].f2850 = i + 1;
                i++;
            }
        }
    }

    private C0587nn(int i) {
        this.f2850 = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final boolean mo4024() {
        return this == PC || this == MOB || this == HOM || this == MER || this == ELEM;
    }

    /* renamed from: 鷭 */
    static C0587nn m665(C0603oc ocVar) {
        C0587nn[] nnVarArr = {PC, MOB, ITEM, SKILL, CHAT, MOB, NPC, PET, HOM, MER, ELEM};
        if (ocVar.f2965 == -1) {
            C0252cp cpVar = C1014.f6158;
            return C0522lg.m563((int) ocVar.f2934);
        } else if (ocVar.f2965 < 0 || ocVar.f2965 >= ((byte) nnVarArr.length)) {
            return NPC;
        } else {
            return nnVarArr[ocVar.f2965];
        }
    }
}
