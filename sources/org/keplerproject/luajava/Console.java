package org.keplerproject.luajava;

public class Console {
    /* JADX WARNING: CFG modification limit reached, blocks count: 136 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void main(java.lang.String[] r6) {
        /*
            org.keplerproject.luajava.LuaState r3 = org.keplerproject.luajava.LuaStateFactory.newLuaState()     // Catch:{ Exception -> 0x0088 }
            r3.openLibs()     // Catch:{ Exception -> 0x0088 }
            int r0 = r6.length     // Catch:{ Exception -> 0x0088 }
            if (r0 <= 0) goto L_0x0049
            r4 = 0
            goto L_0x0045
        L_0x000c:
            r0 = r6[r4]     // Catch:{ Exception -> 0x0088 }
            int r5 = r3.LloadFile(r0)     // Catch:{ Exception -> 0x0088 }
            if (r5 != 0) goto L_0x001b
            r0 = 0
            r1 = 0
            r2 = 0
            int r5 = r3.pcall(r0, r1, r2)     // Catch:{ Exception -> 0x0088 }
        L_0x001b:
            if (r5 == 0) goto L_0x0043
            org.keplerproject.luajava.LuaException r0 = new org.keplerproject.luajava.LuaException     // Catch:{ Exception -> 0x0088 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0088 }
            java.lang.String r2 = "Error on file: "
            r1.<init>(r2)     // Catch:{ Exception -> 0x0088 }
            r2 = r6[r4]     // Catch:{ Exception -> 0x0088 }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Exception -> 0x0088 }
            java.lang.String r2 = ". "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Exception -> 0x0088 }
            r2 = -1
            java.lang.String r2 = r3.toString(r2)     // Catch:{ Exception -> 0x0088 }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Exception -> 0x0088 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0088 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0088 }
            throw r0     // Catch:{ Exception -> 0x0088 }
        L_0x0043:
            int r4 = r4 + 1
        L_0x0045:
            int r0 = r6.length     // Catch:{ Exception -> 0x0088 }
            if (r4 < r0) goto L_0x000c
            return
        L_0x0049:
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0088 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0088 }
            java.io.InputStream r1 = java.lang.System.in     // Catch:{ Exception -> 0x0088 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0088 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0088 }
            goto L_0x006f
        L_0x0056:
            byte[] r0 = r5.getBytes()     // Catch:{ Exception -> 0x0088 }
            java.lang.String r1 = "from console"
            int r6 = r3.LloadBuffer(r0, r1)     // Catch:{ Exception -> 0x0088 }
            if (r6 != 0) goto L_0x0069
            r0 = 0
            r1 = 0
            r2 = 0
            int r6 = r3.pcall(r0, r1, r2)     // Catch:{ Exception -> 0x0088 }
        L_0x0069:
            if (r6 == 0) goto L_0x006f
            r0 = -1
            r3.toString(r0)     // Catch:{ Exception -> 0x0088 }
        L_0x006f:
            java.io.PrintStream r0 = java.lang.System.out     // Catch:{ Exception -> 0x0088 }
            java.lang.String r1 = "> "
            r0.print(r1)     // Catch:{ Exception -> 0x0088 }
            java.lang.String r5 = r4.readLine()     // Catch:{ Exception -> 0x0088 }
            if (r5 == 0) goto L_0x0084
            java.lang.String r0 = "exit"
            boolean r0 = r5.equals(r0)     // Catch:{ Exception -> 0x0088 }
            if (r0 == 0) goto L_0x0056
        L_0x0084:
            r3.close()     // Catch:{ Exception -> 0x0088 }
            return
        L_0x0088:
            r0 = move-exception
            r0.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.keplerproject.luajava.Console.main(java.lang.String[]):void");
    }
}
