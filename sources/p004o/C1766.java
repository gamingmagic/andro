package p004o;

/* renamed from: o.郗 */
class C1766 implements C0597nx {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ boolean f8296;

    /* renamed from: 櫯 */
    private final /* synthetic */ C1205 f8297;

    /* renamed from: 鷭 */
    final /* synthetic */ C1204 f8298;

    C1766(C1204 r1, C1205 r2, boolean z) {
        this.f8298 = r1;
        this.f8297 = r2;
        this.f8296 = z;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 139 */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007c, code lost:
        if (r10.f1595.f8848 != ((p004o.C1992) p004o.C1014.f6137.f1636.f6528.get(java.lang.Integer.valueOf(r6))).f8848) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        r0 = r9.f8298.f6313;
        r2 = r9.f8298;
        r1 = r2.f6306;
        r2.f6306 = r1 + 1;
        r0[r1] = r6;
        r4 = r9.f8298;
        r5 = r9.f8298.f6313[r9.f8298.f6306 - 1];
        r6 = (p004o.C1992) p004o.C1014.f6137.f1636.f6528.get(java.lang.Integer.valueOf(r5));
        r4.f6317.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b0, code lost:
        if (r6 == null) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b2, code lost:
        r6.f8846--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ba, code lost:
        if (r6.f8846 > 0) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00bc, code lost:
        p004o.C1014.f6137.f1636.f6528.remove(java.lang.Integer.valueOf(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c9, code lost:
        r7 = p004o.C1014.f6147.f51.f1445;
        r8 = r6.f8839;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d7, code lost:
        if (r7.f1626.getParent() == null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d9, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00db, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00dc, code lost:
        if (r0 == false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00de, code lost:
        r7.mo4533(p004o.C0572mz.m662(r8));
     */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3669(p004o.C0512ky r10) {
        /*
            r9 = this;
            o.쎥 r0 = r10.f1595
            int r0 = r0.f8848
            o.ˮ̄ r1 = r9.f8298
            int r1 = r1.f6308
            if (r0 == r1) goto L_0x0028
            o.쎥 r0 = r10.f1595
            int r0 = r0.f8848
            o.ˮ̄ r1 = r9.f8298
            int r1 = r1.f6309
            if (r0 == r1) goto L_0x0028
            o.쎥 r0 = r10.f1595
            int r0 = r0.f8848
            o.ˮ̄ r1 = r9.f8298
            int r1 = r1.f6314
            if (r0 == r1) goto L_0x0028
            o.쎥 r0 = r10.f1595
            int r0 = r0.f8848
            o.ˮ̄ r1 = r9.f8298
            int r1 = r1.f6316
            if (r0 != r1) goto L_0x0033
        L_0x0028:
            o.ˮ̄ r0 = r9.f8298
            boolean r0 = r0.f6315
            if (r0 != 0) goto L_0x0033
            o.ˮ̄ r0 = r9.f8298
            r1 = 1
            r0.f6315 = r1
        L_0x0033:
            o.ˮ̄ r0 = r9.f8298
            int r0 = r0.f6306
            o.ˮ̄ r1 = r9.f8298
            int r1 = r1.f6311
            if (r0 >= r1) goto L_0x0143
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            java.util.HashMap<java.lang.Integer, o.쎥> r0 = r0.f6528
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r5 = r0.iterator()
            goto L_0x00e6
        L_0x004d:
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r4 = r0
            java.lang.Object r0 = r4.getKey()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r6 = r0.intValue()
            java.lang.Object r0 = r4.getValue()
            o.쎥 r0 = (p004o.C1992) r0
            if (r0 == 0) goto L_0x00e6
            o.쎥 r0 = r10.f1595
            int r0 = r0.f8848
            o.lf r1 = p004o.C1014.f6137
            o.ձ r1 = r1.f1636
            java.util.HashMap<java.lang.Integer, o.쎥> r1 = r1.f6528
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.Object r1 = r1.get(r2)
            o.쎥 r1 = (p004o.C1992) r1
            int r1 = r1.f8848
            if (r0 != r1) goto L_0x00e6
            o.ˮ̄ r0 = r9.f8298
            int[] r0 = r0.f6313
            o.ˮ̄ r2 = r9.f8298
            int r1 = r2.f6306
            int r3 = r1 + 1
            r2.f6306 = r3
            r0[r1] = r6
            o.ˮ̄ r4 = r9.f8298
            o.ˮ̄ r0 = r9.f8298
            int[] r0 = r0.f6313
            o.ˮ̄ r1 = r9.f8298
            int r1 = r1.f6306
            int r1 = r1 + -1
            r5 = r0[r1]
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            java.util.HashMap<java.lang.Integer, o.쎥> r0 = r0.f6528
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Object r0 = r0.get(r1)
            o.쎥 r0 = (p004o.C1992) r0
            r6 = r0
            java.util.ArrayList<o.쎥> r0 = r4.f6317
            r0.add(r6)
            if (r6 == 0) goto L_0x00e5
            int r0 = r6.f8846
            int r0 = r0 + -1
            r6.f8846 = r0
            int r0 = r6.f8846
            if (r0 > 0) goto L_0x00c9
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            java.util.HashMap<java.lang.Integer, o.쎥> r0 = r0.f6528
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0.remove(r1)
        L_0x00c9:
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            o.ix r0 = r0.f51
            o.魘 r7 = r0.f1445
            o.䒧 r8 = r6.f8839
            android.view.View r0 = r7.f1626
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x00db
            r0 = 1
            goto L_0x00dc
        L_0x00db:
            r0 = 0
        L_0x00dc:
            if (r0 == 0) goto L_0x00e5
            o.mz r0 = p004o.C0572mz.m662(r8)
            r7.mo4533(r0)
        L_0x00e5:
            goto L_0x00ec
        L_0x00e6:
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L_0x004d
        L_0x00ec:
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            o.ix r0 = r0.f51
            o.ڇ r4 = r0.f1389
            o.쎥 r5 = r10.f1595
            o.ˮ̄ r0 = r9.f8298
            int r6 = r0.f6306
            int r0 = r5.f8848
            if (r0 == 0) goto L_0x0143
            int r6 = r6 + -1
            android.widget.TextView[] r0 = r4.f6606
            r0 = r0[r6]
            o.cp r1 = p004o.C1014.f6158
            o.ck r1 = r1.f674
            o.祛 r1 = r1.f608
            java.lang.String r1 = r5.mo4615(r1)
            r0.setText(r1)
            android.widget.TextView[] r0 = r4.f6606
            r0 = r0[r6]
            int r1 = r5.mo4610()
            r0.setTextColor(r1)
            android.widget.ImageView[] r0 = r4.f6609
            r0 = r0[r6]
            r1 = 0
            r0.setVisibility(r1)
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            o.ix r7 = r0.f51
            android.widget.ImageView[] r0 = r4.f6609
            r8 = r0[r6]
            r10 = r5
            o.cp r0 = p004o.C1014.f6158
            o.ck r0 = r0.f674
            int r1 = r10.f8848
            boolean r2 = r10.f8837
            r3 = 0
            java.lang.String r0 = r0.mo3608(r1, r2, r3)
            android.graphics.Bitmap r1 = r7.f1450
            r7.mo3871(r8, r0, r1)
            int[] r0 = r4.f6612
            int r1 = r5.f8848
            r0[r6] = r1
        L_0x0143:
            o.ˮ̄ r0 = r9.f8298
            o.ˮ̄$鷭 r1 = r9.f8297
            int r1 = r1.f6322
            boolean r2 = r9.f8296
            r0.mo4271(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1766.mo3669(o.ky):void");
    }

    /* renamed from: 鷭 */
    public final void mo3668() {
        C1204.m1959(this.f8298.f6313, this.f8298.f6317);
        C1014.f6144.mo3652((C0839ue) new C1082(0, null));
    }
}
