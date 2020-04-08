package p004o;

import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.libroserver.apk.R;
import com.roworkshop.andro.c_activity;
import p004o.C0643pc.aux;

/* renamed from: o.狷 */
final class C1681 extends C0519ld {

    /* renamed from: Ą */
    Button f7674 = ((Button) this.f1626.findViewById(R.id.Button05));

    /* renamed from: ą */
    Button f7675 = ((Button) this.f1626.findViewById(R.id.button5));

    /* renamed from: Ć */
    Button f7676 = ((Button) this.f1626.findViewById(R.id.Button10));

    /* renamed from: ć */
    Button f7677 = ((Button) this.f1626.findViewById(R.id.button3));

    /* renamed from: ċ */
    Button f7678 = ((Button) this.f1626.findViewById(R.id.Button03));

    /* renamed from: đ */
    C0548mb f7679;

    /* renamed from: Ē */
    Button[] f7680 = {this.f7707, this.f7704, this.f7690, this.f7687, this.f7674, this.f7675, this.f7676, this.f7677, this.f7691};

    /* renamed from: ē */
    Button[] f7681 = {this.f7700, this.f7688, this.f7678, this.f7705, this.f7698};

    /* renamed from: Ė */
    OnClickListener f7682 = new C1345(this);

    /* renamed from: ė */
    OnClickListener f7683 = new C1562(this);

    /* renamed from: Ę */
    OnClickListener f7684 = new C1798(this);

    /* renamed from: ę */
    OnClickListener f7685 = new C1644(this);

    /* renamed from: ģ */
    private OnClickListener f7686 = new C1882(this);

    /* renamed from: ȃ */
    Button f7687 = ((Button) this.f1626.findViewById(R.id.Button04));

    /* renamed from: Ȋ */
    Button f7688 = ((Button) this.f1626.findViewById(R.id.Button08));

    /* renamed from: Ƞ */
    OnClickListener f7689 = new C1460(this);

    /* renamed from: ˮ͈ */
    Button f7690 = ((Button) this.f1626.findViewById(R.id.Button09));

    /* renamed from: ˮ͍ */
    Button f7691 = ((Button) this.f1626.findViewById(R.id.Button11));

    /* renamed from: ܕ */
    TextView f7692 = ((TextView) this.f1626.findViewById(R.id.textView1));

    /* renamed from: ܨ */
    private OnClickListener f7693 = new C1300(this);

    /* renamed from: ঽ্ */
    OnClickListener f7694 = new C1124(this);

    /* renamed from: 㥳 */
    OnClickListener f7695 = new C1514(this);

    /* renamed from: 㱽 */
    OnClickListener f7696 = new C1965(this);

    /* renamed from: 㵼 */
    OnClickListener f7697 = new C1264(this);

    /* renamed from: 䒧 */
    Button f7698 = ((Button) this.f1626.findViewById(R.id.Button01));

    /* renamed from: 囃 */
    OnClickListener f7699 = new C1660(this);

    /* renamed from: 岱 */
    Button f7700 = ((Button) this.f1626.findViewById(R.id.Button02));

    /* renamed from: 庸 */
    TextView f7701 = ((TextView) this.f1626.findViewById(R.id.material1));

    /* renamed from: 廂 */
    OnClickListener f7702 = new C1426(this);

    /* renamed from: 廅 */
    OnClickListener f7703 = new C1894(this);

    /* renamed from: 櫯 */
    Button f7704 = ((Button) this.f1626.findViewById(R.id.Button07));

    /* renamed from: 纫 */
    Button f7705 = ((Button) this.f1626.findViewById(R.id.Button06));

    /* renamed from: 躆 */
    Button f7706 = ((Button) this.f1626.findViewById(R.id.Button13));

    /* renamed from: 鷭 */
    Button f7707 = ((Button) this.f1626.findViewById(R.id.button6));

    /* renamed from: 띥 */
    C1695 f7708;

