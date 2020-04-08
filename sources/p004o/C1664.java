package p004o;

import android.widget.BaseAdapter;

/* renamed from: o.湯 */
final class C1664 extends BaseAdapter {

    /* renamed from: 鷭 */
    C0387gv[] f7642 = new C0387gv[C1014.f6137.f1636.f6541.f7218.size()];

    C1664() {
        for (int i = 0; i < C1014.f6137.f1636.f6541.f7218.size(); i++) {
            this.f7642[i] = new C0387gv((C0377gm) C1014.f6137.f1636.f6541.f7218.get(i), C0388.GUILD);
        }
    }

    public final int getCount() {
        return this.f7642.length;
    }

    public final Object getItem(int i) {
        return this.f7642[i];
    }

    public final long getItemId(int i) {
        return (long) this.f7642[i].f1104.f1053;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x017e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            o.gv[] r0 = r6.f7642
            r7 = r0[r7]
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            android.view.LayoutInflater r0 = r0.getLayoutInflater()
            r1 = 2130903134(0x7f03005e, float:1.7413077E38)
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r7.f1099 = r0
            android.widget.RelativeLayout r0 = r7.f1099
            r1 = 2131296297(0x7f090029, float:1.8210507E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.f1095 = r0
            android.widget.RelativeLayout r0 = r7.f1099
            r1 = 2131296265(0x7f090009, float:1.8210442E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.f1096 = r0
            android.widget.RelativeLayout r0 = r7.f1099
            r1 = 2131296259(0x7f090003, float:1.821043E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.f1097 = r0
            android.widget.RelativeLayout r0 = r7.f1099
            r1 = 2131296282(0x7f09001a, float:1.8210476E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.f1098 = r0
            android.widget.RelativeLayout r0 = r7.f1099
            r1 = 2131296279(0x7f090017, float:1.821047E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.Button r0 = (android.widget.Button) r0
            r7.f1102 = r0
            android.widget.Button r0 = r7.f1102
            android.view.View$OnClickListener r1 = r7.f1103
            r0.setOnClickListener(r1)
            android.widget.RelativeLayout r0 = r7.f1099
            android.view.View$OnClickListener r1 = r7.f1100
            r0.setOnClickListener(r1)
            r8 = r7
            o.cp r0 = p004o.C1014.f6158
            o.ck r0 = r0.f674
            o.gn r0 = r0.f609
            o.gm r1 = r8.f1104
            int r1 = r1.f1053
            o.gq r9 = r0.mo3752(r1)
            android.widget.TextView r0 = r8.f1096
            java.lang.String r1 = r9.f1071
            r0.setText(r1)
            o.gm r0 = r8.f1104
            boolean r0 = r0.f1049
            if (r0 == 0) goto L_0x00be
            r4 = r8
            int[] r0 = p004o.C0387gv.m386()
            o.gv$鷭 r1 = r4.f1105
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L_0x009a;
                case 2: goto L_0x00a6;
                default: goto L_0x0091;
            }
        L_0x0091:
            goto L_0x00b4
        L_0x009a:
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            int r0 = r0.f6527
            if (r0 <= 0) goto L_0x00a4
            r0 = 1
            goto L_0x00b5
        L_0x00a4:
            r0 = 0
            goto L_0x00b5
        L_0x00a6:
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            o.䩚 r0 = r0.f6541
            int r0 = r0.f7209
            if (r0 <= 0) goto L_0x00b2
            r0 = 1
            goto L_0x00b5
        L_0x00b2:
            r0 = 0
            goto L_0x00b5
        L_0x00b4:
            r0 = 0
        L_0x00b5:
            if (r0 == 0) goto L_0x00be
            android.widget.Button r0 = r8.f1102
            r1 = 0
            r0.setVisibility(r1)
            goto L_0x00c4
        L_0x00be:
            android.widget.Button r0 = r8.f1102
            r1 = 4
            r0.setVisibility(r1)
        L_0x00c4:
            o.gm r0 = r8.f1104
            int r0 = r0.f1051
            if (r0 <= 0) goto L_0x010f
            android.widget.TextView r0 = r8.f1097
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            o.cp r2 = p004o.C1014.f6158
            o.hp r2 = p004o.C1014.f6160
            r3 = 409(0x199, float:5.73E-43)
            java.lang.String r5 = r2.mo3796(r3)
            if (r5 != 0) goto L_0x00dd
            java.lang.String r2 = "MSG409"
            goto L_0x00de
        L_0x00dd:
            r2 = r5
        L_0x00de:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.lang.String r2 = " : "
            java.lang.StringBuilder r1 = r1.append(r2)
            o.gm r2 = r8.f1104
            int r2 = r2.f1051
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.RelativeLayout r0 = r8.f1099
            r1 = -13421773(0xffffffffff333333, float:-2.3819765E38)
            r0.setBackgroundColor(r1)
            android.widget.ImageView r0 = r8.f1095
            android.graphics.LightingColorFilter r1 = new android.graphics.LightingColorFilter
            r2 = -1
            r3 = 0
            r1.<init>(r2, r3)
            r0.setColorFilter(r1)
            goto L_0x012b
        L_0x010f:
            android.widget.TextView r0 = r8.f1097
            java.lang.String r1 = "Not learned"
            r0.setText(r1)
            android.widget.RelativeLayout r0 = r8.f1099
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setBackgroundColor(r1)
            android.widget.ImageView r0 = r8.f1095
            android.graphics.LightingColorFilter r1 = new android.graphics.LightingColorFilter
            r2 = -4473925(0xffffffffffbbbbbb, float:NaN)
            r3 = 0
            r1.<init>(r2, r3)
            r0.setColorFilter(r1)
        L_0x012b:
            o.gm r0 = r8.f1104
            int r0 = r0.f1051
            if (r0 <= 0) goto L_0x016b
            o.gm r0 = r8.f1104
            int r0 = r0.f1052
            if (r0 != 0) goto L_0x0139
            r0 = 1
            goto L_0x013a
        L_0x0139:
            r0 = 0
        L_0x013a:
            if (r0 == 0) goto L_0x0152
            android.widget.TextView r0 = r8.f1098
            o.cp r1 = p004o.C1014.f6158
            o.hp r1 = p004o.C1014.f6160
            r2 = 287(0x11f, float:4.02E-43)
            java.lang.String r5 = r1.mo3796(r2)
            if (r5 != 0) goto L_0x014d
            java.lang.String r1 = "MSG287"
            goto L_0x014e
        L_0x014d:
            r1 = r5
        L_0x014e:
            r0.setText(r1)
            goto L_0x0171
        L_0x0152:
            android.widget.TextView r0 = r8.f1098
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "SP : "
            r1.<init>(r2)
            o.gm r2 = r8.f1104
            int r2 = r2.f1050
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            goto L_0x0171
        L_0x016b:
            android.widget.TextView r0 = r8.f1098
            r1 = 0
            r0.setText(r1)
        L_0x0171:
            android.graphics.Bitmap r0 = r8.f1101
            if (r0 == 0) goto L_0x017e
            android.widget.ImageView r0 = r8.f1095
            android.graphics.Bitmap r1 = r8.f1101
            r0.setImageBitmap(r1)
            goto L_0x01b6
        L_0x017e:
            o.cp r0 = p004o.C1014.f6158
            o.ck r0 = r0.f674
            java.lang.String r1 = r9.f1073
            java.lang.String r4 = r0.mo3609(r1)
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            o.ix r0 = r0.f51
            java.util.HashMap<java.lang.String, android.graphics.Bitmap> r0 = r0.f1425
            java.lang.Object r0 = r0.get(r4)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r5 = r0
            if (r5 == 0) goto L_0x01a1
            r8.f1101 = r5
            android.widget.ImageView r0 = r8.f1095
            android.graphics.Bitmap r1 = r8.f1101
            r0.setImageBitmap(r1)
            goto L_0x01b6
        L_0x01a1:
            android.widget.ImageView r0 = r8.f1095
            com.roworkshop.andro.c_activity r1 = p004o.C1014.f6147
            o.ix r1 = r1.f51
            android.graphics.Bitmap r1 = r1.f1456
            r0.setImageBitmap(r1)
            o.cp r0 = p004o.C1014.f6158
            o.ha r1 = new o.ha
            r1.<init>(r8, r9, r4)
            r0.mo3387(r1)
        L_0x01b6:
            android.widget.RelativeLayout r0 = r7.f1099
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1664.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
