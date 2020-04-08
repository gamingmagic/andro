package p004o;

import android.support.p000v4.media.TransportMediator;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.imap.IMAP;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.apache.http.HttpStatus;

/* renamed from: o.祵 */
enum C1711 {
    MG_SAFETYWALL(TransportMediator.KEYCODE_MEDIA_PLAY),
    MG_FIREWALL(TransportMediator.KEYCODE_MEDIA_PAUSE),
    AL_WARP(129),
    PR_SANCTUARY(131),
    PR_MAGNUS(132),
    AL_PNEUMA(133),
    DUMMYSKILL,
    WZ_FIREPILLAR(135),
    WZ_ICEWALL(141),
    WZ_QUAGMIRE(142),
    HT_BLASTMINE(IMAP.DEFAULT_PORT),
    HT_SKIDTRAP(144),
    HT_ANKLESNARE(145),
    AS_VENOMDUST(146),
    HT_LANDMINE(147),
    HT_SHOCKWAVE(148),
    HT_SANDMAN(149),
    HT_FLASHER(FTPReply.FILE_STATUS_OK),
    HT_FREEZINGTRAP(151),
    HT_CLAYMORETRAP(152),
    HT_TALKIEBOX(153),
    SA_VOLCANO(154),
    SA_DELUGE(155),
    SA_VIOLENTGALE(156),
    SA_LANDPROTECTOR(157),
    BD_LULLABY(158),
    BD_RICHMANKIM(159),
    BD_ETERNALCHAOS(160),
    BD_DRUMBATTLEFIELD(161),
    BD_RINGNIBELUNGEN(162),
    BD_ROKISWEIL(163),
    BD_INTOABYSS(164),
    BD_SIEGFRIED(165),
    BA_DISSONANCE(166),
    BA_WHISTLE(167),
    BA_ASSASSINCROSS(168),
    BA_POEMBRAGI(169),
    BA_APPLEIDUN(170),
    DC_UGLYDANCE(171),
    DC_HUMMING(172),
    DC_DONTFORGETME(173),
    DC_FORTUNEKISS(174),
    DC_SERVICEFORYOU(175),
    RG_GRAFFITI(176),
    AM_DEMONSTRATION(177),
    PA_GOSPEL(179),
    HP_BASILICA(180),
    CG_MOONLIT(181),
    PF_FOGWALL(182),
    PF_SPIDERWEB(183),
    HW_GRAVITATION(184),
    CG_HERMODE(185),
    NJ_SUITON(187),
    NJ_TATAMIGAESHI(188),
    NJ_KAENSIN(189),
    GS_GROUNDDRIFT(190),
    GD_LEADERSHIP(193),
    GD_GLORYWOUNDS(194),
    GD_SOULCOLD(195),
    GD_HAWKEYES(196),
    NPC_EVILLAND(NNTPReply.DEBUG_OUTPUT),
    AB_EPICLESIS(202),
    WL_EARTHSTRAIN(HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION),
    SC_MANHOLE(HttpStatus.SC_NO_CONTENT),
    SC_DIMENSIONDOOR(205),
    SC_CHAOSPANIC(HttpStatus.SC_PARTIAL_CONTENT),
    SC_MAELSTROM(HttpStatus.SC_MULTI_STATUS),
    SC_BLOODYLUST(208),
    SC_FEINTBOMB(209),
    RA_MAGENTATRAP(210),
    RA_COBALTTRAP(211),
    RA_MAIZETRAP(FTPReply.DIRECTORY_STATUS),
    RA_VERDURETRAP(FTPReply.FILE_STATUS),
    RA_FIRINGTRAP(214),
    RA_ICEBOUNDTRAP(FTPReply.NAME_SYSTEM_TYPE),
    RA_ELECTRICSHOCKER(216),
    RA_CLUSTERBOMB(217),
    WM_REVERBERATION(218),
    WM_SEVERE_RAINSTORM(219),
    SO_FIREWALK(220),
    SO_ELECTRICWALK(221),
    WM_POEMOFNETHERWORLD(NNTPReply.ARTICLE_RETRIEVED_BODY_FOLLOWS),
    SO_PSYCHIC_WAVE(NNTPReply.ARTICLE_RETRIEVED_REQUEST_TEXT_SEPARATELY),
    SO_CLOUD_KILL(224),
    GC_POISONSMOKE(FTPReply.DATA_CONNECTION_OPEN),
    NC_NEUTRALBARRIER(FTPReply.CLOSING_DATA_CONNECTION),
    NC_STEALTHFIELD(FTPReply.ENTERING_PASSIVE_MODE),
    SO_WARMER(228),
    GN_THORNS_TRAP(FTPReply.ENTERING_EPSV_MODE),
    GN_WALLOFTHORN(230),
    GN_DEMONIC_FIRE(NNTPReply.NEW_NEWSGROUP_LIST_FOLLOWS),
    GN_FIRE_EXPANSION_SMOKE_POWDER(232),
    GN_FIRE_EXPANSION_TEAR_GAS(233),
    GN_HELLS_PLANT(FTPReply.SECURITY_DATA_EXCHANGE_COMPLETE),
    SO_VACUUM_EXTREME(235),
    LG_BANDING(TelnetCommand.EOF),
    EL_FIRE_MANTLE(TelnetCommand.SUSP),
    EL_WATER_BARRIER(TelnetCommand.ABORT),
    EL_ZEPHYR(TelnetCommand.EOR),
    EL_POWER_OF_GAIA(240),
    SO_FIRE_INSIGNIA(TelnetCommand.NOP),
    SO_WATER_INSIGNIA(242),
    SO_WIND_INSIGNIA(TelnetCommand.BREAK),
    SO_EARTH_INSIGNIA(TelnetCommand.f8999IP),
    MH_POISON_MIST(TelnetCommand.f8993AO),
    MH_LAVA_SLIDE(TelnetCommand.AYT),
    MH_VOLCANIC_ASH(TelnetCommand.f8996EC),
    KO_ZENKAI(TelnetCommand.f8997EL),
    KO_MAKIBISHI(TelnetCommand.WONT),
    NPC_VENOMFOG(TelnetCommand.f8995DO),
    SC_SCAPE(TelnetCommand.DONT),
    NC_MAGMA_ERUPTION(257),
    RL_B_TRAP(260);
    

    /* renamed from: ű */
    int f7895;

    static {
        C1711[] values = values();
        int i = -1;
        for (int i2 = 0; i2 < values.length; i2++) {
            if (values[i2].f7895 != 0) {
                i = values[i2].f7895;
            } else {
                values[i2].f7895 = i + 1;
                i++;
            }
        }
    }

    private C1711(int i) {
        this.f7895 = i;
    }

    /* renamed from: 鷭 */
    static C1711 m2379(int i) {
        C1711[] values;
        for (C1711 r1 : values()) {
            if (i == r1.f7895) {
                return r1;
            }
        }
        return null;
    }
}
