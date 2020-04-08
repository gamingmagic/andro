package p004o;

import com.libroserver.apk.R;
import java.nio.ByteBuffer;
import p004o.C0183ah.C0184;
import p004o.C0643pc.aux;

/* renamed from: o.af */
public final class C0179af extends C0183ah {

    /* renamed from: 鷭 */
    private final C0180[] f368 = {new C0180("wanttoconnection", $cON.m1858("o.Ŀ")), new C0180("ticksend", C1702.class), new C0180("walktoxy", C1093.class), new C0180("getcharnamerequest", C1134.class), new C0180("actionrequest", C1511.class), new C0180("useskilltoid", C1085.class), new C0180("changedir", C1036.class), new C0180("dropitem", C1450.class), new C0180("takeitem", C1791.class), new C0180("movefromkafra", C1316.class), new C0180("movetokafra", C1683.class), new C0180("useskilltopos", C1084.class), new C0180("friendslistadd", C1488.class), new C0180("partyinvite2", C1055.class), new C0180("solvecharname", C1086.class), new C0180("useritem", C1090.class), new C0180("itemlistwindowselected", C1937.class), new C0180("globalmessage", C1667.class), new C0180("reqopenbuyingstore", C1366.class), new C0180("reqclickbuyingstore", C1771.class), new C0180("reqtradebuyingstore", C1439.class), new C0180("reqclosebuyingstore", C1062.class), new C0180("closekafra", C1781.class), new C0180("hommenu", C1310.class)};

    /* renamed from: o.af$鷭 */
    class C0180 {

        /* renamed from: 櫯 */
        Class<? extends C0839ue> f370;

        /* renamed from: 鷭 */
        String f371;

        C0180(String str, Class<? extends C0839ue> cls) {
            this.f371 = str;
            this.f370 = cls;
        }
    }

    /* renamed from: 鷭 */
    public final /* bridge */ /* synthetic */ void mo3530(C0652pd pdVar) {
        super.mo3530(pdVar);
    }

    /* renamed from: 鷭 */
    public final /* bridge */ /* synthetic */ void mo3531(C0652pd pdVar, int i) {
        super.mo3531(pdVar, i);
    }

    /* renamed from: 鷭 */
    public final /* bridge */ /* synthetic */ void mo3532(C0839ue ueVar, ByteBuffer byteBuffer, int i) {
        super.mo3532(ueVar, byteBuffer, i);
    }

    C0179af(int i, aux aux) {
        if (i == 0) {
            throw new C0588no("packet_db.txt packet version not specified for this server");
        }
        String r8 = C0622ot.m721(C0622ot.m741(C1014.f6147.mo3388((int) R.raw.packet_db), C0618op.UTF8));
        if (aux == aux.iRO_Renewal) {
            r8 = new StringBuilder(String.valueOf(r8)).append(C0622ot.m721(C0622ot.m741(C1014.f6147.mo3388((int) R.raw.packet_db_iro), C0618op.UTF8))).toString();
            i = Integer.MAX_VALUE;
        }
        String[] split = r8.split("\n");
        int i2 = 0;
        for (String trim : split) {
            String trim2 = trim.trim();
            if (trim2.length() > 0) {
                String str = "packet_ver:";
                if (trim2.startsWith(str)) {
                    String[] split2 = trim2.substring(str.length()).split(",");
                    for (int i3 = 0; i3 < split2.length; i3++) {
                        split2[i3] = split2[i3].trim();
                    }
                    if (split2.length <= 0) {
                        throw new C0588no();
                    }
                    i2 = Integer.valueOf(split2[0]).intValue();
                    if (split2.length <= 1) {
                        continue;
                    } else if (split2.length != 4) {
                        throw new C0588no();
                    } else if (i == i2) {
                        this.f378 = new int[]{Integer.decode(split2[1]).intValue(), Integer.decode(split2[2]).intValue(), Integer.decode(split2[3]).intValue()};
                    }
                } else if (i >= i2) {
                    String[] split3 = trim2.split(",");
                    if (split3.length < 2) {
                        throw new C0588no();
                    }
                    int intValue = Integer.decode(split3[0]).intValue();
                    int intValue2 = Integer.valueOf(split3[1]).intValue();
                    if (intValue2 != 0) {
                        int length = this.f368.length;
                        if (split3.length > 2) {
                            String str2 = split3[2];
                            length = 0;
                            while (length < this.f368.length && !this.f368[length].f371.equalsIgnoreCase(str2)) {
                                length++;
                            }
                        }
                        int[] iArr = null;
                        if (split3.length > 3) {
                            String[] split4 = split3[3].split(":");
                            iArr = new int[split4.length];
                            for (int i4 = 0; i4 < split4.length; i4++) {
                                iArr[i4] = Integer.parseInt(split4[i4]);
                            }
                        }
                        C0838ud udVar = (C0838ud) this.f4651.get(Integer.valueOf(intValue));
                        if (udVar == null || udVar.getClass() == C1102.class) {
                            C1102 r15 = new C1102((short) intValue, intValue2);
                            r15.mo4096(ByteBuffer.allocate(intValue2 == -1 ? 1 : intValue2));
                            this.f4651.put(Integer.valueOf(C0622ot.m731(r15.mo4090())), r15);
                        }
                        if (length < this.f368.length) {
                            this.f377.put(this.f368[length].f370, new C0184(this.f368[length].f370, intValue, intValue2, iArr));
                        }
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
