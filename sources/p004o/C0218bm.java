package p004o;

/* renamed from: o.bm */
class C0218bm implements Runnable {

    /* renamed from: 櫯 */
    private final /* synthetic */ boolean[] f497;

    /* renamed from: 鷭 */
    final /* synthetic */ C0214bi f498;

    C0218bm(C0214bi biVar, boolean[] zArr) {
        this.f498 = biVar;
        this.f497 = zArr;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 161 */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            o.lq r0 = p004o.C1014.f6142
            o.騛 r3 = r0.f1698
            o.na r0 = p004o.C0574na.UNLOADING
            r3.f8351 = r0
            java.nio.IntBuffer r0 = r3.f8357
            if (r0 == 0) goto L_0x0019
            o.騛$if[] r0 = p004o.C1812.C1813if.values()
            int r0 = r0.length
            java.nio.IntBuffer r1 = r3.f8357
            android.opengl.GLES20.glDeleteTextures(r0, r1)
            r0 = 0
            r3.f8357 = r0
        L_0x0019:
            java.util.HashMap<java.lang.String, o.hk> r4 = p004o.C0252cp.f650
            monitor-enter(r4)
            java.util.HashMap<java.lang.String, o.hk> r0 = p004o.C0252cp.f650     // Catch:{ all -> 0x00b5 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x00b5 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x00b5 }
            goto L_0x00ad
        L_0x0028:
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x00b5 }
            o.hk r0 = (p004o.C0405hk) r0     // Catch:{ all -> 0x00b5 }
            r5 = r0
            o.hk$鷭[] r0 = r5.f1144     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x006e
            o.hk$鷭[] r10 = r5.f1144     // Catch:{ all -> 0x00b5 }
            int r9 = r10.length     // Catch:{ all -> 0x00b5 }
            r8 = 0
            goto L_0x006c
        L_0x0038:
            r7 = r10[r8]     // Catch:{ all -> 0x00b5 }
            if (r7 == 0) goto L_0x006a
            int r0 = r7.f1163     // Catch:{ all -> 0x00b5 }
            if (r0 <= 0) goto L_0x0053
            r0 = 1
            int[] r0 = new int[r0]     // Catch:{ all -> 0x00b5 }
            int r1 = r7.f1163     // Catch:{ all -> 0x00b5 }
            r2 = 0
            r0[r2] = r1     // Catch:{ all -> 0x00b5 }
            java.nio.IntBuffer r0 = java.nio.IntBuffer.wrap(r0)     // Catch:{ all -> 0x00b5 }
            r1 = 1
            android.opengl.GLES20.glDeleteTextures(r1, r0)     // Catch:{ all -> 0x00b5 }
            r0 = 0
            r7.f1163 = r0     // Catch:{ all -> 0x00b5 }
        L_0x0053:
            int r0 = r7.f1161     // Catch:{ all -> 0x00b5 }
            if (r0 <= 0) goto L_0x006a
            r0 = 1
            int[] r0 = new int[r0]     // Catch:{ all -> 0x00b5 }
            int r1 = r7.f1161     // Catch:{ all -> 0x00b5 }
            r2 = 0
            r0[r2] = r1     // Catch:{ all -> 0x00b5 }
            java.nio.IntBuffer r0 = java.nio.IntBuffer.wrap(r0)     // Catch:{ all -> 0x00b5 }
            r1 = 1
            android.opengl.GLES20.glDeleteTextures(r1, r0)     // Catch:{ all -> 0x00b5 }
            r0 = 0
            r7.f1161 = r0     // Catch:{ all -> 0x00b5 }
        L_0x006a:
            int r8 = r8 + 1
        L_0x006c:
            if (r8 < r9) goto L_0x0038
        L_0x006e:
            o.hk$鷭[] r0 = r5.f1145     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x00ad
            o.hk$鷭[] r10 = r5.f1145     // Catch:{ all -> 0x00b5 }
            int r9 = r10.length     // Catch:{ all -> 0x00b5 }
            r8 = 0
            goto L_0x00ab
        L_0x0077:
            r7 = r10[r8]     // Catch:{ all -> 0x00b5 }
            if (r7 == 0) goto L_0x00a9
            int r0 = r7.f1163     // Catch:{ all -> 0x00b5 }
            if (r0 <= 0) goto L_0x0092
            r0 = 1
            int[] r0 = new int[r0]     // Catch:{ all -> 0x00b5 }
            int r1 = r7.f1163     // Catch:{ all -> 0x00b5 }
            r2 = 0
            r0[r2] = r1     // Catch:{ all -> 0x00b5 }
            java.nio.IntBuffer r0 = java.nio.IntBuffer.wrap(r0)     // Catch:{ all -> 0x00b5 }
            r1 = 1
            android.opengl.GLES20.glDeleteTextures(r1, r0)     // Catch:{ all -> 0x00b5 }
            r0 = 0
            r7.f1163 = r0     // Catch:{ all -> 0x00b5 }
        L_0x0092:
            int r0 = r7.f1161     // Catch:{ all -> 0x00b5 }
            if (r0 <= 0) goto L_0x00a9
            r0 = 1
            int[] r0 = new int[r0]     // Catch:{ all -> 0x00b5 }
            int r1 = r7.f1161     // Catch:{ all -> 0x00b5 }
            r2 = 0
            r0[r2] = r1     // Catch:{ all -> 0x00b5 }
            java.nio.IntBuffer r0 = java.nio.IntBuffer.wrap(r0)     // Catch:{ all -> 0x00b5 }
            r1 = 1
            android.opengl.GLES20.glDeleteTextures(r1, r0)     // Catch:{ all -> 0x00b5 }
            r0 = 0
            r7.f1161 = r0     // Catch:{ all -> 0x00b5 }
        L_0x00a9:
            int r8 = r8 + 1
        L_0x00ab:
            if (r8 < r9) goto L_0x0077
        L_0x00ad:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x00b5 }
            if (r0 != 0) goto L_0x0028
            monitor-exit(r4)     // Catch:{ all -> 0x00b5 }
            goto L_0x00b8
        L_0x00b5:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00b5 }
            throw r0
        L_0x00b8:
            java.util.HashMap<java.lang.String, o.cp$if> r4 = p004o.C0252cp.f651
            monitor-enter(r4)
            java.util.HashMap<java.lang.String, o.cp$if> r0 = p004o.C0252cp.f651     // Catch:{ all -> 0x00e9 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x00e9 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x00e9 }
            goto L_0x00e1
        L_0x00c6:
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x00e9 }
            o.cp$if r0 = (p004o.C0252cp.C0253if) r0     // Catch:{ all -> 0x00e9 }
            r5 = r0
            int r0 = r5.f680     // Catch:{ all -> 0x00e9 }
            if (r0 <= 0) goto L_0x00e1
            r0 = 1
            int[] r0 = new int[r0]     // Catch:{ all -> 0x00e9 }
            int r1 = r5.f680     // Catch:{ all -> 0x00e9 }
            r2 = 0
            r0[r2] = r1     // Catch:{ all -> 0x00e9 }
            java.nio.IntBuffer r0 = java.nio.IntBuffer.wrap(r0)     // Catch:{ all -> 0x00e9 }
            r1 = 1
            android.opengl.GLES20.glDeleteTextures(r1, r0)     // Catch:{ all -> 0x00e9 }
        L_0x00e1:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x00e9 }
            if (r0 != 0) goto L_0x00c6
            monitor-exit(r4)     // Catch:{ all -> 0x00e9 }
            goto L_0x00ec
        L_0x00e9:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00e9 }
            throw r0
        L_0x00ec:
            r0 = 0
            r3.f8355 = r0
            o.na r0 = p004o.C0574na.UNLOADED
            r3.f8351 = r0
            boolean[] r0 = r11.f497
            r1 = 1
            r2 = 0
            r0[r2] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0218bm.run():void");
    }
}
