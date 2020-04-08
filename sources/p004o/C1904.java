package p004o;

import android.graphics.Bitmap;
import android.support.p000v4.internal.view.SupportMenu;
import android.support.p000v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.libroserver.apk.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import org.apache.http.HttpStatus;

/* renamed from: o.댚 */
public final class C1904 extends C0499km {

    /* renamed from: Ą */
    ViewPager f8550;

    /* renamed from: ą */
    C1906 f8551;

    /* renamed from: Ć */
    int f8552;

    /* renamed from: ć */
    private OnClickListener f8553 = new C1902(this);

    /* renamed from: ȃ */
    Button f8554;

    /* renamed from: ˮ͈ */
    TextView f8555;

    /* renamed from: 櫯 */
    TextView f8556;

    /* renamed from: 鷭 */
    public RelativeLayout f8557;

    /* renamed from: o.댚$if */
    class C1905if extends C0186aj {

        /* renamed from: Ą */
        Button f8558;

        /* renamed from: ą */
        TextView f8559;

        /* renamed from: Ć */
        C1908 f8560;

        /* renamed from: ċ */
        private OnClickListener f8562 = new C1515(this);

        /* renamed from: ȃ */
        Button f8563;

        /* renamed from: Ȋ */
        private OnClickListener f8564 = new C1529(this);

        /* renamed from: ˮ͈ */
        Button f8565;

        /* renamed from: ˮ͍ */
        private OnClickListener f8566 = new C1694(this);

        /* renamed from: 岱 */
        private OnClickListener f8567 = new C1958(this);

        /* renamed from: 櫯 */
        TextView f8568;

        /* renamed from: 鷭 */
        ImageView f8569;

