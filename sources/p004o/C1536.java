package p004o;

import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.libroserver.apk.R;
import java.util.Arrays;

/* renamed from: o.哷 */
final class C1536 extends C0519ld {

    /* renamed from: 櫯 */
    private static /* synthetic */ int[] f7309;

    /* renamed from: 鷭 */
    ListView f7310 = ((ListView) this.f1626.findViewById(R.id.listView1));

    /* renamed from: o.哷$if */
    enum C1537if {
        ABILITY("Abilities"),
        BANK("Bank"),
        CHAT("Chat"),
        EQUIP("Equipment"),
        ITEMS("Inventory"),
        OPTION("Options"),
        PROFILE("Profile"),
        QUEST("Quests"),
        RODEX("Rodex"),
        STATUS("Status"),
        SKILL("Skills");
        

        /* renamed from: ċ */
        String f7323;

        private C1537if(String str) {
            this.f7323 = str;
        }
    }

    /* renamed from: o.哷$鷭 */
    class C1538 extends C1637 {

        /* renamed from: ˮ͈ */
        C1537if f7325;

        /* renamed from: 櫯 */
        String f7326;

        /* renamed from: 鷭 */
        TextView f7327;

        C1538(C1537if ifVar) {
            super(R.layout.gamemenu_item);
            this.f7325 = ifVar;
            this.f7326 = ifVar.f7323;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: 鷭 */
        public final void mo3595() {
            this.f7327 = (TextView) this.f7591.findViewById(R.id.textView1);
            this.f7327.setText(this.f7326);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(25:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0034 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0048 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0052 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x005d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0068 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0073 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: Ć */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m2223() {
        /*
            int[] r0 = f7309
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.哷$if[] r0 = p004o.C1536.C1537if.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.哷$if r0 = p004o.C1536.C1537if.ABILITY     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.哷$if r0 = p004o.C1536.C1537if.BANK     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.哷$if r0 = p004o.C1536.C1537if.CHAT     // Catch:{ NoSuchFieldError -> 0x002a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            o.哷$if r0 = p004o.C1536.C1537if.EQUIP     // Catch:{ NoSuchFieldError -> 0x0034 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0034 }
        L_0x0034:
            o.哷$if r0 = p004o.C1536.C1537if.ITEMS     // Catch:{ NoSuchFieldError -> 0x003e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x003e }
        L_0x003e:
            o.哷$if r0 = p004o.C1536.C1537if.OPTION     // Catch:{ NoSuchFieldError -> 0x0048 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0048 }
            r1 = 6
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0048 }
        L_0x0048:
            o.哷$if r0 = p004o.C1536.C1537if.PROFILE     // Catch:{ NoSuchFieldError -> 0x0052 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0052 }
            r1 = 7
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0052 }
        L_0x0052:
            o.哷$if r0 = p004o.C1536.C1537if.QUEST     // Catch:{ NoSuchFieldError -> 0x005d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
            r1 = 8
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x005d }
        L_0x005d:
            o.哷$if r0 = p004o.C1536.C1537if.RODEX     // Catch:{ NoSuchFieldError -> 0x0068 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0068 }
            r1 = 9
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0068 }
        L_0x0068:
            o.哷$if r0 = p004o.C1536.C1537if.SKILL     // Catch:{ NoSuchFieldError -> 0x0073 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
            r1 = 11
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0073 }
        L_0x0073:
            o.哷$if r0 = p004o.C1536.C1537if.STATUS     // Catch:{ NoSuchFieldError -> 0x007e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
            r1 = 10
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x007e }
        L_0x007e:
            f7309 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1536.m2223():int[]");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4384(C1537if ifVar) {
        switch (m2223()[ifVar.ordinal()]) {
            case 1:
                if (!(C1014.f6147.f51.f1422.f1626.getParent() != null)) {
                    C1014.f6147.f51.f1422.mo3537h_();
                    break;
                } else {
                    C1014.f6147.f51.f1422.mo3538();
                    break;
                }
            case 2:
                C1014.f6147.f51.f1443.mo3537h_();
                break;
            case 3:
                if (!(C1014.f6147.f51.f1427.f8028.getVisibility() == 0)) {
                    C1014.f6147.f51.f1427.mo3537h_();
                    break;
                } else {
                    C1014.f6147.f51.f1427.mo3538();
                    break;
                }
            case 4:
                if (!(C1014.f6147.f51.f1420.f1626.getParent() != null)) {
                    C1014.f6147.f51.f1420.mo3537h_();
                    break;
                } else {
                    C1014.f6147.f51.f1420.mo3538();
                    break;
                }
            case 5:
                if (!(C1014.f6147.f51.f1445.f1626.getParent() != null)) {
                    C1014.f6147.f51.f1445.mo3537h_();
                    break;
                } else {
                    C1014.f6147.f51.f1445.mo3538();
                    break;
                }
            case 6:
                if (!(C1014.f6147.f51.f1418.f1626.getParent() != null)) {
                    C1014.f6147.f51.f1418.mo3537h_();
                    break;
                } else {
                    C1014.f6147.f51.f1418.mo3538();
                    break;
                }
            case 7:
                if (!(C1014.f6147.f51.f1416.f1626.getParent() != null)) {
                    C1014.f6147.f51.f1416.mo3537h_();
                    break;
                } else {
                    C0234cb cbVar = C1014.f6147.f51.f1416;
                    cbVar.mo3538();
                    cbVar.f544.mo3537h_();
                    break;
                }
            case 8:
                C1014.f6147.f51.f1392.mo3537h_();
                break;
            case 9:
                C1014.f6147.f51.f1451.mo3537h_();
                break;
            case 10:
                if (!(C1014.f6147.f51.f1375.f1626.getParent() != null)) {
                    C1014.f6147.f51.f1375.mo3537h_();
                    break;
                } else {
                    C1014.f6147.f51.f1375.mo3538();
                    break;
                }
            case 11:
                C1014.f6147.f51.f1435.f1122 = C0397.SKILL_ME;
                C1014.f6147.f51.f1435.mo3537h_();
                break;
        }
        mo3538();
    }

    C1536() {
        super(R.layout.gamemenu);
        this.f7310.setOnItemClickListener(new C1743(this));
        this.f7310.setOnItemLongClickListener(new C1834(this));
        int i = 0;
        C1538[] r3 = new C1538[C1537if.values().length];
        for (int i2 = 0; i2 < r3.length; i2++) {
            C1537if ifVar = C1537if.values()[i2];
            if ((!C1014.f6140.f4516 || ifVar != C1537if.RODEX) && (!C1014.f6140.f4525 || ifVar != C1537if.BANK)) {
                int i3 = i;
                i++;
                r3[i3] = new C1538(ifVar);
            }
        }
        this.f7310.setAdapter(new C1753((C1538[]) Arrays.copyOf(r3, i)));
    }

    /* renamed from: ȃ */
    public final void mo3546() {
        LayoutParams layoutParams = (LayoutParams) this.f1626.getLayoutParams();
        layoutParams.width = (int) ((((float) C1014.f6147.getResources().getDisplayMetrics().densityDpi) / 160.0f) * 150.0f);
        layoutParams.addRule(3, C1014.f6147.f51.f1458.getId());
        this.f1626.setLayoutParams(layoutParams);
    }

    /* renamed from: Ą */
    public final void mo3544() {
    }
}
