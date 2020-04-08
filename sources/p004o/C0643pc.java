package p004o;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.http.HttpHost;
import org.apache.http.cookie.ClientCookie;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* renamed from: o.pc */
public final class C0643pc {

    /* renamed from: ȃ */
    public ArrayList<C0650> f4299 = new ArrayList<>();

    /* renamed from: ˮ͈ */
    public String f4300 = null;

    /* renamed from: 櫯 */
    public C0647 f4301;

    /* renamed from: 鷭 */
    public C0646 f4302;

    /* renamed from: o.pc$aux */
    public enum aux {
        iRO_Renewal,
        fRO,
        kRO,
        MOTR,
        MOTR_home,
        XileRO,
        AevaRO,
        AtlasRO,
        FreeRO,
        MyRO,
        ChenRO,
        WeDevGames,
        ROProviderValkyrie,
        TheClassicROCom,
        ClassicRONet,
        OldSchoolRO,
        InfamyRO,
        PlayragnarokPh,
        SarahServer,
        SuccessRoNet,
        PhoenixRO,
        CrownRO,
        Eden3,
        Class2RO,
        ShinServer,
        EosRagnarokOnline,
        TyrServer,
        MobiRO,
        XileROOS,
        PlayLokiServerCom,
        FreeRoWeb,
        OldchaosROCom,
        CreativeKingsRO,
        LidiaRO,
        Gugusjungs57572,
        RagnarevivalCom,
        RebirthRO_Ancyker,
        BarnabyRO,
        Ragnaclan,
        ThaiRoInTh,
        NoviceRO,
        LeonardRO,
        IfritRagnarokCom,
        AmatsuRO,
        FreePlayRoCom,
        RoHeimdallCom,
        Thai_id9169,
        PlayvalhallaPh,
        Classic2RoInTh,
        Daro,
        iPlayRo201804,
        AustinRO,
        BrightRO,
        TitanRO,
        RoFaction,
        WeloveRo,
        KafraRO,
        ChaosReborn,
        RagnarokReturnPh,
        GachoRO,
        RoRetro,
        LibRO,
        SecretRO,
        NorseRO,
        Trinity_Reborn_Full,
        AlbertaServer,
        hiclassro,
        OldschoolragnarokCom,
        Ragnarevo,
        CrazyPoring,
        LucianoRO,
        GarciaRO,
        Blytanias,
        PinoyRO,
        OMGRO,
        RagnarokPuzzle,
        Modify_Full,
        Newyear,
        GRANDRO,
        SakrayPh,
        MyRebornRO,
        XileRO2019,
        eSport2019,
        PhoenixRO2,
        OcrClassicCom,
        RoFreedom,
        C2RO,
        RelaxRO,
        BgRO,
        ROClashed,
        eA;

        /* renamed from: 鷭 */
        static aux m779(String str) {
            aux[] values;
            for (aux aux : values()) {
                if (str.equalsIgnoreCase(aux.name())) {
                    return aux;
                }
            }
            return null;
        }
    }

    /* renamed from: o.pc$if */
    public enum C0644if {
        Korea,
        America,
        Japan,
        China,
        Taiwan,
        Thai,
        Indonesia,
        Philippine,
        Malaysia,
        Singapore,
        Germany,
        India,
        Brazil,
        Australia,
        Russia,
        Vietnam,
        Unknown,
        Chile,
        France,
        UAE
    }

    /* renamed from: o.pc$Ą */
    public enum C0645 {
        AEGIS,
        ATHENA,
        HERCULES;

        /* renamed from: 鷭 */
        static C0645 m780(String str) {
            C0645[] values;
            for (C0645 r1 : values()) {
                if (r1.name().equalsIgnoreCase(str)) {
                    return r1;
                }
            }
            return null;
        }
    }

    /* renamed from: o.pc$Ć */
    public enum C0646 {
        KOREA,
        AMERICA,
        RUSSIA,
        FRANCE;

        /* renamed from: 鷭 */
        static C0646 m781(String str) {
            C0646[] values = values();
            String upperCase = str.toUpperCase();
            C0646[] r4 = values;
            int length = values.length;
            for (int i = 0; i < length; i++) {
                C0646 r1 = r4[i];
                if (upperCase.equals(r1.name())) {
                    return r1;
                }
            }
            return null;
        }
    }

