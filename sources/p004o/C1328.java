package p004o;

import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.nntp.NNTP;

/* renamed from: o.ઌ */
enum C1328 {
    SPEED,
    BASEEXP,
    JOBEXP,
    KARMA,
    MANNER,
    HP,
    MAXHP,
    SP,
    MAXSP,
    STATUSPOINT,
    _0a,
    BASELEVEL,
    SKILLPOINT,
    STR,
    AGI,
    VIT,
    INT,
    DEX,
    LUK,
    CLASS,
    ZENY,
    SEX,
    NEXTBASEEXP,
    NEXTJOBEXP,
    WEIGHT,
    MAXWEIGHT,
    _1a,
    _1b,
    _1c,
    _1d,
    _1e,
    _1f,
    USTR,
    UAGI,
    UVIT,
    UINT,
    UDEX,
    ULUK,
    _26,
    _27,
    _28,
    ATK1,
    ATK2,
    MATK1,
    MATK2,
    DEF1,
    DEF2,
    MDEF1,
    MDEF2,
    HIT,
    FLEE1,
    FLEE2,
    CRITICAL,
    ASPD,
    _36,
    JOBLEVEL,
    UPPER,
    PARTNER,
    CART,
    FAME,
    UNBREAKABLE,
    CARTINFO(99),
    BASEJOB(NNTP.DEFAULT_PORT),
    BASECLASS(FTPReply.SERVICE_NOT_READY),
    KILLERRID(121),
    KILLEDRID(122),
    MERCFLEE(165),
    MERCKILLS(189),
    MERCFAITH(190),
    ATTACKRANGE(1000),
    ATKELE,
    DEFELE,
    CASTRATE,
    MAXHPRATE,
    MAXSPRATE,
    SPRATE,
    ADDELE,
    ADDRACE,
    ADDSIZE,
    SUBELE,
    SUBRACE,
    ADDEFF,
    RESEFF,
    BASE_ATK,
    ASPD_RATE,
    HP_RECOV_RATE,
    RECOV_RATE,
    SPEED_RATE,
    CRITICAL_DEF,
    NEAR_ATK_DEF,
    LONG_ATK_DEF,
    DOUBLE_RATE,
    DOUBLE_ADD_RATE,
    SKILL_HEAL,
    MATK_RATE,
    IGNORE_DEF_ELE,
    IGNORE_DEF_RACE,
    ATK_RATE,
    SPEED_ADDRATE,
    REGEN_RATE,
    MAGIC_ATK_DEF,
    MISC_ATK_DEF,
    IGNORE_MDEF_ELE,
    IGNORE_MDEF_RACE,
    MAGIC_ADDELE,
    MAGIC_ADDRACE,
    MAGIC_ADDSIZE,
    PERFECT_HIT_RATE,
    PERFECT_HIT_ADD_RATE,
    CRITICAL_RATE,
    GET_ZENY_NUM,
    ADD_GET_ZENY_NUM,
    ADD_DAMAGE_CLASS,
    ADD_MAGIC_DAMAGE_CLASS,
    ADD_DEF_CLASS,
    ADD_MDEF_CLASS,
    ADD_MONSTER_DROP_ITEM,
    DEF_RATIO_ATK_ELE,
    DEF_RATIO_ATK_RACE,
    UNBREAKABLE_GARMENT,
    HIT_RATE,
    FLEE_RATE,
    FLEE2_RATE,
    DEF_RATE,
    DEF2_RATE,
    MDEF_RATE,
    MDEF2_RATE,
    SPLASH_RANGE,
    SPLASH_ADD_RANGE,
    AUTOSPELL,
    HP_DRAIN_RATE,
    DRAIN_RATE,
    SHORT_WEAPON_DAMAGE_RETURN,
    LONG_WEAPON_DAMAGE_RETURN,
    WEAPON_COMA_ELE,
    WEAPON_COMA_RACE,
    ADDEFF2,
    BREAK_WEAPON_RATE,
    BREAK_ARMOR_RATE,
    ADD_STEAL_RATE,
    MAGIC_DAMAGE_RETURN,
    RANDOM_ATTACK_INCREASE,
    ALL_STATS,
    AGI_VIT,
    AGI_DEX_STR,
    PERFECT_HIDE,
    NO_KNOCKBACK,
    CLASSCHANGE,
    HP_DRAIN_VALUE,
    DRAIN_VALUE,
    WEAPON_ATK,
    WEAPON_ATK_RATE,
    DELAYRATE,
    HP_DRAIN_RATE_RACE,
    DRAIN_RATE_RACE,
    IGNORE_MDEF_RATE,
    IGNORE_DEF_RATE,
    SKILL_HEAL2,
    ADDEFF_ONSKILL,
    ADD_HEAL_RATE,
    ADD_HEAL2_RATE,
    FIXCASTRATE,
    RESTART_FULL_RECOVER(2000),
    NO_CASTCANCEL,
    NO_SIZEFIX,
    NO_MAGIC_DAMAGE,
    NO_WEAPON_DAMAGE,
    NO_GEMSTONE,
    NO_CASTCANCEL2,
    NO_MISC_DAMAGE,
    UNBREAKABLE_WEAPON,
    UNBREAKABLE_ARMOR,
    UNBREAKABLE_HELM,
    UNBREAKABLE_SHIELD,
    LONG_ATK_RATE,
    CRIT_ATK_RATE,
    CRITICAL_ADDRACE,
    NO_REGEN,
    ADDEFF_WHENHIT,
    AUTOSPELL_WHENHIT,
    SKILL_ATK,
    UNSTRIPABLE,
    AUTOSPELL_ONSKILL,
    GAIN_VALUE,
    HP_REGEN_RATE,
    HP_LOSS_RATE,
    ADDRACE2,
    HP_GAIN_VALUE,
    SUBSIZE,
    HP_DRAIN_VALUE_RACE,
    ADD_ITEM_HEAL_RATE,
    DRAIN_VALUE_RACE,
    EXP_ADDRACE,
    GAIN_RACE,
    SUBRACE2,
    UNBREAKABLE_SHOES,
    UNSTRIPABLE_WEAPON,
    UNSTRIPABLE_ARMOR,
    UNSTRIPABLE_HELM,
    UNSTRIPABLE_SHIELD,
    INTRAVISION,
    ADD_MONSTER_DROP_ITEMGROUP,
    LOSS_RATE,
    ADD_SKILL_BLOW,
    VANISH_RATE,
    MAGIC_GAIN_VALUE,
    MAGIC_HP_GAIN_VALUE,
    ADD_CLASS_DROP_ITEM,
    BASE_MATK(2500),
    ELE_DAMAGE_RATE,
    CASTTIME,
    DELAYTIME,
    SKILLBLOCKTIME,
    SPCOST,
    SUBDEFELE;
    

    /* renamed from: Ǘ */
    int f6850;

    static {
        C1328[] values = values();
        int i = -1;
        for (int i2 = 0; i2 < values.length; i2++) {
            if (values[i2].f6850 != 0) {
                i = values[i2].f6850;
            } else {
                values[i2].f6850 = i + 1;
                i++;
            }
        }
    }

    private C1328(int i) {
        this.f6850 = i;
    }

    /* renamed from: 鷭 */
    static C1328 m2053(int i) {
        C1328[] values;
        for (C1328 r1 : values()) {
            if (i == r1.f6850) {
                return r1;
            }
        }
        return null;
    }
}
