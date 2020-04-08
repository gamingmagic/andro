package p004o;

import java.util.Arrays;
import java.util.HashMap;
import org.keplerproject.luajava.LuaState;

/* renamed from: o.gn */
final class C0378gn {

    /* renamed from: 櫯 */
    private C0381gq f1054;

    /* renamed from: 鷭 */
    HashMap<Integer, C0381gq> f1055 = new HashMap<>();

    /* renamed from: 鷭 */
    private static void m381(LuaState luaState, C0381gq gqVar, C1761 r7) {
        int i;
        int LgetN = luaState.LgetN(-1);
        if (gqVar.f1069 == null) {
            i = 0;
            gqVar.f1069 = new C0382[LgetN];
        } else {
            i = gqVar.f1069.length;
            gqVar.f1069 = (C0382[]) Arrays.copyOf(gqVar.f1069, gqVar.f1069.length + LgetN);
        }
        luaState.pushNil();
        while (luaState.next(-2) != 0) {
            int[] r2 = C0591nr.m668(luaState);
            if (r2.length < 2) {
                r2 = new int[]{1, 1};
            }
            gqVar.f1069[i] = new C0382();
            C0382 r4 = gqVar.f1069[i];
            r4.f1078 = r2[0];
            if (r2.length > 1) {
                r4.f1077 = r2[1];
            } else {
                r4.f1077 = 1;
            }
            r4.f1076 = r7;
            i++;
            luaState.pop(1);
        }
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 308 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:84|85) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x03be, code lost:
        r0 = new p004o.C0381gq.C0382(r16);
        r0.f1076 = r14;
        r0.f1078 = r17.f1074;
        r0.f1077 = 1;
        r17 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x03e7, code lost:
        if (r16.f1069[r17].f1076 != r0.f1076) goto L_0x0405;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x03f5, code lost:
        if (r16.f1069[r17].f1078 != r0.f1078) goto L_0x0405;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0403, code lost:
        if (r16.f1069[r17].f1077 == r0.f1077) goto L_0x0410;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0405, code lost:
        r17 = r17 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x040e, code lost:
        if (r17 < r16.f1069.length) goto L_0x03db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0417, code lost:
        if (r17 < r16.f1069.length) goto L_0x0448;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0419, code lost:
        r17 = r16.f1069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x041f, code lost:
        if (r17 != null) goto L_0x0430;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0421, code lost:
        r17 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(r0.getClass(), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0430, code lost:
        r20 = java.util.Arrays.copyOf(r17, r17.length + 1);
        r20[r17.length] = r0;
        r16.f1069 = (p004o.C0381gq.C0382[]) r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        r14 = p004o.C1761.valueOf(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x03bc, code lost:
        if (r17 == null) goto L_0x0448;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x02ff */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C0378gn(p004o.C0248cl r22) {
        /*
            r21 = this;
            r0 = r21
            r0.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = r21
            r1.f1055 = r0
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            o.ix r1 = r0.f51
            r17 = r1
            java.lang.String r19 = "Reading skill_db..."
            r0 = r17
            android.app.AlertDialog r0 = r0.f1370
            if (r0 == 0) goto L_0x002a
            r20 = r17
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            o.jm r1 = new o.jm
            r2 = r20
            r1.<init>(r2)
            r0.mo3387(r1)
        L_0x002a:
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            o.jk r1 = new o.jk
            r2 = r17
            r3 = r19
            r1.<init>(r2, r3)
            r0.mo3387(r1)
            r7 = 0
            o.pc$鷭 r0 = p004o.C1014.f6140
            boolean r0 = r0.f4521
            if (r0 == 0) goto L_0x008d
            r0 = 6
            o.gp[] r8 = new p004o.C0380gp[r0]
            o.gp r0 = new o.gp
            java.lang.String r1 = "jobinheritlist.lub"
            r2 = r21
            r3 = 1
            r0.<init>(r2, r1, r3)
            r1 = 0
            r8[r1] = r0
            o.gp r0 = new o.gp
            java.lang.String r1 = "skillid.lub"
            r2 = r21
            r3 = 1
            r0.<init>(r2, r1, r3)
            r1 = 1
            r8[r1] = r0
            o.gp r0 = new o.gp
            java.lang.String r1 = "data\\skillnametable.txt"
            r2 = r21
            r0.<init>(r2, r1)
            r1 = 2
            r8[r1] = r0
            o.gp r0 = new o.gp
            java.lang.String r1 = "data\\skilltreeview.txt"
            r2 = r21
            r0.<init>(r2, r1)
            r1 = 3
            r8[r1] = r0
            o.gp r0 = new o.gp
            java.lang.String r1 = "data\\skilldesctable.txt"
            r2 = r21
            r0.<init>(r2, r1)
            r1 = 4
            r8[r1] = r0
            o.gp r0 = new o.gp
            java.lang.String r1 = "data\\leveluseskillspamount.txt"
            r2 = r21
            r0.<init>(r2, r1)
            r1 = 5
            r8[r1] = r0
            goto L_0x00c0
        L_0x008d:
            r0 = 4
            o.gp[] r8 = new p004o.C0380gp[r0]
            o.gp r0 = new o.gp
            java.lang.String r1 = "data\\lua files\\skillinfoz\\jobinheritlist.lub"
            r2 = r21
            r0.<init>(r2, r1)
            r1 = 0
            r8[r1] = r0
            o.gp r0 = new o.gp
            java.lang.String r1 = "data\\lua files\\skillinfoz\\skillid.lub"
            r2 = r21
            r0.<init>(r2, r1)
            r1 = 1
            r8[r1] = r0
            o.gp r0 = new o.gp
            java.lang.String r1 = "data\\lua files\\skillinfoz\\skillinfolist.lub"
            r2 = r21
            r0.<init>(r2, r1)
            r1 = 2
            r8[r1] = r0
            o.gp r0 = new o.gp
            java.lang.String r1 = "data\\lua files\\skillinfoz\\skilldescript.lub"
            r2 = r21
            r0.<init>(r2, r1)
            r1 = 3
            r8[r1] = r0
        L_0x00c0:
            r9 = 0
            goto L_0x00ff
        L_0x00c3:
            r10 = r8[r9]
            boolean r0 = r10.f1062
            if (r0 == 0) goto L_0x00d4
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            java.lang.String r1 = r10.f1065
            byte[] r0 = r0.mo3389(r1)
            r10.f1063 = r0
            goto L_0x00e1
        L_0x00d4:
            java.lang.String r0 = r10.f1065
            r1 = r22
            r2 = 0
            java.lang.Object r0 = r1.mo3613(r0, r2)
            byte[] r0 = (byte[]) r0
            r10.f1063 = r0
        L_0x00e1:
            byte[] r0 = r10.f1063
            java.lang.String r0 = p004o.C0622ot.m738(r0)
            r10.f1064 = r0
            if (r7 != 0) goto L_0x00fd
            o.hp r0 = p004o.C1014.f6160
            java.lang.String r1 = r10.f1065
            byte[] r2 = r10.f1063
            int r2 = r2.length
            java.lang.String r3 = r10.f1064
            r4 = 0
            int r0 = r0.mo3799(r1, r2, r4, r3)
            r1 = -1
            if (r0 != r1) goto L_0x00fd
            r7 = 1
        L_0x00fd:
            int r9 = r9 + 1
        L_0x00ff:
            int r0 = r8.length
            if (r9 < r0) goto L_0x00c3
            if (r7 == 0) goto L_0x0716
            org.keplerproject.luajava.LuaState r9 = org.keplerproject.luajava.LuaStateFactory.newLuaState()
            android.util.SparseArray r10 = new android.util.SparseArray
            r10.<init>()
            r9.openBase()
            r12 = r8
            int r11 = r8.length
            r7 = 0
            goto L_0x014f
        L_0x0114:
            r22 = r12[r7]
            r0 = r22
            java.lang.String r0 = r0.f1065
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = ".lua"
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto L_0x0136
            r0 = r22
            java.lang.String r0 = r0.f1065
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = ".lub"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L_0x014d
        L_0x0136:
            r0 = r22
            byte[] r0 = r0.f1063     // Catch:{ np -> 0x013e }
            p004o.C0591nr.m673(r9, r0)     // Catch:{ np -> 0x013e }
            goto L_0x014d
        L_0x013e:
            r13 = move-exception
            o.nq r0 = new o.nq
            r1 = r22
            java.lang.String r1 = r1.f1065
            java.lang.String r2 = r13.getMessage()
            r0.<init>(r1, r2)
            throw r0
        L_0x014d:
            int r7 = r7 + 1
        L_0x014f:
            if (r7 < r11) goto L_0x0114
            o.pc$鷭 r0 = p004o.C1014.f6140
            boolean r0 = r0.f4521
            if (r0 == 0) goto L_0x045d
            java.util.HashMap r22 = new java.util.HashMap
            r0 = r22
            r0.<init>()
            java.lang.String r0 = "SKID"
            r9.getGlobal(r0)
            p004o.C0591nr.m672(r9)
            r9.pushNil()
            goto L_0x0198
        L_0x016b:
            r0 = -1
            int r7 = r9.toInteger(r0)
            r0 = -2
            java.lang.String r11 = r9.toString(r0)
            o.gq r12 = new o.gq
            r12.<init>()
            r12.f1074 = r7
            r12.f1073 = r11
            r0 = 50
            int[] r0 = new int[r0]
            r12.f1066 = r0
            r0 = 0
            o.gq$鷭[] r0 = new p004o.C0381gq.C0382[r0]
            r12.f1069 = r0
            r0 = 1
            r12.f1068 = r0
            r10.put(r7, r12)
            r0 = r22
            r0.put(r11, r12)
            r0 = 1
            r9.pop(r0)
        L_0x0198:
            r0 = -2
            int r0 = r9.next(r0)
            if (r0 != 0) goto L_0x016b
            r0 = 1
            r9.pop(r0)
            r0 = 2
            r0 = r8[r0]
            byte[] r0 = r0.f1063
            o.op r1 = p004o.C0618op.LOCAL
            java.lang.String r0 = p004o.C0622ot.m741(r0, r1)
            java.lang.String r1 = "#"
            r2 = 1
            java.lang.String[] r7 = p004o.C0622ot.m751(r0, r2, r1)
            r11 = 0
            goto L_0x01d7
        L_0x01b7:
            r0 = r7[r11]
            java.lang.String r12 = r0.trim()
            int r0 = r11 + 1
            r0 = r7[r0]
            java.lang.String r13 = r0.trim()
            r0 = r22
            java.lang.Object r0 = r0.get(r12)
            o.gq r0 = (p004o.C0381gq) r0
            r14 = r0
            if (r14 != 0) goto L_0x01d3
            int r11 = r11 + -1
            goto L_0x01d5
        L_0x01d3:
            r14.f1071 = r13
        L_0x01d5:
            int r11 = r11 + 2
        L_0x01d7:
            int r0 = r7.length
            int r0 = r0 + -1
            if (r11 < r0) goto L_0x01b7
            r0 = r22
            java.util.Collection r0 = r0.values()
            java.util.Iterator r12 = r0.iterator()
            goto L_0x0204
        L_0x01e7:
            java.lang.Object r0 = r12.next()
            o.gq r0 = (p004o.C0381gq) r0
            r11 = r0
            java.lang.String r0 = r11.f1071
            if (r0 != 0) goto L_0x0204
            java.lang.String r0 = r11.f1073
            java.lang.String r1 = r11.f1073
            java.lang.String r2 = "_"
            int r1 = r1.indexOf(r2)
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
            r11.f1071 = r0
        L_0x0204:
            boolean r0 = r12.hasNext()
            if (r0 != 0) goto L_0x01e7
            r0 = 4
            r0 = r8[r0]
            byte[] r0 = r0.f1063
            o.op r1 = p004o.C0618op.LOCAL
            java.lang.String r0 = p004o.C0622ot.m741(r0, r1)
            java.lang.String r1 = "#"
            r2 = 1
            java.lang.String[] r7 = p004o.C0622ot.m751(r0, r2, r1)
            r11 = 0
            goto L_0x023e
        L_0x021e:
            r0 = r7[r11]
            java.lang.String r12 = r0.trim()
            int r0 = r11 + 1
            r0 = r7[r0]
            java.lang.String r13 = r0.trim()
            r0 = r22
            java.lang.Object r0 = r0.get(r12)
            o.gq r0 = (p004o.C0381gq) r0
            r14 = r0
            if (r14 != 0) goto L_0x023a
            int r11 = r11 + -1
            goto L_0x023c
        L_0x023a:
            r14.f1072 = r13
        L_0x023c:
            int r11 = r11 + 2
        L_0x023e:
            int r0 = r7.length
            int r0 = r0 + -1
            if (r11 < r0) goto L_0x021e
            r0 = 5
            r0 = r8[r0]
            byte[] r0 = r0.f1063
            o.op r1 = p004o.C0618op.LOCAL
            java.lang.String r0 = p004o.C0622ot.m741(r0, r1)
            java.lang.String r1 = "@"
            r2 = 1
            java.lang.String[] r7 = p004o.C0622ot.m751(r0, r2, r1)
            r11 = 0
            goto L_0x02bf
        L_0x0258:
            r0 = r7[r11]
            java.lang.String r0 = r0.trim()
            r7[r11] = r0
            r0 = r7[r11]
            java.lang.String r1 = "#"
            java.lang.String[] r12 = r0.split(r1)
            r13 = 0
            goto L_0x0274
        L_0x026a:
            r0 = r12[r13]
            java.lang.String r0 = r0.trim()
            r12[r13] = r0
            int r13 = r13 + 1
        L_0x0274:
            int r0 = r12.length
            if (r13 < r0) goto L_0x026a
            r0 = 0
            r13 = r12[r0]
            r0 = r22
            java.lang.Object r0 = r0.get(r13)
            o.gq r0 = (p004o.C0381gq) r0
            r14 = r0
            if (r14 == 0) goto L_0x02bd
            r15 = 1
            goto L_0x02ba
        L_0x0287:
            int[] r0 = r14.f1066     // Catch:{ NumberFormatException -> 0x029c }
            int r1 = r15 + -1
            r2 = r12[r15]     // Catch:{ NumberFormatException -> 0x029c }
            java.lang.String r2 = r2.trim()     // Catch:{ NumberFormatException -> 0x029c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x029c }
            int r2 = r2.intValue()     // Catch:{ NumberFormatException -> 0x029c }
            r0[r1] = r2     // Catch:{ NumberFormatException -> 0x029c }
            goto L_0x02b8
        L_0x029c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Error in leveluseskillspamount.txt for skill "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r13)
            java.lang.String r1 = " lv"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r15)
            java.lang.String r0 = r0.toString()
            p004o.C0592ns.m674(r0)
        L_0x02b8:
            int r15 = r15 + 1
        L_0x02ba:
            int r0 = r12.length
            if (r15 < r0) goto L_0x0287
        L_0x02bd:
            int r11 = r11 + 1
        L_0x02bf:
            int r0 = r7.length
            if (r11 < r0) goto L_0x0258
            r0 = 3
            r0 = r8[r0]
            byte[] r0 = r0.f1063
            o.op r1 = p004o.C0618op.LOCAL
            java.lang.String r0 = p004o.C0622ot.m741(r0, r1)
            java.lang.String r1 = "\\}"
            r2 = 1
            java.lang.String[] r7 = p004o.C0622ot.m751(r0, r2, r1)
            r11 = 0
            goto L_0x0458
        L_0x02d7:
            r0 = r7[r11]
            java.lang.String r0 = r0.trim()
            r7[r11] = r0
            r0 = r7[r11]
            java.lang.String r1 = "\\{"
            java.lang.String[] r12 = r0.split(r1)
            r0 = 0
            r0 = r12[r0]
            java.lang.String r0 = r0.trim()
            java.lang.String r1 = " "
            java.lang.String r2 = "_"
            java.lang.String r13 = r0.replace(r1, r2)
            int r0 = java.lang.Integer.parseInt(r13)     // Catch:{ NumberFormatException -> 0x02ff }
            o.躆 r14 = p004o.C1761.m2430(r0)     // Catch:{ NumberFormatException -> 0x02ff }
            goto L_0x0306
        L_0x02ff:
            o.躆 r14 = p004o.C1761.valueOf(r13)     // Catch:{ IllegalArgumentException -> 0x0304 }
            goto L_0x0306
        L_0x0304:
            goto L_0x0456
        L_0x0306:
            r0 = 1
            r0 = r12[r0]
            java.lang.String r1 = "@"
            java.lang.String[] r15 = r0.split(r1)
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            r17 = r15
            int r0 = r15.length
            r16 = r0
            r15 = 0
            goto L_0x0335
        L_0x031b:
            r13 = r17[r15]
            o.go r18 = new o.go
            r0 = r18
            r1 = r21
            r0.<init>(r1, r13)
            r0 = r18
            int r0 = r0.f1059
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = r18
            r12.put(r0, r1)
            int r15 = r15 + 1
        L_0x0335:
            r0 = r16
            if (r15 < r0) goto L_0x031b
            java.util.Collection r0 = r12.values()
            java.util.Iterator r15 = r0.iterator()
            goto L_0x0450
        L_0x0343:
            java.lang.Object r0 = r15.next()
            o.go r0 = (p004o.C0379go) r0
            r13 = r0
            java.lang.String r0 = r13.f1060
            r1 = r22
            java.lang.Object r0 = r1.get(r0)
            o.gq r0 = (p004o.C0381gq) r0
            r16 = r0
            if (r16 == 0) goto L_0x0450
            int r0 = r13.f1057
            r1 = r16
            r1.f1070 = r0
            java.util.ArrayList<java.lang.Integer> r0 = r13.f1058
            java.util.Iterator r18 = r0.iterator()
            goto L_0x0448
        L_0x0366:
            r0 = r18
            java.lang.Object r0 = r0.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r17 = r0.intValue()
            r0 = r17
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r12.get(r0)
            o.go r0 = (p004o.C0379go) r0
            r19 = r0
            if (r19 != 0) goto L_0x03ae
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "no prerec entry for prerec_pos="
            r0.<init>(r1)
            r1 = r17
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " for skill "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r13.f1060
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " for job "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r14)
            java.lang.String r0 = r0.toString()
            p004o.C0592ns.m674(r0)
            goto L_0x0448
        L_0x03ae:
            r0 = r19
            java.lang.String r0 = r0.f1060
            r1 = r22
            java.lang.Object r0 = r1.get(r0)
            o.gq r0 = (p004o.C0381gq) r0
            r17 = r0
            if (r17 == 0) goto L_0x0448
            o.gq$鷭 r19 = new o.gq$鷭
            r0 = r19
            r1 = r16
            r0.<init>()
            r0 = r19
            r0.f1076 = r14
            r0 = r17
            int r0 = r0.f1074
            r1 = r19
            r1.f1078 = r0
            r0 = 1
            r1 = r19
            r1.f1077 = r0
            r17 = 0
            goto L_0x0407
        L_0x03db:
            r0 = r16
            o.gq$鷭[] r0 = r0.f1069
            r0 = r0[r17]
            o.躆 r0 = r0.f1076
            r1 = r19
            o.躆 r1 = r1.f1076
            if (r0 != r1) goto L_0x0405
            r0 = r16
            o.gq$鷭[] r0 = r0.f1069
            r0 = r0[r17]
            int r0 = r0.f1078
            r1 = r19
            int r1 = r1.f1078
            if (r0 != r1) goto L_0x0405
            r0 = r16
            o.gq$鷭[] r0 = r0.f1069
            r0 = r0[r17]
            int r0 = r0.f1077
            r1 = r19
            int r1 = r1.f1077
            if (r0 == r1) goto L_0x0410
        L_0x0405:
            int r17 = r17 + 1
        L_0x0407:
            r0 = r16
            o.gq$鷭[] r0 = r0.f1069
            int r0 = r0.length
            r1 = r17
            if (r1 < r0) goto L_0x03db
        L_0x0410:
            r0 = r16
            o.gq$鷭[] r0 = r0.f1069
            int r0 = r0.length
            r1 = r17
            if (r1 < r0) goto L_0x0448
            r0 = r16
            o.gq$鷭[] r0 = r0.f1069
            r17 = r0
            if (r17 != 0) goto L_0x0430
            r0 = r19
            java.lang.Class r0 = r0.getClass()
            r1 = 0
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r17 = r0
        L_0x0430:
            r0 = r17
            int r0 = r0.length
            int r0 = r0 + 1
            r1 = r17
            java.lang.Object[] r20 = java.util.Arrays.copyOf(r1, r0)
            r0 = r17
            int r0 = r0.length
            r20[r0] = r19
            r0 = r20
            o.gq$鷭[] r0 = (p004o.C0381gq.C0382[]) r0
            r1 = r16
            r1.f1069 = r0
        L_0x0448:
            r0 = r18
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L_0x0366
        L_0x0450:
            boolean r0 = r15.hasNext()
            if (r0 != 0) goto L_0x0343
        L_0x0456:
            int r11 = r11 + 1
        L_0x0458:
            int r0 = r7.length
            if (r11 < r0) goto L_0x02d7
            goto L_0x06e6
        L_0x045d:
            java.lang.String r0 = "SKILL_INFO_LIST"
            r9.getGlobal(r0)
            r0 = -1
            boolean r0 = r9.isNil(r0)
            if (r0 == 0) goto L_0x0492
            o.no r0 = new o.no
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "SKILL_INFO_LIST is nil. skillinfolist.lub size="
            r1.<init>(r2)
            r2 = 2
            r2 = r8[r2]
            byte[] r2 = r2.f1063
            int r2 = r2.length
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " servername="
            java.lang.StringBuilder r1 = r1.append(r2)
            o.pc$鷭 r2 = p004o.C1014.f6140
            java.lang.String r2 = r2.f4522
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0492:
            r0 = -1
            boolean r0 = r9.isTable(r0)
            if (r0 != 0) goto L_0x04c2
            o.no r0 = new o.no
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid SKILL_INFO_LIST format: SKILL_INFO_LIST is not a table. skillinfolist.lub size="
            r1.<init>(r2)
            r2 = 2
            r2 = r8[r2]
            byte[] r2 = r2.f1063
            int r2 = r2.length
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " servername="
            java.lang.StringBuilder r1 = r1.append(r2)
            o.pc$鷭 r2 = p004o.C1014.f6140
            java.lang.String r2 = r2.f4522
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x04c2:
            r9.pushNil()
            goto L_0x0624
        L_0x04c7:
            r0 = -2
            int r22 = r9.toInteger(r0)
            o.gq r7 = new o.gq
            r7.<init>()
            r0 = r22
            r7.f1074 = r0
            r0 = -1
            boolean r0 = r9.isTable(r0)
            if (r0 != 0) goto L_0x04ed
            java.lang.String r17 = "Invalid SKILL_INFO_LIST format: SKILL_INFO_LIST entries are not tables \n"
            java.lang.String r0 = "AndRO"
            r1 = r17
            android.util.Log.e(r0, r1)
            o.no r0 = new o.no
            r1 = r17
            r0.<init>(r1)
            throw r0
        L_0x04ed:
            r0 = 1
            r9.pushInteger(r0)
            r0 = -2
            r9.getTable(r0)
            r0 = -1
            boolean r0 = r9.isString(r0)
            if (r0 == 0) goto L_0x0503
            r0 = -1
            java.lang.String r0 = r9.toString(r0)
            r7.f1073 = r0
        L_0x0503:
            r0 = 1
            r9.pop(r0)
            java.lang.String r0 = "SkillName"
            o.op r1 = p004o.C0618op.LOCAL
            java.lang.String r0 = p004o.C0591nr.m670(r9, r0, r1)
            r7.f1071 = r0
            java.lang.String r0 = "MaxLv"
            int r0 = p004o.C0591nr.m669(r9, r0)
            r7.f1070 = r0
            java.lang.String r0 = "SpAmount"
            r9.pushString(r0)
            r0 = -2
            r9.getTable(r0)
            r0 = -1
            boolean r0 = r9.isNil(r0)
            if (r0 != 0) goto L_0x052f
            int[] r0 = p004o.C0591nr.m668(r9)
            r7.f1066 = r0
        L_0x052f:
            r0 = 1
            r9.pop(r0)
            java.lang.String r0 = "bSeperateLv"
            r9.pushString(r0)
            r0 = -2
            r9.getTable(r0)
            r0 = -1
            boolean r0 = r9.toBoolean(r0)
            r7.f1068 = r0
            r0 = 1
            r9.pop(r0)
            java.lang.String r0 = "AttackRange"
            r9.pushString(r0)
            r0 = -2
            r9.getTable(r0)
            r0 = -1
            boolean r0 = r9.isNil(r0)
            if (r0 != 0) goto L_0x055d
            int[] r0 = p004o.C0591nr.m668(r9)
            r7.f1067 = r0
        L_0x055d:
            r0 = 1
            r9.pop(r0)
            java.lang.String r0 = "_NeedSkillList"
            r9.pushString(r0)
            r0 = -2
            r9.getTable(r0)
            r0 = -1
            boolean r0 = r9.isNil(r0)
            if (r0 != 0) goto L_0x0591
            r0 = -1
            boolean r0 = r9.isTable(r0)
            if (r0 == 0) goto L_0x057d
            r0 = 0
            m381(r9, r7, r0)
            goto L_0x0591
        L_0x057d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "invalid _NeedSkillList entry for skill="
            r0.<init>(r1)
            r1 = r22
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            p004o.C0592ns.m674(r0)
        L_0x0591:
            r0 = 1
            r9.pop(r0)
            java.lang.String r0 = "NeedSkillList"
            r9.pushString(r0)
            r0 = -2
            r9.getTable(r0)
            r0 = -1
            boolean r0 = r9.isNil(r0)
            if (r0 != 0) goto L_0x0617
            r0 = -1
            boolean r0 = r9.isTable(r0)
            if (r0 != 0) goto L_0x05bd
            java.lang.String r17 = "not table"
            java.lang.String r0 = "AndRO"
            r1 = r17
            android.util.Log.e(r0, r1)
            o.no r0 = new o.no
            r1 = r17
            r0.<init>(r1)
            throw r0
        L_0x05bd:
            r9.pushNil()
            goto L_0x0610
        L_0x05c2:
            r0 = -1
            boolean r0 = r9.isTable(r0)
            if (r0 == 0) goto L_0x05d0
            r0 = -2
            boolean r0 = r9.isNumber(r0)
            if (r0 != 0) goto L_0x05e5
        L_0x05d0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid NeedSkillList entry for skill "
            r0.<init>(r1)
            r1 = r22
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            p004o.C0592ns.m674(r0)
            goto L_0x060c
        L_0x05e5:
            r0 = -2
            int r11 = r9.toInteger(r0)
            o.躆 r12 = p004o.C1761.m2430(r11)
            if (r12 == 0) goto L_0x05f4
            m381(r9, r7, r12)
            goto L_0x060c
        L_0x05f4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to read skill prerecs: converting class "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r11)
            java.lang.String r1 = " to JOB failed."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            p004o.C0592ns.m674(r0)
        L_0x060c:
            r0 = 1
            r9.pop(r0)
        L_0x0610:
            r0 = -2
            int r0 = r9.next(r0)
            if (r0 != 0) goto L_0x05c2
        L_0x0617:
            r0 = 1
            r9.pop(r0)
            r0 = 1
            r9.pop(r0)
            r0 = r22
            r10.put(r0, r7)
        L_0x0624:
            r0 = -2
            int r0 = r9.next(r0)
            if (r0 != 0) goto L_0x04c7
            r0 = 1
            r9.pop(r0)
            java.lang.String r0 = "SKILL_DESCRIPT"
            r9.getGlobal(r0)
            r0 = -1
            boolean r0 = r9.isTable(r0)
            if (r0 != 0) goto L_0x064c
            java.lang.String r17 = "Invalid SKILL_DESCRIPT format: SKILL_DESCRIPT is not a table"
            java.lang.String r0 = "AndRO"
            r1 = r17
            android.util.Log.e(r0, r1)
            o.no r0 = new o.no
            r1 = r17
            r0.<init>(r1)
            throw r0
        L_0x064c:
            r9.pushNil()
            goto L_0x06df
        L_0x0651:
            r0 = -2
            int r22 = r9.toInteger(r0)
            r0 = r22
            java.lang.Object r0 = r10.get(r0)
            o.gq r0 = (p004o.C0381gq) r0
            r7 = r0
            if (r7 != 0) goto L_0x067b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid skill description found: "
            r0.<init>(r1)
            r1 = r22
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            p004o.C0592ns.m674(r0)
            r0 = 1
            r9.pop(r0)
            goto L_0x06df
        L_0x067b:
            r0 = -1
            boolean r0 = r9.isTable(r0)
            if (r0 != 0) goto L_0x0693
            java.lang.String r17 = "Invalid SKILL_DESCRIPT format: SKILL_DESCRIPT content entry is not a table"
            java.lang.String r0 = "AndRO"
            r1 = r17
            android.util.Log.e(r0, r1)
            o.no r0 = new o.no
            r1 = r17
            r0.<init>(r1)
            throw r0
        L_0x0693:
            r9.pushNil()
            goto L_0x06d4
        L_0x0697:
            r0 = -1
            boolean r0 = r9.isString(r0)
            if (r0 != 0) goto L_0x06af
            java.lang.String r17 = "Invalid SKILL_DESCRIPT format: SKILL_DESCRIPT content entry content is not string"
            java.lang.String r0 = "AndRO"
            r1 = r17
            android.util.Log.e(r0, r1)
            o.no r0 = new o.no
            r1 = r17
            r0.<init>(r1)
            throw r0
        L_0x06af:
            java.lang.String r1 = r7.f1072
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            o.op r1 = p004o.C0618op.LOCAL
            java.lang.String r1 = p004o.C0591nr.m671(r9, r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.f1072 = r0
            r0 = 1
            r9.pop(r0)
        L_0x06d4:
            r0 = -2
            int r0 = r9.next(r0)
            if (r0 != 0) goto L_0x0697
            r0 = 1
            r9.pop(r0)
        L_0x06df:
            r0 = -2
            int r0 = r9.next(r0)
            if (r0 != 0) goto L_0x0651
        L_0x06e6:
            r9.close()
            o.hp r0 = p004o.C1014.f6160
            r0.mo3804(r10)
            r12 = r8
            int r11 = r8.length
            r7 = 0
            goto L_0x0714
        L_0x06f2:
            r22 = r12[r7]
            o.hp r0 = p004o.C1014.f6160
            r1 = r22
            java.lang.String r1 = r1.f1065
            r19 = r1
            r1 = r22
            byte[] r1 = r1.f1063
            int r2 = r1.length
            r20 = r2
            r1 = r22
            java.lang.String r8 = r1.f1064
            r3 = r19
            r4 = r20
            r6 = r8
            r1 = 1
            r2 = -1
            r5 = 0
            r0.mo3800(r1, r2, r3, r4, r5, r6)
            int r7 = r7 + 1
        L_0x0714:
            if (r7 < r11) goto L_0x06f2
        L_0x0716:
            o.hp r0 = p004o.C1014.f6160
            java.util.HashMap r0 = r0.mo3797()
            r1 = r21
            r1.f1055 = r0
            o.gq r0 = new o.gq
            r0.<init>()
            r1 = r21
            r1.f1054 = r0
            r0 = r21
            o.gq r0 = r0.f1054
            r1 = 314(0x13a, float:4.4E-43)
            r0.f1074 = r1
            r0 = r21
            o.gq r0 = r0.f1054
            java.lang.String r1 = "BD_RAGNAROK"
            r0.f1073 = r1
            r0 = r21
            o.gq r0 = r0.f1054
            java.lang.String r1 = "Unknown Skill"
            r0.f1071 = r1
            r0 = r21
            o.gq r0 = r0.f1054
            r1 = 1
            r0.f1070 = r1
            r0 = r21
            o.gq r0 = r0.f1054
            r1 = 1
            int[] r1 = new int[r1]
            r0.f1066 = r1
            r0 = r21
            o.gq r0 = r0.f1054
            r1 = 1
            int[] r1 = new int[r1]
            r0.f1067 = r1
            r0 = r21
            o.gq r0 = r0.f1054
            r1 = 0
            r0.f1068 = r1
            r0 = r21
            o.gq r0 = r0.f1054
            r1 = 0
            o.gq$鷭[] r1 = new p004o.C0381gq.C0382[r1]
            r0.f1069 = r1
            r0 = r21
            o.gq r0 = r0.f1054
            java.lang.String r1 = "No description"
            r0.f1072 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0378gn.<init>(o.cl):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final C0381gq mo3752(int i) {
        C0381gq gqVar = (C0381gq) this.f1055.get(Integer.valueOf(i));
        if (gqVar == null) {
            return this.f1054;
        }
        if (gqVar.f1073 == null) {
            gqVar = C1014.f6160.mo3793(i);
            if (gqVar == null) {
                return this.f1054;
            }
            this.f1055.put(Integer.valueOf(i), gqVar);
        }
        return gqVar;
    }
}
