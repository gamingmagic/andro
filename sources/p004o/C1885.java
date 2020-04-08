package p004o;

import android.support.p000v4.media.TransportMediator;
import android.support.p000v4.view.InputDeviceCompat;
import android.support.p000v4.view.MotionEventCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import org.apache.commons.net.bsd.RCommandClient;
import org.apache.commons.net.finger.FingerClient;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.ftp.FTPSClient;
import org.apache.commons.net.imap.IMAP;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.apache.commons.net.tftp.TFTP;
import org.apache.http.HttpStatus;
import p004o.C1452.C1453if;

/* renamed from: o.귊 */
public final class C1885 extends C0245ci {

    /* renamed from: ą */
    static boolean f8500 = false;

    /* renamed from: ċ */
    private static /* synthetic */ int[] f8501;

    /* renamed from: Ą */
    boolean f8502 = true;

    /* renamed from: Ć */
    boolean f8503 = false;

    /* renamed from: ć */
    C0548mb f8504;

    /* renamed from: ȃ */
    C0526lj f8505;

    /* renamed from: Ȋ */
    C0626ox f8506;

    /* renamed from: ˮ͈ */
    C0526lj f8507;

    /* renamed from: ˮ͍ */
    C0548mb f8508;

    /* renamed from: 岱 */
    long f8509;

    /* renamed from: 櫯 */
    ArrayList<C1452> f8510 = new ArrayList<>();

    /* renamed from: 鷭 */
    C0251co f8511;

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1041)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:973)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1000:0x156c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1002:0x1577 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1004:0x1582 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1006:0x158d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1008:0x1598 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1010:0x15a3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1012:0x15ae */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1014:0x15b9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1016:0x15c4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1018:0x15cf */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1020:0x15da */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1022:0x15e5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1024:0x15f0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1026:0x15fb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1028:0x1606 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1030:0x1611 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1032:0x161c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1034:0x1627 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1036:0x1632 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1038:0x163d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1040:0x1648 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1058:0x16ab */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1060:0x16b6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1062:0x16c1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1064:0x16cc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1066:0x16d7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1068:0x16e2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1070:0x16ed */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1072:0x16f8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1074:0x1703 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1076:0x170e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1078:0x1719 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1080:0x1724 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1362:0x1d32 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1364:0x1d3d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1366:0x1d48 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1368:0x1d53 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1370:0x1d5e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1372:0x1d69 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1374:0x1d74 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1376:0x1d7f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1378:0x1d8a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1380:0x1d95 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1382:0x1da0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1384:0x1dab */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1386:0x1db6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1388:0x1dc1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1390:0x1dcc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1392:0x1dd7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1394:0x1de2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1396:0x1ded */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1398:0x1df8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1400:0x1e03 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1402:0x1e0e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1404:0x1e19 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1406:0x1e24 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1408:0x1e2f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1410:0x1e3a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1412:0x1e45 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1414:0x1e50 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1432:0x1eb3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1434:0x1ebe */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1436:0x1ec9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1438:0x1ed4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1440:0x1edf */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1442:0x1eea */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1444:0x1ef5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1446:0x1f00 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1448:0x1f0b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1450:0x1f16 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1452:0x1f21 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1734:0x2530 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1736:0x253b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1738:0x2546 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1740:0x2551 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1742:0x255c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1744:0x2567 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1746:0x2572 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1748:0x257d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1750:0x2588 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1752:0x2593 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1754:0x259e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1756:0x25a9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1758:0x25b4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1760:0x25bf */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1762:0x25ca */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1764:0x25d5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1766:0x25e0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1768:0x25eb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1770:0x25f6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1772:0x2601 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1774:0x260c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1776:0x2617 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1778:0x2622 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1780:0x262d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1782:0x2638 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1784:0x2643 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1786:0x264e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1788:0x2659 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1804:0x26b1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1806:0x26bc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1808:0x26c7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1810:0x26d2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1812:0x26dd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1814:0x26e8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1816:0x26f3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1818:0x26fe */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1820:0x2709 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1822:0x2714 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1824:0x271f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2106:0x2d2e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2108:0x2d39 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2110:0x2d44 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2112:0x2d4f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2114:0x2d5a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2116:0x2d65 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2118:0x2d70 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2120:0x2d7b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2122:0x2d86 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:244:0x0534 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:246:0x053f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:248:0x054a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:250:0x0555 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:252:0x0560 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:254:0x056b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:256:0x0576 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:258:0x0581 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:260:0x058c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:262:0x0597 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:264:0x05a2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:266:0x05ad */
    /* JADX WARNING: Missing exception handler attribute for start block: B:268:0x05b8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:270:0x05c3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:272:0x05ce */
    /* JADX WARNING: Missing exception handler attribute for start block: B:274:0x05d9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:276:0x05e4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:278:0x05ef */
    /* JADX WARNING: Missing exception handler attribute for start block: B:280:0x05fa */
    /* JADX WARNING: Missing exception handler attribute for start block: B:282:0x0605 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:284:0x0610 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:286:0x061b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:288:0x0626 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:290:0x0631 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:292:0x063c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:294:0x0647 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:312:0x06aa */
    /* JADX WARNING: Missing exception handler attribute for start block: B:314:0x06b5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:316:0x06c0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:318:0x06cb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:320:0x06d6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:322:0x06e1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:324:0x06ec */
    /* JADX WARNING: Missing exception handler attribute for start block: B:326:0x06f7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:328:0x0702 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:330:0x070d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:332:0x0718 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:334:0x0723 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:616:0x0d32 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:618:0x0d3d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:620:0x0d48 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:622:0x0d53 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:624:0x0d5e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:626:0x0d69 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:628:0x0d74 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:630:0x0d7f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:632:0x0d8a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:634:0x0d95 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:636:0x0da0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:638:0x0dab */
    /* JADX WARNING: Missing exception handler attribute for start block: B:640:0x0db6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:642:0x0dc1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:644:0x0dcc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:646:0x0dd7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:648:0x0de2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:650:0x0ded */
    /* JADX WARNING: Missing exception handler attribute for start block: B:652:0x0df8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:654:0x0e03 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:656:0x0e0e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:658:0x0e19 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:660:0x0e24 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:662:0x0e2f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:664:0x0e3a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:666:0x0e45 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:668:0x0e50 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:686:0x0eb3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:688:0x0ebe */
    /* JADX WARNING: Missing exception handler attribute for start block: B:690:0x0ec9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:692:0x0ed4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:694:0x0edf */
    /* JADX WARNING: Missing exception handler attribute for start block: B:696:0x0eea */
    /* JADX WARNING: Missing exception handler attribute for start block: B:698:0x0ef5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:700:0x0f00 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:702:0x0f0b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:704:0x0f16 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:706:0x0f21 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:988:0x152a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:990:0x1535 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:992:0x1540 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:994:0x154b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:996:0x1556 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:998:0x1561 */
    /* renamed from: ˮ͈ */
    private static /* synthetic */ int[] m2554() {
        /*
            int[] r0 = f8501
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.ox[] r0 = p004o.C0626ox.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.ox r0 = p004o.C0626ox.ABSORBSPIRITS     // Catch:{ NoSuchFieldError -> 0x0017 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
            r1 = 255(0xff, float:3.57E-43)     // Catch:{ NoSuchFieldError -> 0x0017 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0017 }
        L_0x0017:
            o.ox r0 = p004o.C0626ox.AB_OFFERTORIUM     // Catch:{ NoSuchFieldError -> 0x0022 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
            r1 = 1033(0x409, float:1.448E-42)     // Catch:{ NoSuchFieldError -> 0x0022 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0022 }
        L_0x0022:
            o.ox r0 = p004o.C0626ox.AB_OFFERTORIUM_RING     // Catch:{ NoSuchFieldError -> 0x002d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
            r1 = 1043(0x413, float:1.462E-42)     // Catch:{ NoSuchFieldError -> 0x002d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002d }
        L_0x002d:
            o.ox r0 = p004o.C0626ox.ACIDDEMON     // Catch:{ NoSuchFieldError -> 0x0038 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
            r1 = 539(0x21b, float:7.55E-43)     // Catch:{ NoSuchFieldError -> 0x0038 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0038 }
        L_0x0038:
            o.ox r0 = p004o.C0626ox.ADO_STR     // Catch:{ NoSuchFieldError -> 0x0043 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
            r1 = 723(0x2d3, float:1.013E-42)     // Catch:{ NoSuchFieldError -> 0x0043 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0043 }
        L_0x0043:
            o.ox r0 = p004o.C0626ox.AGIUP     // Catch:{ NoSuchFieldError -> 0x004e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
            r1 = 458(0x1ca, float:6.42E-43)     // Catch:{ NoSuchFieldError -> 0x004e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x004e }
        L_0x004e:
            o.ox r0 = p004o.C0626ox.AGIUP2     // Catch:{ NoSuchFieldError -> 0x0059 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
            r1 = 779(0x30b, float:1.092E-42)     // Catch:{ NoSuchFieldError -> 0x0059 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0059 }
        L_0x0059:
            o.ox r0 = p004o.C0626ox.AGIUP3     // Catch:{ NoSuchFieldError -> 0x0064 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
            r1 = 781(0x30d, float:1.094E-42)     // Catch:{ NoSuchFieldError -> 0x0064 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0064 }
        L_0x0064:
            o.ox r0 = p004o.C0626ox.AIMED_STR     // Catch:{ NoSuchFieldError -> 0x006f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
            r1 = 747(0x2eb, float:1.047E-42)     // Catch:{ NoSuchFieldError -> 0x006f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x006f }
        L_0x006f:
            o.ox r0 = p004o.C0626ox.AIRTEXTURE     // Catch:{ NoSuchFieldError -> 0x007a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
            r1 = 418(0x1a2, float:5.86E-43)     // Catch:{ NoSuchFieldError -> 0x007a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x007a }
        L_0x007a:
            o.ox r0 = p004o.C0626ox.AKAITSUKI     // Catch:{ NoSuchFieldError -> 0x0085 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
            r1 = 1011(0x3f3, float:1.417E-42)     // Catch:{ NoSuchFieldError -> 0x0085 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0085 }
        L_0x0085:
            o.ox r0 = p004o.C0626ox.ALL_FULL_THROTTLE     // Catch:{ NoSuchFieldError -> 0x0090 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
            r1 = 1029(0x405, float:1.442E-42)     // Catch:{ NoSuchFieldError -> 0x0090 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0090 }
        L_0x0090:
            o.ox r0 = p004o.C0626ox.ALL_RAY_OF_PROTECTION     // Catch:{ NoSuchFieldError -> 0x009b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
            r1 = 1021(0x3fd, float:1.431E-42)     // Catch:{ NoSuchFieldError -> 0x009b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x009b }
        L_0x009b:
            o.ox r0 = p004o.C0626ox.ANGEL     // Catch:{ NoSuchFieldError -> 0x00a6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a6 }
            r1 = 373(0x175, float:5.23E-43)     // Catch:{ NoSuchFieldError -> 0x00a6 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00a6 }
        L_0x00a6:
            o.ox r0 = p004o.C0626ox.ANGEL2     // Catch:{ NoSuchFieldError -> 0x00b1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b1 }
            r1 = 340(0x154, float:4.76E-43)     // Catch:{ NoSuchFieldError -> 0x00b1 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00b1 }
        L_0x00b1:
            o.ox r0 = p004o.C0626ox.ANGEL3     // Catch:{ NoSuchFieldError -> 0x00bc }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bc }
            r1 = 584(0x248, float:8.18E-43)     // Catch:{ NoSuchFieldError -> 0x00bc }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00bc }
        L_0x00bc:
            o.ox r0 = p004o.C0626ox.ANGELUS     // Catch:{ NoSuchFieldError -> 0x00c7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c7 }
            r1 = 43     // Catch:{ NoSuchFieldError -> 0x00c7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00c7 }
        L_0x00c7:
            o.ox r0 = p004o.C0626ox.AQUA     // Catch:{ NoSuchFieldError -> 0x00d2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d2 }
            r1 = 41     // Catch:{ NoSuchFieldError -> 0x00d2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00d2 }
        L_0x00d2:
            o.ox r0 = p004o.C0626ox.ARROWSHOT     // Catch:{ NoSuchFieldError -> 0x00dd }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dd }
            r1 = 66     // Catch:{ NoSuchFieldError -> 0x00dd }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00dd }
        L_0x00dd:
            o.ox r0 = p004o.C0626ox.ARROWSTORM_STR     // Catch:{ NoSuchFieldError -> 0x00e8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e8 }
            r1 = 748(0x2ec, float:1.048E-42)     // Catch:{ NoSuchFieldError -> 0x00e8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00e8 }
        L_0x00e8:
            o.ox r0 = p004o.C0626ox.ASPERSIO     // Catch:{ NoSuchFieldError -> 0x00f3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
            r1 = 88     // Catch:{ NoSuchFieldError -> 0x00f3 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00f3 }
        L_0x00f3:
            o.ox r0 = p004o.C0626ox.ASSUMPTIO     // Catch:{ NoSuchFieldError -> 0x00fe }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fe }
            r1 = 377(0x179, float:5.28E-43)     // Catch:{ NoSuchFieldError -> 0x00fe }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00fe }
        L_0x00fe:
            o.ox r0 = p004o.C0626ox.ASSUMPTIO2     // Catch:{ NoSuchFieldError -> 0x0109 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0109 }
            r1 = 442(0x1ba, float:6.2E-43)     // Catch:{ NoSuchFieldError -> 0x0109 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0109 }
        L_0x0109:
            o.ox r0 = p004o.C0626ox.ASURABODY     // Catch:{ NoSuchFieldError -> 0x0114 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
            r1 = 426(0x1aa, float:5.97E-43)     // Catch:{ NoSuchFieldError -> 0x0114 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0114 }
        L_0x0114:
            o.ox r0 = p004o.C0626ox.ASURABODY_MONSTER     // Catch:{ NoSuchFieldError -> 0x011f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x011f }
            r1 = 429(0x1ad, float:6.01E-43)     // Catch:{ NoSuchFieldError -> 0x011f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x011f }
        L_0x011f:
            o.ox r0 = p004o.C0626ox.ATTACKENERGY     // Catch:{ NoSuchFieldError -> 0x012a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x012a }
            r1 = 439(0x1b7, float:6.15E-43)     // Catch:{ NoSuchFieldError -> 0x012a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x012a }
        L_0x012a:
            o.ox r0 = p004o.C0626ox.ATTACKENERGY2     // Catch:{ NoSuchFieldError -> 0x0135 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0135 }
            r1 = 440(0x1b8, float:6.17E-43)     // Catch:{ NoSuchFieldError -> 0x0135 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0135 }
        L_0x0135:
            o.ox r0 = p004o.C0626ox.AURABLADE     // Catch:{ NoSuchFieldError -> 0x0140 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0140 }
            r1 = 369(0x171, float:5.17E-43)     // Catch:{ NoSuchFieldError -> 0x0140 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0140 }
        L_0x0140:
            o.ox r0 = p004o.C0626ox.AURABLADE2     // Catch:{ NoSuchFieldError -> 0x014b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x014b }
            r1 = 476(0x1dc, float:6.67E-43)     // Catch:{ NoSuchFieldError -> 0x014b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x014b }
        L_0x014b:
            o.ox r0 = p004o.C0626ox.AUTOCOUNTER     // Catch:{ NoSuchFieldError -> 0x0156 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0156 }
            r1 = 133(0x85, float:1.86E-43)     // Catch:{ NoSuchFieldError -> 0x0156 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0156 }
        L_0x0156:
            o.ox r0 = p004o.C0626ox.BABY     // Catch:{ NoSuchFieldError -> 0x0161 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0161 }
            r1 = 410(0x19a, float:5.75E-43)     // Catch:{ NoSuchFieldError -> 0x0161 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0161 }
        L_0x0161:
            o.ox r0 = p004o.C0626ox.BABYBODY     // Catch:{ NoSuchFieldError -> 0x016c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x016c }
            r1 = 422(0x1a6, float:5.91E-43)     // Catch:{ NoSuchFieldError -> 0x016c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x016c }
        L_0x016c:
            o.ox r0 = p004o.C0626ox.BABYBODY2     // Catch:{ NoSuchFieldError -> 0x0177 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0177 }
            r1 = 423(0x1a7, float:5.93E-43)     // Catch:{ NoSuchFieldError -> 0x0177 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0177 }
        L_0x0177:
            o.ox r0 = p004o.C0626ox.BABYBODY_BACK     // Catch:{ NoSuchFieldError -> 0x0182 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0182 }
            r1 = 542(0x21e, float:7.6E-43)     // Catch:{ NoSuchFieldError -> 0x0182 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0182 }
        L_0x0182:
            o.ox r0 = p004o.C0626ox.BACKSTAP     // Catch:{ NoSuchFieldError -> 0x018d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x018d }
            r1 = 277(0x115, float:3.88E-43)     // Catch:{ NoSuchFieldError -> 0x018d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x018d }
        L_0x018d:
            o.ox r0 = p004o.C0626ox.BAKU     // Catch:{ NoSuchFieldError -> 0x0198 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0198 }
            r1 = 637(0x27d, float:8.93E-43)     // Catch:{ NoSuchFieldError -> 0x0198 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0198 }
        L_0x0198:
            o.ox r0 = p004o.C0626ox.BANISHING_BUSTER     // Catch:{ NoSuchFieldError -> 0x01a3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a3 }
            r1 = 1048(0x418, float:1.469E-42)     // Catch:{ NoSuchFieldError -> 0x01a3 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01a3 }
        L_0x01a3:
            o.ox r0 = p004o.C0626ox.BANJJAKII     // Catch:{ NoSuchFieldError -> 0x01ae }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ae }
            r1 = 167(0xa7, float:2.34E-43)     // Catch:{ NoSuchFieldError -> 0x01ae }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01ae }
        L_0x01ae:
            o.ox r0 = p004o.C0626ox.BARRIER     // Catch:{ NoSuchFieldError -> 0x01b9 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b9 }
            r1 = 65     // Catch:{ NoSuchFieldError -> 0x01b9 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01b9 }
        L_0x01b9:
            o.ox r0 = p004o.C0626ox.BASH     // Catch:{ NoSuchFieldError -> 0x01c4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c4 }
            r1 = 18     // Catch:{ NoSuchFieldError -> 0x01c4 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01c4 }
        L_0x01c4:
            o.ox r0 = p004o.C0626ox.BASH3D     // Catch:{ NoSuchFieldError -> 0x01cf }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01cf }
            r1 = 368(0x170, float:5.16E-43)     // Catch:{ NoSuchFieldError -> 0x01cf }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01cf }
        L_0x01cf:
            o.ox r0 = p004o.C0626ox.BASH3D2     // Catch:{ NoSuchFieldError -> 0x01da }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01da }
            r1 = 379(0x17b, float:5.31E-43)     // Catch:{ NoSuchFieldError -> 0x01da }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01da }
        L_0x01da:
            o.ox r0 = p004o.C0626ox.BASH3D3     // Catch:{ NoSuchFieldError -> 0x01e5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01e5 }
            r1 = 401(0x191, float:5.62E-43)     // Catch:{ NoSuchFieldError -> 0x01e5 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01e5 }
        L_0x01e5:
            o.ox r0 = p004o.C0626ox.BASH3D4     // Catch:{ NoSuchFieldError -> 0x01f0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01f0 }
            r1 = 402(0x192, float:5.63E-43)     // Catch:{ NoSuchFieldError -> 0x01f0 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01f0 }
        L_0x01f0:
            o.ox r0 = p004o.C0626ox.BASH3D5     // Catch:{ NoSuchFieldError -> 0x01fb }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01fb }
            r1 = 630(0x276, float:8.83E-43)     // Catch:{ NoSuchFieldError -> 0x01fb }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01fb }
        L_0x01fb:
            o.ox r0 = p004o.C0626ox.BASH3D6     // Catch:{ NoSuchFieldError -> 0x0206 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0206 }
            r1 = 887(0x377, float:1.243E-42)     // Catch:{ NoSuchFieldError -> 0x0206 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0206 }
        L_0x0206:
            o.ox r0 = p004o.C0626ox.BAT     // Catch:{ NoSuchFieldError -> 0x0211 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0211 }
            r1 = 361(0x169, float:5.06E-43)     // Catch:{ NoSuchFieldError -> 0x0211 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0211 }
        L_0x0211:
            o.ox r0 = p004o.C0626ox.BAT2     // Catch:{ NoSuchFieldError -> 0x021c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x021c }
            r1 = 362(0x16a, float:5.07E-43)     // Catch:{ NoSuchFieldError -> 0x021c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x021c }
        L_0x021c:
            o.ox r0 = p004o.C0626ox.BEGINASURA     // Catch:{ NoSuchFieldError -> 0x0227 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0227 }
            r1 = 330(0x14a, float:4.62E-43)     // Catch:{ NoSuchFieldError -> 0x0227 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0227 }
        L_0x0227:
            o.ox r0 = p004o.C0626ox.BEGINASURA1     // Catch:{ NoSuchFieldError -> 0x0232 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0232 }
            r1 = 469(0x1d5, float:6.57E-43)     // Catch:{ NoSuchFieldError -> 0x0232 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0232 }
        L_0x0232:
            o.ox r0 = p004o.C0626ox.BEGINASURA11     // Catch:{ NoSuchFieldError -> 0x023d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x023d }
            r1 = 512(0x200, float:7.175E-43)     // Catch:{ NoSuchFieldError -> 0x023d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x023d }
        L_0x023d:
            o.ox r0 = p004o.C0626ox.BEGINASURA2     // Catch:{ NoSuchFieldError -> 0x0248 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0248 }
            r1 = 470(0x1d6, float:6.59E-43)     // Catch:{ NoSuchFieldError -> 0x0248 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0248 }
        L_0x0248:
            o.ox r0 = p004o.C0626ox.BEGINASURA3     // Catch:{ NoSuchFieldError -> 0x0253 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0253 }
            r1 = 471(0x1d7, float:6.6E-43)     // Catch:{ NoSuchFieldError -> 0x0253 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0253 }
        L_0x0253:
            o.ox r0 = p004o.C0626ox.BEGINASURA4     // Catch:{ NoSuchFieldError -> 0x025e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x025e }
            r1 = 472(0x1d8, float:6.61E-43)     // Catch:{ NoSuchFieldError -> 0x025e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x025e }
        L_0x025e:
            o.ox r0 = p004o.C0626ox.BEGINASURA5     // Catch:{ NoSuchFieldError -> 0x0269 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0269 }
            r1 = 473(0x1d9, float:6.63E-43)     // Catch:{ NoSuchFieldError -> 0x0269 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0269 }
        L_0x0269:
            o.ox r0 = p004o.C0626ox.BEGINASURA6     // Catch:{ NoSuchFieldError -> 0x0274 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0274 }
            r1 = 474(0x1da, float:6.64E-43)     // Catch:{ NoSuchFieldError -> 0x0274 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0274 }
        L_0x0274:
            o.ox r0 = p004o.C0626ox.BEGINASURA7     // Catch:{ NoSuchFieldError -> 0x027f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x027f }
            r1 = 475(0x1db, float:6.66E-43)     // Catch:{ NoSuchFieldError -> 0x027f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x027f }
        L_0x027f:
            o.ox r0 = p004o.C0626ox.BEGINSPELL     // Catch:{ NoSuchFieldError -> 0x028a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x028a }
            r1 = 14     // Catch:{ NoSuchFieldError -> 0x028a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x028a }
        L_0x028a:
            o.ox r0 = p004o.C0626ox.BEGINSPELL2     // Catch:{ NoSuchFieldError -> 0x0295 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0295 }
            r1 = 56     // Catch:{ NoSuchFieldError -> 0x0295 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0295 }
        L_0x0295:
            o.ox r0 = p004o.C0626ox.BEGINSPELL3     // Catch:{ NoSuchFieldError -> 0x02a0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x02a0 }
            r1 = 57     // Catch:{ NoSuchFieldError -> 0x02a0 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x02a0 }
        L_0x02a0:
            o.ox r0 = p004o.C0626ox.BEGINSPELL4     // Catch:{ NoSuchFieldError -> 0x02ab }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x02ab }
            r1 = 58     // Catch:{ NoSuchFieldError -> 0x02ab }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x02ab }
        L_0x02ab:
            o.ox r0 = p004o.C0626ox.BEGINSPELL5     // Catch:{ NoSuchFieldError -> 0x02b6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x02b6 }
            r1 = 59     // Catch:{ NoSuchFieldError -> 0x02b6 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x02b6 }
        L_0x02b6:
            o.ox r0 = p004o.C0626ox.BEGINSPELL6     // Catch:{ NoSuchFieldError -> 0x02c1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x02c1 }
            r1 = 60     // Catch:{ NoSuchFieldError -> 0x02c1 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x02c1 }
        L_0x02c1:
            o.ox r0 = p004o.C0626ox.BEGINSPELL7     // Catch:{ NoSuchFieldError -> 0x02cc }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x02cc }
            r1 = 61     // Catch:{ NoSuchFieldError -> 0x02cc }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x02cc }
        L_0x02cc:
            o.ox r0 = p004o.C0626ox.BEGINSPELL_150     // Catch:{ NoSuchFieldError -> 0x02d7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x02d7 }
            r1 = 882(0x372, float:1.236E-42)     // Catch:{ NoSuchFieldError -> 0x02d7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x02d7 }
        L_0x02d7:
            o.ox r0 = p004o.C0626ox.BEGINSPELL_N1     // Catch:{ NoSuchFieldError -> 0x02e2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x02e2 }
            r1 = 832(0x340, float:1.166E-42)     // Catch:{ NoSuchFieldError -> 0x02e2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x02e2 }
        L_0x02e2:
            o.ox r0 = p004o.C0626ox.BEGINSPELL_N2     // Catch:{ NoSuchFieldError -> 0x02ed }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x02ed }
            r1 = 833(0x341, float:1.167E-42)     // Catch:{ NoSuchFieldError -> 0x02ed }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x02ed }
        L_0x02ed:
            o.ox r0 = p004o.C0626ox.BEGINSPELL_N3     // Catch:{ NoSuchFieldError -> 0x02f8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x02f8 }
            r1 = 842(0x34a, float:1.18E-42)     // Catch:{ NoSuchFieldError -> 0x02f8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x02f8 }
        L_0x02f8:
            o.ox r0 = p004o.C0626ox.BEGINSPELL_N4     // Catch:{ NoSuchFieldError -> 0x0303 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0303 }
            r1 = 843(0x34b, float:1.181E-42)     // Catch:{ NoSuchFieldError -> 0x0303 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0303 }
        L_0x0303:
            o.ox r0 = p004o.C0626ox.BEGINSPELL_N5     // Catch:{ NoSuchFieldError -> 0x030e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x030e }
            r1 = 844(0x34c, float:1.183E-42)     // Catch:{ NoSuchFieldError -> 0x030e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x030e }
        L_0x030e:
            o.ox r0 = p004o.C0626ox.BEGINSPELL_N6     // Catch:{ NoSuchFieldError -> 0x0319 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0319 }
            r1 = 845(0x34d, float:1.184E-42)     // Catch:{ NoSuchFieldError -> 0x0319 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0319 }
        L_0x0319:
            o.ox r0 = p004o.C0626ox.BEGINSPELL_N7     // Catch:{ NoSuchFieldError -> 0x0324 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0324 }
            r1 = 846(0x34e, float:1.185E-42)     // Catch:{ NoSuchFieldError -> 0x0324 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0324 }
        L_0x0324:
            o.ox r0 = p004o.C0626ox.BEGINSPELL_N8     // Catch:{ NoSuchFieldError -> 0x032f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x032f }
            r1 = 847(0x34f, float:1.187E-42)     // Catch:{ NoSuchFieldError -> 0x032f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x032f }
        L_0x032f:
            o.ox r0 = p004o.C0626ox.BEGINSPELL_YB     // Catch:{ NoSuchFieldError -> 0x033a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x033a }
            r1 = 905(0x389, float:1.268E-42)     // Catch:{ NoSuchFieldError -> 0x033a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x033a }
        L_0x033a:
            o.ox r0 = p004o.C0626ox.BENEDICTIO     // Catch:{ NoSuchFieldError -> 0x0345 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0345 }
            r1 = 93     // Catch:{ NoSuchFieldError -> 0x0345 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0345 }
        L_0x0345:
            o.ox r0 = p004o.C0626ox.BIG_PORTAL     // Catch:{ NoSuchFieldError -> 0x0350 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0350 }
            r1 = 563(0x233, float:7.89E-43)     // Catch:{ NoSuchFieldError -> 0x0350 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0350 }
        L_0x0350:
            o.ox r0 = p004o.C0626ox.BIG_PORTAL2     // Catch:{ NoSuchFieldError -> 0x035b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x035b }
            r1 = 564(0x234, float:7.9E-43)     // Catch:{ NoSuchFieldError -> 0x035b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x035b }
        L_0x035b:
            o.ox r0 = p004o.C0626ox.BLACKBODY     // Catch:{ NoSuchFieldError -> 0x0366 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0366 }
            r1 = 814(0x32e, float:1.14E-42)     // Catch:{ NoSuchFieldError -> 0x0366 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0366 }
        L_0x0366:
            o.ox r0 = p004o.C0626ox.BLACKDEVIL     // Catch:{ NoSuchFieldError -> 0x0371 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0371 }
            r1 = 489(0x1e9, float:6.85E-43)     // Catch:{ NoSuchFieldError -> 0x0371 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0371 }
        L_0x0371:
            o.ox r0 = p004o.C0626ox.BLACK_NUMBER     // Catch:{ NoSuchFieldError -> 0x037c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x037c }
            r1 = 663(0x297, float:9.29E-43)     // Catch:{ NoSuchFieldError -> 0x037c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x037c }
        L_0x037c:
            o.ox r0 = p004o.C0626ox.BLASTMINE     // Catch:{ NoSuchFieldError -> 0x0387 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0387 }
            r1 = 107(0x6b, float:1.5E-43)     // Catch:{ NoSuchFieldError -> 0x0387 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0387 }
        L_0x0387:
            o.ox r0 = p004o.C0626ox.BLASTMINEBOMB     // Catch:{ NoSuchFieldError -> 0x0392 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0392 }
            r1 = 108(0x6c, float:1.51E-43)     // Catch:{ NoSuchFieldError -> 0x0392 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0392 }
        L_0x0392:
            o.ox r0 = p004o.C0626ox.BLEEDING     // Catch:{ NoSuchFieldError -> 0x039d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x039d }
            r1 = 671(0x29f, float:9.4E-43)     // Catch:{ NoSuchFieldError -> 0x039d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x039d }
        L_0x039d:
            o.ox r0 = p004o.C0626ox.BLESSING     // Catch:{ NoSuchFieldError -> 0x03a8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x03a8 }
            r1 = 44     // Catch:{ NoSuchFieldError -> 0x03a8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x03a8 }
        L_0x03a8:
            o.ox r0 = p004o.C0626ox.BLIND     // Catch:{ NoSuchFieldError -> 0x03b3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x03b3 }
            r1 = 336(0x150, float:4.71E-43)     // Catch:{ NoSuchFieldError -> 0x03b3 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x03b3 }
        L_0x03b3:
            o.ox r0 = p004o.C0626ox.BLIND_S     // Catch:{ NoSuchFieldError -> 0x03be }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x03be }
            r1 = 641(0x281, float:8.98E-43)     // Catch:{ NoSuchFieldError -> 0x03be }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x03be }
        L_0x03be:
            o.ox r0 = p004o.C0626ox.BLITZBEAT     // Catch:{ NoSuchFieldError -> 0x03c9 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x03c9 }
            r1 = 117(0x75, float:1.64E-43)     // Catch:{ NoSuchFieldError -> 0x03c9 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x03c9 }
        L_0x03c9:
            o.ox r0 = p004o.C0626ox.BLOODDRAIN     // Catch:{ NoSuchFieldError -> 0x03d4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x03d4 }
            r1 = 218(0xda, float:3.05E-43)     // Catch:{ NoSuchFieldError -> 0x03d4 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x03d4 }
        L_0x03d4:
            o.ox r0 = p004o.C0626ox.BLOODDRAIN2     // Catch:{ NoSuchFieldError -> 0x03df }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x03df }
            r1 = 1038(0x40e, float:1.455E-42)     // Catch:{ NoSuchFieldError -> 0x03df }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x03df }
        L_0x03df:
            o.ox r0 = p004o.C0626ox.BLUEBODY     // Catch:{ NoSuchFieldError -> 0x03ea }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x03ea }
            r1 = 544(0x220, float:7.62E-43)     // Catch:{ NoSuchFieldError -> 0x03ea }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x03ea }
        L_0x03ea:
            o.ox r0 = p004o.C0626ox.BLUECASTING     // Catch:{ NoSuchFieldError -> 0x03f5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x03f5 }
            r1 = 443(0x1bb, float:6.21E-43)     // Catch:{ NoSuchFieldError -> 0x03f5 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x03f5 }
        L_0x03f5:
            o.ox r0 = p004o.C0626ox.BLUEFALL     // Catch:{ NoSuchFieldError -> 0x0400 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0400 }
            r1 = 559(0x22f, float:7.83E-43)     // Catch:{ NoSuchFieldError -> 0x0400 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0400 }
        L_0x0400:
            o.ox r0 = p004o.C0626ox.BLUEFALL_90     // Catch:{ NoSuchFieldError -> 0x040b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x040b }
            r1 = 560(0x230, float:7.85E-43)     // Catch:{ NoSuchFieldError -> 0x040b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x040b }
        L_0x040b:
            o.ox r0 = p004o.C0626ox.BLUELIGHTBODY     // Catch:{ NoSuchFieldError -> 0x0416 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0416 }
            r1 = 1005(0x3ed, float:1.408E-42)     // Catch:{ NoSuchFieldError -> 0x0416 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0416 }
        L_0x0416:
            o.ox r0 = p004o.C0626ox.BLUELINE     // Catch:{ NoSuchFieldError -> 0x0421 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0421 }
            r1 = 901(0x385, float:1.263E-42)     // Catch:{ NoSuchFieldError -> 0x0421 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0421 }
        L_0x0421:
            o.ox r0 = p004o.C0626ox.BLUE_HIT     // Catch:{ NoSuchFieldError -> 0x042c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x042c }
            r1 = 551(0x227, float:7.72E-43)     // Catch:{ NoSuchFieldError -> 0x042c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x042c }
        L_0x042c:
            o.ox r0 = p004o.C0626ox.BLUE_NUMBER     // Catch:{ NoSuchFieldError -> 0x0437 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0437 }
            r1 = 660(0x294, float:9.25E-43)     // Catch:{ NoSuchFieldError -> 0x0437 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0437 }
        L_0x0437:
            o.ox r0 = p004o.C0626ox.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0442 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0442 }
            r1 = 116(0x74, float:1.63E-43)     // Catch:{ NoSuchFieldError -> 0x0442 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0442 }
        L_0x0442:
            o.ox r0 = p004o.C0626ox.BOTTOM2     // Catch:{ NoSuchFieldError -> 0x044d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x044d }
            r1 = 139(0x8b, float:1.95E-43)     // Catch:{ NoSuchFieldError -> 0x044d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x044d }
        L_0x044d:
            o.ox r0 = p004o.C0626ox.BOTTOM_ANI     // Catch:{ NoSuchFieldError -> 0x0458 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0458 }
            r1 = 829(0x33d, float:1.162E-42)     // Catch:{ NoSuchFieldError -> 0x0458 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0458 }
        L_0x0458:
            o.ox r0 = p004o.C0626ox.BOTTOM_APPLEIDUN     // Catch:{ NoSuchFieldError -> 0x0463 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0463 }
            r1 = 291(0x123, float:4.08E-43)     // Catch:{ NoSuchFieldError -> 0x0463 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0463 }
        L_0x0463:
            o.ox r0 = p004o.C0626ox.BOTTOM_ASSASSINCROSS     // Catch:{ NoSuchFieldError -> 0x046e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x046e }
            r1 = 289(0x121, float:4.05E-43)     // Catch:{ NoSuchFieldError -> 0x046e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x046e }
        L_0x046e:
            o.ox r0 = p004o.C0626ox.BOTTOM_BARRIER     // Catch:{ NoSuchFieldError -> 0x0479 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0479 }
            r1 = 785(0x311, float:1.1E-42)     // Catch:{ NoSuchFieldError -> 0x0479 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0479 }
        L_0x0479:
            o.ox r0 = p004o.C0626ox.BOTTOM_BASILICA     // Catch:{ NoSuchFieldError -> 0x0484 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0484 }
            r1 = 376(0x178, float:5.27E-43)     // Catch:{ NoSuchFieldError -> 0x0484 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0484 }
        L_0x0484:
            o.ox r0 = p004o.C0626ox.BOTTOM_BASILICA2     // Catch:{ NoSuchFieldError -> 0x048f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x048f }
            r1 = 804(0x324, float:1.127E-42)     // Catch:{ NoSuchFieldError -> 0x048f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x048f }
        L_0x048f:
            o.ox r0 = p004o.C0626ox.BOTTOM_BLOODYLUST     // Catch:{ NoSuchFieldError -> 0x049a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x049a }
            r1 = 831(0x33f, float:1.164E-42)     // Catch:{ NoSuchFieldError -> 0x049a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x049a }
        L_0x049a:
            o.ox r0 = p004o.C0626ox.BOTTOM_BLUE     // Catch:{ NoSuchFieldError -> 0x04a5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x04a5 }
            r1 = 717(0x2cd, float:1.005E-42)     // Catch:{ NoSuchFieldError -> 0x04a5 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x04a5 }
        L_0x04a5:
            o.ox r0 = p004o.C0626ox.BOTTOM_BLUE2     // Catch:{ NoSuchFieldError -> 0x04b0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x04b0 }
            r1 = 718(0x2ce, float:1.006E-42)     // Catch:{ NoSuchFieldError -> 0x04b0 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x04b0 }
        L_0x04b0:
            o.ox r0 = p004o.C0626ox.BOTTOM_DE     // Catch:{ NoSuchFieldError -> 0x04bb }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x04bb }
            r1 = 242(0xf2, float:3.39E-43)     // Catch:{ NoSuchFieldError -> 0x04bb }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x04bb }
        L_0x04bb:
            o.ox r0 = p004o.C0626ox.BOTTOM_DE2     // Catch:{ NoSuchFieldError -> 0x04c6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x04c6 }
            r1 = 941(0x3ad, float:1.319E-42)     // Catch:{ NoSuchFieldError -> 0x04c6 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x04c6 }
        L_0x04c6:
            o.ox r0 = p004o.C0626ox.BOTTOM_DISSONANCE     // Catch:{ NoSuchFieldError -> 0x04d1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x04d1 }
            r1 = 279(0x117, float:3.91E-43)     // Catch:{ NoSuchFieldError -> 0x04d1 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x04d1 }
        L_0x04d1:
            o.ox r0 = p004o.C0626ox.BOTTOM_DONTFORGETME     // Catch:{ NoSuchFieldError -> 0x04dc }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x04dc }
            r1 = 294(0x126, float:4.12E-43)     // Catch:{ NoSuchFieldError -> 0x04dc }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x04dc }
        L_0x04dc:
            o.ox r0 = p004o.C0626ox.BOTTOM_DRUMBATTLEFIELD     // Catch:{ NoSuchFieldError -> 0x04e7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x04e7 }
            r1 = 283(0x11b, float:3.97E-43)     // Catch:{ NoSuchFieldError -> 0x04e7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x04e7 }
        L_0x04e7:
            o.ox r0 = p004o.C0626ox.BOTTOM_ETERNALCHAOS     // Catch:{ NoSuchFieldError -> 0x04f2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x04f2 }
            r1 = 282(0x11a, float:3.95E-43)     // Catch:{ NoSuchFieldError -> 0x04f2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x04f2 }
        L_0x04f2:
            o.ox r0 = p004o.C0626ox.BOTTOM_EVILLAND     // Catch:{ NoSuchFieldError -> 0x04fd }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x04fd }
            r1 = 676(0x2a4, float:9.47E-43)     // Catch:{ NoSuchFieldError -> 0x04fd }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x04fd }
        L_0x04fd:
            o.ox r0 = p004o.C0626ox.BOTTOM_FOGWALL     // Catch:{ NoSuchFieldError -> 0x0508 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0508 }
            r1 = 407(0x197, float:5.7E-43)     // Catch:{ NoSuchFieldError -> 0x0508 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0508 }
        L_0x0508:
            o.ox r0 = p004o.C0626ox.BOTTOM_FORTUNEKISS     // Catch:{ NoSuchFieldError -> 0x0513 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0513 }
            r1 = 295(0x127, float:4.13E-43)     // Catch:{ NoSuchFieldError -> 0x0513 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0513 }
        L_0x0513:
            o.ox r0 = p004o.C0626ox.BOTTOM_GOSPEL     // Catch:{ NoSuchFieldError -> 0x051e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x051e }
            r1 = 372(0x174, float:5.21E-43)     // Catch:{ NoSuchFieldError -> 0x051e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x051e }
        L_0x051e:
            o.ox r0 = p004o.C0626ox.BOTTOM_HERMODE     // Catch:{ NoSuchFieldError -> 0x0529 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0529 }
            r1 = 519(0x207, float:7.27E-43)     // Catch:{ NoSuchFieldError -> 0x0529 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0529 }
        L_0x0529:
            o.ox r0 = p004o.C0626ox.BOTTOM_HUMMING     // Catch:{ NoSuchFieldError -> 0x0534 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0534 }
            r1 = 293(0x125, float:4.1E-43)     // Catch:{ NoSuchFieldError -> 0x0534 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0534 }
        L_0x0534:
            o.ox r0 = p004o.C0626ox.BOTTOM_INTOABYSS     // Catch:{ NoSuchFieldError -> 0x053f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x053f }
            r1 = 286(0x11e, float:4.01E-43)     // Catch:{ NoSuchFieldError -> 0x053f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x053f }
        L_0x053f:
            o.ox r0 = p004o.C0626ox.BOTTOM_LA     // Catch:{ NoSuchFieldError -> 0x054a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x054a }
            r1 = 244(0xf4, float:3.42E-43)     // Catch:{ NoSuchFieldError -> 0x054a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x054a }
        L_0x054a:
            o.ox r0 = p004o.C0626ox.BOTTOM_LULLABY     // Catch:{ NoSuchFieldError -> 0x0555 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0555 }
            r1 = 280(0x118, float:3.92E-43)     // Catch:{ NoSuchFieldError -> 0x0555 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0555 }
        L_0x0555:
            o.ox r0 = p004o.C0626ox.BOTTOM_MAELSTROM     // Catch:{ NoSuchFieldError -> 0x0560 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0560 }
            r1 = 830(0x33e, float:1.163E-42)     // Catch:{ NoSuchFieldError -> 0x0560 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0560 }
        L_0x0560:
            o.ox r0 = p004o.C0626ox.BOTTOM_MAG     // Catch:{ NoSuchFieldError -> 0x056b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x056b }
            r1 = 320(0x140, float:4.48E-43)     // Catch:{ NoSuchFieldError -> 0x056b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x056b }
        L_0x056b:
            o.ox r0 = p004o.C0626ox.BOTTOM_MANHOLE     // Catch:{ NoSuchFieldError -> 0x0576 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0576 }
            r1 = 824(0x338, float:1.155E-42)     // Catch:{ NoSuchFieldError -> 0x0576 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0576 }
        L_0x0576:
            o.ox r0 = p004o.C0626ox.BOTTOM_POEMBRAGI     // Catch:{ NoSuchFieldError -> 0x0581 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0581 }
            r1 = 290(0x122, float:4.06E-43)     // Catch:{ NoSuchFieldError -> 0x0581 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0581 }
        L_0x0581:
            o.ox r0 = p004o.C0626ox.BOTTOM_RICHMANKIM     // Catch:{ NoSuchFieldError -> 0x058c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x058c }
            r1 = 281(0x119, float:3.94E-43)     // Catch:{ NoSuchFieldError -> 0x058c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x058c }
        L_0x058c:
            o.ox r0 = p004o.C0626ox.BOTTOM_RINGNIBELUNGEN     // Catch:{ NoSuchFieldError -> 0x0597 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0597 }
            r1 = 284(0x11c, float:3.98E-43)     // Catch:{ NoSuchFieldError -> 0x0597 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0597 }
        L_0x0597:
            o.ox r0 = p004o.C0626ox.BOTTOM_ROKISWEIL     // Catch:{ NoSuchFieldError -> 0x05a2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x05a2 }
            r1 = 285(0x11d, float:4.0E-43)     // Catch:{ NoSuchFieldError -> 0x05a2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x05a2 }
        L_0x05a2:
            o.ox r0 = p004o.C0626ox.BOTTOM_RUNNER     // Catch:{ NoSuchFieldError -> 0x05ad }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x05ad }
            r1 = 673(0x2a1, float:9.43E-43)     // Catch:{ NoSuchFieldError -> 0x05ad }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x05ad }
        L_0x05ad:
            o.ox r0 = p004o.C0626ox.BOTTOM_SANC     // Catch:{ NoSuchFieldError -> 0x05b8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x05b8 }
            r1 = 321(0x141, float:4.5E-43)     // Catch:{ NoSuchFieldError -> 0x05b8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x05b8 }
        L_0x05b8:
            o.ox r0 = p004o.C0626ox.BOTTOM_SERVICEFORYOU     // Catch:{ NoSuchFieldError -> 0x05c3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x05c3 }
            r1 = 296(0x128, float:4.15E-43)     // Catch:{ NoSuchFieldError -> 0x05c3 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x05c3 }
        L_0x05c3:
            o.ox r0 = p004o.C0626ox.BOTTOM_SIEGFRIED     // Catch:{ NoSuchFieldError -> 0x05ce }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x05ce }
            r1 = 287(0x11f, float:4.02E-43)     // Catch:{ NoSuchFieldError -> 0x05ce }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x05ce }
        L_0x05ce:
            o.ox r0 = p004o.C0626ox.BOTTOM_SPIDER     // Catch:{ NoSuchFieldError -> 0x05d9 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x05d9 }
            r1 = 406(0x196, float:5.69E-43)     // Catch:{ NoSuchFieldError -> 0x05d9 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x05d9 }
        L_0x05d9:
            o.ox r0 = p004o.C0626ox.BOTTOM_STEALTH     // Catch:{ NoSuchFieldError -> 0x05e4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x05e4 }
            r1 = 786(0x312, float:1.101E-42)     // Catch:{ NoSuchFieldError -> 0x05e4 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x05e4 }
        L_0x05e4:
            o.ox r0 = p004o.C0626ox.BOTTOM_SUITON     // Catch:{ NoSuchFieldError -> 0x05ef }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x05ef }
            r1 = 622(0x26e, float:8.72E-43)     // Catch:{ NoSuchFieldError -> 0x05ef }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x05ef }
        L_0x05ef:
            o.ox r0 = p004o.C0626ox.BOTTOM_TRANSFER     // Catch:{ NoSuchFieldError -> 0x05fa }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x05fa }
            r1 = 674(0x2a2, float:9.44E-43)     // Catch:{ NoSuchFieldError -> 0x05fa }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x05fa }
        L_0x05fa:
            o.ox r0 = p004o.C0626ox.BOTTOM_UGLYDANCE     // Catch:{ NoSuchFieldError -> 0x0605 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0605 }
            r1 = 292(0x124, float:4.09E-43)     // Catch:{ NoSuchFieldError -> 0x0605 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0605 }
        L_0x0605:
            o.ox r0 = p004o.C0626ox.BOTTOM_VI     // Catch:{ NoSuchFieldError -> 0x0610 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0610 }
            r1 = 243(0xf3, float:3.4E-43)     // Catch:{ NoSuchFieldError -> 0x0610 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0610 }
        L_0x0610:
            o.ox r0 = p004o.C0626ox.BOTTOM_VO     // Catch:{ NoSuchFieldError -> 0x061b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x061b }
            r1 = 241(0xf1, float:3.38E-43)     // Catch:{ NoSuchFieldError -> 0x061b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x061b }
        L_0x061b:
            o.ox r0 = p004o.C0626ox.BOTTOM_WHISTLE     // Catch:{ NoSuchFieldError -> 0x0626 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0626 }
            r1 = 288(0x120, float:4.04E-43)     // Catch:{ NoSuchFieldError -> 0x0626 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0626 }
        L_0x0626:
            o.ox r0 = p004o.C0626ox.BOT_REVERB     // Catch:{ NoSuchFieldError -> 0x0631 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0631 }
            r1 = 858(0x35a, float:1.202E-42)     // Catch:{ NoSuchFieldError -> 0x0631 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0631 }
        L_0x0631:
            o.ox r0 = p004o.C0626ox.BOT_REVERB2     // Catch:{ NoSuchFieldError -> 0x063c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x063c }
            r1 = 862(0x35e, float:1.208E-42)     // Catch:{ NoSuchFieldError -> 0x063c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x063c }
        L_0x063c:
            o.ox r0 = p004o.C0626ox.BOWLINGBASH     // Catch:{ NoSuchFieldError -> 0x0647 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0647 }
            r1 = 75     // Catch:{ NoSuchFieldError -> 0x0647 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0647 }
        L_0x0647:
            o.ox r0 = p004o.C0626ox.BOWLINGSELF     // Catch:{ NoSuchFieldError -> 0x0652 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0652 }
            r1 = 151(0x97, float:2.12E-43)     // Catch:{ NoSuchFieldError -> 0x0652 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0652 }
        L_0x0652:
            o.ox r0 = p004o.C0626ox.BRANDISH2     // Catch:{ NoSuchFieldError -> 0x065d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x065d }
            r1 = 146(0x92, float:2.05E-43)     // Catch:{ NoSuchFieldError -> 0x065d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x065d }
        L_0x065d:
            o.ox r0 = p004o.C0626ox.BRANDISHSPEAR     // Catch:{ NoSuchFieldError -> 0x0668 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0668 }
            r1 = 72     // Catch:{ NoSuchFieldError -> 0x0668 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0668 }
        L_0x0668:
            o.ox r0 = p004o.C0626ox.BUBBLE     // Catch:{ NoSuchFieldError -> 0x0673 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0673 }
            r1 = 111(0x6f, float:1.56E-43)     // Catch:{ NoSuchFieldError -> 0x0673 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0673 }
        L_0x0673:
            o.ox r0 = p004o.C0626ox.BUBBLE_DROP     // Catch:{ NoSuchFieldError -> 0x067e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x067e }
            r1 = 667(0x29b, float:9.35E-43)     // Catch:{ NoSuchFieldError -> 0x067e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x067e }
        L_0x067e:
            o.ox r0 = p004o.C0626ox.BULLSEYE     // Catch:{ NoSuchFieldError -> 0x0689 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0689 }
            r1 = 651(0x28b, float:9.12E-43)     // Catch:{ NoSuchFieldError -> 0x0689 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0689 }
        L_0x0689:
            o.ox r0 = p004o.C0626ox.BUNSINJYUTSU     // Catch:{ NoSuchFieldError -> 0x0694 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0694 }
            r1 = 619(0x26b, float:8.67E-43)     // Catch:{ NoSuchFieldError -> 0x0694 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0694 }
        L_0x0694:
            o.ox r0 = p004o.C0626ox.BUNSINJYUTSU2     // Catch:{ NoSuchFieldError -> 0x069f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x069f }
            r1 = 754(0x2f2, float:1.057E-42)     // Catch:{ NoSuchFieldError -> 0x069f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x069f }
        L_0x069f:
            o.ox r0 = p004o.C0626ox.BURNING     // Catch:{ NoSuchFieldError -> 0x06aa }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x06aa }
            r1 = 792(0x318, float:1.11E-42)     // Catch:{ NoSuchFieldError -> 0x06aa }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x06aa }
        L_0x06aa:
            o.ox r0 = p004o.C0626ox.CALLZONE     // Catch:{ NoSuchFieldError -> 0x06b5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x06b5 }
            r1 = 342(0x156, float:4.79E-43)     // Catch:{ NoSuchFieldError -> 0x06b5 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x06b5 }
        L_0x06b5:
            o.ox r0 = p004o.C0626ox.CARTBOOST     // Catch:{ NoSuchFieldError -> 0x06c0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x06c0 }
            r1 = 393(0x189, float:5.51E-43)     // Catch:{ NoSuchFieldError -> 0x06c0 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x06c0 }
        L_0x06c0:
            o.ox r0 = p004o.C0626ox.CARTREVOLUTION     // Catch:{ NoSuchFieldError -> 0x06cb }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x06cb }
            r1 = 172(0xac, float:2.41E-43)     // Catch:{ NoSuchFieldError -> 0x06cb }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x06cb }
        L_0x06cb:
            o.ox r0 = p004o.C0626ox.CARTTER     // Catch:{ NoSuchFieldError -> 0x06d6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x06d6 }
            r1 = 520(0x208, float:7.29E-43)     // Catch:{ NoSuchFieldError -> 0x06d6 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x06d6 }
        L_0x06d6:
            o.ox r0 = p004o.C0626ox.CASTSPIN     // Catch:{ NoSuchFieldError -> 0x06e1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x06e1 }
            r1 = 503(0x1f7, float:7.05E-43)     // Catch:{ NoSuchFieldError -> 0x06e1 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x06e1 }
        L_0x06e1:
            o.ox r0 = p004o.C0626ox.CASTSPIN2     // Catch:{ NoSuchFieldError -> 0x06ec }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x06ec }
            r1 = 777(0x309, float:1.089E-42)     // Catch:{ NoSuchFieldError -> 0x06ec }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x06ec }
        L_0x06ec:
            o.ox r0 = p004o.C0626ox.CHAINCOMBO     // Catch:{ NoSuchFieldError -> 0x06f7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x06f7 }
            r1 = 275(0x113, float:3.85E-43)     // Catch:{ NoSuchFieldError -> 0x06f7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x06f7 }
        L_0x06f7:
            o.ox r0 = p004o.C0626ox.CHAINGEHOLY     // Catch:{ NoSuchFieldError -> 0x0702 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0702 }
            r1 = 180(0xb4, float:2.52E-43)     // Catch:{ NoSuchFieldError -> 0x0702 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0702 }
        L_0x0702:
            o.ox r0 = p004o.C0626ox.CHAINL_STR     // Catch:{ NoSuchFieldError -> 0x070d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x070d }
            r1 = 736(0x2e0, float:1.031E-42)     // Catch:{ NoSuchFieldError -> 0x070d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x070d }
        L_0x070d:
            o.ox r0 = p004o.C0626ox.CHANGECOLD     // Catch:{ NoSuchFieldError -> 0x0718 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0718 }
            r1 = 176(0xb0, float:2.47E-43)     // Catch:{ NoSuchFieldError -> 0x0718 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0718 }
        L_0x0718:
            o.ox r0 = p004o.C0626ox.CHANGEDARK     // Catch:{ NoSuchFieldError -> 0x0723 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0723 }
            r1 = 174(0xae, float:2.44E-43)     // Catch:{ NoSuchFieldError -> 0x0723 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0723 }
        L_0x0723:
            o.ox r0 = p004o.C0626ox.CHANGEEARTH     // Catch:{ NoSuchFieldError -> 0x072e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x072e }
            r1 = 179(0xb3, float:2.51E-43)     // Catch:{ NoSuchFieldError -> 0x072e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x072e }
        L_0x072e:
            o.ox r0 = p004o.C0626ox.CHANGEFIRE     // Catch:{ NoSuchFieldError -> 0x0739 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0739 }
            r1 = 175(0xaf, float:2.45E-43)     // Catch:{ NoSuchFieldError -> 0x0739 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0739 }
        L_0x0739:
            o.ox r0 = p004o.C0626ox.CHANGEFLAME     // Catch:{ NoSuchFieldError -> 0x0744 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0744 }
            r1 = 178(0xb2, float:2.5E-43)     // Catch:{ NoSuchFieldError -> 0x0744 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0744 }
        L_0x0744:
            o.ox r0 = p004o.C0626ox.CHANGEPOISON     // Catch:{ NoSuchFieldError -> 0x074f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x074f }
            r1 = 181(0xb5, float:2.54E-43)     // Catch:{ NoSuchFieldError -> 0x074f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x074f }
        L_0x074f:
            o.ox r0 = p004o.C0626ox.CHANGEWIND     // Catch:{ NoSuchFieldError -> 0x075a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x075a }
            r1 = 177(0xb1, float:2.48E-43)     // Catch:{ NoSuchFieldError -> 0x075a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x075a }
        L_0x075a:
            o.ox r0 = p004o.C0626ox.CHAREFFECT     // Catch:{ NoSuchFieldError -> 0x0765 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0765 }
            r1 = 935(0x3a7, float:1.31E-42)     // Catch:{ NoSuchFieldError -> 0x0765 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0765 }
        L_0x0765:
            o.ox r0 = p004o.C0626ox.CHEMICAL2     // Catch:{ NoSuchFieldError -> 0x0770 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0770 }
            r1 = 305(0x131, float:4.27E-43)     // Catch:{ NoSuchFieldError -> 0x0770 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0770 }
        L_0x0770:
            o.ox r0 = p004o.C0626ox.CHEMICAL2DASH     // Catch:{ NoSuchFieldError -> 0x077b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x077b }
            r1 = 514(0x202, float:7.2E-43)     // Catch:{ NoSuchFieldError -> 0x077b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x077b }
        L_0x077b:
            o.ox r0 = p004o.C0626ox.CHEMICAL2DASH2     // Catch:{ NoSuchFieldError -> 0x0786 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0786 }
            r1 = 837(0x345, float:1.173E-42)     // Catch:{ NoSuchFieldError -> 0x0786 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0786 }
        L_0x0786:
            o.ox r0 = p004o.C0626ox.CHEMICAL2DASH3     // Catch:{ NoSuchFieldError -> 0x0791 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0791 }
            r1 = 838(0x346, float:1.174E-42)     // Catch:{ NoSuchFieldError -> 0x0791 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0791 }
        L_0x0791:
            o.ox r0 = p004o.C0626ox.CHEMICAL2DASH4     // Catch:{ NoSuchFieldError -> 0x079c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x079c }
            r1 = 906(0x38a, float:1.27E-42)     // Catch:{ NoSuchFieldError -> 0x079c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x079c }
        L_0x079c:
            o.ox r0 = p004o.C0626ox.CHEMICAL3     // Catch:{ NoSuchFieldError -> 0x07a7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x07a7 }
            r1 = 441(0x1b9, float:6.18E-43)     // Catch:{ NoSuchFieldError -> 0x07a7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x07a7 }
        L_0x07a7:
            o.ox r0 = p004o.C0626ox.CHEMICAL3S     // Catch:{ NoSuchFieldError -> 0x07b2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x07b2 }
            r1 = 895(0x37f, float:1.254E-42)     // Catch:{ NoSuchFieldError -> 0x07b2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x07b2 }
        L_0x07b2:
            o.ox r0 = p004o.C0626ox.CHEMICAL4     // Catch:{ NoSuchFieldError -> 0x07bd }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x07bd }
            r1 = 625(0x271, float:8.76E-43)     // Catch:{ NoSuchFieldError -> 0x07bd }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x07bd }
        L_0x07bd:
            o.ox r0 = p004o.C0626ox.CHEMICALBODY     // Catch:{ NoSuchFieldError -> 0x07c8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x07c8 }
            r1 = 502(0x1f6, float:7.03E-43)     // Catch:{ NoSuchFieldError -> 0x07c8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x07c8 }
        L_0x07c8:
            o.ox r0 = p004o.C0626ox.CHEMICALPROTECTION     // Catch:{ NoSuchFieldError -> 0x07d3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x07d3 }
            r1 = 302(0x12e, float:4.23E-43)     // Catch:{ NoSuchFieldError -> 0x07d3 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x07d3 }
        L_0x07d3:
            o.ox r0 = p004o.C0626ox.CHEMICAL_ALLRANGE     // Catch:{ NoSuchFieldError -> 0x07de }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x07de }
            r1 = 971(0x3cb, float:1.36E-42)     // Catch:{ NoSuchFieldError -> 0x07de }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x07de }
        L_0x07de:
            o.ox r0 = p004o.C0626ox.CHEMICAL_V     // Catch:{ NoSuchFieldError -> 0x07e9 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x07e9 }
            r1 = 856(0x358, float:1.2E-42)     // Catch:{ NoSuchFieldError -> 0x07e9 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x07e9 }
        L_0x07e9:
            o.ox r0 = p004o.C0626ox.CHEMICAL_V2     // Catch:{ NoSuchFieldError -> 0x07f4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x07f4 }
            r1 = 860(0x35c, float:1.205E-42)     // Catch:{ NoSuchFieldError -> 0x07f4 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x07f4 }
        L_0x07f4:
            o.ox r0 = p004o.C0626ox.CHEMICAL_V3     // Catch:{ NoSuchFieldError -> 0x07ff }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x07ff }
            r1 = 865(0x361, float:1.212E-42)     // Catch:{ NoSuchFieldError -> 0x07ff }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x07ff }
        L_0x07ff:
            o.ox r0 = p004o.C0626ox.CHERRYBLOSSOM     // Catch:{ NoSuchFieldError -> 0x080a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x080a }
            r1 = 1015(0x3f7, float:1.422E-42)     // Catch:{ NoSuchFieldError -> 0x080a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x080a }
        L_0x080a:
            o.ox r0 = p004o.C0626ox.CHIMTO     // Catch:{ NoSuchFieldError -> 0x0815 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0815 }
            r1 = 269(0x10d, float:3.77E-43)     // Catch:{ NoSuchFieldError -> 0x0815 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0815 }
        L_0x0815:
            o.ox r0 = p004o.C0626ox.CHIMTO2     // Catch:{ NoSuchFieldError -> 0x0820 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0820 }
            r1 = 725(0x2d5, float:1.016E-42)     // Catch:{ NoSuchFieldError -> 0x0820 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0820 }
        L_0x0820:
            o.ox r0 = p004o.C0626ox.CHOOKGI     // Catch:{ NoSuchFieldError -> 0x082b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x082b }
            r1 = 230(0xe6, float:3.22E-43)     // Catch:{ NoSuchFieldError -> 0x082b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x082b }
        L_0x082b:
            o.ox r0 = p004o.C0626ox.CHOOKGI2     // Catch:{ NoSuchFieldError -> 0x0836 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0836 }
            r1 = 506(0x1fa, float:7.09E-43)     // Catch:{ NoSuchFieldError -> 0x0836 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0836 }
        L_0x0836:
            o.ox r0 = p004o.C0626ox.CHOOKGI3     // Catch:{ NoSuchFieldError -> 0x0841 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0841 }
            r1 = 631(0x277, float:8.84E-43)     // Catch:{ NoSuchFieldError -> 0x0841 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0841 }
        L_0x0841:
            o.ox r0 = p004o.C0626ox.CHOOKGI_FIRE     // Catch:{ NoSuchFieldError -> 0x084c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x084c }
            r1 = 737(0x2e1, float:1.033E-42)     // Catch:{ NoSuchFieldError -> 0x084c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x084c }
        L_0x084c:
            o.ox r0 = p004o.C0626ox.CHOOKGI_GROUND     // Catch:{ NoSuchFieldError -> 0x0857 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0857 }
            r1 = 740(0x2e4, float:1.037E-42)     // Catch:{ NoSuchFieldError -> 0x0857 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0857 }
        L_0x0857:
            o.ox r0 = p004o.C0626ox.CHOOKGI_N     // Catch:{ NoSuchFieldError -> 0x0862 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0862 }
            r1 = 835(0x343, float:1.17E-42)     // Catch:{ NoSuchFieldError -> 0x0862 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0862 }
        L_0x0862:
            o.ox r0 = p004o.C0626ox.CHOOKGI_WATER     // Catch:{ NoSuchFieldError -> 0x086d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x086d }
            r1 = 739(0x2e3, float:1.036E-42)     // Catch:{ NoSuchFieldError -> 0x086d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x086d }
        L_0x086d:
            o.ox r0 = p004o.C0626ox.CHOOKGI_WIND     // Catch:{ NoSuchFieldError -> 0x0878 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0878 }
            r1 = 738(0x2e2, float:1.034E-42)     // Catch:{ NoSuchFieldError -> 0x0878 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0878 }
        L_0x0878:
            o.ox r0 = p004o.C0626ox.CIRCLELIGHT     // Catch:{ NoSuchFieldError -> 0x0883 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0883 }
            r1 = 705(0x2c1, float:9.88E-43)     // Catch:{ NoSuchFieldError -> 0x0883 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0883 }
        L_0x0883:
            o.ox r0 = p004o.C0626ox.CIRCLEPOWER     // Catch:{ NoSuchFieldError -> 0x088e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x088e }
            r1 = 759(0x2f7, float:1.064E-42)     // Catch:{ NoSuchFieldError -> 0x088e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x088e }
        L_0x088e:
            o.ox r0 = p004o.C0626ox.CIRCLEPOWER2     // Catch:{ NoSuchFieldError -> 0x0899 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0899 }
            r1 = 863(0x35f, float:1.21E-42)     // Catch:{ NoSuchFieldError -> 0x0899 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0899 }
        L_0x0899:
            o.ox r0 = p004o.C0626ox.CIRCLEPOWER3     // Catch:{ NoSuchFieldError -> 0x08a4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x08a4 }
            r1 = 867(0x363, float:1.215E-42)     // Catch:{ NoSuchFieldError -> 0x08a4 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x08a4 }
        L_0x08a4:
            o.ox r0 = p004o.C0626ox.CIRCLEPOWER4     // Catch:{ NoSuchFieldError -> 0x08af }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x08af }
            r1 = 869(0x365, float:1.218E-42)     // Catch:{ NoSuchFieldError -> 0x08af }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x08af }
        L_0x08af:
            o.ox r0 = p004o.C0626ox.CIRCLEPOWER5     // Catch:{ NoSuchFieldError -> 0x08ba }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x08ba }
            r1 = 873(0x369, float:1.223E-42)     // Catch:{ NoSuchFieldError -> 0x08ba }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x08ba }
        L_0x08ba:
            o.ox r0 = p004o.C0626ox.CIRCLEPOWER6     // Catch:{ NoSuchFieldError -> 0x08c5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x08c5 }
            r1 = 875(0x36b, float:1.226E-42)     // Catch:{ NoSuchFieldError -> 0x08c5 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x08c5 }
        L_0x08c5:
            o.ox r0 = p004o.C0626ox.CIRCLEPOWER7     // Catch:{ NoSuchFieldError -> 0x08d0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x08d0 }
            r1 = 877(0x36d, float:1.229E-42)     // Catch:{ NoSuchFieldError -> 0x08d0 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x08d0 }
        L_0x08d0:
            o.ox r0 = p004o.C0626ox.CIRCLEPOWER8     // Catch:{ NoSuchFieldError -> 0x08db }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x08db }
            r1 = 879(0x36f, float:1.232E-42)     // Catch:{ NoSuchFieldError -> 0x08db }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x08db }
        L_0x08db:
            o.ox r0 = p004o.C0626ox.CLAYMORE     // Catch:{ NoSuchFieldError -> 0x08e6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x08e6 }
            r1 = 109(0x6d, float:1.53E-43)     // Catch:{ NoSuchFieldError -> 0x08e6 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x08e6 }
        L_0x08e6:
            o.ox r0 = p004o.C0626ox.CLEARTIME     // Catch:{ NoSuchFieldError -> 0x08f1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x08f1 }
            r1 = 755(0x2f3, float:1.058E-42)     // Catch:{ NoSuchFieldError -> 0x08f1 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x08f1 }
        L_0x08f1:
            o.ox r0 = p004o.C0626ox.CLOAKING     // Catch:{ NoSuchFieldError -> 0x08fc }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x08fc }
            r1 = 122(0x7a, float:1.71E-43)     // Catch:{ NoSuchFieldError -> 0x08fc }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x08fc }
        L_0x08fc:
            o.ox r0 = p004o.C0626ox.CLOAKING2     // Catch:{ NoSuchFieldError -> 0x0907 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0907 }
            r1 = 746(0x2ea, float:1.045E-42)     // Catch:{ NoSuchFieldError -> 0x0907 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0907 }
        L_0x0907:
            o.ox r0 = p004o.C0626ox.CLOAKING3     // Catch:{ NoSuchFieldError -> 0x0912 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0912 }
            r1 = 811(0x32b, float:1.136E-42)     // Catch:{ NoSuchFieldError -> 0x0912 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0912 }
        L_0x0912:
            o.ox r0 = p004o.C0626ox.CLOUD     // Catch:{ NoSuchFieldError -> 0x091d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x091d }
            r1 = 231(0xe7, float:3.24E-43)     // Catch:{ NoSuchFieldError -> 0x091d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x091d }
        L_0x091d:
            o.ox r0 = p004o.C0626ox.CLOUD2     // Catch:{ NoSuchFieldError -> 0x0928 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0928 }
            r1 = 232(0xe8, float:3.25E-43)     // Catch:{ NoSuchFieldError -> 0x0928 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0928 }
        L_0x0928:
            o.ox r0 = p004o.C0626ox.CLOUD3     // Catch:{ NoSuchFieldError -> 0x0933 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0933 }
            r1 = 235(0xeb, float:3.3E-43)     // Catch:{ NoSuchFieldError -> 0x0933 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0933 }
        L_0x0933:
            o.ox r0 = p004o.C0626ox.CLOUD4     // Catch:{ NoSuchFieldError -> 0x093e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x093e }
            r1 = 517(0x205, float:7.24E-43)     // Catch:{ NoSuchFieldError -> 0x093e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x093e }
        L_0x093e:
            o.ox r0 = p004o.C0626ox.CLOUD5     // Catch:{ NoSuchFieldError -> 0x0949 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0949 }
            r1 = 518(0x206, float:7.26E-43)     // Catch:{ NoSuchFieldError -> 0x0949 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0949 }
        L_0x0949:
            o.ox r0 = p004o.C0626ox.CLOUD6     // Catch:{ NoSuchFieldError -> 0x0954 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0954 }
            r1 = 594(0x252, float:8.32E-43)     // Catch:{ NoSuchFieldError -> 0x0954 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0954 }
        L_0x0954:
            o.ox r0 = p004o.C0626ox.CLOUD7     // Catch:{ NoSuchFieldError -> 0x095f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x095f }
            r1 = 699(0x2bb, float:9.8E-43)     // Catch:{ NoSuchFieldError -> 0x095f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x095f }
        L_0x095f:
            o.ox r0 = p004o.C0626ox.CLOUD8     // Catch:{ NoSuchFieldError -> 0x096a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x096a }
            r1 = 700(0x2bc, float:9.81E-43)     // Catch:{ NoSuchFieldError -> 0x096a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x096a }
        L_0x096a:
            o.ox r0 = p004o.C0626ox.CLOUD9     // Catch:{ NoSuchFieldError -> 0x0975 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0975 }
            r1 = 947(0x3b3, float:1.327E-42)     // Catch:{ NoSuchFieldError -> 0x0975 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0975 }
        L_0x0975:
            o.ox r0 = p004o.C0626ox.COBALT_TRAP     // Catch:{ NoSuchFieldError -> 0x0980 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0980 }
            r1 = 742(0x2e6, float:1.04E-42)     // Catch:{ NoSuchFieldError -> 0x0980 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0980 }
        L_0x0980:
            o.ox r0 = p004o.C0626ox.COIN     // Catch:{ NoSuchFieldError -> 0x098b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x098b }
            r1 = 12     // Catch:{ NoSuchFieldError -> 0x098b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x098b }
        L_0x098b:
            o.ox r0 = p004o.C0626ox.COLDHIT     // Catch:{ NoSuchFieldError -> 0x0996 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0996 }
            r1 = 53     // Catch:{ NoSuchFieldError -> 0x0996 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0996 }
        L_0x0996:
            o.ox r0 = p004o.C0626ox.COLDSTATUS     // Catch:{ NoSuchFieldError -> 0x09a1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x09a1 }
            r1 = 942(0x3ae, float:1.32E-42)     // Catch:{ NoSuchFieldError -> 0x09a1 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x09a1 }
        L_0x09a1:
            o.ox r0 = p004o.C0626ox.COLDTHROW     // Catch:{ NoSuchFieldError -> 0x09ac }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x09ac }
            r1 = 793(0x319, float:1.111E-42)     // Catch:{ NoSuchFieldError -> 0x09ac }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x09ac }
        L_0x09ac:
            o.ox r0 = p004o.C0626ox.COLDTHROW2     // Catch:{ NoSuchFieldError -> 0x09b7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x09b7 }
            r1 = 930(0x3a2, float:1.303E-42)     // Catch:{ NoSuchFieldError -> 0x09b7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x09b7 }
        L_0x09b7:
            o.ox r0 = p004o.C0626ox.COLORPAPER     // Catch:{ NoSuchFieldError -> 0x09c2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x09c2 }
            r1 = 349(0x15d, float:4.89E-43)     // Catch:{ NoSuchFieldError -> 0x09c2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x09c2 }
        L_0x09c2:
            o.ox r0 = p004o.C0626ox.COMBOATTACK1     // Catch:{ NoSuchFieldError -> 0x09cd }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x09cd }
            r1 = 188(0xbc, float:2.63E-43)     // Catch:{ NoSuchFieldError -> 0x09cd }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x09cd }
        L_0x09cd:
            o.ox r0 = p004o.C0626ox.COMBOATTACK2     // Catch:{ NoSuchFieldError -> 0x09d8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x09d8 }
            r1 = 189(0xbd, float:2.65E-43)     // Catch:{ NoSuchFieldError -> 0x09d8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x09d8 }
        L_0x09d8:
            o.ox r0 = p004o.C0626ox.COMBOATTACK3     // Catch:{ NoSuchFieldError -> 0x09e3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x09e3 }
            r1 = 190(0xbe, float:2.66E-43)     // Catch:{ NoSuchFieldError -> 0x09e3 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x09e3 }
        L_0x09e3:
            o.ox r0 = p004o.C0626ox.COMBOATTACK4     // Catch:{ NoSuchFieldError -> 0x09ee }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x09ee }
            r1 = 191(0xbf, float:2.68E-43)     // Catch:{ NoSuchFieldError -> 0x09ee }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x09ee }
        L_0x09ee:
            o.ox r0 = p004o.C0626ox.COMBOATTACK5     // Catch:{ NoSuchFieldError -> 0x09f9 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x09f9 }
            r1 = 192(0xc0, float:2.69E-43)     // Catch:{ NoSuchFieldError -> 0x09f9 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x09f9 }
        L_0x09f9:
            o.ox r0 = p004o.C0626ox.CONCENTRATION     // Catch:{ NoSuchFieldError -> 0x0a04 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0a04 }
            r1 = 155(0x9b, float:2.17E-43)     // Catch:{ NoSuchFieldError -> 0x0a04 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0a04 }
        L_0x0a04:
            o.ox r0 = p004o.C0626ox.CONCENTRATION2     // Catch:{ NoSuchFieldError -> 0x0a0f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0a0f }
            r1 = 752(0x2f0, float:1.054E-42)     // Catch:{ NoSuchFieldError -> 0x0a0f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0a0f }
        L_0x0a0f:
            o.ox r0 = p004o.C0626ox.CONE     // Catch:{ NoSuchFieldError -> 0x0a1a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0a1a }
            r1 = 73     // Catch:{ NoSuchFieldError -> 0x0a1a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0a1a }
        L_0x0a1a:
            o.ox r0 = p004o.C0626ox.COOKING_FAIL     // Catch:{ NoSuchFieldError -> 0x0a25 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0a25 }
            r1 = 611(0x263, float:8.56E-43)     // Catch:{ NoSuchFieldError -> 0x0a25 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0a25 }
        L_0x0a25:
            o.ox r0 = p004o.C0626ox.COOKING_OK     // Catch:{ NoSuchFieldError -> 0x0a30 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0a30 }
            r1 = 610(0x262, float:8.55E-43)     // Catch:{ NoSuchFieldError -> 0x0a30 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0a30 }
        L_0x0a30:
            o.ox r0 = p004o.C0626ox.COUPLECASTING     // Catch:{ NoSuchFieldError -> 0x0a3b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0a3b }
            r1 = 344(0x158, float:4.82E-43)     // Catch:{ NoSuchFieldError -> 0x0a3b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0a3b }
        L_0x0a3b:
            o.ox r0 = p004o.C0626ox.CRASHAXE     // Catch:{ NoSuchFieldError -> 0x0a46 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0a46 }
            r1 = 797(0x31d, float:1.117E-42)     // Catch:{ NoSuchFieldError -> 0x0a46 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0a46 }
        L_0x0a46:
            o.ox r0 = p004o.C0626ox.CRASHEARTH     // Catch:{ NoSuchFieldError -> 0x0a51 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0a51 }
            r1 = 104(0x68, float:1.46E-43)     // Catch:{ NoSuchFieldError -> 0x0a51 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0a51 }
        L_0x0a51:
            o.ox r0 = p004o.C0626ox.CRIMSON_STR     // Catch:{ NoSuchFieldError -> 0x0a5c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0a5c }
            r1 = 729(0x2d9, float:1.022E-42)     // Catch:{ NoSuchFieldError -> 0x0a5c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0a5c }
        L_0x0a5c:
            o.ox r0 = p004o.C0626ox.CRITICALWOUND     // Catch:{ NoSuchFieldError -> 0x0a67 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0a67 }
            r1 = 679(0x2a7, float:9.51E-43)     // Catch:{ NoSuchFieldError -> 0x0a67 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0a67 }
        L_0x0a67:
            o.ox r0 = p004o.C0626ox.CRYSTAL_BLUE     // Catch:{ NoSuchFieldError -> 0x0a72 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0a72 }
            r1 = 675(0x2a3, float:9.46E-43)     // Catch:{ NoSuchFieldError -> 0x0a72 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0a72 }
        L_0x0a72:
            o.ox r0 = p004o.C0626ox.CURE     // Catch:{ NoSuchFieldError -> 0x0a7d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0a7d }
            r1 = 68     // Catch:{ NoSuchFieldError -> 0x0a7d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0a7d }
        L_0x0a7d:
            o.ox r0 = p004o.C0626ox.CURSEATTACK     // Catch:{ NoSuchFieldError -> 0x0a88 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0a88 }
            r1 = 198(0xc6, float:2.77E-43)     // Catch:{ NoSuchFieldError -> 0x0a88 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0a88 }
        L_0x0a88:
            o.ox r0 = p004o.C0626ox.C_MAKER     // Catch:{ NoSuchFieldError -> 0x0a93 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0a93 }
            r1 = 1046(0x416, float:1.466E-42)     // Catch:{ NoSuchFieldError -> 0x0a93 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0a93 }
        L_0x0a93:
            o.ox r0 = p004o.C0626ox.DAMAGE1     // Catch:{ NoSuchFieldError -> 0x0a9e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0a9e }
            r1 = 654(0x28e, float:9.16E-43)     // Catch:{ NoSuchFieldError -> 0x0a9e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0a9e }
        L_0x0a9e:
            o.ox r0 = p004o.C0626ox.DAMAGE1_2     // Catch:{ NoSuchFieldError -> 0x0aa9 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0aa9 }
            r1 = 655(0x28f, float:9.18E-43)     // Catch:{ NoSuchFieldError -> 0x0aa9 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0aa9 }
        L_0x0aa9:
            o.ox r0 = p004o.C0626ox.DAMAGE1_3     // Catch:{ NoSuchFieldError -> 0x0ab4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0ab4 }
            r1 = 656(0x290, float:9.19E-43)     // Catch:{ NoSuchFieldError -> 0x0ab4 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0ab4 }
        L_0x0ab4:
            o.ox r0 = p004o.C0626ox.DANCE1     // Catch:{ NoSuchFieldError -> 0x0abf }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0abf }
            r1 = 849(0x351, float:1.19E-42)     // Catch:{ NoSuchFieldError -> 0x0abf }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0abf }
        L_0x0abf:
            o.ox r0 = p004o.C0626ox.DANCE2     // Catch:{ NoSuchFieldError -> 0x0aca }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0aca }
            r1 = 850(0x352, float:1.191E-42)     // Catch:{ NoSuchFieldError -> 0x0aca }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0aca }
        L_0x0aca:
            o.ox r0 = p004o.C0626ox.DANCINGBLADE     // Catch:{ NoSuchFieldError -> 0x0ad5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0ad5 }
            r1 = 1024(0x400, float:1.435E-42)     // Catch:{ NoSuchFieldError -> 0x0ad5 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0ad5 }
        L_0x0ad5:
            o.ox r0 = p004o.C0626ox.DARKATTACK     // Catch:{ NoSuchFieldError -> 0x0ae0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0ae0 }
            r1 = 186(0xba, float:2.6E-43)     // Catch:{ NoSuchFieldError -> 0x0ae0 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0ae0 }
        L_0x0ae0:
            o.ox r0 = p004o.C0626ox.DARKBREATH     // Catch:{ NoSuchFieldError -> 0x0aeb }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0aeb }
            r1 = 214(0xd6, float:3.0E-43)     // Catch:{ NoSuchFieldError -> 0x0aeb }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0aeb }
        L_0x0aeb:
            o.ox r0 = p004o.C0626ox.DARKCASTING     // Catch:{ NoSuchFieldError -> 0x0af6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0af6 }
            r1 = 456(0x1c8, float:6.39E-43)     // Catch:{ NoSuchFieldError -> 0x0af6 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0af6 }
        L_0x0af6:
            o.ox r0 = p004o.C0626ox.DARKCASTING2     // Catch:{ NoSuchFieldError -> 0x0b01 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0b01 }
            r1 = 828(0x33c, float:1.16E-42)     // Catch:{ NoSuchFieldError -> 0x0b01 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0b01 }
        L_0x0b01:
            o.ox r0 = p004o.C0626ox.DA_SPACE     // Catch:{ NoSuchFieldError -> 0x0b0c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0b0c }
            r1 = 669(0x29d, float:9.37E-43)     // Catch:{ NoSuchFieldError -> 0x0b0c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0b0c }
        L_0x0b0c:
            o.ox r0 = p004o.C0626ox.DECAGILITY     // Catch:{ NoSuchFieldError -> 0x0b17 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0b17 }
            r1 = 40     // Catch:{ NoSuchFieldError -> 0x0b17 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0b17 }
        L_0x0b17:
            o.ox r0 = p004o.C0626ox.DEFENDER     // Catch:{ NoSuchFieldError -> 0x0b22 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0b22 }
            r1 = 224(0xe0, float:3.14E-43)     // Catch:{ NoSuchFieldError -> 0x0b22 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0b22 }
        L_0x0b22:
            o.ox r0 = p004o.C0626ox.DEFFENDER     // Catch:{ NoSuchFieldError -> 0x0b2d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0b2d }
            r1 = 215(0xd7, float:3.01E-43)     // Catch:{ NoSuchFieldError -> 0x0b2d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0b2d }
        L_0x0b2d:
            o.ox r0 = p004o.C0626ox.DELUGE     // Catch:{ NoSuchFieldError -> 0x0b38 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0b38 }
            r1 = 238(0xee, float:3.34E-43)     // Catch:{ NoSuchFieldError -> 0x0b38 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0b38 }
        L_0x0b38:
            o.ox r0 = p004o.C0626ox.DEMONICFIRE     // Catch:{ NoSuchFieldError -> 0x0b43 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0b43 }
            r1 = 918(0x396, float:1.286E-42)     // Catch:{ NoSuchFieldError -> 0x0b43 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0b43 }
        L_0x0b43:
            o.ox r0 = p004o.C0626ox.DEMONICFIRE2     // Catch:{ NoSuchFieldError -> 0x0b4e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0b4e }
            r1 = 919(0x397, float:1.288E-42)     // Catch:{ NoSuchFieldError -> 0x0b4e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0b4e }
        L_0x0b4e:
            o.ox r0 = p004o.C0626ox.DEMONICFIRE3     // Catch:{ NoSuchFieldError -> 0x0b59 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0b59 }
            r1 = 920(0x398, float:1.289E-42)     // Catch:{ NoSuchFieldError -> 0x0b59 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0b59 }
        L_0x0b59:
            o.ox r0 = p004o.C0626ox.DEMONICFIRE4     // Catch:{ NoSuchFieldError -> 0x0b64 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0b64 }
            r1 = 931(0x3a3, float:1.305E-42)     // Catch:{ NoSuchFieldError -> 0x0b64 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0b64 }
        L_0x0b64:
            o.ox r0 = p004o.C0626ox.DEMONSTRATION     // Catch:{ NoSuchFieldError -> 0x0b6f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0b6f }
            r1 = 304(0x130, float:4.26E-43)     // Catch:{ NoSuchFieldError -> 0x0b6f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0b6f }
        L_0x0b6f:
            o.ox r0 = p004o.C0626ox.DESPERADO     // Catch:{ NoSuchFieldError -> 0x0b7a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0b7a }
            r1 = 639(0x27f, float:8.95E-43)     // Catch:{ NoSuchFieldError -> 0x0b7a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0b7a }
        L_0x0b7a:
            o.ox r0 = p004o.C0626ox.DETECT2     // Catch:{ NoSuchFieldError -> 0x0b85 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0b85 }
            r1 = 727(0x2d7, float:1.019E-42)     // Catch:{ NoSuchFieldError -> 0x0b85 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0b85 }
        L_0x0b85:
            o.ox r0 = p004o.C0626ox.DETECT3     // Catch:{ NoSuchFieldError -> 0x0b90 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0b90 }
            r1 = 780(0x30c, float:1.093E-42)     // Catch:{ NoSuchFieldError -> 0x0b90 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0b90 }
        L_0x0b90:
            o.ox r0 = p004o.C0626ox.DETECT4     // Catch:{ NoSuchFieldError -> 0x0b9b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0b9b }
            r1 = 782(0x30e, float:1.096E-42)     // Catch:{ NoSuchFieldError -> 0x0b9b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0b9b }
        L_0x0b9b:
            o.ox r0 = p004o.C0626ox.DETECTING     // Catch:{ NoSuchFieldError -> 0x0ba6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0ba6 }
            r1 = 121(0x79, float:1.7E-43)     // Catch:{ NoSuchFieldError -> 0x0ba6 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0ba6 }
        L_0x0ba6:
            o.ox r0 = p004o.C0626ox.DETOXICATION     // Catch:{ NoSuchFieldError -> 0x0bb1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0bb1 }
            r1 = 23     // Catch:{ NoSuchFieldError -> 0x0bb1 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0bb1 }
        L_0x0bb1:
            o.ox r0 = p004o.C0626ox.DEVIL     // Catch:{ NoSuchFieldError -> 0x0bbc }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0bbc }
            r1 = 374(0x176, float:5.24E-43)     // Catch:{ NoSuchFieldError -> 0x0bbc }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0bbc }
        L_0x0bbc:
            o.ox r0 = p004o.C0626ox.DEVIL1     // Catch:{ NoSuchFieldError -> 0x0bc7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0bc7 }
            r1 = 477(0x1dd, float:6.68E-43)     // Catch:{ NoSuchFieldError -> 0x0bc7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0bc7 }
        L_0x0bc7:
            o.ox r0 = p004o.C0626ox.DEVIL10     // Catch:{ NoSuchFieldError -> 0x0bd2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0bd2 }
            r1 = 486(0x1e6, float:6.81E-43)     // Catch:{ NoSuchFieldError -> 0x0bd2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0bd2 }
        L_0x0bd2:
            o.ox r0 = p004o.C0626ox.DEVIL2     // Catch:{ NoSuchFieldError -> 0x0bdd }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0bdd }
            r1 = 478(0x1de, float:6.7E-43)     // Catch:{ NoSuchFieldError -> 0x0bdd }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0bdd }
        L_0x0bdd:
            o.ox r0 = p004o.C0626ox.DEVIL3     // Catch:{ NoSuchFieldError -> 0x0be8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0be8 }
            r1 = 479(0x1df, float:6.71E-43)     // Catch:{ NoSuchFieldError -> 0x0be8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0be8 }
        L_0x0be8:
            o.ox r0 = p004o.C0626ox.DEVIL4     // Catch:{ NoSuchFieldError -> 0x0bf3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0bf3 }
            r1 = 480(0x1e0, float:6.73E-43)     // Catch:{ NoSuchFieldError -> 0x0bf3 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0bf3 }
        L_0x0bf3:
            o.ox r0 = p004o.C0626ox.DEVIL5     // Catch:{ NoSuchFieldError -> 0x0bfe }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0bfe }
            r1 = 481(0x1e1, float:6.74E-43)     // Catch:{ NoSuchFieldError -> 0x0bfe }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0bfe }
        L_0x0bfe:
            o.ox r0 = p004o.C0626ox.DEVIL6     // Catch:{ NoSuchFieldError -> 0x0c09 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0c09 }
            r1 = 482(0x1e2, float:6.75E-43)     // Catch:{ NoSuchFieldError -> 0x0c09 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0c09 }
        L_0x0c09:
            o.ox r0 = p004o.C0626ox.DEVIL7     // Catch:{ NoSuchFieldError -> 0x0c14 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0c14 }
            r1 = 483(0x1e3, float:6.77E-43)     // Catch:{ NoSuchFieldError -> 0x0c14 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0c14 }
        L_0x0c14:
            o.ox r0 = p004o.C0626ox.DEVIL8     // Catch:{ NoSuchFieldError -> 0x0c1f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0c1f }
            r1 = 484(0x1e4, float:6.78E-43)     // Catch:{ NoSuchFieldError -> 0x0c1f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0c1f }
        L_0x0c1f:
            o.ox r0 = p004o.C0626ox.DEVIL9     // Catch:{ NoSuchFieldError -> 0x0c2a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0c2a }
            r1 = 485(0x1e5, float:6.8E-43)     // Catch:{ NoSuchFieldError -> 0x0c2a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0c2a }
        L_0x0c2a:
            o.ox r0 = p004o.C0626ox.DEVIL_     // Catch:{ NoSuchFieldError -> 0x0c35 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0c35 }
            r1 = 1026(0x402, float:1.438E-42)     // Catch:{ NoSuchFieldError -> 0x0c35 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0c35 }
        L_0x0c35:
            o.ox r0 = p004o.C0626ox.DEVOTION     // Catch:{ NoSuchFieldError -> 0x0c40 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0c40 }
            r1 = 253(0xfd, float:3.55E-43)     // Catch:{ NoSuchFieldError -> 0x0c40 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0c40 }
        L_0x0c40:
            o.ox r0 = p004o.C0626ox.DHOWL_STR     // Catch:{ NoSuchFieldError -> 0x0c4b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0c4b }
            r1 = 733(0x2dd, float:1.027E-42)     // Catch:{ NoSuchFieldError -> 0x0c4b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0c4b }
        L_0x0c4b:
            o.ox r0 = p004o.C0626ox.DISPELL     // Catch:{ NoSuchFieldError -> 0x0c56 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0c56 }
            r1 = 237(0xed, float:3.32E-43)     // Catch:{ NoSuchFieldError -> 0x0c56 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0c56 }
        L_0x0c56:
            o.ox r0 = p004o.C0626ox.DOUBLECASTBODY     // Catch:{ NoSuchFieldError -> 0x0c61 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0c61 }
            r1 = 523(0x20b, float:7.33E-43)     // Catch:{ NoSuchFieldError -> 0x0c61 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0c61 }
        L_0x0c61:
            o.ox r0 = p004o.C0626ox.DOUBLEGUMGANG     // Catch:{ NoSuchFieldError -> 0x0c6c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0c6c }
            r1 = 420(0x1a4, float:5.89E-43)     // Catch:{ NoSuchFieldError -> 0x0c6c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0c6c }
        L_0x0c6c:
            o.ox r0 = p004o.C0626ox.DOUBLEGUMGANG2     // Catch:{ NoSuchFieldError -> 0x0c77 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0c77 }
            r1 = 487(0x1e7, float:6.82E-43)     // Catch:{ NoSuchFieldError -> 0x0c77 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0c77 }
        L_0x0c77:
            o.ox r0 = p004o.C0626ox.DOUBLEGUMGANG3     // Catch:{ NoSuchFieldError -> 0x0c82 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0c82 }
            r1 = 488(0x1e8, float:6.84E-43)     // Catch:{ NoSuchFieldError -> 0x0c82 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0c82 }
        L_0x0c82:
            o.ox r0 = p004o.C0626ox.DQ9_CHARGE     // Catch:{ NoSuchFieldError -> 0x0c8d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0c8d }
            r1 = 897(0x381, float:1.257E-42)     // Catch:{ NoSuchFieldError -> 0x0c8d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0c8d }
        L_0x0c8d:
            o.ox r0 = p004o.C0626ox.DQ9_CHARGE2     // Catch:{ NoSuchFieldError -> 0x0c98 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0c98 }
            r1 = 898(0x382, float:1.258E-42)     // Catch:{ NoSuchFieldError -> 0x0c98 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0c98 }
        L_0x0c98:
            o.ox r0 = p004o.C0626ox.DQ9_CHARGE3     // Catch:{ NoSuchFieldError -> 0x0ca3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0ca3 }
            r1 = 899(0x383, float:1.26E-42)     // Catch:{ NoSuchFieldError -> 0x0ca3 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0ca3 }
        L_0x0ca3:
            o.ox r0 = p004o.C0626ox.DQ9_CHARGE4     // Catch:{ NoSuchFieldError -> 0x0cae }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0cae }
            r1 = 900(0x384, float:1.261E-42)     // Catch:{ NoSuchFieldError -> 0x0cae }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0cae }
        L_0x0cae:
            o.ox r0 = p004o.C0626ox.DRAGONFEAR     // Catch:{ NoSuchFieldError -> 0x0cb9 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0cb9 }
            r1 = 670(0x29e, float:9.39E-43)     // Catch:{ NoSuchFieldError -> 0x0cb9 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0cb9 }
        L_0x0cb9:
            o.ox r0 = p004o.C0626ox.DRAGONSMOKE     // Catch:{ NoSuchFieldError -> 0x0cc4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0cc4 }
            r1 = 375(0x177, float:5.25E-43)     // Catch:{ NoSuchFieldError -> 0x0cc4 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0cc4 }
        L_0x0cc4:
            o.ox r0 = p004o.C0626ox.DUST     // Catch:{ NoSuchFieldError -> 0x0ccf }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0ccf }
            r1 = 691(0x2b3, float:9.68E-43)     // Catch:{ NoSuchFieldError -> 0x0ccf }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0ccf }
        L_0x0ccf:
            o.ox r0 = p004o.C0626ox.DUSTSTORM     // Catch:{ NoSuchFieldError -> 0x0cda }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0cda }
            r1 = 1023(0x3ff, float:1.434E-42)     // Catch:{ NoSuchFieldError -> 0x0cda }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0cda }
        L_0x0cda:
            o.ox r0 = p004o.C0626ox.D_TAIL     // Catch:{ NoSuchFieldError -> 0x0ce5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0ce5 }
            r1 = 1050(0x41a, float:1.471E-42)     // Catch:{ NoSuchFieldError -> 0x0ce5 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0ce5 }
        L_0x0ce5:
            o.ox r0 = p004o.C0626ox.EARTHHIT     // Catch:{ NoSuchFieldError -> 0x0cf0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0cf0 }
            r1 = 149(0x95, float:2.09E-43)     // Catch:{ NoSuchFieldError -> 0x0cf0 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0cf0 }
        L_0x0cf0:
            o.ox r0 = p004o.C0626ox.EARTHSPIKE     // Catch:{ NoSuchFieldError -> 0x0cfb }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0cfb }
            r1 = 81     // Catch:{ NoSuchFieldError -> 0x0cfb }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0cfb }
        L_0x0cfb:
            o.ox r0 = p004o.C0626ox.EARTHWALL     // Catch:{ NoSuchFieldError -> 0x0d06 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0d06 }
            r1 = 734(0x2de, float:1.029E-42)     // Catch:{ NoSuchFieldError -> 0x0d06 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0d06 }
        L_0x0d06:
            o.ox r0 = p004o.C0626ox.EDP     // Catch:{ NoSuchFieldError -> 0x0d11 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0d11 }
            r1 = 495(0x1ef, float:6.94E-43)     // Catch:{ NoSuchFieldError -> 0x0d11 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0d11 }
        L_0x0d11:
            o.ox r0 = p004o.C0626ox.ELECTRIC     // Catch:{ NoSuchFieldError -> 0x0d1c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0d1c }
            r1 = 434(0x1b2, float:6.08E-43)     // Catch:{ NoSuchFieldError -> 0x0d1c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0d1c }
        L_0x0d1c:
            o.ox r0 = p004o.C0626ox.ELECTRIC2     // Catch:{ NoSuchFieldError -> 0x0d27 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0d27 }
            r1 = 435(0x1b3, float:6.1E-43)     // Catch:{ NoSuchFieldError -> 0x0d27 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0d27 }
        L_0x0d27:
            o.ox r0 = p004o.C0626ox.ELECTRIC3     // Catch:{ NoSuchFieldError -> 0x0d32 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0d32 }
            r1 = 783(0x30f, float:1.097E-42)     // Catch:{ NoSuchFieldError -> 0x0d32 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0d32 }
        L_0x0d32:
            o.ox r0 = p004o.C0626ox.ELECTRIC4     // Catch:{ NoSuchFieldError -> 0x0d3d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0d3d }
            r1 = 890(0x37a, float:1.247E-42)     // Catch:{ NoSuchFieldError -> 0x0d3d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0d3d }
        L_0x0d3d:
            o.ox r0 = p004o.C0626ox.EL_AQUAPLAY     // Catch:{ NoSuchFieldError -> 0x0d48 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0d48 }
            r1 = 951(0x3b7, float:1.333E-42)     // Catch:{ NoSuchFieldError -> 0x0d48 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0d48 }
        L_0x0d48:
            o.ox r0 = p004o.C0626ox.EL_BLAST     // Catch:{ NoSuchFieldError -> 0x0d53 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0d53 }
            r1 = 950(0x3b6, float:1.331E-42)     // Catch:{ NoSuchFieldError -> 0x0d53 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0d53 }
        L_0x0d53:
            o.ox r0 = p004o.C0626ox.EL_CHILLY_AIR     // Catch:{ NoSuchFieldError -> 0x0d5e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0d5e }
            r1 = 954(0x3ba, float:1.337E-42)     // Catch:{ NoSuchFieldError -> 0x0d5e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0d5e }
        L_0x0d5e:
            o.ox r0 = p004o.C0626ox.EL_COOLER     // Catch:{ NoSuchFieldError -> 0x0d69 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0d69 }
            r1 = 956(0x3bc, float:1.34E-42)     // Catch:{ NoSuchFieldError -> 0x0d69 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0d69 }
        L_0x0d69:
            o.ox r0 = p004o.C0626ox.EL_CURSED_SOIL     // Catch:{ NoSuchFieldError -> 0x0d74 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0d74 }
            r1 = 955(0x3bb, float:1.338E-42)     // Catch:{ NoSuchFieldError -> 0x0d74 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0d74 }
        L_0x0d74:
            o.ox r0 = p004o.C0626ox.EL_GUST     // Catch:{ NoSuchFieldError -> 0x0d7f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0d7f }
            r1 = 949(0x3b5, float:1.33E-42)     // Catch:{ NoSuchFieldError -> 0x0d7f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0d7f }
        L_0x0d7f:
            o.ox r0 = p004o.C0626ox.EL_HEATER     // Catch:{ NoSuchFieldError -> 0x0d8a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0d8a }
            r1 = 960(0x3c0, float:1.345E-42)     // Catch:{ NoSuchFieldError -> 0x0d8a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0d8a }
        L_0x0d8a:
            o.ox r0 = p004o.C0626ox.EL_PETROLOGY     // Catch:{ NoSuchFieldError -> 0x0d95 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0d95 }
            r1 = 959(0x3bf, float:1.344E-42)     // Catch:{ NoSuchFieldError -> 0x0d95 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0d95 }
        L_0x0d95:
            o.ox r0 = p004o.C0626ox.EL_PYROTECHNIC     // Catch:{ NoSuchFieldError -> 0x0da0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0da0 }
            r1 = 958(0x3be, float:1.342E-42)     // Catch:{ NoSuchFieldError -> 0x0da0 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0da0 }
        L_0x0da0:
            o.ox r0 = p004o.C0626ox.EL_TROPIC     // Catch:{ NoSuchFieldError -> 0x0dab }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0dab }
            r1 = 957(0x3bd, float:1.341E-42)     // Catch:{ NoSuchFieldError -> 0x0dab }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0dab }
        L_0x0dab:
            o.ox r0 = p004o.C0626ox.EL_UPHEAVAL     // Catch:{ NoSuchFieldError -> 0x0db6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0db6 }
            r1 = 952(0x3b8, float:1.334E-42)     // Catch:{ NoSuchFieldError -> 0x0db6 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0db6 }
        L_0x0db6:
            o.ox r0 = p004o.C0626ox.EL_WILD_STORM     // Catch:{ NoSuchFieldError -> 0x0dc1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0dc1 }
            r1 = 953(0x3b9, float:1.335E-42)     // Catch:{ NoSuchFieldError -> 0x0dc1 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0dc1 }
        L_0x0dc1:
            o.ox r0 = p004o.C0626ox.EMITTER     // Catch:{ NoSuchFieldError -> 0x0dcc }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0dcc }
            r1 = 976(0x3d0, float:1.368E-42)     // Catch:{ NoSuchFieldError -> 0x0dcc }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0dcc }
        L_0x0dcc:
            o.ox r0 = p004o.C0626ox.ENCHANTPOISON     // Catch:{ NoSuchFieldError -> 0x0dd7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0dd7 }
            r1 = 127(0x7f, float:1.78E-43)     // Catch:{ NoSuchFieldError -> 0x0dd7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0dd7 }
        L_0x0dd7:
            o.ox r0 = p004o.C0626ox.ENDURE     // Catch:{ NoSuchFieldError -> 0x0de2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0de2 }
            r1 = 13     // Catch:{ NoSuchFieldError -> 0x0de2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0de2 }
        L_0x0de2:
            o.ox r0 = p004o.C0626ox.ENERGYCOAT     // Catch:{ NoSuchFieldError -> 0x0ded }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0ded }
            r1 = 171(0xab, float:2.4E-43)     // Catch:{ NoSuchFieldError -> 0x0ded }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0ded }
        L_0x0ded:
            o.ox r0 = p004o.C0626ox.ENERGYDRAIN     // Catch:{ NoSuchFieldError -> 0x0df8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0df8 }
            r1 = 219(0xdb, float:3.07E-43)     // Catch:{ NoSuchFieldError -> 0x0df8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0df8 }
        L_0x0df8:
            o.ox r0 = p004o.C0626ox.ENERGYDRAIN2     // Catch:{ NoSuchFieldError -> 0x0e03 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0e03 }
            r1 = 380(0x17c, float:5.32E-43)     // Catch:{ NoSuchFieldError -> 0x0e03 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0e03 }
        L_0x0e03:
            o.ox r0 = p004o.C0626ox.ENERGYDRAIN3     // Catch:{ NoSuchFieldError -> 0x0e0e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0e0e }
            r1 = 385(0x181, float:5.4E-43)     // Catch:{ NoSuchFieldError -> 0x0e0e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0e0e }
        L_0x0e0e:
            o.ox r0 = p004o.C0626ox.ENERVATION     // Catch:{ NoSuchFieldError -> 0x0e19 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0e19 }
            r1 = 815(0x32f, float:1.142E-42)     // Catch:{ NoSuchFieldError -> 0x0e19 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0e19 }
        L_0x0e19:
            o.ox r0 = p004o.C0626ox.ENERVATION2     // Catch:{ NoSuchFieldError -> 0x0e24 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0e24 }
            r1 = 816(0x330, float:1.143E-42)     // Catch:{ NoSuchFieldError -> 0x0e24 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0e24 }
        L_0x0e24:
            o.ox r0 = p004o.C0626ox.ENERVATION3     // Catch:{ NoSuchFieldError -> 0x0e2f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0e2f }
            r1 = 817(0x331, float:1.145E-42)     // Catch:{ NoSuchFieldError -> 0x0e2f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0e2f }
        L_0x0e2f:
            o.ox r0 = p004o.C0626ox.ENERVATION4     // Catch:{ NoSuchFieldError -> 0x0e3a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0e3a }
            r1 = 818(0x332, float:1.146E-42)     // Catch:{ NoSuchFieldError -> 0x0e3a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0e3a }
        L_0x0e3a:
            o.ox r0 = p004o.C0626ox.ENERVATION5     // Catch:{ NoSuchFieldError -> 0x0e45 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0e45 }
            r1 = 819(0x333, float:1.148E-42)     // Catch:{ NoSuchFieldError -> 0x0e45 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0e45 }
        L_0x0e45:
            o.ox r0 = p004o.C0626ox.ENERVATION6     // Catch:{ NoSuchFieldError -> 0x0e50 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0e50 }
            r1 = 820(0x334, float:1.149E-42)     // Catch:{ NoSuchFieldError -> 0x0e50 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0e50 }
        L_0x0e50:
            o.ox r0 = p004o.C0626ox.ENERVATION7     // Catch:{ NoSuchFieldError -> 0x0e5b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0e5b }
            r1 = 866(0x362, float:1.214E-42)     // Catch:{ NoSuchFieldError -> 0x0e5b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0e5b }
        L_0x0e5b:
            o.ox r0 = p004o.C0626ox.ENHANCE     // Catch:{ NoSuchFieldError -> 0x0e66 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0e66 }
            r1 = 11     // Catch:{ NoSuchFieldError -> 0x0e66 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0e66 }
        L_0x0e66:
            o.ox r0 = p004o.C0626ox.ENTRY     // Catch:{ NoSuchFieldError -> 0x0e71 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0e71 }
            r1 = 8     // Catch:{ NoSuchFieldError -> 0x0e71 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0e71 }
        L_0x0e71:
            o.ox r0 = p004o.C0626ox.ENTRY2     // Catch:{ NoSuchFieldError -> 0x0e7c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0e7c }
            r1 = 346(0x15a, float:4.85E-43)     // Catch:{ NoSuchFieldError -> 0x0e7c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0e7c }
        L_0x0e7c:
            o.ox r0 = p004o.C0626ox.ERASER_CUTTER     // Catch:{ NoSuchFieldError -> 0x0e87 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0e87 }
            r1 = 962(0x3c2, float:1.348E-42)     // Catch:{ NoSuchFieldError -> 0x0e87 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0e87 }
        L_0x0e87:
            o.ox r0 = p004o.C0626ox.EVENT_CLOUD     // Catch:{ NoSuchFieldError -> 0x0e92 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0e92 }
            r1 = 1016(0x3f8, float:1.424E-42)     // Catch:{ NoSuchFieldError -> 0x0e92 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0e92 }
        L_0x0e92:
            o.ox r0 = p004o.C0626ox.EXIT     // Catch:{ NoSuchFieldError -> 0x0e9d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0e9d }
            r1 = 9     // Catch:{ NoSuchFieldError -> 0x0e9d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0e9d }
        L_0x0e9d:
            o.ox r0 = p004o.C0626ox.EXIT2     // Catch:{ NoSuchFieldError -> 0x0ea8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0ea8 }
            r1 = 316(0x13c, float:4.43E-43)     // Catch:{ NoSuchFieldError -> 0x0ea8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0ea8 }
        L_0x0ea8:
            o.ox r0 = p004o.C0626ox.E_CHAIN     // Catch:{ NoSuchFieldError -> 0x0eb3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0eb3 }
            r1 = 1057(0x421, float:1.481E-42)     // Catch:{ NoSuchFieldError -> 0x0eb3 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0eb3 }
        L_0x0eb3:
            o.ox r0 = p004o.C0626ox.FALCONASSAULT     // Catch:{ NoSuchFieldError -> 0x0ebe }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0ebe }
            r1 = 389(0x185, float:5.45E-43)     // Catch:{ NoSuchFieldError -> 0x0ebe }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0ebe }
        L_0x0ebe:
            o.ox r0 = p004o.C0626ox.FALLEN_ANGEL     // Catch:{ NoSuchFieldError -> 0x0ec9 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0ec9 }
            r1 = 1060(0x424, float:1.485E-42)     // Catch:{ NoSuchFieldError -> 0x0ec9 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0ec9 }
        L_0x0ec9:
            o.ox r0 = p004o.C0626ox.FASTBLUEFALL     // Catch:{ NoSuchFieldError -> 0x0ed4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0ed4 }
            r1 = 561(0x231, float:7.86E-43)     // Catch:{ NoSuchFieldError -> 0x0ed4 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0ed4 }
        L_0x0ed4:
            o.ox r0 = p004o.C0626ox.FASTBLUEFALL_90     // Catch:{ NoSuchFieldError -> 0x0edf }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0edf }
            r1 = 562(0x232, float:7.88E-43)     // Catch:{ NoSuchFieldError -> 0x0edf }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0edf }
        L_0x0edf:
            o.ox r0 = p004o.C0626ox.FASTMOVE     // Catch:{ NoSuchFieldError -> 0x0eea }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0eea }
            r1 = 245(0xf5, float:3.43E-43)     // Catch:{ NoSuchFieldError -> 0x0eea }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0eea }
        L_0x0eea:
            o.ox r0 = p004o.C0626ox.FIREARROW     // Catch:{ NoSuchFieldError -> 0x0ef5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0ef5 }
            r1 = 33     // Catch:{ NoSuchFieldError -> 0x0ef5 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0ef5 }
        L_0x0ef5:
            o.ox r0 = p004o.C0626ox.FIREBALL     // Catch:{ NoSuchFieldError -> 0x0f00 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0f00 }
            r1 = 26     // Catch:{ NoSuchFieldError -> 0x0f00 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0f00 }
        L_0x0f00:
            o.ox r0 = p004o.C0626ox.FIREBALL2     // Catch:{ NoSuchFieldError -> 0x0f0b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0f0b }
            r1 = 753(0x2f1, float:1.055E-42)     // Catch:{ NoSuchFieldError -> 0x0f0b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0f0b }
        L_0x0f0b:
            o.ox r0 = p004o.C0626ox.FIREBALL3     // Catch:{ NoSuchFieldError -> 0x0f16 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0f16 }
            r1 = 808(0x328, float:1.132E-42)     // Catch:{ NoSuchFieldError -> 0x0f16 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0f16 }
        L_0x0f16:
            o.ox r0 = p004o.C0626ox.FIREBALL4     // Catch:{ NoSuchFieldError -> 0x0f21 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0f21 }
            r1 = 893(0x37d, float:1.251E-42)     // Catch:{ NoSuchFieldError -> 0x0f21 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0f21 }
        L_0x0f21:
            o.ox r0 = p004o.C0626ox.FIREBALL5     // Catch:{ NoSuchFieldError -> 0x0f2c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0f2c }
            r1 = 915(0x393, float:1.282E-42)     // Catch:{ NoSuchFieldError -> 0x0f2c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0f2c }
        L_0x0f2c:
            o.ox r0 = p004o.C0626ox.FIREBALL6     // Catch:{ NoSuchFieldError -> 0x0f37 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0f37 }
            r1 = 937(0x3a9, float:1.313E-42)     // Catch:{ NoSuchFieldError -> 0x0f37 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0f37 }
        L_0x0f37:
            o.ox r0 = p004o.C0626ox.FIREDANCE     // Catch:{ NoSuchFieldError -> 0x0f42 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0f42 }
            r1 = 1055(0x41f, float:1.478E-42)     // Catch:{ NoSuchFieldError -> 0x0f42 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0f42 }
        L_0x0f42:
            o.ox r0 = p004o.C0626ox.FIREFLY     // Catch:{ NoSuchFieldError -> 0x0f4d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0f4d }
            r1 = 47     // Catch:{ NoSuchFieldError -> 0x0f4d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0f4d }
        L_0x0f4d:
            o.ox r0 = p004o.C0626ox.FIREHIT     // Catch:{ NoSuchFieldError -> 0x0f58 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0f58 }
            r1 = 51     // Catch:{ NoSuchFieldError -> 0x0f58 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0f58 }
        L_0x0f58:
            o.ox r0 = p004o.C0626ox.FIREHIT2     // Catch:{ NoSuchFieldError -> 0x0f63 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0f63 }
            r1 = 605(0x25d, float:8.48E-43)     // Catch:{ NoSuchFieldError -> 0x0f63 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0f63 }
        L_0x0f63:
            o.ox r0 = p004o.C0626ox.FIREIVY     // Catch:{ NoSuchFieldError -> 0x0f6e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0f6e }
            r1 = 120(0x78, float:1.68E-43)     // Catch:{ NoSuchFieldError -> 0x0f6e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0f6e }
        L_0x0f6e:
            o.ox r0 = p004o.C0626ox.FIREPILLAR     // Catch:{ NoSuchFieldError -> 0x0f79 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0f79 }
            r1 = 98     // Catch:{ NoSuchFieldError -> 0x0f79 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0f79 }
        L_0x0f79:
            o.ox r0 = p004o.C0626ox.FIREPILLARBOMB     // Catch:{ NoSuchFieldError -> 0x0f84 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0f84 }
            r1 = 99     // Catch:{ NoSuchFieldError -> 0x0f84 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0f84 }
        L_0x0f84:
            o.ox r0 = p004o.C0626ox.FIREPILLARON     // Catch:{ NoSuchFieldError -> 0x0f8f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0f8f }
            r1 = 140(0x8c, float:1.96E-43)     // Catch:{ NoSuchFieldError -> 0x0f8f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0f8f }
        L_0x0f8f:
            o.ox r0 = p004o.C0626ox.FIREPILLARON2     // Catch:{ NoSuchFieldError -> 0x0f9a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0f9a }
            r1 = 720(0x2d0, float:1.009E-42)     // Catch:{ NoSuchFieldError -> 0x0f9a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0f9a }
        L_0x0f9a:
            o.ox r0 = p004o.C0626ox.FIRESPLASHHIT     // Catch:{ NoSuchFieldError -> 0x0fa5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0fa5 }
            r1 = 52     // Catch:{ NoSuchFieldError -> 0x0fa5 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0fa5 }
        L_0x0fa5:
            o.ox r0 = p004o.C0626ox.FIRETHROW     // Catch:{ NoSuchFieldError -> 0x0fb0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0fb0 }
            r1 = 789(0x315, float:1.106E-42)     // Catch:{ NoSuchFieldError -> 0x0fb0 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0fb0 }
        L_0x0fb0:
            o.ox r0 = p004o.C0626ox.FIREWALL     // Catch:{ NoSuchFieldError -> 0x0fbb }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0fbb }
            r1 = 27     // Catch:{ NoSuchFieldError -> 0x0fbb }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0fbb }
        L_0x0fbb:
            o.ox r0 = p004o.C0626ox.FIREWALL2     // Catch:{ NoSuchFieldError -> 0x0fc6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0fc6 }
            r1 = 922(0x39a, float:1.292E-42)     // Catch:{ NoSuchFieldError -> 0x0fc6 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0fc6 }
        L_0x0fc6:
            o.ox r0 = p004o.C0626ox.FIRSTAID     // Catch:{ NoSuchFieldError -> 0x0fd1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0fd1 }
            r1 = 311(0x137, float:4.36E-43)     // Catch:{ NoSuchFieldError -> 0x0fd1 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0fd1 }
        L_0x0fd1:
            o.ox r0 = p004o.C0626ox.FLAMELAUNCHER     // Catch:{ NoSuchFieldError -> 0x0fdc }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0fdc }
            r1 = 257(0x101, float:3.6E-43)     // Catch:{ NoSuchFieldError -> 0x0fdc }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0fdc }
        L_0x0fdc:
            o.ox r0 = p004o.C0626ox.FLARE_S     // Catch:{ NoSuchFieldError -> 0x0fe7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0fe7 }
            r1 = 644(0x284, float:9.02E-43)     // Catch:{ NoSuchFieldError -> 0x0fe7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0fe7 }
        L_0x0fe7:
            o.ox r0 = p004o.C0626ox.FLASHER     // Catch:{ NoSuchFieldError -> 0x0ff2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0ff2 }
            r1 = 101(0x65, float:1.42E-43)     // Catch:{ NoSuchFieldError -> 0x0ff2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0ff2 }
        L_0x0ff2:
            o.ox r0 = p004o.C0626ox.FLOWERCAST     // Catch:{ NoSuchFieldError -> 0x0ffd }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0ffd }
            r1 = 490(0x1ea, float:6.87E-43)     // Catch:{ NoSuchFieldError -> 0x0ffd }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0ffd }
        L_0x0ffd:
            o.ox r0 = p004o.C0626ox.FLOWERCAST2     // Catch:{ NoSuchFieldError -> 0x1008 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1008 }
            r1 = 491(0x1eb, float:6.88E-43)     // Catch:{ NoSuchFieldError -> 0x1008 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1008 }
        L_0x1008:
            o.ox r0 = p004o.C0626ox.FLOWERCAST3     // Catch:{ NoSuchFieldError -> 0x1013 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1013 }
            r1 = 492(0x1ec, float:6.9E-43)     // Catch:{ NoSuchFieldError -> 0x1013 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1013 }
        L_0x1013:
            o.ox r0 = p004o.C0626ox.FLOWERLEAF     // Catch:{ NoSuchFieldError -> 0x101e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x101e }
            r1 = 701(0x2bd, float:9.82E-43)     // Catch:{ NoSuchFieldError -> 0x101e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x101e }
        L_0x101e:
            o.ox r0 = p004o.C0626ox.FOOD01     // Catch:{ NoSuchFieldError -> 0x1029 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1029 }
            r1 = 595(0x253, float:8.34E-43)     // Catch:{ NoSuchFieldError -> 0x1029 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1029 }
        L_0x1029:
            o.ox r0 = p004o.C0626ox.FOOD02     // Catch:{ NoSuchFieldError -> 0x1034 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1034 }
            r1 = 596(0x254, float:8.35E-43)     // Catch:{ NoSuchFieldError -> 0x1034 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1034 }
        L_0x1034:
            o.ox r0 = p004o.C0626ox.FOOD03     // Catch:{ NoSuchFieldError -> 0x103f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x103f }
            r1 = 597(0x255, float:8.37E-43)     // Catch:{ NoSuchFieldError -> 0x103f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x103f }
        L_0x103f:
            o.ox r0 = p004o.C0626ox.FOOD04     // Catch:{ NoSuchFieldError -> 0x104a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x104a }
            r1 = 598(0x256, float:8.38E-43)     // Catch:{ NoSuchFieldError -> 0x104a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x104a }
        L_0x104a:
            o.ox r0 = p004o.C0626ox.FOOD05     // Catch:{ NoSuchFieldError -> 0x1055 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1055 }
            r1 = 599(0x257, float:8.4E-43)     // Catch:{ NoSuchFieldError -> 0x1055 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1055 }
        L_0x1055:
            o.ox r0 = p004o.C0626ox.FOOD06     // Catch:{ NoSuchFieldError -> 0x1060 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1060 }
            r1 = 600(0x258, float:8.41E-43)     // Catch:{ NoSuchFieldError -> 0x1060 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1060 }
        L_0x1060:
            o.ox r0 = p004o.C0626ox.FOOT     // Catch:{ NoSuchFieldError -> 0x106b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x106b }
            r1 = 328(0x148, float:4.6E-43)     // Catch:{ NoSuchFieldError -> 0x106b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x106b }
        L_0x106b:
            o.ox r0 = p004o.C0626ox.FOOT2     // Catch:{ NoSuchFieldError -> 0x1076 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1076 }
            r1 = 329(0x149, float:4.61E-43)     // Catch:{ NoSuchFieldError -> 0x1076 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1076 }
        L_0x1076:
            o.ox r0 = p004o.C0626ox.FOOT3     // Catch:{ NoSuchFieldError -> 0x1081 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1081 }
            r1 = 449(0x1c1, float:6.29E-43)     // Catch:{ NoSuchFieldError -> 0x1081 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1081 }
        L_0x1081:
            o.ox r0 = p004o.C0626ox.FOOT4     // Catch:{ NoSuchFieldError -> 0x108c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x108c }
            r1 = 450(0x1c2, float:6.3E-43)     // Catch:{ NoSuchFieldError -> 0x108c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x108c }
        L_0x108c:
            o.ox r0 = p004o.C0626ox.FORESTLIGHT     // Catch:{ NoSuchFieldError -> 0x1097 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1097 }
            r1 = 309(0x135, float:4.33E-43)     // Catch:{ NoSuchFieldError -> 0x1097 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1097 }
        L_0x1097:
            o.ox r0 = p004o.C0626ox.FORESTLIGHT2     // Catch:{ NoSuchFieldError -> 0x10a2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x10a2 }
            r1 = 324(0x144, float:4.54E-43)     // Catch:{ NoSuchFieldError -> 0x10a2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x10a2 }
        L_0x10a2:
            o.ox r0 = p004o.C0626ox.FORESTLIGHT3     // Catch:{ NoSuchFieldError -> 0x10ad }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x10ad }
            r1 = 325(0x145, float:4.55E-43)     // Catch:{ NoSuchFieldError -> 0x10ad }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x10ad }
        L_0x10ad:
            o.ox r0 = p004o.C0626ox.FORESTLIGHT4     // Catch:{ NoSuchFieldError -> 0x10b8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x10b8 }
            r1 = 326(0x146, float:4.57E-43)     // Catch:{ NoSuchFieldError -> 0x10b8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x10b8 }
        L_0x10b8:
            o.ox r0 = p004o.C0626ox.FORESTLIGHT5     // Catch:{ NoSuchFieldError -> 0x10c3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x10c3 }
            r1 = 721(0x2d1, float:1.01E-42)     // Catch:{ NoSuchFieldError -> 0x10c3 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x10c3 }
        L_0x10c3:
            o.ox r0 = p004o.C0626ox.FORESTLIGHT6     // Catch:{ NoSuchFieldError -> 0x10ce }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x10ce }
            r1 = 827(0x33b, float:1.159E-42)     // Catch:{ NoSuchFieldError -> 0x10ce }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x10ce }
        L_0x10ce:
            o.ox r0 = p004o.C0626ox.FREEZE     // Catch:{ NoSuchFieldError -> 0x10d9 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x10d9 }
            r1 = 135(0x87, float:1.89E-43)     // Catch:{ NoSuchFieldError -> 0x10d9 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x10d9 }
        L_0x10d9:
            o.ox r0 = p004o.C0626ox.FREEZED     // Catch:{ NoSuchFieldError -> 0x10e4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x10e4 }
            r1 = 136(0x88, float:1.9E-43)     // Catch:{ NoSuchFieldError -> 0x10e4 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x10e4 }
        L_0x10e4:
            o.ox r0 = p004o.C0626ox.FREEZING     // Catch:{ NoSuchFieldError -> 0x10ef }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x10ef }
            r1 = 110(0x6e, float:1.54E-43)     // Catch:{ NoSuchFieldError -> 0x10ef }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x10ef }
        L_0x10ef:
            o.ox r0 = p004o.C0626ox.FREEZING_S     // Catch:{ NoSuchFieldError -> 0x10fa }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x10fa }
            r1 = 643(0x283, float:9.01E-43)     // Catch:{ NoSuchFieldError -> 0x10fa }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x10fa }
        L_0x10fa:
            o.ox r0 = p004o.C0626ox.FRESHSHRIMP     // Catch:{ NoSuchFieldError -> 0x1105 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1105 }
            r1 = 1052(0x41c, float:1.474E-42)     // Catch:{ NoSuchFieldError -> 0x1105 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1105 }
        L_0x1105:
            o.ox r0 = p004o.C0626ox.FROSTDIVER     // Catch:{ NoSuchFieldError -> 0x1110 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1110 }
            r1 = 29     // Catch:{ NoSuchFieldError -> 0x1110 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1110 }
        L_0x1110:
            o.ox r0 = p004o.C0626ox.FROSTDIVER2     // Catch:{ NoSuchFieldError -> 0x111b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x111b }
            r1 = 30     // Catch:{ NoSuchFieldError -> 0x111b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x111b }
        L_0x111b:
            o.ox r0 = p004o.C0626ox.FROSTDIVER3     // Catch:{ NoSuchFieldError -> 0x1126 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1126 }
            r1 = 803(0x323, float:1.125E-42)     // Catch:{ NoSuchFieldError -> 0x1126 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1126 }
        L_0x1126:
            o.ox r0 = p004o.C0626ox.FROSTMISTY     // Catch:{ NoSuchFieldError -> 0x1131 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1131 }
            r1 = 791(0x317, float:1.108E-42)     // Catch:{ NoSuchFieldError -> 0x1131 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1131 }
        L_0x1131:
            o.ox r0 = p004o.C0626ox.FROSTMYSTY     // Catch:{ NoSuchFieldError -> 0x113c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x113c }
            r1 = 728(0x2d8, float:1.02E-42)     // Catch:{ NoSuchFieldError -> 0x113c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x113c }
        L_0x113c:
            o.ox r0 = p004o.C0626ox.FROSTWEAPON     // Catch:{ NoSuchFieldError -> 0x1147 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1147 }
            r1 = 258(0x102, float:3.62E-43)     // Catch:{ NoSuchFieldError -> 0x1147 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1147 }
        L_0x1147:
            o.ox r0 = p004o.C0626ox.FVOICE     // Catch:{ NoSuchFieldError -> 0x1152 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1152 }
            r1 = 608(0x260, float:8.52E-43)     // Catch:{ NoSuchFieldError -> 0x1152 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1152 }
        L_0x1152:
            o.ox r0 = p004o.C0626ox.GANBANTEIN     // Catch:{ NoSuchFieldError -> 0x115d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x115d }
            r1 = 225(0xe1, float:3.15E-43)     // Catch:{ NoSuchFieldError -> 0x115d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x115d }
        L_0x115d:
            o.ox r0 = p004o.C0626ox.GASPUSH     // Catch:{ NoSuchFieldError -> 0x1168 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1168 }
            r1 = 112(0x70, float:1.57E-43)     // Catch:{ NoSuchFieldError -> 0x1168 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1168 }
        L_0x1168:
            o.ox r0 = p004o.C0626ox.GC_DARKCROW     // Catch:{ NoSuchFieldError -> 0x1173 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1173 }
            r1 = 1027(0x403, float:1.439E-42)     // Catch:{ NoSuchFieldError -> 0x1173 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1173 }
        L_0x1173:
            o.ox r0 = p004o.C0626ox.GENSOU     // Catch:{ NoSuchFieldError -> 0x117e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x117e }
            r1 = 1013(0x3f5, float:1.42E-42)     // Catch:{ NoSuchFieldError -> 0x117e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x117e }
        L_0x117e:
            o.ox r0 = p004o.C0626ox.GHOST     // Catch:{ NoSuchFieldError -> 0x1189 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1189 }
            r1 = 360(0x168, float:5.04E-43)     // Catch:{ NoSuchFieldError -> 0x1189 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1189 }
        L_0x1189:
            o.ox r0 = p004o.C0626ox.GIANTBODY     // Catch:{ NoSuchFieldError -> 0x1194 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1194 }
            r1 = 424(0x1a8, float:5.94E-43)     // Catch:{ NoSuchFieldError -> 0x1194 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1194 }
        L_0x1194:
            o.ox r0 = p004o.C0626ox.GIANTBODY2     // Catch:{ NoSuchFieldError -> 0x119f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x119f }
            r1 = 425(0x1a9, float:5.96E-43)     // Catch:{ NoSuchFieldError -> 0x119f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x119f }
        L_0x119f:
            o.ox r0 = p004o.C0626ox.GI_EXPLOSION     // Catch:{ NoSuchFieldError -> 0x11aa }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x11aa }
            r1 = 516(0x204, float:7.23E-43)     // Catch:{ NoSuchFieldError -> 0x11aa }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x11aa }
        L_0x11aa:
            o.ox r0 = p004o.C0626ox.GLASSWALL     // Catch:{ NoSuchFieldError -> 0x11b5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x11b5 }
            r1 = 15     // Catch:{ NoSuchFieldError -> 0x11b5 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x11b5 }
        L_0x11b5:
            o.ox r0 = p004o.C0626ox.GLASSWALL2     // Catch:{ NoSuchFieldError -> 0x11c0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x11c0 }
            r1 = 317(0x13d, float:4.44E-43)     // Catch:{ NoSuchFieldError -> 0x11c0 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x11c0 }
        L_0x11c0:
            o.ox r0 = p004o.C0626ox.GLASSWALL3     // Catch:{ NoSuchFieldError -> 0x11cb }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x11cb }
            r1 = 756(0x2f4, float:1.06E-42)     // Catch:{ NoSuchFieldError -> 0x11cb }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x11cb }
        L_0x11cb:
            o.ox r0 = p004o.C0626ox.GLASSWALL4     // Catch:{ NoSuchFieldError -> 0x11d6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x11d6 }
            r1 = 885(0x375, float:1.24E-42)     // Catch:{ NoSuchFieldError -> 0x11d6 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x11d6 }
        L_0x11d6:
            o.ox r0 = p004o.C0626ox.GLORIA     // Catch:{ NoSuchFieldError -> 0x11e1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x11e1 }
            r1 = 77     // Catch:{ NoSuchFieldError -> 0x11e1 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x11e1 }
        L_0x11e1:
            o.ox r0 = p004o.C0626ox.GLOW1     // Catch:{ NoSuchFieldError -> 0x11ec }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x11ec }
            r1 = 695(0x2b7, float:9.74E-43)     // Catch:{ NoSuchFieldError -> 0x11ec }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x11ec }
        L_0x11ec:
            o.ox r0 = p004o.C0626ox.GLOW11     // Catch:{ NoSuchFieldError -> 0x11f7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x11f7 }
            r1 = 703(0x2bf, float:9.85E-43)     // Catch:{ NoSuchFieldError -> 0x11f7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x11f7 }
        L_0x11f7:
            o.ox r0 = p004o.C0626ox.GLOW12     // Catch:{ NoSuchFieldError -> 0x1202 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1202 }
            r1 = 704(0x2c0, float:9.87E-43)     // Catch:{ NoSuchFieldError -> 0x1202 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1202 }
        L_0x1202:
            o.ox r0 = p004o.C0626ox.GLOW2     // Catch:{ NoSuchFieldError -> 0x120d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x120d }
            r1 = 696(0x2b8, float:9.75E-43)     // Catch:{ NoSuchFieldError -> 0x120d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x120d }
        L_0x120d:
            o.ox r0 = p004o.C0626ox.GLOW4     // Catch:{ NoSuchFieldError -> 0x1218 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1218 }
            r1 = 697(0x2b9, float:9.77E-43)     // Catch:{ NoSuchFieldError -> 0x1218 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1218 }
        L_0x1218:
            o.ox r0 = p004o.C0626ox.GN_ILLUSIONDOPING     // Catch:{ NoSuchFieldError -> 0x1223 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1223 }
            r1 = 1035(0x40b, float:1.45E-42)     // Catch:{ NoSuchFieldError -> 0x1223 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1223 }
        L_0x1223:
            o.ox r0 = p004o.C0626ox.GRADIUS_LASER     // Catch:{ NoSuchFieldError -> 0x122e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x122e }
            r1 = 886(0x376, float:1.242E-42)     // Catch:{ NoSuchFieldError -> 0x122e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x122e }
        L_0x122e:
            o.ox r0 = p004o.C0626ox.GRANDCROSS     // Catch:{ NoSuchFieldError -> 0x1239 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1239 }
            r1 = 228(0xe4, float:3.2E-43)     // Catch:{ NoSuchFieldError -> 0x1239 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1239 }
        L_0x1239:
            o.ox r0 = p004o.C0626ox.GRANDCROSS2     // Catch:{ NoSuchFieldError -> 0x1244 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1244 }
            r1 = 452(0x1c4, float:6.33E-43)     // Catch:{ NoSuchFieldError -> 0x1244 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1244 }
        L_0x1244:
            o.ox r0 = p004o.C0626ox.GRAVITATION     // Catch:{ NoSuchFieldError -> 0x124f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x124f }
            r1 = 524(0x20c, float:7.34E-43)     // Catch:{ NoSuchFieldError -> 0x124f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x124f }
        L_0x124f:
            o.ox r0 = p004o.C0626ox.GRAYBODY     // Catch:{ NoSuchFieldError -> 0x125a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x125a }
            r1 = 965(0x3c5, float:1.352E-42)     // Catch:{ NoSuchFieldError -> 0x125a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x125a }
        L_0x125a:
            o.ox r0 = p004o.C0626ox.GREEN99_3     // Catch:{ NoSuchFieldError -> 0x1265 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1265 }
            r1 = 680(0x2a8, float:9.53E-43)     // Catch:{ NoSuchFieldError -> 0x1265 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1265 }
        L_0x1265:
            o.ox r0 = p004o.C0626ox.GREEN99_5     // Catch:{ NoSuchFieldError -> 0x1270 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1270 }
            r1 = 681(0x2a9, float:9.54E-43)     // Catch:{ NoSuchFieldError -> 0x1270 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1270 }
        L_0x1270:
            o.ox r0 = p004o.C0626ox.GREEN99_6     // Catch:{ NoSuchFieldError -> 0x127b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x127b }
            r1 = 682(0x2aa, float:9.56E-43)     // Catch:{ NoSuchFieldError -> 0x127b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x127b }
        L_0x127b:
            o.ox r0 = p004o.C0626ox.GREENBODY     // Catch:{ NoSuchFieldError -> 0x1286 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1286 }
            r1 = 540(0x21c, float:7.57E-43)     // Catch:{ NoSuchFieldError -> 0x1286 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1286 }
        L_0x1286:
            o.ox r0 = p004o.C0626ox.GREENCASTING     // Catch:{ NoSuchFieldError -> 0x1291 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1291 }
            r1 = 913(0x391, float:1.28E-42)     // Catch:{ NoSuchFieldError -> 0x1291 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1291 }
        L_0x1291:
            o.ox r0 = p004o.C0626ox.GREEN_NUMBER     // Catch:{ NoSuchFieldError -> 0x129c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x129c }
            r1 = 659(0x293, float:9.23E-43)     // Catch:{ NoSuchFieldError -> 0x129c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x129c }
        L_0x129c:
            o.ox r0 = p004o.C0626ox.GRIMTOOTH     // Catch:{ NoSuchFieldError -> 0x12a7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x12a7 }
            r1 = 125(0x7d, float:1.75E-43)     // Catch:{ NoSuchFieldError -> 0x12a7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x12a7 }
        L_0x12a7:
            o.ox r0 = p004o.C0626ox.GRIMTOOTHATK     // Catch:{ NoSuchFieldError -> 0x12b2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x12b2 }
            r1 = 134(0x86, float:1.88E-43)     // Catch:{ NoSuchFieldError -> 0x12b2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x12b2 }
        L_0x12b2:
            o.ox r0 = p004o.C0626ox.GROUNDSAMPLE     // Catch:{ NoSuchFieldError -> 0x12bd }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x12bd }
            r1 = 515(0x203, float:7.22E-43)     // Catch:{ NoSuchFieldError -> 0x12bd }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x12bd }
        L_0x12bd:
            o.ox r0 = p004o.C0626ox.GROUNDSHAKE     // Catch:{ NoSuchFieldError -> 0x12c8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x12c8 }
            r1 = 896(0x380, float:1.256E-42)     // Catch:{ NoSuchFieldError -> 0x12c8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x12c8 }
        L_0x12c8:
            o.ox r0 = p004o.C0626ox.GROUNDSHAKE2     // Catch:{ NoSuchFieldError -> 0x12d3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x12d3 }
            r1 = 907(0x38b, float:1.271E-42)     // Catch:{ NoSuchFieldError -> 0x12d3 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x12d3 }
        L_0x12d3:
            o.ox r0 = p004o.C0626ox.GROUND_EXPLOSION     // Catch:{ NoSuchFieldError -> 0x12de }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x12de }
            r1 = 992(0x3e0, float:1.39E-42)     // Catch:{ NoSuchFieldError -> 0x12de }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x12de }
        L_0x12de:
            o.ox r0 = p004o.C0626ox.GTHUNDER     // Catch:{ NoSuchFieldError -> 0x12e9 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x12e9 }
            r1 = 798(0x31e, float:1.118E-42)     // Catch:{ NoSuchFieldError -> 0x12e9 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x12e9 }
        L_0x12e9:
            o.ox r0 = p004o.C0626ox.GUARD     // Catch:{ NoSuchFieldError -> 0x12f4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x12f4 }
            r1 = 338(0x152, float:4.74E-43)     // Catch:{ NoSuchFieldError -> 0x12f4 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x12f4 }
        L_0x12f4:
            o.ox r0 = p004o.C0626ox.GUARD2     // Catch:{ NoSuchFieldError -> 0x12ff }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x12ff }
            r1 = 498(0x1f2, float:6.98E-43)     // Catch:{ NoSuchFieldError -> 0x12ff }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x12ff }
        L_0x12ff:
            o.ox r0 = p004o.C0626ox.GUARD3     // Catch:{ NoSuchFieldError -> 0x130a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x130a }
            r1 = 677(0x2a5, float:9.49E-43)     // Catch:{ NoSuchFieldError -> 0x130a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x130a }
        L_0x130a:
            o.ox r0 = p004o.C0626ox.GUARD4     // Catch:{ NoSuchFieldError -> 0x1315 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1315 }
            r1 = 784(0x310, float:1.099E-42)     // Catch:{ NoSuchFieldError -> 0x1315 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1315 }
        L_0x1315:
            o.ox r0 = p004o.C0626ox.GUIDEDATTACK     // Catch:{ NoSuchFieldError -> 0x1320 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1320 }
            r1 = 193(0xc1, float:2.7E-43)     // Catch:{ NoSuchFieldError -> 0x1320 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1320 }
        L_0x1320:
            o.ox r0 = p004o.C0626ox.GUMGANG     // Catch:{ NoSuchFieldError -> 0x132b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x132b }
            r1 = 205(0xcd, float:2.87E-43)     // Catch:{ NoSuchFieldError -> 0x132b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x132b }
        L_0x132b:
            o.ox r0 = p004o.C0626ox.GUMGANG2     // Catch:{ NoSuchFieldError -> 0x1336 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1336 }
            r1 = 263(0x107, float:3.69E-43)     // Catch:{ NoSuchFieldError -> 0x1336 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1336 }
        L_0x1336:
            o.ox r0 = p004o.C0626ox.GUMGANG3     // Catch:{ NoSuchFieldError -> 0x1341 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1341 }
            r1 = 265(0x109, float:3.71E-43)     // Catch:{ NoSuchFieldError -> 0x1341 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1341 }
        L_0x1341:
            o.ox r0 = p004o.C0626ox.GUMGANG4     // Catch:{ NoSuchFieldError -> 0x134c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x134c }
            r1 = 775(0x307, float:1.086E-42)     // Catch:{ NoSuchFieldError -> 0x134c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x134c }
        L_0x134c:
            o.ox r0 = p004o.C0626ox.GUMGANG5     // Catch:{ NoSuchFieldError -> 0x1357 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1357 }
            r1 = 888(0x378, float:1.244E-42)     // Catch:{ NoSuchFieldError -> 0x1357 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1357 }
        L_0x1357:
            o.ox r0 = p004o.C0626ox.GUMGANG6     // Catch:{ NoSuchFieldError -> 0x1362 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1362 }
            r1 = 936(0x3a8, float:1.312E-42)     // Catch:{ NoSuchFieldError -> 0x1362 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1362 }
        L_0x1362:
            o.ox r0 = p004o.C0626ox.GUMGANG7     // Catch:{ NoSuchFieldError -> 0x136d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x136d }
            r1 = 938(0x3aa, float:1.314E-42)     // Catch:{ NoSuchFieldError -> 0x136d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x136d }
        L_0x136d:
            o.ox r0 = p004o.C0626ox.GUMGANG8     // Catch:{ NoSuchFieldError -> 0x1378 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1378 }
            r1 = 939(0x3ab, float:1.316E-42)     // Catch:{ NoSuchFieldError -> 0x1378 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1378 }
        L_0x1378:
            o.ox r0 = p004o.C0626ox.GUMGANG9     // Catch:{ NoSuchFieldError -> 0x1383 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1383 }
            r1 = 940(0x3ac, float:1.317E-42)     // Catch:{ NoSuchFieldError -> 0x1383 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1383 }
        L_0x1383:
            o.ox r0 = p004o.C0626ox.GUMGANGNPC     // Catch:{ NoSuchFieldError -> 0x138e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x138e }
            r1 = 457(0x1c9, float:6.4E-43)     // Catch:{ NoSuchFieldError -> 0x138e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x138e }
        L_0x138e:
            o.ox r0 = p004o.C0626ox.HALFSPHERE     // Catch:{ NoSuchFieldError -> 0x1399 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1399 }
            r1 = 438(0x1b6, float:6.14E-43)     // Catch:{ NoSuchFieldError -> 0x1399 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1399 }
        L_0x1399:
            o.ox r0 = p004o.C0626ox.HALLUTIME     // Catch:{ NoSuchFieldError -> 0x13a4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x13a4 }
            r1 = 795(0x31b, float:1.114E-42)     // Catch:{ NoSuchFieldError -> 0x13a4 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x13a4 }
        L_0x13a4:
            o.ox r0 = p004o.C0626ox.HAMIBLOOD     // Catch:{ NoSuchFieldError -> 0x13af }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x13af }
            r1 = 573(0x23d, float:8.03E-43)     // Catch:{ NoSuchFieldError -> 0x13af }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x13af }
        L_0x13af:
            o.ox r0 = p004o.C0626ox.HAMICASTLE     // Catch:{ NoSuchFieldError -> 0x13ba }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x13ba }
            r1 = 572(0x23c, float:8.02E-43)     // Catch:{ NoSuchFieldError -> 0x13ba }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x13ba }
        L_0x13ba:
            o.ox r0 = p004o.C0626ox.HAMIDEFENCE     // Catch:{ NoSuchFieldError -> 0x13c5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x13c5 }
            r1 = 571(0x23b, float:8.0E-43)     // Catch:{ NoSuchFieldError -> 0x13c5 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x13c5 }
        L_0x13c5:
            o.ox r0 = p004o.C0626ox.HAMMER_OF_GOD     // Catch:{ NoSuchFieldError -> 0x13d0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x13d0 }
            r1 = 1047(0x417, float:1.467E-42)     // Catch:{ NoSuchFieldError -> 0x13d0 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x13d0 }
        L_0x13d0:
            o.ox r0 = p004o.C0626ox.HAPGYEOK     // Catch:{ NoSuchFieldError -> 0x13db }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x13db }
            r1 = 614(0x266, float:8.6E-43)     // Catch:{ NoSuchFieldError -> 0x13db }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x13db }
        L_0x13db:
            o.ox r0 = p004o.C0626ox.HASTEUP     // Catch:{ NoSuchFieldError -> 0x13e6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x13e6 }
            r1 = 100     // Catch:{ NoSuchFieldError -> 0x13e6 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x13e6 }
        L_0x13e6:
            o.ox r0 = p004o.C0626ox.HATED     // Catch:{ NoSuchFieldError -> 0x13f1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x13f1 }
            r1 = 545(0x221, float:7.64E-43)     // Catch:{ NoSuchFieldError -> 0x13f1 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x13f1 }
        L_0x13f1:
            o.ox r0 = p004o.C0626ox.HATED2     // Catch:{ NoSuchFieldError -> 0x13fc }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x13fc }
            r1 = 574(0x23e, float:8.04E-43)     // Catch:{ NoSuchFieldError -> 0x13fc }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x13fc }
        L_0x13fc:
            o.ox r0 = p004o.C0626ox.HAT_EFFECT     // Catch:{ NoSuchFieldError -> 0x1407 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1407 }
            r1 = 1014(0x3f6, float:1.421E-42)     // Catch:{ NoSuchFieldError -> 0x1407 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1407 }
        L_0x1407:
            o.ox r0 = p004o.C0626ox.HEAL     // Catch:{ NoSuchFieldError -> 0x1412 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1412 }
            r1 = 314(0x13a, float:4.4E-43)     // Catch:{ NoSuchFieldError -> 0x1412 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1412 }
        L_0x1412:
            o.ox r0 = p004o.C0626ox.HEAL2     // Catch:{ NoSuchFieldError -> 0x141d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x141d }
            r1 = 315(0x13b, float:4.41E-43)     // Catch:{ NoSuchFieldError -> 0x141d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x141d }
        L_0x141d:
            o.ox r0 = p004o.C0626ox.HEAL3     // Catch:{ NoSuchFieldError -> 0x1428 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1428 }
            r1 = 322(0x142, float:4.51E-43)     // Catch:{ NoSuchFieldError -> 0x1428 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1428 }
        L_0x1428:
            o.ox r0 = p004o.C0626ox.HEAL4     // Catch:{ NoSuchFieldError -> 0x1433 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1433 }
            r1 = 327(0x147, float:4.58E-43)     // Catch:{ NoSuchFieldError -> 0x1433 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1433 }
        L_0x1433:
            o.ox r0 = p004o.C0626ox.HEALSP     // Catch:{ NoSuchFieldError -> 0x143e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x143e }
            r1 = 16     // Catch:{ NoSuchFieldError -> 0x143e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x143e }
        L_0x143e:
            o.ox r0 = p004o.C0626ox.HEAL_N     // Catch:{ NoSuchFieldError -> 0x1449 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1449 }
            r1 = 834(0x342, float:1.169E-42)     // Catch:{ NoSuchFieldError -> 0x1449 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1449 }
        L_0x1449:
            o.ox r0 = p004o.C0626ox.HEAL_N2     // Catch:{ NoSuchFieldError -> 0x1454 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1454 }
            r1 = 945(0x3b1, float:1.324E-42)     // Catch:{ NoSuchFieldError -> 0x1454 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1454 }
        L_0x1454:
            o.ox r0 = p004o.C0626ox.HEARTASURA     // Catch:{ NoSuchFieldError -> 0x145f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x145f }
            r1 = 881(0x371, float:1.235E-42)     // Catch:{ NoSuchFieldError -> 0x145f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x145f }
        L_0x145f:
            o.ox r0 = p004o.C0626ox.HEARTCASTING     // Catch:{ NoSuchFieldError -> 0x146a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x146a }
            r1 = 345(0x159, float:4.83E-43)     // Catch:{ NoSuchFieldError -> 0x146a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x146a }
        L_0x146a:
            o.ox r0 = p004o.C0626ox.HEAT_BARREL     // Catch:{ NoSuchFieldError -> 0x1475 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1475 }
            r1 = 1058(0x422, float:1.483E-42)     // Catch:{ NoSuchFieldError -> 0x1475 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1475 }
        L_0x1475:
            o.ox r0 = p004o.C0626ox.HEAVENSDRIVE     // Catch:{ NoSuchFieldError -> 0x1480 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1480 }
            r1 = 144(0x90, float:2.02E-43)     // Catch:{ NoSuchFieldError -> 0x1480 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1480 }
        L_0x1480:
            o.ox r0 = p004o.C0626ox.HELLSPLANT     // Catch:{ NoSuchFieldError -> 0x148b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x148b }
            r1 = 921(0x399, float:1.29E-42)     // Catch:{ NoSuchFieldError -> 0x148b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x148b }
        L_0x148b:
            o.ox r0 = p004o.C0626ox.HELL_STR     // Catch:{ NoSuchFieldError -> 0x1496 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1496 }
            r1 = 730(0x2da, float:1.023E-42)     // Catch:{ NoSuchFieldError -> 0x1496 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1496 }
        L_0x1496:
            o.ox r0 = p004o.C0626ox.HFLIMOON1     // Catch:{ NoSuchFieldError -> 0x14a1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x14a1 }
            r1 = 567(0x237, float:7.95E-43)     // Catch:{ NoSuchFieldError -> 0x14a1 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x14a1 }
        L_0x14a1:
            o.ox r0 = p004o.C0626ox.HFLIMOON2     // Catch:{ NoSuchFieldError -> 0x14ac }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x14ac }
            r1 = 568(0x238, float:7.96E-43)     // Catch:{ NoSuchFieldError -> 0x14ac }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x14ac }
        L_0x14ac:
            o.ox r0 = p004o.C0626ox.HFLIMOON3     // Catch:{ NoSuchFieldError -> 0x14b7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x14b7 }
            r1 = 569(0x239, float:7.97E-43)     // Catch:{ NoSuchFieldError -> 0x14b7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x14b7 }
        L_0x14b7:
            o.ox r0 = p004o.C0626ox.HIDING     // Catch:{ NoSuchFieldError -> 0x14c2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x14c2 }
            r1 = 21     // Catch:{ NoSuchFieldError -> 0x14c2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x14c2 }
        L_0x14c2:
            o.ox r0 = p004o.C0626ox.HIT1     // Catch:{ NoSuchFieldError -> 0x14cc }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x14cc }
            r1 = 2     // Catch:{ NoSuchFieldError -> 0x14cc }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x14cc }
        L_0x14cc:
            o.ox r0 = p004o.C0626ox.HIT2     // Catch:{ NoSuchFieldError -> 0x14d6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x14d6 }
            r1 = 3     // Catch:{ NoSuchFieldError -> 0x14d6 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x14d6 }
        L_0x14d6:
            o.ox r0 = p004o.C0626ox.HIT3     // Catch:{ NoSuchFieldError -> 0x14e0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x14e0 }
            r1 = 4     // Catch:{ NoSuchFieldError -> 0x14e0 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x14e0 }
        L_0x14e0:
            o.ox r0 = p004o.C0626ox.HIT4     // Catch:{ NoSuchFieldError -> 0x14ea }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x14ea }
            r1 = 5     // Catch:{ NoSuchFieldError -> 0x14ea }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x14ea }
        L_0x14ea:
            o.ox r0 = p004o.C0626ox.HIT5     // Catch:{ NoSuchFieldError -> 0x14f4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x14f4 }
            r1 = 6     // Catch:{ NoSuchFieldError -> 0x14f4 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x14f4 }
        L_0x14f4:
            o.ox r0 = p004o.C0626ox.HIT6     // Catch:{ NoSuchFieldError -> 0x14fe }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x14fe }
            r1 = 7     // Catch:{ NoSuchFieldError -> 0x14fe }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x14fe }
        L_0x14fe:
            o.ox r0 = p004o.C0626ox.HITBODY     // Catch:{ NoSuchFieldError -> 0x1509 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1509 }
            r1 = 419(0x1a3, float:5.87E-43)     // Catch:{ NoSuchFieldError -> 0x1509 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1509 }
        L_0x1509:
            o.ox r0 = p004o.C0626ox.HITDARK     // Catch:{ NoSuchFieldError -> 0x1514 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1514 }
            r1 = 182(0xb6, float:2.55E-43)     // Catch:{ NoSuchFieldError -> 0x1514 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1514 }
        L_0x1514:
            o.ox r0 = p004o.C0626ox.HITLINE     // Catch:{ NoSuchFieldError -> 0x151f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x151f }
            r1 = 332(0x14c, float:4.65E-43)     // Catch:{ NoSuchFieldError -> 0x151f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x151f }
        L_0x151f:
            o.ox r0 = p004o.C0626ox.HITLINE2     // Catch:{ NoSuchFieldError -> 0x152a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x152a }
            r1 = 378(0x17a, float:5.3E-43)     // Catch:{ NoSuchFieldError -> 0x152a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x152a }
        L_0x152a:
            o.ox r0 = p004o.C0626ox.HITLINE3     // Catch:{ NoSuchFieldError -> 0x1535 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1535 }
            r1 = 430(0x1ae, float:6.03E-43)     // Catch:{ NoSuchFieldError -> 0x1535 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1535 }
        L_0x1535:
            o.ox r0 = p004o.C0626ox.HITLINE4     // Catch:{ NoSuchFieldError -> 0x1540 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1540 }
            r1 = 431(0x1af, float:6.04E-43)     // Catch:{ NoSuchFieldError -> 0x1540 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1540 }
        L_0x1540:
            o.ox r0 = p004o.C0626ox.HITLINE5     // Catch:{ NoSuchFieldError -> 0x154b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x154b }
            r1 = 432(0x1b0, float:6.05E-43)     // Catch:{ NoSuchFieldError -> 0x154b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x154b }
        L_0x154b:
            o.ox r0 = p004o.C0626ox.HITLINE6     // Catch:{ NoSuchFieldError -> 0x1556 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1556 }
            r1 = 433(0x1b1, float:6.07E-43)     // Catch:{ NoSuchFieldError -> 0x1556 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1556 }
        L_0x1556:
            o.ox r0 = p004o.C0626ox.HITLINE7     // Catch:{ NoSuchFieldError -> 0x1561 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1561 }
            r1 = 436(0x1b4, float:6.11E-43)     // Catch:{ NoSuchFieldError -> 0x1561 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1561 }
        L_0x1561:
            o.ox r0 = p004o.C0626ox.HITLINE8     // Catch:{ NoSuchFieldError -> 0x156c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x156c }
            r1 = 889(0x379, float:1.246E-42)     // Catch:{ NoSuchFieldError -> 0x156c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x156c }
        L_0x156c:
            o.ox r0 = p004o.C0626ox.HITTEXTURE     // Catch:{ NoSuchFieldError -> 0x1577 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1577 }
            r1 = 556(0x22c, float:7.79E-43)     // Catch:{ NoSuchFieldError -> 0x1577 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1577 }
        L_0x1577:
            o.ox r0 = p004o.C0626ox.HOLYCROSS     // Catch:{ NoSuchFieldError -> 0x1582 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1582 }
            r1 = 247(0xf7, float:3.46E-43)     // Catch:{ NoSuchFieldError -> 0x1582 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1582 }
        L_0x1582:
            o.ox r0 = p004o.C0626ox.HOLYHIT     // Catch:{ NoSuchFieldError -> 0x158d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x158d }
            r1 = 154(0x9a, float:2.16E-43)     // Catch:{ NoSuchFieldError -> 0x158d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x158d }
        L_0x158d:
            o.ox r0 = p004o.C0626ox.HOMUNCASTING     // Catch:{ NoSuchFieldError -> 0x1598 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1598 }
            r1 = 566(0x236, float:7.93E-43)     // Catch:{ NoSuchFieldError -> 0x1598 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1598 }
        L_0x1598:
            o.ox r0 = p004o.C0626ox.HO_UP     // Catch:{ NoSuchFieldError -> 0x15a3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x15a3 }
            r1 = 570(0x23a, float:7.99E-43)     // Catch:{ NoSuchFieldError -> 0x15a3 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x15a3 }
        L_0x15a3:
            o.ox r0 = p004o.C0626ox.HPTIME     // Catch:{ NoSuchFieldError -> 0x15ae }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x15ae }
            r1 = 333(0x14d, float:4.67E-43)     // Catch:{ NoSuchFieldError -> 0x15ae }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x15ae }
        L_0x15ae:
            o.ox r0 = p004o.C0626ox.HYOUSENSOU     // Catch:{ NoSuchFieldError -> 0x15b9 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x15b9 }
            r1 = 621(0x26d, float:8.7E-43)     // Catch:{ NoSuchFieldError -> 0x15b9 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x15b9 }
        L_0x15b9:
            o.ox r0 = p004o.C0626ox.HYOUSYOURAKU     // Catch:{ NoSuchFieldError -> 0x15c4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x15c4 }
            r1 = 638(0x27e, float:8.94E-43)     // Catch:{ NoSuchFieldError -> 0x15c4 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x15c4 }
        L_0x15c4:
            o.ox r0 = p004o.C0626ox.H_MINE     // Catch:{ NoSuchFieldError -> 0x15cf }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x15cf }
            r1 = 1059(0x423, float:1.484E-42)     // Catch:{ NoSuchFieldError -> 0x15cf }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x15cf }
        L_0x15cf:
            o.ox r0 = p004o.C0626ox.ICEARROW     // Catch:{ NoSuchFieldError -> 0x15da }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x15da }
            r1 = 28     // Catch:{ NoSuchFieldError -> 0x15da }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x15da }
        L_0x15da:
            o.ox r0 = p004o.C0626ox.ICECRASH     // Catch:{ NoSuchFieldError -> 0x15e5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x15e5 }
            r1 = 137(0x89, float:1.92E-43)     // Catch:{ NoSuchFieldError -> 0x15e5 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x15e5 }
        L_0x15e5:
            o.ox r0 = p004o.C0626ox.ICEWALL     // Catch:{ NoSuchFieldError -> 0x15f0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x15f0 }
            r1 = 76     // Catch:{ NoSuchFieldError -> 0x15f0 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x15f0 }
        L_0x15f0:
            o.ox r0 = p004o.C0626ox.IGN_STR     // Catch:{ NoSuchFieldError -> 0x15fb }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x15fb }
            r1 = 724(0x2d4, float:1.015E-42)     // Catch:{ NoSuchFieldError -> 0x15fb }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x15fb }
        L_0x15fb:
            o.ox r0 = p004o.C0626ox.IMPOSITIO     // Catch:{ NoSuchFieldError -> 0x1606 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1606 }
            r1 = 86     // Catch:{ NoSuchFieldError -> 0x1606 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1606 }
        L_0x1606:
            o.ox r0 = p004o.C0626ox.INCAGIDEX     // Catch:{ NoSuchFieldError -> 0x1611 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1611 }
            r1 = 45     // Catch:{ NoSuchFieldError -> 0x1611 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1611 }
        L_0x1611:
            o.ox r0 = p004o.C0626ox.INCAGILITY     // Catch:{ NoSuchFieldError -> 0x161c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x161c }
            r1 = 39     // Catch:{ NoSuchFieldError -> 0x161c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x161c }
        L_0x161c:
            o.ox r0 = p004o.C0626ox.INFRAREDSCAN     // Catch:{ NoSuchFieldError -> 0x1627 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1627 }
            r1 = 796(0x31c, float:1.115E-42)     // Catch:{ NoSuchFieldError -> 0x1627 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1627 }
        L_0x1627:
            o.ox r0 = p004o.C0626ox.INTIMIDATE     // Catch:{ NoSuchFieldError -> 0x1632 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1632 }
            r1 = 229(0xe5, float:3.21E-43)     // Catch:{ NoSuchFieldError -> 0x1632 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1632 }
        L_0x1632:
            o.ox r0 = p004o.C0626ox.INTIMIDATE2     // Catch:{ NoSuchFieldError -> 0x163d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x163d }
            r1 = 800(0x320, float:1.121E-42)     // Catch:{ NoSuchFieldError -> 0x163d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x163d }
        L_0x163d:
            o.ox r0 = p004o.C0626ox.INTIMIDATE3     // Catch:{ NoSuchFieldError -> 0x1648 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1648 }
            r1 = 809(0x329, float:1.134E-42)     // Catch:{ NoSuchFieldError -> 0x1648 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1648 }
        L_0x1648:
            o.ox r0 = p004o.C0626ox.INTIMIDATE4     // Catch:{ NoSuchFieldError -> 0x1653 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1653 }
            r1 = 812(0x32c, float:1.138E-42)     // Catch:{ NoSuchFieldError -> 0x1653 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1653 }
        L_0x1653:
            o.ox r0 = p004o.C0626ox.INVENOM     // Catch:{ NoSuchFieldError -> 0x165e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x165e }
            r1 = 67     // Catch:{ NoSuchFieldError -> 0x165e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x165e }
        L_0x165e:
            o.ox r0 = p004o.C0626ox.INVINCIBLEOFF2     // Catch:{ NoSuchFieldError -> 0x1669 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1669 }
            r1 = 1025(0x401, float:1.436E-42)     // Catch:{ NoSuchFieldError -> 0x1669 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1669 }
        L_0x1669:
            o.ox r0 = p004o.C0626ox.ISSEN     // Catch:{ NoSuchFieldError -> 0x1674 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1674 }
            r1 = 635(0x27b, float:8.9E-43)     // Catch:{ NoSuchFieldError -> 0x1674 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1674 }
        L_0x1674:
            o.ox r0 = p004o.C0626ox.ITEM315     // Catch:{ NoSuchFieldError -> 0x167f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x167f }
            r1 = 706(0x2c2, float:9.9E-43)     // Catch:{ NoSuchFieldError -> 0x167f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x167f }
        L_0x167f:
            o.ox r0 = p004o.C0626ox.ITEM316     // Catch:{ NoSuchFieldError -> 0x168a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x168a }
            r1 = 707(0x2c3, float:9.91E-43)     // Catch:{ NoSuchFieldError -> 0x168a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x168a }
        L_0x168a:
            o.ox r0 = p004o.C0626ox.ITEM317     // Catch:{ NoSuchFieldError -> 0x1695 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1695 }
            r1 = 708(0x2c4, float:9.92E-43)     // Catch:{ NoSuchFieldError -> 0x1695 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1695 }
        L_0x1695:
            o.ox r0 = p004o.C0626ox.ITEM318     // Catch:{ NoSuchFieldError -> 0x16a0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x16a0 }
            r1 = 709(0x2c5, float:9.94E-43)     // Catch:{ NoSuchFieldError -> 0x16a0 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x16a0 }
        L_0x16a0:
            o.ox r0 = p004o.C0626ox.ITEMFAST     // Catch:{ NoSuchFieldError -> 0x16ab }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x16ab }
            r1 = 521(0x209, float:7.3E-43)     // Catch:{ NoSuchFieldError -> 0x16ab }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x16ab }
        L_0x16ab:
            o.ox r0 = p004o.C0626ox.ITEMPOKJUK     // Catch:{ NoSuchFieldError -> 0x16b6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x16b6 }
            r1 = 510(0x1fe, float:7.15E-43)     // Catch:{ NoSuchFieldError -> 0x16b6 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x16b6 }
        L_0x16b6:
            o.ox r0 = p004o.C0626ox.ITEM_CLOUD     // Catch:{ NoSuchFieldError -> 0x16c1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x16c1 }
            r1 = 579(0x243, float:8.11E-43)     // Catch:{ NoSuchFieldError -> 0x16c1 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x16c1 }
        L_0x16c1:
            o.ox r0 = p004o.C0626ox.ITEM_CURSE     // Catch:{ NoSuchFieldError -> 0x16cc }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x16cc }
            r1 = 580(0x244, float:8.13E-43)     // Catch:{ NoSuchFieldError -> 0x16cc }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x16cc }
        L_0x16cc:
            o.ox r0 = p004o.C0626ox.ITEM_LIGHT     // Catch:{ NoSuchFieldError -> 0x16d7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x16d7 }
            r1 = 583(0x247, float:8.17E-43)     // Catch:{ NoSuchFieldError -> 0x16d7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x16d7 }
        L_0x16d7:
            o.ox r0 = p004o.C0626ox.ITEM_RAIN     // Catch:{ NoSuchFieldError -> 0x16e2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x16e2 }
            r1 = 582(0x246, float:8.16E-43)     // Catch:{ NoSuchFieldError -> 0x16e2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x16e2 }
        L_0x16e2:
            o.ox r0 = p004o.C0626ox.ITEM_THUNDER     // Catch:{ NoSuchFieldError -> 0x16ed }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x16ed }
            r1 = 578(0x242, float:8.1E-43)     // Catch:{ NoSuchFieldError -> 0x16ed }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x16ed }
        L_0x16ed:
            o.ox r0 = p004o.C0626ox.ITEM_ZZZ     // Catch:{ NoSuchFieldError -> 0x16f8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x16f8 }
            r1 = 581(0x245, float:8.14E-43)     // Catch:{ NoSuchFieldError -> 0x16f8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x16f8 }
        L_0x16f8:
            o.ox r0 = p004o.C0626ox.JOBCHANGE     // Catch:{ NoSuchFieldError -> 0x1703 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1703 }
            r1 = 158(0x9e, float:2.21E-43)     // Catch:{ NoSuchFieldError -> 0x1703 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1703 }
        L_0x1703:
            o.ox r0 = p004o.C0626ox.JOBLVUP     // Catch:{ NoSuchFieldError -> 0x170e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x170e }
            r1 = 160(0xa0, float:2.24E-43)     // Catch:{ NoSuchFieldError -> 0x170e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x170e }
        L_0x170e:
            o.ox r0 = p004o.C0626ox.JOBLVUP50     // Catch:{ NoSuchFieldError -> 0x1719 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1719 }
            r1 = 339(0x153, float:4.75E-43)     // Catch:{ NoSuchFieldError -> 0x1719 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1719 }
        L_0x1719:
            o.ox r0 = p004o.C0626ox.JOBLVUP50_2     // Catch:{ NoSuchFieldError -> 0x1724 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1724 }
            r1 = 836(0x344, float:1.171E-42)     // Catch:{ NoSuchFieldError -> 0x1724 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1724 }
        L_0x1724:
            o.ox r0 = p004o.C0626ox.JUMPBODY     // Catch:{ NoSuchFieldError -> 0x172f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x172f }
            r1 = 447(0x1bf, float:6.26E-43)     // Catch:{ NoSuchFieldError -> 0x172f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x172f }
        L_0x172f:
            o.ox r0 = p004o.C0626ox.JUMPKICK     // Catch:{ NoSuchFieldError -> 0x173a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x173a }
            r1 = 459(0x1cb, float:6.43E-43)     // Catch:{ NoSuchFieldError -> 0x173a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x173a }
        L_0x173a:
            o.ox r0 = p004o.C0626ox.KAAHI     // Catch:{ NoSuchFieldError -> 0x1745 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1745 }
            r1 = 593(0x251, float:8.31E-43)     // Catch:{ NoSuchFieldError -> 0x1745 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1745 }
        L_0x1745:
            o.ox r0 = p004o.C0626ox.KAEN     // Catch:{ NoSuchFieldError -> 0x1750 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1750 }
            r1 = 636(0x27c, float:8.91E-43)     // Catch:{ NoSuchFieldError -> 0x1750 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1750 }
        L_0x1750:
            o.ox r0 = p004o.C0626ox.KAGEMUSYA     // Catch:{ NoSuchFieldError -> 0x175b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x175b }
            r1 = 1006(0x3ee, float:1.41E-42)     // Catch:{ NoSuchFieldError -> 0x175b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x175b }
        L_0x175b:
            o.ox r0 = p004o.C0626ox.KAIHOU     // Catch:{ NoSuchFieldError -> 0x1766 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1766 }
            r1 = 991(0x3df, float:1.389E-42)     // Catch:{ NoSuchFieldError -> 0x1766 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1766 }
        L_0x1766:
            o.ox r0 = p004o.C0626ox.KAIHOU1     // Catch:{ NoSuchFieldError -> 0x1771 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1771 }
            r1 = 1010(0x3f2, float:1.415E-42)     // Catch:{ NoSuchFieldError -> 0x1771 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1771 }
        L_0x1771:
            o.ox r0 = p004o.C0626ox.KAIZEL     // Catch:{ NoSuchFieldError -> 0x177c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x177c }
            r1 = 592(0x250, float:8.3E-43)     // Catch:{ NoSuchFieldError -> 0x177c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x177c }
        L_0x177c:
            o.ox r0 = p004o.C0626ox.KASUMIKIRI     // Catch:{ NoSuchFieldError -> 0x1787 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1787 }
            r1 = 634(0x27a, float:8.88E-43)     // Catch:{ NoSuchFieldError -> 0x1787 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1787 }
        L_0x1787:
            o.ox r0 = p004o.C0626ox.KEEPING     // Catch:{ NoSuchFieldError -> 0x1792 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1792 }
            r1 = 216(0xd8, float:3.03E-43)     // Catch:{ NoSuchFieldError -> 0x1792 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1792 }
        L_0x1792:
            o.ox r0 = p004o.C0626ox.KG_KAGEHUMI     // Catch:{ NoSuchFieldError -> 0x179d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x179d }
            r1 = 993(0x3e1, float:1.391E-42)     // Catch:{ NoSuchFieldError -> 0x179d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x179d }
        L_0x179d:
            o.ox r0 = p004o.C0626ox.KG_KYOMU     // Catch:{ NoSuchFieldError -> 0x17a8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x17a8 }
            r1 = 1003(0x3eb, float:1.406E-42)     // Catch:{ NoSuchFieldError -> 0x17a8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x17a8 }
        L_0x17a8:
            o.ox r0 = p004o.C0626ox.KICKEDBODY     // Catch:{ NoSuchFieldError -> 0x17b3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x17b3 }
            r1 = 417(0x1a1, float:5.84E-43)     // Catch:{ NoSuchFieldError -> 0x17b3 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x17b3 }
        L_0x17b3:
            o.ox r0 = p004o.C0626ox.KIRIKAGE     // Catch:{ NoSuchFieldError -> 0x17be }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x17be }
            r1 = 632(0x278, float:8.86E-43)     // Catch:{ NoSuchFieldError -> 0x17be }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x17be }
        L_0x17be:
            o.ox r0 = p004o.C0626ox.KOUENKA     // Catch:{ NoSuchFieldError -> 0x17c9 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x17c9 }
            r1 = 620(0x26c, float:8.69E-43)     // Catch:{ NoSuchFieldError -> 0x17c9 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x17c9 }
        L_0x17c9:
            o.ox r0 = p004o.C0626ox.KO_HUUMARANKA     // Catch:{ NoSuchFieldError -> 0x17d4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x17d4 }
            r1 = 1004(0x3ec, float:1.407E-42)     // Catch:{ NoSuchFieldError -> 0x17d4 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x17d4 }
        L_0x17d4:
            o.ox r0 = p004o.C0626ox.KO_IZAYOI     // Catch:{ NoSuchFieldError -> 0x17df }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x17df }
            r1 = 1001(0x3e9, float:1.403E-42)     // Catch:{ NoSuchFieldError -> 0x17df }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x17df }
        L_0x17df:
            o.ox r0 = p004o.C0626ox.KO_JYUMONJIKIRI     // Catch:{ NoSuchFieldError -> 0x17ea }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x17ea }
            r1 = 998(0x3e6, float:1.398E-42)     // Catch:{ NoSuchFieldError -> 0x17ea }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x17ea }
        L_0x17ea:
            o.ox r0 = p004o.C0626ox.KO_MAKIBISHI     // Catch:{ NoSuchFieldError -> 0x17f5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x17f5 }
            r1 = 1009(0x3f1, float:1.414E-42)     // Catch:{ NoSuchFieldError -> 0x17f5 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x17f5 }
        L_0x17f5:
            o.ox r0 = p004o.C0626ox.KO_SETSUDAN     // Catch:{ NoSuchFieldError -> 0x1800 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1800 }
            r1 = 999(0x3e7, float:1.4E-42)     // Catch:{ NoSuchFieldError -> 0x1800 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1800 }
        L_0x1800:
            o.ox r0 = p004o.C0626ox.KO_ZENKAI_FIRE     // Catch:{ NoSuchFieldError -> 0x180b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x180b }
            r1 = 996(0x3e4, float:1.396E-42)     // Catch:{ NoSuchFieldError -> 0x180b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x180b }
        L_0x180b:
            o.ox r0 = p004o.C0626ox.KO_ZENKAI_LAND     // Catch:{ NoSuchFieldError -> 0x1816 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1816 }
            r1 = 995(0x3e3, float:1.394E-42)     // Catch:{ NoSuchFieldError -> 0x1816 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1816 }
        L_0x1816:
            o.ox r0 = p004o.C0626ox.KO_ZENKAI_WATER     // Catch:{ NoSuchFieldError -> 0x1821 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1821 }
            r1 = 994(0x3e2, float:1.393E-42)     // Catch:{ NoSuchFieldError -> 0x1821 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1821 }
        L_0x1821:
            o.ox r0 = p004o.C0626ox.KO_ZENKAI_WIND     // Catch:{ NoSuchFieldError -> 0x182c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x182c }
            r1 = 997(0x3e5, float:1.397E-42)     // Catch:{ NoSuchFieldError -> 0x182c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x182c }
        L_0x182c:
            o.ox r0 = p004o.C0626ox.KYRIE     // Catch:{ NoSuchFieldError -> 0x1837 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1837 }
            r1 = 114(0x72, float:1.6E-43)     // Catch:{ NoSuchFieldError -> 0x1837 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1837 }
        L_0x1837:
            o.ox r0 = p004o.C0626ox.LAMADAN     // Catch:{ NoSuchFieldError -> 0x1842 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1842 }
            r1 = 494(0x1ee, float:6.92E-43)     // Catch:{ NoSuchFieldError -> 0x1842 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1842 }
        L_0x1842:
            o.ox r0 = p004o.C0626ox.LANDBODY     // Catch:{ NoSuchFieldError -> 0x184d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x184d }
            r1 = 448(0x1c0, float:6.28E-43)     // Catch:{ NoSuchFieldError -> 0x184d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x184d }
        L_0x184d:
            o.ox r0 = p004o.C0626ox.LANDPROTECTOR     // Catch:{ NoSuchFieldError -> 0x1858 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1858 }
            r1 = 240(0xf0, float:3.36E-43)     // Catch:{ NoSuchFieldError -> 0x1858 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1858 }
        L_0x1858:
            o.ox r0 = p004o.C0626ox.LAUAGNUS_STR     // Catch:{ NoSuchFieldError -> 0x1863 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1863 }
            r1 = 750(0x2ee, float:1.051E-42)     // Catch:{ NoSuchFieldError -> 0x1863 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1863 }
        L_0x1863:
            o.ox r0 = p004o.C0626ox.LAULAMUS_STR     // Catch:{ NoSuchFieldError -> 0x186e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x186e }
            r1 = 749(0x2ed, float:1.05E-42)     // Catch:{ NoSuchFieldError -> 0x186e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x186e }
        L_0x186e:
            o.ox r0 = p004o.C0626ox.LAVA_SLIDE     // Catch:{ NoSuchFieldError -> 0x1879 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1879 }
            r1 = 966(0x3c6, float:1.354E-42)     // Catch:{ NoSuchFieldError -> 0x1879 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1879 }
        L_0x1879:
            o.ox r0 = p004o.C0626ox.LEVEL150     // Catch:{ NoSuchFieldError -> 0x1884 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1884 }
            r1 = 980(0x3d4, float:1.373E-42)     // Catch:{ NoSuchFieldError -> 0x1884 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1884 }
        L_0x1884:
            o.ox r0 = p004o.C0626ox.LEVEL150_SUB     // Catch:{ NoSuchFieldError -> 0x188f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x188f }
            r1 = 981(0x3d5, float:1.375E-42)     // Catch:{ NoSuchFieldError -> 0x188f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x188f }
        L_0x188f:
            o.ox r0 = p004o.C0626ox.LEVEL99     // Catch:{ NoSuchFieldError -> 0x189a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x189a }
            r1 = 202(0xca, float:2.83E-43)     // Catch:{ NoSuchFieldError -> 0x189a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x189a }
        L_0x189a:
            o.ox r0 = p004o.C0626ox.LEVEL99_150     // Catch:{ NoSuchFieldError -> 0x18a5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x18a5 }
            r1 = 883(0x373, float:1.237E-42)     // Catch:{ NoSuchFieldError -> 0x18a5 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x18a5 }
        L_0x18a5:
            o.ox r0 = p004o.C0626ox.LEVEL99_2     // Catch:{ NoSuchFieldError -> 0x18b0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x18b0 }
            r1 = 203(0xcb, float:2.84E-43)     // Catch:{ NoSuchFieldError -> 0x18b0 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x18b0 }
        L_0x18b0:
            o.ox r0 = p004o.C0626ox.LEVEL99_3     // Catch:{ NoSuchFieldError -> 0x18bb }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x18bb }
            r1 = 204(0xcc, float:2.86E-43)     // Catch:{ NoSuchFieldError -> 0x18bb }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x18bb }
        L_0x18bb:
            o.ox r0 = p004o.C0626ox.LEVEL99_4     // Catch:{ NoSuchFieldError -> 0x18c6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x18c6 }
            r1 = 364(0x16c, float:5.1E-43)     // Catch:{ NoSuchFieldError -> 0x18c6 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x18c6 }
        L_0x18c6:
            o.ox r0 = p004o.C0626ox.LEVEL99_5     // Catch:{ NoSuchFieldError -> 0x18d1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x18d1 }
            r1 = 399(0x18f, float:5.59E-43)     // Catch:{ NoSuchFieldError -> 0x18d1 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x18d1 }
        L_0x18d1:
            o.ox r0 = p004o.C0626ox.LEVEL99_6     // Catch:{ NoSuchFieldError -> 0x18dc }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x18dc }
            r1 = 400(0x190, float:5.6E-43)     // Catch:{ NoSuchFieldError -> 0x18dc }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x18dc }
        L_0x18dc:
            o.ox r0 = p004o.C0626ox.LEVEL99_ORB1     // Catch:{ NoSuchFieldError -> 0x18e7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x18e7 }
            r1 = 978(0x3d2, float:1.37E-42)     // Catch:{ NoSuchFieldError -> 0x18e7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x18e7 }
        L_0x18e7:
            o.ox r0 = p004o.C0626ox.LEVEL99_ORB2     // Catch:{ NoSuchFieldError -> 0x18f2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x18f2 }
            r1 = 979(0x3d3, float:1.372E-42)     // Catch:{ NoSuchFieldError -> 0x18f2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x18f2 }
        L_0x18f2:
            o.ox r0 = p004o.C0626ox.LEXAETERNA     // Catch:{ NoSuchFieldError -> 0x18fd }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x18fd }
            r1 = 87     // Catch:{ NoSuchFieldError -> 0x18fd }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x18fd }
        L_0x18fd:
            o.ox r0 = p004o.C0626ox.LEXDIVINA     // Catch:{ NoSuchFieldError -> 0x1908 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1908 }
            r1 = 89     // Catch:{ NoSuchFieldError -> 0x1908 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1908 }
        L_0x1908:
            o.ox r0 = p004o.C0626ox.LG_KINGS_GRACE     // Catch:{ NoSuchFieldError -> 0x1913 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1913 }
            r1 = 1037(0x40d, float:1.453E-42)     // Catch:{ NoSuchFieldError -> 0x1913 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1913 }
        L_0x1913:
            o.ox r0 = p004o.C0626ox.LIGHTBLADE     // Catch:{ NoSuchFieldError -> 0x191e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x191e }
            r1 = 384(0x180, float:5.38E-43)     // Catch:{ NoSuchFieldError -> 0x191e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x191e }
        L_0x191e:
            o.ox r0 = p004o.C0626ox.LIGHTBOLT     // Catch:{ NoSuchFieldError -> 0x1929 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1929 }
            r1 = 31     // Catch:{ NoSuchFieldError -> 0x1929 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1929 }
        L_0x1929:
            o.ox r0 = p004o.C0626ox.LIGHTNINGLOADER     // Catch:{ NoSuchFieldError -> 0x1934 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1934 }
            r1 = 259(0x103, float:3.63E-43)     // Catch:{ NoSuchFieldError -> 0x1934 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1934 }
        L_0x1934:
            o.ox r0 = p004o.C0626ox.LIGHTNING_S     // Catch:{ NoSuchFieldError -> 0x193f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x193f }
            r1 = 640(0x280, float:8.97E-43)     // Catch:{ NoSuchFieldError -> 0x193f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x193f }
        L_0x193f:
            o.ox r0 = p004o.C0626ox.LIGHTSPHERE     // Catch:{ NoSuchFieldError -> 0x194a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x194a }
            r1 = 350(0x15e, float:4.9E-43)     // Catch:{ NoSuchFieldError -> 0x194a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x194a }
        L_0x194a:
            o.ox r0 = p004o.C0626ox.LIGHTSPHERE2     // Catch:{ NoSuchFieldError -> 0x1955 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1955 }
            r1 = 383(0x17f, float:5.37E-43)     // Catch:{ NoSuchFieldError -> 0x1955 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1955 }
        L_0x1955:
            o.ox r0 = p004o.C0626ox.LINELINK     // Catch:{ NoSuchFieldError -> 0x1960 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1960 }
            r1 = 234(0xea, float:3.28E-43)     // Catch:{ NoSuchFieldError -> 0x1960 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1960 }
        L_0x1960:
            o.ox r0 = p004o.C0626ox.LINELINK2     // Catch:{ NoSuchFieldError -> 0x196b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x196b }
            r1 = 386(0x182, float:5.41E-43)     // Catch:{ NoSuchFieldError -> 0x196b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x196b }
        L_0x196b:
            o.ox r0 = p004o.C0626ox.LINELINK3     // Catch:{ NoSuchFieldError -> 0x1976 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1976 }
            r1 = 397(0x18d, float:5.56E-43)     // Catch:{ NoSuchFieldError -> 0x1976 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1976 }
        L_0x1976:
            o.ox r0 = p004o.C0626ox.LINELINK4     // Catch:{ NoSuchFieldError -> 0x1981 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1981 }
            r1 = 821(0x335, float:1.15E-42)     // Catch:{ NoSuchFieldError -> 0x1981 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1981 }
        L_0x1981:
            o.ox r0 = p004o.C0626ox.LINKLIGHT     // Catch:{ NoSuchFieldError -> 0x198c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x198c }
            r1 = 387(0x183, float:5.42E-43)     // Catch:{ NoSuchFieldError -> 0x198c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x198c }
        L_0x198c:
            o.ox r0 = p004o.C0626ox.LINKPARTICLE     // Catch:{ NoSuchFieldError -> 0x1997 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1997 }
            r1 = 851(0x353, float:1.193E-42)     // Catch:{ NoSuchFieldError -> 0x1997 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1997 }
        L_0x1997:
            o.ox r0 = p004o.C0626ox.LINKPARTICLE2     // Catch:{ NoSuchFieldError -> 0x19a2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x19a2 }
            r1 = 933(0x3a5, float:1.307E-42)     // Catch:{ NoSuchFieldError -> 0x19a2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x19a2 }
        L_0x19a2:
            o.ox r0 = p004o.C0626ox.LKCONCENTRATION     // Catch:{ NoSuchFieldError -> 0x19ad }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x19ad }
            r1 = 371(0x173, float:5.2E-43)     // Catch:{ NoSuchFieldError -> 0x19ad }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x19ad }
        L_0x19ad:
            o.ox r0 = p004o.C0626ox.LOCKON     // Catch:{ NoSuchFieldError -> 0x19b8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x19b8 }
            r1 = 62     // Catch:{ NoSuchFieldError -> 0x19b8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x19b8 }
        L_0x19b8:
            o.ox r0 = p004o.C0626ox.LORD     // Catch:{ NoSuchFieldError -> 0x19c3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x19c3 }
            r1 = 92     // Catch:{ NoSuchFieldError -> 0x19c3 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x19c3 }
        L_0x19c3:
            o.ox r0 = p004o.C0626ox.LOUD     // Catch:{ NoSuchFieldError -> 0x19ce }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x19ce }
            r1 = 313(0x139, float:4.39E-43)     // Catch:{ NoSuchFieldError -> 0x19ce }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x19ce }
        L_0x19ce:
            o.ox r0 = p004o.C0626ox.LVUP     // Catch:{ NoSuchFieldError -> 0x19d9 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x19d9 }
            r1 = 159(0x9f, float:2.23E-43)     // Catch:{ NoSuchFieldError -> 0x19d9 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x19d9 }
        L_0x19d9:
            o.ox r0 = p004o.C0626ox.M01     // Catch:{ NoSuchFieldError -> 0x19e4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x19e4 }
            r1 = 585(0x249, float:8.2E-43)     // Catch:{ NoSuchFieldError -> 0x19e4 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x19e4 }
        L_0x19e4:
            o.ox r0 = p004o.C0626ox.M02     // Catch:{ NoSuchFieldError -> 0x19ef }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x19ef }
            r1 = 586(0x24a, float:8.21E-43)     // Catch:{ NoSuchFieldError -> 0x19ef }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x19ef }
        L_0x19ef:
            o.ox r0 = p004o.C0626ox.M03     // Catch:{ NoSuchFieldError -> 0x19fa }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x19fa }
            r1 = 587(0x24b, float:8.23E-43)     // Catch:{ NoSuchFieldError -> 0x19fa }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x19fa }
        L_0x19fa:
            o.ox r0 = p004o.C0626ox.M04     // Catch:{ NoSuchFieldError -> 0x1a05 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1a05 }
            r1 = 588(0x24c, float:8.24E-43)     // Catch:{ NoSuchFieldError -> 0x1a05 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1a05 }
        L_0x1a05:
            o.ox r0 = p004o.C0626ox.M05     // Catch:{ NoSuchFieldError -> 0x1a10 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1a10 }
            r1 = 589(0x24d, float:8.25E-43)     // Catch:{ NoSuchFieldError -> 0x1a10 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1a10 }
        L_0x1a10:
            o.ox r0 = p004o.C0626ox.M06     // Catch:{ NoSuchFieldError -> 0x1a1b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1a1b }
            r1 = 590(0x24e, float:8.27E-43)     // Catch:{ NoSuchFieldError -> 0x1a1b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1a1b }
        L_0x1a1b:
            o.ox r0 = p004o.C0626ox.M07     // Catch:{ NoSuchFieldError -> 0x1a26 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1a26 }
            r1 = 591(0x24f, float:8.28E-43)     // Catch:{ NoSuchFieldError -> 0x1a26 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1a26 }
        L_0x1a26:
            o.ox r0 = p004o.C0626ox.MACRO     // Catch:{ NoSuchFieldError -> 0x1a31 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1a31 }
            r1 = 970(0x3ca, float:1.359E-42)     // Catch:{ NoSuchFieldError -> 0x1a31 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1a31 }
        L_0x1a31:
            o.ox r0 = p004o.C0626ox.MADNESS_BLUE     // Catch:{ NoSuchFieldError -> 0x1a3c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1a3c }
            r1 = 627(0x273, float:8.79E-43)     // Catch:{ NoSuchFieldError -> 0x1a3c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1a3c }
        L_0x1a3c:
            o.ox r0 = p004o.C0626ox.MADNESS_RED     // Catch:{ NoSuchFieldError -> 0x1a47 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1a47 }
            r1 = 628(0x274, float:8.8E-43)     // Catch:{ NoSuchFieldError -> 0x1a47 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1a47 }
        L_0x1a47:
            o.ox r0 = p004o.C0626ox.MAGENTA_TRAP     // Catch:{ NoSuchFieldError -> 0x1a52 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1a52 }
            r1 = 741(0x2e5, float:1.038E-42)     // Catch:{ NoSuchFieldError -> 0x1a52 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1a52 }
        L_0x1a52:
            o.ox r0 = p004o.C0626ox.MAGICALATTHIT     // Catch:{ NoSuchFieldError -> 0x1a5d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1a5d }
            r1 = 184(0xb8, float:2.58E-43)     // Catch:{ NoSuchFieldError -> 0x1a5d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1a5d }
        L_0x1a5d:
            o.ox r0 = p004o.C0626ox.MAGICALBULLET     // Catch:{ NoSuchFieldError -> 0x1a68 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1a68 }
            r1 = 646(0x286, float:9.05E-43)     // Catch:{ NoSuchFieldError -> 0x1a68 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1a68 }
        L_0x1a68:
            o.ox r0 = p004o.C0626ox.MAGICCRASHER     // Catch:{ NoSuchFieldError -> 0x1a73 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1a73 }
            r1 = 382(0x17e, float:5.35E-43)     // Catch:{ NoSuchFieldError -> 0x1a73 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1a73 }
        L_0x1a73:
            o.ox r0 = p004o.C0626ox.MAGICCRASHER2     // Catch:{ NoSuchFieldError -> 0x1a7e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1a7e }
            r1 = 405(0x195, float:5.68E-43)     // Catch:{ NoSuchFieldError -> 0x1a7e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1a7e }
        L_0x1a7e:
            o.ox r0 = p004o.C0626ox.MAGICROD     // Catch:{ NoSuchFieldError -> 0x1a89 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1a89 }
            r1 = 246(0xf6, float:3.45E-43)     // Catch:{ NoSuchFieldError -> 0x1a89 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1a89 }
        L_0x1a89:
            o.ox r0 = p004o.C0626ox.MAGMA_FLOW     // Catch:{ NoSuchFieldError -> 0x1a94 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1a94 }
            r1 = 964(0x3c4, float:1.351E-42)     // Catch:{ NoSuchFieldError -> 0x1a94 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1a94 }
        L_0x1a94:
            o.ox r0 = p004o.C0626ox.MAGNIFICAT     // Catch:{ NoSuchFieldError -> 0x1a9f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1a9f }
            r1 = 78     // Catch:{ NoSuchFieldError -> 0x1a9f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1a9f }
        L_0x1a9f:
            o.ox r0 = p004o.C0626ox.MAGNUM2     // Catch:{ NoSuchFieldError -> 0x1aaa }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1aaa }
            r1 = 341(0x155, float:4.78E-43)     // Catch:{ NoSuchFieldError -> 0x1aaa }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1aaa }
        L_0x1aaa:
            o.ox r0 = p004o.C0626ox.MAGNUMBREAK     // Catch:{ NoSuchFieldError -> 0x1ab5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1ab5 }
            r1 = 19     // Catch:{ NoSuchFieldError -> 0x1ab5 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1ab5 }
        L_0x1ab5:
            o.ox r0 = p004o.C0626ox.MAGNUS     // Catch:{ NoSuchFieldError -> 0x1ac0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1ac0 }
            r1 = 115(0x73, float:1.61E-43)     // Catch:{ NoSuchFieldError -> 0x1ac0 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1ac0 }
        L_0x1ac0:
            o.ox r0 = p004o.C0626ox.MAIZE_TRAP     // Catch:{ NoSuchFieldError -> 0x1acb }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1acb }
            r1 = 743(0x2e7, float:1.041E-42)     // Catch:{ NoSuchFieldError -> 0x1acb }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1acb }
        L_0x1acb:
            o.ox r0 = p004o.C0626ox.MAKEBLUR     // Catch:{ NoSuchFieldError -> 0x1ad6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1ad6 }
            r1 = 168(0xa8, float:2.35E-43)     // Catch:{ NoSuchFieldError -> 0x1ad6 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1ad6 }
        L_0x1ad6:
            o.ox r0 = p004o.C0626ox.MAKEFEINT     // Catch:{ NoSuchFieldError -> 0x1ae1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1ae1 }
            r1 = 826(0x33a, float:1.157E-42)     // Catch:{ NoSuchFieldError -> 0x1ae1 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1ae1 }
        L_0x1ae1:
            o.ox r0 = p004o.C0626ox.MAKEHALLU     // Catch:{ NoSuchFieldError -> 0x1aec }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1aec }
            r1 = 794(0x31a, float:1.113E-42)     // Catch:{ NoSuchFieldError -> 0x1aec }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1aec }
        L_0x1aec:
            o.ox r0 = p004o.C0626ox.MAKEHALLU2     // Catch:{ NoSuchFieldError -> 0x1af7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1af7 }
            r1 = 927(0x39f, float:1.299E-42)     // Catch:{ NoSuchFieldError -> 0x1af7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1af7 }
        L_0x1af7:
            o.ox r0 = p004o.C0626ox.MANHOLE     // Catch:{ NoSuchFieldError -> 0x1b02 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1b02 }
            r1 = 825(0x339, float:1.156E-42)     // Catch:{ NoSuchFieldError -> 0x1b02 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1b02 }
        L_0x1b02:
            o.ox r0 = p004o.C0626ox.MAPAE     // Catch:{ NoSuchFieldError -> 0x1b0d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1b0d }
            r1 = 509(0x1fd, float:7.13E-43)     // Catch:{ NoSuchFieldError -> 0x1b0d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1b0d }
        L_0x1b0d:
            o.ox r0 = p004o.C0626ox.MAPLE     // Catch:{ NoSuchFieldError -> 0x1b18 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1b18 }
            r1 = 335(0x14f, float:4.7E-43)     // Catch:{ NoSuchFieldError -> 0x1b18 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1b18 }
        L_0x1b18:
            o.ox r0 = p004o.C0626ox.MAPPILLAR     // Catch:{ NoSuchFieldError -> 0x1b23 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1b23 }
            r1 = 233(0xe9, float:3.27E-43)     // Catch:{ NoSuchFieldError -> 0x1b23 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1b23 }
        L_0x1b23:
            o.ox r0 = p004o.C0626ox.MAPPILLAR2     // Catch:{ NoSuchFieldError -> 0x1b2e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1b2e }
            r1 = 249(0xf9, float:3.49E-43)     // Catch:{ NoSuchFieldError -> 0x1b2e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1b2e }
        L_0x1b2e:
            o.ox r0 = p004o.C0626ox.MAPPILLAR3     // Catch:{ NoSuchFieldError -> 0x1b39 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1b39 }
            r1 = 261(0x105, float:3.66E-43)     // Catch:{ NoSuchFieldError -> 0x1b39 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1b39 }
        L_0x1b39:
            o.ox r0 = p004o.C0626ox.MAPPILLAR4     // Catch:{ NoSuchFieldError -> 0x1b44 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1b44 }
            r1 = 262(0x106, float:3.67E-43)     // Catch:{ NoSuchFieldError -> 0x1b44 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1b44 }
        L_0x1b44:
            o.ox r0 = p004o.C0626ox.MAPSPHERE     // Catch:{ NoSuchFieldError -> 0x1b4f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1b4f }
            r1 = 683(0x2ab, float:9.57E-43)     // Catch:{ NoSuchFieldError -> 0x1b4f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1b4f }
        L_0x1b4f:
            o.ox r0 = p004o.C0626ox.MAPSPHERE2     // Catch:{ NoSuchFieldError -> 0x1b5a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1b5a }
            r1 = 702(0x2be, float:9.84E-43)     // Catch:{ NoSuchFieldError -> 0x1b5a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1b5a }
        L_0x1b5a:
            o.ox r0 = p004o.C0626ox.MAP_GHOST     // Catch:{ NoSuchFieldError -> 0x1b65 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1b65 }
            r1 = 694(0x2b6, float:9.73E-43)     // Catch:{ NoSuchFieldError -> 0x1b65 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1b65 }
        L_0x1b65:
            o.ox r0 = p004o.C0626ox.MAP_GREENLIGHT     // Catch:{ NoSuchFieldError -> 0x1b70 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1b70 }
            r1 = 712(0x2c8, float:9.98E-43)     // Catch:{ NoSuchFieldError -> 0x1b70 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1b70 }
        L_0x1b70:
            o.ox r0 = p004o.C0626ox.MAP_GREENLIGHT2     // Catch:{ NoSuchFieldError -> 0x1b7b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1b7b }
            r1 = 714(0x2ca, float:1.0E-42)     // Catch:{ NoSuchFieldError -> 0x1b7b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1b7b }
        L_0x1b7b:
            o.ox r0 = p004o.C0626ox.MAP_MAGICWALL     // Catch:{ NoSuchFieldError -> 0x1b86 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1b86 }
            r1 = 713(0x2c9, float:9.99E-43)     // Catch:{ NoSuchFieldError -> 0x1b86 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1b86 }
        L_0x1b86:
            o.ox r0 = p004o.C0626ox.MAP_MAGICZONE     // Catch:{ NoSuchFieldError -> 0x1b91 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1b91 }
            r1 = 652(0x28c, float:9.14E-43)     // Catch:{ NoSuchFieldError -> 0x1b91 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1b91 }
        L_0x1b91:
            o.ox r0 = p004o.C0626ox.MAP_MAGICZONE2     // Catch:{ NoSuchFieldError -> 0x1b9c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1b9c }
            r1 = 653(0x28d, float:9.15E-43)     // Catch:{ NoSuchFieldError -> 0x1b9c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1b9c }
        L_0x1b9c:
            o.ox r0 = p004o.C0626ox.MAP_MAGICZONE3     // Catch:{ NoSuchFieldError -> 0x1ba7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1ba7 }
            r1 = 689(0x2b1, float:9.65E-43)     // Catch:{ NoSuchFieldError -> 0x1ba7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1ba7 }
        L_0x1ba7:
            o.ox r0 = p004o.C0626ox.MAP_MAGICZONE4     // Catch:{ NoSuchFieldError -> 0x1bb2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1bb2 }
            r1 = 690(0x2b2, float:9.67E-43)     // Catch:{ NoSuchFieldError -> 0x1bb2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1bb2 }
        L_0x1bb2:
            o.ox r0 = p004o.C0626ox.MAXPOWER     // Catch:{ NoSuchFieldError -> 0x1bbd }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1bbd }
            r1 = 106(0x6a, float:1.49E-43)     // Catch:{ NoSuchFieldError -> 0x1bbd }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1bbd }
        L_0x1bbd:
            o.ox r0 = p004o.C0626ox.MELTDOWN     // Catch:{ NoSuchFieldError -> 0x1bc8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1bc8 }
            r1 = 392(0x188, float:5.5E-43)     // Catch:{ NoSuchFieldError -> 0x1bc8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1bc8 }
        L_0x1bc8:
            o.ox r0 = p004o.C0626ox.MEMORIZE     // Catch:{ NoSuchFieldError -> 0x1bd3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1bd3 }
            r1 = 507(0x1fb, float:7.1E-43)     // Catch:{ NoSuchFieldError -> 0x1bd3 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1bd3 }
        L_0x1bd3:
            o.ox r0 = p004o.C0626ox.MENTALBREAK     // Catch:{ NoSuchFieldError -> 0x1bde }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1bde }
            r1 = 183(0xb7, float:2.56E-43)     // Catch:{ NoSuchFieldError -> 0x1bde }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1bde }
        L_0x1bde:
            o.ox r0 = p004o.C0626ox.METEORSTORM     // Catch:{ NoSuchFieldError -> 0x1be9 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1be9 }
            r1 = 94     // Catch:{ NoSuchFieldError -> 0x1be9 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1be9 }
        L_0x1be9:
            o.ox r0 = p004o.C0626ox.MIDNIGHT_FRENZY     // Catch:{ NoSuchFieldError -> 0x1bf4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1bf4 }
            r1 = 969(0x3c9, float:1.358E-42)     // Catch:{ NoSuchFieldError -> 0x1bf4 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1bf4 }
        L_0x1bf4:
            o.ox r0 = p004o.C0626ox.MILSHIELD_STR     // Catch:{ NoSuchFieldError -> 0x1bff }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1bff }
            r1 = 751(0x2ef, float:1.052E-42)     // Catch:{ NoSuchFieldError -> 0x1bff }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1bff }
        L_0x1bff:
            o.ox r0 = p004o.C0626ox.MINI_TETRIS     // Catch:{ NoSuchFieldError -> 0x1c0a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1c0a }
            r1 = 359(0x167, float:5.03E-43)     // Catch:{ NoSuchFieldError -> 0x1c0a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1c0a }
        L_0x1c0a:
            o.ox r0 = p004o.C0626ox.MIRESULT_MAKE_FAIL     // Catch:{ NoSuchFieldError -> 0x1c15 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1c15 }
            r1 = 1020(0x3fc, float:1.43E-42)     // Catch:{ NoSuchFieldError -> 0x1c15 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1c15 }
        L_0x1c15:
            o.ox r0 = p004o.C0626ox.MIRESULT_MAKE_OK     // Catch:{ NoSuchFieldError -> 0x1c20 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1c20 }
            r1 = 1019(0x3fb, float:1.428E-42)     // Catch:{ NoSuchFieldError -> 0x1c20 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1c20 }
        L_0x1c20:
            o.ox r0 = p004o.C0626ox.MOCHI     // Catch:{ NoSuchFieldError -> 0x1c2b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1c2b }
            r1 = 493(0x1ed, float:6.91E-43)     // Catch:{ NoSuchFieldError -> 0x1c2b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1c2b }
        L_0x1c2b:
            o.ox r0 = p004o.C0626ox.MVP     // Catch:{ NoSuchFieldError -> 0x1c36 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1c36 }
            r1 = 70     // Catch:{ NoSuchFieldError -> 0x1c36 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1c36 }
        L_0x1c36:
            o.ox r0 = p004o.C0626ox.NAPALMBEAT     // Catch:{ NoSuchFieldError -> 0x1c41 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1c41 }
            r1 = 34     // Catch:{ NoSuchFieldError -> 0x1c41 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1c41 }
        L_0x1c41:
            o.ox r0 = p004o.C0626ox.NAPALMVALCAN     // Catch:{ NoSuchFieldError -> 0x1c4c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1c4c }
            r1 = 403(0x193, float:5.65E-43)     // Catch:{ NoSuchFieldError -> 0x1c4c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1c4c }
        L_0x1c4c:
            o.ox r0 = p004o.C0626ox.NC_ANAL     // Catch:{ NoSuchFieldError -> 0x1c57 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1c57 }
            r1 = 788(0x314, float:1.104E-42)     // Catch:{ NoSuchFieldError -> 0x1c57 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1c57 }
        L_0x1c57:
            o.ox r0 = p004o.C0626ox.NC_MAGMA_ERUPTION     // Catch:{ NoSuchFieldError -> 0x1c62 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1c62 }
            r1 = 1036(0x40c, float:1.452E-42)     // Catch:{ NoSuchFieldError -> 0x1c62 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1c62 }
        L_0x1c62:
            o.ox r0 = p004o.C0626ox.NIGHT     // Catch:{ NoSuchFieldError -> 0x1c6d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1c6d }
            r1 = 513(0x201, float:7.19E-43)     // Catch:{ NoSuchFieldError -> 0x1c6d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1c6d }
        L_0x1c6d:
            o.ox r0 = p004o.C0626ox.NO100_FIRECRACKER     // Catch:{ NoSuchFieldError -> 0x1c78 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1c78 }
            r1 = 1008(0x3f0, float:1.413E-42)     // Catch:{ NoSuchFieldError -> 0x1c78 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1c78 }
        L_0x1c78:
            o.ox r0 = p004o.C0626ox.NONE     // Catch:{ NoSuchFieldError -> 0x1c82 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1c82 }
            r1 = 1     // Catch:{ NoSuchFieldError -> 0x1c82 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1c82 }
        L_0x1c82:
            o.ox r0 = p004o.C0626ox.NORMAL_TRAP     // Catch:{ NoSuchFieldError -> 0x1c8d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1c8d }
            r1 = 745(0x2e9, float:1.044E-42)     // Catch:{ NoSuchFieldError -> 0x1c8d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1c8d }
        L_0x1c8d:
            o.ox r0 = p004o.C0626ox.NPC_BURNT     // Catch:{ NoSuchFieldError -> 0x1c98 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1c98 }
            r1 = 1040(0x410, float:1.457E-42)     // Catch:{ NoSuchFieldError -> 0x1c98 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1c98 }
        L_0x1c98:
            o.ox r0 = p004o.C0626ox.NPC_CHILL     // Catch:{ NoSuchFieldError -> 0x1ca3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1ca3 }
            r1 = 1041(0x411, float:1.459E-42)     // Catch:{ NoSuchFieldError -> 0x1ca3 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1ca3 }
        L_0x1ca3:
            o.ox r0 = p004o.C0626ox.NPC_EARTHQUAKE     // Catch:{ NoSuchFieldError -> 0x1cae }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1cae }
            r1 = 668(0x29c, float:9.36E-43)     // Catch:{ NoSuchFieldError -> 0x1cae }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1cae }
        L_0x1cae:
            o.ox r0 = p004o.C0626ox.NPC_SLOWCAST     // Catch:{ NoSuchFieldError -> 0x1cb9 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1cb9 }
            r1 = 678(0x2a6, float:9.5E-43)     // Catch:{ NoSuchFieldError -> 0x1cb9 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1cb9 }
        L_0x1cb9:
            o.ox r0 = p004o.C0626ox.NPC_STOP     // Catch:{ NoSuchFieldError -> 0x1cc4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1cc4 }
            r1 = 455(0x1c7, float:6.38E-43)     // Catch:{ NoSuchFieldError -> 0x1cc4 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1cc4 }
        L_0x1cc4:
            o.ox r0 = p004o.C0626ox.NPC_STOP2     // Catch:{ NoSuchFieldError -> 0x1ccf }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1ccf }
            r1 = 606(0x25e, float:8.49E-43)     // Catch:{ NoSuchFieldError -> 0x1ccf }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1ccf }
        L_0x1ccf:
            o.ox r0 = p004o.C0626ox.NPC_STOP2_DEL     // Catch:{ NoSuchFieldError -> 0x1cda }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1cda }
            r1 = 607(0x25f, float:8.5E-43)     // Catch:{ NoSuchFieldError -> 0x1cda }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1cda }
        L_0x1cda:
            o.ox r0 = p004o.C0626ox.NPC_WIDEWEB     // Catch:{ NoSuchFieldError -> 0x1ce5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1ce5 }
            r1 = 1039(0x40f, float:1.456E-42)     // Catch:{ NoSuchFieldError -> 0x1ce5 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1ce5 }
        L_0x1ce5:
            o.ox r0 = p004o.C0626ox.OB_GENSOU     // Catch:{ NoSuchFieldError -> 0x1cf0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1cf0 }
            r1 = 1007(0x3ef, float:1.411E-42)     // Catch:{ NoSuchFieldError -> 0x1cf0 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1cf0 }
        L_0x1cf0:
            o.ox r0 = p004o.C0626ox.ORATIO     // Catch:{ NoSuchFieldError -> 0x1cfb }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1cfb }
            r1 = 757(0x2f5, float:1.061E-42)     // Catch:{ NoSuchFieldError -> 0x1cfb }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1cfb }
        L_0x1cfb:
            o.ox r0 = p004o.C0626ox.OVERTHRUST     // Catch:{ NoSuchFieldError -> 0x1d06 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1d06 }
            r1 = 130(0x82, float:1.82E-43)     // Catch:{ NoSuchFieldError -> 0x1d06 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1d06 }
        L_0x1d06:
            o.ox r0 = p004o.C0626ox.PARTY     // Catch:{ NoSuchFieldError -> 0x1d11 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1d11 }
            r1 = 162(0xa2, float:2.27E-43)     // Catch:{ NoSuchFieldError -> 0x1d11 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1d11 }
        L_0x1d11:
            o.ox r0 = p004o.C0626ox.PATTACK     // Catch:{ NoSuchFieldError -> 0x1d1c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1d1c }
            r1 = 22     // Catch:{ NoSuchFieldError -> 0x1d1c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1d1c }
        L_0x1d1c:
            o.ox r0 = p004o.C0626ox.PEONG     // Catch:{ NoSuchFieldError -> 0x1d27 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1d27 }
            r1 = 413(0x19d, float:5.79E-43)     // Catch:{ NoSuchFieldError -> 0x1d27 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1d27 }
        L_0x1d27:
            o.ox r0 = p004o.C0626ox.PERFECTION     // Catch:{ NoSuchFieldError -> 0x1d32 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1d32 }
            r1 = 105(0x69, float:1.47E-43)     // Catch:{ NoSuchFieldError -> 0x1d32 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1d32 }
        L_0x1d32:
            o.ox r0 = p004o.C0626ox.PETRIFYATTACK     // Catch:{ NoSuchFieldError -> 0x1d3d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1d3d }
            r1 = 197(0xc5, float:2.76E-43)     // Catch:{ NoSuchFieldError -> 0x1d3d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1d3d }
        L_0x1d3d:
            o.ox r0 = p004o.C0626ox.PHARMACY_FAIL     // Catch:{ NoSuchFieldError -> 0x1d48 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1d48 }
            r1 = 308(0x134, float:4.32E-43)     // Catch:{ NoSuchFieldError -> 0x1d48 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1d48 }
        L_0x1d48:
            o.ox r0 = p004o.C0626ox.PHARMACY_OK     // Catch:{ NoSuchFieldError -> 0x1d53 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1d53 }
            r1 = 307(0x133, float:4.3E-43)     // Catch:{ NoSuchFieldError -> 0x1d53 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1d53 }
        L_0x1d53:
            o.ox r0 = p004o.C0626ox.PIERCE     // Catch:{ NoSuchFieldError -> 0x1d5e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1d5e }
            r1 = 83     // Catch:{ NoSuchFieldError -> 0x1d5e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1d5e }
        L_0x1d5e:
            o.ox r0 = p004o.C0626ox.PIERCEBODY     // Catch:{ NoSuchFieldError -> 0x1d69 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1d69 }
            r1 = 504(0x1f8, float:7.06E-43)     // Catch:{ NoSuchFieldError -> 0x1d69 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1d69 }
        L_0x1d69:
            o.ox r0 = p004o.C0626ox.PIERCESELF     // Catch:{ NoSuchFieldError -> 0x1d74 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1d74 }
            r1 = 150(0x96, float:2.1E-43)     // Catch:{ NoSuchFieldError -> 0x1d74 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1d74 }
        L_0x1d74:
            o.ox r0 = p004o.C0626ox.PINKBODY     // Catch:{ NoSuchFieldError -> 0x1d7f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1d7f }
            r1 = 398(0x18e, float:5.58E-43)     // Catch:{ NoSuchFieldError -> 0x1d7f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1d7f }
        L_0x1d7f:
            o.ox r0 = p004o.C0626ox.PINK_NUMBER     // Catch:{ NoSuchFieldError -> 0x1d8a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1d8a }
            r1 = 666(0x29a, float:9.33E-43)     // Catch:{ NoSuchFieldError -> 0x1d8a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1d8a }
        L_0x1d8a:
            o.ox r0 = p004o.C0626ox.PNEUMA     // Catch:{ NoSuchFieldError -> 0x1d95 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1d95 }
            r1 = 143(0x8f, float:2.0E-43)     // Catch:{ NoSuchFieldError -> 0x1d95 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1d95 }
        L_0x1d95:
            o.ox r0 = p004o.C0626ox.PNG_TEST     // Catch:{ NoSuchFieldError -> 0x1da0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1da0 }
            r1 = 904(0x388, float:1.267E-42)     // Catch:{ NoSuchFieldError -> 0x1da0 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1da0 }
        L_0x1da0:
            o.ox r0 = p004o.C0626ox.POISON     // Catch:{ NoSuchFieldError -> 0x1dab }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1dab }
            r1 = 337(0x151, float:4.72E-43)     // Catch:{ NoSuchFieldError -> 0x1dab }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1dab }
        L_0x1dab:
            o.ox r0 = p004o.C0626ox.POISONATTACK     // Catch:{ NoSuchFieldError -> 0x1db6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1db6 }
            r1 = 194(0xc2, float:2.72E-43)     // Catch:{ NoSuchFieldError -> 0x1db6 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1db6 }
        L_0x1db6:
            o.ox r0 = p004o.C0626ox.POISONHIT     // Catch:{ NoSuchFieldError -> 0x1dc1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1dc1 }
            r1 = 55     // Catch:{ NoSuchFieldError -> 0x1dc1 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1dc1 }
        L_0x1dc1:
            o.ox r0 = p004o.C0626ox.POISONREACT     // Catch:{ NoSuchFieldError -> 0x1dcc }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1dcc }
            r1 = 128(0x80, float:1.794E-43)     // Catch:{ NoSuchFieldError -> 0x1dcc }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1dcc }
        L_0x1dcc:
            o.ox r0 = p004o.C0626ox.POISONREACT2     // Catch:{ NoSuchFieldError -> 0x1dd7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1dd7 }
            r1 = 129(0x81, float:1.81E-43)     // Catch:{ NoSuchFieldError -> 0x1dd7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1dd7 }
        L_0x1dd7:
            o.ox r0 = p004o.C0626ox.POISONSMOKE     // Catch:{ NoSuchFieldError -> 0x1de2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1de2 }
            r1 = 774(0x306, float:1.085E-42)     // Catch:{ NoSuchFieldError -> 0x1de2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1de2 }
        L_0x1de2:
            o.ox r0 = p004o.C0626ox.POISONSMOKE2     // Catch:{ NoSuchFieldError -> 0x1ded }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1ded }
            r1 = 926(0x39e, float:1.298E-42)     // Catch:{ NoSuchFieldError -> 0x1ded }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1ded }
        L_0x1ded:
            o.ox r0 = p004o.C0626ox.POISONWAV     // Catch:{ NoSuchFieldError -> 0x1df8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1df8 }
            r1 = 773(0x305, float:1.083E-42)     // Catch:{ NoSuchFieldError -> 0x1df8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1df8 }
        L_0x1df8:
            o.ox r0 = p004o.C0626ox.POISON_MIST     // Catch:{ NoSuchFieldError -> 0x1e03 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1e03 }
            r1 = 961(0x3c1, float:1.347E-42)     // Catch:{ NoSuchFieldError -> 0x1e03 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1e03 }
        L_0x1e03:
            o.ox r0 = p004o.C0626ox.POISON_S     // Catch:{ NoSuchFieldError -> 0x1e0e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1e0e }
            r1 = 642(0x282, float:9.0E-43)     // Catch:{ NoSuchFieldError -> 0x1e0e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1e0e }
        L_0x1e0e:
            o.ox r0 = p004o.C0626ox.POKJUK     // Catch:{ NoSuchFieldError -> 0x1e19 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1e19 }
            r1 = 299(0x12b, float:4.19E-43)     // Catch:{ NoSuchFieldError -> 0x1e19 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1e19 }
        L_0x1e19:
            o.ox r0 = p004o.C0626ox.POKJUK_SOUND     // Catch:{ NoSuchFieldError -> 0x1e24 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1e24 }
            r1 = 303(0x12f, float:4.25E-43)     // Catch:{ NoSuchFieldError -> 0x1e24 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1e24 }
        L_0x1e24:
            o.ox r0 = p004o.C0626ox.POK_BIRTH     // Catch:{ NoSuchFieldError -> 0x1e2f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1e2f }
            r1 = 687(0x2af, float:9.63E-43)     // Catch:{ NoSuchFieldError -> 0x1e2f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1e2f }
        L_0x1e2f:
            o.ox r0 = p004o.C0626ox.POK_CHRISTMAS     // Catch:{ NoSuchFieldError -> 0x1e3a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1e3a }
            r1 = 688(0x2b0, float:9.64E-43)     // Catch:{ NoSuchFieldError -> 0x1e3a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1e3a }
        L_0x1e3a:
            o.ox r0 = p004o.C0626ox.POK_JAP     // Catch:{ NoSuchFieldError -> 0x1e45 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1e45 }
            r1 = 711(0x2c7, float:9.96E-43)     // Catch:{ NoSuchFieldError -> 0x1e45 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1e45 }
        L_0x1e45:
            o.ox r0 = p004o.C0626ox.POK_LOVE     // Catch:{ NoSuchFieldError -> 0x1e50 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1e50 }
            r1 = 684(0x2ac, float:9.58E-43)     // Catch:{ NoSuchFieldError -> 0x1e50 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1e50 }
        L_0x1e50:
            o.ox r0 = p004o.C0626ox.POK_VALEN     // Catch:{ NoSuchFieldError -> 0x1e5b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1e5b }
            r1 = 686(0x2ae, float:9.61E-43)     // Catch:{ NoSuchFieldError -> 0x1e5b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1e5b }
        L_0x1e5b:
            o.ox r0 = p004o.C0626ox.POK_WHITE     // Catch:{ NoSuchFieldError -> 0x1e66 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1e66 }
            r1 = 685(0x2ad, float:9.6E-43)     // Catch:{ NoSuchFieldError -> 0x1e66 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1e66 }
        L_0x1e66:
            o.ox r0 = p004o.C0626ox.PONG     // Catch:{ NoSuchFieldError -> 0x1e71 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1e71 }
            r1 = 201(0xc9, float:2.82E-43)     // Catch:{ NoSuchFieldError -> 0x1e71 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1e71 }
        L_0x1e71:
            o.ox r0 = p004o.C0626ox.PORTAL     // Catch:{ NoSuchFieldError -> 0x1e7c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1e7c }
            r1 = 38     // Catch:{ NoSuchFieldError -> 0x1e7c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1e7c }
        L_0x1e7c:
            o.ox r0 = p004o.C0626ox.PORTAL2     // Catch:{ NoSuchFieldError -> 0x1e87 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1e87 }
            r1 = 319(0x13f, float:4.47E-43)     // Catch:{ NoSuchFieldError -> 0x1e87 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1e87 }
        L_0x1e87:
            o.ox r0 = p004o.C0626ox.PORTAL3     // Catch:{ NoSuchFieldError -> 0x1e92 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1e92 }
            r1 = 343(0x157, float:4.8E-43)     // Catch:{ NoSuchFieldError -> 0x1e92 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1e92 }
        L_0x1e92:
            o.ox r0 = p004o.C0626ox.PORTAL4     // Catch:{ NoSuchFieldError -> 0x1e9d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1e9d }
            r1 = 391(0x187, float:5.48E-43)     // Catch:{ NoSuchFieldError -> 0x1e9d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1e9d }
        L_0x1e9d:
            o.ox r0 = p004o.C0626ox.PORTAL5     // Catch:{ NoSuchFieldError -> 0x1ea8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1ea8 }
            r1 = 404(0x194, float:5.66E-43)     // Catch:{ NoSuchFieldError -> 0x1ea8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1ea8 }
        L_0x1ea8:
            o.ox r0 = p004o.C0626ox.POTION1     // Catch:{ NoSuchFieldError -> 0x1eb3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1eb3 }
            r1 = 206(0xce, float:2.89E-43)     // Catch:{ NoSuchFieldError -> 0x1eb3 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1eb3 }
        L_0x1eb3:
            o.ox r0 = p004o.C0626ox.POTION2     // Catch:{ NoSuchFieldError -> 0x1ebe }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1ebe }
            r1 = 207(0xcf, float:2.9E-43)     // Catch:{ NoSuchFieldError -> 0x1ebe }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1ebe }
        L_0x1ebe:
            o.ox r0 = p004o.C0626ox.POTION3     // Catch:{ NoSuchFieldError -> 0x1ec9 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1ec9 }
            r1 = 208(0xd0, float:2.91E-43)     // Catch:{ NoSuchFieldError -> 0x1ec9 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1ec9 }
        L_0x1ec9:
            o.ox r0 = p004o.C0626ox.POTION4     // Catch:{ NoSuchFieldError -> 0x1ed4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1ed4 }
            r1 = 209(0xd1, float:2.93E-43)     // Catch:{ NoSuchFieldError -> 0x1ed4 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1ed4 }
        L_0x1ed4:
            o.ox r0 = p004o.C0626ox.POTION5     // Catch:{ NoSuchFieldError -> 0x1edf }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1edf }
            r1 = 210(0xd2, float:2.94E-43)     // Catch:{ NoSuchFieldError -> 0x1edf }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1edf }
        L_0x1edf:
            o.ox r0 = p004o.C0626ox.POTION6     // Catch:{ NoSuchFieldError -> 0x1eea }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1eea }
            r1 = 211(0xd3, float:2.96E-43)     // Catch:{ NoSuchFieldError -> 0x1eea }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1eea }
        L_0x1eea:
            o.ox r0 = p004o.C0626ox.POTION7     // Catch:{ NoSuchFieldError -> 0x1ef5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1ef5 }
            r1 = 212(0xd4, float:2.97E-43)     // Catch:{ NoSuchFieldError -> 0x1ef5 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1ef5 }
        L_0x1ef5:
            o.ox r0 = p004o.C0626ox.POTION8     // Catch:{ NoSuchFieldError -> 0x1f00 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1f00 }
            r1 = 213(0xd5, float:2.98E-43)     // Catch:{ NoSuchFieldError -> 0x1f00 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1f00 }
        L_0x1f00:
            o.ox r0 = p004o.C0626ox.POTIONPILLAR     // Catch:{ NoSuchFieldError -> 0x1f0b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1f0b }
            r1 = 223(0xdf, float:3.12E-43)     // Catch:{ NoSuchFieldError -> 0x1f0b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1f0b }
        L_0x1f0b:
            o.ox r0 = p004o.C0626ox.POTION_     // Catch:{ NoSuchFieldError -> 0x1f16 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1f16 }
            r1 = 221(0xdd, float:3.1E-43)     // Catch:{ NoSuchFieldError -> 0x1f16 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1f16 }
        L_0x1f16:
            o.ox r0 = p004o.C0626ox.POTION_BERSERK     // Catch:{ NoSuchFieldError -> 0x1f21 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1f21 }
            r1 = 222(0xde, float:3.11E-43)     // Catch:{ NoSuchFieldError -> 0x1f21 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1f21 }
        L_0x1f21:
            o.ox r0 = p004o.C0626ox.POTION_BERSERK2     // Catch:{ NoSuchFieldError -> 0x1f2c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1f2c }
            r1 = 758(0x2f6, float:1.062E-42)     // Catch:{ NoSuchFieldError -> 0x1f2c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1f2c }
        L_0x1f2c:
            o.ox r0 = p004o.C0626ox.POTION_CON     // Catch:{ NoSuchFieldError -> 0x1f37 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1f37 }
            r1 = 220(0xdc, float:3.08E-43)     // Catch:{ NoSuchFieldError -> 0x1f37 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1f37 }
        L_0x1f37:
            o.ox r0 = p004o.C0626ox.PRESSEDBODY     // Catch:{ NoSuchFieldError -> 0x1f42 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1f42 }
            r1 = 415(0x19f, float:5.82E-43)     // Catch:{ NoSuchFieldError -> 0x1f42 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1f42 }
        L_0x1f42:
            o.ox r0 = p004o.C0626ox.PRESSURE     // Catch:{ NoSuchFieldError -> 0x1f4d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1f4d }
            r1 = 367(0x16f, float:5.14E-43)     // Catch:{ NoSuchFieldError -> 0x1f4d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1f4d }
        L_0x1f4d:
            o.ox r0 = p004o.C0626ox.PRESSURE2     // Catch:{ NoSuchFieldError -> 0x1f58 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1f58 }
            r1 = 908(0x38c, float:1.272E-42)     // Catch:{ NoSuchFieldError -> 0x1f58 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1f58 }
        L_0x1f58:
            o.ox r0 = p004o.C0626ox.PRESSURE3     // Catch:{ NoSuchFieldError -> 0x1f63 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1f63 }
            r1 = 932(0x3a4, float:1.306E-42)     // Catch:{ NoSuchFieldError -> 0x1f63 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1f63 }
        L_0x1f63:
            o.ox r0 = p004o.C0626ox.PRIMECHARGE     // Catch:{ NoSuchFieldError -> 0x1f6e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1f6e }
            r1 = 884(0x374, float:1.239E-42)     // Catch:{ NoSuchFieldError -> 0x1f6e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1f6e }
        L_0x1f6e:
            o.ox r0 = p004o.C0626ox.PRIMECHARGE2     // Catch:{ NoSuchFieldError -> 0x1f79 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1f79 }
            r1 = 910(0x38e, float:1.275E-42)     // Catch:{ NoSuchFieldError -> 0x1f79 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1f79 }
        L_0x1f79:
            o.ox r0 = p004o.C0626ox.PRIMECHARGE3     // Catch:{ NoSuchFieldError -> 0x1f84 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1f84 }
            r1 = 911(0x38f, float:1.277E-42)     // Catch:{ NoSuchFieldError -> 0x1f84 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1f84 }
        L_0x1f84:
            o.ox r0 = p004o.C0626ox.PRIMECHARGE4     // Catch:{ NoSuchFieldError -> 0x1f8f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1f8f }
            r1 = 912(0x390, float:1.278E-42)     // Catch:{ NoSuchFieldError -> 0x1f8f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1f8f }
        L_0x1f8f:
            o.ox r0 = p004o.C0626ox.PROVIDENCE     // Catch:{ NoSuchFieldError -> 0x1f9a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1f9a }
            r1 = 250(0xfa, float:3.5E-43)     // Catch:{ NoSuchFieldError -> 0x1f9a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1f9a }
        L_0x1f9a:
            o.ox r0 = p004o.C0626ox.PROVOKE     // Catch:{ NoSuchFieldError -> 0x1fa5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1fa5 }
            r1 = 69     // Catch:{ NoSuchFieldError -> 0x1fa5 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1fa5 }
        L_0x1fa5:
            o.ox r0 = p004o.C0626ox.PURPLEBODY     // Catch:{ NoSuchFieldError -> 0x1fb0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1fb0 }
            r1 = 770(0x302, float:1.079E-42)     // Catch:{ NoSuchFieldError -> 0x1fb0 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1fb0 }
        L_0x1fb0:
            o.ox r0 = p004o.C0626ox.PURPLE_NUMBER     // Catch:{ NoSuchFieldError -> 0x1fbb }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1fbb }
            r1 = 662(0x296, float:9.28E-43)     // Catch:{ NoSuchFieldError -> 0x1fbb }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1fbb }
        L_0x1fbb:
            o.ox r0 = p004o.C0626ox.QUAGMIRE     // Catch:{ NoSuchFieldError -> 0x1fc6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1fc6 }
            r1 = 97     // Catch:{ NoSuchFieldError -> 0x1fc6 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1fc6 }
        L_0x1fc6:
            o.ox r0 = p004o.C0626ox.QUAKEBODY     // Catch:{ NoSuchFieldError -> 0x1fd1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1fd1 }
            r1 = 428(0x1ac, float:6.0E-43)     // Catch:{ NoSuchFieldError -> 0x1fd1 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1fd1 }
        L_0x1fd1:
            o.ox r0 = p004o.C0626ox.QUAKEBODY2     // Catch:{ NoSuchFieldError -> 0x1fdc }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1fdc }
            r1 = 460(0x1cc, float:6.45E-43)     // Catch:{ NoSuchFieldError -> 0x1fdc }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1fdc }
        L_0x1fdc:
            o.ox r0 = p004o.C0626ox.QUAKEBODY3     // Catch:{ NoSuchFieldError -> 0x1fe7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1fe7 }
            r1 = 552(0x228, float:7.74E-43)     // Catch:{ NoSuchFieldError -> 0x1fe7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1fe7 }
        L_0x1fe7:
            o.ox r0 = p004o.C0626ox.QUAKEBODY4     // Catch:{ NoSuchFieldError -> 0x1ff2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1ff2 }
            r1 = 604(0x25c, float:8.46E-43)     // Catch:{ NoSuchFieldError -> 0x1ff2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1ff2 }
        L_0x1ff2:
            o.ox r0 = p004o.C0626ox.RAIN     // Catch:{ NoSuchFieldError -> 0x1ffd }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x1ffd }
            r1 = 163(0xa3, float:2.28E-43)     // Catch:{ NoSuchFieldError -> 0x1ffd }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x1ffd }
        L_0x1ffd:
            o.ox r0 = p004o.C0626ox.RAINBOW     // Catch:{ NoSuchFieldError -> 0x2008 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2008 }
            r1 = 412(0x19c, float:5.77E-43)     // Catch:{ NoSuchFieldError -> 0x2008 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2008 }
        L_0x2008:
            o.ox r0 = p004o.C0626ox.RAIN_PARTICLE     // Catch:{ NoSuchFieldError -> 0x2013 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2013 }
            r1 = 859(0x35b, float:1.204E-42)     // Catch:{ NoSuchFieldError -> 0x2013 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2013 }
        L_0x2013:
            o.ox r0 = p004o.C0626ox.RAIN_PARTICLE2     // Catch:{ NoSuchFieldError -> 0x201e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x201e }
            r1 = 946(0x3b2, float:1.326E-42)     // Catch:{ NoSuchFieldError -> 0x201e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x201e }
        L_0x201e:
            o.ox r0 = p004o.C0626ox.RAPIDSHOWER     // Catch:{ NoSuchFieldError -> 0x2029 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2029 }
            r1 = 645(0x285, float:9.04E-43)     // Catch:{ NoSuchFieldError -> 0x2029 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2029 }
        L_0x2029:
            o.ox r0 = p004o.C0626ox.RA_UNLIMIT     // Catch:{ NoSuchFieldError -> 0x2034 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2034 }
            r1 = 1042(0x412, float:1.46E-42)     // Catch:{ NoSuchFieldError -> 0x2034 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2034 }
        L_0x2034:
            o.ox r0 = p004o.C0626ox.READYPORTAL     // Catch:{ NoSuchFieldError -> 0x203f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x203f }
            r1 = 37     // Catch:{ NoSuchFieldError -> 0x203f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x203f }
        L_0x203f:
            o.ox r0 = p004o.C0626ox.READYPORTAL2     // Catch:{ NoSuchFieldError -> 0x204a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x204a }
            r1 = 318(0x13e, float:4.46E-43)     // Catch:{ NoSuchFieldError -> 0x204a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x204a }
        L_0x204a:
            o.ox r0 = p004o.C0626ox.RECOGNIZED     // Catch:{ NoSuchFieldError -> 0x2055 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2055 }
            r1 = 805(0x325, float:1.128E-42)     // Catch:{ NoSuchFieldError -> 0x2055 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2055 }
        L_0x2055:
            o.ox r0 = p004o.C0626ox.RECOGNIZED2     // Catch:{ NoSuchFieldError -> 0x2060 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2060 }
            r1 = 810(0x32a, float:1.135E-42)     // Catch:{ NoSuchFieldError -> 0x2060 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2060 }
        L_0x2060:
            o.ox r0 = p004o.C0626ox.RECOVERY     // Catch:{ NoSuchFieldError -> 0x206b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x206b }
            r1 = 80     // Catch:{ NoSuchFieldError -> 0x206b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x206b }
        L_0x206b:
            o.ox r0 = p004o.C0626ox.REDBODY     // Catch:{ NoSuchFieldError -> 0x2076 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2076 }
            r1 = 370(0x172, float:5.18E-43)     // Catch:{ NoSuchFieldError -> 0x2076 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2076 }
        L_0x2076:
            o.ox r0 = p004o.C0626ox.REDLIGHTBODY     // Catch:{ NoSuchFieldError -> 0x2081 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2081 }
            r1 = 546(0x222, float:7.65E-43)     // Catch:{ NoSuchFieldError -> 0x2081 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2081 }
        L_0x2081:
            o.ox r0 = p004o.C0626ox.REDLINE     // Catch:{ NoSuchFieldError -> 0x208c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x208c }
            r1 = 802(0x322, float:1.124E-42)     // Catch:{ NoSuchFieldError -> 0x208c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x208c }
        L_0x208c:
            o.ox r0 = p004o.C0626ox.RED_CROSS     // Catch:{ NoSuchFieldError -> 0x2097 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2097 }
            r1 = 1000(0x3e8, float:1.401E-42)     // Catch:{ NoSuchFieldError -> 0x2097 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2097 }
        L_0x2097:
            o.ox r0 = p004o.C0626ox.RED_HIT     // Catch:{ NoSuchFieldError -> 0x20a2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x20a2 }
            r1 = 550(0x226, float:7.71E-43)     // Catch:{ NoSuchFieldError -> 0x20a2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x20a2 }
        L_0x20a2:
            o.ox r0 = p004o.C0626ox.RED_NUMBER     // Catch:{ NoSuchFieldError -> 0x20ad }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x20ad }
            r1 = 661(0x295, float:9.26E-43)     // Catch:{ NoSuchFieldError -> 0x20ad }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x20ad }
        L_0x20ad:
            o.ox r0 = p004o.C0626ox.REFINEFAIL     // Catch:{ NoSuchFieldError -> 0x20b8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x20b8 }
            r1 = 157(0x9d, float:2.2E-43)     // Catch:{ NoSuchFieldError -> 0x20b8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x20b8 }
        L_0x20b8:
            o.ox r0 = p004o.C0626ox.REFINEOK     // Catch:{ NoSuchFieldError -> 0x20c3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x20c3 }
            r1 = 156(0x9c, float:2.19E-43)     // Catch:{ NoSuchFieldError -> 0x20c3 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x20c3 }
        L_0x20c3:
            o.ox r0 = p004o.C0626ox.REFLECTBODY     // Catch:{ NoSuchFieldError -> 0x20ce }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x20ce }
            r1 = 421(0x1a5, float:5.9E-43)     // Catch:{ NoSuchFieldError -> 0x20ce }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x20ce }
        L_0x20ce:
            o.ox r0 = p004o.C0626ox.REFLECTSHIELD     // Catch:{ NoSuchFieldError -> 0x20d9 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x20d9 }
            r1 = 254(0xfe, float:3.56E-43)     // Catch:{ NoSuchFieldError -> 0x20d9 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x20d9 }
        L_0x20d9:
            o.ox r0 = p004o.C0626ox.REJECTSWORD     // Catch:{ NoSuchFieldError -> 0x20e4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x20e4 }
            r1 = 394(0x18a, float:5.52E-43)     // Catch:{ NoSuchFieldError -> 0x20e4 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x20e4 }
        L_0x20e4:
            o.ox r0 = p004o.C0626ox.REMOVETRAP     // Catch:{ NoSuchFieldError -> 0x20ef }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x20ef }
            r1 = 102(0x66, float:1.43E-43)     // Catch:{ NoSuchFieldError -> 0x20ef }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x20ef }
        L_0x20ef:
            o.ox r0 = p004o.C0626ox.REPAIRTIME     // Catch:{ NoSuchFieldError -> 0x20fa }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x20fa }
            r1 = 787(0x313, float:1.103E-42)     // Catch:{ NoSuchFieldError -> 0x20fa }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x20fa }
        L_0x20fa:
            o.ox r0 = p004o.C0626ox.REPAIRWEAPON     // Catch:{ NoSuchFieldError -> 0x2105 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2105 }
            r1 = 103(0x67, float:1.44E-43)     // Catch:{ NoSuchFieldError -> 0x2105 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2105 }
        L_0x2105:
            o.ox r0 = p004o.C0626ox.RESURRECTION     // Catch:{ NoSuchFieldError -> 0x2110 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2110 }
            r1 = 79     // Catch:{ NoSuchFieldError -> 0x2110 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2110 }
        L_0x2110:
            o.ox r0 = p004o.C0626ox.REVIVE     // Catch:{ NoSuchFieldError -> 0x211b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x211b }
            r1 = 142(0x8e, float:1.99E-43)     // Catch:{ NoSuchFieldError -> 0x211b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x211b }
        L_0x211b:
            o.ox r0 = p004o.C0626ox.RG_COIN     // Catch:{ NoSuchFieldError -> 0x2126 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2126 }
            r1 = 276(0x114, float:3.87E-43)     // Catch:{ NoSuchFieldError -> 0x2126 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2126 }
        L_0x2126:
            o.ox r0 = p004o.C0626ox.RG_COIN2     // Catch:{ NoSuchFieldError -> 0x2131 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2131 }
            r1 = 497(0x1f1, float:6.96E-43)     // Catch:{ NoSuchFieldError -> 0x2131 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2131 }
        L_0x2131:
            o.ox r0 = p004o.C0626ox.RG_COIN3     // Catch:{ NoSuchFieldError -> 0x213c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x213c }
            r1 = 629(0x275, float:8.81E-43)     // Catch:{ NoSuchFieldError -> 0x213c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x213c }
        L_0x213c:
            o.ox r0 = p004o.C0626ox.RG_COIN4     // Catch:{ NoSuchFieldError -> 0x2147 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2147 }
            r1 = 772(0x304, float:1.082E-42)     // Catch:{ NoSuchFieldError -> 0x2147 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2147 }
        L_0x2147:
            o.ox r0 = p004o.C0626ox.RG_COIN5     // Catch:{ NoSuchFieldError -> 0x2152 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2152 }
            r1 = 822(0x336, float:1.152E-42)     // Catch:{ NoSuchFieldError -> 0x2152 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2152 }
        L_0x2152:
            o.ox r0 = p004o.C0626ox.RG_COIN6     // Catch:{ NoSuchFieldError -> 0x215d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x215d }
            r1 = 871(0x367, float:1.22E-42)     // Catch:{ NoSuchFieldError -> 0x215d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x215d }
        L_0x215d:
            o.ox r0 = p004o.C0626ox.RG_COIN7     // Catch:{ NoSuchFieldError -> 0x2168 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2168 }
            r1 = 909(0x38d, float:1.274E-42)     // Catch:{ NoSuchFieldError -> 0x2168 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2168 }
        L_0x2168:
            o.ox r0 = p004o.C0626ox.RICHS_COIN_A     // Catch:{ NoSuchFieldError -> 0x2173 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2173 }
            r1 = 1056(0x420, float:1.48E-42)     // Catch:{ NoSuchFieldError -> 0x2173 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2173 }
        L_0x2173:
            o.ox r0 = p004o.C0626ox.RK_DRAGONBREATH_WATER     // Catch:{ NoSuchFieldError -> 0x217e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x217e }
            r1 = 1028(0x404, float:1.44E-42)     // Catch:{ NoSuchFieldError -> 0x217e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x217e }
        L_0x217e:
            o.ox r0 = p004o.C0626ox.RK_LUXANIMA     // Catch:{ NoSuchFieldError -> 0x2189 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2189 }
            r1 = 1031(0x407, float:1.445E-42)     // Catch:{ NoSuchFieldError -> 0x2189 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2189 }
        L_0x2189:
            o.ox r0 = p004o.C0626ox.RO2YEAR     // Catch:{ NoSuchFieldError -> 0x2194 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2194 }
            r1 = 547(0x223, float:7.67E-43)     // Catch:{ NoSuchFieldError -> 0x2194 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2194 }
        L_0x2194:
            o.ox r0 = p004o.C0626ox.ROLLING1     // Catch:{ NoSuchFieldError -> 0x219f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x219f }
            r1 = 760(0x2f8, float:1.065E-42)     // Catch:{ NoSuchFieldError -> 0x219f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x219f }
        L_0x219f:
            o.ox r0 = p004o.C0626ox.ROLLING10     // Catch:{ NoSuchFieldError -> 0x21aa }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x21aa }
            r1 = 769(0x301, float:1.078E-42)     // Catch:{ NoSuchFieldError -> 0x21aa }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x21aa }
        L_0x21aa:
            o.ox r0 = p004o.C0626ox.ROLLING2     // Catch:{ NoSuchFieldError -> 0x21b5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x21b5 }
            r1 = 761(0x2f9, float:1.066E-42)     // Catch:{ NoSuchFieldError -> 0x21b5 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x21b5 }
        L_0x21b5:
            o.ox r0 = p004o.C0626ox.ROLLING3     // Catch:{ NoSuchFieldError -> 0x21c0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x21c0 }
            r1 = 762(0x2fa, float:1.068E-42)     // Catch:{ NoSuchFieldError -> 0x21c0 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x21c0 }
        L_0x21c0:
            o.ox r0 = p004o.C0626ox.ROLLING4     // Catch:{ NoSuchFieldError -> 0x21cb }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x21cb }
            r1 = 763(0x2fb, float:1.069E-42)     // Catch:{ NoSuchFieldError -> 0x21cb }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x21cb }
        L_0x21cb:
            o.ox r0 = p004o.C0626ox.ROLLING5     // Catch:{ NoSuchFieldError -> 0x21d6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x21d6 }
            r1 = 764(0x2fc, float:1.07E-42)     // Catch:{ NoSuchFieldError -> 0x21d6 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x21d6 }
        L_0x21d6:
            o.ox r0 = p004o.C0626ox.ROLLING6     // Catch:{ NoSuchFieldError -> 0x21e1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x21e1 }
            r1 = 765(0x2fd, float:1.072E-42)     // Catch:{ NoSuchFieldError -> 0x21e1 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x21e1 }
        L_0x21e1:
            o.ox r0 = p004o.C0626ox.ROLLING7     // Catch:{ NoSuchFieldError -> 0x21ec }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x21ec }
            r1 = 766(0x2fe, float:1.073E-42)     // Catch:{ NoSuchFieldError -> 0x21ec }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x21ec }
        L_0x21ec:
            o.ox r0 = p004o.C0626ox.ROLLING8     // Catch:{ NoSuchFieldError -> 0x21f7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x21f7 }
            r1 = 767(0x2ff, float:1.075E-42)     // Catch:{ NoSuchFieldError -> 0x21f7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x21f7 }
        L_0x21f7:
            o.ox r0 = p004o.C0626ox.ROLLING9     // Catch:{ NoSuchFieldError -> 0x2202 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2202 }
            r1 = 768(0x300, float:1.076E-42)     // Catch:{ NoSuchFieldError -> 0x2202 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2202 }
        L_0x2202:
            o.ox r0 = p004o.C0626ox.ROLLINGCAST     // Catch:{ NoSuchFieldError -> 0x220d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x220d }
            r1 = 839(0x347, float:1.176E-42)     // Catch:{ NoSuchFieldError -> 0x220d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x220d }
        L_0x220d:
            o.ox r0 = p004o.C0626ox.ROTATE_BG     // Catch:{ NoSuchFieldError -> 0x2218 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2218 }
            r1 = 987(0x3db, float:1.383E-42)     // Catch:{ NoSuchFieldError -> 0x2218 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2218 }
        L_0x2218:
            o.ox r0 = p004o.C0626ox.ROTATE_HUUMARANKA     // Catch:{ NoSuchFieldError -> 0x2223 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2223 }
            r1 = 986(0x3da, float:1.382E-42)     // Catch:{ NoSuchFieldError -> 0x2223 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2223 }
        L_0x2223:
            o.ox r0 = p004o.C0626ox.ROTATE_LINE_BLUE     // Catch:{ NoSuchFieldError -> 0x222e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x222e }
            r1 = 1002(0x3ea, float:1.404E-42)     // Catch:{ NoSuchFieldError -> 0x222e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x222e }
        L_0x222e:
            o.ox r0 = p004o.C0626ox.ROTATE_LINE_GRAY     // Catch:{ NoSuchFieldError -> 0x2239 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2239 }
            r1 = 988(0x3dc, float:1.384E-42)     // Catch:{ NoSuchFieldError -> 0x2239 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2239 }
        L_0x2239:
            o.ox r0 = p004o.C0626ox.RUN     // Catch:{ NoSuchFieldError -> 0x2244 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2244 }
            r1 = 444(0x1bc, float:6.22E-43)     // Catch:{ NoSuchFieldError -> 0x2244 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2244 }
        L_0x2244:
            o.ox r0 = p004o.C0626ox.RUN_MAKE_FAILURE     // Catch:{ NoSuchFieldError -> 0x224f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x224f }
            r1 = 1018(0x3fa, float:1.427E-42)     // Catch:{ NoSuchFieldError -> 0x224f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x224f }
        L_0x224f:
            o.ox r0 = p004o.C0626ox.RUN_MAKE_OK     // Catch:{ NoSuchFieldError -> 0x225a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x225a }
            r1 = 1017(0x3f9, float:1.425E-42)     // Catch:{ NoSuchFieldError -> 0x225a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x225a }
        L_0x225a:
            o.ox r0 = p004o.C0626ox.RUWACH     // Catch:{ NoSuchFieldError -> 0x2265 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2265 }
            r1 = 35     // Catch:{ NoSuchFieldError -> 0x2265 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2265 }
        L_0x2265:
            o.ox r0 = p004o.C0626ox.SAINTWING     // Catch:{ NoSuchFieldError -> 0x2270 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2270 }
            r1 = 347(0x15b, float:4.86E-43)     // Catch:{ NoSuchFieldError -> 0x2270 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2270 }
        L_0x2270:
            o.ox r0 = p004o.C0626ox.SAKURA     // Catch:{ NoSuchFieldError -> 0x227b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x227b }
            r1 = 165(0xa5, float:2.31E-43)     // Catch:{ NoSuchFieldError -> 0x227b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x227b }
        L_0x227b:
            o.ox r0 = p004o.C0626ox.SANCTUARY     // Catch:{ NoSuchFieldError -> 0x2286 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2286 }
            r1 = 85     // Catch:{ NoSuchFieldError -> 0x2286 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2286 }
        L_0x2286:
            o.ox r0 = p004o.C0626ox.SANDMAN     // Catch:{ NoSuchFieldError -> 0x2291 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2291 }
            r1 = 141(0x8d, float:1.98E-43)     // Catch:{ NoSuchFieldError -> 0x2291 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2291 }
        L_0x2291:
            o.ox r0 = p004o.C0626ox.SANDWIND     // Catch:{ NoSuchFieldError -> 0x229c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x229c }
            r1 = 48     // Catch:{ NoSuchFieldError -> 0x229c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x229c }
        L_0x229c:
            o.ox r0 = p004o.C0626ox.SCREEN_QUAKE     // Catch:{ NoSuchFieldError -> 0x22a7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x22a7 }
            r1 = 565(0x235, float:7.92E-43)     // Catch:{ NoSuchFieldError -> 0x22a7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x22a7 }
        L_0x22a7:
            o.ox r0 = p004o.C0626ox.SC_ESCAPE     // Catch:{ NoSuchFieldError -> 0x22b2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x22b2 }
            r1 = 1044(0x414, float:1.463E-42)     // Catch:{ NoSuchFieldError -> 0x22b2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x22b2 }
        L_0x22b2:
            o.ox r0 = p004o.C0626ox.SECRA     // Catch:{ NoSuchFieldError -> 0x22bd }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x22bd }
            r1 = 861(0x35d, float:1.207E-42)     // Catch:{ NoSuchFieldError -> 0x22bd }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x22bd }
        L_0x22bd:
            o.ox r0 = p004o.C0626ox.SECRA2     // Catch:{ NoSuchFieldError -> 0x22c8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x22c8 }
            r1 = 864(0x360, float:1.211E-42)     // Catch:{ NoSuchFieldError -> 0x22c8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x22c8 }
        L_0x22c8:
            o.ox r0 = p004o.C0626ox.SEISMICWEAPON     // Catch:{ NoSuchFieldError -> 0x22d3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x22d3 }
            r1 = 260(0x104, float:3.64E-43)     // Catch:{ NoSuchFieldError -> 0x22d3 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x22d3 }
        L_0x22d3:
            o.ox r0 = p004o.C0626ox.SELFSCROLL     // Catch:{ NoSuchFieldError -> 0x22de }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x22de }
            r1 = 902(0x386, float:1.264E-42)     // Catch:{ NoSuchFieldError -> 0x22de }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x22de }
        L_0x22de:
            o.ox r0 = p004o.C0626ox.SHIELDBOOMERANG     // Catch:{ NoSuchFieldError -> 0x22e9 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x22e9 }
            r1 = 251(0xfb, float:3.52E-43)     // Catch:{ NoSuchFieldError -> 0x22e9 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x22e9 }
        L_0x22e9:
            o.ox r0 = p004o.C0626ox.SHIELDBOOMERANG2     // Catch:{ NoSuchFieldError -> 0x22f4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x22f4 }
            r1 = 496(0x1f0, float:6.95E-43)     // Catch:{ NoSuchFieldError -> 0x22f4 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x22f4 }
        L_0x22f4:
            o.ox r0 = p004o.C0626ox.SHIELDBOOMERANG3     // Catch:{ NoSuchFieldError -> 0x22ff }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x22ff }
            r1 = 522(0x20a, float:7.31E-43)     // Catch:{ NoSuchFieldError -> 0x22ff }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x22ff }
        L_0x22ff:
            o.ox r0 = p004o.C0626ox.SHIELDBOOMERANG4     // Catch:{ NoSuchFieldError -> 0x230a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x230a }
            r1 = 776(0x308, float:1.087E-42)     // Catch:{ NoSuchFieldError -> 0x230a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x230a }
        L_0x230a:
            o.ox r0 = p004o.C0626ox.SHIELDCHARGE     // Catch:{ NoSuchFieldError -> 0x2315 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2315 }
            r1 = 248(0xf8, float:3.48E-43)     // Catch:{ NoSuchFieldError -> 0x2315 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2315 }
        L_0x2315:
            o.ox r0 = p004o.C0626ox.SHOCKWAVE     // Catch:{ NoSuchFieldError -> 0x2320 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2320 }
            r1 = 147(0x93, float:2.06E-43)     // Catch:{ NoSuchFieldError -> 0x2320 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2320 }
        L_0x2320:
            o.ox r0 = p004o.C0626ox.SHOCKWAVE2     // Catch:{ NoSuchFieldError -> 0x232b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x232b }
            r1 = 928(0x3a0, float:1.3E-42)     // Catch:{ NoSuchFieldError -> 0x232b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x232b }
        L_0x232b:
            o.ox r0 = p004o.C0626ox.SHOCKWAVEHIT     // Catch:{ NoSuchFieldError -> 0x2336 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2336 }
            r1 = 148(0x94, float:2.07E-43)     // Catch:{ NoSuchFieldError -> 0x2336 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2336 }
        L_0x2336:
            o.ox r0 = p004o.C0626ox.SHOOTPARTICLE     // Catch:{ NoSuchFieldError -> 0x2341 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2341 }
            r1 = 857(0x359, float:1.201E-42)     // Catch:{ NoSuchFieldError -> 0x2341 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2341 }
        L_0x2341:
            o.ox r0 = p004o.C0626ox.SHRINK     // Catch:{ NoSuchFieldError -> 0x234c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x234c }
            r1 = 601(0x259, float:8.42E-43)     // Catch:{ NoSuchFieldError -> 0x234c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x234c }
        L_0x234c:
            o.ox r0 = p004o.C0626ox.SIGHT     // Catch:{ NoSuchFieldError -> 0x2357 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2357 }
            r1 = 24     // Catch:{ NoSuchFieldError -> 0x2357 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2357 }
        L_0x2357:
            o.ox r0 = p004o.C0626ox.SIGHT2     // Catch:{ NoSuchFieldError -> 0x2362 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2362 }
            r1 = 603(0x25b, float:8.45E-43)     // Catch:{ NoSuchFieldError -> 0x2362 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2362 }
        L_0x2362:
            o.ox r0 = p004o.C0626ox.SIGHTRASHER     // Catch:{ NoSuchFieldError -> 0x236d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x236d }
            r1 = 64     // Catch:{ NoSuchFieldError -> 0x236d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x236d }
        L_0x236d:
            o.ox r0 = p004o.C0626ox.SIGNUM     // Catch:{ NoSuchFieldError -> 0x2378 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2378 }
            r1 = 42     // Catch:{ NoSuchFieldError -> 0x2378 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2378 }
        L_0x2378:
            o.ox r0 = p004o.C0626ox.SILENCEATTACK     // Catch:{ NoSuchFieldError -> 0x2383 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2383 }
            r1 = 195(0xc3, float:2.73E-43)     // Catch:{ NoSuchFieldError -> 0x2383 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2383 }
        L_0x2383:
            o.ox r0 = p004o.C0626ox.SILENT_BREEZE     // Catch:{ NoSuchFieldError -> 0x238e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x238e }
            r1 = 963(0x3c3, float:1.35E-42)     // Catch:{ NoSuchFieldError -> 0x238e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x238e }
        L_0x238e:
            o.ox r0 = p004o.C0626ox.SKIDTRAP     // Catch:{ NoSuchFieldError -> 0x2399 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2399 }
            r1 = 71     // Catch:{ NoSuchFieldError -> 0x2399 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2399 }
        L_0x2399:
            o.ox r0 = p004o.C0626ox.SLEEPATTACK     // Catch:{ NoSuchFieldError -> 0x23a4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x23a4 }
            r1 = 199(0xc7, float:2.79E-43)     // Catch:{ NoSuchFieldError -> 0x23a4 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x23a4 }
        L_0x23a4:
            o.ox r0 = p004o.C0626ox.SLIM     // Catch:{ NoSuchFieldError -> 0x23af }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x23af }
            r1 = 499(0x1f3, float:6.99E-43)     // Catch:{ NoSuchFieldError -> 0x23af }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x23af }
        L_0x23af:
            o.ox r0 = p004o.C0626ox.SLIM2     // Catch:{ NoSuchFieldError -> 0x23ba }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x23ba }
            r1 = 500(0x1f4, float:7.0E-43)     // Catch:{ NoSuchFieldError -> 0x23ba }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x23ba }
        L_0x23ba:
            o.ox r0 = p004o.C0626ox.SLIM3     // Catch:{ NoSuchFieldError -> 0x23c5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x23c5 }
            r1 = 501(0x1f5, float:7.02E-43)     // Catch:{ NoSuchFieldError -> 0x23c5 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x23c5 }
        L_0x23c5:
            o.ox r0 = p004o.C0626ox.SLOWPOISON     // Catch:{ NoSuchFieldError -> 0x23d0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x23d0 }
            r1 = 138(0x8a, float:1.93E-43)     // Catch:{ NoSuchFieldError -> 0x23d0 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x23d0 }
        L_0x23d0:
            o.ox r0 = p004o.C0626ox.SLUGSHOT     // Catch:{ NoSuchFieldError -> 0x23db }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x23db }
            r1 = 1049(0x419, float:1.47E-42)     // Catch:{ NoSuchFieldError -> 0x23db }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x23db }
        L_0x23db:
            o.ox r0 = p004o.C0626ox.SMA     // Catch:{ NoSuchFieldError -> 0x23e6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x23e6 }
            r1 = 553(0x229, float:7.75E-43)     // Catch:{ NoSuchFieldError -> 0x23e6 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x23e6 }
        L_0x23e6:
            o.ox r0 = p004o.C0626ox.SMA2     // Catch:{ NoSuchFieldError -> 0x23f1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x23f1 }
            r1 = 554(0x22a, float:7.76E-43)     // Catch:{ NoSuchFieldError -> 0x23f1 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x23f1 }
        L_0x23f1:
            o.ox r0 = p004o.C0626ox.SMA3     // Catch:{ NoSuchFieldError -> 0x23fc }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x23fc }
            r1 = 558(0x22e, float:7.82E-43)     // Catch:{ NoSuchFieldError -> 0x23fc }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x23fc }
        L_0x23fc:
            o.ox r0 = p004o.C0626ox.SMA_READY     // Catch:{ NoSuchFieldError -> 0x2407 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2407 }
            r1 = 548(0x224, float:7.68E-43)     // Catch:{ NoSuchFieldError -> 0x2407 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2407 }
        L_0x2407:
            o.ox r0 = p004o.C0626ox.SMOKE     // Catch:{ NoSuchFieldError -> 0x2412 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2412 }
            r1 = 46     // Catch:{ NoSuchFieldError -> 0x2412 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2412 }
        L_0x2412:
            o.ox r0 = p004o.C0626ox.SNOW     // Catch:{ NoSuchFieldError -> 0x241d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x241d }
            r1 = 164(0xa4, float:2.3E-43)     // Catch:{ NoSuchFieldError -> 0x241d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x241d }
        L_0x241d:
            o.ox r0 = p004o.C0626ox.SONICBLOW     // Catch:{ NoSuchFieldError -> 0x2428 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2428 }
            r1 = 123(0x7b, float:1.72E-43)     // Catch:{ NoSuchFieldError -> 0x2428 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2428 }
        L_0x2428:
            o.ox r0 = p004o.C0626ox.SONICBLOW2     // Catch:{ NoSuchFieldError -> 0x2433 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2433 }
            r1 = 145(0x91, float:2.03E-43)     // Catch:{ NoSuchFieldError -> 0x2433 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2433 }
        L_0x2433:
            o.ox r0 = p004o.C0626ox.SONICBLOWHIT     // Catch:{ NoSuchFieldError -> 0x243e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x243e }
            r1 = 124(0x7c, float:1.74E-43)     // Catch:{ NoSuchFieldError -> 0x243e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x243e }
        L_0x243e:
            o.ox r0 = p004o.C0626ox.SONIC_CLAW     // Catch:{ NoSuchFieldError -> 0x2449 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2449 }
            r1 = 967(0x3c7, float:1.355E-42)     // Catch:{ NoSuchFieldError -> 0x2449 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2449 }
        L_0x2449:
            o.ox r0 = p004o.C0626ox.SOULBREAKER     // Catch:{ NoSuchFieldError -> 0x2454 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2454 }
            r1 = 363(0x16b, float:5.09E-43)     // Catch:{ NoSuchFieldError -> 0x2454 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2454 }
        L_0x2454:
            o.ox r0 = p004o.C0626ox.SOULBREAKER2     // Catch:{ NoSuchFieldError -> 0x245f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x245f }
            r1 = 411(0x19b, float:5.76E-43)     // Catch:{ NoSuchFieldError -> 0x245f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x245f }
        L_0x245f:
            o.ox r0 = p004o.C0626ox.SOULBREAKER3     // Catch:{ NoSuchFieldError -> 0x246a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x246a }
            r1 = 722(0x2d2, float:1.012E-42)     // Catch:{ NoSuchFieldError -> 0x246a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x246a }
        L_0x246a:
            o.ox r0 = p004o.C0626ox.SOULBREAKER4     // Catch:{ NoSuchFieldError -> 0x2475 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2475 }
            r1 = 735(0x2df, float:1.03E-42)     // Catch:{ NoSuchFieldError -> 0x2475 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2475 }
        L_0x2475:
            o.ox r0 = p004o.C0626ox.SOULBURN     // Catch:{ NoSuchFieldError -> 0x2480 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2480 }
            r1 = 408(0x198, float:5.72E-43)     // Catch:{ NoSuchFieldError -> 0x2480 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2480 }
        L_0x2480:
            o.ox r0 = p004o.C0626ox.SOULCHANGE     // Catch:{ NoSuchFieldError -> 0x248b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x248b }
            r1 = 409(0x199, float:5.73E-43)     // Catch:{ NoSuchFieldError -> 0x248b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x248b }
        L_0x248b:
            o.ox r0 = p004o.C0626ox.SOULLIGHT     // Catch:{ NoSuchFieldError -> 0x2496 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2496 }
            r1 = 508(0x1fc, float:7.12E-43)     // Catch:{ NoSuchFieldError -> 0x2496 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2496 }
        L_0x2496:
            o.ox r0 = p004o.C0626ox.SOULLIGHT2     // Catch:{ NoSuchFieldError -> 0x24a1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x24a1 }
            r1 = 852(0x354, float:1.194E-42)     // Catch:{ NoSuchFieldError -> 0x24a1 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x24a1 }
        L_0x24a1:
            o.ox r0 = p004o.C0626ox.SOULLIGHT3     // Catch:{ NoSuchFieldError -> 0x24ac }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x24ac }
            r1 = 934(0x3a6, float:1.309E-42)     // Catch:{ NoSuchFieldError -> 0x24ac }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x24ac }
        L_0x24ac:
            o.ox r0 = p004o.C0626ox.SOULLINK     // Catch:{ NoSuchFieldError -> 0x24b7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x24b7 }
            r1 = 505(0x1f9, float:7.08E-43)     // Catch:{ NoSuchFieldError -> 0x24b7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x24b7 }
        L_0x24b7:
            o.ox r0 = p004o.C0626ox.SOULSTRIKE     // Catch:{ NoSuchFieldError -> 0x24c2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x24c2 }
            r1 = 17     // Catch:{ NoSuchFieldError -> 0x24c2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x24c2 }
        L_0x24c2:
            o.ox r0 = p004o.C0626ox.SOULSTRIKE2     // Catch:{ NoSuchFieldError -> 0x24cd }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x24cd }
            r1 = 453(0x1c5, float:6.35E-43)     // Catch:{ NoSuchFieldError -> 0x24cd }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x24cd }
        L_0x24cd:
            o.ox r0 = p004o.C0626ox.SO_ELEMENTAL_SHIELD     // Catch:{ NoSuchFieldError -> 0x24d8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x24d8 }
            r1 = 1032(0x408, float:1.446E-42)     // Catch:{ NoSuchFieldError -> 0x24d8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x24d8 }
        L_0x24d8:
            o.ox r0 = p004o.C0626ox.SPEARBMR     // Catch:{ NoSuchFieldError -> 0x24e3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x24e3 }
            r1 = 82     // Catch:{ NoSuchFieldError -> 0x24e3 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x24e3 }
        L_0x24e3:
            o.ox r0 = p004o.C0626ox.SPEARBMRSELF     // Catch:{ NoSuchFieldError -> 0x24ee }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x24ee }
            r1 = 153(0x99, float:2.14E-43)     // Catch:{ NoSuchFieldError -> 0x24ee }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x24ee }
        L_0x24ee:
            o.ox r0 = p004o.C0626ox.SPEARQUICKEN     // Catch:{ NoSuchFieldError -> 0x24f9 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x24f9 }
            r1 = 252(0xfc, float:3.53E-43)     // Catch:{ NoSuchFieldError -> 0x24f9 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x24f9 }
        L_0x24f9:
            o.ox r0 = p004o.C0626ox.SPEARSTABSELF     // Catch:{ NoSuchFieldError -> 0x2504 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2504 }
            r1 = 152(0x98, float:2.13E-43)     // Catch:{ NoSuchFieldError -> 0x2504 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2504 }
        L_0x2504:
            o.ox r0 = p004o.C0626ox.SPELLBREAKER     // Catch:{ NoSuchFieldError -> 0x250f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x250f }
            r1 = 236(0xec, float:3.31E-43)     // Catch:{ NoSuchFieldError -> 0x250f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x250f }
        L_0x250f:
            o.ox r0 = p004o.C0626ox.SPHERE     // Catch:{ NoSuchFieldError -> 0x251a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x251a }
            r1 = 74     // Catch:{ NoSuchFieldError -> 0x251a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x251a }
        L_0x251a:
            o.ox r0 = p004o.C0626ox.SPHEREWIND     // Catch:{ NoSuchFieldError -> 0x2525 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2525 }
            r1 = 348(0x15c, float:4.88E-43)     // Catch:{ NoSuchFieldError -> 0x2525 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2525 }
        L_0x2525:
            o.ox r0 = p004o.C0626ox.SPHEREWIND2     // Catch:{ NoSuchFieldError -> 0x2530 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2530 }
            r1 = 396(0x18c, float:5.55E-43)     // Catch:{ NoSuchFieldError -> 0x2530 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2530 }
        L_0x2530:
            o.ox r0 = p004o.C0626ox.SPINEDBODY     // Catch:{ NoSuchFieldError -> 0x253b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x253b }
            r1 = 416(0x1a0, float:5.83E-43)     // Catch:{ NoSuchFieldError -> 0x253b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x253b }
        L_0x253b:
            o.ox r0 = p004o.C0626ox.SPINEDBODY2     // Catch:{ NoSuchFieldError -> 0x2546 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2546 }
            r1 = 468(0x1d4, float:6.56E-43)     // Catch:{ NoSuchFieldError -> 0x2546 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2546 }
        L_0x2546:
            o.ox r0 = p004o.C0626ox.SPINMOVE     // Catch:{ NoSuchFieldError -> 0x2551 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2551 }
            r1 = 892(0x37c, float:1.25E-42)     // Catch:{ NoSuchFieldError -> 0x2551 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2551 }
        L_0x2551:
            o.ox r0 = p004o.C0626ox.SPLASHER     // Catch:{ NoSuchFieldError -> 0x255c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x255c }
            r1 = 131(0x83, float:1.84E-43)     // Catch:{ NoSuchFieldError -> 0x255c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x255c }
        L_0x255c:
            o.ox r0 = p004o.C0626ox.SPRAYPOND     // Catch:{ NoSuchFieldError -> 0x2567 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2567 }
            r1 = 50     // Catch:{ NoSuchFieldError -> 0x2567 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2567 }
        L_0x2567:
            o.ox r0 = p004o.C0626ox.SPREADATTACK     // Catch:{ NoSuchFieldError -> 0x2572 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2572 }
            r1 = 647(0x287, float:9.07E-43)     // Catch:{ NoSuchFieldError -> 0x2572 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2572 }
        L_0x2572:
            o.ox r0 = p004o.C0626ox.SPRINGTRAP     // Catch:{ NoSuchFieldError -> 0x257d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x257d }
            r1 = 113(0x71, float:1.58E-43)     // Catch:{ NoSuchFieldError -> 0x257d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x257d }
        L_0x257d:
            o.ox r0 = p004o.C0626ox.SPRINKLESAND     // Catch:{ NoSuchFieldError -> 0x2588 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2588 }
            r1 = 312(0x138, float:4.37E-43)     // Catch:{ NoSuchFieldError -> 0x2588 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2588 }
        L_0x2588:
            o.ox r0 = p004o.C0626ox.SPR_LIGHTPRINT     // Catch:{ NoSuchFieldError -> 0x2593 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2593 }
            r1 = 903(0x387, float:1.265E-42)     // Catch:{ NoSuchFieldError -> 0x2593 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2593 }
        L_0x2593:
            o.ox r0 = p004o.C0626ox.SPR_LIGHTPRINT2     // Catch:{ NoSuchFieldError -> 0x259e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x259e }
            r1 = 925(0x39d, float:1.296E-42)     // Catch:{ NoSuchFieldError -> 0x259e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x259e }
        L_0x259e:
            o.ox r0 = p004o.C0626ox.SPR_LIGHTPRINT3     // Catch:{ NoSuchFieldError -> 0x25a9 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x25a9 }
            r1 = 943(0x3af, float:1.321E-42)     // Catch:{ NoSuchFieldError -> 0x25a9 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x25a9 }
        L_0x25a9:
            o.ox r0 = p004o.C0626ox.SPR_MASH     // Catch:{ NoSuchFieldError -> 0x25b4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x25b4 }
            r1 = 731(0x2db, float:1.024E-42)     // Catch:{ NoSuchFieldError -> 0x25b4 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x25b4 }
        L_0x25b4:
            o.ox r0 = p004o.C0626ox.SPR_PARTICLE     // Catch:{ NoSuchFieldError -> 0x25bf }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x25bf }
            r1 = 853(0x355, float:1.195E-42)     // Catch:{ NoSuchFieldError -> 0x25bf }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x25bf }
        L_0x25bf:
            o.ox r0 = p004o.C0626ox.SPR_PARTICLE2     // Catch:{ NoSuchFieldError -> 0x25ca }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x25ca }
            r1 = 854(0x356, float:1.197E-42)     // Catch:{ NoSuchFieldError -> 0x25ca }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x25ca }
        L_0x25ca:
            o.ox r0 = p004o.C0626ox.SPR_PLANT     // Catch:{ NoSuchFieldError -> 0x25d5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x25d5 }
            r1 = 855(0x357, float:1.198E-42)     // Catch:{ NoSuchFieldError -> 0x25d5 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x25d5 }
        L_0x25d5:
            o.ox r0 = p004o.C0626ox.SPR_PLANT10     // Catch:{ NoSuchFieldError -> 0x25e0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x25e0 }
            r1 = 924(0x39c, float:1.295E-42)     // Catch:{ NoSuchFieldError -> 0x25e0 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x25e0 }
        L_0x25e0:
            o.ox r0 = p004o.C0626ox.SPR_PLANT11     // Catch:{ NoSuchFieldError -> 0x25eb }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x25eb }
            r1 = 929(0x3a1, float:1.302E-42)     // Catch:{ NoSuchFieldError -> 0x25eb }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x25eb }
        L_0x25eb:
            o.ox r0 = p004o.C0626ox.SPR_PLANT2     // Catch:{ NoSuchFieldError -> 0x25f6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x25f6 }
            r1 = 868(0x364, float:1.216E-42)     // Catch:{ NoSuchFieldError -> 0x25f6 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x25f6 }
        L_0x25f6:
            o.ox r0 = p004o.C0626ox.SPR_PLANT3     // Catch:{ NoSuchFieldError -> 0x2601 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2601 }
            r1 = 870(0x366, float:1.219E-42)     // Catch:{ NoSuchFieldError -> 0x2601 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2601 }
        L_0x2601:
            o.ox r0 = p004o.C0626ox.SPR_PLANT4     // Catch:{ NoSuchFieldError -> 0x260c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x260c }
            r1 = 872(0x368, float:1.222E-42)     // Catch:{ NoSuchFieldError -> 0x260c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x260c }
        L_0x260c:
            o.ox r0 = p004o.C0626ox.SPR_PLANT5     // Catch:{ NoSuchFieldError -> 0x2617 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2617 }
            r1 = 874(0x36a, float:1.225E-42)     // Catch:{ NoSuchFieldError -> 0x2617 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2617 }
        L_0x2617:
            o.ox r0 = p004o.C0626ox.SPR_PLANT6     // Catch:{ NoSuchFieldError -> 0x2622 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2622 }
            r1 = 876(0x36c, float:1.228E-42)     // Catch:{ NoSuchFieldError -> 0x2622 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2622 }
        L_0x2622:
            o.ox r0 = p004o.C0626ox.SPR_PLANT7     // Catch:{ NoSuchFieldError -> 0x262d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x262d }
            r1 = 878(0x36e, float:1.23E-42)     // Catch:{ NoSuchFieldError -> 0x262d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x262d }
        L_0x262d:
            o.ox r0 = p004o.C0626ox.SPR_PLANT8     // Catch:{ NoSuchFieldError -> 0x2638 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2638 }
            r1 = 880(0x370, float:1.233E-42)     // Catch:{ NoSuchFieldError -> 0x2638 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2638 }
        L_0x2638:
            o.ox r0 = p004o.C0626ox.SPR_PLANT9     // Catch:{ NoSuchFieldError -> 0x2643 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2643 }
            r1 = 917(0x395, float:1.285E-42)     // Catch:{ NoSuchFieldError -> 0x2643 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2643 }
        L_0x2643:
            o.ox r0 = p004o.C0626ox.SPR_SOULE     // Catch:{ NoSuchFieldError -> 0x264e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x264e }
            r1 = 732(0x2dc, float:1.026E-42)     // Catch:{ NoSuchFieldError -> 0x264e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x264e }
        L_0x264e:
            o.ox r0 = p004o.C0626ox.SPTIME     // Catch:{ NoSuchFieldError -> 0x2659 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2659 }
            r1 = 334(0x14e, float:4.68E-43)     // Catch:{ NoSuchFieldError -> 0x2659 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2659 }
        L_0x2659:
            o.ox r0 = p004o.C0626ox.SR_FLASHCOMBO     // Catch:{ NoSuchFieldError -> 0x2664 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2664 }
            r1 = 1030(0x406, float:1.443E-42)     // Catch:{ NoSuchFieldError -> 0x2664 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2664 }
        L_0x2664:
            o.ox r0 = p004o.C0626ox.STASIS     // Catch:{ NoSuchFieldError -> 0x266f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x266f }
            r1 = 801(0x321, float:1.122E-42)     // Catch:{ NoSuchFieldError -> 0x266f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x266f }
        L_0x266f:
            o.ox r0 = p004o.C0626ox.STATUS_STATE     // Catch:{ NoSuchFieldError -> 0x267a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x267a }
            r1 = 166(0xa6, float:2.33E-43)     // Catch:{ NoSuchFieldError -> 0x267a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x267a }
        L_0x267a:
            o.ox r0 = p004o.C0626ox.STEAL     // Catch:{ NoSuchFieldError -> 0x2685 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2685 }
            r1 = 20     // Catch:{ NoSuchFieldError -> 0x2685 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2685 }
        L_0x2685:
            o.ox r0 = p004o.C0626ox.STEALCOIN     // Catch:{ NoSuchFieldError -> 0x2690 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2690 }
            r1 = 270(0x10e, float:3.78E-43)     // Catch:{ NoSuchFieldError -> 0x2690 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2690 }
        L_0x2690:
            o.ox r0 = p004o.C0626ox.STEELBODY     // Catch:{ NoSuchFieldError -> 0x269b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x269b }
            r1 = 256(0x100, float:3.59E-43)     // Catch:{ NoSuchFieldError -> 0x269b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x269b }
        L_0x269b:
            o.ox r0 = p004o.C0626ox.STIN     // Catch:{ NoSuchFieldError -> 0x26a6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x26a6 }
            r1 = 549(0x225, float:7.7E-43)     // Catch:{ NoSuchFieldError -> 0x26a6 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x26a6 }
        L_0x26a6:
            o.ox r0 = p004o.C0626ox.STIN2     // Catch:{ NoSuchFieldError -> 0x26b1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x26b1 }
            r1 = 555(0x22b, float:7.78E-43)     // Catch:{ NoSuchFieldError -> 0x26b1 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x26b1 }
        L_0x26b1:
            o.ox r0 = p004o.C0626ox.STIN3     // Catch:{ NoSuchFieldError -> 0x26bc }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x26bc }
            r1 = 557(0x22d, float:7.8E-43)     // Catch:{ NoSuchFieldError -> 0x26bc }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x26bc }
        L_0x26bc:
            o.ox r0 = p004o.C0626ox.STIN4     // Catch:{ NoSuchFieldError -> 0x26c7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x26c7 }
            r1 = 623(0x26f, float:8.73E-43)     // Catch:{ NoSuchFieldError -> 0x26c7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x26c7 }
        L_0x26c7:
            o.ox r0 = p004o.C0626ox.STIN5     // Catch:{ NoSuchFieldError -> 0x26d2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x26d2 }
            r1 = 626(0x272, float:8.77E-43)     // Catch:{ NoSuchFieldError -> 0x26d2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x26d2 }
        L_0x26d2:
            o.ox r0 = p004o.C0626ox.STIN6     // Catch:{ NoSuchFieldError -> 0x26dd }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x26dd }
            r1 = 771(0x303, float:1.08E-42)     // Catch:{ NoSuchFieldError -> 0x26dd }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x26dd }
        L_0x26dd:
            o.ox r0 = p004o.C0626ox.STONECURSE     // Catch:{ NoSuchFieldError -> 0x26e8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x26e8 }
            r1 = 25     // Catch:{ NoSuchFieldError -> 0x26e8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x26e8 }
        L_0x26e8:
            o.ox r0 = p004o.C0626ox.STONERING     // Catch:{ NoSuchFieldError -> 0x26f3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x26f3 }
            r1 = 799(0x31f, float:1.12E-42)     // Catch:{ NoSuchFieldError -> 0x26f3 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x26f3 }
        L_0x26f3:
            o.ox r0 = p004o.C0626ox.STOPEFFECT     // Catch:{ NoSuchFieldError -> 0x26fe }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x26fe }
            r1 = 446(0x1be, float:6.25E-43)     // Catch:{ NoSuchFieldError -> 0x26fe }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x26fe }
        L_0x26fe:
            o.ox r0 = p004o.C0626ox.STOPRUN     // Catch:{ NoSuchFieldError -> 0x2709 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2709 }
            r1 = 445(0x1bd, float:6.24E-43)     // Catch:{ NoSuchFieldError -> 0x2709 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2709 }
        L_0x2709:
            o.ox r0 = p004o.C0626ox.STORMGUST     // Catch:{ NoSuchFieldError -> 0x2714 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2714 }
            r1 = 91     // Catch:{ NoSuchFieldError -> 0x2714 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2714 }
        L_0x2714:
            o.ox r0 = p004o.C0626ox.STORMKICK     // Catch:{ NoSuchFieldError -> 0x271f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x271f }
            r1 = 437(0x1b5, float:6.12E-43)     // Catch:{ NoSuchFieldError -> 0x271f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x271f }
        L_0x271f:
            o.ox r0 = p004o.C0626ox.STORMKICK1     // Catch:{ NoSuchFieldError -> 0x272a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x272a }
            r1 = 461(0x1cd, float:6.46E-43)     // Catch:{ NoSuchFieldError -> 0x272a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x272a }
        L_0x272a:
            o.ox r0 = p004o.C0626ox.STORMKICK2     // Catch:{ NoSuchFieldError -> 0x2735 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2735 }
            r1 = 462(0x1ce, float:6.47E-43)     // Catch:{ NoSuchFieldError -> 0x2735 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2735 }
        L_0x2735:
            o.ox r0 = p004o.C0626ox.STORMKICK3     // Catch:{ NoSuchFieldError -> 0x2740 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2740 }
            r1 = 463(0x1cf, float:6.49E-43)     // Catch:{ NoSuchFieldError -> 0x2740 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2740 }
        L_0x2740:
            o.ox r0 = p004o.C0626ox.STORMKICK4     // Catch:{ NoSuchFieldError -> 0x274b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x274b }
            r1 = 464(0x1d0, float:6.5E-43)     // Catch:{ NoSuchFieldError -> 0x274b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x274b }
        L_0x274b:
            o.ox r0 = p004o.C0626ox.STORMKICK5     // Catch:{ NoSuchFieldError -> 0x2756 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2756 }
            r1 = 465(0x1d1, float:6.52E-43)     // Catch:{ NoSuchFieldError -> 0x2756 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2756 }
        L_0x2756:
            o.ox r0 = p004o.C0626ox.STORMKICK6     // Catch:{ NoSuchFieldError -> 0x2761 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2761 }
            r1 = 466(0x1d2, float:6.53E-43)     // Catch:{ NoSuchFieldError -> 0x2761 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2761 }
        L_0x2761:
            o.ox r0 = p004o.C0626ox.STORMKICK7     // Catch:{ NoSuchFieldError -> 0x276c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x276c }
            r1 = 467(0x1d3, float:6.54E-43)     // Catch:{ NoSuchFieldError -> 0x276c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x276c }
        L_0x276c:
            o.ox r0 = p004o.C0626ox.STORM_MIN     // Catch:{ NoSuchFieldError -> 0x2777 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2777 }
            r1 = 710(0x2c6, float:9.95E-43)     // Catch:{ NoSuchFieldError -> 0x2777 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2777 }
        L_0x2777:
            o.ox r0 = p004o.C0626ox.STRETCH     // Catch:{ NoSuchFieldError -> 0x2782 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2782 }
            r1 = 813(0x32d, float:1.139E-42)     // Catch:{ NoSuchFieldError -> 0x2782 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2782 }
        L_0x2782:
            o.ox r0 = p004o.C0626ox.STRIPARMOR     // Catch:{ NoSuchFieldError -> 0x278d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x278d }
            r1 = 273(0x111, float:3.83E-43)     // Catch:{ NoSuchFieldError -> 0x278d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x278d }
        L_0x278d:
            o.ox r0 = p004o.C0626ox.STRIPHELM     // Catch:{ NoSuchFieldError -> 0x2798 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2798 }
            r1 = 274(0x112, float:3.84E-43)     // Catch:{ NoSuchFieldError -> 0x2798 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2798 }
        L_0x2798:
            o.ox r0 = p004o.C0626ox.STRIPSHIELD     // Catch:{ NoSuchFieldError -> 0x27a3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x27a3 }
            r1 = 272(0x110, float:3.81E-43)     // Catch:{ NoSuchFieldError -> 0x27a3 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x27a3 }
        L_0x27a3:
            o.ox r0 = p004o.C0626ox.STRIPWEAPON     // Catch:{ NoSuchFieldError -> 0x27ae }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x27ae }
            r1 = 271(0x10f, float:3.8E-43)     // Catch:{ NoSuchFieldError -> 0x27ae }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x27ae }
        L_0x27ae:
            o.ox r0 = p004o.C0626ox.STUNATTACK     // Catch:{ NoSuchFieldError -> 0x27b9 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x27b9 }
            r1 = 196(0xc4, float:2.75E-43)     // Catch:{ NoSuchFieldError -> 0x27b9 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x27b9 }
        L_0x27b9:
            o.ox r0 = p004o.C0626ox.SUFFRAGIUM     // Catch:{ NoSuchFieldError -> 0x27c4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x27c4 }
            r1 = 90     // Catch:{ NoSuchFieldError -> 0x27c4 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x27c4 }
        L_0x27c4:
            o.ox r0 = p004o.C0626ox.SUICIDE     // Catch:{ NoSuchFieldError -> 0x27cf }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x27cf }
            r1 = 187(0xbb, float:2.62E-43)     // Catch:{ NoSuchFieldError -> 0x27cf }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x27cf }
        L_0x27cf:
            o.ox r0 = p004o.C0626ox.SUI_EXPLOSION     // Catch:{ NoSuchFieldError -> 0x27da }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x27da }
            r1 = 185(0xb9, float:2.59E-43)     // Catch:{ NoSuchFieldError -> 0x27da }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x27da }
        L_0x27da:
            o.ox r0 = p004o.C0626ox.SUMMONSLAVE     // Catch:{ NoSuchFieldError -> 0x27e5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x27e5 }
            r1 = 217(0xd9, float:3.04E-43)     // Catch:{ NoSuchFieldError -> 0x27e5 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x27e5 }
        L_0x27e5:
            o.ox r0 = p004o.C0626ox.SU_CHATTERING     // Catch:{ NoSuchFieldError -> 0x27f0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x27f0 }
            r1 = 1054(0x41e, float:1.477E-42)     // Catch:{ NoSuchFieldError -> 0x27f0 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x27f0 }
        L_0x27f0:
            o.ox r0 = p004o.C0626ox.SU_GROOMING     // Catch:{ NoSuchFieldError -> 0x27fb }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x27fb }
            r1 = 1053(0x41d, float:1.476E-42)     // Catch:{ NoSuchFieldError -> 0x27fb }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x27fb }
        L_0x27fb:
            o.ox r0 = p004o.C0626ox.S_STORM     // Catch:{ NoSuchFieldError -> 0x2806 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2806 }
            r1 = 1051(0x41b, float:1.473E-42)     // Catch:{ NoSuchFieldError -> 0x2806 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2806 }
        L_0x2806:
            o.ox r0 = p004o.C0626ox.TAE_READY     // Catch:{ NoSuchFieldError -> 0x2811 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2811 }
            r1 = 451(0x1c3, float:6.32E-43)     // Catch:{ NoSuchFieldError -> 0x2811 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2811 }
        L_0x2811:
            o.ox r0 = p004o.C0626ox.TALK_FROSTJOKE     // Catch:{ NoSuchFieldError -> 0x281c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x281c }
            r1 = 297(0x129, float:4.16E-43)     // Catch:{ NoSuchFieldError -> 0x281c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x281c }
        L_0x281c:
            o.ox r0 = p004o.C0626ox.TALK_SCREAM     // Catch:{ NoSuchFieldError -> 0x2827 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2827 }
            r1 = 298(0x12a, float:4.18E-43)     // Catch:{ NoSuchFieldError -> 0x2827 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2827 }
        L_0x2827:
            o.ox r0 = p004o.C0626ox.TAMINGFAILED     // Catch:{ NoSuchFieldError -> 0x2832 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2832 }
            r1 = 170(0xaa, float:2.38E-43)     // Catch:{ NoSuchFieldError -> 0x2832 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2832 }
        L_0x2832:
            o.ox r0 = p004o.C0626ox.TAMINGSUCCESS     // Catch:{ NoSuchFieldError -> 0x283d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x283d }
            r1 = 169(0xa9, float:2.37E-43)     // Catch:{ NoSuchFieldError -> 0x283d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x283d }
        L_0x283d:
            o.ox r0 = p004o.C0626ox.TANJI     // Catch:{ NoSuchFieldError -> 0x2848 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2848 }
            r1 = 267(0x10b, float:3.74E-43)     // Catch:{ NoSuchFieldError -> 0x2848 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2848 }
        L_0x2848:
            o.ox r0 = p004o.C0626ox.TANJI2     // Catch:{ NoSuchFieldError -> 0x2853 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2853 }
            r1 = 414(0x19e, float:5.8E-43)     // Catch:{ NoSuchFieldError -> 0x2853 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2853 }
        L_0x2853:
            o.ox r0 = p004o.C0626ox.TAROTCARD1     // Catch:{ NoSuchFieldError -> 0x285e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x285e }
            r1 = 525(0x20d, float:7.36E-43)     // Catch:{ NoSuchFieldError -> 0x285e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x285e }
        L_0x285e:
            o.ox r0 = p004o.C0626ox.TAROTCARD10     // Catch:{ NoSuchFieldError -> 0x2869 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2869 }
            r1 = 534(0x216, float:7.48E-43)     // Catch:{ NoSuchFieldError -> 0x2869 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2869 }
        L_0x2869:
            o.ox r0 = p004o.C0626ox.TAROTCARD11     // Catch:{ NoSuchFieldError -> 0x2874 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2874 }
            r1 = 535(0x217, float:7.5E-43)     // Catch:{ NoSuchFieldError -> 0x2874 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2874 }
        L_0x2874:
            o.ox r0 = p004o.C0626ox.TAROTCARD12     // Catch:{ NoSuchFieldError -> 0x287f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x287f }
            r1 = 536(0x218, float:7.51E-43)     // Catch:{ NoSuchFieldError -> 0x287f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x287f }
        L_0x287f:
            o.ox r0 = p004o.C0626ox.TAROTCARD13     // Catch:{ NoSuchFieldError -> 0x288a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x288a }
            r1 = 537(0x219, float:7.52E-43)     // Catch:{ NoSuchFieldError -> 0x288a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x288a }
        L_0x288a:
            o.ox r0 = p004o.C0626ox.TAROTCARD14     // Catch:{ NoSuchFieldError -> 0x2895 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2895 }
            r1 = 538(0x21a, float:7.54E-43)     // Catch:{ NoSuchFieldError -> 0x2895 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2895 }
        L_0x2895:
            o.ox r0 = p004o.C0626ox.TAROTCARD2     // Catch:{ NoSuchFieldError -> 0x28a0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x28a0 }
            r1 = 526(0x20e, float:7.37E-43)     // Catch:{ NoSuchFieldError -> 0x28a0 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x28a0 }
        L_0x28a0:
            o.ox r0 = p004o.C0626ox.TAROTCARD3     // Catch:{ NoSuchFieldError -> 0x28ab }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x28ab }
            r1 = 527(0x20f, float:7.38E-43)     // Catch:{ NoSuchFieldError -> 0x28ab }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x28ab }
        L_0x28ab:
            o.ox r0 = p004o.C0626ox.TAROTCARD4     // Catch:{ NoSuchFieldError -> 0x28b6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x28b6 }
            r1 = 528(0x210, float:7.4E-43)     // Catch:{ NoSuchFieldError -> 0x28b6 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x28b6 }
        L_0x28b6:
            o.ox r0 = p004o.C0626ox.TAROTCARD5     // Catch:{ NoSuchFieldError -> 0x28c1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x28c1 }
            r1 = 529(0x211, float:7.41E-43)     // Catch:{ NoSuchFieldError -> 0x28c1 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x28c1 }
        L_0x28c1:
            o.ox r0 = p004o.C0626ox.TAROTCARD6     // Catch:{ NoSuchFieldError -> 0x28cc }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x28cc }
            r1 = 530(0x212, float:7.43E-43)     // Catch:{ NoSuchFieldError -> 0x28cc }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x28cc }
        L_0x28cc:
            o.ox r0 = p004o.C0626ox.TAROTCARD7     // Catch:{ NoSuchFieldError -> 0x28d7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x28d7 }
            r1 = 531(0x213, float:7.44E-43)     // Catch:{ NoSuchFieldError -> 0x28d7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x28d7 }
        L_0x28d7:
            o.ox r0 = p004o.C0626ox.TAROTCARD8     // Catch:{ NoSuchFieldError -> 0x28e2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x28e2 }
            r1 = 532(0x214, float:7.45E-43)     // Catch:{ NoSuchFieldError -> 0x28e2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x28e2 }
        L_0x28e2:
            o.ox r0 = p004o.C0626ox.TAROTCARD9     // Catch:{ NoSuchFieldError -> 0x28ed }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x28ed }
            r1 = 533(0x215, float:7.47E-43)     // Catch:{ NoSuchFieldError -> 0x28ed }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x28ed }
        L_0x28ed:
            o.ox r0 = p004o.C0626ox.TATAMI     // Catch:{ NoSuchFieldError -> 0x28f8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x28f8 }
            r1 = 633(0x279, float:8.87E-43)     // Catch:{ NoSuchFieldError -> 0x28f8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x28f8 }
        L_0x28f8:
            o.ox r0 = p004o.C0626ox.TEIHIT1     // Catch:{ NoSuchFieldError -> 0x2903 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2903 }
            r1 = 264(0x108, float:3.7E-43)     // Catch:{ NoSuchFieldError -> 0x2903 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2903 }
        L_0x2903:
            o.ox r0 = p004o.C0626ox.TEIHIT1T     // Catch:{ NoSuchFieldError -> 0x290e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x290e }
            r1 = 891(0x37b, float:1.249E-42)     // Catch:{ NoSuchFieldError -> 0x290e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x290e }
        L_0x290e:
            o.ox r0 = p004o.C0626ox.TEIHIT1X     // Catch:{ NoSuchFieldError -> 0x2919 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2919 }
            r1 = 268(0x10c, float:3.76E-43)     // Catch:{ NoSuchFieldError -> 0x2919 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2919 }
        L_0x2919:
            o.ox r0 = p004o.C0626ox.TEIHIT2     // Catch:{ NoSuchFieldError -> 0x2924 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2924 }
            r1 = 266(0x10a, float:3.73E-43)     // Catch:{ NoSuchFieldError -> 0x2924 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2924 }
        L_0x2924:
            o.ox r0 = p004o.C0626ox.TEIHIT3     // Catch:{ NoSuchFieldError -> 0x292f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x292f }
            r1 = 278(0x116, float:3.9E-43)     // Catch:{ NoSuchFieldError -> 0x292f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x292f }
        L_0x292f:
            o.ox r0 = p004o.C0626ox.TELEKHIT     // Catch:{ NoSuchFieldError -> 0x293a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x293a }
            r1 = 200(0xc8, float:2.8E-43)     // Catch:{ NoSuchFieldError -> 0x293a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x293a }
        L_0x293a:
            o.ox r0 = p004o.C0626ox.TELEPORTATION     // Catch:{ NoSuchFieldError -> 0x2945 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2945 }
            r1 = 36     // Catch:{ NoSuchFieldError -> 0x2945 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2945 }
        L_0x2945:
            o.ox r0 = p004o.C0626ox.TELEPORTATION2     // Catch:{ NoSuchFieldError -> 0x2950 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2950 }
            r1 = 306(0x132, float:4.29E-43)     // Catch:{ NoSuchFieldError -> 0x2950 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2950 }
        L_0x2950:
            o.ox r0 = p004o.C0626ox.TEMP_FAIL     // Catch:{ NoSuchFieldError -> 0x295b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x295b }
            r1 = 613(0x265, float:8.59E-43)     // Catch:{ NoSuchFieldError -> 0x295b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x295b }
        L_0x295b:
            o.ox r0 = p004o.C0626ox.TEMP_OK     // Catch:{ NoSuchFieldError -> 0x2966 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2966 }
            r1 = 612(0x264, float:8.58E-43)     // Catch:{ NoSuchFieldError -> 0x2966 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2966 }
        L_0x2966:
            o.ox r0 = p004o.C0626ox.TETRA     // Catch:{ NoSuchFieldError -> 0x2971 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2971 }
            r1 = 806(0x326, float:1.13E-42)     // Catch:{ NoSuchFieldError -> 0x2971 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2971 }
        L_0x2971:
            o.ox r0 = p004o.C0626ox.TETRACASTING     // Catch:{ NoSuchFieldError -> 0x297c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x297c }
            r1 = 807(0x327, float:1.131E-42)     // Catch:{ NoSuchFieldError -> 0x297c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x297c }
        L_0x297c:
            o.ox r0 = p004o.C0626ox.TETRA_FIRE     // Catch:{ NoSuchFieldError -> 0x2987 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2987 }
            r1 = 972(0x3cc, float:1.362E-42)     // Catch:{ NoSuchFieldError -> 0x2987 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2987 }
        L_0x2987:
            o.ox r0 = p004o.C0626ox.TETRA_GROUND     // Catch:{ NoSuchFieldError -> 0x2992 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2992 }
            r1 = 975(0x3cf, float:1.366E-42)     // Catch:{ NoSuchFieldError -> 0x2992 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2992 }
        L_0x2992:
            o.ox r0 = p004o.C0626ox.TETRA_WATER     // Catch:{ NoSuchFieldError -> 0x299d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x299d }
            r1 = 973(0x3cd, float:1.363E-42)     // Catch:{ NoSuchFieldError -> 0x299d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x299d }
        L_0x299d:
            o.ox r0 = p004o.C0626ox.TETRA_WIND     // Catch:{ NoSuchFieldError -> 0x29a8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x29a8 }
            r1 = 974(0x3ce, float:1.365E-42)     // Catch:{ NoSuchFieldError -> 0x29a8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x29a8 }
        L_0x29a8:
            o.ox r0 = p004o.C0626ox.THROWITEM     // Catch:{ NoSuchFieldError -> 0x29b3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x29b3 }
            r1 = 300(0x12c, float:4.2E-43)     // Catch:{ NoSuchFieldError -> 0x29b3 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x29b3 }
        L_0x29b3:
            o.ox r0 = p004o.C0626ox.THROWITEM10     // Catch:{ NoSuchFieldError -> 0x29be }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x29be }
            r1 = 618(0x26a, float:8.66E-43)     // Catch:{ NoSuchFieldError -> 0x29be }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x29be }
        L_0x29be:
            o.ox r0 = p004o.C0626ox.THROWITEM11     // Catch:{ NoSuchFieldError -> 0x29c9 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x29c9 }
            r1 = 916(0x394, float:1.284E-42)     // Catch:{ NoSuchFieldError -> 0x29c9 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x29c9 }
        L_0x29c9:
            o.ox r0 = p004o.C0626ox.THROWITEM2     // Catch:{ NoSuchFieldError -> 0x29d4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x29d4 }
            r1 = 301(0x12d, float:4.22E-43)     // Catch:{ NoSuchFieldError -> 0x29d4 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x29d4 }
        L_0x29d4:
            o.ox r0 = p004o.C0626ox.THROWITEM3     // Catch:{ NoSuchFieldError -> 0x29df }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x29df }
            r1 = 310(0x136, float:4.34E-43)     // Catch:{ NoSuchFieldError -> 0x29df }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x29df }
        L_0x29df:
            o.ox r0 = p004o.C0626ox.THROWITEM4     // Catch:{ NoSuchFieldError -> 0x29ea }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x29ea }
            r1 = 541(0x21d, float:7.58E-43)     // Catch:{ NoSuchFieldError -> 0x29ea }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x29ea }
        L_0x29ea:
            o.ox r0 = p004o.C0626ox.THROWITEM4_1     // Catch:{ NoSuchFieldError -> 0x29f5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x29f5 }
            r1 = 982(0x3d6, float:1.376E-42)     // Catch:{ NoSuchFieldError -> 0x29f5 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x29f5 }
        L_0x29f5:
            o.ox r0 = p004o.C0626ox.THROWITEM5     // Catch:{ NoSuchFieldError -> 0x2a00 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2a00 }
            r1 = 543(0x21f, float:7.61E-43)     // Catch:{ NoSuchFieldError -> 0x2a00 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2a00 }
        L_0x2a00:
            o.ox r0 = p004o.C0626ox.THROWITEM6     // Catch:{ NoSuchFieldError -> 0x2a0b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2a0b }
            r1 = 602(0x25a, float:8.44E-43)     // Catch:{ NoSuchFieldError -> 0x2a0b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2a0b }
        L_0x2a0b:
            o.ox r0 = p004o.C0626ox.THROWITEM7     // Catch:{ NoSuchFieldError -> 0x2a16 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2a16 }
            r1 = 615(0x267, float:8.62E-43)     // Catch:{ NoSuchFieldError -> 0x2a16 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2a16 }
        L_0x2a16:
            o.ox r0 = p004o.C0626ox.THROWITEM8     // Catch:{ NoSuchFieldError -> 0x2a21 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2a21 }
            r1 = 616(0x268, float:8.63E-43)     // Catch:{ NoSuchFieldError -> 0x2a21 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2a21 }
        L_0x2a21:
            o.ox r0 = p004o.C0626ox.THROWITEM9     // Catch:{ NoSuchFieldError -> 0x2a2c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2a2c }
            r1 = 617(0x269, float:8.65E-43)     // Catch:{ NoSuchFieldError -> 0x2a2c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2a2c }
        L_0x2a2c:
            o.ox r0 = p004o.C0626ox.THROW_BAKURETSU     // Catch:{ NoSuchFieldError -> 0x2a37 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2a37 }
            r1 = 985(0x3d9, float:1.38E-42)     // Catch:{ NoSuchFieldError -> 0x2a37 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2a37 }
        L_0x2a37:
            o.ox r0 = p004o.C0626ox.THROW_HAPPOKUNAI     // Catch:{ NoSuchFieldError -> 0x2a42 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2a42 }
            r1 = 983(0x3d7, float:1.377E-42)     // Catch:{ NoSuchFieldError -> 0x2a42 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2a42 }
        L_0x2a42:
            o.ox r0 = p004o.C0626ox.THROW_MULTIPLE_COIN     // Catch:{ NoSuchFieldError -> 0x2a4d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2a4d }
            r1 = 984(0x3d8, float:1.379E-42)     // Catch:{ NoSuchFieldError -> 0x2a4d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2a4d }
        L_0x2a4d:
            o.ox r0 = p004o.C0626ox.THUNDERSTORM     // Catch:{ NoSuchFieldError -> 0x2a58 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2a58 }
            r1 = 32     // Catch:{ NoSuchFieldError -> 0x2a58 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2a58 }
        L_0x2a58:
            o.ox r0 = p004o.C0626ox.THUNDERSTORM2     // Catch:{ NoSuchFieldError -> 0x2a63 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2a63 }
            r1 = 624(0x270, float:8.74E-43)     // Catch:{ NoSuchFieldError -> 0x2a63 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2a63 }
        L_0x2a63:
            o.ox r0 = p004o.C0626ox.TINDER_BREAKER     // Catch:{ NoSuchFieldError -> 0x2a6e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2a6e }
            r1 = 968(0x3c8, float:1.356E-42)     // Catch:{ NoSuchFieldError -> 0x2a6e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2a6e }
        L_0x2a6e:
            o.ox r0 = p004o.C0626ox.TOPRANK     // Catch:{ NoSuchFieldError -> 0x2a79 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2a79 }
            r1 = 161(0xa1, float:2.26E-43)     // Catch:{ NoSuchFieldError -> 0x2a79 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2a79 }
        L_0x2a79:
            o.ox r0 = p004o.C0626ox.TORCH     // Catch:{ NoSuchFieldError -> 0x2a84 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2a84 }
            r1 = 49     // Catch:{ NoSuchFieldError -> 0x2a84 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2a84 }
        L_0x2a84:
            o.ox r0 = p004o.C0626ox.TORCH_GREEN     // Catch:{ NoSuchFieldError -> 0x2a8f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2a8f }
            r1 = 693(0x2b5, float:9.71E-43)     // Catch:{ NoSuchFieldError -> 0x2a8f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2a8f }
        L_0x2a8f:
            o.ox r0 = p004o.C0626ox.TORCH_PURPLE     // Catch:{ NoSuchFieldError -> 0x2a9a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2a9a }
            r1 = 698(0x2ba, float:9.78E-43)     // Catch:{ NoSuchFieldError -> 0x2a9a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2a9a }
        L_0x2a9a:
            o.ox r0 = p004o.C0626ox.TORCH_RED     // Catch:{ NoSuchFieldError -> 0x2aa5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2aa5 }
            r1 = 692(0x2b4, float:9.7E-43)     // Catch:{ NoSuchFieldError -> 0x2aa5 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2aa5 }
        L_0x2aa5:
            o.ox r0 = p004o.C0626ox.TRACKCASTING     // Catch:{ NoSuchFieldError -> 0x2ab0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2ab0 }
            r1 = 648(0x288, float:9.08E-43)     // Catch:{ NoSuchFieldError -> 0x2ab0 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2ab0 }
        L_0x2ab0:
            o.ox r0 = p004o.C0626ox.TRACKING     // Catch:{ NoSuchFieldError -> 0x2abb }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2abb }
            r1 = 649(0x289, float:9.1E-43)     // Catch:{ NoSuchFieldError -> 0x2abb }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2abb }
        L_0x2abb:
            o.ox r0 = p004o.C0626ox.TRANSBLUEBODY     // Catch:{ NoSuchFieldError -> 0x2ac6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2ac6 }
            r1 = 381(0x17d, float:5.34E-43)     // Catch:{ NoSuchFieldError -> 0x2ac6 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2ac6 }
        L_0x2ac6:
            o.ox r0 = p004o.C0626ox.TRIPLEACTION     // Catch:{ NoSuchFieldError -> 0x2ad1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2ad1 }
            r1 = 650(0x28a, float:9.11E-43)     // Catch:{ NoSuchFieldError -> 0x2ad1 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2ad1 }
        L_0x2ad1:
            o.ox r0 = p004o.C0626ox.TRIPLEATTACK     // Catch:{ NoSuchFieldError -> 0x2adc }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2adc }
            r1 = 331(0x14b, float:4.64E-43)     // Catch:{ NoSuchFieldError -> 0x2adc }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2adc }
        L_0x2adc:
            o.ox r0 = p004o.C0626ox.TRIPLEATTACK2     // Catch:{ NoSuchFieldError -> 0x2ae7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2ae7 }
            r1 = 390(0x186, float:5.47E-43)     // Catch:{ NoSuchFieldError -> 0x2ae7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2ae7 }
        L_0x2ae7:
            o.ox r0 = p004o.C0626ox.TRIPLEATTACK3     // Catch:{ NoSuchFieldError -> 0x2af2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2af2 }
            r1 = 395(0x18b, float:5.54E-43)     // Catch:{ NoSuchFieldError -> 0x2af2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2af2 }
        L_0x2af2:
            o.ox r0 = p004o.C0626ox.TRIPLEATTACK4     // Catch:{ NoSuchFieldError -> 0x2afd }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2afd }
            r1 = 894(0x37e, float:1.253E-42)     // Catch:{ NoSuchFieldError -> 0x2afd }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2afd }
        L_0x2afd:
            o.ox r0 = p004o.C0626ox.TRUESIGHT     // Catch:{ NoSuchFieldError -> 0x2b08 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2b08 }
            r1 = 388(0x184, float:5.44E-43)     // Catch:{ NoSuchFieldError -> 0x2b08 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2b08 }
        L_0x2b08:
            o.ox r0 = p004o.C0626ox.TURNUNDEAD     // Catch:{ NoSuchFieldError -> 0x2b13 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2b13 }
            r1 = 84     // Catch:{ NoSuchFieldError -> 0x2b13 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2b13 }
        L_0x2b13:
            o.ox r0 = p004o.C0626ox.TWILIGHT1     // Catch:{ NoSuchFieldError -> 0x2b1e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2b1e }
            r1 = 575(0x23f, float:8.06E-43)     // Catch:{ NoSuchFieldError -> 0x2b1e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2b1e }
        L_0x2b1e:
            o.ox r0 = p004o.C0626ox.TWILIGHT2     // Catch:{ NoSuchFieldError -> 0x2b29 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2b29 }
            r1 = 576(0x240, float:8.07E-43)     // Catch:{ NoSuchFieldError -> 0x2b29 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2b29 }
        L_0x2b29:
            o.ox r0 = p004o.C0626ox.TWILIGHT3     // Catch:{ NoSuchFieldError -> 0x2b34 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2b34 }
            r1 = 577(0x241, float:8.09E-43)     // Catch:{ NoSuchFieldError -> 0x2b34 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2b34 }
        L_0x2b34:
            o.ox r0 = p004o.C0626ox.TWOHANDQUICKEN     // Catch:{ NoSuchFieldError -> 0x2b3f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2b3f }
            r1 = 132(0x84, float:1.85E-43)     // Catch:{ NoSuchFieldError -> 0x2b3f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2b3f }
        L_0x2b3f:
            o.ox r0 = p004o.C0626ox.UNDEADBODY     // Catch:{ NoSuchFieldError -> 0x2b4a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2b4a }
            r1 = 657(0x291, float:9.2E-43)     // Catch:{ NoSuchFieldError -> 0x2b4a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2b4a }
        L_0x2b4a:
            o.ox r0 = p004o.C0626ox.UNDEADBODY_DEL     // Catch:{ NoSuchFieldError -> 0x2b55 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2b55 }
            r1 = 658(0x292, float:9.22E-43)     // Catch:{ NoSuchFieldError -> 0x2b55 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2b55 }
        L_0x2b55:
            o.ox r0 = p004o.C0626ox.VACUUM     // Catch:{ NoSuchFieldError -> 0x2b60 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2b60 }
            r1 = 923(0x39b, float:1.293E-42)     // Catch:{ NoSuchFieldError -> 0x2b60 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2b60 }
        L_0x2b60:
            o.ox r0 = p004o.C0626ox.VALLENTINE     // Catch:{ NoSuchFieldError -> 0x2b6b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2b6b }
            r1 = 365(0x16d, float:5.11E-43)     // Catch:{ NoSuchFieldError -> 0x2b6b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2b6b }
        L_0x2b6b:
            o.ox r0 = p004o.C0626ox.VALLENTINE2     // Catch:{ NoSuchFieldError -> 0x2b76 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2b76 }
            r1 = 366(0x16e, float:5.13E-43)     // Catch:{ NoSuchFieldError -> 0x2b76 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2b76 }
        L_0x2b76:
            o.ox r0 = p004o.C0626ox.VENOMDUST     // Catch:{ NoSuchFieldError -> 0x2b81 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2b81 }
            r1 = 126(0x7e, float:1.77E-43)     // Catch:{ NoSuchFieldError -> 0x2b81 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2b81 }
        L_0x2b81:
            o.ox r0 = p004o.C0626ox.VENOMDUST2     // Catch:{ NoSuchFieldError -> 0x2b8c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2b8c }
            r1 = 173(0xad, float:2.42E-43)     // Catch:{ NoSuchFieldError -> 0x2b8c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2b8c }
        L_0x2b8c:
            o.ox r0 = p004o.C0626ox.VENOMFOG     // Catch:{ NoSuchFieldError -> 0x2b97 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2b97 }
            r1 = 1022(0x3fe, float:1.432E-42)     // Catch:{ NoSuchFieldError -> 0x2b97 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2b97 }
        L_0x2b97:
            o.ox r0 = p004o.C0626ox.VENOMIMPRESS     // Catch:{ NoSuchFieldError -> 0x2ba2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2ba2 }
            r1 = 790(0x316, float:1.107E-42)     // Catch:{ NoSuchFieldError -> 0x2ba2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2ba2 }
        L_0x2ba2:
            o.ox r0 = p004o.C0626ox.VERDURE_TRAP     // Catch:{ NoSuchFieldError -> 0x2bad }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2bad }
            r1 = 744(0x2e8, float:1.043E-42)     // Catch:{ NoSuchFieldError -> 0x2bad }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2bad }
        L_0x2bad:
            o.ox r0 = p004o.C0626ox.VIOLENTGALE     // Catch:{ NoSuchFieldError -> 0x2bb8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2bb8 }
            r1 = 239(0xef, float:3.35E-43)     // Catch:{ NoSuchFieldError -> 0x2bb8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2bb8 }
        L_0x2bb8:
            o.ox r0 = p004o.C0626ox.VOLCANIC_ASH     // Catch:{ NoSuchFieldError -> 0x2bc3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2bc3 }
            r1 = 977(0x3d1, float:1.369E-42)     // Catch:{ NoSuchFieldError -> 0x2bc3 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2bc3 }
        L_0x2bc3:
            o.ox r0 = p004o.C0626ox.VOLCANO     // Catch:{ NoSuchFieldError -> 0x2bce }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2bce }
            r1 = 227(0xe3, float:3.18E-43)     // Catch:{ NoSuchFieldError -> 0x2bce }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2bce }
        L_0x2bce:
            o.ox r0 = p004o.C0626ox.VULCANWAV     // Catch:{ NoSuchFieldError -> 0x2bd9 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2bd9 }
            r1 = 778(0x30a, float:1.09E-42)     // Catch:{ NoSuchFieldError -> 0x2bd9 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2bd9 }
        L_0x2bd9:
            o.ox r0 = p004o.C0626ox.WALLOFTHORN     // Catch:{ NoSuchFieldError -> 0x2be4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2be4 }
            r1 = 914(0x392, float:1.281E-42)     // Catch:{ NoSuchFieldError -> 0x2be4 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2be4 }
        L_0x2be4:
            o.ox r0 = p004o.C0626ox.WARP     // Catch:{ NoSuchFieldError -> 0x2bef }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2bef }
            r1 = 10     // Catch:{ NoSuchFieldError -> 0x2bef }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2bef }
        L_0x2bef:
            o.ox r0 = p004o.C0626ox.WARPZONE     // Catch:{ NoSuchFieldError -> 0x2bfa }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2bfa }
            r1 = 63     // Catch:{ NoSuchFieldError -> 0x2bfa }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2bfa }
        L_0x2bfa:
            o.ox r0 = p004o.C0626ox.WARPZONE2     // Catch:{ NoSuchFieldError -> 0x2c05 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2c05 }
            r1 = 323(0x143, float:4.53E-43)     // Catch:{ NoSuchFieldError -> 0x2c05 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2c05 }
        L_0x2c05:
            o.ox r0 = p004o.C0626ox.WATERBALL     // Catch:{ NoSuchFieldError -> 0x2c10 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2c10 }
            r1 = 118(0x76, float:1.65E-43)     // Catch:{ NoSuchFieldError -> 0x2c10 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2c10 }
        L_0x2c10:
            o.ox r0 = p004o.C0626ox.WATERBALL2     // Catch:{ NoSuchFieldError -> 0x2c1b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2c1b }
            r1 = 119(0x77, float:1.67E-43)     // Catch:{ NoSuchFieldError -> 0x2c1b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2c1b }
        L_0x2c1b:
            o.ox r0 = p004o.C0626ox.WATERBALL3     // Catch:{ NoSuchFieldError -> 0x2c26 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2c26 }
            r1 = 944(0x3b0, float:1.323E-42)     // Catch:{ NoSuchFieldError -> 0x2c26 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2c26 }
        L_0x2c26:
            o.ox r0 = p004o.C0626ox.WATERFALL     // Catch:{ NoSuchFieldError -> 0x2c31 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2c31 }
            r1 = 351(0x15f, float:4.92E-43)     // Catch:{ NoSuchFieldError -> 0x2c31 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2c31 }
        L_0x2c31:
            o.ox r0 = p004o.C0626ox.WATERFALL_90     // Catch:{ NoSuchFieldError -> 0x2c3c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2c3c }
            r1 = 352(0x160, float:4.93E-43)     // Catch:{ NoSuchFieldError -> 0x2c3c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2c3c }
        L_0x2c3c:
            o.ox r0 = p004o.C0626ox.WATERFALL_ANI     // Catch:{ NoSuchFieldError -> 0x2c47 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2c47 }
            r1 = 823(0x337, float:1.153E-42)     // Catch:{ NoSuchFieldError -> 0x2c47 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2c47 }
        L_0x2c47:
            o.ox r0 = p004o.C0626ox.WATERFALL_SMALL     // Catch:{ NoSuchFieldError -> 0x2c52 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2c52 }
            r1 = 353(0x161, float:4.95E-43)     // Catch:{ NoSuchFieldError -> 0x2c52 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2c52 }
        L_0x2c52:
            o.ox r0 = p004o.C0626ox.WATERFALL_SMALL_90     // Catch:{ NoSuchFieldError -> 0x2c5d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2c5d }
            r1 = 354(0x162, float:4.96E-43)     // Catch:{ NoSuchFieldError -> 0x2c5d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2c5d }
        L_0x2c5d:
            o.ox r0 = p004o.C0626ox.WATERFALL_SMALL_T2     // Catch:{ NoSuchFieldError -> 0x2c68 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2c68 }
            r1 = 357(0x165, float:5.0E-43)     // Catch:{ NoSuchFieldError -> 0x2c68 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2c68 }
        L_0x2c68:
            o.ox r0 = p004o.C0626ox.WATERFALL_SMALL_T2_90     // Catch:{ NoSuchFieldError -> 0x2c73 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2c73 }
            r1 = 358(0x166, float:5.02E-43)     // Catch:{ NoSuchFieldError -> 0x2c73 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2c73 }
        L_0x2c73:
            o.ox r0 = p004o.C0626ox.WATERFALL_T2     // Catch:{ NoSuchFieldError -> 0x2c7e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2c7e }
            r1 = 355(0x163, float:4.97E-43)     // Catch:{ NoSuchFieldError -> 0x2c7e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2c7e }
        L_0x2c7e:
            o.ox r0 = p004o.C0626ox.WATERFALL_T2_90     // Catch:{ NoSuchFieldError -> 0x2c89 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2c89 }
            r1 = 356(0x164, float:4.99E-43)     // Catch:{ NoSuchFieldError -> 0x2c89 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2c89 }
        L_0x2c89:
            o.ox r0 = p004o.C0626ox.WATER_BELOW     // Catch:{ NoSuchFieldError -> 0x2c94 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2c94 }
            r1 = 840(0x348, float:1.177E-42)     // Catch:{ NoSuchFieldError -> 0x2c94 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2c94 }
        L_0x2c94:
            o.ox r0 = p004o.C0626ox.WATER_FADE     // Catch:{ NoSuchFieldError -> 0x2c9f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2c9f }
            r1 = 841(0x349, float:1.178E-42)     // Catch:{ NoSuchFieldError -> 0x2c9f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2c9f }
        L_0x2c9f:
            o.ox r0 = p004o.C0626ox.WATER_SMOKE     // Catch:{ NoSuchFieldError -> 0x2caa }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2caa }
            r1 = 848(0x350, float:1.188E-42)     // Catch:{ NoSuchFieldError -> 0x2caa }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2caa }
        L_0x2caa:
            o.ox r0 = p004o.C0626ox.WEWISH     // Catch:{ NoSuchFieldError -> 0x2cb5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2cb5 }
            r1 = 719(0x2cf, float:1.008E-42)     // Catch:{ NoSuchFieldError -> 0x2cb5 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2cb5 }
        L_0x2cb5:
            o.ox r0 = p004o.C0626ox.WHITE_NUMBER     // Catch:{ NoSuchFieldError -> 0x2cc0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2cc0 }
            r1 = 664(0x298, float:9.3E-43)     // Catch:{ NoSuchFieldError -> 0x2cc0 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2cc0 }
        L_0x2cc0:
            o.ox r0 = p004o.C0626ox.WIDECONFUSE     // Catch:{ NoSuchFieldError -> 0x2ccb }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2ccb }
            r1 = 672(0x2a0, float:9.42E-43)     // Catch:{ NoSuchFieldError -> 0x2ccb }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2ccb }
        L_0x2ccb:
            o.ox r0 = p004o.C0626ox.WIND     // Catch:{ NoSuchFieldError -> 0x2cd6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2cd6 }
            r1 = 226(0xe2, float:3.17E-43)     // Catch:{ NoSuchFieldError -> 0x2cd6 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2cd6 }
        L_0x2cd6:
            o.ox r0 = p004o.C0626ox.WINDCUTTER     // Catch:{ NoSuchFieldError -> 0x2ce1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2ce1 }
            r1 = 726(0x2d6, float:1.017E-42)     // Catch:{ NoSuchFieldError -> 0x2ce1 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2ce1 }
        L_0x2ce1:
            o.ox r0 = p004o.C0626ox.WINDHIT     // Catch:{ NoSuchFieldError -> 0x2cec }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2cec }
            r1 = 54     // Catch:{ NoSuchFieldError -> 0x2cec }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2cec }
        L_0x2cec:
            o.ox r0 = p004o.C0626ox.WINK     // Catch:{ NoSuchFieldError -> 0x2cf7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2cf7 }
            r1 = 609(0x261, float:8.53E-43)     // Catch:{ NoSuchFieldError -> 0x2cf7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2cf7 }
        L_0x2cf7:
            o.ox r0 = p004o.C0626ox.WL_TELEKINESIS_INTENSE     // Catch:{ NoSuchFieldError -> 0x2d02 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2d02 }
            r1 = 1034(0x40a, float:1.449E-42)     // Catch:{ NoSuchFieldError -> 0x2d02 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2d02 }
        L_0x2d02:
            o.ox r0 = p004o.C0626ox.WM_FRIGG_SONG     // Catch:{ NoSuchFieldError -> 0x2d0d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2d0d }
            r1 = 1045(0x415, float:1.464E-42)     // Catch:{ NoSuchFieldError -> 0x2d0d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2d0d }
        L_0x2d0d:
            o.ox r0 = p004o.C0626ox.YELLOWFLY1     // Catch:{ NoSuchFieldError -> 0x2d18 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2d18 }
            r1 = 715(0x2cb, float:1.002E-42)     // Catch:{ NoSuchFieldError -> 0x2d18 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2d18 }
        L_0x2d18:
            o.ox r0 = p004o.C0626ox.YELLOWFLY2     // Catch:{ NoSuchFieldError -> 0x2d23 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2d23 }
            r1 = 716(0x2cc, float:1.003E-42)     // Catch:{ NoSuchFieldError -> 0x2d23 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2d23 }
        L_0x2d23:
            o.ox r0 = p004o.C0626ox.YELLOWFLY3     // Catch:{ NoSuchFieldError -> 0x2d2e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2d2e }
            r1 = 948(0x3b4, float:1.328E-42)     // Catch:{ NoSuchFieldError -> 0x2d2e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2d2e }
        L_0x2d2e:
            o.ox r0 = p004o.C0626ox.YELLOW_NUMBER     // Catch:{ NoSuchFieldError -> 0x2d39 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2d39 }
            r1 = 665(0x299, float:9.32E-43)     // Catch:{ NoSuchFieldError -> 0x2d39 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2d39 }
        L_0x2d39:
            o.ox r0 = p004o.C0626ox.YUFITEL     // Catch:{ NoSuchFieldError -> 0x2d44 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2d44 }
            r1 = 95     // Catch:{ NoSuchFieldError -> 0x2d44 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2d44 }
        L_0x2d44:
            o.ox r0 = p004o.C0626ox.YUFITEL2     // Catch:{ NoSuchFieldError -> 0x2d4f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2d4f }
            r1 = 454(0x1c6, float:6.36E-43)     // Catch:{ NoSuchFieldError -> 0x2d4f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2d4f }
        L_0x2d4f:
            o.ox r0 = p004o.C0626ox.YUFITELHIT     // Catch:{ NoSuchFieldError -> 0x2d5a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2d5a }
            r1 = 96     // Catch:{ NoSuchFieldError -> 0x2d5a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2d5a }
        L_0x2d5a:
            o.ox r0 = p004o.C0626ox.ZANGETSU     // Catch:{ NoSuchFieldError -> 0x2d65 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2d65 }
            r1 = 1012(0x3f4, float:1.418E-42)     // Catch:{ NoSuchFieldError -> 0x2d65 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2d65 }
        L_0x2d65:
            o.ox r0 = p004o.C0626ox._05VAL     // Catch:{ NoSuchFieldError -> 0x2d70 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2d70 }
            r1 = 511(0x1ff, float:7.16E-43)     // Catch:{ NoSuchFieldError -> 0x2d70 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2d70 }
        L_0x2d70:
            o.ox r0 = p004o.C0626ox._2011RWC     // Catch:{ NoSuchFieldError -> 0x2d7b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2d7b }
            r1 = 989(0x3dd, float:1.386E-42)     // Catch:{ NoSuchFieldError -> 0x2d7b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2d7b }
        L_0x2d7b:
            o.ox r0 = p004o.C0626ox._2011RWC2     // Catch:{ NoSuchFieldError -> 0x2d86 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2d86 }
            r1 = 990(0x3de, float:1.387E-42)     // Catch:{ NoSuchFieldError -> 0x2d86 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2d86 }
        L_0x2d86:
            o.ox r0 = p004o.C0626ox._4WAYBODY     // Catch:{ NoSuchFieldError -> 0x2d91 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x2d91 }
            r1 = 427(0x1ab, float:5.98E-43)     // Catch:{ NoSuchFieldError -> 0x2d91 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x2d91 }
        L_0x2d91:
            f8501 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1885.m2554():int[]");
    }

    static {
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        if (this.f8511 != null) {
            this.f8511.mo3601();
        }
        if (this.f8510 != null) {
            Iterator it = this.f8510.iterator();
            while (it.hasNext()) {
                ((C1452) it.next()).mo4344();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final C0526lj mo4553() {
        if (this.f8507 != null) {
            return this.f8507;
        }
        if (this.f8504 == null || this.f8504.f1707 == null) {
            return new C0526lj(0.0f, 0.0f, 0.0f);
        }
        return this.f8504.f1707;
    }

    /* renamed from: 鷭 */
    private C0251co m2555(String str) {
        String lowerCase = str.toLowerCase();
        if (!lowerCase.endsWith(".str")) {
            lowerCase = new StringBuilder(String.valueOf(lowerCase)).append(".str").toString();
        }
        C0251co coVar = (C0251co) C0246cj.m229(lowerCase.replace("\\", "/"), C0251co.class);
        this.f8511 = coVar;
        return coVar;
    }

    C1885(C0545lz lzVar, C0626ox oxVar) {
        m2556(lzVar, null, oxVar);
    }

    C1885(C0548mb mbVar, C0548mb mbVar2, C0626ox oxVar) {
        m2556(mbVar, mbVar2, oxVar);
    }

    /* renamed from: 鷭 */
    private void m2556(C0548mb mbVar, C0548mb mbVar2, C0626ox oxVar) {
        this.f8506 = oxVar;
        this.f8507 = null;
        this.f8505 = null;
        this.f8504 = mbVar;
        this.f8508 = mbVar2;
        this.f8509 = 0 == 0 ? System.currentTimeMillis() : 0;
        Random random = new Random(System.currentTimeMillis());
        switch (m2554()[oxVar.ordinal()]) {
            case 2:
                C1452 r13 = new C1452(this, C0433if.EP_3DCYLINDER);
                r13.f7103 = (C0405hk) C0246cj.m229("effect/ring_blue.tga", C0405hk.class);
                r13.f7094.f1651 = 10.0f;
                r13.f7086 = 166;
                r13.f7088 = 166;
                C1452 r0 = r13;
                r0.mo4345(r0.f7081, 2, 0.0f, 5.25f, 0.0f, 0.0f, -0.5f, 1.0f);
                C0526lj ljVar = new C0526lj(mo4553());
                C0526lj ljVar2 = this.f8505 != null ? this.f8505 : (this.f8508 == null || this.f8508.f1707 == null) ? new C0526lj(0.0f, 0.0f, 0.0f) : this.f8508.f1707;
                C0526lj r12 = ljVar.mo3961(ljVar2);
                C1452 r02 = r13;
                float atan2 = (float) ((Math.atan2((double) r12.f1651, Math.sqrt((double) ((r12.f1652 * r12.f1652) + (r12.f1650 * r12.f1650)))) / 3.141592653589793d) * 180.0d);
                r02.mo4345(r02.f7090, 2, atan2, atan2, 0.0f, 0.0f, 0.0f, 1.0f);
                float atan22 = (float) ((Math.atan2((double) r12.f1652, (double) r12.f1650) / 3.141592653589793d) * 180.0d);
                C1452 r03 = r13;
                float f = atan22;
                r03.mo4345(r03.f7090, 1, f, f, 0.0f, 0.0f, 0.0f, 1.0f);
                C1452 r04 = r13;
                r04.mo4345(r04.f7101, 0, 5.0f, 5.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                C1452 r05 = r13;
                r05.mo4345(r05.f7101, 1, 10.0f, 10.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                C1452 r06 = r13;
                r06.mo4345(r06.f7101, 2, 3.5f, 3.5f, 0.0f, 0.0f, 0.0f, 1.0f);
                r13.f7098 = 0.5f;
                this.f8510.add(r13);
                for (int i = 0; i < 6; i++) {
                    C1452 r132 = new C1452(this, C0433if.EP_3DPARTICLE);
                    r132.f7103 = (C0405hk) C0246cj.m229("이팩트/particle1", C0405hk.class);
                    C1452 r07 = r132;
                    r07.mo4345(r07.f7101, 0, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                    C1452 r08 = r132;
                    r08.mo4345(r08.f7101, 1, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                    r132.f7078 = true;
                    C1452 r09 = r132;
                    r09.mo4345(r09.f7101, 0, 1.1f, 1.1f, -0.5f, 0.0f, 0.0f, 1.0f);
                    r132.f7101[1] = r132.f7101[0];
                    C1452 r9 = r132;
                    r132.f7088 = 292;
                    r9.f7086 = ((long) (((Math.random() * 2.0d) - 1.0d) * 192.0d)) + 292;
                    r9.f7099 = 50;
                    r132.f7094.f1651 = 10.0f;
                    C1452 r010 = r132;
                    r010.mo4345(r010.f7081, 3, 5.5f, 19.872f, 1.5f, 6.5f, -0.5f, -1.0f);
                    if ((i & 1) > 0) {
                        C1452 r011 = r132;
                        r011.mo4345(r011.f7081, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                        float[] fArr = r132.f7081[1].f7105;
                        fArr[2] = fArr[2] - 50.0f;
                    }
                    C1452 r012 = r132;
                    r012.mo4345(r012.f7090, 2, 50.0f, 50.0f, -50.0f, 0.0f, 0.0f, 1.0f);
                    C1452 r013 = r132;
                    r013.mo4345(r013.f7090, 1, atan22 + ((float) ((i & 1) > 0 ? 180 : 0)), atan22 + ((float) ((i & 1) > 0 ? 180 : 0)), -40.0f, 0.0f, 0.0f, 1.0f);
                    r132.f7098 = 1.0f;
                    this.f8510.add(r132);
                }
                break;
            case 3:
                C1014.f6136.mo4428("effect/ef_hit2.wav", 1.0f);
                for (int i2 = 0; i2 < 8; i2++) {
                    C1452 r133 = new C1452(this, C0433if.EP_2DTEXTURE_BOTTOM);
                    r133.f7103 = (C0405hk) C0246cj.m229("effect/lens" + ((i2 & 1) + 1) + ".tga", C0405hk.class);
                    r133.f7094.f1651 = 10.0f;
                    C1452 r92 = r133;
                    r133.f7088 = 333;
                    r92.f7086 = ((long) (((Math.random() * 2.0d) - 1.0d) * 166.0d)) + 333;
                    C1452 r014 = r133;
                    r014.mo4345(r014.f7081, 3, 2.5f, 54.0f, 2.5f, 45.0f, -0.5f, 1.0f);
                    C1452 r015 = r133;
                    r015.mo4345(r015.f7101, 0, 12.5f, 0.0f, 7.5f, 0.0f, -1.0f, 1.0f);
                    C1452 r016 = r133;
                    r016.mo4345(r016.f7101, 1, 30.0f, 100.0f, -10.0f, 0.0f, 0.625f, -1.0f);
                    C1452 r017 = r133;
                    r017.mo4345(r017.f7090, 0, (float) (i2 * 45), (float) (i2 * 45), 15.0f, 0.0f, 0.0f, 1.0f);
                    r133.f7098 = 0.25f;
                    this.f8510.add(r133);
                }
                break;
            case 12:
                m2555(f8500 ? "memor_min" : "Maemor");
                break;
            case 15:
            case 317:
                m2555("SafetyWall");
                break;
            case 18:
                C1014.f6136.mo4428("effect/ef_bash.wav", 1.0f);
                C1452 r134 = new C1452(this, C0433if.EP_CIRCLE);
                r134.f7094.f1651 = 10.0f;
                r134.f7086 = 667;
                r134.f7088 = 667;
                r134.f7103 = (C0405hk) C0246cj.m229("effect/alpha_down.tga", C0405hk.class);
                C1452 r018 = r134;
                r018.mo4345(r018.f7101, 0, 100.0f, 100.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                C1452 r019 = r134;
                r019.mo4345(r019.f7101, 1, 100.0f, 100.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                r134.f7102 = 0.6666667f;
                r134.f7098 = 0.25f;
                r134.f7092 = 0.15f;
                this.f8510.add(r134);
                for (int i3 = 0; i3 < 20; i3++) {
                    C1452 r135 = new C1452(this, C0433if.EP_2DFLASH);
                    r135.f7094.f1651 = 10.0f;
                    r135.f7086 = 667;
                    r135.f7088 = 667;
                    r135.f7103 = (C0405hk) C0246cj.m229("effect/alpha_center.tga", C0405hk.class);
                    C1452 r020 = r135;
                    r020.mo4345(r020.f7101, 1, 40.0f, 180.0f, -20.0f, 60.0f, 0.0f, 1.0f);
                    C1452 r021 = r135;
                    r021.mo4345(r021.f7101, 3, 1.75f, 1.75f, 1.25f, 0.0f, 0.0f, 1.0f);
                    C1452 r022 = r135;
                    r022.mo4345(r022.f7090, 0, 180.0f, 76.0f, -180.0f, 78.0f, -0.7f, 1.0f);
                    r135.f7102 = 0.78431374f;
                    r135.f7098 = 0.6666667f;
                    r135.f7092 = 0.25f;
                    r135.f7097 = 1.0f;
                    this.f8510.add(r135);
                }
                break;
            case 19:
                C1014.f6136.mo4428("effect/EF_MagnumBreak.wav", 1.0f);
                C1452 r136 = new C1452(this, C0433if.EP_3DRING);
                r136.f7079 = true;
                r136.f7086 = 500;
                r136.f7088 = 500;
                r136.f7103 = (C0405hk) C0246cj.m229("effect/ring_yellow.tga", C0405hk.class);
                C1452 r023 = r136;
                r023.mo4345(r023.f7090, 2, 90.0f, 90.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                C1452 r024 = r136;
                r024.mo4345(r024.f7081, 3, 0.0f, 37.5f, 0.0f, 0.0f, -0.5f, 1.0f);
                C1452 r025 = r136;
                r025.mo4345(r025.f7101, 0, 12.5f, 12.5f, 0.0f, 0.0f, 0.0f, 1.0f);
                r136.f7092 = 0.5f;
                r136.f7098 = 0.5f;
                this.f8510.add(r136);
                C1452 r137 = new C1452(this, C0433if.EP_3DSPHERE);
                r137.f7086 = 500;
                r137.f7088 = 500;
                r137.f7103 = (C0405hk) C0246cj.m229("effect/대폭발.tga", C0405hk.class);
                C1452 r026 = r137;
                r026.mo4345(r026.f7090, 2, 0.0f, 90.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                C1452 r027 = r137;
                r027.mo4345(r027.f7101, 0, 0.0f, 25.0f, 0.0f, 0.0f, -0.5f, 1.0f);
                C1453if[] ifVarArr = r137.f7101;
                C1453if[] ifVarArr2 = r137.f7101;
                C1453if ifVar = r137.f7101[0];
                ifVarArr2[2] = ifVar;
                ifVarArr[1] = ifVar;
                r137.f7092 = 0.5f;
                r137.f7098 = 0.5f;
                this.f8510.add(r137);
                break;
            case 25:
            case 197:
                m2555("StoneCurse");
                break;
            case 27:
                m2555("Firewall" + (random.nextInt(2) + 1));
                break;
            case 31:
                m2555("Lightning");
                break;
            case 32:
                m2555("ThunderStorm");
                break;
            case MotionEventCompat.AXIS_GENERIC_11 /*42*/:
                m2555("Cross");
                break;
            case 43:
            case 719:
                m2555(f8500 ? "jong_mini" : "Angelus");
                break;
            case 51:
            case 605:
                m2555("FireHit" + (random.nextInt(3) + 1));
                break;
            case 54:
                m2555("WindHit" + (random.nextInt(3) + 1));
                break;
            case 67:
                m2555("Invenom");
                break;
            case 68:
                m2555(f8500 ? "cure_min" : "Cure");
                break;
            case TFTP.DEFAULT_PORT /*69*/:
                m2555("Provoke");
                break;
            case 70:
                m2555("Mvp");
                break;
            case 71:
                m2555("SkidTrap");
                break;
            case 72:
                m2555("Brandish");
                break;
            case 77:
                m2555(f8500 ? "gloria_min" : "Gloria");
                break;
            case 78:
                m2555(f8500 ? "magnificat_min" : "Magnificat");
                break;
            case FingerClient.DEFAULT_PORT /*79*/:
                m2555(f8500 ? "resurrection_min" : "Resurrection");
                break;
            case C0840uf.f5034 /*80*/:
                m2555("Recovery");
                break;
            case 85:
                m2555("Sanctuary");
                break;
            case 86:
                m2555("Impositio");
                break;
            case 87:
                m2555(f8500 ? "lexaeterna_min" : "LexAeterna");
                break;
            case 88:
                m2555("Aspersio");
                break;
            case 89:
                m2555("LexDivina");
                break;
            case 90:
                m2555(f8500 ? "suffragium_min" : "Suffragium");
                break;
            case 91:
                m2555("StormGust");
                break;
            case 92:
                m2555("Lord");
                break;
            case 93:
                m2555("Benedictio");
                break;
            case 94:
                m2555("Meteor" + (random.nextInt(3) + 1));
                break;
            case 97:
                m2555("Quagmire").f644 = false;
                break;
            case 98:
                m2555("FirePillar");
                break;
            case 99:
                m2555("FirePillarBomb");
                break;
            case 103:
                m2555("RepairWeapon");
                break;
            case 104:
                m2555("CrashEarth");
                break;
            case 105:
                m2555(f8500 ? "WeaponPerfection_min" : "WeaponPerfection");
                break;
            case 106:
                m2555(f8500 ? "maximize_min" : "MaximizePower");
                break;
            case 108:
                m2555("BlastMine");
                break;
            case 109:
                m2555("Claymore");
                break;
            case 110:
                m2555("Freezing");
                break;
            case 111:
                m2555("Bubble" + (random.nextInt(4) + 1));
                break;
            case 112:
                m2555("GasPush");
                break;
            case 113:
                m2555("Spring");
                break;
            case 114:
                m2555(f8500 ? "kyrie_min" : "Kyrie");
                break;
            case 115:
                m2555("Magnus");
                break;
            case TransportMediator.KEYCODE_MEDIA_PLAY /*126*/:
                m2555("VenomDust");
                break;
            case 128:
                m2555("PoisonReact_1st");
                break;
            case 129:
                m2555("PoisonReact");
                break;
            case 131:
                m2555("VenomSplasher");
                break;
            case 132:
            case TelnetCommand.WONT /*252*/:
            case 371:
                m2555("TwoHand");
                break;
            case 133:
                m2555("AutoCounter");
                break;
            case 135:
                m2555("Freeze");
                break;
            case 136:
                m2555("Freezed");
                break;
            case 137:
                m2555("IceCrash");
                break;
            case 138:
                m2555("slowp");
                break;
            case 141:
                m2555("SandMan");
                break;
            case IMAP.DEFAULT_PORT /*143*/:
                m2555("Pneuma" + (random.nextInt(3) + 1));
                break;
            case 145:
                m2555("SonicBlow");
                break;
            case 146:
                m2555("Brandish2");
                break;
            case 147:
                m2555("ShockWave");
                break;
            case 148:
                m2555("ShockWaveHit");
                break;
            case 149:
                m2555("EarthHit");
                break;
            case FTPReply.FILE_STATUS_OK /*150*/:
                m2555("Pierce");
                break;
            case 151:
                m2555("Bowling");
                break;
            case 152:
                m2555("SpearStab");
                break;
            case 153:
                m2555("SpearBoomerang");
                break;
            case 154:
                m2555("HolyHit");
                break;
            case 155:
            case 752:
                m2555("Concentration");
                break;
            case 156:
                m2555("bs_RefineSuccess");
                break;
            case 157:
                m2555("bs_RefineFailed");
                break;
            case 158:
                m2555("JobChange");
                break;
            case 159:
                m2555("LevelUP");
                break;
            case 160:
                m2555("JobLvUP");
                break;
            case 169:
                m2555("TamingSuccess");
                break;
            case 170:
                m2555("TamingFailed");
                break;
            case 171:
                m2555("EnergyCoat");
                break;
            case 172:
                m2555("CartRevolution");
                break;
            case 183:
                m2555("MentalBreak");
                break;
            case 184:
                m2555("magical");
                break;
            case 185:
                m2555("sui_explosion");
                break;
            case 187:
                m2555("suicide");
                break;
            case 188:
                m2555("yunta_1");
                break;
            case 189:
                m2555("yunta_2");
                break;
            case 190:
                m2555("yunta_3");
                break;
            case 191:
                m2555("yunta_4");
                break;
            case 192:
                m2555("yunta_5");
                break;
            case 193:
                m2555("homing");
                break;
            case 194:
                m2555("poison");
                break;
            case 195:
                m2555("silence");
                break;
            case 196:
                m2555("stun");
                break;
            case NNTPReply.DEBUG_OUTPUT /*199*/:
                m2555("sleep");
                break;
            case 201:
                m2555("Pong" + (random.nextInt(3) + 1));
                break;
            case HttpStatus.SC_PARTIAL_CONTENT /*206*/:
                m2555("빨간포션");
                break;
            case HttpStatus.SC_MULTI_STATUS /*207*/:
                m2555("주홍포션");
                break;
            case 208:
                m2555("노란포션");
                break;
            case 209:
                m2555("하얀포션");
                break;
            case 210:
                m2555("파란포션");
                break;
            case 211:
                m2555("초록포션");
                break;
            case FTPReply.DIRECTORY_STATUS /*212*/:
                m2555("fruit");
                break;
            case FTPReply.FILE_STATUS /*213*/:
                m2555("fruit_");
                break;
            case FTPReply.NAME_SYSTEM_TYPE /*215*/:
                m2555("Deffender");
                break;
            case 216:
                m2555("Keeping");
                break;
            case 220:
                m2555("집중");
                break;
            case 221:
                m2555("각성");
                break;
            case NNTPReply.ARTICLE_RETRIEVED_BODY_FOLLOWS /*222*/:
            case 758:
                m2555("버서크");
                break;
            case TelnetCommand.EOF /*236*/:
                m2555("spell");
                break;
            case TelnetCommand.SUSP /*237*/:
                m2555("디스펠");
                break;
            case TelnetCommand.AYT /*246*/:
                m2555("매직로드");
                break;
            case TelnetCommand.f8996EC /*247*/:
                m2555("holy_cross");
                break;
            case TelnetCommand.f8997EL /*248*/:
                m2555("shield_charge");
                break;
            case 250:
                m2555("providence");
                break;
            case TelnetCommand.f8995DO /*253*/:
                m2555("devotion");
                break;
            case 257:
                m2555("enc_fire");
                break;
            case 258:
                m2555("enc_ice");
                break;
            case 259:
                m2555("enc_wind");
                break;
            case 260:
                m2555("enc_earth");
                break;
            case 270:
                m2555("steal_coin");
                break;
            case 271:
                m2555("strip_weapon");
                break;
            case 272:
                m2555("strip_shield");
                break;
            case 273:
                m2555("strip_armor");
                break;
            case 274:
                m2555("strip_helm");
                break;
            case 275:
                m2555("연환");
                break;
            case HttpStatus.SC_TEMPORARY_REDIRECT /*307*/:
                m2555("p_success");
                break;
            case 308:
                m2555("p_failed");
                break;
            case 311:
                this.f8507 = new C0526lj(mo4553());
                C1014.f6136.mo4428("_heal_effect", 1.0f);
                C1452 r138 = new C1452(this, C0433if.EP_2DTEXTURE);
                r138.f7082 = new float[]{0.5f, 0.5f, 1.0f};
                r138.f7094.f1651 = 12.0f;
                r138.f7086 = 3000;
                r138.f7088 = 3000;
                C1452 r028 = r138;
                r028.mo4345(r028.f7101, 3, 180.0f, 720.0f, -180.0f, 0.0f, 0.0f, 1.0f);
                r138.f7103 = (C0405hk) C0246cj.m229("effect/pikapika2.bmp", C0405hk.class);
                C1452 r029 = r138;
                r029.mo4345(r029.f7101, 0, 100.0f, 100.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                C1452 r030 = r138;
                r030.mo4345(r030.f7101, 1, 100.0f, 100.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                r138.f7095 = 5.0f;
                C1452 r031 = r138;
                r031.mo4345(r031.f7090, 0, 180.0f, 180.0f, -180.0f, 0.0f, 0.0f, 1.0f);
                r138.f7102 = 0.3137255f;
                r138.f7098 = 0.11111111f;
                r138.f7092 = 0.44444445f;
                r138.f7078 = true;
                this.f8510.add(r138);
                break;
            case 313:
                m2555("loud");
                break;
            case 339:
                m2555("look 158");
                break;
            case 373:
                m2555("angel");
                break;
            case 374:
            case 1026:
                m2555("devil");
                break;
            case 392:
                m2555("melt");
                break;
            case 393:
                m2555("cart");
                break;
            case 394:
                m2555("sword");
                break;
            case HttpStatus.SC_REQUEST_TIMEOUT /*408*/:
                m2555("소울번");
                break;
            case HttpStatus.SC_CONFLICT /*409*/:
                m2555("사람효과");
                break;
            case 442:
                m2555("asum");
                break;
            case 493:
                m2555("찹쌀떡");
                break;
            case 494:
                m2555("ramadan");
                break;
            case 509:
                m2555("mapae");
                break;
            case 510:
            case 614:
                m2555("itempokjuk");
                break;
            case 567:
                m2555("moonlight_1");
                break;
            case 568:
                m2555("moonlight_2");
                break;
            case 569:
                m2555("moonlight_3");
                break;
            case 570:
                m2555("h_levelup");
                break;
            case 571:
                m2555("defense");
                break;
            case 595:
                m2555("food_str");
                break;
            case 596:
                m2555("food_int");
                break;
            case 597:
                m2555("food_vit");
                break;
            case 598:
                m2555("food_agi");
                break;
            case 599:
                m2555("food_dex");
                break;
            case 600:
                m2555("food_luk");
                break;
            case 610:
                m2555("cook_suc");
                break;
            case 611:
                m2555("cook_fail");
                break;
            case 637:
                m2555("fire dragon");
                break;
            case 638:
                m2555("icy");
                break;
            case 648:
                m2555("트랙킹");
                break;
            case 651:
                m2555("불스아이");
                break;
            case 670:
            case 672:
                m2555("dfear");
                break;
            case 671:
                m2555("wideb");
                break;
            case 679:
                m2555("cwound");
                break;
            case 701:
                m2555("flower_leaf");
                break;
            case 706:
                m2555("mobile_ef02");
                break;
            case 707:
                m2555("mobile_ef01");
                break;
            case 708:
                m2555("mobile_ef03");
                break;
            case 710:
                m2555("storm_min");
                break;
            case 711:
                m2555("pokjuk_jap");
                break;
            case 723:
                m2555("ado");
                break;
            case 724:
                m2555("이그니션브레이크");
                break;
            case 729:
                m2555("crimson_r");
                break;
            case 730:
                m2555("hell_in");
                break;
            case 733:
                m2555("dragon_h");
                break;
            case 736:
                m2555("chainlight");
                break;
            case 747:
                m2555("aimed");
                break;
            case 748:
                m2555("arrowstorm");
                break;
            case 749:
                m2555("laulamus");
                break;
            case 750:
                m2555("lauagnus");
                break;
            case 751:
                m2555("mil_shield");
                break;
            case 797:
                m2555("powerswing");
                break;
            case 815:
                m2555("enervation");
                break;
            case 816:
                m2555("groomy");
                break;
            case 817:
                m2555("ignorance");
                break;
            case 818:
                m2555("laziness");
                break;
            case 819:
                m2555("unlucky");
                break;
            case 820:
                m2555("weakness");
                break;
            case 922:
                m2555("Firewall_per");
                break;
            case 928:
                m2555("hunter_shockwave_blue");
                break;
            case 961:
                m2555("poison_mist");
                break;
            case 962:
                m2555("eraser_cutter");
                break;
            case 966:
                m2555("lava_slide");
                break;
            case 967:
                m2555("sonic_claw");
                break;
            case 968:
                m2555("tinder");
                break;
            case 969:
                m2555("mid_frenzy");
                break;
            case 977:
                m2555("vash00");
                break;
            case FTPSClient.DEFAULT_FTPS_DATA_PORT /*989*/:
                m2555("rwc2011");
                break;
            case FTPSClient.DEFAULT_FTPS_PORT /*990*/:
                m2555("rwc2011_2");
                break;
            case 1008:
                m2555("100");
                break;
            case 1017:
                m2555("rune_success");
                break;
            case 1018:
                m2555("rune_fail");
                break;
            case 1019:
                m2555("changematerial_su");
                break;
            case 1020:
                m2555("changematerial_fa");
                break;
            case 1021:
                m2555("Guardian");
                break;
            case 1022:
                m2555("bubble%d_1");
                break;
            case RCommandClient.MAX_CLIENT_PORT /*1023*/:
                m2555("dust");
                break;
            case 1024:
                m2555("dancingblade");
                break;
            case InputDeviceCompat.SOURCE_GAMEPAD /*1025*/:
                m2555("INVINCIBLEOFF2");
                break;
            case 1027:
                m2555("gc_darkcrow");
                break;
            case 1029:
                m2555("all_full_throttle");
                break;
            case 1030:
                m2555("sr_flashcombo");
                break;
            case 1031:
                m2555("rk_luxanima");
                break;
            case 1032:
                m2555("so_elemental_shield");
                break;
            case 1033:
                m2555("AB_OFFERTORIUM");
                break;
            case 1035:
                m2555("GN_ILLUSIONDOPING");
                break;
            case 1036:
                m2555("NC_MAGMA_ERUPTION");
                break;
            case 1041:
                m2555("chill");
                break;
            case 1043:
                m2555("WL_TELEKINESIS_INTENSE");
                break;
        }
        if (this.f8510.size() == 0) {
            this.f8510 = null;
        }
    }
}
