package p004o;

import android.view.View.OnClickListener;

/* renamed from: o.ﰙ */
class C2053 implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1629 f8977;

    C2053(C1629 r1) {
        this.f8977 = r1;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [o.ῡ[]] */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r6v3, types: [o.ῡ] */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            o.東 r9 = r8.f8977
            o.東 r0 = r8.f8977
            int r3 = r0.f7558
            r0 = -1
            if (r3 == r0) goto L_0x00af
            android.widget.GridView r0 = r9.f7566
            java.lang.Object r0 = r0.getItemAtPosition(r3)
            o.ῡ r0 = (p004o.C1379) r0
            r3 = r0
            if (r3 == 0) goto L_0x00af
            android.widget.EditText r0 = r9.f7557     // Catch:{ NumberFormatException -> 0x0027 }
            android.text.Editable r0 = r0.getText()     // Catch:{ NumberFormatException -> 0x0027 }
            java.lang.String r0 = r0.toString()     // Catch:{ NumberFormatException -> 0x0027 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0027 }
            int r4 = r0.intValue()     // Catch:{ NumberFormatException -> 0x0027 }
            goto L_0x0028
        L_0x0027:
            return
        L_0x0028:
            o.ῡ[] r5 = r9.mo4420()
            r6 = 0
            r7 = 0
            goto L_0x003c
        L_0x002f:
            r0 = r5[r7]
            int r0 = r0.f6946
            int r1 = r3.f6946
            if (r0 != r1) goto L_0x003a
            r6 = r5[r7]
            goto L_0x003f
        L_0x003a:
            int r7 = r7 + 1
        L_0x003c:
            int r0 = r5.length
            if (r7 < r0) goto L_0x002f
        L_0x003f:
            if (r6 != 0) goto L_0x0074
            o.pc$鷭 r0 = p004o.C1014.f6140
            o.pc$aux r0 = r0.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.iRO_Renewal
            if (r0 == r1) goto L_0x004a
            r5 = 0
        L_0x004a:
            o.ῡ r6 = new o.ῡ
            int r0 = r3.f6946
            int r1 = r3.f6945
            int r2 = r3.f6943
            r6.<init>(r0, r1, r4, r2)
            r3 = r5
            r5 = r6
            if (r3 != 0) goto L_0x0065
            java.lang.Class r0 = r5.getClass()
            r1 = 0
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r3 = r0
        L_0x0065:
            int r0 = r3.length
            int r0 = r0 + 1
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r3, r0)
            int r0 = r3.length
            r7[r0] = r5
            r0 = r7
            o.ῡ[] r0 = (p004o.C1379[]) r0
            r5 = r0
            goto L_0x0079
        L_0x0074:
            int r0 = r6.f6944
            int r0 = r0 + r4
            r6.f6944 = r0
        L_0x0079:
            o.東$鷭 r0 = r9.mo4419(r5)
            if (r0 != 0) goto L_0x0091
            int r0 = r6.f6944
            int r0 = r0 - r4
            r6.f6944 = r0
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            java.lang.String r1 = "Insufficient CP"
            r2 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            return
        L_0x0091:
            android.widget.GridView r0 = r9.f7564
            o.討 r1 = new o.討
            r1.<init>(r5)
            r0.setAdapter(r1)
            r9.mo4416e_()
            android.widget.Button r0 = r9.f7556
            java.lang.String r1 = "Purchase"
            r0.setText(r1)
            android.widget.Button r0 = r9.f7556
            o.딐 r1 = new o.딐
            r1.<init>(r9)
            r0.setOnClickListener(r1)
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C2053.onClick(android.view.View):void");
    }
}
