package p004o;

import android.util.Log;
import com.libroserver.apk.R;
import java.util.HashMap;
import org.apache.commons.net.SocketClient;
import org.apache.http.message.TokenParser;
import org.keplerproject.luajava.LuaState;
import org.keplerproject.luajava.LuaStateFactory;
import p004o.C0643pc.C0644if;

/* renamed from: o.lg */
final class C0522lg {

    /* renamed from: 櫯 */
    HashMap<Integer, C0523> f1638 = new HashMap<>();

    /* renamed from: 鷭 */
    C0644if f1639;

    /* renamed from: o.lg$鷭 */
    class C0523 {

        /* renamed from: Ą */
        String f1640;

        /* renamed from: ą */
        String f1641;

        /* renamed from: ȃ */
        String f1643;

        /* renamed from: ˮ͈ */
        String f1644;

        /* renamed from: 櫯 */
        String f1645;

        /* renamed from: 鷭 */
        int f1646;

        C0523(int i, String str, String str2, String str3, String str4, String str5) {
            this.f1646 = i;
            this.f1645 = str;
            this.f1644 = str2;
            this.f1643 = str3;
            this.f1640 = str4;
            this.f1641 = str5;
        }
    }

    /* renamed from: 鷭 */
    static C0587nn m563(int i) {
        if (C1761.m2431(i)) {
            return C0587nn.PC;
        }
        if ((i >= 46 && i <= 125) || i == C1430.HIDDEN_WARP_CLASS.f7044 || i == C1430.INVISIBLE_CLASS.f7044 || ((i > 400 && i < C1430.MAX_NPCID.f7044) || (i >= C1430.MIN_NPCID2.f7044 && i < C1430.MAX_NPCID2.f7044))) {
            return C0587nn.NPC;
        }
        if ((i >= con.CLASS_BASE.f649 && i <= 6016) || (i >= 6048 && i <= 6052)) {
            return C0587nn.HOM;
        }
        if (i < 6017 || i > 6046) {
            return C0587nn.MOB;
        }
        return C0587nn.MER;
    }

    /* renamed from: 鷭 */
    private void m565(byte[] bArr, byte[] bArr2) {
        LuaState newLuaState = LuaStateFactory.newLuaState();
        try {
            C0591nr.m673(newLuaState, bArr);
            try {
                C0591nr.m673(newLuaState, bArr2);
                newLuaState.getGlobal("JobNameTable");
                newLuaState.pushNil();
                while (newLuaState.next(-2) != 0) {
                    int integer = newLuaState.toInteger(-2);
                    String r17 = C0591nr.m671(newLuaState, C0618op.KOREAN);
                    this.f1638.put(Integer.valueOf(integer), new C0523(integer, r17.replace('_', TokenParser.f9030SP), r17, null, null, null));
                    newLuaState.pop(1);
                }
                newLuaState.pop(1);
                newLuaState.close();
                String[] split = C0622ot.m741(C1014.f6147.mo3388((int) R.raw.job_mer), C0618op.UTF8).split(SocketClient.NETASCII_EOL);
                int length = split.length;
                for (int i = 0; i < length; i++) {
                    String str = split[i];
                    String[] split2 = str.split("\t");
                    if (split2.length >= 2) {
                        try {
                            C0523 r13 = (C0523) this.f1638.get(Integer.valueOf(Integer.parseInt(split2[0])));
                            if (r13 != null) {
                                String str2 = r13.f1644;
                                r13.f1644 = split2[1];
                                if (!str2.equals(r13.f1644)) {
                                }
                            }
                        } catch (NumberFormatException unused) {
                            C0592ns.m674("invalid job_mer line: " + str);
                        }
                    }
                }
            } catch (C0589np e) {
                throw new C0590nq("jobname.lub", e.getMessage());
            }
        } catch (C0589np e2) {
            throw new C0590nq("npcidentity.lub", e2.getMessage());
        }
    }