    /* renamed from: o.pc$ȃ */
    public enum C0647 {
        PRIMARY,
        SAKRAY;

        /* renamed from: 鷭 */
        static C0647 m782(String str) {
            C0647[] values = values();
            String upperCase = str.toUpperCase();
            C0647[] r4 = values;
            int length = values.length;
            for (int i = 0; i < length; i++) {
                C0647 r1 = r4[i];
                if (upperCase.equals(r1.name())) {
                    return r1;
                }
            }
            return null;
        }
    }

    /* renamed from: o.pc$ˮ͈ */
    public enum C0648 {
        official,
        neoncube,
        thor;

        /* renamed from: 鷭 */
        static C0648 m783(String str) {
            C0648[] values;
            for (C0648 r1 : values()) {
                if (str.equalsIgnoreCase(r1.name())) {
                    return r1;
                }
            }
            return null;
        }
    }

    /* renamed from: o.pc$櫯 */
    public enum C0649 {
        ru,
        gb,
        us,
        sg,
        th,
        ph,
        eu,
        id;

        /* renamed from: 鷭 */
        static C0649 m784(String str) {
            C0649[] values;
            for (C0649 r1 : values()) {
                if (str.equalsIgnoreCase(r1.name())) {
                    return r1;
                }
            }
            return null;
        }
    }

    /* renamed from: o.pc$鷭 */
    public class C0650 {

        /* renamed from: Ą */
        public int f4441;

        /* renamed from: ą */
        public int f4442;

        /* renamed from: Ć */
        public aux f4443 = aux.eA;

        /* renamed from: ć */
        public C0649[] f4444 = new C0649[0];

        /* renamed from: ċ */
        public String f4445;

        /* renamed from: đ */
        public int f4446;

        /* renamed from: Ē */
        public C0645 f4447 = C0645.HERCULES;

        /* renamed from: ē */
        public boolean f4448;

        /* renamed from: Ė */
        public boolean f4449;

        /* renamed from: ė */
        public boolean f4450;

        /* renamed from: Ę */
        public boolean f4451;

        /* renamed from: ę */
        public boolean f4452;

        /* renamed from: ġ */
        public boolean f4453;

        /* renamed from: ģ */
        public boolean f4454;

        /* renamed from: Ĥ */
        public boolean f4455;

        /* renamed from: ĥ */
        public boolean f4456;

        /* renamed from: Ħ */
        public boolean f4457;

        /* renamed from: ħ */
        public boolean f4458;

        /* renamed from: Ĩ */
        public boolean f4459;

        /* renamed from: Ī */
        public boolean f4460;

        /* renamed from: ī */
        public boolean f4461;

        /* renamed from: Ĭ */
        public boolean f4462;

        /* renamed from: Į */
        public boolean f4463;

        /* renamed from: į */
        public boolean f4464;

        /* renamed from: ĸ */
        public boolean f4465 = true;

        /* renamed from: ĺ */
        public int f4466;

        /* renamed from: Ļ */
        public boolean f4467;

        /* renamed from: Ľ */
        public String f4468;

        /* renamed from: Ŀ */
        public String f4469;

        /* renamed from: ō */
        public int f4470 = 20171227;

        /* renamed from: Ŏ */
        public boolean f4471 = true;

        /* renamed from: ŏ */
        public boolean f4472 = false;

        /* renamed from: ő */
        public ArrayList<String> f4473 = new ArrayList<>();

        /* renamed from: Œ */
        public int f4474;

        /* renamed from: œ */
        public int f4475;

        /* renamed from: Ŕ */
        public int f4476;

        /* renamed from: Ŗ */
        public boolean f4477;

        /* renamed from: ŗ */
        public boolean f4478;

        /* renamed from: ř */
        public boolean f4479;

        /* renamed from: ȃ */
        public String f4480;

        /* renamed from: Ȋ */
        public String f4481;

        /* renamed from: Ƞ */
        public boolean f4482;

        /* renamed from: ɕ */
        public boolean f4483;

        /* renamed from: ˮ͈ */
        public String f4484;

        /* renamed from: ˮ͍ */
        public C0644if f4485;

        /* renamed from: غ */
        public boolean f4486;

        /* renamed from: ܕ */
        public String f4488;

