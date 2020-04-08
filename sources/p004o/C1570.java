package p004o;

import android.support.p000v4.view.MotionEventCompat;
import org.apache.commons.net.finger.FingerClient;
import org.apache.commons.net.tftp.TFTP;
import org.apache.http.HttpStatus;

/* renamed from: o.庸 */
enum C1570 {
    NOVICE,
    SWORDMAN,
    MAGE,
    ARCHER,
    ACOLYTE,
    MERCHANT,
    THIEF,
    SUPER_NOVICE,
    TAEKWON,
    WEDDING,
    GUNSLINGER,
    NINJA,
    XMAS,
    SUMMER,
    HANBOK,
    GANGSI,
    OKTOBERFEST,
    SUMMONER,
    KNIGHT(257),
    WIZARD,
    HUNTER,
    PRIEST,
    BLACKSMITH,
    ASSASSIN,
    SUPER_NOVICE_E,
    STAR_GLADIATOR,
    REBELLION(266),
    KAGEROU_OBORO(267),
    DEATH_KNIGHT(270),
    CRUSADER(513),
    SAGE,
    BARDDANCER,
    MONK,
    ALCHEMIST,
    ROGUE,
    SOUL_LINKER(520),
    DARK_COLLECTOR(526),
    NOVICE_HIGH(4096),
    SWORDMAN_HIGH,
    MAGE_HIGH,
    ARCHER_HIGH,
    ACOLYTE_HIGH,
    MERCHANT_HIGH,
    THIEF_HIGH,
    LORD_KNIGHT(4353),
    HIGH_WIZARD,
    SNIPER,
    HIGH_PRIEST,
    WHITESMITH,
    ASSASSIN_CROSS,
    PALADIN(4609),
    PROFESSOR,
    CLOWNGYPSY,
    CHAMPION,
    CREATOR,
    STALKER,
    BABY(8192),
    BABY_SWORDMAN,
    BABY_MAGE,
    BABY_ARCHER,
    BABY_ACOLYTE,
    BABY_MERCHANT,
    BABY_THIEF,
    SUPER_BABY,
    BABY_KNIGHT(8449),
    BABY_WIZARD,
    BABY_HUNTER,
    BABY_PRIEST,
    BABY_BLACKSMITH,
    BABY_ASSASSIN,
    SUPER_BABY_E,
    BABY_CRUSADER(8705),
    BABY_SAGE,
    BABY_BARDDANCER,
    BABY_MONK,
    BABY_ALCHEMIST,
    BABY_ROGUE,
    RUNE_KNIGHT(16641),
    WARLOCK,
    RANGER,
    ARCH_BISHOP,
    MECHANIC,
    GUILLOTINE_CROSS,
    ROYAL_GUARD(16897),
    SORCERER,
    MINSTRELWANDERER,
    SURA,
    GENETIC,
    SHADOW_CHASER,
    RUNE_KNIGHT_T(20737),
    WARLOCK_T,
    RANGER_T,
    ARCH_BISHOP_T,
    MECHANIC_T,
    GUILLOTINE_CROSS_T,
    ROYAL_GUARD_T(20993),
    SORCERER_T,
    MINSTRELWANDERER_T,
    SURA_T,
    GENETIC_T,
    SHADOW_CHASER_T,
    BABY_RUNE(24833),
    BABY_WARLOCK,
    BABY_RANGER,
    BABY_BISHOP,
    BABY_MECHANIC,
    BABY_CROSS,
    BABY_GUARD(25089),
    BABY_SORCERER,
    BABY_MINSTRELWANDERER,
    BABY_SURA,
    BABY_GENETIC,
    BABY_CHASER;
    

    /* renamed from: ű */
    int f7485;

    static {
        C1570[] values = values();
        int i = -1;
        for (int i2 = 0; i2 < values.length; i2++) {
            if (values[i2].f7485 != 0) {
                i = values[i2].f7485;
            } else {
                values[i2].f7485 = i + 1;
                i++;
            }
        }
    }