        C1905if(C1908 r4, boolean z, boolean z2) {
            super(R.layout.char_select_view);
            this.f8560 = r4;
            this.f8569 = (ImageView) this.f385.findViewById(R.id.imageview_character);
            this.f8568 = (TextView) this.f385.findViewById(R.id.textview_name);
            this.f8565 = (Button) this.f385.findViewById(R.id.button_delete);
            this.f8563 = (Button) this.f385.findViewById(R.id.button_dontdelete);
            this.f8558 = (Button) this.f385.findViewById(R.id.btn_ok);
            this.f8559 = (TextView) this.f385.findViewById(R.id.tv_delete_date);
            this.f8569.setOnClickListener(this.f8566);
            this.f8565.setOnClickListener(this.f8567);
            this.f8563.setOnClickListener(this.f8562);
            this.f8558.setOnClickListener(this.f8564);
            if (!z2) {
                ((TextView) this.f385.findViewById(R.id.textview_left)).setVisibility(4);
            }
            this.f8569.setImageBitmap(this.f8560.f8600);
            this.f8568.setText(this.f8560.f8599);
            mo4564();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: 鷭 */
        public final void mo4564() {
            long j;
            long j2;
            if (this.f8560.f8598.f2898 >= 1000000000) {
                long j3 = ((long) this.f8560.f8598.f2898) * 1000;
                j = j3;
                j2 = j3 - System.currentTimeMillis();
            } else {
                j2 = ((long) this.f8560.f8598.f2898) * 1000;
                j = System.currentTimeMillis() + j2;
            }
            this.f8565.setVisibility(j2 < 1 ? 0 : 8);
            this.f8559.setVisibility(j2 > 0 ? 0 : 8);
            this.f8563.setVisibility(j2 > 0 ? 0 : 8);
            this.f8559.setText("Delete time : " + SimpleDateFormat.getInstance().format(new Date(j)));
            this.f8559.setTextColor(j2 < 0 ? -16776961 : SupportMenu.CATEGORY_MASK);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: 櫯 */
        public final void mo4563() {
            C0453ix ixVar = C1014.f6147.f51;
            String str = "Loading";
            if (ixVar.f1370 != null) {
                C1014.f6147.mo3387((Runnable) new C0473jm(ixVar));
            }
            C1014.f6147.mo3387((Runnable) new C0471jk(ixVar, str));
            C1014.f6161.f6165 = this.f8560.f8598;
            C1014.f6160.mo3805("last_char_slot", 0, String.valueOf(this.f8560.f8598.f2895));
            if (this.f8560.f8598.f2898 != 0) {
                C1014.f6144.mo3652((C0839ue) new C1095(this.f8560.f8598.f2923));
            }
            C1014.f6144.mo3652((C0839ue) new C1096(this.f8560.f8598.f2895));
            if (C1014.f6147.f51.f1452.mo3539()) {
                C1014.f6147.setContentView(R.layout.loading);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: ˮ͈ */
        public final void mo4562() {
            if (!C1014.f6140.f4451) {
                C0252cp cpVar = C1014.f6158;
                String r5 = C1014.f6160.mo3796(1816);
                C1695 r0 = new C1695(r5 == null ? "MSG1816" : r5, false, "19710101", null);
                C1695 r52 = r0;
                r0.f7746 = new C1299(this, r52);
                r52.mo3949();
                return;
            }
            C0252cp cpVar2 = C1014.f6158;
            String r53 = C1014.f6160.mo3796((int) HttpStatus.SC_MULTIPLE_CHOICES);
            C1695 r02 = new C1695(r53 == null ? "MSG300" : r53, false, null, null);
            C1695 r54 = r02;
            r02.f7746 = new C1810(this, r54);
            r54.mo3949();
        }
    }

    /* renamed from: o.댚$ȃ */
    class C1906 {

        /* renamed from: ˮ͈ */
        C1761 f8571;

        /* renamed from: 櫯 */
        C1977 f8572;

        /* renamed from: 鷭 */
        C0405hk f8573;

        C1906(C1761 r6, C1977 r7) {
            this.f8572 = r7;
            this.f8573 = C1014.f6158.mo3621(r6.f8294, (byte) r7.ordinal(), true);
        }
    }

    /* renamed from: o.댚$ˮ͈ */
    class C1907 extends C0186aj {

        /* renamed from: Ą */
        Button f8574;

        /* renamed from: ą */
        Button f8575;

        /* renamed from: Ć */
        Button f8576;

        /* renamed from: ć */
        Button f8577;

        /* renamed from: ċ */
        TextView[] f8578 = new TextView[6];

        /* renamed from: đ */
        int f8579 = 1;

        /* renamed from: Ē */
        C1906 f8580;

        /* renamed from: ē */
        OnCheckedChangeListener f8581 = new C1997(this);

        /* renamed from: ė */
        private OnClickListener f8582 = new C1990(this);

        /* renamed from: ȃ */
        ImageView f8583;

        /* renamed from: Ȋ */
        SeekBar f8584;

        /* renamed from: ˮ͈ */
        EditText f8585;

        /* renamed from: ˮ͍ */
        SeekBar f8586;

        /* renamed from: ܕ */
        RadioButton f8587;

        /* renamed from: 䒧 */
        RadioButton f8589;

        /* renamed from: 岱 */
        SeekBar f8590;

        /* renamed from: 庸 */
        int f8591 = 0;

        /* renamed from: 櫯 */
        Button f8592;

        /* renamed from: 纫 */
        RadioButton f8593;

        /* renamed from: 躆 */
        RadioButton f8594;

        /* renamed from: 鷭 */
        TextView f8595;

        /* renamed from: 띥 */
        OnCheckedChangeListener f8596 = new C1750(this);

        C1907(C1906 r6) {
            super(R.layout.char_select_create);
            this.f8580 = r6;
            this.f8595 = (TextView) this.f385.findViewById(R.id.textview_createnewchar);
            this.f8583 = (ImageView) this.f385.findViewById(R.id.imageview_character);
            this.f8576 = (Button) this.f385.findViewById(R.id.button_haircolor_left);
            this.f8577 = (Button) this.f385.findViewById(R.id.button_haircolor_right);
            this.f8574 = (Button) this.f385.findViewById(R.id.button_hairstyle_left);
            this.f8575 = (Button) this.f385.findViewById(R.id.button_hairstyle_right);
            this.f8592 = (Button) this.f385.findViewById(R.id.button_create);
            this.f8585 = (EditText) this.f385.findViewById(R.id.edittext_name);
            this.f8586 = (SeekBar) this.f385.findViewById(R.id.seekBar3);
            this.f8590 = (SeekBar) this.f385.findViewById(R.id.seekBar2);
            this.f8584 = (SeekBar) this.f385.findViewById(R.id.seekBar1);
            this.f8578[0] = (TextView) this.f385.findViewById(R.id.textView1);
            this.f8578[1] = (TextView) this.f385.findViewById(R.id.textView2);
            this.f8578[2] = (TextView) this.f385.findViewById(R.id.textView3);
            this.f8578[3] = (TextView) this.f385.findViewById(R.id.textView4);
            this.f8578[4] = (TextView) this.f385.findViewById(R.id.textView5);
            this.f8578[5] = (TextView) this.f385.findViewById(R.id.textView6);
            this.f8593 = (RadioButton) this.f385.findViewById(R.id.radio_male);
            this.f8589 = (RadioButton) this.f385.findViewById(R.id.radio_female);
            this.f8594 = (RadioButton) this.f385.findViewById(R.id.radio_racehuman);
            this.f8587 = (RadioButton) this.f385.findViewById(R.id.radio_racedoram);
            if (C1014.f6140.f4489) {
                for (TextView visibility : this.f8578) {
                    visibility.setVisibility(4);
                }
                this.f8586.setVisibility(4);
                this.f8590.setVisibility(4);
                this.f8584.setVisibility(4);
                if (C1014.f6140.f4486) {
                    this.f8594.setVisibility(4);
                    this.f8587.setVisibility(4);
                }
            } else {
                this.f8593.setVisibility(4);
                this.f8589.setVisibility(4);
                this.f8594.setVisibility(4);
                this.f8587.setVisibility(4);
            }
            if (C1977.values()[C1014.f6161.f6163] == C1977.MALE) {
                this.f8593.setChecked(true);
                this.f8589.setChecked(false);
            } else {
                this.f8589.setChecked(true);
                this.f8593.setChecked(false);
            }
            this.f8583.setImageBitmap(null);
            this.f8576.setOnClickListener(new C1929(this));
            this.f8577.setOnClickListener(new C1893(this));
            this.f8574.setOnClickListener(new C1377(this));
            this.f8575.setOnClickListener(new C1722(this));
            C0252cp cpVar = C1014.f6158;
            String r62 = C1014.f6160.mo3796(2369);
            if (r62 != null) {
                this.f8595.setText(r62);
            }
            this.f8593.setOnCheckedChangeListener(this.f8596);
            this.f8589.setOnCheckedChangeListener(this.f8596);
            RadioButton radioButton = this.f8593;
            C0252cp cpVar2 = C1014.f6158;
            String r63 = C1014.f6160.mo3796(1129);
            radioButton.setText(r63 == null ? "MSG1129" : r63);
            RadioButton radioButton2 = this.f8589;
            C0252cp cpVar3 = C1014.f6158;
            String r64 = C1014.f6160.mo3796(1130);
            radioButton2.setText(r64 == null ? "MSG1130" : r64);
            this.f8594.setOnCheckedChangeListener(this.f8581);
            this.f8587.setOnCheckedChangeListener(this.f8581);
            RadioButton radioButton3 = this.f8594;
            C0252cp cpVar4 = C1014.f6158;
            String r65 = C1014.f6160.mo3796(3017);
            radioButton3.setText(r65 == null ? "MSG3017" : r65);
            RadioButton radioButton4 = this.f8587;
            C0252cp cpVar5 = C1014.f6158;
            String r66 = C1014.f6160.mo3796(3019);
            radioButton4.setText(r66 == null ? "MSG3019" : r66);
            this.f8592.setOnClickListener(this.f8582);
            mo4565();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: 鷭 */
        public final void mo4565() {
            C1761 r3 = C1014.f6140.f4489 ? this.f8587.isChecked() ? C1761.SUMMONER : C1761.NOVICE : C1761.NOVICE;
            C1977 r2 = C1014.f6140.f4489 ? this.f8593.isChecked() ? C1977.MALE : C1977.FEMALE : C1977.values()[C1014.f6161.f6163];
            C1014.f6158.mo3387((Runnable) new C1292(this, r2, r3));
        }
    }

    /* renamed from: o.댚$櫯 */
    class C1908 {

        /* renamed from: ˮ͈ */
        C0599nz f8598;

        /* renamed from: 櫯 */
        String f8599;

        /* renamed from: 鷭 */
        Bitmap f8600;

        C1908() {
        }
    }

    /* renamed from: o.댚$鷭 */
    class C1909 extends C0185ai {
        /* access modifiers changed from: 0000 */
        /* JADX WARNING: CFG modification limit reached, blocks count: 110 */
        /* renamed from: 鷭 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.ArrayList<p004o.C1904.C1905if> mo4567() {
            /*
                r6 = this;
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.LinkedList r0 = r6.f384
                java.util.Iterator r5 = r0.iterator()
                goto L_0x0029
            L_0x000c:
                java.lang.Object r0 = r5.next()
                o.aj r0 = (p004o.C0186aj) r0
                r4 = r0
                java.util.LinkedList r0 = r6.f384
                java.util.LinkedList r1 = r6.f384
                int r1 = r1.size()
                int r1 = r1 + -1
                java.lang.Object r0 = r0.get(r1)
                if (r4 == r0) goto L_0x0029
                r0 = r4
                o.댚$if r0 = (p004o.C1904.C1905if) r0
                r3.add(r0)
            L_0x0029:
                boolean r0 = r5.hasNext()
                if (r0 != 0) goto L_0x000c
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p004o.C1904.C1909.mo4567():java.util.ArrayList");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: 櫯 */
        public final ArrayList<C1908> mo4566() {
            ArrayList<C1908> arrayList = new ArrayList<>();
            Iterator it = mo4567().iterator();
            while (it.hasNext()) {
                arrayList.add(((C1905if) it.next()).f8560);
            }
            return arrayList;
        }

        C1909(ArrayList<C1908> arrayList, C1906 r4) {
            super(C1904.m2572(C1904.this, arrayList, r4));
        }
    }

    C1904() {
    }

    /* renamed from: 鷭 */
    static /* synthetic */ LinkedList m2572(C1904 r6, ArrayList arrayList, C1906 r8) {
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1908 r3 = (C1908) it.next();
            linkedList.add(new C1905if(r3, true, r3 != arrayList.get(0)));
        }
        linkedList.add(new C1907(r8));
        return linkedList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h_ */
    public final void mo3537h_() {
        View findViewById = ((ViewGroup) C1014.f6147.findViewById(16908290)).findViewById(R.id.relativeLayout1);
        if (findViewById != null && findViewById == this.f8557) {
            throw new RuntimeException("Attempt to show already active pager.");
        }
        C1014.f6147.setContentView(R.layout.char_select_pager);
        this.f8557 = (RelativeLayout) C1014.f6147.findViewById(R.id.relativeLayout1);
        this.f8556 = (TextView) C1014.f6147.findViewById(R.id.textView1);
        this.f8555 = (TextView) C1014.f6147.findViewById(R.id.textView2);
        this.f8554 = (Button) C1014.f6147.findViewById(R.id.button1);
        this.f8550 = (ViewPager) C1014.f6147.findViewById(R.id.viewpager);
        this.f8556.setText(C1014.f6140.f4522);
        this.f8555.setText(C1014.f6154);
        this.f8554.setVisibility(C1014.f6140.f4448 ? 0 : 8);
        this.f8554.setOnClickListener(this.f8553);
        C0453ix.m477(R.id.relativeLayout1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4561(int i, int i2) {
        Iterator it = ((C1909) this.f8550.getAdapter()).mo4567().iterator();
        while (it.hasNext()) {
            C1905if ifVar = (C1905if) it.next();
            if (ifVar.f8560.f8598.f2923 == i) {
                ifVar.f8560.f8598.f2898 = i2;
                C1014.f6158.mo3387((Runnable) new C1910(this, ifVar));
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: CFG modification limit reached, blocks count: 114 */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4560(int r7) {
        /*
            r6 = this;
            android.support.v4.view.ViewPager r0 = r6.f8550
            android.support.v4.view.PagerAdapter r0 = r0.getAdapter()
            o.댚$鷭 r0 = (p004o.C1904.C1909) r0
            r3 = r0
            if (r3 != 0) goto L_0x000c
            return
        L_0x000c:
            java.util.LinkedList r0 = r3.f384
            java.lang.Object r0 = r0.getLast()
            o.댚$ˮ͈ r0 = (p004o.C1904.C1907) r0
            r4 = r0
            java.util.ArrayList r3 = r3.mo4566()
            java.util.Iterator r5 = r3.iterator()
            goto L_0x002d
        L_0x001e:
            java.lang.Object r0 = r5.next()
            o.댚$櫯 r0 = (p004o.C1904.C1908) r0
            o.nz r0 = r0.f8598
            int r0 = r0.f2923
            if (r0 != r7) goto L_0x002d
            r5.remove()
        L_0x002d:
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L_0x001e
            android.support.v4.view.ViewPager r0 = r6.f8550
            o.댚$鷭 r1 = new o.댚$鷭
            o.댚$ȃ r2 = r4.f8580
            r1.<init>(r3, r2)
            r0.setAdapter(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1904.mo4560(int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final boolean mo3539() {
        View findViewById = ((ViewGroup) C1014.f6147.findViewById(16908290)).findViewById(R.id.relativeLayout1);
        return findViewById != null && findViewById == this.f8557;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˮ͈ */
    public final void mo3538() {
        if (mo3539()) {
            if (mo3539()) {
                C1014.f6147.setContentView(R.layout.login);
            }
            C1014.m1828();
        }
    }
}