    C1681() {
        super(R.layout.ability);
        this.f7675.setOnClickListener(this.f7695);
        this.f7707.setOnClickListener(this.f7682);
        this.f7698.setOnClickListener(this.f7683);
        this.f7688.setOnClickListener(this.f7684);
        this.f7687.setOnClickListener(this.f7685);
        this.f7678.setOnClickListener(this.f7702);
        this.f7704.setOnClickListener(this.f7697);
        this.f7674.setOnClickListener(this.f7696);
        this.f7705.setOnClickListener(this.f7699);
        this.f7700.setOnClickListener(this.f7694);
        this.f7676.setOnClickListener(this.f7703);
        this.f7691.setOnClickListener(this.f7693);
        this.f7706.setOnClickListener(this.f7686);
        C0252cp cpVar = C1014.f6158;
        String r5 = C1014.f6160.mo3796(518);
        this.f7708 = new C1695(r5 == null ? "MSG518" : r5, false, null, this.f7689);
        mo4456c_();
        if (C1014.f6140.f4443 == aux.Eden3) {
            this.f7691.setText("Truemoney");
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: CFG modification limit reached, blocks count: 119 */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        if (r3.f8848 == 714) goto L_0x002e;
     */
    /* renamed from: a_ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4454a_() {
        /*
            r5 = this;
            r2 = 0
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            int r0 = r0.f8637
            if (r0 != 0) goto L_0x002e
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            java.util.HashMap<java.lang.Integer, o.쎥> r0 = r0.f6528
            java.util.Collection r0 = r0.values()
            java.util.Iterator r4 = r0.iterator()
            goto L_0x0027
        L_0x0018:
            java.lang.Object r0 = r4.next()
            o.쎥 r0 = (p004o.C1992) r0
            r3 = r0
            if (r3 == 0) goto L_0x0027
            int r0 = r3.f8848
            r1 = 714(0x2ca, float:1.0E-42)
            if (r0 == r1) goto L_0x002e
        L_0x0027:
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L_0x0018
            goto L_0x002f
        L_0x002e:
            r2 = 1
        L_0x002f:
            android.widget.Button r0 = r5.f7691
            o.pc$鷭 r1 = p004o.C1014.f6140
            boolean r1 = r1.f4477
            if (r1 == 0) goto L_0x003a
            r1 = 8
            goto L_0x003b
        L_0x003a:
            r1 = 0
        L_0x003b:
            r0.setVisibility(r1)
            android.widget.Button r0 = r5.f7674
            r0.setEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1681.mo4454a_():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b_ */
    public final void mo4455b_() {
        this.f7679 = C1014.f6142.f1693;
        if (!(this.f7679 == null || this.f7679.f1769 == C1014.f6137.f1636)) {
            C0520le leVar = this.f7679.f1769;
            if ((C0206bb.class.isAssignableFrom(leVar.getClass()) ? leVar : null) != null) {
                C0520le leVar2 = this.f7679.f1769;
                if ((C0206bb.class.isAssignableFrom(leVar2.getClass()) ? leVar2 : null).f8657 != null) {
                    C0520le leVar3 = this.f7679.f1769;
                    C0206bb bbVar = C0206bb.class.isAssignableFrom(leVar3.getClass()) ? leVar3 : null;
                    this.f7692.setText(bbVar.f8657);
                    this.f7701.setVisibility(0);
                    for (Button visibility : this.f7681) {
                        visibility.setVisibility(0);
                    }
                    boolean z = true;
                    for (int i = 0; i < C1014.f6137.f1636.f6519.length; i++) {
                        String str = (String) C1014.f6152.f7977.get(Integer.valueOf(C1014.f6137.f1636.f6519[i].f7650));
                        if (C1014.f6137.f1636.f6519[i].f7651 == this.f7679.f1769.f1630 && bbVar.f8657 != null && str != null && bbVar.f8657.equals(str)) {
                            z = false;
                        }
                    }
                    this.f7698.setEnabled(z);
                    boolean r5 = C1014.f6137.f1636.mo4291();
                    if (r5) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= C1014.f6137.f1636.f6502.f386.length) {
                                break;
                            } else if (C1014.f6137.f1636.f6502.f386[i2].f398 == this.f7679.f1769.f1630) {
                                r5 = false;
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                    this.f7678.setEnabled(r5);
                    this.f7705.setEnabled((C1014.f6137.f1636.f455 || C1014.f6137.f1636.f453) && bbVar != null && bbVar.f8637 == 0);
                    return;
                }
            }
        }
        this.f7692.setText("No character selected");
        this.f7701.setVisibility(4);
        for (Button visibility2 : this.f7681) {
            visibility2.setVisibility(4);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c_ */
    public final void mo4456c_() {
        this.f7706.setVisibility(8);
        if (C1014.f6137 != null && C1014.f6137.f1636 != null) {
            int i = C1014.f6137.f1636.f8646;
            int i2 = 0;
            if ((i & 32) > 0) {
                i2 = 443;
            } else if ((126353408 & i) > 0) {
                i2 = 1464;
            } else if ((4194304 & i) > 0) {
                i2 = 1465;
            } else if ((i & 1928) > 0 || (C1014.f6137.f1636 != null && C1014.f6137.f1636.f8640.containsKey(C0586nm.ON_PUSH_CART))) {
                i2 = 224;
            } else if ((i & 16) > 0) {
                i2 = 442;
            }
            if (i2 > 0) {
                this.f7706.setVisibility(0);
                Button button = this.f7706;
                C0252cp cpVar = C1014.f6158;
                int i3 = i2;
                String r4 = C1014.f6160.mo3796(i3);
                button.setText(r4 == null ? "MSG" + i3 : r4);
            }
        }
    }

    /* renamed from: ȃ */
    public final void mo3546() {
        LayoutParams layoutParams = (LayoutParams) this.f1626.getLayoutParams();
        layoutParams.addRule(3, R.id.button1);
        this.f1626.setLayoutParams(layoutParams);
        c_activity c_activity = C1014.f6147;
        ((ImageView) C1014.f6147.findViewById(R.id.imageview_ability)).setImageBitmap(C1014.f6147.f51.f1397[1]);
        mo4454a_();
        mo4455b_();
    }

    /* renamed from: Ą */
    public final void mo3544() {
        c_activity c_activity = C1014.f6147;
        ((ImageView) C1014.f6147.findViewById(R.id.imageview_ability)).setImageBitmap(C1014.f6147.f51.f1397[0]);
    }
}