    /* renamed from: 鷭 */
    private void m564(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            String str2 = "Empty JobDB file content.";
            Log.e("AndRO", str2);
            throw new C0588no(str2);
        }
        String[] strArr = split;
        int length = split.length;
        for (int i = 0; i < length; i++) {
            String trim = strArr[i].trim();
            if (trim.length() > 0) {
                if (trim.contains("//")) {
                    String[] split2 = trim.split("//");
                    if (split2.length > 0) {
                        trim = split2[0];
                    }
                }
                if (!trim.startsWith("\n") && !trim.startsWith(SocketClient.NETASCII_EOL)) {
                    String[] split3 = trim.split("\t", 7);
                    if (split3 != null && split3.length >= 3) {
                        for (int i2 = 0; i2 < split3.length; i2++) {
                            split3[i2] = split3[i2].trim();
                            if (split3[i2].length() <= 0) {
                                split3[i2] = null;
                            }
                        }
                        Integer decode = Integer.decode(split3[0]);
                        this.f1638.put(decode, new C0523(decode.intValue(), split3[1], split3[2], split3.length >= 4 ? split3[3] : null, split3.length >= 5 ? split3[4] : null, split3.length >= 7 ? split3[6] : null));
                    }
                }
            }
        }
    }

    C0522lg(C0644if ifVar, String str, byte[] bArr, byte[] bArr2, String str2, C1501 r10) {
        C1014.f6147.f51.mo3872("Reading unit_db...");
        this.f1639 = ifVar;
        m564(str);
        m565(bArr, bArr2);
        for (String split : str2.split("\n")) {
            String trim = split.split("//")[0].trim();
            if (trim.length() > 0) {
                String[] split2 = trim.split("\t");
                if (split2.length < 2) {
                    throw new C0590nq("job_name_msgid.txt", "Failed to tokenize line " + trim);
                }
                int parseInt = Integer.parseInt(split2[0]);
                int parseInt2 = Integer.parseInt(split2[1]);
                C0523 r5 = (C0523) this.f1638.get(Integer.valueOf(parseInt));
                if (r5 != null) {
                    String r9 = C1014.f6160.mo3796(parseInt2);
                    if (r9 != null) {
                        r5.f1645 = r9;
                    }
                }
            }
        }
    }

    /* renamed from: 櫯 */
    static int m562(int i) {
        C1761 r2 = C1761.m2430(i);
        if (r2 == C1761.GAMEMASTER) {
            return i;
        }
        if (r2 != null) {
            boolean z = r2.mo4501() == r2;
            boolean z2 = r2.mo4503(true) == r2;
            if (z2) {
                r2 = r2.mo4503(false);
            }
            C1977 r4 = r2.mo4500();
            C1570 r22 = C1570.m2254(r2.mo4502().f7485 & -8193);
            if ((r22.f7485 & 16384) > 0) {
                if ((r22.f7485 & 4096) > 0) {
                    r22 = C1570.m2254(r22.f7485 & -4097);
                }
            }
            C1761 r23 = r22.mo4398(r4);
            if (z) {
                r23 = r23.mo4501();
            }
            if (z2) {
                r23 = r23.mo4503(true);
            }
            i = r23.f8294;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final String mo3954(int i, byte b) {
        int r5 = m562(i);
        C0523 r3 = (C0523) this.f1638.get(Integer.valueOf(r5));
        if (r3 == null) {
            String str = "Failed to convert job " + r5 + " to spritename";
            if (C1014.f6140.f4465) {
                C0592ns.m674(str);
                r3 = (C0523) this.f1638.get(Integer.valueOf(C1761.NOVICE.f8294));
            } else {
                throw new C0822tr(str, true);
            }
        }
        if (r3.f1644 == null || r3.f1644.length() == 0) {
            throw new C0822tr("Job " + r5 + " has null / zero length spritename", true);
        } else if (b != C1977.FEMALE.ordinal() || r3.f1640 == null) {
            return r3.f1644;
        } else {
            return r3.f1640;
        }
    }
}