        /* renamed from: ܨ */
        public boolean f4489;

        /* renamed from: ঽ্ */
        public boolean f4490;

        /* renamed from: ਓ */
        public boolean f4491;

        /* renamed from: 㥳 */
        public boolean f4492;

        /* renamed from: 㱽 */
        public boolean f4493;

        /* renamed from: 㵼 */
        public boolean f4494;

        /* renamed from: 㺗 */
        public int f4495;

        /* renamed from: 㺳 */
        public boolean f4496;

        /* renamed from: 䆬 */
        public ArrayList<String> f4497 = new ArrayList<>();

        /* renamed from: 䍼 */
        public String f4498;

        /* renamed from: 䒧 */
        public int[] f4499;

        /* renamed from: 䕌 */
        public boolean f4500;

        /* renamed from: 䲑 */
        public boolean f4501;

        /* renamed from: 䲕 */
        public boolean f4502;

        /* renamed from: 囃 */
        public boolean f4503;

        /* renamed from: 坴 */
        public int f4504 = 0;

        /* renamed from: 岱 */
        public String f4505;

        /* renamed from: 崲 */
        public boolean f4506;

        /* renamed from: 差 */
        public boolean f4507;

        /* renamed from: 庸 */
        public int f4508;

        /* renamed from: 廂 */
        public boolean f4509;

        /* renamed from: 廅 */
        public boolean f4510;

        /* renamed from: 廑 */
        public boolean f4511;

        /* renamed from: 廕 */
        public boolean f4512;

        /* renamed from: 櫯 */
        public String f4513;

        /* renamed from: 漐 */
        public boolean f4514;

        /* renamed from: 瞣 */
        public boolean f4515;

        /* renamed from: 簇 */
        public boolean f4516;

        /* renamed from: 纫 */
        public String f4517;

        /* renamed from: 躆 */
        public byte f4518;

        /* renamed from: 釫 */
        public ArrayList<Integer> f4519 = new ArrayList<>();

        /* renamed from: 釯 */
        public String f4520;

        /* renamed from: 釳 */
        public boolean f4521;

        /* renamed from: 鷭 */
        public String f4522;

        /* renamed from: 麹 */
        public int f4523;

        /* renamed from: 黬 */
        public boolean f4524;

        /* renamed from: 齴 */
        public boolean f4525;

        /* renamed from: ꑣ */
        public String f4526;

        /* renamed from: 냆 */
        public boolean f4527;

        /* renamed from: 띥 */
        public boolean f4528;

        /* renamed from: 윬 */
        public ArrayList<C0651> f4529 = new ArrayList<>();

        /* renamed from: 졸 */
        public ArrayList<String> f4530 = new ArrayList<>();

        /* renamed from: 진 */
        public boolean f4531;

        /* renamed from: o.pc$鷭$鷭 */
        public class C0651 {

            /* renamed from: Ą */
            public String f4532;

            /* renamed from: ȃ */
            public String f4534;

            /* renamed from: ˮ͈ */
            public String f4535;

            /* renamed from: 櫯 */
            public String f4536;

            /* renamed from: 鷭 */
            public C0648 f4537 = C0648.official;

            C0651(NodeList nodeList) {
                int length = nodeList.getLength();
                for (int i = 0; i < length; i++) {
                    Node item = nodeList.item(i);
                    String nodeName = item.getNodeName();
                    String textContent = item.getTextContent();
                    if (nodeName.equals("type")) {
                        this.f4537 = C0648.m783(textContent);
                    } else if (nodeName.equals(HttpHost.DEFAULT_SCHEME_NAME)) {
                        this.f4536 = textContent;
                    } else if (nodeName.equals("ftp")) {
                        this.f4535 = textContent;
                    } else if (nodeName.equals("grf")) {
                        this.f4534 = textContent;
                    } else if (nodeName.equals("inf")) {
                        this.f4532 = textContent;
                    }
                }
            }
        }

        /* renamed from: 鷭 */
        private void m787(NodeList nodeList) {
            int i = 0;
            int length = nodeList.getLength();
            this.f4499 = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                Node item = nodeList.item(i2);
                String nodeName = item.getNodeName();
                String textContent = item.getTextContent();
                if (nodeName.equals("admin")) {
                    int i3 = i;
                    i++;
                    this.f4499[i3] = Integer.parseInt(textContent);
                }
            }
            this.f4499 = Arrays.copyOf(this.f4499, i);
        }

