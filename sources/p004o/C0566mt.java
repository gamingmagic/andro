package p004o;

/* renamed from: o.mt */
enum C0566mt {
    LIF(6001),
    AMISTR(6002),
    FILIR(6003),
    VANILMIRTH(6004),
    LIF2(6005),
    AMISTR2(6006),
    FILIR2(6007),
    VANILMIRTH2(6008),
    LIF_H(6009),
    AMISTR_H(6010),
    FILIR_H(6011),
    VANILMIRTH_H(6012),
    LIF_H2(6013),
    AMISTR_H2(6014),
    FILIR_H2(6015),
    VANILMIRTH_H2(6016);
    

    /* renamed from: 庸 */
    int f1974;

    private C0566mt(int i) {
        this.f1974 = i;
    }

    /* renamed from: 鷭 */
    static C0566mt m661(int i) {
        C0566mt[] values;
        for (C0566mt mtVar : values()) {
            if (i == mtVar.f1974) {
                return mtVar;
            }
        }
        return null;
    }
}
