package p004o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.libroserver.apk.R;
import com.roworkshop.andro.c_activity;

/* renamed from: o.뜝 */
final class C1941 extends C0519ld {

    /* renamed from: Ą */
    TextView f8720;

    /* renamed from: ą */
    boolean f8721;

    /* renamed from: Ć */
    OnClickListener f8722 = new C1356(this);

    /* renamed from: ȃ */
    Button f8723;

    /* renamed from: ˮ͈ */
    Button f8724;

    /* renamed from: 櫯 */
    TextView f8725;

    /* renamed from: 鷭 */
    C1942[] f8726 = new C1942[C1246.HEAD_TOP_COSTUME.ordinal()];

    /* renamed from: o.뜝$鷭 */
    class C1942 {

        /* renamed from: Ą */
        TextView f8727;

        /* renamed from: ą */
        int f8728;

        /* renamed from: Ć */
        int f8729 = -1;

        /* renamed from: ȃ */
        TextView f8731;

        /* renamed from: ˮ͈ */
        ImageView f8732;

        /* renamed from: 櫯 */
        ImageView f8733;

        /* renamed from: 鷭 */
        View f8734;

        C1942(View view, int i, String str) {
            this.f8734 = (RelativeLayout) view.findViewById(i);
            this.f8733 = (ImageView) this.f8734.findViewById(R.id.imageView1);
            this.f8732 = (ImageView) this.f8734.findViewById(R.id.imageView2);
            this.f8731 = (TextView) this.f8734.findViewById(R.id.textView2);
            this.f8727 = (TextView) this.f8734.findViewById(R.id.textView1);
            this.f8727.setText(str);
            this.f8731.setText(null);
        }
    }

