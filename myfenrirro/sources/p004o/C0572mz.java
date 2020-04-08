package p004o;

/* renamed from: o.mz */
enum C0572mz {
    USABLE,
    EQUIP,
    ETC,
    CART;

    /* renamed from: 鷭 */
    static C0572mz m662(C1472 r2) {
        switch (m663()[r2.ordinal()]) {
            case 1:
            case 3:
            case 7:
            case 12:
            case 19:
                return USABLE;
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            case 16:
            case 17:
            case 18:
            case 20:
                return EQUIP;
            default:
                return ETC;
        }
    }
}
