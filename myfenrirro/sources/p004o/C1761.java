package p004o;

import android.support.p000v4.media.TransportMediator;
import android.support.p000v4.view.MotionEventCompat;
import org.apache.commons.net.finger.FingerClient;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.nntp.NNTP;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.apache.commons.net.tftp.TFTP;
import org.apache.http.HttpStatus;

/* renamed from: o.躆 */
enum C1761 {
    NOVICE(0),
    SWORDMAN,
    MAGE,
    ARCHER,
    ACOLYTE,
    MERCHANT,
    THIEF,
    KNIGHT,
    PRIEST,
    WIZARD,
    BLACKSMITH,
    HUNTER,
    ASSASSIN,
    KNIGHT2,
    CRUSADER,
    MONK,
    SAGE,
    ROGUE,
    ALCHEMIST,
    BARD,
    DANCER,
    CRUSADER2,
    WEDDING,
    SUPER_NOVICE,
    GUNSLINGER,
    NINJA,
    XMAS,
    SUMMER,
    HANBOK,
    OKTOBERFEST,
    MAX_BASIC,
    NOVICE_HIGH(4001),
    SWORDMAN_HIGH,
    MAGE_HIGH,
    ARCHER_HIGH,
    ACOLYTE_HIGH,
    MERCHANT_HIGH,
    THIEF_HIGH,
    LORD_KNIGHT,
    HIGH_PRIEST,
    HIGH_WIZARD,
    WHITESMITH,
    SNIPER,
    ASSASSIN_CROSS,
    LORD_KNIGHT2,
    PALADIN,
    CHAMPION,
    PROFESSOR,
    STALKER,
    CREATOR,
    CLOWN,
    GYPSY,
    PALADIN2,
    BABY,
    BABY_SWORDMAN,
    BABY_MAGE,
    BABY_ARCHER,
    BABY_ACOLYTE,
    BABY_MERCHANT,
    BABY_THIEF,
    BABY_KNIGHT,
    BABY_PRIEST,
    BABY_WIZARD,
    BABY_BLACKSMITH,
    BABY_HUNTER,
    BABY_ASSASSIN,
    BABY_KNIGHT2,
    BABY_CRUSADER,
    BABY_MONK,
    BABY_SAGE,
    BABY_ROGUE,
    BABY_ALCHEMIST,
    BABY_BARD,
    BABY_DANCER,
    BABY_CRUSADER2,
    SUPER_BABY,
    TAEKWON,
    STAR_GLADIATOR,
    STAR_GLADIATOR2,
    SOUL_LINKER,
    GANGSI,
    DEATH_KNIGHT,
    DARK_COLLECTOR,
    RUNE_KNIGHT(4054),
    WARLOCK,
    RANGER,
    ARCH_BISHOP,
    MECHANIC,
    GUILLOTINE_CROSS,
    RUNE_KNIGHT_T,
    WARLOCK_T,
    RANGER_T,
    ARCH_BISHOP_T,
    MECHANIC_T,
    GUILLOTINE_CROSS_T,
    ROYAL_GUARD,
    SORCERER,
    MINSTREL,
    WANDERER,
    SURA,
    GENETIC,
    SHADOW_CHASER,
    ROYAL_GUARD_T,
    SORCERER_T,
    MINSTREL_T,
    WANDERER_T,
    SURA_T,
    GENETIC_T,
    SHADOW_CHASER_T,
    RUNE_KNIGHT2,
    RUNE_KNIGHT_T2,
    ROYAL_GUARD2,
    ROYAL_GUARD_T2,
    RANGER2,
    RANGER_T2,
    MECHANIC2,
    MECHANIC_T2,
    BABY_RUNE(4096),
    BABY_WARLOCK,
    BABY_RANGER,
    BABY_BISHOP,
    BABY_MECHANIC,
    BABY_CROSS,
    BABY_GUARD,
    BABY_SORCERER,
    BABY_MINSTREL,
    BABY_WANDERER,
    BABY_SURA,
    BABY_GENETIC,
    BABY_CHASER,
    BABY_RUNE2,
    BABY_GUARD2,
    BABY_RANGER2,
    BABY_MECHANIC2,
    FROG_NINJA(4114),
    PECO_GUNNER(4115),
    PECO_SWORD(4116),
    FROG_LINKER(4117),
    PIG_WHITESMITH(4118),
    PIG_MERCHANT(4119),
    PIG_GENETIC(4120),
    PIG_CREATOR(4121),
    OSTRICH_ARCHER(4122),
    PORING_STAR(4123),
    PORING_NOVICE(4124),
    SHEEP_MONK(4125),
    SHEEP_ACO(4126),
    SHEEP_SURA(4127),
    PORING_SNOVICE(4128),
    SHEEP_ARCB(4129),
    FOX_MAGICIAN(4130),
    FOX_SAGE(4131),
    FOX_SORCERER(4132),
    FOX_WARLOCK(4133),
    FOX_WIZ(4134),
    FOX_PROF(4135),
    FOX_HWIZ(4136),
    PIG_ALCHE(4137),
    PIG_BLACKSMITH(4138),
    SHEEP_CHAMP(4139),
    DOG_G_CROSS(4140),
    DOG_THIEF(4141),
    DOG_ROGUE(4142),
    DOG_CHASER(4143),
    DOG_STALKER(4144),
    DOG_ASSASSIN(4145),
    DOG_ASSA_X(4146),
    OSTRICH_DANCER(4147),
    OSTRICH_MINSTREL(4148),
    OSTRICH_BARD(4149),
    OSTRICH_SNIPER(4150),
    OSTRICH_WANDER(4151),
    OSTRICH_GIPSI(4152),
    OSTRICH_CROWN(4153),
    OSTRICH_HUNTER(4154),
    PORING_TAEKWON(4155),
    SHEEP_PRIEST(4156),
    SHEEP_HPRIEST(4157),
    PORING_NOVICE_B(4158),
    PECO_SWORD_B(4159),
    FOX_MAGICIAN_B(4160),
    OSTRICH_ARCHER_B(4161),
    SHEEP_ACO_B(4162),
    PIG_MERCHANT_B(4163),
    OSTRICH_HUNTER_B(4164),
    DOG_ASSASSIN_B(4165),
    SHEEP_MONK_B(4166),
    FOX_SAGE_B(4167),
    DOG_ROGUE_B(4168),
    PIG_ALCHE_B(4169),
    OSTRICH_BARD_B(4170),
    OSTRICH_DANCER_B(4171),
    PORING_SNOVICE_B(4172),
    FOX_WARLOCK_B(4173),
    SHEEP_ARCB_B(4174),
    DOG_G_CROSS_B(4175),
    FOX_SORCERER_B(4176),
    OSTRICH_MINSTREL_B(4177),
    OSTRICH_WANDER_B(4178),
    SHEEP_SURA_B(4179),
    PIG_GENETIC_B(4180),
    DOG_THIEF_B(4181),
    DOG_CHASER_B(4182),
    PORING_NOVICE_H(4183),
    PECO_SWORD_H(4184),
    FOX_MAGICIAN_H(4185),
    OSTRICH_ARCHER_H(4186),
    SHEEP_ACO_H(4187),
    PIG_MERCHANT_H(4188),
    DOG_THIEF_H(4189),
    SUPER_NOVICE_E(4190),
    SUPER_BABY_E,
    PORING_SNOVICE2(4192),
    PORING_SNOVICE2_B(4193),
    SHEEP_PRIEST_B(4194),
    FOX_WIZ_B(4195),
    PIG_MECHANIC(4197),
    OSTRICH_RANGER,
    LION_KNIGHT,
    LION_KNIGHT_H,
    LION_ROYAL_GUARD,
    LION_RUNE_KNIGHT,
    LION_CRUSADER,
    LION_CRUSADER_H,
    PIG_MECHANIC_B(4205),
    OSTRICH_RANGER_B(4206),
    LION_KNIGHT_B,
    LION_ROYAL_GUARD_B,
    LION_RUNE_KNIGHT_B,
    LION_CRUSADER_B,
    KAGEROU(4211),
    OBORO,
    FROG_KAGEROU(4213),
    FROG_OBORO(4214),
    REBELLION(4215),
    PECO_REBELLION(41201),
    SUMMONER(4218),
    MAX,
    GAMEMASTER(99999);
    

