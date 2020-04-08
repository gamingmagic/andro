package p004o;

import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.libroserver.apk.R;
import java.util.LinkedList;
import org.apache.commons.net.ftp.FTPReply;

/* renamed from: o.lk */
final class C0527lk extends C0519ld {

    /* renamed from: Ą */
    Button f1653 = ((Button) this.f1626.findViewById(R.id.button1));

    /* renamed from: ą */
    boolean f1654;

    /* renamed from: Ć */
    boolean f1655;

    /* renamed from: ć */
    private OnClickListener f1656 = new C0528ll(this);

    /* renamed from: ȃ */
    ListView f1657 = ((ListView) this.f1626.findViewById(R.id.listView1));

    /* renamed from: ˮ͈ */
    EditText f1658 = ((EditText) this.f1626.findViewById(R.id.editText2));

    /* renamed from: 櫯 */
    EditText f1659 = ((EditText) this.f1626.findViewById(R.id.editText1));

    /* renamed from: 鷭 */
    TextView f1660 = ((TextView) this.f1626.findViewById(R.id.textView1));

    C0527lk() {
        super(R.layout.open_vending);
        this.f1653.setOnClickListener(this.f1656);
        EditText editText = this.f1659;
        C0252cp cpVar = C1014.f6158;
        String r3 = C1014.f6160.mo3796(283);
        editText.setHint(r3 == null ? "MSG283" : r3);
    }

    /* renamed from: ȃ */
    public final void mo3546() {
        mo3950();
        this.f1659.setText("");
        this.f1658.setText("0");
        C1014.f6147.f51.f1445.mo3537h_();
        this.f1659.setVisibility(0);
        this.f1653.setVisibility(0);
    }

