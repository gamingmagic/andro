package p004o;

import android.support.p000v4.view.MotionEventCompat;
import android.widget.Toast;
import java.nio.ByteBuffer;
import p004o.C0643pc.aux;

/* renamed from: o.ㇺ */
final class C1404 extends C0762sz {

    /* renamed from: 鷭 */
    private static /* synthetic */ int[] f6965;

    C1404() {
    }

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
    /* JADX WARNING: Missing exception handler attribute for start block: B:100:0x021b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:102:0x0226 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:104:0x0231 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:106:0x023c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:108:0x0247 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:110:0x0252 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:112:0x025d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:114:0x0268 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:116:0x0273 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:118:0x027e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:120:0x0289 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:126:0x02aa */
    /* JADX WARNING: Missing exception handler attribute for start block: B:128:0x02b5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0038 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:130:0x02c0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:132:0x02cb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:134:0x02d6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:136:0x02e1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:138:0x02ec */
    /* JADX WARNING: Missing exception handler attribute for start block: B:140:0x02f7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:142:0x0302 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:144:0x030d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:146:0x0318 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:148:0x0323 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0043 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:150:0x032e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:152:0x0339 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:154:0x0344 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:156:0x034f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:158:0x035a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:160:0x0365 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:162:0x0370 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:164:0x037b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:166:0x0386 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:168:0x0391 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x004e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:170:0x039c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:172:0x03a6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:174:0x03b1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:176:0x03bc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:178:0x03c7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:180:0x03d2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:182:0x03dd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:184:0x03e8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:186:0x03f3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:188:0x03fe */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0059 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:190:0x0409 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:192:0x0414 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:194:0x041f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:196:0x042a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:198:0x0435 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:200:0x0440 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:202:0x044b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:204:0x0456 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:206:0x0460 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:208:0x046b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0064 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:210:0x0475 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:212:0x0480 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:220:0x04ac */
    /* JADX WARNING: Missing exception handler attribute for start block: B:222:0x04b7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:224:0x04c2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:226:0x04cd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:228:0x04d8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x006f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:230:0x04e3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:232:0x04ee */
    /* JADX WARNING: Missing exception handler attribute for start block: B:234:0x04f9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:236:0x0504 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:238:0x050f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:240:0x0519 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:242:0x0524 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:244:0x052f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:246:0x053a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:248:0x0544 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x007a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:250:0x054f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:252:0x055a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:254:0x0565 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:256:0x0570 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:258:0x057b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:260:0x0586 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:262:0x0591 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:264:0x059c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:266:0x05a7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:268:0x05b2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:270:0x05bd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:272:0x05c8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:274:0x05d3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:276:0x05de */
    /* JADX WARNING: Missing exception handler attribute for start block: B:278:0x05e9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:280:0x05f4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:282:0x05ff */
    /* JADX WARNING: Missing exception handler attribute for start block: B:284:0x060a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:286:0x0615 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:288:0x0620 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:290:0x062b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:292:0x0636 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:294:0x0641 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:296:0x064c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:298:0x0657 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:300:0x0662 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:302:0x066d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:304:0x0678 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:306:0x0683 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:314:0x06af */
    /* JADX WARNING: Missing exception handler attribute for start block: B:316:0x06ba */
    /* JADX WARNING: Missing exception handler attribute for start block: B:318:0x06c5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:320:0x06d0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:322:0x06db */
    /* JADX WARNING: Missing exception handler attribute for start block: B:324:0x06e6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:326:0x06f1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:328:0x06fc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:330:0x0707 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:332:0x0712 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:334:0x071c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:336:0x0727 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:338:0x0732 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:340:0x073d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:342:0x0748 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:344:0x0753 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:346:0x075e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:348:0x0769 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00b1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:350:0x0774 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:352:0x077f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:354:0x078a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:356:0x0795 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:358:0x07a0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:360:0x07ab */
    /* JADX WARNING: Missing exception handler attribute for start block: B:362:0x07b6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:364:0x07c1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:366:0x07cc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:368:0x07d7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00bc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:370:0x07e2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:372:0x07ed */
    /* JADX WARNING: Missing exception handler attribute for start block: B:374:0x07f8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:376:0x0803 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:378:0x080e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:380:0x0819 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:382:0x0824 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:384:0x082f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:386:0x083a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:388:0x0845 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00c7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:390:0x0850 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:392:0x085b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:394:0x0866 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:396:0x0871 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:398:0x087c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:400:0x0887 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:408:0x08b3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00d2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:410:0x08be */
    /* JADX WARNING: Missing exception handler attribute for start block: B:412:0x08c9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:414:0x08d4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:416:0x08df */
    /* JADX WARNING: Missing exception handler attribute for start block: B:418:0x08ea */
    /* JADX WARNING: Missing exception handler attribute for start block: B:420:0x08f5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:422:0x0900 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:424:0x090b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:426:0x0916 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:428:0x0921 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00dd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:430:0x092c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:432:0x0937 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00e8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00f3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00fe */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x0109 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x0114 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x011f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x012a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x0135 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x0140 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x014b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x0156 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x0161 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x016c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0017 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x0177 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x0182 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x018d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:76:0x0198 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x01a2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:80:0x01ad */
    /* JADX WARNING: Missing exception handler attribute for start block: B:82:0x01b8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x01c3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:86:0x01ce */
    /* JADX WARNING: Missing exception handler attribute for start block: B:88:0x01d9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0022 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:90:0x01e4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x01ef */
    /* JADX WARNING: Missing exception handler attribute for start block: B:94:0x01fa */
    /* JADX WARNING: Missing exception handler attribute for start block: B:96:0x0205 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:98:0x0210 */
    /* renamed from: ˮ͈ */
    private static /* synthetic */ int[] m2107() {
        /*
            int[] r0 = f6965
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.ઌ[] r0 = p004o.C1328.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.ઌ r0 = p004o.C1328.ADDEFF     // Catch:{ NoSuchFieldError -> 0x0017 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
            r1 = 82     // Catch:{ NoSuchFieldError -> 0x0017 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0017 }
        L_0x0017:
            o.ઌ r0 = p004o.C1328.ADDEFF2     // Catch:{ NoSuchFieldError -> 0x0022 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
            r1 = 137(0x89, float:1.92E-43)     // Catch:{ NoSuchFieldError -> 0x0022 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0022 }
        L_0x0022:
            o.ઌ r0 = p004o.C1328.ADDEFF_ONSKILL     // Catch:{ NoSuchFieldError -> 0x002d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
            r1 = 159(0x9f, float:2.23E-43)     // Catch:{ NoSuchFieldError -> 0x002d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002d }
        L_0x002d:
            o.ઌ r0 = p004o.C1328.ADDEFF_WHENHIT     // Catch:{ NoSuchFieldError -> 0x0038 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
            r1 = 179(0xb3, float:2.51E-43)     // Catch:{ NoSuchFieldError -> 0x0038 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0038 }
        L_0x0038:
            o.ઌ r0 = p004o.C1328.ADDELE     // Catch:{ NoSuchFieldError -> 0x0043 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
            r1 = 77     // Catch:{ NoSuchFieldError -> 0x0043 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0043 }
        L_0x0043:
            o.ઌ r0 = p004o.C1328.ADDRACE     // Catch:{ NoSuchFieldError -> 0x004e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
            r1 = 78     // Catch:{ NoSuchFieldError -> 0x004e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x004e }
        L_0x004e:
            o.ઌ r0 = p004o.C1328.ADDRACE2     // Catch:{ NoSuchFieldError -> 0x0059 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
            r1 = 187(0xbb, float:2.62E-43)     // Catch:{ NoSuchFieldError -> 0x0059 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0059 }
        L_0x0059:
            o.ઌ r0 = p004o.C1328.ADDSIZE     // Catch:{ NoSuchFieldError -> 0x0064 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
            r1 = 79     // Catch:{ NoSuchFieldError -> 0x0064 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0064 }
        L_0x0064:
            o.ઌ r0 = p004o.C1328.ADD_CLASS_DROP_ITEM     // Catch:{ NoSuchFieldError -> 0x006f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
            r1 = 208(0xd0, float:2.91E-43)     // Catch:{ NoSuchFieldError -> 0x006f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x006f }
        L_0x006f:
            o.ઌ r0 = p004o.C1328.ADD_DAMAGE_CLASS     // Catch:{ NoSuchFieldError -> 0x007a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
            r1 = 113(0x71, float:1.58E-43)     // Catch:{ NoSuchFieldError -> 0x007a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x007a }
        L_0x007a:
            o.ઌ r0 = p004o.C1328.ADD_DEF_CLASS     // Catch:{ NoSuchFieldError -> 0x0085 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
            r1 = 115(0x73, float:1.61E-43)     // Catch:{ NoSuchFieldError -> 0x0085 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0085 }
        L_0x0085:
            o.ઌ r0 = p004o.C1328.ADD_GET_ZENY_NUM     // Catch:{ NoSuchFieldError -> 0x0090 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
            r1 = 112(0x70, float:1.57E-43)     // Catch:{ NoSuchFieldError -> 0x0090 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0090 }
        L_0x0090:
            o.ઌ r0 = p004o.C1328.ADD_HEAL2_RATE     // Catch:{ NoSuchFieldError -> 0x009b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
            r1 = 161(0xa1, float:2.26E-43)     // Catch:{ NoSuchFieldError -> 0x009b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x009b }
        L_0x009b:
            o.ઌ r0 = p004o.C1328.ADD_HEAL_RATE     // Catch:{ NoSuchFieldError -> 0x00a6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a6 }
            r1 = 160(0xa0, float:2.24E-43)     // Catch:{ NoSuchFieldError -> 0x00a6 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00a6 }
        L_0x00a6:
            o.ઌ r0 = p004o.C1328.ADD_ITEM_HEAL_RATE     // Catch:{ NoSuchFieldError -> 0x00b1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b1 }
            r1 = 191(0xbf, float:2.68E-43)     // Catch:{ NoSuchFieldError -> 0x00b1 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00b1 }
        L_0x00b1:
            o.ઌ r0 = p004o.C1328.ADD_MAGIC_DAMAGE_CLASS     // Catch:{ NoSuchFieldError -> 0x00bc }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bc }
            r1 = 114(0x72, float:1.6E-43)     // Catch:{ NoSuchFieldError -> 0x00bc }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00bc }
        L_0x00bc:
            o.ઌ r0 = p004o.C1328.ADD_MDEF_CLASS     // Catch:{ NoSuchFieldError -> 0x00c7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c7 }
            r1 = 116(0x74, float:1.63E-43)     // Catch:{ NoSuchFieldError -> 0x00c7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00c7 }
        L_0x00c7:
            o.ઌ r0 = p004o.C1328.ADD_MONSTER_DROP_ITEM     // Catch:{ NoSuchFieldError -> 0x00d2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d2 }
            r1 = 117(0x75, float:1.64E-43)     // Catch:{ NoSuchFieldError -> 0x00d2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00d2 }
        L_0x00d2:
            o.ઌ r0 = p004o.C1328.ADD_MONSTER_DROP_ITEMGROUP     // Catch:{ NoSuchFieldError -> 0x00dd }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dd }
            r1 = 202(0xca, float:2.83E-43)     // Catch:{ NoSuchFieldError -> 0x00dd }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00dd }
        L_0x00dd:
            o.ઌ r0 = p004o.C1328.ADD_SKILL_BLOW     // Catch:{ NoSuchFieldError -> 0x00e8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e8 }
            r1 = 204(0xcc, float:2.86E-43)     // Catch:{ NoSuchFieldError -> 0x00e8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00e8 }
        L_0x00e8:
            o.ઌ r0 = p004o.C1328.ADD_STEAL_RATE     // Catch:{ NoSuchFieldError -> 0x00f3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
            r1 = 140(0x8c, float:1.96E-43)     // Catch:{ NoSuchFieldError -> 0x00f3 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00f3 }
        L_0x00f3:
            o.ઌ r0 = p004o.C1328.AGI     // Catch:{ NoSuchFieldError -> 0x00fe }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fe }
            r1 = 15     // Catch:{ NoSuchFieldError -> 0x00fe }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00fe }
        L_0x00fe:
            o.ઌ r0 = p004o.C1328.AGI_DEX_STR     // Catch:{ NoSuchFieldError -> 0x0109 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0109 }
            r1 = 145(0x91, float:2.03E-43)     // Catch:{ NoSuchFieldError -> 0x0109 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0109 }
        L_0x0109:
            o.ઌ r0 = p004o.C1328.AGI_VIT     // Catch:{ NoSuchFieldError -> 0x0114 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
            r1 = 144(0x90, float:2.02E-43)     // Catch:{ NoSuchFieldError -> 0x0114 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0114 }
        L_0x0114:
            o.ઌ r0 = p004o.C1328.ALL_STATS     // Catch:{ NoSuchFieldError -> 0x011f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x011f }
            r1 = 143(0x8f, float:2.0E-43)     // Catch:{ NoSuchFieldError -> 0x011f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x011f }
        L_0x011f:
            o.ઌ r0 = p004o.C1328.ASPD     // Catch:{ NoSuchFieldError -> 0x012a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x012a }
            r1 = 54     // Catch:{ NoSuchFieldError -> 0x012a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x012a }
        L_0x012a:
            o.ઌ r0 = p004o.C1328.ASPD_RATE     // Catch:{ NoSuchFieldError -> 0x0135 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0135 }
            r1 = 85     // Catch:{ NoSuchFieldError -> 0x0135 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0135 }
        L_0x0135:
            o.ઌ r0 = p004o.C1328.ATK1     // Catch:{ NoSuchFieldError -> 0x0140 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0140 }
            r1 = 42     // Catch:{ NoSuchFieldError -> 0x0140 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0140 }
        L_0x0140:
            o.ઌ r0 = p004o.C1328.ATK2     // Catch:{ NoSuchFieldError -> 0x014b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x014b }
            r1 = 43     // Catch:{ NoSuchFieldError -> 0x014b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x014b }
        L_0x014b:
            o.ઌ r0 = p004o.C1328.ATKELE     // Catch:{ NoSuchFieldError -> 0x0156 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0156 }
            r1 = 71     // Catch:{ NoSuchFieldError -> 0x0156 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0156 }
        L_0x0156:
            o.ઌ r0 = p004o.C1328.ATK_RATE     // Catch:{ NoSuchFieldError -> 0x0161 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0161 }
            r1 = 98     // Catch:{ NoSuchFieldError -> 0x0161 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0161 }
        L_0x0161:
            o.ઌ r0 = p004o.C1328.ATTACKRANGE     // Catch:{ NoSuchFieldError -> 0x016c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x016c }
            r1 = 70     // Catch:{ NoSuchFieldError -> 0x016c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x016c }
        L_0x016c:
            o.ઌ r0 = p004o.C1328.AUTOSPELL     // Catch:{ NoSuchFieldError -> 0x0177 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0177 }
            r1 = 130(0x82, float:1.82E-43)     // Catch:{ NoSuchFieldError -> 0x0177 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0177 }
        L_0x0177:
            o.ઌ r0 = p004o.C1328.AUTOSPELL_ONSKILL     // Catch:{ NoSuchFieldError -> 0x0182 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0182 }
            r1 = 183(0xb7, float:2.56E-43)     // Catch:{ NoSuchFieldError -> 0x0182 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0182 }
        L_0x0182:
            o.ઌ r0 = p004o.C1328.AUTOSPELL_WHENHIT     // Catch:{ NoSuchFieldError -> 0x018d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x018d }
            r1 = 180(0xb4, float:2.52E-43)     // Catch:{ NoSuchFieldError -> 0x018d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x018d }
        L_0x018d:
            o.ઌ r0 = p004o.C1328.BASECLASS     // Catch:{ NoSuchFieldError -> 0x0198 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0198 }
            r1 = 64     // Catch:{ NoSuchFieldError -> 0x0198 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0198 }
        L_0x0198:
            o.ઌ r0 = p004o.C1328.BASEEXP     // Catch:{ NoSuchFieldError -> 0x01a2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a2 }
            r1 = 2     // Catch:{ NoSuchFieldError -> 0x01a2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01a2 }
        L_0x01a2:
            o.ઌ r0 = p004o.C1328.BASEJOB     // Catch:{ NoSuchFieldError -> 0x01ad }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ad }
            r1 = 63     // Catch:{ NoSuchFieldError -> 0x01ad }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01ad }
        L_0x01ad:
            o.ઌ r0 = p004o.C1328.BASELEVEL     // Catch:{ NoSuchFieldError -> 0x01b8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b8 }
            r1 = 12     // Catch:{ NoSuchFieldError -> 0x01b8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01b8 }
        L_0x01b8:
            o.ઌ r0 = p004o.C1328.BASE_ATK     // Catch:{ NoSuchFieldError -> 0x01c3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c3 }
            r1 = 84     // Catch:{ NoSuchFieldError -> 0x01c3 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01c3 }
        L_0x01c3:
            o.ઌ r0 = p004o.C1328.BASE_MATK     // Catch:{ NoSuchFieldError -> 0x01ce }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ce }
            r1 = 209(0xd1, float:2.93E-43)     // Catch:{ NoSuchFieldError -> 0x01ce }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01ce }
        L_0x01ce:
            o.ઌ r0 = p004o.C1328.BREAK_ARMOR_RATE     // Catch:{ NoSuchFieldError -> 0x01d9 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d9 }
            r1 = 139(0x8b, float:1.95E-43)     // Catch:{ NoSuchFieldError -> 0x01d9 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01d9 }
        L_0x01d9:
            o.ઌ r0 = p004o.C1328.BREAK_WEAPON_RATE     // Catch:{ NoSuchFieldError -> 0x01e4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01e4 }
            r1 = 138(0x8a, float:1.93E-43)     // Catch:{ NoSuchFieldError -> 0x01e4 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01e4 }
        L_0x01e4:
            o.ઌ r0 = p004o.C1328.CART     // Catch:{ NoSuchFieldError -> 0x01ef }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ef }
            r1 = 59     // Catch:{ NoSuchFieldError -> 0x01ef }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01ef }
        L_0x01ef:
            o.ઌ r0 = p004o.C1328.CARTINFO     // Catch:{ NoSuchFieldError -> 0x01fa }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01fa }
            r1 = 62     // Catch:{ NoSuchFieldError -> 0x01fa }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01fa }
        L_0x01fa:
            o.ઌ r0 = p004o.C1328.CASTRATE     // Catch:{ NoSuchFieldError -> 0x0205 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0205 }
            r1 = 73     // Catch:{ NoSuchFieldError -> 0x0205 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0205 }
        L_0x0205:
            o.ઌ r0 = p004o.C1328.CASTTIME     // Catch:{ NoSuchFieldError -> 0x0210 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0210 }
            r1 = 211(0xd3, float:2.96E-43)     // Catch:{ NoSuchFieldError -> 0x0210 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0210 }
        L_0x0210:
            o.ઌ r0 = p004o.C1328.CLASS     // Catch:{ NoSuchFieldError -> 0x021b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x021b }
            r1 = 20     // Catch:{ NoSuchFieldError -> 0x021b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x021b }
        L_0x021b:
            o.ઌ r0 = p004o.C1328.CLASSCHANGE     // Catch:{ NoSuchFieldError -> 0x0226 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0226 }
            r1 = 148(0x94, float:2.07E-43)     // Catch:{ NoSuchFieldError -> 0x0226 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0226 }
        L_0x0226:
            o.ઌ r0 = p004o.C1328.CRITICAL     // Catch:{ NoSuchFieldError -> 0x0231 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0231 }
            r1 = 53     // Catch:{ NoSuchFieldError -> 0x0231 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0231 }
        L_0x0231:
            o.ઌ r0 = p004o.C1328.CRITICAL_ADDRACE     // Catch:{ NoSuchFieldError -> 0x023c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x023c }
            r1 = 177(0xb1, float:2.48E-43)     // Catch:{ NoSuchFieldError -> 0x023c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x023c }
        L_0x023c:
            o.ઌ r0 = p004o.C1328.CRITICAL_DEF     // Catch:{ NoSuchFieldError -> 0x0247 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0247 }
            r1 = 89     // Catch:{ NoSuchFieldError -> 0x0247 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0247 }
        L_0x0247:
            o.ઌ r0 = p004o.C1328.CRITICAL_RATE     // Catch:{ NoSuchFieldError -> 0x0252 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0252 }
            r1 = 110(0x6e, float:1.54E-43)     // Catch:{ NoSuchFieldError -> 0x0252 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0252 }
        L_0x0252:
            o.ઌ r0 = p004o.C1328.CRIT_ATK_RATE     // Catch:{ NoSuchFieldError -> 0x025d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x025d }
            r1 = 176(0xb0, float:2.47E-43)     // Catch:{ NoSuchFieldError -> 0x025d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x025d }
        L_0x025d:
            o.ઌ r0 = p004o.C1328.DEF1     // Catch:{ NoSuchFieldError -> 0x0268 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0268 }
            r1 = 46     // Catch:{ NoSuchFieldError -> 0x0268 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0268 }
        L_0x0268:
            o.ઌ r0 = p004o.C1328.DEF2     // Catch:{ NoSuchFieldError -> 0x0273 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0273 }
            r1 = 47     // Catch:{ NoSuchFieldError -> 0x0273 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0273 }
        L_0x0273:
            o.ઌ r0 = p004o.C1328.DEF2_RATE     // Catch:{ NoSuchFieldError -> 0x027e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x027e }
            r1 = 125(0x7d, float:1.75E-43)     // Catch:{ NoSuchFieldError -> 0x027e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x027e }
        L_0x027e:
            o.ઌ r0 = p004o.C1328.DEFELE     // Catch:{ NoSuchFieldError -> 0x0289 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0289 }
            r1 = 72     // Catch:{ NoSuchFieldError -> 0x0289 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0289 }
        L_0x0289:
            o.ઌ r0 = p004o.C1328.DEF_RATE     // Catch:{ NoSuchFieldError -> 0x0294 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0294 }
            r1 = 124(0x7c, float:1.74E-43)     // Catch:{ NoSuchFieldError -> 0x0294 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0294 }
        L_0x0294:
            o.ઌ r0 = p004o.C1328.DEF_RATIO_ATK_ELE     // Catch:{ NoSuchFieldError -> 0x029f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x029f }
            r1 = 118(0x76, float:1.65E-43)     // Catch:{ NoSuchFieldError -> 0x029f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x029f }
        L_0x029f:
            o.ઌ r0 = p004o.C1328.DEF_RATIO_ATK_RACE     // Catch:{ NoSuchFieldError -> 0x02aa }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x02aa }
            r1 = 119(0x77, float:1.67E-43)     // Catch:{ NoSuchFieldError -> 0x02aa }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x02aa }
        L_0x02aa:
            o.ઌ r0 = p004o.C1328.DELAYRATE     // Catch:{ NoSuchFieldError -> 0x02b5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x02b5 }
            r1 = 153(0x99, float:2.14E-43)     // Catch:{ NoSuchFieldError -> 0x02b5 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x02b5 }
        L_0x02b5:
            o.ઌ r0 = p004o.C1328.DELAYTIME     // Catch:{ NoSuchFieldError -> 0x02c0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x02c0 }
            r1 = 212(0xd4, float:2.97E-43)     // Catch:{ NoSuchFieldError -> 0x02c0 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x02c0 }
        L_0x02c0:
            o.ઌ r0 = p004o.C1328.DEX     // Catch:{ NoSuchFieldError -> 0x02cb }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x02cb }
            r1 = 18     // Catch:{ NoSuchFieldError -> 0x02cb }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x02cb }
        L_0x02cb:
            o.ઌ r0 = p004o.C1328.DOUBLE_ADD_RATE     // Catch:{ NoSuchFieldError -> 0x02d6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x02d6 }
            r1 = 93     // Catch:{ NoSuchFieldError -> 0x02d6 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x02d6 }
        L_0x02d6:
            o.ઌ r0 = p004o.C1328.DOUBLE_RATE     // Catch:{ NoSuchFieldError -> 0x02e1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x02e1 }
            r1 = 92     // Catch:{ NoSuchFieldError -> 0x02e1 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x02e1 }
        L_0x02e1:
            o.ઌ r0 = p004o.C1328.DRAIN_RATE     // Catch:{ NoSuchFieldError -> 0x02ec }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x02ec }
            r1 = 132(0x84, float:1.85E-43)     // Catch:{ NoSuchFieldError -> 0x02ec }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x02ec }
        L_0x02ec:
            o.ઌ r0 = p004o.C1328.DRAIN_RATE_RACE     // Catch:{ NoSuchFieldError -> 0x02f7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x02f7 }
            r1 = 155(0x9b, float:2.17E-43)     // Catch:{ NoSuchFieldError -> 0x02f7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x02f7 }
        L_0x02f7:
            o.ઌ r0 = p004o.C1328.DRAIN_VALUE     // Catch:{ NoSuchFieldError -> 0x0302 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0302 }
            r1 = 150(0x96, float:2.1E-43)     // Catch:{ NoSuchFieldError -> 0x0302 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0302 }
        L_0x0302:
            o.ઌ r0 = p004o.C1328.DRAIN_VALUE_RACE     // Catch:{ NoSuchFieldError -> 0x030d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x030d }
            r1 = 192(0xc0, float:2.69E-43)     // Catch:{ NoSuchFieldError -> 0x030d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x030d }
        L_0x030d:
            o.ઌ r0 = p004o.C1328.ELE_DAMAGE_RATE     // Catch:{ NoSuchFieldError -> 0x0318 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0318 }
            r1 = 210(0xd2, float:2.94E-43)     // Catch:{ NoSuchFieldError -> 0x0318 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0318 }
        L_0x0318:
            o.ઌ r0 = p004o.C1328.EXP_ADDRACE     // Catch:{ NoSuchFieldError -> 0x0323 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0323 }
            r1 = 193(0xc1, float:2.7E-43)     // Catch:{ NoSuchFieldError -> 0x0323 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0323 }
        L_0x0323:
            o.ઌ r0 = p004o.C1328.FAME     // Catch:{ NoSuchFieldError -> 0x032e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x032e }
            r1 = 60     // Catch:{ NoSuchFieldError -> 0x032e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x032e }
        L_0x032e:
            o.ઌ r0 = p004o.C1328.FIXCASTRATE     // Catch:{ NoSuchFieldError -> 0x0339 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0339 }
            r1 = 162(0xa2, float:2.27E-43)     // Catch:{ NoSuchFieldError -> 0x0339 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0339 }
        L_0x0339:
            o.ઌ r0 = p004o.C1328.FLEE1     // Catch:{ NoSuchFieldError -> 0x0344 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0344 }
            r1 = 51     // Catch:{ NoSuchFieldError -> 0x0344 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0344 }
        L_0x0344:
            o.ઌ r0 = p004o.C1328.FLEE2     // Catch:{ NoSuchFieldError -> 0x034f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x034f }
            r1 = 52     // Catch:{ NoSuchFieldError -> 0x034f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x034f }
        L_0x034f:
            o.ઌ r0 = p004o.C1328.FLEE2_RATE     // Catch:{ NoSuchFieldError -> 0x035a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x035a }
            r1 = 123(0x7b, float:1.72E-43)     // Catch:{ NoSuchFieldError -> 0x035a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x035a }
        L_0x035a:
            o.ઌ r0 = p004o.C1328.FLEE_RATE     // Catch:{ NoSuchFieldError -> 0x0365 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0365 }
            r1 = 122(0x7a, float:1.71E-43)     // Catch:{ NoSuchFieldError -> 0x0365 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0365 }
        L_0x0365:
            o.ઌ r0 = p004o.C1328.GAIN_RACE     // Catch:{ NoSuchFieldError -> 0x0370 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0370 }
            r1 = 194(0xc2, float:2.72E-43)     // Catch:{ NoSuchFieldError -> 0x0370 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0370 }
        L_0x0370:
            o.ઌ r0 = p004o.C1328.GAIN_VALUE     // Catch:{ NoSuchFieldError -> 0x037b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x037b }
            r1 = 184(0xb8, float:2.58E-43)     // Catch:{ NoSuchFieldError -> 0x037b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x037b }
        L_0x037b:
            o.ઌ r0 = p004o.C1328.GET_ZENY_NUM     // Catch:{ NoSuchFieldError -> 0x0386 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0386 }
            r1 = 111(0x6f, float:1.56E-43)     // Catch:{ NoSuchFieldError -> 0x0386 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0386 }
        L_0x0386:
            o.ઌ r0 = p004o.C1328.HIT     // Catch:{ NoSuchFieldError -> 0x0391 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0391 }
            r1 = 50     // Catch:{ NoSuchFieldError -> 0x0391 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0391 }
        L_0x0391:
            o.ઌ r0 = p004o.C1328.HIT_RATE     // Catch:{ NoSuchFieldError -> 0x039c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x039c }
            r1 = 121(0x79, float:1.7E-43)     // Catch:{ NoSuchFieldError -> 0x039c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x039c }
        L_0x039c:
            o.ઌ r0 = p004o.C1328.HP     // Catch:{ NoSuchFieldError -> 0x03a6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x03a6 }
            r1 = 6     // Catch:{ NoSuchFieldError -> 0x03a6 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x03a6 }
        L_0x03a6:
            o.ઌ r0 = p004o.C1328.HP_DRAIN_RATE     // Catch:{ NoSuchFieldError -> 0x03b1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x03b1 }
            r1 = 131(0x83, float:1.84E-43)     // Catch:{ NoSuchFieldError -> 0x03b1 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x03b1 }
        L_0x03b1:
            o.ઌ r0 = p004o.C1328.HP_DRAIN_RATE_RACE     // Catch:{ NoSuchFieldError -> 0x03bc }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x03bc }
            r1 = 154(0x9a, float:2.16E-43)     // Catch:{ NoSuchFieldError -> 0x03bc }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x03bc }
        L_0x03bc:
            o.ઌ r0 = p004o.C1328.HP_DRAIN_VALUE     // Catch:{ NoSuchFieldError -> 0x03c7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x03c7 }
            r1 = 149(0x95, float:2.09E-43)     // Catch:{ NoSuchFieldError -> 0x03c7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x03c7 }
        L_0x03c7:
            o.ઌ r0 = p004o.C1328.HP_DRAIN_VALUE_RACE     // Catch:{ NoSuchFieldError -> 0x03d2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x03d2 }
            r1 = 190(0xbe, float:2.66E-43)     // Catch:{ NoSuchFieldError -> 0x03d2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x03d2 }
        L_0x03d2:
            o.ઌ r0 = p004o.C1328.HP_GAIN_VALUE     // Catch:{ NoSuchFieldError -> 0x03dd }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x03dd }
            r1 = 188(0xbc, float:2.63E-43)     // Catch:{ NoSuchFieldError -> 0x03dd }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x03dd }
        L_0x03dd:
            o.ઌ r0 = p004o.C1328.HP_LOSS_RATE     // Catch:{ NoSuchFieldError -> 0x03e8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x03e8 }
            r1 = 186(0xba, float:2.6E-43)     // Catch:{ NoSuchFieldError -> 0x03e8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x03e8 }
        L_0x03e8:
            o.ઌ r0 = p004o.C1328.HP_RECOV_RATE     // Catch:{ NoSuchFieldError -> 0x03f3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x03f3 }
            r1 = 86     // Catch:{ NoSuchFieldError -> 0x03f3 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x03f3 }
        L_0x03f3:
            o.ઌ r0 = p004o.C1328.HP_REGEN_RATE     // Catch:{ NoSuchFieldError -> 0x03fe }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x03fe }
            r1 = 185(0xb9, float:2.59E-43)     // Catch:{ NoSuchFieldError -> 0x03fe }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x03fe }
        L_0x03fe:
            o.ઌ r0 = p004o.C1328.IGNORE_DEF_ELE     // Catch:{ NoSuchFieldError -> 0x0409 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0409 }
            r1 = 96     // Catch:{ NoSuchFieldError -> 0x0409 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0409 }
        L_0x0409:
            o.ઌ r0 = p004o.C1328.IGNORE_DEF_RACE     // Catch:{ NoSuchFieldError -> 0x0414 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0414 }
            r1 = 97     // Catch:{ NoSuchFieldError -> 0x0414 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0414 }
        L_0x0414:
            o.ઌ r0 = p004o.C1328.IGNORE_DEF_RATE     // Catch:{ NoSuchFieldError -> 0x041f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x041f }
            r1 = 157(0x9d, float:2.2E-43)     // Catch:{ NoSuchFieldError -> 0x041f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x041f }
        L_0x041f:
            o.ઌ r0 = p004o.C1328.IGNORE_MDEF_ELE     // Catch:{ NoSuchFieldError -> 0x042a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x042a }
            r1 = 103(0x67, float:1.44E-43)     // Catch:{ NoSuchFieldError -> 0x042a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x042a }
        L_0x042a:
            o.ઌ r0 = p004o.C1328.IGNORE_MDEF_RACE     // Catch:{ NoSuchFieldError -> 0x0435 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0435 }
            r1 = 104(0x68, float:1.46E-43)     // Catch:{ NoSuchFieldError -> 0x0435 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0435 }
        L_0x0435:
            o.ઌ r0 = p004o.C1328.IGNORE_MDEF_RATE     // Catch:{ NoSuchFieldError -> 0x0440 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0440 }
            r1 = 156(0x9c, float:2.19E-43)     // Catch:{ NoSuchFieldError -> 0x0440 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0440 }
        L_0x0440:
            o.ઌ r0 = p004o.C1328.INT     // Catch:{ NoSuchFieldError -> 0x044b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x044b }
            r1 = 17     // Catch:{ NoSuchFieldError -> 0x044b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x044b }
        L_0x044b:
            o.ઌ r0 = p004o.C1328.INTRAVISION     // Catch:{ NoSuchFieldError -> 0x0456 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0456 }
            r1 = 201(0xc9, float:2.82E-43)     // Catch:{ NoSuchFieldError -> 0x0456 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0456 }
        L_0x0456:
            o.ઌ r0 = p004o.C1328.JOBEXP     // Catch:{ NoSuchFieldError -> 0x0460 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0460 }
            r1 = 3     // Catch:{ NoSuchFieldError -> 0x0460 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0460 }
        L_0x0460:
            o.ઌ r0 = p004o.C1328.JOBLEVEL     // Catch:{ NoSuchFieldError -> 0x046b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x046b }
            r1 = 56     // Catch:{ NoSuchFieldError -> 0x046b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x046b }
        L_0x046b:
            o.ઌ r0 = p004o.C1328.KARMA     // Catch:{ NoSuchFieldError -> 0x0475 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0475 }
            r1 = 4     // Catch:{ NoSuchFieldError -> 0x0475 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0475 }
        L_0x0475:
            o.ઌ r0 = p004o.C1328.KILLEDRID     // Catch:{ NoSuchFieldError -> 0x0480 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0480 }
            r1 = 66     // Catch:{ NoSuchFieldError -> 0x0480 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0480 }
        L_0x0480:
            o.ઌ r0 = p004o.C1328.KILLERRID     // Catch:{ NoSuchFieldError -> 0x048b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x048b }
            r1 = 65     // Catch:{ NoSuchFieldError -> 0x048b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x048b }
        L_0x048b:
            o.ઌ r0 = p004o.C1328.LONG_ATK_DEF     // Catch:{ NoSuchFieldError -> 0x0496 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0496 }
            r1 = 91     // Catch:{ NoSuchFieldError -> 0x0496 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0496 }
        L_0x0496:
            o.ઌ r0 = p004o.C1328.LONG_ATK_RATE     // Catch:{ NoSuchFieldError -> 0x04a1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x04a1 }
            r1 = 175(0xaf, float:2.45E-43)     // Catch:{ NoSuchFieldError -> 0x04a1 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x04a1 }
        L_0x04a1:
            o.ઌ r0 = p004o.C1328.LONG_WEAPON_DAMAGE_RETURN     // Catch:{ NoSuchFieldError -> 0x04ac }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x04ac }
            r1 = 134(0x86, float:1.88E-43)     // Catch:{ NoSuchFieldError -> 0x04ac }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x04ac }
        L_0x04ac:
            o.ઌ r0 = p004o.C1328.LOSS_RATE     // Catch:{ NoSuchFieldError -> 0x04b7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x04b7 }
            r1 = 203(0xcb, float:2.84E-43)     // Catch:{ NoSuchFieldError -> 0x04b7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x04b7 }
        L_0x04b7:
            o.ઌ r0 = p004o.C1328.LUK     // Catch:{ NoSuchFieldError -> 0x04c2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x04c2 }
            r1 = 19     // Catch:{ NoSuchFieldError -> 0x04c2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x04c2 }
        L_0x04c2:
            o.ઌ r0 = p004o.C1328.MAGIC_ADDELE     // Catch:{ NoSuchFieldError -> 0x04cd }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x04cd }
            r1 = 105(0x69, float:1.47E-43)     // Catch:{ NoSuchFieldError -> 0x04cd }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x04cd }
        L_0x04cd:
            o.ઌ r0 = p004o.C1328.MAGIC_ADDRACE     // Catch:{ NoSuchFieldError -> 0x04d8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x04d8 }
            r1 = 106(0x6a, float:1.49E-43)     // Catch:{ NoSuchFieldError -> 0x04d8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x04d8 }
        L_0x04d8:
            o.ઌ r0 = p004o.C1328.MAGIC_ADDSIZE     // Catch:{ NoSuchFieldError -> 0x04e3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x04e3 }
            r1 = 107(0x6b, float:1.5E-43)     // Catch:{ NoSuchFieldError -> 0x04e3 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x04e3 }
        L_0x04e3:
            o.ઌ r0 = p004o.C1328.MAGIC_ATK_DEF     // Catch:{ NoSuchFieldError -> 0x04ee }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x04ee }
            r1 = 101(0x65, float:1.42E-43)     // Catch:{ NoSuchFieldError -> 0x04ee }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x04ee }
        L_0x04ee:
            o.ઌ r0 = p004o.C1328.MAGIC_DAMAGE_RETURN     // Catch:{ NoSuchFieldError -> 0x04f9 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x04f9 }
            r1 = 141(0x8d, float:1.98E-43)     // Catch:{ NoSuchFieldError -> 0x04f9 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x04f9 }
        L_0x04f9:
            o.ઌ r0 = p004o.C1328.MAGIC_GAIN_VALUE     // Catch:{ NoSuchFieldError -> 0x0504 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0504 }
            r1 = 206(0xce, float:2.89E-43)     // Catch:{ NoSuchFieldError -> 0x0504 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0504 }
        L_0x0504:
            o.ઌ r0 = p004o.C1328.MAGIC_HP_GAIN_VALUE     // Catch:{ NoSuchFieldError -> 0x050f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x050f }
            r1 = 207(0xcf, float:2.9E-43)     // Catch:{ NoSuchFieldError -> 0x050f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x050f }
        L_0x050f:
            o.ઌ r0 = p004o.C1328.MANNER     // Catch:{ NoSuchFieldError -> 0x0519 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0519 }
            r1 = 5     // Catch:{ NoSuchFieldError -> 0x0519 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0519 }
        L_0x0519:
            o.ઌ r0 = p004o.C1328.MATK1     // Catch:{ NoSuchFieldError -> 0x0524 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0524 }
            r1 = 44     // Catch:{ NoSuchFieldError -> 0x0524 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0524 }
        L_0x0524:
            o.ઌ r0 = p004o.C1328.MATK2     // Catch:{ NoSuchFieldError -> 0x052f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x052f }
            r1 = 45     // Catch:{ NoSuchFieldError -> 0x052f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x052f }
        L_0x052f:
            o.ઌ r0 = p004o.C1328.MATK_RATE     // Catch:{ NoSuchFieldError -> 0x053a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x053a }
            r1 = 95     // Catch:{ NoSuchFieldError -> 0x053a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x053a }
        L_0x053a:
            o.ઌ r0 = p004o.C1328.MAXHP     // Catch:{ NoSuchFieldError -> 0x0544 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0544 }
            r1 = 7     // Catch:{ NoSuchFieldError -> 0x0544 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0544 }
        L_0x0544:
            o.ઌ r0 = p004o.C1328.MAXHPRATE     // Catch:{ NoSuchFieldError -> 0x054f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x054f }
            r1 = 74     // Catch:{ NoSuchFieldError -> 0x054f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x054f }
        L_0x054f:
            o.ઌ r0 = p004o.C1328.MAXSP     // Catch:{ NoSuchFieldError -> 0x055a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x055a }
            r1 = 9     // Catch:{ NoSuchFieldError -> 0x055a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x055a }
        L_0x055a:
            o.ઌ r0 = p004o.C1328.MAXSPRATE     // Catch:{ NoSuchFieldError -> 0x0565 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0565 }
            r1 = 75     // Catch:{ NoSuchFieldError -> 0x0565 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0565 }
        L_0x0565:
            o.ઌ r0 = p004o.C1328.MAXWEIGHT     // Catch:{ NoSuchFieldError -> 0x0570 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0570 }
            r1 = 26     // Catch:{ NoSuchFieldError -> 0x0570 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0570 }
        L_0x0570:
            o.ઌ r0 = p004o.C1328.MDEF1     // Catch:{ NoSuchFieldError -> 0x057b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x057b }
            r1 = 48     // Catch:{ NoSuchFieldError -> 0x057b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x057b }
        L_0x057b:
            o.ઌ r0 = p004o.C1328.MDEF2     // Catch:{ NoSuchFieldError -> 0x0586 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0586 }
            r1 = 49     // Catch:{ NoSuchFieldError -> 0x0586 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0586 }
        L_0x0586:
            o.ઌ r0 = p004o.C1328.MDEF2_RATE     // Catch:{ NoSuchFieldError -> 0x0591 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0591 }
            r1 = 127(0x7f, float:1.78E-43)     // Catch:{ NoSuchFieldError -> 0x0591 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0591 }
        L_0x0591:
            o.ઌ r0 = p004o.C1328.MDEF_RATE     // Catch:{ NoSuchFieldError -> 0x059c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x059c }
            r1 = 126(0x7e, float:1.77E-43)     // Catch:{ NoSuchFieldError -> 0x059c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x059c }
        L_0x059c:
            o.ઌ r0 = p004o.C1328.MERCFAITH     // Catch:{ NoSuchFieldError -> 0x05a7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x05a7 }
            r1 = 69     // Catch:{ NoSuchFieldError -> 0x05a7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x05a7 }
        L_0x05a7:
            o.ઌ r0 = p004o.C1328.MERCFLEE     // Catch:{ NoSuchFieldError -> 0x05b2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x05b2 }
            r1 = 67     // Catch:{ NoSuchFieldError -> 0x05b2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x05b2 }
        L_0x05b2:
            o.ઌ r0 = p004o.C1328.MERCKILLS     // Catch:{ NoSuchFieldError -> 0x05bd }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x05bd }
            r1 = 68     // Catch:{ NoSuchFieldError -> 0x05bd }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x05bd }
        L_0x05bd:
            o.ઌ r0 = p004o.C1328.MISC_ATK_DEF     // Catch:{ NoSuchFieldError -> 0x05c8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x05c8 }
            r1 = 102(0x66, float:1.43E-43)     // Catch:{ NoSuchFieldError -> 0x05c8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x05c8 }
        L_0x05c8:
            o.ઌ r0 = p004o.C1328.NEAR_ATK_DEF     // Catch:{ NoSuchFieldError -> 0x05d3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x05d3 }
            r1 = 90     // Catch:{ NoSuchFieldError -> 0x05d3 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x05d3 }
        L_0x05d3:
            o.ઌ r0 = p004o.C1328.NEXTBASEEXP     // Catch:{ NoSuchFieldError -> 0x05de }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x05de }
            r1 = 23     // Catch:{ NoSuchFieldError -> 0x05de }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x05de }
        L_0x05de:
            o.ઌ r0 = p004o.C1328.NEXTJOBEXP     // Catch:{ NoSuchFieldError -> 0x05e9 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x05e9 }
            r1 = 24     // Catch:{ NoSuchFieldError -> 0x05e9 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x05e9 }
        L_0x05e9:
            o.ઌ r0 = p004o.C1328.NO_CASTCANCEL     // Catch:{ NoSuchFieldError -> 0x05f4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x05f4 }
            r1 = 164(0xa4, float:2.3E-43)     // Catch:{ NoSuchFieldError -> 0x05f4 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x05f4 }
        L_0x05f4:
            o.ઌ r0 = p004o.C1328.NO_CASTCANCEL2     // Catch:{ NoSuchFieldError -> 0x05ff }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x05ff }
            r1 = 169(0xa9, float:2.37E-43)     // Catch:{ NoSuchFieldError -> 0x05ff }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x05ff }
        L_0x05ff:
            o.ઌ r0 = p004o.C1328.NO_GEMSTONE     // Catch:{ NoSuchFieldError -> 0x060a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x060a }
            r1 = 168(0xa8, float:2.35E-43)     // Catch:{ NoSuchFieldError -> 0x060a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x060a }
        L_0x060a:
            o.ઌ r0 = p004o.C1328.NO_KNOCKBACK     // Catch:{ NoSuchFieldError -> 0x0615 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0615 }
            r1 = 147(0x93, float:2.06E-43)     // Catch:{ NoSuchFieldError -> 0x0615 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0615 }
        L_0x0615:
            o.ઌ r0 = p004o.C1328.NO_MAGIC_DAMAGE     // Catch:{ NoSuchFieldError -> 0x0620 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0620 }
            r1 = 166(0xa6, float:2.33E-43)     // Catch:{ NoSuchFieldError -> 0x0620 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0620 }
        L_0x0620:
            o.ઌ r0 = p004o.C1328.NO_MISC_DAMAGE     // Catch:{ NoSuchFieldError -> 0x062b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x062b }
            r1 = 170(0xaa, float:2.38E-43)     // Catch:{ NoSuchFieldError -> 0x062b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x062b }
        L_0x062b:
            o.ઌ r0 = p004o.C1328.NO_REGEN     // Catch:{ NoSuchFieldError -> 0x0636 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0636 }
            r1 = 178(0xb2, float:2.5E-43)     // Catch:{ NoSuchFieldError -> 0x0636 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0636 }
        L_0x0636:
            o.ઌ r0 = p004o.C1328.NO_SIZEFIX     // Catch:{ NoSuchFieldError -> 0x0641 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0641 }
            r1 = 165(0xa5, float:2.31E-43)     // Catch:{ NoSuchFieldError -> 0x0641 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0641 }
        L_0x0641:
            o.ઌ r0 = p004o.C1328.NO_WEAPON_DAMAGE     // Catch:{ NoSuchFieldError -> 0x064c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x064c }
            r1 = 167(0xa7, float:2.34E-43)     // Catch:{ NoSuchFieldError -> 0x064c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x064c }
        L_0x064c:
            o.ઌ r0 = p004o.C1328.PARTNER     // Catch:{ NoSuchFieldError -> 0x0657 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0657 }
            r1 = 58     // Catch:{ NoSuchFieldError -> 0x0657 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0657 }
        L_0x0657:
            o.ઌ r0 = p004o.C1328.PERFECT_HIDE     // Catch:{ NoSuchFieldError -> 0x0662 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0662 }
            r1 = 146(0x92, float:2.05E-43)     // Catch:{ NoSuchFieldError -> 0x0662 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0662 }
        L_0x0662:
            o.ઌ r0 = p004o.C1328.PERFECT_HIT_ADD_RATE     // Catch:{ NoSuchFieldError -> 0x066d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x066d }
            r1 = 109(0x6d, float:1.53E-43)     // Catch:{ NoSuchFieldError -> 0x066d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x066d }
        L_0x066d:
            o.ઌ r0 = p004o.C1328.PERFECT_HIT_RATE     // Catch:{ NoSuchFieldError -> 0x0678 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0678 }
            r1 = 108(0x6c, float:1.51E-43)     // Catch:{ NoSuchFieldError -> 0x0678 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0678 }
        L_0x0678:
            o.ઌ r0 = p004o.C1328.RANDOM_ATTACK_INCREASE     // Catch:{ NoSuchFieldError -> 0x0683 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0683 }
            r1 = 142(0x8e, float:1.99E-43)     // Catch:{ NoSuchFieldError -> 0x0683 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0683 }
        L_0x0683:
            o.ઌ r0 = p004o.C1328.RECOV_RATE     // Catch:{ NoSuchFieldError -> 0x068e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x068e }
            r1 = 87     // Catch:{ NoSuchFieldError -> 0x068e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x068e }
        L_0x068e:
            o.ઌ r0 = p004o.C1328.REGEN_RATE     // Catch:{ NoSuchFieldError -> 0x0699 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0699 }
            r1 = 100     // Catch:{ NoSuchFieldError -> 0x0699 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0699 }
        L_0x0699:
            o.ઌ r0 = p004o.C1328.RESEFF     // Catch:{ NoSuchFieldError -> 0x06a4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x06a4 }
            r1 = 83     // Catch:{ NoSuchFieldError -> 0x06a4 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x06a4 }
        L_0x06a4:
            o.ઌ r0 = p004o.C1328.RESTART_FULL_RECOVER     // Catch:{ NoSuchFieldError -> 0x06af }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x06af }
            r1 = 163(0xa3, float:2.28E-43)     // Catch:{ NoSuchFieldError -> 0x06af }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x06af }
        L_0x06af:
            o.ઌ r0 = p004o.C1328.SEX     // Catch:{ NoSuchFieldError -> 0x06ba }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x06ba }
            r1 = 22     // Catch:{ NoSuchFieldError -> 0x06ba }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x06ba }
        L_0x06ba:
            o.ઌ r0 = p004o.C1328.SHORT_WEAPON_DAMAGE_RETURN     // Catch:{ NoSuchFieldError -> 0x06c5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x06c5 }
            r1 = 133(0x85, float:1.86E-43)     // Catch:{ NoSuchFieldError -> 0x06c5 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x06c5 }
        L_0x06c5:
            o.ઌ r0 = p004o.C1328.SKILLBLOCKTIME     // Catch:{ NoSuchFieldError -> 0x06d0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x06d0 }
            r1 = 213(0xd5, float:2.98E-43)     // Catch:{ NoSuchFieldError -> 0x06d0 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x06d0 }
        L_0x06d0:
            o.ઌ r0 = p004o.C1328.SKILLPOINT     // Catch:{ NoSuchFieldError -> 0x06db }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x06db }
            r1 = 13     // Catch:{ NoSuchFieldError -> 0x06db }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x06db }
        L_0x06db:
            o.ઌ r0 = p004o.C1328.SKILL_ATK     // Catch:{ NoSuchFieldError -> 0x06e6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x06e6 }
            r1 = 181(0xb5, float:2.54E-43)     // Catch:{ NoSuchFieldError -> 0x06e6 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x06e6 }
        L_0x06e6:
            o.ઌ r0 = p004o.C1328.SKILL_HEAL     // Catch:{ NoSuchFieldError -> 0x06f1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x06f1 }
            r1 = 94     // Catch:{ NoSuchFieldError -> 0x06f1 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x06f1 }
        L_0x06f1:
            o.ઌ r0 = p004o.C1328.SKILL_HEAL2     // Catch:{ NoSuchFieldError -> 0x06fc }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x06fc }
            r1 = 158(0x9e, float:2.21E-43)     // Catch:{ NoSuchFieldError -> 0x06fc }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x06fc }
        L_0x06fc:
            o.ઌ r0 = p004o.C1328.SP     // Catch:{ NoSuchFieldError -> 0x0707 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0707 }
            r1 = 8     // Catch:{ NoSuchFieldError -> 0x0707 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0707 }
        L_0x0707:
            o.ઌ r0 = p004o.C1328.SPCOST     // Catch:{ NoSuchFieldError -> 0x0712 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0712 }
            r1 = 214(0xd6, float:3.0E-43)     // Catch:{ NoSuchFieldError -> 0x0712 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0712 }
        L_0x0712:
            o.ઌ r0 = p004o.C1328.SPEED     // Catch:{ NoSuchFieldError -> 0x071c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x071c }
            r1 = 1     // Catch:{ NoSuchFieldError -> 0x071c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x071c }
        L_0x071c:
            o.ઌ r0 = p004o.C1328.SPEED_ADDRATE     // Catch:{ NoSuchFieldError -> 0x0727 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0727 }
            r1 = 99     // Catch:{ NoSuchFieldError -> 0x0727 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0727 }
        L_0x0727:
            o.ઌ r0 = p004o.C1328.SPEED_RATE     // Catch:{ NoSuchFieldError -> 0x0732 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0732 }
            r1 = 88     // Catch:{ NoSuchFieldError -> 0x0732 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0732 }
        L_0x0732:
            o.ઌ r0 = p004o.C1328.SPLASH_ADD_RANGE     // Catch:{ NoSuchFieldError -> 0x073d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x073d }
            r1 = 129(0x81, float:1.81E-43)     // Catch:{ NoSuchFieldError -> 0x073d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x073d }
        L_0x073d:
            o.ઌ r0 = p004o.C1328.SPLASH_RANGE     // Catch:{ NoSuchFieldError -> 0x0748 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0748 }
            r1 = 128(0x80, float:1.794E-43)     // Catch:{ NoSuchFieldError -> 0x0748 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0748 }
        L_0x0748:
            o.ઌ r0 = p004o.C1328.SPRATE     // Catch:{ NoSuchFieldError -> 0x0753 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0753 }
            r1 = 76     // Catch:{ NoSuchFieldError -> 0x0753 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0753 }
        L_0x0753:
            o.ઌ r0 = p004o.C1328.STATUSPOINT     // Catch:{ NoSuchFieldError -> 0x075e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x075e }
            r1 = 10     // Catch:{ NoSuchFieldError -> 0x075e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x075e }
        L_0x075e:
            o.ઌ r0 = p004o.C1328.STR     // Catch:{ NoSuchFieldError -> 0x0769 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0769 }
            r1 = 14     // Catch:{ NoSuchFieldError -> 0x0769 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0769 }
        L_0x0769:
            o.ઌ r0 = p004o.C1328.SUBDEFELE     // Catch:{ NoSuchFieldError -> 0x0774 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0774 }
            r1 = 215(0xd7, float:3.01E-43)     // Catch:{ NoSuchFieldError -> 0x0774 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0774 }
        L_0x0774:
            o.ઌ r0 = p004o.C1328.SUBELE     // Catch:{ NoSuchFieldError -> 0x077f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x077f }
            r1 = 80     // Catch:{ NoSuchFieldError -> 0x077f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x077f }
        L_0x077f:
            o.ઌ r0 = p004o.C1328.SUBRACE     // Catch:{ NoSuchFieldError -> 0x078a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x078a }
            r1 = 81     // Catch:{ NoSuchFieldError -> 0x078a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x078a }
        L_0x078a:
            o.ઌ r0 = p004o.C1328.SUBRACE2     // Catch:{ NoSuchFieldError -> 0x0795 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0795 }
            r1 = 195(0xc3, float:2.73E-43)     // Catch:{ NoSuchFieldError -> 0x0795 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0795 }
        L_0x0795:
            o.ઌ r0 = p004o.C1328.SUBSIZE     // Catch:{ NoSuchFieldError -> 0x07a0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x07a0 }
            r1 = 189(0xbd, float:2.65E-43)     // Catch:{ NoSuchFieldError -> 0x07a0 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x07a0 }
        L_0x07a0:
            o.ઌ r0 = p004o.C1328.UAGI     // Catch:{ NoSuchFieldError -> 0x07ab }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x07ab }
            r1 = 34     // Catch:{ NoSuchFieldError -> 0x07ab }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x07ab }
        L_0x07ab:
            o.ઌ r0 = p004o.C1328.UDEX     // Catch:{ NoSuchFieldError -> 0x07b6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x07b6 }
            r1 = 37     // Catch:{ NoSuchFieldError -> 0x07b6 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x07b6 }
        L_0x07b6:
            o.ઌ r0 = p004o.C1328.UINT     // Catch:{ NoSuchFieldError -> 0x07c1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x07c1 }
            r1 = 36     // Catch:{ NoSuchFieldError -> 0x07c1 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x07c1 }
        L_0x07c1:
            o.ઌ r0 = p004o.C1328.ULUK     // Catch:{ NoSuchFieldError -> 0x07cc }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x07cc }
            r1 = 38     // Catch:{ NoSuchFieldError -> 0x07cc }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x07cc }
        L_0x07cc:
            o.ઌ r0 = p004o.C1328.UNBREAKABLE     // Catch:{ NoSuchFieldError -> 0x07d7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x07d7 }
            r1 = 61     // Catch:{ NoSuchFieldError -> 0x07d7 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x07d7 }
        L_0x07d7:
            o.ઌ r0 = p004o.C1328.UNBREAKABLE_ARMOR     // Catch:{ NoSuchFieldError -> 0x07e2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x07e2 }
            r1 = 172(0xac, float:2.41E-43)     // Catch:{ NoSuchFieldError -> 0x07e2 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x07e2 }
        L_0x07e2:
            o.ઌ r0 = p004o.C1328.UNBREAKABLE_GARMENT     // Catch:{ NoSuchFieldError -> 0x07ed }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x07ed }
            r1 = 120(0x78, float:1.68E-43)     // Catch:{ NoSuchFieldError -> 0x07ed }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x07ed }
        L_0x07ed:
            o.ઌ r0 = p004o.C1328.UNBREAKABLE_HELM     // Catch:{ NoSuchFieldError -> 0x07f8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x07f8 }
            r1 = 173(0xad, float:2.42E-43)     // Catch:{ NoSuchFieldError -> 0x07f8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x07f8 }
        L_0x07f8:
            o.ઌ r0 = p004o.C1328.UNBREAKABLE_SHIELD     // Catch:{ NoSuchFieldError -> 0x0803 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0803 }
            r1 = 174(0xae, float:2.44E-43)     // Catch:{ NoSuchFieldError -> 0x0803 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0803 }
        L_0x0803:
            o.ઌ r0 = p004o.C1328.UNBREAKABLE_SHOES     // Catch:{ NoSuchFieldError -> 0x080e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x080e }
            r1 = 196(0xc4, float:2.75E-43)     // Catch:{ NoSuchFieldError -> 0x080e }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x080e }
        L_0x080e:
            o.ઌ r0 = p004o.C1328.UNBREAKABLE_WEAPON     // Catch:{ NoSuchFieldError -> 0x0819 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0819 }
            r1 = 171(0xab, float:2.4E-43)     // Catch:{ NoSuchFieldError -> 0x0819 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0819 }
        L_0x0819:
            o.ઌ r0 = p004o.C1328.UNSTRIPABLE     // Catch:{ NoSuchFieldError -> 0x0824 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0824 }
            r1 = 182(0xb6, float:2.55E-43)     // Catch:{ NoSuchFieldError -> 0x0824 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0824 }
        L_0x0824:
            o.ઌ r0 = p004o.C1328.UNSTRIPABLE_ARMOR     // Catch:{ NoSuchFieldError -> 0x082f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x082f }
            r1 = 198(0xc6, float:2.77E-43)     // Catch:{ NoSuchFieldError -> 0x082f }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x082f }
        L_0x082f:
            o.ઌ r0 = p004o.C1328.UNSTRIPABLE_HELM     // Catch:{ NoSuchFieldError -> 0x083a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x083a }
            r1 = 199(0xc7, float:2.79E-43)     // Catch:{ NoSuchFieldError -> 0x083a }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x083a }
        L_0x083a:
            o.ઌ r0 = p004o.C1328.UNSTRIPABLE_SHIELD     // Catch:{ NoSuchFieldError -> 0x0845 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0845 }
            r1 = 200(0xc8, float:2.8E-43)     // Catch:{ NoSuchFieldError -> 0x0845 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0845 }
        L_0x0845:
            o.ઌ r0 = p004o.C1328.UNSTRIPABLE_WEAPON     // Catch:{ NoSuchFieldError -> 0x0850 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0850 }
            r1 = 197(0xc5, float:2.76E-43)     // Catch:{ NoSuchFieldError -> 0x0850 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0850 }
        L_0x0850:
            o.ઌ r0 = p004o.C1328.UPPER     // Catch:{ NoSuchFieldError -> 0x085b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x085b }
            r1 = 57     // Catch:{ NoSuchFieldError -> 0x085b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x085b }
        L_0x085b:
            o.ઌ r0 = p004o.C1328.USTR     // Catch:{ NoSuchFieldError -> 0x0866 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0866 }
            r1 = 33     // Catch:{ NoSuchFieldError -> 0x0866 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0866 }
        L_0x0866:
            o.ઌ r0 = p004o.C1328.UVIT     // Catch:{ NoSuchFieldError -> 0x0871 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0871 }
            r1 = 35     // Catch:{ NoSuchFieldError -> 0x0871 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0871 }
        L_0x0871:
            o.ઌ r0 = p004o.C1328.VANISH_RATE     // Catch:{ NoSuchFieldError -> 0x087c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x087c }
            r1 = 205(0xcd, float:2.87E-43)     // Catch:{ NoSuchFieldError -> 0x087c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x087c }
        L_0x087c:
            o.ઌ r0 = p004o.C1328.VIT     // Catch:{ NoSuchFieldError -> 0x0887 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0887 }
            r1 = 16     // Catch:{ NoSuchFieldError -> 0x0887 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0887 }
        L_0x0887:
            o.ઌ r0 = p004o.C1328.WEAPON_ATK     // Catch:{ NoSuchFieldError -> 0x0892 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0892 }
            r1 = 151(0x97, float:2.12E-43)     // Catch:{ NoSuchFieldError -> 0x0892 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0892 }
        L_0x0892:
            o.ઌ r0 = p004o.C1328.WEAPON_ATK_RATE     // Catch:{ NoSuchFieldError -> 0x089d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x089d }
            r1 = 152(0x98, float:2.13E-43)     // Catch:{ NoSuchFieldError -> 0x089d }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x089d }
        L_0x089d:
            o.ઌ r0 = p004o.C1328.WEAPON_COMA_ELE     // Catch:{ NoSuchFieldError -> 0x08a8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x08a8 }
            r1 = 135(0x87, float:1.89E-43)     // Catch:{ NoSuchFieldError -> 0x08a8 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x08a8 }
        L_0x08a8:
            o.ઌ r0 = p004o.C1328.WEAPON_COMA_RACE     // Catch:{ NoSuchFieldError -> 0x08b3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x08b3 }
            r1 = 136(0x88, float:1.9E-43)     // Catch:{ NoSuchFieldError -> 0x08b3 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x08b3 }
        L_0x08b3:
            o.ઌ r0 = p004o.C1328.WEIGHT     // Catch:{ NoSuchFieldError -> 0x08be }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x08be }
            r1 = 25     // Catch:{ NoSuchFieldError -> 0x08be }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x08be }
        L_0x08be:
            o.ઌ r0 = p004o.C1328.ZENY     // Catch:{ NoSuchFieldError -> 0x08c9 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x08c9 }
            r1 = 21     // Catch:{ NoSuchFieldError -> 0x08c9 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x08c9 }
        L_0x08c9:
            o.ઌ r0 = p004o.C1328._0a     // Catch:{ NoSuchFieldError -> 0x08d4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x08d4 }
            r1 = 11     // Catch:{ NoSuchFieldError -> 0x08d4 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x08d4 }
        L_0x08d4:
            o.ઌ r0 = p004o.C1328._1a     // Catch:{ NoSuchFieldError -> 0x08df }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x08df }
            r1 = 27     // Catch:{ NoSuchFieldError -> 0x08df }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x08df }
        L_0x08df:
            o.ઌ r0 = p004o.C1328._1b     // Catch:{ NoSuchFieldError -> 0x08ea }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x08ea }
            r1 = 28     // Catch:{ NoSuchFieldError -> 0x08ea }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x08ea }
        L_0x08ea:
            o.ઌ r0 = p004o.C1328._1c     // Catch:{ NoSuchFieldError -> 0x08f5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x08f5 }
            r1 = 29     // Catch:{ NoSuchFieldError -> 0x08f5 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x08f5 }
        L_0x08f5:
            o.ઌ r0 = p004o.C1328._1d     // Catch:{ NoSuchFieldError -> 0x0900 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0900 }
            r1 = 30     // Catch:{ NoSuchFieldError -> 0x0900 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0900 }
        L_0x0900:
            o.ઌ r0 = p004o.C1328._1e     // Catch:{ NoSuchFieldError -> 0x090b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x090b }
            r1 = 31     // Catch:{ NoSuchFieldError -> 0x090b }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x090b }
        L_0x090b:
            o.ઌ r0 = p004o.C1328._1f     // Catch:{ NoSuchFieldError -> 0x0916 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0916 }
            r1 = 32     // Catch:{ NoSuchFieldError -> 0x0916 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0916 }
        L_0x0916:
            o.ઌ r0 = p004o.C1328._26     // Catch:{ NoSuchFieldError -> 0x0921 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0921 }
            r1 = 39     // Catch:{ NoSuchFieldError -> 0x0921 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0921 }
        L_0x0921:
            o.ઌ r0 = p004o.C1328._27     // Catch:{ NoSuchFieldError -> 0x092c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x092c }
            r1 = 40     // Catch:{ NoSuchFieldError -> 0x092c }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x092c }
        L_0x092c:
            o.ઌ r0 = p004o.C1328._28     // Catch:{ NoSuchFieldError -> 0x0937 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0937 }
            r1 = 41     // Catch:{ NoSuchFieldError -> 0x0937 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0937 }
        L_0x0937:
            o.ઌ r0 = p004o.C1328._36     // Catch:{ NoSuchFieldError -> 0x0942 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0942 }
            r1 = 55     // Catch:{ NoSuchFieldError -> 0x0942 }
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0942 }
        L_0x0942:
            f6965 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1404.m2107():int[]");
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 176;
        short s = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        C0564mr mrVar = C0595nv.f2879;
        if ((mrVar == C0564mr.MOTR || mrVar == C0564mr.all) && C1014.f6140.f4443 == aux.MOTR) {
            i3 ^= -1943404982;
        }
        if (!z) {
            m2108(this, s, i3);
        }
    }

    /* renamed from: 鷭 */
    static void m2108(C0762sz szVar, short s, int i) {
        C0543ly lyVar = C1014.f6142.f1680.f1195;
        C1301 r6 = C1014.f6137.f1636;
        C1328 r7 = C1328.m2053(s);
        if (r7 == null) {
            C0592ns.m674("unexpected status type " + s);
        } else if (r6 != null) {
            switch (m2107()[r7.ordinal()]) {
                case 1:
                    r6.f8636 = i;
                    break;
                case 2:
                    r6.f6497 = (long) i;
                    C1014.f6147.f51.f1416.mo3588(r6);
                    break;
                case 3:
                    r6.f6536 = (long) i;
                    C1014.f6147.f51.f1416.mo3587(r6);
                    break;
                case 4:
                    r6.f8633 = i;
                    break;
                case 5:
                    r6.f8634 = i;
                    C1746 r0 = C1014.f6147.f51.f1427;
                    C0252cp cpVar = C1014.f6158;
                    int i2 = r6.f8634 < 0 ? 665 : 666;
                    String r9 = C1014.f6160.mo3796(i2);
                    r0.mo4490(String.format(r9 == null ? "MSG" + i2 : r9, new Object[]{Integer.valueOf(-r6.f8634)}), 16776960);
                    if (lyVar != null) {
                        lyVar.mo3989();
                        break;
                    }
                    break;
                case 6:
                    r6.f8635 = i;
                    if (C1014.f6142.f1680.f1195 != null) {
                        C1014.f6142.f1680.f1195.f1731.mo3592(r6.f8635, r6.f8647);
                    }
                    C1014.f6147.f51.f1416.mo3583(r6);
                    break;
                case 7:
                    r6.f8647 = i;
                    if (C1014.f6142.f1680.f1195 != null) {
                        C1014.f6142.f1680.f1195.f1731.mo3592(r6.f8635, r6.f8647);
                    }
                    C1014.f6147.f51.f1416.mo3583(r6);
                    break;
                case 8:
                    r6.f8653 = i;
                    if (C1014.f6142.f1680.f1195 != null) {
                        C1014.f6142.f1680.f1195.f1726.mo3592(r6.f8653, r6.f8645);
                    }
                    C1014.f6147.f51.f1416.mo3584(r6);
                    break;
                case 9:
                    r6.f8645 = i;
                    if (C1014.f6142.f1680.f1195 != null) {
                        C1014.f6142.f1680.f1195.f1726.mo3592(r6.f8653, r6.f8645);
                    }
                    C1014.f6147.f51.f1416.mo3584(r6);
                    break;
                case 10:
                    r6.f6530 = i;
                    break;
                case 12:
                    C1014.f6136.mo4428("levelup", 1.0f);
                    if (r6.f8656 != 0 && i > r6.f8656) {
                        Toast.makeText(C1014.f6147, "Congratulations!! You have gained Level " + i + "!!\nUse status window to become stronger.", 1).show();
                    }
                    r6.f8656 = i;
                    C1014.f6147.f51.f1416.mo3590(r6);
                    break;
                case 13:
                    int i3 = r6.f6527;
                    r6.f6527 = i;
                    if ((i3 == 0 && i != 0) || (i3 != 0 && i == 0)) {
                        C1014.f6147.f51.f1435.f1122 = C0397.SKILL_ME;
                        break;
                    }
                case 14:
                    r6.f6532 = i;
                    break;
                case 15:
                    r6.f6521 = i;
                    break;
                case 16:
                    r6.f6520 = i;
                    break;
                case 17:
                    r6.f6514 = i;
                    break;
                case 18:
                    r6.f6486 = i;
                    break;
                case 19:
                    r6.f6518 = i;
                    break;
                case 20:
                    r6.f1633 = i;
                    C0523 r92 = (C0523) C1014.f6158.f674.f626.f1638.get(Integer.valueOf(r6.f1633));
                    C1014.f6147.f51.f1416.f534.setText(r92 != null ? r92.f1645 : "Poring");
                    break;
                case 21:
                    r6.f6542 = i;
                    C1014.f6147.f51.f1416.mo3585(r6);
                    break;
                case 22:
                    r6.f446 = (byte) i;
                    break;
                case 23:
                    r6.f6525 = (long) i;
                    break;
                case 24:
                    r6.f6539 = (long) i;
                    break;
                case 25:
                    r6.f6545 = i;
                    C1014.f6147.f51.f1416.mo3586(r6);
                    break;
                case 26:
                    r6.f6549 = i;
                    C1014.f6147.f51.f1416.mo3586(r6);
                    break;
                case 33:
                    r6.f6487 = i;
                    break;
                case 34:
                    r6.f6488 = i;
                    break;
                case 35:
                    r6.f6489 = i;
                    break;
                case 36:
                    r6.f6490 = i;
                    break;
                case 37:
                    r6.f6491 = i;
                    break;
                case 38:
                    r6.f6492 = i;
                    break;
                case MotionEventCompat.AXIS_GENERIC_11 /*42*/:
                    r6.f6526 = i;
                    break;
                case 43:
                    r6.f6540 = i;
                    break;
                case MotionEventCompat.AXIS_GENERIC_13 /*44*/:
                    r6.f6535 = i;
                    break;
                case MotionEventCompat.AXIS_GENERIC_14 /*45*/:
                    r6.f6503 = i;
                    break;
                case MotionEventCompat.AXIS_GENERIC_15 /*46*/:
                    r6.f6504 = i;
                    break;
                case MotionEventCompat.AXIS_GENERIC_16 /*47*/:
                    r6.f6505 = i;
                    break;
                case 48:
                    r6.f6529 = i;
                    break;
                case 49:
                    r6.f6506 = i;
                    break;
                case 50:
                    r6.f6507 = i;
                    break;
                case 51:
                    r6.f6508 = i;
                    break;
                case 52:
                    r6.f6509 = i;
                    break;
                case 53:
                    r6.f6523 = i;
                    break;
                case 54:
                    r6.f6510 = i;
                    break;
                case 56:
                    if (r6.f6537 != 0 && i > r6.f6537) {
                        if (r6.f1633 == C1761.NOVICE.f8294 && r6.f6537 == 10) {
                            Toast.makeText(C1014.f6147, "Congratulations!! You have gained Job Level " + i + "!!\nYou can now become a First Class Character!.", 1).show();
                        } else if (C1761.m2430(r6.f1633).mo4502().mo4396() == null || r6.f6537 != 40) {
                            Toast.makeText(C1014.f6147, "Congratulations!! You have gained Job Level " + i + "!!\nUse skills window to learn new skills.", 1).show();
                        } else {
                            Toast.makeText(C1014.f6147, "Congratulations!! You have gained Job Level " + i + "!!\nYou can now become a Second Class Character!.", 1).show();
                        }
                    }
                    r6.f6537 = i;
                    C1014.f6147.f51.f1416.mo3589(r6);
                    break;
                case 57:
                    r6.f6511 = i;
                    break;
                case 58:
                    r6.f6516 = i;
                    break;
                case 59:
                    if (!(r6.f8641 == i || lyVar == null)) {
                        lyVar.mo3994(i, false);
                        break;
                    }
                case 60:
                    r6.f6512 = i;
                    break;
                case 61:
                    r6.f6517 = i;
                    break;
                default:
                    throw new C0828tx(szVar);
            }
            C1014.f6147.f51.f1375.mo3820();
            new StringBuilder("Updatestatus: ").append(r7).append(" -> ").append(i);
        }
    }
}