    /* renamed from: Ǳ */
    static C1761[] f8164;

    /* renamed from: 䑎 */
    static C1761[] f8214;

    /* renamed from: ǯ */
    int f8294;

    static {
        C1761[] values = values();
        int i = -1;
        for (int i2 = 0; i2 < values.length; i2++) {
            if (values[i2].f8294 != 0) {
                i = values[i2].f8294;
            } else {
                values[i2].f8294 = i + 1;
                i++;
            }
        }
        f8214 = new C1761[]{KNIGHT2, KNIGHT, CRUSADER2, CRUSADER, BABY_KNIGHT2, BABY_KNIGHT, BABY_CRUSADER2, BABY_CRUSADER, LORD_KNIGHT2, LORD_KNIGHT, PALADIN2, PALADIN, RUNE_KNIGHT2, RUNE_KNIGHT, RUNE_KNIGHT_T2, RUNE_KNIGHT_T, BABY_RUNE2, BABY_RUNE, ROYAL_GUARD2, ROYAL_GUARD, ROYAL_GUARD_T2, ROYAL_GUARD_T, BABY_GUARD2, BABY_GUARD, MECHANIC2, MECHANIC, MECHANIC_T2, MECHANIC_T, BABY_MECHANIC2, BABY_MECHANIC, RANGER2, RANGER, RANGER_T2, RANGER_T, BABY_RANGER2, BABY_RANGER};
        C1761[] r0 = new C1761[FTPReply.CLOSING_DATA_CONNECTION];
        r0[0] = FROG_NINJA;
        r0[1] = NINJA;
        r0[2] = PECO_GUNNER;
        r0[3] = GUNSLINGER;
        r0[4] = PECO_SWORD;
        r0[5] = SWORDMAN;
        r0[6] = PECO_SWORD_B;
        r0[7] = BABY_SWORDMAN;
        r0[8] = PECO_SWORD_H;
        r0[9] = SWORDMAN_HIGH;
        r0[10] = FROG_LINKER;
        r0[11] = SOUL_LINKER;
        r0[12] = PIG_WHITESMITH;
        r0[13] = WHITESMITH;
        r0[14] = PIG_MERCHANT;
        r0[15] = MERCHANT;
        r0[16] = PIG_MERCHANT_B;
        r0[17] = BABY_MERCHANT;
        r0[18] = PIG_MERCHANT_H;
        r0[19] = MERCHANT_HIGH;
        r0[20] = PIG_GENETIC;
        r0[21] = GENETIC;
        r0[22] = PIG_GENETIC;
        r0[23] = GENETIC_T;
        r0[24] = PIG_GENETIC_B;
        r0[25] = BABY_GENETIC;
        r0[26] = PIG_CREATOR;
        r0[27] = CREATOR;
        r0[28] = OSTRICH_ARCHER;
        r0[29] = ARCHER;
        r0[30] = OSTRICH_ARCHER_B;
        r0[31] = BABY_ARCHER;
        r0[32] = OSTRICH_ARCHER_H;
        r0[33] = ARCHER_HIGH;
        r0[34] = PORING_STAR;
        r0[35] = STAR_GLADIATOR;
        r0[36] = PORING_STAR;
        r0[37] = STAR_GLADIATOR2;
        r0[38] = PORING_NOVICE;
        r0[39] = NOVICE;
        r0[40] = PORING_NOVICE_B;
        r0[41] = BABY;
        r0[42] = PORING_NOVICE_H;
        r0[43] = NOVICE_HIGH;
        r0[44] = SHEEP_MONK;
        r0[45] = MONK;
        r0[46] = SHEEP_MONK_B;
        r0[47] = BABY_MONK;
        r0[48] = SHEEP_ACO;
        r0[49] = ACOLYTE;
        r0[50] = SHEEP_ACO_B;
        r0[51] = BABY_ACOLYTE;
        r0[52] = SHEEP_ACO_H;
        r0[53] = ACOLYTE_HIGH;
        r0[54] = SHEEP_SURA;
        r0[55] = SURA;
        r0[56] = SHEEP_SURA;
        r0[57] = SURA_T;
        r0[58] = SHEEP_SURA_B;
        r0[59] = BABY_SURA;
        r0[60] = PORING_SNOVICE;
        r0[61] = SUPER_NOVICE;
        r0[62] = PORING_SNOVICE2;
        r0[63] = SUPER_NOVICE_E;
        r0[64] = PORING_SNOVICE_B;
        r0[65] = SUPER_BABY;
        r0[66] = PORING_SNOVICE2_B;
        r0[67] = SUPER_BABY_E;
        r0[68] = SHEEP_ARCB;
        r0[69] = ARCH_BISHOP;
        r0[70] = SHEEP_ARCB_B;
        r0[71] = BABY_BISHOP;
        r0[72] = SHEEP_ARCB;
        r0[73] = ARCH_BISHOP_T;
        r0[74] = SHEEP_ARCB_B;
        r0[75] = BABY_BISHOP;
        r0[76] = FOX_MAGICIAN;
        r0[77] = MAGE;
        r0[78] = FOX_MAGICIAN_H;
        r0[79] = MAGE_HIGH;
        r0[80] = FOX_MAGICIAN_H;
        r0[81] = BABY_MAGE;
        r0[82] = FOX_SAGE;
        r0[83] = SAGE;
        r0[84] = FOX_SAGE_B;
        r0[85] = BABY_SAGE;
        r0[86] = FOX_SORCERER;
        r0[87] = SORCERER;
        r0[88] = FOX_SORCERER_B;
        r0[89] = BABY_SORCERER;
        r0[90] = FOX_SORCERER;
        r0[91] = SORCERER_T;
        r0[92] = FOX_WARLOCK;
        r0[93] = WARLOCK;
        r0[94] = FOX_WARLOCK;
        r0[95] = WARLOCK_T;
        r0[96] = FOX_WARLOCK;
        r0[97] = BABY_WARLOCK;
        r0[98] = FOX_WIZ;
        r0[99] = WIZARD;
        r0[100] = FOX_WIZ_B;
        r0[101] = BABY_WIZARD;
        r0[102] = FOX_PROF;
        r0[103] = PROFESSOR;
        r0[104] = FOX_HWIZ;
        r0[105] = HIGH_WIZARD;
        r0[106] = PIG_ALCHE;
        r0[107] = ALCHEMIST;
        r0[108] = PIG_ALCHE_B;
        r0[109] = BABY_ALCHEMIST;
        r0[110] = PIG_BLACKSMITH;
        r0[111] = BLACKSMITH;
        r0[112] = SHEEP_CHAMP;
        r0[113] = CHAMPION;
        r0[114] = DOG_G_CROSS;
        r0[115] = GUILLOTINE_CROSS;
        r0[116] = DOG_G_CROSS;
        r0[117] = GUILLOTINE_CROSS_T;
        r0[118] = DOG_G_CROSS_B;
        r0[119] = BABY_CROSS;
        r0[120] = DOG_THIEF;
        r0[121] = THIEF;
        r0[122] = DOG_THIEF_H;
        r0[123] = THIEF_HIGH;
        r0[124] = DOG_THIEF_B;
        r0[125] = BABY_THIEF;
        r0[126] = DOG_ROGUE;
        r0[127] = ROGUE;
        r0[128] = DOG_ROGUE_B;
        r0[129] = BABY_ROGUE;
        r0[130] = DOG_CHASER;
        r0[131] = SHADOW_CHASER;
        r0[132] = DOG_CHASER;
        r0[133] = SHADOW_CHASER_T;
        r0[134] = DOG_CHASER_B;
        r0[135] = BABY_CHASER;
        r0[136] = DOG_STALKER;
        r0[137] = STALKER;
        r0[138] = DOG_ASSASSIN;
        r0[139] = ASSASSIN;
        r0[140] = DOG_ASSASSIN_B;
        r0[141] = BABY_ASSASSIN;
        r0[142] = DOG_ASSA_X;
        r0[143] = ASSASSIN_CROSS;
        r0[144] = OSTRICH_DANCER;
        r0[145] = DANCER;
        r0[146] = OSTRICH_DANCER_B;
        r0[147] = BABY_DANCER;
        r0[148] = OSTRICH_MINSTREL;
        r0[149] = MINSTREL;
        r0[150] = OSTRICH_MINSTREL;
        r0[151] = MINSTREL_T;
        r0[152] = OSTRICH_MINSTREL_B;
        r0[153] = BABY_MINSTREL;
        r0[154] = OSTRICH_BARD;
        r0[155] = BARD;
        r0[156] = OSTRICH_BARD_B;
        r0[157] = BABY_BARD;
        r0[158] = OSTRICH_SNIPER;
        r0[159] = SNIPER;
        r0[160] = OSTRICH_WANDER;
        r0[161] = WANDERER;
        r0[162] = OSTRICH_WANDER;
        r0[163] = WANDERER_T;
        r0[164] = OSTRICH_WANDER_B;
        r0[165] = BABY_WANDERER;
        r0[166] = OSTRICH_GIPSI;
        r0[167] = GYPSY;
        r0[168] = OSTRICH_CROWN;
        r0[169] = CLOWN;
        r0[170] = OSTRICH_HUNTER;
        r0[171] = HUNTER;
        r0[172] = OSTRICH_HUNTER_B;
        r0[173] = BABY_HUNTER;
        r0[174] = PORING_TAEKWON;
        r0[175] = TAEKWON;
        r0[176] = SHEEP_PRIEST;
        r0[177] = PRIEST;
        r0[178] = SHEEP_PRIEST_B;
        r0[179] = BABY_PRIEST;
        r0[180] = SHEEP_HPRIEST;
        r0[181] = HIGH_PRIEST;
        r0[182] = PIG_MECHANIC;
        r0[183] = MECHANIC;
        r0[184] = PIG_MECHANIC;
        r0[185] = MECHANIC_T;
        r0[186] = PIG_MECHANIC_B;
        r0[187] = BABY_MECHANIC;
        r0[188] = OSTRICH_RANGER;
        r0[189] = RANGER;
        r0[190] = OSTRICH_RANGER;
        r0[191] = RANGER_T;
        r0[192] = OSTRICH_RANGER_B;
        r0[193] = BABY_RANGER;
        r0[194] = LION_KNIGHT;
        r0[195] = KNIGHT;
        r0[196] = LION_KNIGHT_B;
        r0[197] = BABY_KNIGHT;
        r0[198] = LION_KNIGHT_H;
        r0[199] = LORD_KNIGHT;
        r0[200] = LION_KNIGHT_H;
        r0[201] = LORD_KNIGHT;
        r0[202] = LION_ROYAL_GUARD;
        r0[203] = ROYAL_GUARD;
        r0[204] = LION_ROYAL_GUARD;
        r0[205] = ROYAL_GUARD_T;
        r0[206] = LION_ROYAL_GUARD_B;
        r0[207] = BABY_GUARD;
        r0[208] = LION_RUNE_KNIGHT;
        r0[209] = RUNE_KNIGHT;
        r0[210] = LION_RUNE_KNIGHT_B;
        r0[211] = BABY_RUNE;
        r0[212] = LION_RUNE_KNIGHT;
        r0[213] = RUNE_KNIGHT_T;
        r0[214] = LION_CRUSADER;
        r0[215] = CRUSADER;
        r0[216] = LION_CRUSADER_B;
        r0[217] = BABY_CRUSADER;
        r0[218] = LION_CRUSADER_H;
        r0[219] = PALADIN;
        r0[220] = FROG_KAGEROU;
        r0[221] = KAGEROU;
        r0[222] = FROG_OBORO;
        r0[223] = OBORO;
        r0[224] = PECO_REBELLION;
        r0[225] = REBELLION;
        f8164 = r0;
    }

