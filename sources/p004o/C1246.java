package p004o;

import java.util.Arrays;

/* renamed from: o.ˮ͈ */
enum C1246 {
    ACC_L(8),
    ACC_R(128),
    SHOES(64),
    GARMENT(4),
    HEAD_LOW(1),
    HEAD_MID(512),
    HEAD_TOP(256),
    ARMOR(16),
    HAND_L(32),
    HAND_R(2),
    AMMO(32768),
    HEAD_TOP_COSTUME(1024, HEAD_TOP),
    HEAD_MID_COSTUME(2048, HEAD_MID),
    HEAD_LOW_COSTUME(4096, HEAD_LOW),
    GARMENT_COSTUME(8192, GARMENT),
    ARMOR_COSTUME(65536, ARMOR),
    WEAPON_COSTUME(131072, HAND_R),
    SHIELD_COSTUME(262144, HAND_L),
    SHOES_COSTUME(524288, SHOES),
    ACC_R_COSTUME(2097152, ACC_R),
    ACC_L_COSTUME(1048576, ACC_L);
    

    /* renamed from: Ė */
    C1246 f6398;

    /* renamed from: 㥳 */
    int f6399;

    private C1246(int i) {
        this.f6399 = i;
    }

    private C1246(int i, C1246 r4) {
        this.f6399 = i;
        this.f6398 = r4;
    }

    /* renamed from: 鷭 */
    static C1246[] m2000(int i) {
        C1246[] values = values();
        C1246[] r2 = new C1246[values.length];
        int i2 = 0;
        C1246[] r6 = values;
        int length = values.length;
        for (int i3 = 0; i3 < length; i3++) {
            C1246 r1 = r6[i3];
            if ((r1.f6399 & i) > 0) {
                int i4 = i2;
                i2++;
                r2[i4] = r1;
            }
        }
        if (i2 > 0) {
            return (C1246[]) Arrays.copyOf(r2, i2);
        }
        return null;
    }
}
