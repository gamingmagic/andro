package p004o;

import com.libroserver.apk.R;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p004o.C0183ah.C0184;

/* renamed from: o.ag */
public final class C0181ag extends C0183ah {

    /* renamed from: Ą */
    private final C0182[] f372 = {new C0182("clif->pWantToConnection", $cON.m1858("o.Ŀ")), new C0182("clif->pTickSend", C1702.class), new C0182("clif->pWalkToXY", C1093.class), new C0182("clif->pGetCharNameRequest", C1134.class), new C0182("clif->pActionRequest", C1511.class), new C0182("clif->pUseSkillToId", C1085.class), new C0182("clif->pChangeDir", C1036.class), new C0182("clif->pDropItem", C1450.class), new C0182("clif->pTakeItem", C1791.class), new C0182("clif->pMoveFromKafra", C1316.class), new C0182("clif->pMoveToKafra", C1683.class), new C0182("clif->pUseSkillToPos", C1084.class), new C0182("clif->pFriendsListAdd", C1488.class), new C0182("clif->pPartyInvite2", C1055.class), new C0182("clif->pSolveCharName", C1086.class), new C0182("clif->pUseItem", C1090.class), new C0182("clif->pItemListWindowSelected", C1937.class), new C0182("clif->pGlobalMessage", C1667.class), new C0182("clif->pReqOpenBuyingStore", C1366.class), new C0182("clif->pReqClickBuyingStore", C1771.class), new C0182("clif->pReqTradeBuyingStore", C1439.class), new C0182("clif->pReqCloseBuyingStore", C1062.class), new C0182("clif->pCloseKafra", C1781.class), new C0182("clif->pHomMenu", C1310.class)};

    /* renamed from: 鷭 */
    String[] f373 = {"PARTY_RECRUIT", "packet", "packetKeys"};

    /* renamed from: o.ag$鷭 */
    class C0182 {

        /* renamed from: 櫯 */
        Class<? extends C0839ue> f375;

        /* renamed from: 鷭 */
        String f376;

        C0182(String str, Class<? extends C0839ue> cls) {
            this.f376 = str;
            this.f375 = cls;
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

    /* renamed from: 鷭 */
    private int m179(int i, String[] strArr, int i2, boolean z, boolean z2) {
        while (i2 < strArr.length) {
            String trim = strArr[i2].trim();
            if (trim.length() > 0 && !trim.equals("#define MAP_PACKETS_H")) {
                if (trim.startsWith("#if")) {
                    String substring = trim.substring(3);
                    if (substring.startsWith("def") || substring.startsWith("ndef")) {
                        boolean startsWith = substring.startsWith("def");
                        String trim2 = substring.substring(startsWith ? 3 : 4).trim();
                        int i3 = 0;
                        while (i3 < this.f373.length && !this.f373[i3].equals(trim2)) {
                            i3++;
                        }
                        i2 = m179(i, strArr, i2 + 1, z && z2, (startsWith && i3 < this.f373.length) || (!startsWith && i3 == this.f373.length));
                    } else if (substring.startsWith(" PACKETVER >=")) {
                        i2 = m179(i, strArr, i2 + 1, z && z2, i >= Integer.parseInt(substring.substring(13).trim()));
                    } else if (substring.startsWith(" PACKETVER ==")) {
                        i2 = m179(i, strArr, i2 + 1, z && z2, i == Integer.parseInt(substring.substring(13).trim()));
                    } else {
                        C0592ns.m674("Unknown #if instruction, processing as inactive block. line=" + i2 + " text=" + substring);
                        i2 = m179(i, strArr, i2 + 1, z && z2, false);
                    }
                } else if (trim.startsWith("#else")) {
                    z2 = !z2;
                } else if (trim.startsWith("#endif")) {
                    return i2;
                } else {
                    if (z && z2) {
                        String str = "packetKeys(";
                        if (trim.startsWith(str)) {
                            String[] split = trim.substring(str.length(), trim.lastIndexOf(")")).trim().split(",");
                            if (split.length != 3) {
                                throw new C0588no();
                            }
                            this.f378 = new int[]{Integer.decode(split[0]).intValue(), Integer.decode(split[1]).intValue(), Integer.decode(split[2]).intValue()};
                        } else if (!trim.startsWith("packet(")) {
                            C0592ns.m674("invalid line " + trim);
                        } else {
                            String trim3 = trim.substring(7, trim.lastIndexOf(")")).trim();
                            String[] split2 = trim3.split(",");
                            if (split2.length < 2) {
                                C0592ns.m674("invalid line split " + trim3);
                            } else {
                                for (int i4 = 0; i4 < split2.length; i4++) {
                                    split2[i4] = split2[i4].trim();
                                }
                                if (!split2[0].startsWith("0x")) {
                                    C0592ns.m674("invalid new header at " + trim3);
                                } else {
                                    split2[0] = split2[0].substring(2);
                                    int parseInt = Integer.parseInt(split2[0], 16);
                                    if (parseInt <= 0) {
                                        C0592ns.m674("invalid new header at " + trim3);
                                    } else {
                                        int parseInt2 = Integer.parseInt(split2[1]);
                                        if (parseInt2 < -1) {
                                            C0592ns.m674("invalid length at " + trim3);
                                        } else {
                                            Class<? extends C0839ue> cls = null;
                                            if (split2.length >= 3) {
                                                C0182[] r14 = this.f372;
                                                int length = r14.length;
                                                int i5 = 0;
                                                while (true) {
                                                    if (i5 >= length) {
                                                        break;
                                                    }
                                                    C0182 r11 = r14[i5];
                                                    if (split2[2].equals(r11.f376)) {
                                                        cls = r11.f375;
                                                        break;
                                                    }
                                                    i5++;
                                                }
                                            }
                                            int[] iArr = null;
                                            if (split2.length >= 4) {
                                                iArr = new int[(split2.length - 3)];
                                                for (int i6 = 0; i6 < iArr.length; i6++) {
                                                    iArr[i6] = Integer.parseInt(split2[i6 + 3]);
                                                }
                                            }
                                            C0838ud udVar = (C0838ud) this.f4651.get(Integer.valueOf(parseInt));
                                            if (udVar == null || udVar.getClass() == C1102.class) {
                                                C1102 r13 = new C1102((short) parseInt, parseInt2);
                                                r13.mo4096(ByteBuffer.allocate(parseInt2 == -1 ? 1 : parseInt2));
                                                C1102 r12 = r13;
                                                this.f4651.put(Integer.valueOf(C0622ot.m731(r12.mo4090())), r12);
                                            }
                                            if (cls != null) {
                                                this.f377.put(cls, new C0184(cls, parseInt, parseInt2, iArr));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i2++;
        }
        return strArr.length;
    }

    C0181ag(int i, boolean z) {
        String[] split = C0622ot.m721(new StringBuilder(String.valueOf(C0622ot.m741(C1014.f6147.mo3388((int) R.raw.packets), C0618op.UTF8))).append("\n").append(C0622ot.m741(C1014.f6147.mo3388((int) R.raw.packets_custom), C0618op.UTF8)).toString()).split("\n");
        if (z) {
            Object[] objArr = this.f373;
            String str = "PACKETVER_RE";
            if (objArr == null) {
                objArr = (Object[]) Array.newInstance(str.getClass(), 0);
            }
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            copyOf[objArr.length] = str;
            this.f373 = (String[]) copyOf;
        }
        m179(i, split, 0, true, true);
    }
}