    private C1761(int i) {
        this.f8294 = i;
    }

    /* renamed from: 鷭 */
    static boolean m2431(int i) {
        C1761[] values = values();
        for (C1761 r0 : values) {
            if (r0.f8294 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: 櫯 */
    static C1761 m2430(int i) {
        C1761[] values = values();
        for (int i2 = 0; i2 < values.length; i2++) {
            if (values[i2].f8294 == i) {
                return values[i2];
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final C1570 mo4502() {
        switch (m2429()[ordinal()]) {
            case 1:
                return C1570.NOVICE;
            case 2:
                return C1570.SWORDMAN;
            case 3:
                return C1570.MAGE;
            case 4:
                return C1570.ARCHER;
            case 5:
                return C1570.ACOLYTE;
            case 6:
                return C1570.MERCHANT;
            case 7:
                return C1570.THIEF;
            case 8:
            case 14:
                return C1570.KNIGHT;
            case 9:
                return C1570.PRIEST;
            case 10:
                return C1570.WIZARD;
            case 11:
                return C1570.BLACKSMITH;
            case 12:
                return C1570.HUNTER;
            case 13:
                return C1570.ASSASSIN;
            case 15:
            case 22:
                return C1570.CRUSADER;
            case 16:
                return C1570.MONK;
            case 17:
                return C1570.SAGE;
            case 18:
                return C1570.ROGUE;
            case 19:
                return C1570.ALCHEMIST;
            case 20:
            case 21:
                return C1570.BARDDANCER;
            case 23:
                return C1570.WEDDING;
            case 24:
                return C1570.SUPER_NOVICE;
            case 25:
                return C1570.GUNSLINGER;
            case 26:
                return C1570.NINJA;
            case 27:
                return C1570.XMAS;
            case 28:
                return C1570.SUMMER;
            case 32:
                return C1570.NOVICE_HIGH;
            case 33:
                return C1570.SWORDMAN_HIGH;
            case 34:
                return C1570.MAGE_HIGH;
            case 35:
                return C1570.ARCHER_HIGH;
            case 36:
                return C1570.ACOLYTE_HIGH;
            case 37:
                return C1570.MERCHANT_HIGH;
            case 38:
                return C1570.THIEF_HIGH;
            case 39:
            case MotionEventCompat.AXIS_GENERIC_14 /*45*/:
                return C1570.LORD_KNIGHT;
            case MotionEventCompat.AXIS_GENERIC_9 /*40*/:
                return C1570.HIGH_PRIEST;
            case MotionEventCompat.AXIS_GENERIC_10 /*41*/:
                return C1570.HIGH_WIZARD;
            case MotionEventCompat.AXIS_GENERIC_11 /*42*/:
                return C1570.WHITESMITH;
            case 43:
                return C1570.SNIPER;
            case MotionEventCompat.AXIS_GENERIC_13 /*44*/:
                return C1570.ASSASSIN_CROSS;
            case MotionEventCompat.AXIS_GENERIC_15 /*46*/:
            case 53:
                return C1570.PALADIN;
            case MotionEventCompat.AXIS_GENERIC_16 /*47*/:
                return C1570.CHAMPION;
            case 48:
                return C1570.PROFESSOR;
            case 49:
                return C1570.STALKER;
            case 50:
                return C1570.CREATOR;
            case 51:
            case 52:
                return C1570.CLOWNGYPSY;
            case 54:
                return C1570.BABY;
            case 55:
                return C1570.BABY_SWORDMAN;
            case 56:
                return C1570.BABY_MAGE;
            case 57:
                return C1570.BABY_ARCHER;
            case 58:
                return C1570.BABY_ACOLYTE;
            case 59:
                return C1570.BABY_MERCHANT;
            case 60:
                return C1570.BABY_THIEF;
            case 61:
            case 67:
                return C1570.BABY_KNIGHT;
            case 62:
                return C1570.BABY_PRIEST;
            case 63:
                return C1570.BABY_WIZARD;
            case 64:
                return C1570.BABY_BLACKSMITH;
            case 65:
                return C1570.BABY_HUNTER;
            case 66:
                return C1570.BABY_ASSASSIN;
            case 68:
            case 75:
                return C1570.BABY_CRUSADER;
            case TFTP.DEFAULT_PORT /*69*/:
                return C1570.BABY_MONK;
            case 70:
                return C1570.BABY_SAGE;
            case 71:
                return C1570.BABY_ROGUE;
            case 72:
                return C1570.BABY_ALCHEMIST;
            case 73:
            case 74:
                return C1570.BABY_BARDDANCER;
            case 76:
                return C1570.SUPER_BABY;
            case 77:
                return C1570.TAEKWON;
            case 78:
            case FingerClient.DEFAULT_PORT /*79*/:
                return C1570.STAR_GLADIATOR;
            case C0840uf.f5034 /*80*/:
                return C1570.SOUL_LINKER;
            case 81:
                return C1570.GANGSI;
            case 82:
                return C1570.DEATH_KNIGHT;
            case 83:
                return C1570.DARK_COLLECTOR;
            case 84:
            case 110:
                return C1570.RUNE_KNIGHT;
            case 85:
                return C1570.WARLOCK;
            case 86:
            case 114:
                return C1570.RANGER;
            case 87:
                return C1570.ARCH_BISHOP;
            case 88:
            case 116:
                return C1570.MECHANIC;
            case 89:
                return C1570.GUILLOTINE_CROSS;
            case 90:
            case 111:
                return C1570.RUNE_KNIGHT_T;
            case 91:
                return C1570.WARLOCK_T;
            case 92:
            case 115:
                return C1570.RANGER_T;
            case 93:
                return C1570.ARCH_BISHOP_T;
            case 94:
            case 117:
                return C1570.MECHANIC_T;
            case 95:
                return C1570.GUILLOTINE_CROSS_T;
            case 96:
            case 112:
                return C1570.ROYAL_GUARD;
            case 97:
                return C1570.SORCERER;
            case 98:
            case 99:
                return C1570.MINSTRELWANDERER;
            case 100:
                return C1570.SURA;
            case HttpStatus.SC_SWITCHING_PROTOCOLS /*101*/:
                return C1570.GENETIC;
            case HttpStatus.SC_PROCESSING /*102*/:
                return C1570.SHADOW_CHASER;
            case 103:
            case 113:
                return C1570.ROYAL_GUARD_T;
            case 104:
                return C1570.SORCERER_T;
            case 105:
            case 106:
                return C1570.MINSTRELWANDERER_T;
            case 107:
                return C1570.SURA_T;
            case 108:
                return C1570.GENETIC_T;
            case 109:
                return C1570.SHADOW_CHASER_T;
            case 118:
            case 131:
                return C1570.BABY_RUNE;
            case NNTP.DEFAULT_PORT /*119*/:
                return C1570.BABY_WARLOCK;
            case FTPReply.SERVICE_NOT_READY /*120*/:
            case 133:
                return C1570.BABY_RANGER;
            case 121:
                return C1570.BABY_BISHOP;
            case 122:
            case 134:
                return C1570.BABY_MECHANIC;
            case 123:
                return C1570.BABY_CROSS;
            case 124:
            case 132:
                return C1570.BABY_GUARD;
            case FTPReply.DATA_CONNECTION_ALREADY_OPEN /*125*/:
                return C1570.BABY_SORCERER;
            case TransportMediator.KEYCODE_MEDIA_PLAY /*126*/:
            case TransportMediator.KEYCODE_MEDIA_PAUSE /*127*/:
                return C1570.BABY_MINSTRELWANDERER;
            case 128:
                return C1570.BABY_SURA;
            case 129:
                return C1570.BABY_GENETIC;
            case TransportMediator.KEYCODE_MEDIA_RECORD /*130*/:
                return C1570.BABY_CHASER;
            case 211:
                return C1570.SUPER_NOVICE_E;
            case FTPReply.DIRECTORY_STATUS /*212*/:
                return C1570.SUPER_BABY_E;
            case NNTPReply.NEW_NEWSGROUP_LIST_FOLLOWS /*231*/:
            case 232:
                return C1570.KAGEROU_OBORO;
            case 235:
                return C1570.REBELLION;
            case TelnetCommand.SUSP /*237*/:
                return C1570.SUMMONER;
            default:
                return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final C1761 mo4501() {
        for (int i = 0; i < f8214.length; i += 2) {
            if (this == f8214[i] || this == f8214[i + 1]) {
                return f8214[i];
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final C1761 mo4503(boolean z) {
        for (int i = 0; i < f8164.length; i += 2) {
            if (this == f8164[i] || this == f8164[i + 1]) {
                return z ? f8164[i] : f8164[i + 1];
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˮ͈ */
    public final C1977 mo4500() {
        C1761 r2 = this;
        if (mo4503(true) == this) {
            r2 = mo4503(false);
        }
        switch (m2429()[r2.ordinal()]) {
            case 20:
            case 51:
            case 73:
            case 98:
            case 105:
            case TransportMediator.KEYCODE_MEDIA_PLAY /*126*/:
            case NNTPReply.NEW_NEWSGROUP_LIST_FOLLOWS /*231*/:
                return C1977.MALE;
            case 21:
            case 52:
            case 74:
            case 99:
            case 106:
            case TransportMediator.KEYCODE_MEDIA_PAUSE /*127*/:
            case 232:
                return C1977.FEMALE;
            default:
                return null;
        }
    }
}
