package p004o;

import java.util.ArrayList;

/* renamed from: o.橠 */
class C1648 implements Runnable {

    /* renamed from: 櫯 */
    private final /* synthetic */ ArrayList f7610;

    /* renamed from: 鷭 */
    final /* synthetic */ C1914 f7611;

    C1648(C1914 r1, ArrayList arrayList) {
        this.f7611 = r1;
        this.f7610 = arrayList;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 140 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            o.ix r8 = r0.f51
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            o.jm r1 = new o.jm
            r1.<init>(r8)
            r0.mo3387(r1)
            o.데 r0 = r10.f7611
            o.댚 r3 = r0.f8609
            java.util.ArrayList r4 = r10.f7610
            o.데 r0 = r10.f7611
            o.댚 r0 = r0.f8609
            o.댚$ȃ r5 = r0.f8551
            android.support.v4.view.ViewPager r0 = r3.f8550
            android.support.v4.view.PagerAdapter r0 = r0.getAdapter()
            o.댚$鷭 r0 = (p004o.C1904.C1909) r0
            r6 = r0
            if (r6 == 0) goto L_0x002a
            java.util.ArrayList r6 = r6.mo4566()
            goto L_0x002f
        L_0x002a:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x002f:
            java.util.Iterator r8 = r6.iterator()
            goto L_0x0065
        L_0x0035:
            java.lang.Object r0 = r8.next()
            o.댚$櫯 r0 = (p004o.C1904.C1908) r0
            r7 = r0
            r9 = 0
            java.util.Iterator r6 = r4.iterator()
            goto L_0x0054
        L_0x0042:
            java.lang.Object r0 = r6.next()
            o.댚$櫯 r0 = (p004o.C1904.C1908) r0
            o.nz r0 = r0.f8598
            short r0 = r0.f2895
            o.nz r1 = r7.f8598
            short r1 = r1.f2895
            if (r0 != r1) goto L_0x0054
            r9 = 1
            goto L_0x005a
        L_0x0054:
            boolean r0 = r6.hasNext()
            if (r0 != 0) goto L_0x0042
        L_0x005a:
            if (r9 == 0) goto L_0x0062
            android.graphics.Bitmap r0 = r7.f8600
            r0.recycle()
            goto L_0x0065
        L_0x0062:
            r4.add(r7)
        L_0x0065:
            boolean r0 = r8.hasNext()
            if (r0 != 0) goto L_0x0035
            r6 = r4
            r7 = 0
            o.hp r0 = p004o.C1014.f6160
            java.lang.String r1 = "last_char_slot"
            r2 = 0
            int r8 = r0.mo3795(r1, r2)
            r9 = 0
            goto L_0x0088
        L_0x0078:
            java.lang.Object r0 = r6.get(r9)
            o.댚$櫯 r0 = (p004o.C1904.C1908) r0
            o.nz r0 = r0.f8598
            short r0 = r0.f2895
            if (r0 != r8) goto L_0x0086
            r7 = r9
            goto L_0x008e
        L_0x0086:
            int r9 = r9 + 1
        L_0x0088:
            int r0 = r6.size()
            if (r9 < r0) goto L_0x0078
        L_0x008e:
            android.support.v4.view.ViewPager r0 = r3.f8550
            o.댚$鷭 r1 = new o.댚$鷭
            r1.<init>(r6, r5)
            r0.setAdapter(r1)
            android.support.v4.view.ViewPager r0 = r3.f8550
            r0.setCurrentItem(r7)
            o.ba r0 = p004o.C0595nv.f2876
            if (r0 == 0) goto L_0x00f1
            o.ba r0 = p004o.C0595nv.f2876
            java.lang.String r0 = r0.f439
            if (r0 == 0) goto L_0x00f1
            o.ba r0 = p004o.C0595nv.f2876
            java.lang.String r0 = r0.f439
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00f1
            o.데 r0 = r10.f7611
            o.댚 r0 = r0.f8609
            android.support.v4.view.ViewPager r0 = r0.f8550
            android.support.v4.view.PagerAdapter r0 = r0.getAdapter()
            o.댚$鷭 r0 = (p004o.C1904.C1909) r0
            java.util.ArrayList r0 = r0.mo4567()
            java.util.Iterator r4 = r0.iterator()
            goto L_0x00eb
        L_0x00c6:
            java.lang.Object r0 = r4.next()
            o.댚$if r0 = (p004o.C1904.C1905if) r0
            r3 = r0
            o.댚$櫯 r0 = r3.f8560
            o.nz r0 = r0.f8598
            byte[] r0 = r0.f2909
            o.op r1 = p004o.C0618op.LOCAL
            java.lang.String r0 = p004o.C0622ot.m741(r0, r1)
            o.ba r1 = p004o.C0595nv.f2876
            java.lang.String r1 = r1.f439
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00eb
            o.ba r0 = p004o.C0595nv.f2876
            r1 = 0
            r0.f439 = r1
            r3.mo4563()
        L_0x00eb:
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L_0x00c6
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1648.run():void");
    }
}