    private C1570(int i) {
        this.f7485 = i;
    }

    /* renamed from: 鷭 */
    static C1570 m2254(int i) {
        C1570[] values = values();
        for (int i2 = 0; i2 < values.length; i2++) {
            if (values[i2].f7485 == i) {
                return values[i2];
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final C1570 mo4397() {
        return m2254(this.f7485 & -4097);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final C1570 mo4396() {
        return m2254(this.f7485 & 255);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˮ͈ */
    public final C1570 mo4395() {
        return m2254(this.f7485 & 4095);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final C1761 mo4398(C1977 r3) {
        switch (m2253()[ordinal()]) {
            case 1:
                return C1761.NOVICE;
            case 2:
                return C1761.SWORDMAN;
            case 3:
                return C1761.MAGE;
            case 4:
                return C1761.ARCHER;
            case 5:
                return C1761.ACOLYTE;
            case 6:
                return C1761.MERCHANT;
            case 7:
                return C1761.THIEF;
            case 8:
                return C1761.SUPER_NOVICE;
            case 9:
                return C1761.TAEKWON;
            case 10:
                return C1761.WEDDING;
            case 11:
                return C1761.GUNSLINGER;
            case 12:
                return C1761.NINJA;
            case 13:
                return C1761.XMAS;
            case 14:
                return C1761.SUMMER;
            case 15:
                return C1761.HANBOK;
            case 16:
                return C1761.GANGSI;
            case 17:
                return C1761.OKTOBERFEST;
            case 18:
                return C1761.SUMMONER;
            case 19:
                return C1761.KNIGHT;
            case 20:
                return C1761.WIZARD;
            case 21:
                return C1761.HUNTER;
            case 22:
                return C1761.PRIEST;
            case 23:
                return C1761.BLACKSMITH;
            case 24:
                return C1761.ASSASSIN;
            case 25:
                return C1761.SUPER_NOVICE_E;
            case 26:
                return C1761.STAR_GLADIATOR;
            case 27:
                return C1761.REBELLION;
            case 28:
                return r3 == C1977.MALE ? C1761.KAGEROU : C1761.OBORO;
            case 29:
                return C1761.DEATH_KNIGHT;
            case 30:
                return C1761.CRUSADER;
            case 31:
                return C1761.SAGE;
            case 32:
                return r3 == C1977.MALE ? C1761.BARD : C1761.DANCER;
            case 33:
                return C1761.MONK;
            case 34:
                return C1761.ALCHEMIST;
            case 35:
                return C1761.ROGUE;
            case 36:
                return C1761.SOUL_LINKER;
            case 37:
                return C1761.DARK_COLLECTOR;
            case 38:
                return C1761.NOVICE_HIGH;
            case 39:
                return C1761.SWORDMAN_HIGH;
            case MotionEventCompat.AXIS_GENERIC_9 /*40*/:
                return C1761.MAGE_HIGH;
            case MotionEventCompat.AXIS_GENERIC_10 /*41*/:
                return C1761.ARCHER_HIGH;
            case MotionEventCompat.AXIS_GENERIC_11 /*42*/:
                return C1761.ACOLYTE_HIGH;
            case 43:
                return C1761.MERCHANT_HIGH;
            case MotionEventCompat.AXIS_GENERIC_13 /*44*/:
                return C1761.THIEF_HIGH;
            case MotionEventCompat.AXIS_GENERIC_14 /*45*/:
                return C1761.LORD_KNIGHT;
            case MotionEventCompat.AXIS_GENERIC_15 /*46*/:
                return C1761.HIGH_WIZARD;
            case MotionEventCompat.AXIS_GENERIC_16 /*47*/:
                return C1761.SNIPER;
            case 48:
                return C1761.HIGH_PRIEST;
            case 49:
                return C1761.WHITESMITH;
            case 50:
                return C1761.ASSASSIN_CROSS;
            case 51:
                return C1761.PALADIN;
            case 52:
                return C1761.PROFESSOR;
            case 53:
                return r3 == C1977.MALE ? C1761.CLOWN : C1761.GYPSY;
            case 54:
                return C1761.CHAMPION;
            case 55:
                return C1761.CREATOR;
            case 56:
                return C1761.STALKER;
            case 57:
                return C1761.BABY;
            case 58:
                return C1761.BABY_SWORDMAN;
            case 59:
                return C1761.BABY_MAGE;
            case 60:
                return C1761.BABY_ARCHER;
            case 61:
                return C1761.BABY_ACOLYTE;
            case 62:
                return C1761.BABY_MERCHANT;
            case 63:
                return C1761.BABY_THIEF;
            case 64:
                return C1761.SUPER_BABY;
            case 65:
                return C1761.BABY_KNIGHT;
            case 66:
                return C1761.BABY_WIZARD;
            case 67:
                return C1761.BABY_HUNTER;
            case 68:
                return C1761.BABY_PRIEST;
            case TFTP.DEFAULT_PORT /*69*/:
                return C1761.BABY_BLACKSMITH;
            case 70:
                return C1761.BABY_ASSASSIN;
            case 71:
                return C1761.SUPER_BABY_E;
            case 72:
                return C1761.BABY_CRUSADER;
            case 73:
                return C1761.BABY_SAGE;
            case 74:
                return r3 == C1977.MALE ? C1761.BABY_BARD : C1761.BABY_DANCER;
            case 75:
                return C1761.BABY_MONK;
            case 76:
                return C1761.BABY_ALCHEMIST;
            case 77:
                return C1761.BABY_ROGUE;
            case 78:
                return C1761.RUNE_KNIGHT;
            case FingerClient.DEFAULT_PORT /*79*/:
                return C1761.WARLOCK;
            case C0840uf.f5034 /*80*/:
                return C1761.RANGER;
            case 81:
                return C1761.ARCH_BISHOP;
            case 82:
                return C1761.MECHANIC;
            case 83:
                return C1761.GUILLOTINE_CROSS;
            case 84:
                return C1761.ROYAL_GUARD;
            case 85:
                return C1761.SORCERER;
            case 86:
                return r3 == C1977.MALE ? C1761.MINSTREL : C1761.WANDERER;
            case 87:
                return C1761.SURA;
            case 88:
                return C1761.GENETIC;
            case 89:
                return C1761.SHADOW_CHASER;
            case 90:
                return C1761.RUNE_KNIGHT_T;
            case 91:
                return C1761.WARLOCK_T;
            case 92:
                return C1761.RANGER_T;
            case 93:
                return C1761.ARCH_BISHOP_T;
            case 94:
                return C1761.MECHANIC_T;
            case 95:
                return C1761.GUILLOTINE_CROSS_T;
            case 96:
                return C1761.ROYAL_GUARD_T;
            case 97:
                return C1761.SORCERER_T;
            case 98:
                return r3 == C1977.MALE ? C1761.MINSTREL_T : C1761.WANDERER_T;
            case 99:
                return C1761.SURA_T;
            case 100:
                return C1761.GENETIC_T;
            case HttpStatus.SC_SWITCHING_PROTOCOLS /*101*/:
                return C1761.SHADOW_CHASER_T;
            case HttpStatus.SC_PROCESSING /*102*/:
                return C1761.BABY_RUNE;
            case 103:
                return C1761.BABY_WARLOCK;
            case 104:
                return C1761.BABY_RANGER;
            case 105:
                return C1761.BABY_BISHOP;
            case 106:
                return C1761.BABY_MECHANIC;
            case 107:
                return C1761.BABY_CROSS;
            case 108:
                return C1761.BABY_GUARD;
            case 109:
                return C1761.BABY_SORCERER;
            case 110:
                return r3 == C1977.MALE ? C1761.BABY_MINSTREL : C1761.BABY_WANDERER;
            case 111:
                return C1761.BABY_SURA;
            case 112:
                return C1761.BABY_GENETIC;
            case 113:
                return C1761.BABY_CHASER;
            default:
                return null;
        }
    }
}
