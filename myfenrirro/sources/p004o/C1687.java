package p004o;

/* renamed from: o.璇 */
final class C1687 extends C0762sz {
    C1687() {
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 146 */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x013e  */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4052(java.nio.ByteBuffer r11, int r12, boolean r13, int r14) {
        /*
            r10 = this;
            r0 = 2072(0x818, float:2.903E-42)
            r10.f4671 = r0
            int r14 = r11.getInt()
            int r4 = r11.getInt()
            int r5 = r11.getInt()
            o.ᕏ[] r6 = new p004o.C1360[r12]
            r7 = 0
            goto L_0x001d
        L_0x0014:
            o.ᕏ r0 = new o.ᕏ
            r0.<init>(r11)
            r6[r7] = r0
            int r7 = r7 + 1
        L_0x001d:
            if (r7 < r12) goto L_0x0014
            if (r13 == 0) goto L_0x0022
            return
        L_0x0022:
            int r0 = r6.length
            o.쎥[] r7 = new p004o.C1992[r0]
            int r0 = r6.length
            int[] r11 = new int[r0]
            r12 = 0
            goto L_0x004a
        L_0x002a:
            r8 = r6[r12]
            o.쎥 r9 = new o.쎥
            int r0 = r8.f6899
            short r1 = r8.f6901
            r2 = 1
            r9.<init>(r0, r1, r2)
            o.䒧[] r0 = p004o.C1472.values()
            byte r1 = r8.f6900
            r0 = r0[r1]
            r9.f8839 = r0
            r7[r12] = r9
            r0 = r6[r12]
            int r0 = r0.f6902
            r11[r12] = r0
            int r12 = r12 + 1
        L_0x004a:
            int r0 = r7.length
            if (r12 < r0) goto L_0x002a
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            o.ix r0 = r0.f51
            o.ꍚ r0 = r0.f1378
            r13 = r11
            r12 = r7
            r11 = r0
            android.widget.TextView r0 = r0.f8477
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            o.cp r2 = p004o.C1014.f6158
            o.hp r2 = p004o.C1014.f6160
            r3 = 1738(0x6ca, float:2.435E-42)
            java.lang.String r6 = r2.mo3796(r3)
            if (r6 != 0) goto L_0x0069
            java.lang.String r2 = "MSG1738"
            goto L_0x006a
        L_0x0069:
            r2 = r6
        L_0x006a:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.lang.String r2 = " - "
            java.lang.StringBuilder r1 = r1.append(r2)
            o.lf r2 = p004o.C1014.f6137
            android.util.SparseArray<o.le> r2 = r2.f1637
            java.lang.Object r2 = r2.get(r14)
            o.le r2 = (p004o.C0520le) r2
            r9 = r2
            java.lang.Class<o.bb> r6 = p004o.C0206bb.class
            java.lang.Class r2 = r9.getClass()
            boolean r2 = r6.isAssignableFrom(r2)
            if (r2 == 0) goto L_0x0090
            r2 = r9
            goto L_0x0091
        L_0x0090:
            r2 = 0
        L_0x0091:
            o.bb r2 = (p004o.C0206bb) r2
            java.lang.String r2 = r2.f8657
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.TextView r0 = r11.f8483
            o.cp r1 = p004o.C1014.f6158
            o.hp r1 = p004o.C1014.f6160
            r2 = 169(0xa9, float:2.37E-43)
            java.lang.String r6 = r1.mo3796(r2)
            if (r6 != 0) goto L_0x00b1
            java.lang.String r1 = "MSG169"
            goto L_0x00b2
        L_0x00b1:
            r1 = r6
        L_0x00b2:
            r0.setText(r1)
            android.widget.TextView r0 = r11.f8475
            o.cp r1 = p004o.C1014.f6158
            o.hp r1 = p004o.C1014.f6160
            r2 = 1734(0x6c6, float:2.43E-42)
            java.lang.String r6 = r1.mo3796(r2)
            if (r6 != 0) goto L_0x00c6
            java.lang.String r1 = "MSG1734"
            goto L_0x00c7
        L_0x00c6:
            r1 = r6
        L_0x00c7:
            r0.setText(r1)
            android.widget.TextView r0 = r11.f8470
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            o.cp r2 = p004o.C1014.f6158
            o.hp r2 = p004o.C1014.f6160
            r3 = 1857(0x741, float:2.602E-42)
            java.lang.String r6 = r2.mo3796(r3)
            if (r6 != 0) goto L_0x00dd
            java.lang.String r2 = "MSG1857"
            goto L_0x00de
        L_0x00dd:
            r2 = r6
        L_0x00de:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = r1.append(r2)
            long r2 = (long) r5
            java.lang.String r2 = p004o.C0622ot.m736(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " Z"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            int r0 = r0.f6542
            r11.mo4546(r0)
            r11.mo4545d_()
            r11.f8480 = r5
            r11.f8479 = r14
            r11.f8482 = r4
            o.橉 r0 = new o.橉
            r1 = 0
            r0.<init>(r12, r1, r13)
            r13 = r0
            android.widget.ListView r0 = r11.f8468
            r0.setAdapter(r13)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            java.util.HashMap<java.lang.Integer, o.쎥> r0 = r0.f6528
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r7 = r0.iterator()
            goto L_0x0188
        L_0x013e:
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r6 = r0
            java.lang.Object r0 = r6.getValue()
            o.쎥 r0 = (p004o.C1992) r0
            r8 = r0
            if (r8 == 0) goto L_0x0188
            r9 = 0
            goto L_0x0185
        L_0x0151:
            int r0 = r8.f8848
            java.util.ArrayList<o.윷> r1 = r13.f7605
            java.lang.Object r1 = r1.get(r9)
            o.윷 r1 = (p004o.C1999) r1
            o.쎥 r1 = r1.f8872
            int r1 = r1.f8848
            if (r0 != r1) goto L_0x0183
            o.쎥 r0 = r8.mo4612()
            r14.add(r0)
            java.lang.Object r0 = r6.getKey()
            java.lang.Integer r0 = (java.lang.Integer) r0
            r4.add(r0)
            java.util.ArrayList<o.윷> r0 = r13.f7605
            java.lang.Object r0 = r0.get(r9)
            o.윷 r0 = (p004o.C1999) r0
            int r0 = r0.f8871
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            goto L_0x0188
        L_0x0183:
            int r9 = r9 + 1
        L_0x0185:
            int r0 = r12.length
            if (r9 < r0) goto L_0x0151
        L_0x0188:
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L_0x013e
            o.橉 r6 = new o.橉
            r6.<init>(r14, r4, r5)
            android.widget.ListView r0 = r11.f8469
            r0.setAdapter(r6)
            android.widget.ListView r0 = r11.f8467
            r1 = 0
            r0.setAdapter(r1)
            r11.mo3537h_()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1687.mo4052(java.nio.ByteBuffer, int, boolean, int):void");
    }
}
