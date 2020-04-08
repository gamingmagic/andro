package p004o;

/* renamed from: o.zx */
public enum C1011zx {
    VMSF_NONE(0),
    VMSF_E8(1),
    VMSF_E8E9(2),
    VMSF_ITANIUM(3),
    VMSF_RGB(4),
    VMSF_AUDIO(5),
    VMSF_DELTA(6),
    VMSF_UPCASE(7);
    

    /* renamed from: ˮ͍ */
    int f6121;

    private C1011zx(int i) {
        this.f6121 = i;
    }

    /* renamed from: 鷭 */
    public static C1011zx m1805(int i) {
        if (VMSF_NONE.f6121 == i) {
            return VMSF_NONE;
        }
        if (VMSF_E8.f6121 == i) {
            return VMSF_E8;
        }
        if (VMSF_E8E9.f6121 == i) {
            return VMSF_E8E9;
        }
        if (VMSF_ITANIUM.f6121 == i) {
            return VMSF_ITANIUM;
        }
        if (VMSF_RGB.f6121 == i) {
            return VMSF_RGB;
        }
        if (VMSF_AUDIO.f6121 == i) {
            return VMSF_AUDIO;
        }
        if (VMSF_DELTA.f6121 == i) {
            return VMSF_DELTA;
        }
        return null;
    }
}
