package p004o;

import android.graphics.Bitmap;
import android.support.p000v4.view.ViewPager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.libroserver.apk.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

/* renamed from: o.eb */
final class C0297eb extends C0519ld {

    /* renamed from: 鷭 */
    ViewPager f813 = ((ViewPager) this.f1626.findViewById(R.id.viewpager));

    /* renamed from: o.eb$if */
    static class C0298if extends C1753<C0300> {
        C0298if(C0300[] r1) {
            super(r1);
        }
    }

    /* renamed from: o.eb$櫯 */
    static class C0299 extends C0186aj {

        /* renamed from: Ą */
        Button f814;

        /* renamed from: ą */
        Button f815;

        /* renamed from: Ć */
        Button f816;

        /* renamed from: ȃ */
        ListView f817;

        /* renamed from: ˮ͈ */
        TextView f818 = ((TextView) this.f385.findViewById(R.id.textView1));

        /* renamed from: 櫯 */
        boolean f819;

        /* renamed from: 鷭 */
        C0560mn f820;

        C0299(C0560mn mnVar) {
            super(R.layout.rodex_page);
            this.f820 = mnVar;
            this.f818.setText(this.f820.name());
            this.f814 = (Button) this.f385.findViewById(R.id.button1);
            this.f815 = (Button) this.f385.findViewById(R.id.button2);
            this.f816 = (Button) this.f385.findViewById(R.id.buttonNew);
            this.f817 = (ListView) this.f385.findViewById(R.id.listView1);
            this.f817.setOnItemClickListener(new C0302ed(this));
            this.f816.setOnClickListener(new C0303ee(this));
        }
    }

    /* renamed from: o.eb$鷭 */
    static class C0300 extends C1637 {

        /* renamed from: ą */
        static Bitmap[] f821 = new Bitmap[C0558ml.values().length];

        /* renamed from: Ć */
        private static /* synthetic */ int[] f822;

        /* renamed from: Ą */
        TextView f823;

        /* renamed from: ȃ */
        ImageView f824;

        /* renamed from: ˮ͈ */
        TextView f825;

        /* renamed from: 櫯 */
        ImageView f826;

        /* renamed from: 鷭 */
        C1973 f827;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
        /* renamed from: 櫯 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static /* synthetic */ int[] m330() {
            /*
                int[] r0 = f822
                if (r0 == 0) goto L_0x0005
                return r0
            L_0x0005:
                o.ml[] r0 = p004o.C0558ml.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                o.ml r0 = p004o.C0558ml.BOTH     // Catch:{ NoSuchFieldError -> 0x0016 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
                r1 = 7
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                o.ml r0 = p004o.C0558ml.ITEMS     // Catch:{ NoSuchFieldError -> 0x0020 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
                r1 = 5
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
            L_0x0020:
                o.ml r0 = p004o.C0558ml.NOBOTH     // Catch:{ NoSuchFieldError -> 0x002b }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r1 = 8
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                o.ml r0 = p004o.C0558ml.NOITEMS     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r1 = 6
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                o.ml r0 = p004o.C0558ml.NOPORING     // Catch:{ NoSuchFieldError -> 0x003f }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003f }
                r1 = 2
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x003f }
            L_0x003f:
                o.ml r0 = p004o.C0558ml.NOZENY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r1 = 4
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                o.ml r0 = p004o.C0558ml.PORING     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r1 = 1
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                o.ml r0 = p004o.C0558ml.ZENY     // Catch:{ NoSuchFieldError -> 0x005d }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r1 = 3
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                f822 = r2
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p004o.C0297eb.C0300.m330():int[]");
        }

        static {
        }

        C0300(C1973 r2) {
            super(R.layout.rodex_letter_preview);
            this.f827 = r2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: 鷭 */
        public final void mo3595() {
            String str;
            String str2;
            this.f826 = (ImageView) this.f7591.findViewById(R.id.imageView1);
            this.f824 = (ImageView) this.f7591.findViewById(R.id.imageView2);
            this.f825 = (TextView) this.f7591.findViewById(R.id.textView1);
            this.f823 = (TextView) this.f7591.findViewById(R.id.textView2);
            switch (m330()[this.f827.f8780.ordinal()]) {
                case 3:
                case 4:
                    str = "icon_zeny";
                    break;
                case 5:
                case 6:
                    str = "icon_item";
                    break;
                case 7:
                case 8:
                    str = "icon_zeny_n_item";
                    break;
                default:
                    str = null;
                    break;
            }
            C1014.f6147.f51.mo3871(this.f826, "data\\texture\\" + C1014.f6158.f674.f623.f7904.f7928 + "\\basic_interface\\rodexsystem\\renewal\\" + (this.f827.f8781 ? "icon_status_mail_read" : "icon_status_mail_received") + ".bmp", (Bitmap) null);
            C1014.f6147.f51.mo3871(this.f824, str != null ? "data\\texture\\" + C1014.f6158.f674.f623.f7904.f7928 + "\\basic_interface\\rodexsystem\\renewal\\" + str + ".bmp" : null, (Bitmap) null);
            this.f825.setText(new StringBuilder(String.valueOf(this.f827.f8779)).append("\n").append(this.f827.f8776).toString());
            if (this.f827.f8778 >= 86400) {
                C0252cp cpVar = C1014.f6158;
                String r5 = C1014.f6160.mo3796(2853);
                str2 = String.format(r5 == null ? "MSG2853" : r5, new Object[]{Integer.valueOf(this.f827.f8778 / 86400)});
            } else if (this.f827.f8778 >= 3600) {
                C0252cp cpVar2 = C1014.f6158;
                String r52 = C1014.f6160.mo3796(2852);
                str2 = String.format(r52 == null ? "MSG2852" : r52, new Object[]{Integer.valueOf(this.f827.f8778 / 3600)});
            } else {
                C0252cp cpVar3 = C1014.f6158;
                String r53 = C1014.f6160.mo3796(2851);
                str2 = String.format(r53 == null ? "MSG2851" : r53, new Object[]{Integer.valueOf(this.f827.f8778 / 60)});
            }
            if (this.f827.f8777 > 0) {
                str2 = "r: " + new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date(System.currentTimeMillis() - ((long) (this.f827.f8777 * 1000)))) + "\ndel:" + str2;
            }
            this.f823.setText(str2);
        }
    }

