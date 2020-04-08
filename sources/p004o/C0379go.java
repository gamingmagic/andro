package p004o;

import java.util.ArrayList;

/* renamed from: o.go */
class C0379go {

    /* renamed from: Ą */
    final /* synthetic */ C0378gn f1056;

    /* renamed from: ȃ */
    int f1057;

    /* renamed from: ˮ͈ */
    ArrayList<Integer> f1058 = new ArrayList<>();

    /* renamed from: 櫯 */
    int f1059;

    /* renamed from: 鷭 */
    String f1060;

    /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|24|15|16) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x005a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C0379go(p004o.C0378gn r4, java.lang.String r5) {
        /*
            r3 = this;
            r3.f1056 = r4
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f1058 = r0
            java.lang.String r0 = r5.trim()     // Catch:{ NumberFormatException -> 0x007a }
            java.lang.String r1 = "#"
            java.lang.String[] r4 = r0.split(r1)     // Catch:{ NumberFormatException -> 0x007a }
            r2 = 0
            goto L_0x0022
        L_0x0018:
            r0 = r4[r2]     // Catch:{ NumberFormatException -> 0x007a }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x007a }
            r4[r2] = r0     // Catch:{ NumberFormatException -> 0x007a }
            int r2 = r2 + 1
        L_0x0022:
            int r0 = r4.length     // Catch:{ NumberFormatException -> 0x007a }
            if (r2 < r0) goto L_0x0018
            int r0 = r4.length     // Catch:{ NumberFormatException -> 0x007a }
            r1 = 2
            if (r0 >= r1) goto L_0x002f
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ NumberFormatException -> 0x007a }
            r0.<init>(r5)     // Catch:{ NumberFormatException -> 0x007a }
            throw r0     // Catch:{ NumberFormatException -> 0x007a }
        L_0x002f:
            r0 = 0
            r0 = r4[r0]     // Catch:{ NumberFormatException -> 0x007a }
            r3.f1060 = r0     // Catch:{ NumberFormatException -> 0x007a }
            r0 = 1
            r0 = r4[r0]     // Catch:{ NumberFormatException -> 0x007a }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x007a }
            r3.f1059 = r0     // Catch:{ NumberFormatException -> 0x007a }
            int r0 = r4.length     // Catch:{ NumberFormatException -> 0x007a }
            int r0 = r0 + -1
            r0 = r4[r0]     // Catch:{ NumberFormatException -> 0x007a }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x007a }
            r3.f1057 = r0     // Catch:{ NumberFormatException -> 0x007a }
            r2 = 2
            goto L_0x0074
        L_0x004a:
            java.util.ArrayList<java.lang.Integer> r0 = r3.f1058     // Catch:{ NumberFormatException -> 0x005a }
            r1 = r4[r2]     // Catch:{ NumberFormatException -> 0x005a }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x005a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x005a }
            r0.add(r1)     // Catch:{ NumberFormatException -> 0x005a }
            goto L_0x0072
        L_0x005a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x007a }
            java.lang.String r1 = "error in skill tree entry string "
            r0.<init>(r1)     // Catch:{ NumberFormatException -> 0x007a }
            java.lang.StringBuilder r0 = r0.append(r5)     // Catch:{ NumberFormatException -> 0x007a }
            java.lang.String r1 = ": invalid prerec pos"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ NumberFormatException -> 0x007a }
            java.lang.String r0 = r0.toString()     // Catch:{ NumberFormatException -> 0x007a }
            p004o.C0592ns.m674(r0)     // Catch:{ NumberFormatException -> 0x007a }
        L_0x0072:
            int r2 = r2 + 1
        L_0x0074:
            int r0 = r4.length     // Catch:{ NumberFormatException -> 0x007a }
            int r0 = r0 + -1
            if (r2 < r0) goto L_0x004a
            return
        L_0x007a:
            r4 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0379go.<init>(o.gn, java.lang.String):void");
    }
}