    C1941(LayoutInflater layoutInflater) {
        C1942[] r8;
        super(R.layout.equip);
        this.f8726[C1246.ACC_L.ordinal()] = new C1942(this.f1626, R.id.accessory1, "accessory");
        this.f8726[C1246.ACC_R.ordinal()] = new C1942(this.f1626, R.id.accessory2, "accessory");
        this.f8726[C1246.SHOES.ordinal()] = new C1942(this.f1626, R.id.shoes, "shoes");
        this.f8726[C1246.GARMENT.ordinal()] = new C1942(this.f1626, R.id.robe, "robe");
        this.f8726[C1246.HEAD_LOW.ordinal()] = new C1942(this.f1626, R.id.head_bottom, "head");
        this.f8726[C1246.HEAD_MID.ordinal()] = new C1942(this.f1626, R.id.head_mid, "head");
        this.f8726[C1246.HEAD_TOP.ordinal()] = new C1942(this.f1626, R.id.head_top, "head");
        this.f8726[C1246.ARMOR.ordinal()] = new C1942(this.f1626, R.id.body, "body");
        this.f8726[C1246.HAND_L.ordinal()] = new C1942(this.f1626, R.id.shield, "L-hand");
        this.f8726[C1246.HAND_R.ordinal()] = new C1942(this.f1626, R.id.weapon, "R-hand");
        this.f8726[C1246.AMMO.ordinal()] = new C1942(this.f1626, R.id.ammo, "ammo");
        this.f8725 = (TextView) this.f1626.findViewById(R.id.textView_ammocnt);
        this.f8720 = (TextView) this.f1626.findViewById(R.id.textView_equip);
        this.f8723 = (Button) this.f1626.findViewById(R.id.button2);
        this.f8724 = (Button) this.f1626.findViewById(R.id.button1);
        this.f8723.setOnClickListener(new C1556(this));
        this.f8724.setOnClickListener(new C1650(this));
        this.f8723.setVisibility(4);
        for (C1942 r10 : this.f8726) {
            r10.f8732.setOnClickListener(this.f8722);
            r10.f8731.setOnClickListener(this.f8722);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ą */
    public final void mo3948() {
        LayoutParams layoutParams = (LayoutParams) this.f1626.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.addRule(13);
            layoutParams.width = -1;
            layoutParams.addRule(10);
            layoutParams.addRule(2, R.id.imageview_equip);
            this.f1626.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4589(C1246 r6, C1992 r7, int i) {
        if ((!this.f8721 || r6.ordinal() >= C1246.HEAD_TOP_COSTUME.ordinal()) && (this.f8721 || r6.ordinal() < C1246.HEAD_TOP_COSTUME.ordinal())) {
            C1942 r4 = this.f8726[(r6.f6398 != null ? r6.f6398 : r6).ordinal()];
            if (r7 == null) {
                r4.f8731.setText(null);
                r4.f8732.setVisibility(4);
                r4.f8728 = 0;
                r4.f8729 = -1;
                if (r6 == C1246.AMMO) {
                    this.f8725.setText(null);
                }
                return;
            }
            r4.f8731.setText(r7.mo4615(C1014.f6158.f674.f608));
            r4.f8731.setTextColor(r7.mo4610());
            r4.f8732.setVisibility(0);
            r4.f8728 = r7.f8848;
            r4.f8729 = i;
            if (r6 == C1246.AMMO) {
                this.f8725.setText(String.valueOf(r7.f8846));
            }
            C0453ix ixVar = C1014.f6147.f51;
            C1992 r8 = r7;
            ixVar.mo3871(r4.f8732, C1014.f6158.f674.mo3608(r8.f8848, r8.f8837, false), ixVar.f1450);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: CFG modification limit reached, blocks count: 122 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0047, code lost:
        if ((p004o.C1246.values()[r5].f6399 & r7.f8836) == 0) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0049, code lost:
        mo4589(p004o.C1246.values()[r5], r7, r9);
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        if (r7.f8836 == 0) goto L_0x0054;
     */
    /* renamed from: Ć */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4588() {
        /*
            r10 = this;
            o.lf r0 = p004o.C1014.f6137
            o.ձ r3 = r0.f1636
            java.util.HashMap<java.lang.Integer, o.쎥> r0 = r3.f6528
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            o.ˮ͈[] r0 = p004o.C1246.values()
            int r4 = r0.length
            r5 = 0
            goto L_0x0069
        L_0x0011:
            r6 = 0
            java.util.HashMap<java.lang.Integer, o.쎥> r0 = r3.f6528
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r8 = r0.iterator()
            goto L_0x0054
        L_0x001e:
            java.lang.Object r0 = r8.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r7 = r0
            java.lang.Object r0 = r7.getKey()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r9 = r0.intValue()
            java.lang.Object r0 = r7.getValue()
            o.쎥 r0 = (p004o.C1992) r0
            r7 = r0
            if (r7 == 0) goto L_0x0054
            int r0 = r7.f8836
            if (r0 == 0) goto L_0x0054
            o.ˮ͈[] r0 = p004o.C1246.values()
            r0 = r0[r5]
            int r0 = r0.f6399
            int r1 = r7.f8836
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0054
            o.ˮ͈[] r0 = p004o.C1246.values()
            r0 = r0[r5]
            r10.mo4589(r0, r7, r9)
            r6 = 1
            goto L_0x005a
        L_0x0054:
            boolean r0 = r8.hasNext()
            if (r0 != 0) goto L_0x001e
        L_0x005a:
            if (r6 != 0) goto L_0x0067
            o.ˮ͈[] r0 = p004o.C1246.values()
            r0 = r0[r5]
            r1 = 0
            r2 = -1
            r10.mo4589(r0, r1, r2)
        L_0x0067:
            int r5 = r5 + 1
        L_0x0069:
            if (r5 < r4) goto L_0x0011
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1941.mo4588():void");
    }

    /* renamed from: ȃ */
    public final void mo3546() {
        c_activity c_activity = C1014.f6147;
        ((ImageView) C1014.f6147.findViewById(R.id.imageview_equip)).setImageBitmap(C1014.f6147.f51.f1396[1]);
        mo3948();
    }

    /* renamed from: Ą */
    public final void mo3544() {
        c_activity c_activity = C1014.f6147;
        ((ImageView) C1014.f6147.findViewById(R.id.imageview_equip)).setImageBitmap(C1014.f6147.f51.f1396[0]);
    }
}