        /* renamed from: 鷭 */
        private void m786() {
            this.f4528 = this.f4470 >= 20101116;
            this.f4492 = this.f4470 >= 20110111;
            this.f4449 = (this.f4470 >= 20100720 && this.f4470 <= 20100727) || this.f4470 >= 20100803;
            this.f4450 = this.f4470 >= 20100803;
            this.f4451 = this.f4443 == aux.MyRO || !this.f4450;
            this.f4503 = this.f4443 == aux.iRO_Renewal || this.f4470 >= 20111116;
            this.f4509 = this.f4443 == aux.iRO_Renewal || this.f4470 >= 20111116;
            this.f4452 = this.f4470 >= 2010803;
            boolean z = this.f4443 == aux.iRO_Renewal ? this.f4470 >= 20140909 : (this.f4443 == aux.MOTR || this.f4443 == aux.MOTR_home) ? this.f4470 >= 20150301 : this.f4470 >= 20120925;
            this.f4510 = z;
            this.f4493 = this.f4470 >= 20091104;
            this.f4453 = this.f4470 >= 20141020 && this.f4443 != aux.iRO_Renewal;
            this.f4454 = this.f4470 >= 20141016 || this.f4443 == aux.iRO_Renewal;
            this.f4455 = this.f4470 >= 20170830 || this.f4504 >= 44;
            this.f4489 = this.f4470 >= 20151001 || this.f4443 == aux.iRO_Renewal;
            this.f4456 = this.f4470 >= 20150225 || this.f4504 >= 39 || this.f4443 == aux.iRO_Renewal;
            this.f4512 = this.f4470 >= 20130911 || this.f4443 == aux.iRO_Renewal;
            boolean z2 = this.f4443 == aux.iRO_Renewal ? true : this.f4470 >= 20130710;
            this.f4463 = z2;
            this.f4464 = this.f4470 <= 20061023;
            this.f4527 = this.f4470 > 20100730;
            this.f4520 = this.f4470 <= 20120410 ? null : "itemInfo.lub";
            this.f4496 = !this.f4471 && this.f4470 >= 20080827;
            this.f4477 = this.f4470 < 20110222;
            this.f4494 = this.f4443 == aux.XileRO || this.f4485 == C0644if.Germany;
            boolean z3 = this.f4504 > 0 ? this.f4504 >= 43 : this.f4470 >= 20160921;
            this.f4457 = z3;
            this.f4458 = this.f4470 >= 20180307 || (this.f4471 && this.f4470 >= 20180221);
            this.f4531 = this.f4470 <= 20100713;
            boolean z4 = this.f4472 ? this.f4470 >= 20181114 : this.f4471 ? this.f4470 >= 20180704 : this.f4470 >= 20181121;
            this.f4506 = z4;
            boolean z5 = this.f4471 ? this.f4470 >= 20180912 : this.f4472 ? this.f4470 >= 20180919 : this.f4470 >= 20181002;
            this.f4501 = z5;
            this.f4516 = this.f4470 < 20131218;
            this.f4525 = this.f4470 < 20130717;
            this.f4507 = this.f4470 >= 20170726;
        }

        /* renamed from: 櫯 */
        private void m785(NodeList nodeList) {
            int length = nodeList.getLength();
            for (int i = 0; i < length; i++) {
                Node item = nodeList.item(i);
                String nodeName = item.getNodeName();
                String textContent = item.getTextContent();
                if (nodeName.equals("image")) {
                    this.f4473.add(textContent);
                }
            }
        }