    C0297eb() {
        super(R.layout.rodex);
        LinkedList linkedList = new LinkedList();
        for (C0560mn r3 : C0560mn.values()) {
            linkedList.add(new C0299(r3));
        }
        this.f813.setAdapter(new C0185ai(linkedList));
        this.f813.addOnPageChangeListener(new C0301ec(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3673(C0560mn mnVar) {
        C0299 r4 = (C0299) ((C0185ai) this.f813.getAdapter()).f384.get(mnVar.ordinal());
        if (!r4.f819) {
            C1014.f6144.mo3652((C0839ue) new C1330(mnVar, 0));
            r4.f819 = true;
        }
    }

    /* renamed from: ȃ */
    public final void mo3546() {
        mo3673(C0560mn.values()[this.f813.getCurrentItem()]);
    }

    /* renamed from: Ą */
    public final void mo3544() {
        C1014.f6144.mo3652((C0839ue) new C1780());
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: CFG modification limit reached, blocks count: 116 */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3672(java.util.ArrayList<p004o.C1973> r11) {
        /*
            r10 = this;
            o.mn[] r6 = p004o.C0560mn.values()
            int r5 = r6.length
            r4 = 0
            goto L_0x0064
        L_0x0008:
            r3 = r6[r4]
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r9 = r11.iterator()
            goto L_0x0027
        L_0x0014:
            java.lang.Object r0 = r9.next()
            o.볯 r0 = (p004o.C1973) r0
            r8 = r0
            o.mn r0 = r8.f8783
            if (r0 != r3) goto L_0x0027
            o.eb$鷭 r0 = new o.eb$鷭
            r0.<init>(r8)
            r7.add(r0)
        L_0x0027:
            boolean r0 = r9.hasNext()
            if (r0 != 0) goto L_0x0014
            r8 = r3
            android.support.v4.view.ViewPager r0 = r10.f813
            android.support.v4.view.PagerAdapter r0 = r0.getAdapter()
            o.ai r0 = (p004o.C0185ai) r0
            java.util.LinkedList<o.aj> r0 = r0.f384
            int r1 = r8.ordinal()
            java.lang.Object r0 = r0.get(r1)
            o.eb$櫯 r0 = (p004o.C0297eb.C0299) r0
            r8 = r0
            int r0 = r7.size()
            if (r0 <= 0) goto L_0x0062
            r0 = 1
            r8.f819 = r0
            int r0 = r7.size()
            o.eb$鷭[] r9 = new p004o.C0297eb.C0300[r0]
            android.widget.ListView r0 = r8.f817
            o.eb$if r1 = new o.eb$if
            java.lang.Object[] r2 = r7.toArray(r9)
            o.eb$鷭[] r2 = (p004o.C0297eb.C0300[]) r2
            r1.<init>(r2)
            r0.setAdapter(r1)
        L_0x0062:
            int r4 = r4 + 1
        L_0x0064:
            if (r4 < r5) goto L_0x0008
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0297eb.mo3672(java.util.ArrayList):void");
    }
}