    /* renamed from: Ą */
    public final void mo3544() {
        if (this.f1655) {
            if (!this.f1654) {
                mo3964();
                C1014.f6144.mo3652((C0839ue) new C1052("", false, null));
                return;
            }
            C1014.f6144.mo3652((C0839ue) new C1091());
            this.f1654 = false;
        } else if (!this.f1654) {
            mo3965(this.f1657.getCount());
        } else {
            C1014.f6144.mo3652((C0839ue) new C1062());
            mo3965(this.f1657.getCount());
            this.f1654 = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Ć */
    public final void mo3964() {
        for (int i = 0; i < this.f1657.getCount(); i++) {
            C0546m mVar = (C0546m) this.f1657.getItemAtPosition(i);
            if (mVar.f1762.f1595 != null) {
                mVar.mo4011();
            }
        }
        mo3965(this.f1657.getCount());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3968(int i, boolean z) {
        super.mo3537h_();
        this.f1655 = z;
        if (z) {
            TextView textView = this.f1660;
            C0252cp cpVar = C1014.f6158;
            String r5 = C1014.f6160.mo3796((int) FTPReply.DATA_CONNECTION_OPEN);
            textView.setText(r5 == null ? "MSG225" : r5);
            this.f1658.setVisibility(4);
            C1014.f6147.f51.f1445.mo4532(C0572mz.CART);
        } else {
            TextView textView2 = this.f1660;
            C0252cp cpVar2 = C1014.f6158;
            String r52 = C1014.f6160.mo3796(1721);
            textView2.setText(r52 == null ? "MSG1721" : r52);
            this.f1658.setVisibility(0);
            this.f1658.setEnabled(true);
            C1014.f6147.f51.f1445.mo4532(C0572mz.USABLE);
        }
        mo3965(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3965(int i) {
        LinkedList linkedList = new LinkedList();
        for (int i2 = 0; i2 < i; i2++) {
            linkedList.add(null);
        }
        this.f1657.setAdapter(new C0515l(linkedList, false));
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: CFG modification limit reached, blocks count: 173 */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (r5 != null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        android.widget.Toast.makeText(p004o.C1014.f6147, "Can't add anymore items: all slots are occupied.", 1).show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0111, code lost:
        if (r6.f1762.f1598 != r9.f1598) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0113, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011b, code lost:
        if (r5 != null) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011d, code lost:
        r7 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0122, code lost:
        r6 = (p004o.C0546m) r7.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x012d, code lost:
        if (r6.f1762.f1595 != null) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x012f, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0135, code lost:
        if (r7.hasNext() != false) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0137, code lost:
        if (r5 != null) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0139, code lost:
        android.widget.Toast.makeText(p004o.C1014.f6147, "Can't add anymore items: all slots are occupied.", 1).show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0145, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x014a, code lost:
        if (r5.f1762.f1595 != null) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x014c, code lost:
        r5.f1762.f1595 = r9.f1595.mo4612();
        r5.f1762.f1598 = r9.f1598;
        r5.f1762.f1595.f8846 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0163, code lost:
        r5.f1762.f1595.f8846 += r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016d, code lost:
        if (r11 == -1) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x016f, code lost:
        r5.mo4012(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0173, code lost:
        if (r10 == -1) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0175, code lost:
        r9 = r5;
        r5.f1752 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x017a, code lost:
        if (r9.f1756 == null) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x017c, code lost:
        r9.f1756.setText(java.text.NumberFormat.getInstance().format((long) r9.f1752));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x018c, code lost:
        r8.f1657.setAdapter(new p004o.C0515l(r4, r8.f1654));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0027, code lost:
        if (r6.f1762.f1598 != r9.f1598) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        r5 = r6;
     */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3969(p004o.C0512ky r9, int r10, int r11) {
        /*
            r8 = this;
            boolean r0 = r8.f1655
            if (r0 == 0) goto L_0x00ee
            android.widget.ListView r0 = r8.f1657
            android.widget.ListAdapter r0 = r0.getAdapter()
            o.l r0 = (p004o.C0515l) r0
            java.util.LinkedList<o.m> r4 = r0.f1619
            r5 = 0
            java.util.Iterator r7 = r4.iterator()
            goto L_0x002b
        L_0x0014:
            java.lang.Object r0 = r7.next()
            o.m r0 = (p004o.C0546m) r0
            r6 = r0
            o.ky r0 = r6.f1762
            o.쎥 r0 = r0.f1595
            if (r0 == 0) goto L_0x002b
            o.ky r0 = r6.f1762
            int r0 = r0.f1598
            int r1 = r9.f1598
            if (r0 != r1) goto L_0x002b
            r5 = r6
            goto L_0x0031
        L_0x002b:
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L_0x0014
        L_0x0031:
            if (r5 != 0) goto L_0x005c
            java.util.Iterator r7 = r4.iterator()
            goto L_0x0047
        L_0x0038:
            java.lang.Object r0 = r7.next()
            o.m r0 = (p004o.C0546m) r0
            r6 = r0
            o.ky r0 = r6.f1762
            o.쎥 r0 = r0.f1595
            if (r0 != 0) goto L_0x0047
            r5 = r6
            goto L_0x004d
        L_0x0047:
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L_0x0038
        L_0x004d:
            if (r5 != 0) goto L_0x005c
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            java.lang.String r1 = "Can't add anymore items: all slots are occupied."
            r2 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            return
        L_0x005c:
            o.ky r0 = r5.f1762
            o.쎥 r0 = r0.f1595
            if (r0 != 0) goto L_0x0079
            o.ky r0 = r5.f1762
            o.쎥 r1 = r9.f1595
            o.쎥 r1 = r1.mo4612()
            r0.f1595 = r1
            o.ky r0 = r5.f1762
            int r1 = r9.f1598
            r0.f1598 = r1
            o.ky r0 = r5.f1762
            o.쎥 r0 = r0.f1595
            r0.f8846 = r10
            goto L_0x0082
        L_0x0079:
            o.ky r0 = r5.f1762
            o.쎥 r0 = r0.f1595
            int r1 = r0.f8846
            int r1 = r1 + r10
            r0.f8846 = r1
        L_0x0082:
            r0 = -1
            if (r11 == r0) goto L_0x0088
            r5.mo4012(r11)
        L_0x0088:
            android.widget.ListView r0 = r8.f1657
            o.l r1 = new o.l
            boolean r2 = r8.f1654
            r1.<init>(r4, r2)
            r0.setAdapter(r1)
            boolean r0 = r8.f1654
            if (r0 != 0) goto L_0x0198
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            java.util.HashMap<java.lang.Integer, o.쎥> r0 = r0.f6498
            int r1 = r9.f1598
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            o.쎥 r0 = (p004o.C1992) r0
            r6 = r0
            if (r6 != 0) goto L_0x00ca
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Couldn't find cart item "
            r0.<init>(r1)
            o.쎥 r1 = r9.f1595
            int r1 = r1.f8848
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " to withdraw"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            p004o.C0592ns.m674(r0)
            return
        L_0x00ca:
            int r0 = r6.f8846
            int r0 = r0 - r10
            r6.f8846 = r0
            int r0 = r6.f8846
            if (r0 > 0) goto L_0x00e2
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            java.util.HashMap<java.lang.Integer, o.쎥> r0 = r0.f6498
            int r1 = r9.f1598
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.remove(r1)
        L_0x00e2:
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            o.ix r0 = r0.f51
            o.魘 r0 = r0.f1445
            o.mz r1 = p004o.C0572mz.CART
            r0.mo4533(r1)
            return
        L_0x00ee:
            android.widget.ListView r0 = r8.f1657
            android.widget.ListAdapter r0 = r0.getAdapter()
            o.l r0 = (p004o.C0515l) r0
            java.util.LinkedList<o.m> r4 = r0.f1619
            r5 = 0
            java.util.Iterator r7 = r4.iterator()
            goto L_0x0115
        L_0x00fe:
            java.lang.Object r0 = r7.next()
            o.m r0 = (p004o.C0546m) r0
            r6 = r0
            o.ky r0 = r6.f1762
            o.쎥 r0 = r0.f1595
            if (r0 == 0) goto L_0x0115
            o.ky r0 = r6.f1762
            int r0 = r0.f1598
            int r1 = r9.f1598
            if (r0 != r1) goto L_0x0115
            r5 = r6
            goto L_0x011b
        L_0x0115:
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L_0x00fe
        L_0x011b:
            if (r5 != 0) goto L_0x0146
            java.util.Iterator r7 = r4.iterator()
            goto L_0x0131
        L_0x0122:
            java.lang.Object r0 = r7.next()
            o.m r0 = (p004o.C0546m) r0
            r6 = r0
            o.ky r0 = r6.f1762
            o.쎥 r0 = r0.f1595
            if (r0 != 0) goto L_0x0131
            r5 = r6
            goto L_0x0137
        L_0x0131:
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L_0x0122
        L_0x0137:
            if (r5 != 0) goto L_0x0146
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            java.lang.String r1 = "Can't add anymore items: all slots are occupied."
            r2 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            return
        L_0x0146:
            o.ky r0 = r5.f1762
            o.쎥 r0 = r0.f1595
            if (r0 != 0) goto L_0x0163
            o.ky r0 = r5.f1762
            o.쎥 r1 = r9.f1595
            o.쎥 r1 = r1.mo4612()
            r0.f1595 = r1
            o.ky r0 = r5.f1762
            int r1 = r9.f1598
            r0.f1598 = r1
            o.ky r0 = r5.f1762
            o.쎥 r0 = r0.f1595
            r0.f8846 = r10
            goto L_0x016c
        L_0x0163:
            o.ky r0 = r5.f1762
            o.쎥 r0 = r0.f1595
            int r1 = r0.f8846
            int r1 = r1 + r10
            r0.f8846 = r1
        L_0x016c:
            r0 = -1
            if (r11 == r0) goto L_0x0172
            r5.mo4012(r11)
        L_0x0172:
            r0 = -1
            if (r10 == r0) goto L_0x018c
            r9 = r5
            r5.f1752 = r10
            android.widget.Button r0 = r9.f1756
            if (r0 == 0) goto L_0x018c
            android.widget.Button r0 = r9.f1756
            java.text.NumberFormat r1 = java.text.NumberFormat.getInstance()
            int r2 = r9.f1752
            long r2 = (long) r2
            java.lang.String r1 = r1.format(r2)
            r0.setText(r1)
        L_0x018c:
            android.widget.ListView r0 = r8.f1657
            o.l r1 = new o.l
            boolean r2 = r8.f1654
            r1.<init>(r4, r2)
            r0.setAdapter(r1)
        L_0x0198:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0527lk.mo3969(o.ky, int, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3966(int i, int i2) {
        C0546m mVar = null;
        int i3 = 0;
        while (true) {
            if (i3 < this.f1657.getCount()) {
                C0546m mVar2 = (C0546m) this.f1657.getItemAtPosition(i3);
                if (mVar2.f1762.f1598 == i && mVar2.f1762.f1595 != null && mVar2.f1762.f1595.f8846 > 0) {
                    mVar = mVar2;
                    break;
                }
                i3++;
            } else {
                break;
            }
        }
        if (mVar == null) {
            C0592ns.m674("Received request to sell item " + i + " but this item doesn't exist in the vending list");
        } else {
            mVar.mo4013(i2, true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3967(int i, int i2, int i3) {
        EditText editText = this.f1658;
        C0252cp cpVar = C1014.f6158;
        String r5 = C1014.f6160.mo3796(1736);
        editText.setText(String.format(r5 == null ? "MSG1736" : r5, new Object[]{C0622ot.m736((long) i3)}));
        C0515l lVar = (C0515l) C1014.f6147.f51.f1385.f1657.getAdapter();
        for (int i4 = 0; i4 < lVar.f1619.size(); i4++) {
            if (((C0546m) lVar.f1619.get(i4)).f1762.f1595.f8848 == i) {
                C0546m mVar = (C0546m) lVar.f1619.get(i4);
                mVar.f1752 -= i2;
            }
        }
        LinkedList linkedList = new LinkedList();
        for (int i5 = 0; i5 < lVar.f1619.size(); i5++) {
            linkedList.add((C0546m) lVar.f1619.get(i5));
        }
        this.f1657.setAdapter(new C0515l(linkedList, true));
    }
}
