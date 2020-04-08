package p004o;

import android.support.p000v4.internal.view.SupportMenu;
import android.support.p000v4.view.InputDeviceCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.libroserver.apk.R;
import p004o.C0643pc.C0650;

/* renamed from: o.ev */
final class C0326ev extends BaseAdapter {

    /* renamed from: 鷭 */
    C0327[] f879;

    /* renamed from: o.ev$鷭 */
    class C0327 {

        /* renamed from: 纫 */
        private static /* synthetic */ int[] f880;

        /* renamed from: Ą */
        boolean f881;

        /* renamed from: ą */
        TextView f882;

        /* renamed from: Ć */
        TextView f883;

        /* renamed from: ć */
        TextView f884;

        /* renamed from: ȃ */
        int f886 = -1;

        /* renamed from: Ȋ */
        ImageView[] f887 = new ImageView[3];

        /* renamed from: ˮ͈ */
        C0650 f888;

        /* renamed from: ˮ͍ */
        TextView f889;

        /* renamed from: 岱 */
        ProgressBar f890;

        /* renamed from: 櫯 */
        RelativeLayout f891;

        /* renamed from: 鷭 */
        int f892;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
        /* renamed from: 鷭 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static /* synthetic */ int[] m351() {
            /*
                int[] r0 = f880
                if (r0 == 0) goto L_0x0005
                return r0
            L_0x0005:
                o.pc$櫯[] r0 = p004o.C0643pc.C0649.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                o.pc$櫯 r0 = p004o.C0643pc.C0649.eu     // Catch:{ NoSuchFieldError -> 0x0016 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
                r1 = 7
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                o.pc$櫯 r0 = p004o.C0643pc.C0649.gb     // Catch:{ NoSuchFieldError -> 0x0020 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
                r1 = 2
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
            L_0x0020:
                o.pc$櫯 r0 = p004o.C0643pc.C0649.id     // Catch:{ NoSuchFieldError -> 0x002b }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r1 = 8
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                o.pc$櫯 r0 = p004o.C0643pc.C0649.ph     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r1 = 6
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                o.pc$櫯 r0 = p004o.C0643pc.C0649.ru     // Catch:{ NoSuchFieldError -> 0x003f }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003f }
                r1 = 1
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x003f }
            L_0x003f:
                o.pc$櫯 r0 = p004o.C0643pc.C0649.sg     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r1 = 4
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                o.pc$櫯 r0 = p004o.C0643pc.C0649.th     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r1 = 5
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                o.pc$櫯 r0 = p004o.C0643pc.C0649.us     // Catch:{ NoSuchFieldError -> 0x005d }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r1 = 3
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                f880 = r2
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p004o.C0326ev.C0327.m351():int[]");
        }

        C0327(C0650 r3, int i, int i2, boolean z) {
            this.f888 = r3;
            this.f886 = i;
            this.f892 = i2;
            this.f881 = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: 鷭 */
        public final void mo3698(int i) {
            int i2;
            String str;
            this.f886 = i;
            if (this.f890 != null) {
                this.f890.setVisibility(this.f886 == -1 ? 0 : 4);
            }
            if (this.f884 != null) {
                this.f884.setVisibility(this.f886 == -1 ? 4 : 0);
            }
            if (this.f886 >= 0) {
                if (this.f886 < 75) {
                    i2 = -16711936;
                    str = "fast";
                } else if (this.f886 < 200) {
                    i2 = InputDeviceCompat.SOURCE_ANY;
                    str = "average";
                } else {
                    i2 = SupportMenu.CATEGORY_MASK;
                    str = "slow";
                }
                if (this.f884 != null) {
                    this.f884.setText("Ping : " + this.f886 + " (" + str + ")");
                    this.f884.setTextColor(i2);
                }
            } else if (this.f884 != null) {
                this.f884.setText("Ping : 1000+ (slow or n/a)");
                this.f884.setTextColor(SupportMenu.CATEGORY_MASK);
            }
        }
    }

    C0326ev(C0650[] r10, int[] iArr) {
        this.f879 = new C0327[r10.length];
        for (int i = 0; i < this.f879.length; i++) {
            this.f879[i] = new C0327(r10[i], iArr[i], i, r10.length > 10);
        }
    }

    public final int getCount() {
        return this.f879.length;
    }

    public final Object getItem(int i) {
        return this.f879[i];
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        RelativeLayout relativeLayout = (RelativeLayout) C1014.f6147.getLayoutInflater().inflate(R.layout.select_login_server_element, null);
        C0327 r5 = this.f879[i];
        RelativeLayout relativeLayout2 = relativeLayout;
        r5.f891 = relativeLayout2;
        r5.f882 = (TextView) relativeLayout2.findViewById(R.id.textView1);
        r5.f883 = (TextView) relativeLayout2.findViewById(R.id.textView2);
        r5.f884 = (TextView) relativeLayout2.findViewById(R.id.textView3);
        r5.f890 = (ProgressBar) relativeLayout2.findViewById(R.id.progressBar1);
        r5.f887[0] = (ImageView) relativeLayout2.findViewById(R.id.imageView1);
        r5.f887[1] = (ImageView) relativeLayout2.findViewById(R.id.imageView2);
        r5.f887[2] = (ImageView) relativeLayout2.findViewById(R.id.imageView3);
        r5.f889 = (TextView) relativeLayout2.findViewById(R.id.textView4);
        r5.f882.setText(r5.f888.f4522);
        r5.f889.setText(r5.f888.f4513);
        for (int i3 = 0; i3 < r5.f887.length; i3++) {
            if (i3 < r5.f888.f4444.length && r5.f888.f4444[i3] != null) {
                switch (C0327.m351()[r5.f888.f4444[i3].ordinal()]) {
                    case 1:
                        i2 = R.drawable.ru;
                        break;
                    case 2:
                        i2 = R.drawable.gb;
                        break;
                    case 3:
                        i2 = R.drawable.us;
                        break;
                    case 4:
                        i2 = R.drawable.sg;
                        break;
                    case 5:
                        i2 = R.drawable.th;
                        break;
                    case 6:
                        i2 = R.drawable.ph;
                        break;
                    case 7:
                        i2 = R.drawable.eu;
                        break;
                    case 8:
                        i2 = R.drawable.id;
                        break;
                    default:
                        i2 = 0;
                        break;
                }
                if (i2 != 0) {
                    r5.f887[i3].setVisibility(0);
                    r5.f887[i3].setImageResource(i2);
                }
            }
            r5.f887[i3].setVisibility(8);
            r5.f887[i3].setImageDrawable(null);
        }
        r5.f883.setText(r5.f888.f4505);
        if (r5.f881) {
            r5.f883.setVisibility(8);
            r5.f889.setVisibility(8);
        }
        r5.mo3698(r5.f886);
        return relativeLayout;
    }
}
