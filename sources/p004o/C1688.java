package p004o;

/* renamed from: o.璧 */
enum C1688 {
    NONE,
    SHORTSWORD,
    SWORD,
    TWOHANDSWORD,
    SPEAR,
    TWOHANDSPEAR,
    AXE,
    TWOHANDAXE,
    MACE,
    TWOHANDMACE,
    ROD,
    BOW,
    KNUKLE,
    INSTRUMENT,
    WHIP,
    BOOK,
    CATARRH,
    WPCLASS_GUN_HANDGUN,
    WPCLASS_GUN_RIFLE,
    WPCLASS_GUN_GATLING,
    WPCLASS_GUN_SHOTGUN,
    WPCLASS_GUN_GRANADE,
    WPCLASS_SYURIKEN,
    WPCLASS_TWOHANDROD,
    WPCLASS_LAST,
    SHORTSWORD_SHORTSWORD,
    SWORD_SWORD,
    AXE_AXE,
    SHORTSWORD_SWORD,
    SHORTSWORD_AXE,
    SWORD_AXE;

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final C1688 mo4458() {
        switch (m2357()[ordinal()]) {
            case 26:
            case 29:
            case 30:
                return SHORTSWORD;
            case 27:
            case 31:
                return SWORD;
            case 28:
                return AXE;
            default:
                return this;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final C1688 mo4457() {
        switch (m2357()[ordinal()]) {
            case 26:
                return SHORTSWORD;
            case 27:
            case 29:
                return SWORD;
            case 28:
            case 30:
            case 31:
                return AXE;
            default:
                return null;
        }
    }
}
