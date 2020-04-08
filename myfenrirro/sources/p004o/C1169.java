package p004o;

/* renamed from: o.ʚ */
final class C1169 extends C0762sz {
    C1169() {
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 143 */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4052(java.nio.ByteBuffer r6, int r7, boolean r8, int r9) {
        /*
            r5 = this;
            r0 = 338(0x152, float:4.74E-43)
            r5.f4671 = r0
            int r9 = r6.getInt()
            int r2 = r6.getInt()
            r3 = r6
            byte[] r4 = new byte[r7]
            r3.get(r4)
            r6 = r4
            if (r8 == 0) goto L_0x0016
            return
        L_0x0016:
            o.cp r0 = p004o.C1014.f6158
            r3 = r6
            r8 = r2
            r7 = r9
            java.lang.String r6 = p004o.C0252cp.m270(r7, r8)     // Catch:{ FileNotFoundException -> 0x002f, IOException -> 0x004a }
            p004o.C0622ot.m719(r6)     // Catch:{ FileNotFoundException -> 0x002f, IOException -> 0x004a }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x002f, IOException -> 0x004a }
            r0.<init>(r6)     // Catch:{ FileNotFoundException -> 0x002f, IOException -> 0x004a }
            r6 = r0
            r0.write(r3)     // Catch:{ FileNotFoundException -> 0x002f, IOException -> 0x004a }
            r6.close()     // Catch:{ FileNotFoundException -> 0x002f, IOException -> 0x004a }
            goto L_0x0065
        L_0x002f:
            r3 = move-exception
            java.lang.String r0 = "AndRO"
            java.lang.String r1 = r3.toString()
            android.util.Log.e(r0, r1)
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            java.lang.StackTraceElement[] r0 = r3.getStackTrace()
            r2.setStackTrace(r0)
            throw r2
        L_0x004a:
            r3 = move-exception
            java.lang.String r0 = "AndRO"
            java.lang.String r1 = r3.toString()
            android.util.Log.e(r0, r1)
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            java.lang.StackTraceElement[] r0 = r3.getStackTrace()
            r2.setStackTrace(r0)
            throw r2
        L_0x0065:
            o.lq r0 = p004o.C1014.f6142
            o.mb r6 = r0.f1693
            if (r6 == 0) goto L_0x0090
            o.訍 r0 = r6.f1775
            if (r0 == 0) goto L_0x0090
            o.le r2 = r6.f1769
            java.lang.Class<o.둆> r4 = p004o.C1919.class
            java.lang.Class r0 = r2.getClass()
            boolean r0 = r4.isAssignableFrom(r0)
            if (r0 == 0) goto L_0x007f
            r0 = r2
            goto L_0x0080
        L_0x007f:
            r0 = 0
        L_0x0080:
            o.둆 r0 = (p004o.C1919) r0
            r7 = r0
            if (r7 == 0) goto L_0x0090
            int r0 = r7.f8637
            if (r0 != r9) goto L_0x0090
            r7.f8638 = r8
            o.訍 r0 = r6.f1775
            r0.mo4493()
        L_0x0090:
            o.lq r0 = p004o.C1014.f6142
            o.hn r0 = r0.f1680
            java.util.HashMap<java.lang.Integer, o.mb> r0 = r0.f1189
            java.util.Collection r0 = r0.values()
            java.util.Iterator r6 = r0.iterator()
            goto L_0x00cb
        L_0x009f:
            java.lang.Object r0 = r6.next()
            o.mb r0 = (p004o.C0548mb) r0
            r7 = r0
            o.le r2 = r7.f1769
            java.lang.Class<o.둆> r4 = p004o.C1919.class
            java.lang.Class r0 = r2.getClass()
            boolean r0 = r4.isAssignableFrom(r0)
            if (r0 == 0) goto L_0x00b6
            r0 = r2
            goto L_0x00b7
        L_0x00b6:
            r0 = 0
        L_0x00b7:
            o.둆 r0 = (p004o.C1919) r0
            r8 = r0
            if (r8 == 0) goto L_0x00cb
            int r0 = r8.f1633
            o.㱽 r1 = p004o.C1430.FLAG_CLASS
            int r1 = r1.f7044
            if (r0 != r1) goto L_0x00cb
            int r0 = r8.f8637
            if (r0 != r9) goto L_0x00cb
            r7.mo4018()
        L_0x00cb:
            boolean r0 = r6.hasNext()
            if (r0 != 0) goto L_0x009f
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1169.mo4052(java.nio.ByteBuffer, int, boolean, int):void");
    }
}