        C0650(NodeList nodeList) {
            boolean z = false;
            int length = nodeList.getLength();
            for (int i = 0; i < length; i++) {
                Node item = nodeList.item(i);
                String nodeName = item.getNodeName();
                String textContent = item.getTextContent();
                if (item.getNodeType() != 8) {
                    if (nodeName.equals("eathena") || nodeName.equals("max_guildpositions")) {
                        C0624ov.m757();
                    } else if (nodeName.equals("display")) {
                        this.f4522 = textContent;
                    } else if (nodeName.equals("desc")) {
                        this.f4513 = textContent;
                    } else if (nodeName.equals("balloon")) {
                        this.f4484 = textContent;
                    } else if (nodeName.equals("address")) {
                        this.f4480 = textContent;
                    } else if (nodeName.equals(ClientCookie.PORT_ATTR)) {
                        this.f4441 = Integer.parseInt(textContent);
                    } else if (nodeName.equals(ClientCookie.VERSION_ATTR)) {
                        this.f4442 = Integer.parseInt(textContent);
                        if (this.f4442 > 20000101) {
                            this.f4470 = this.f4442;
                            m786();
                            z = true;
                        }
                    } else if (nodeName.equals("langtype")) {
                        this.f4485 = C0644if.values()[Integer.parseInt(textContent)];
                    } else if (nodeName.equals("registrationweb")) {
                        this.f4481 = textContent;
                    } else if (nodeName.equals("aid") || nodeName.equals("yellow")) {
                        m787(item.getChildNodes());
                    } else if (nodeName.equals("loading")) {
                        m785(item.getChildNodes());
                    } else if (nodeName.equals("type")) {
                        this.f4443 = aux.m779(textContent);
                        m786();
                        z = true;
                    } else if (nodeName.equals("platform")) {
                        this.f4447 = C0645.m780(textContent);
                    } else if (nodeName.equals("packetver")) {
                        this.f4470 = Integer.parseInt(textContent);
                        m786();
                        z = true;
                    } else if (nodeName.equals("packetver_re")) {
                        this.f4471 = Boolean.parseBoolean(textContent);
                    } else if (nodeName.equals("nationality")) {
                        Object[] objArr = this.f4444;
                        C0649 r6 = C0649.m784(textContent);
                        if (objArr == null) {
                            objArr = (Object[]) Array.newInstance(r6.getClass(), 0);
                        }
                        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
                        copyOf[objArr.length] = r6;
                        this.f4444 = (C0649[]) copyOf;
                    } else if (nodeName.equals("website")) {
                        this.f4505 = textContent;
                    } else if (nodeName.equals("clientver2")) {
                        this.f4518 = (byte) Integer.parseInt(textContent);
                    } else if (nodeName.equals("res")) {
                        this.f4497.add(textContent);
                    } else if (nodeName.equals("res-port")) {
                        this.f4519.add(Integer.valueOf(Integer.parseInt(textContent)));
                    } else if (nodeName.equals("res-subdir")) {
                        this.f4526 = textContent;
                    } else if (nodeName.equals("grf")) {
                        this.f4530.add(textContent);
                    } else if (nodeName.equals("dataini")) {
                        this.f4498 = textContent;
                    } else if (nodeName.equals("patchserver") || nodeName.equals("patchserver2")) {
                        this.f4529.add(new C0651(item.getChildNodes()));
                    } else if (nodeName.equals("iteminfo") || nodeName.equals("iteminfo2")) {
                        this.f4520 = textContent;
                        if (textContent.equals("txt")) {
                            this.f4520 = null;
                        }
                    } else if (nodeName.equals("luafiles514")) {
                        this.f4527 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("hardcoded_weapontable")) {
                        this.f4531 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("hardcoded_unitviewdb_lubs")) {
                        this.f4500 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("support_stop_packet")) {
                        this.f4490 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("ping")) {
                        this.f4488 = textContent;
                    } else if (nodeName.equals("pingport")) {
                        this.f4508 = Integer.valueOf(textContent).intValue();
                    } else if (nodeName.equals("support_billing")) {
                        this.f4448 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("suppress_sprite_errors")) {
                        this.f4465 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("read_lua_before_lub")) {
                        this.f4514 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("multiencoded_chatmessages")) {
                        this.f4494 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("use_allinone_palettes")) {
                        this.f4502 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("use_default_packet_encryption")) {
                        this.f4482 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("packetdb_packetver")) {
                        this.f4504 = Integer.valueOf(textContent).intValue();
                    } else if (nodeName.equals("increase_max_hairstyles")) {
                        this.f4495 = Integer.valueOf(textContent).intValue();
                    } else if (nodeName.equals("increase_max_haircolors")) {
                        this.f4466 = Integer.valueOf(textContent).intValue();
                    } else if (nodeName.equals("use_2nd_body_palettes_for_3rd")) {
                        this.f4459 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("use_2nd_body_palettes_for_trans")) {
                        this.f4511 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("enforce_login_address_on_char_and_map")) {
                        this.f4460 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("strict_server2client_hairstyle")) {
                        this.f4461 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("txt_skilldb")) {
                        this.f4521 = Boolean.valueOf(textContent).booleanValue();
                        if (this.f4521) {
                            this.f4527 = true;
                        }
                    } else if (nodeName.equals("xray")) {
                        this.f4462 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("gepard_shield_ver")) {
                        this.f4474 = Integer.valueOf(textContent).intValue();
                    } else if (nodeName.equals("gepard_grf_hash")) {
                        this.f4475 = (int) Long.valueOf(textContent).longValue();
                    } else if (nodeName.equals("gepard30_version")) {
                        this.f4476 = (int) Long.valueOf(textContent).longValue();
                    } else if (nodeName.equals("matk_with_tilde")) {
                        this.f4496 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("redundant_updatemes_andro_ver")) {
                        this.f4446 = Integer.valueOf(textContent).intValue();
                    } else if (nodeName.equals("read_data_directory_first")) {
                        this.f4467 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("hide_quickcashshop_button")) {
                        this.f4477 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("mapserver_sends_tick_in_skillunits")) {
                        this.f4515 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("use_static_gepard_info")) {
                        this.f4524 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("reset_passweb")) {
                        this.f4445 = textContent;
                    } else if (nodeName.equals("cashshop_web")) {
                        this.f4517 = textContent;
                    } else if (nodeName.equals("hide_login_background")) {
                        this.f4483 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("fileserver_url")) {
                        this.f4468 = textContent;
                    } else if (nodeName.equals("fileserver_is_latin1")) {
                        this.f4491 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("fileserver_filelist_url")) {
                        this.f4469 = textContent;
                    } else if (nodeName.equals("use_email_for_chardelete")) {
                        this.f4451 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("shared_body_palettes_type2")) {
                        this.f4478 = Boolean.valueOf(textContent).booleanValue();
                    } else if (nodeName.equals("enforce_login_background_id")) {
                        this.f4523 = Integer.valueOf(textContent).intValue();
                    } else if (nodeName.equals("disable_doram_creation")) {
                        this.f4486 = Boolean.parseBoolean(textContent);
                    } else if (nodeName.equals("use_sso_login_packet")) {
                        this.f4479 = Boolean.parseBoolean(textContent);
                    } else if (nodeName.equals("disable_rodex")) {
                        this.f4516 = Boolean.parseBoolean(textContent);
                    } else if (nodeName.equals("login_show_approx_online")) {
                        this.f4507 = Boolean.parseBoolean(textContent);
                    } else if (nodeName.equals("disable_bank")) {
                        this.f4525 = Boolean.parseBoolean(textContent);
                    } else if (!nodeName.equals("#text") || textContent.trim().length() > 0) {
                        C0624ov.m759("Unknown clientinfo option " + nodeName + " value=" + textContent);
                    }
                }
            }
            if (!z) {
                m786();
            }
            if (this.f4470 <= 20120410 && this.f4520 != null) {
                C0624ov.m759("Server " + this.f4522 + " has iteminfo enabled while " + this.f4470 + " client still does not support it");
            }
        }
    }

    /* renamed from: 鷭 */
    private void m778(ByteArrayInputStream byteArrayInputStream) {
        try {
            Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(byteArrayInputStream);
            this.f4300 = parse.getXmlEncoding();
            NodeList childNodes = parse.getDocumentElement().getChildNodes();
            int length = childNodes.getLength();
            for (int i = 0; i < length; i++) {
                Node item = childNodes.item(i);
                String nodeName = item.getNodeName();
                String textContent = item.getTextContent();
                if (nodeName.equals("servicetype")) {
                    this.f4302 = C0646.m781(textContent);
                } else if (nodeName.equals("servertype")) {
                    this.f4301 = C0647.m782(textContent);
                } else if (nodeName.equals("connection")) {
                    this.f4299.add(new C0650(item.getChildNodes()));
                }
            }
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (SAXException e2) {
            throw new RuntimeException(e2);
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }

    public C0643pc(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            m778(byteArrayInputStream);
            byteArrayInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
