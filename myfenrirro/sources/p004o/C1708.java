package p004o;

import android.util.Log;
import android.util.SparseArray;
import com.libroserver.apk.R;
import com.roworkshop.andro.c_activity;
import java.util.HashMap;
import org.apache.http.message.TokenParser;
import org.keplerproject.luajava.LuaState;
import org.keplerproject.luajava.LuaStateFactory;
import p004o.C0643pc.aux;

/* renamed from: o.祛 */
public final class C1708 {

    /* renamed from: ȃ */
    private HashMap<Integer, C1701> f7773 = new HashMap<>();

    /* renamed from: ˮ͈ */
    private C0248cl f7774;

    /* renamed from: 櫯 */
    String f7775;

    /* renamed from: 鷭 */
    SparseArray<C1709> f7776 = new SparseArray<>();

    /* renamed from: o.祛$鷭 */
    class C1709 {

        /* renamed from: 櫯 */
        String f7778;

        /* renamed from: 鷭 */
        String f7779;

        C1709(String str, String str2) {
            this.f7779 = str;
            this.f7778 = str2;
        }
    }

    /* renamed from: 鷭 */
    private void m2375(boolean z) {
        boolean z2 = false;
        C1436[] r8 = new C1436[6];
        for (int i = 0; i < r8.length; i++) {
            r8[i] = new C1436(this);
        }
        r8[0].f7050 = "data\\idnum2itemdisplaynametable.txt";
        r8[1].f7050 = "data\\num2itemdisplaynametable.txt";
        r8[2].f7050 = "data\\idnum2itemresnametable.txt";
        r8[3].f7050 = "data\\num2itemresnametable.txt";
        r8[4].f7050 = "data\\itemslotcounttable.txt";
        r8[5].f7050 = "data\\idnum2itemdesctable.txt";
        if (C1014.f6140.f4443 == aux.OldchaosROCom || C1014.f6140.f4443 == aux.IfritRagnarokCom || C1014.f6140.f4443 == aux.iPlayRo201804 || C1014.f6140.f4443 == aux.MyRebornRO || C1014.f6140.f4443 == aux.OcrClassicCom) {
            r8[0].f7050 = "data\\eventidnum2itemdisplaynametable.txt";
            r8[1].f7050 = "data\\eventnum2itemdisplaynametable.txt";
            r8[2].f7050 = "data\\eventidnum2itemresnametable.txt";
            r8[3].f7050 = "data\\eventnum2itemresnametable.txt";
            r8[5].f7050 = "data\\eventidnum2itemdesctable.txt";
        }
        for (int i2 = 0; i2 < r8.length; i2++) {
            r8[i2].f7049 = (byte[]) this.f7774.mo3613(r8[i2].f7050, false);
            r8[i2].f7048 = C0622ot.m738(r8[i2].f7049);
            if (!z2 && C1014.f6160.mo3799(r8[i2].f7050, r8[i2].f7049.length, 0, r8[i2].f7048) == -1) {
                z2 = true;
            }
        }
        String r9 = C0622ot.m741(C1014.f6147.mo3388((int) R.raw.weaponid2view), C0618op.UTF8);
        String r10 = C0622ot.m738(C0622ot.m750(r9, C0618op.KOREAN, true));
        if (!z2 && C1014.f6160.mo3799("weaponid2view_v2", r9.length(), 0, r10) == -1) {
            z2 = true;
        }
        if (z2 || z) {
            SparseArray sparseArray = new SparseArray();
            String r7 = C0622ot.m741(r8[0].f7049, C0618op.LOCAL);
            String r11 = C0622ot.m741(r8[1].f7049, C0618op.LOCAL);
            String r12 = C0622ot.m741(r8[2].f7049, C0618op.KOREAN);
            String r13 = C0622ot.m741(r8[3].f7049, C0618op.KOREAN);
            String r14 = C0622ot.m741(r8[4].f7049, C0618op.LATIN);
            String r15 = C0622ot.m741(r8[5].f7049, C0618op.LOCAL);
            String[] r122 = C0622ot.m751(r12, true, "#");
            for (int i3 = 0; i3 < r122.length; i3 += 2) {
                try {
                    int intValue = Integer.valueOf(r122[i3].trim()).intValue();
                    String trim = r122[i3 + 1].trim();
                    C1701 r0 = new C1701();
                    r0.f7766 = trim;
                    sparseArray.put(intValue, r0);
                } catch (Throwable unused) {
                }
            }
            String[] r123 = C0622ot.m751(r13, true, "#");
            for (int i4 = 0; i4 < r123.length; i4 += 2) {
                try {
                    int intValue2 = Integer.valueOf(r123[i4].trim()).intValue();
                    String trim2 = r123[i4 + 1].trim();
                    C1701 r19 = (C1701) sparseArray.get(intValue2);
                    if (r19 == null) {
                        r19 = new C1701();
                        sparseArray.put(intValue2, r19);
                    }
                    if (r19.f7766 == null) {
                        r19.f7766 = trim2;
                    } else {
                        if (!trim2.equals(r19.f7766)) {
                            r19.f7759 = trim2;
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
            String[] r124 = C0622ot.m751(r14, true, "#");
            for (int i5 = 0; i5 < r124.length; i5 += 2) {
                try {
                    int intValue3 = Integer.valueOf(r124[i5].trim()).intValue();
                    int intValue4 = Integer.valueOf(r124[i5 + 1].trim()).intValue();
                    C1701 r192 = (C1701) sparseArray.get(intValue3);
                    if (r192 == null) {
                        r192 = new C1701();
                        sparseArray.put(intValue3, r192);
                    }
                    r192.f7761 = intValue4;
                } catch (Throwable unused3) {
                }
            }
            String[] r125 = C0622ot.m751(r7, true, "#");
            for (int i6 = 0; i6 < r125.length; i6 += 2) {
                try {
                    int intValue5 = Integer.valueOf(r125[i6].trim()).intValue();
                    String trim3 = r125[i6 + 1].trim();
                    C1701 r193 = (C1701) sparseArray.get(intValue5);
                    if (r193 == null) {
                        r193 = new C1701();
                        sparseArray.put(intValue5, r193);
                    }
                    r193.f7767 = trim3;
                } catch (Throwable unused4) {
                }
            }
            String[] r126 = C0622ot.m751(r11, true, "#");
            for (int i7 = 0; i7 < r126.length; i7 += 2) {
                try {
                    int intValue6 = Integer.valueOf(r126[i7].trim()).intValue();
                    String trim4 = r126[i7 + 1].trim();
                    C1701 r194 = (C1701) sparseArray.get(intValue6);
                    if (r194 == null) {
                        r194 = new C1701();
                        sparseArray.put(intValue6, r194);
                    }
                    if (r194.f7767 == null) {
                        r194.f7767 = trim4;
                    } else {
                        if (!trim4.equals(r194.f7767)) {
                            r194.f7763 = trim4;
                        }
                    }
                } catch (Throwable unused5) {
                }
            }
            m2373(r9, sparseArray, true);
            String[] r127 = C0622ot.m751(r15, true, "#");
            int i8 = 0;
            while (i8 < r127.length - 1) {
                try {
                    int intValue7 = Integer.valueOf(r127[i8].trim()).intValue();
                    String trim5 = r127[i8 + 1].trim();
                    C1701 r195 = (C1701) sparseArray.get(intValue7);
                    if (r195 == null) {
                        r195 = new C1701();
                        sparseArray.put(intValue7, r195);
                    }
                    r195.f7764 = trim5;
                    i8++;
                } catch (NumberFormatException unused6) {
                }
                i8++;
            }
            C1014.f6160.mo3798(sparseArray);
            C1436[] r196 = r8;
            int length = r8.length;
            for (int i9 = 0; i9 < length; i9++) {
                C1436 r16 = r196[i9];
                C1014.f6160.mo3800(true, -1, r16.f7050, r16.f7049.length, 0, r16.f7048);
            }
            C1014.f6160.mo3800(true, -1, "weaponid2view_v2", r9.length(), 0, r10);
        }
    }

    /* renamed from: 鷭 */
    private static void m2373(String str, SparseArray<C1701> sparseArray, boolean z) {
        String[] split;
        for (String str2 : str.split("\n")) {
            if (!str2.startsWith("//")) {
                String[] split2 = str2.split("\t");
                if (split2.length >= 3) {
                    int parseInt = Integer.parseInt(split2[0]);
                    int parseInt2 = Integer.parseInt(split2[1]);
                    int parseInt3 = Integer.parseInt(split2[2]);
                    C1701 r7 = (C1701) sparseArray.get(parseInt);
                    if (r7 == null) {
                        r7 = new C1701();
                        sparseArray.put(parseInt, r7);
                    }
                    r7.f7765 = C1472.values()[parseInt2];
                    if (z) {
                        r7.f7762 = parseInt3;
                    }
                }
            }
        }
    }

    /* renamed from: 櫯 */
    private void m2372(boolean z) {
        boolean z2 = z;
        String str = "dummy_iteminfo_lua";
        String str2 = "weaponid2view_v2";
        SparseArray sparseArray = new SparseArray();
        String r11 = C0622ot.m741(C1014.f6147.mo3388((int) R.raw.weaponid2view), C0618op.UTF8);
        String r12 = C0622ot.m738(C0622ot.m750(r11, C0618op.KOREAN, true));
        if (!z && C1014.f6160.mo3799(str2, r11.length(), 0, r12) == -1) {
            z2 = true;
        }
        String str3 = "System\\" + C1014.f6140.f4520;
        if (!C1014.f6140.f4520.contains(".")) {
            str3 = new StringBuilder(String.valueOf(str3)).append(".lub").toString();
        }
        byte[] bArr = (byte[]) this.f7774.mo3613(str3, false);
        String r14 = C0622ot.m738(bArr);
        if (!z2 && C1014.f6160.mo3799(str, bArr.length, 0, r14) == -1) {
            z2 = true;
        }
        if (z2) {
            m2373(r11, sparseArray, false);
            LuaState newLuaState = LuaStateFactory.newLuaState();
            try {
                C0591nr.m673(newLuaState, bArr);
                newLuaState.getGlobal("tbl");
                newLuaState.pushNil();
                while (newLuaState.next(-2) != 0) {
                    int integer = newLuaState.toInteger(-2);
                    if (!newLuaState.isTable(-1)) {
                        String str4 = "read_from_iteminfo_lua: invalid file format: second arg is not a table";
                        Log.e("AndRO", str4);
                        throw new C0588no(str4);
                    }
                    C1701 r17 = (C1701) sparseArray.get(integer);
                    if (r17 == null) {
                        r17 = new C1701();
                        sparseArray.put(integer, r17);
                    }
                    r17.f7763 = C0591nr.m670(newLuaState, "unidentifiedDisplayName", C0618op.LOCAL);
                    r17.f7759 = C0591nr.m670(newLuaState, "unidentifiedResourceName", C0618op.KOREAN);
                    r17.f7760 = C0591nr.m670(newLuaState, "unidentifiedDescriptionName", C0618op.LOCAL);
                    r17.f7767 = C0591nr.m670(newLuaState, "identifiedDisplayName", C0618op.LOCAL);
                    r17.f7766 = C0591nr.m670(newLuaState, "identifiedResourceName", C0618op.KOREAN);
                    r17.f7764 = C0591nr.m670(newLuaState, "identifiedDescriptionName", C0618op.LOCAL);
                    r17.f7761 = C0591nr.m669(newLuaState, "slotCount");
                    r17.f7762 = C0591nr.m669(newLuaState, "ClassNum");
                    newLuaState.pop(1);
                }
                newLuaState.pop(1);
                newLuaState.close();
                C1014.f6160.mo3798(sparseArray);
                C1014.f6160.mo3800(true, -1, str2, r11.length(), 0, r12);
                C1014.f6160.mo3800(true, -1, str, bArr.length, 0, r14);
            } catch (C0589np e) {
                throw new C0590nq(str3, e.getMessage());
            }
        }
    }

    C1708(c_activity c_activity, C0248cl clVar) {
        C0453ix ixVar = C1014.f6147.f51;
        String str = "Reading item_db...";
        if (ixVar.f1370 != null) {
            C1014.f6147.mo3387((Runnable) new C0473jm(ixVar));
        }
        C1014.f6147.mo3387((Runnable) new C0471jk(ixVar, str));
        this.f7774 = clVar;
        if (!C1014.f6140.f4462) {
            m2376((byte[]) clVar.mo3613("data\\lua files\\datainfo\\accessoryid.lub", false), (byte[]) clVar.mo3613("data\\lua files\\datainfo\\accname.lub", false));
        } else {
            m2374(clVar);
        }
        boolean z = false;
        int r8 = C1014.f6160.mo3795("last_itemdb_type", 0);
        if (r8 == 0) {
            z = true;
        } else if (r8 == 1 && C1014.f6140.f4520 != null) {
            z = true;
        } else if (r8 == 2 && C1014.f6140.f4520 == null) {
            z = true;
        }
        if (C1014.f6140.f4520 == null) {
            m2375(z);
        } else {
            m2372(z);
        }
        C1014.f6160.mo3805("last_itemdb_type", 0, String.valueOf(C1014.f6140.f4520 == null ? 1 : 2));
    }

    /* renamed from: 鷭 */
    public final C1701 mo4465(int i) {
        if (i <= 500) {
            return null;
        }
        C1701 r2 = (C1701) this.f7773.get(Integer.valueOf(i));
        if (r2 == null) {
            r2 = C1014.f6160.mo3803(i);
            if (r2 != null) {
                this.f7773.put(Integer.valueOf(i), r2);
            }
        }
        return r2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final String mo4464(int i, boolean z) {
        C1701 r2 = mo4465(i);
        if (r2 == null) {
            return null;
        }
        return (z || r2.f7759 == null) ? r2.f7766 : r2.f7759;
    }

    /* renamed from: 鷭 */
    private void m2376(byte[] bArr, byte[] bArr2) {
        LuaState newLuaState = LuaStateFactory.newLuaState();
        try {
            C0591nr.m673(newLuaState, bArr);
            try {
                C0591nr.m673(newLuaState, bArr2);
                newLuaState.getGlobal("AccNameTable");
                newLuaState.pushNil();
                while (newLuaState.next(-2) != 0) {
                    int integer = newLuaState.toInteger(-2);
                    String r7 = C0591nr.m671(newLuaState, C0618op.KOREAN);
                    String replace = r7.replace('_', TokenParser.f9030SP);
                    if (r7.isEmpty()) {
                        C0592ns.m674("accname lub: invalid sprite name for headgear idx=" + integer);
                    } else {
                        this.f7776.put(integer, new C1709(replace, r7));
                    }
                    newLuaState.pop(1);
                }
                newLuaState.pop(1);
                newLuaState.close();
            } catch (C0589np e) {
                throw new C0590nq("accname.lub", e.getMessage());
            }
        } catch (C0589np e2) {
            throw new C0590nq("accessoryid.lub", e2.getMessage());
        }
    }

    /* renamed from: 鷭 */
    private void m2374(C0248cl clVar) {
        String str = "data\\visionary_tab.txt";
        String[] split = C0622ot.m741((byte[]) clVar.mo3613(str, false), C0618op.KOREAN).split("\n");
        for (int i = 0; i < split.length; i++) {
            split[i] = split[i].trim();
        }
        int i2 = 0;
        for (int i3 = 0; i3 < split.length; i3++) {
            String str2 = split[i3];
            if (str2.startsWith("!")) {
                try {
                    i2 = Integer.parseInt(str2.substring(1));
                } catch (NumberFormatException unused) {
                    throw new C0590nq(str, "Failed to parse offset in line " + i3);
                }
            } else if (str2.startsWith("*")) {
                this.f7775 = str2.substring(1);
            } else {
                this.f7776.put(i2, new C1709(str2, str2));
                i2++;
            }
        }
        this.f7776.size();
    }
}
