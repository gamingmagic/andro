package p004o;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.libroserver.apk.R;
import com.roworkshop.andro.c_activity;
import com.roworkshop.andro.c_point;

/* renamed from: o.訍 */
final class C1752 {

    /* renamed from: 岱 */
    private static /* synthetic */ int[] f8039;

    /* renamed from: Ą */
    ImageView f8040;

    /* renamed from: ą */
    boolean f8041;

    /* renamed from: Ć */
    c_point f8042;

    /* renamed from: ć */
    String f8043;

    /* renamed from: ȃ */
    TextView f8044;

    /* renamed from: ˮ͈ */
    TextView f8045;

    /* renamed from: ˮ͍ */
    String f8046;

    /* renamed from: 櫯 */
    RelativeLayout f8047;

    /* renamed from: 鷭 */
    C0548mb f8048;

    /* JADX WARNING: Can't wrap try/catch for region: R(27:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|30) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0037 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0041 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x004b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0055 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0060 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x006a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0074 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x007e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0017 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0022 */
    /* renamed from: ˮ͈ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m2419() {
        /*
            int[] r0 = f8039
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.nn[] r0 = p004o.C0587nn.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.nn r0 = p004o.C0587nn.ALL     // Catch:{ NoSuchFieldError -> 0x0017 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
            r1 = 12
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0017 }
        L_0x0017:
            o.nn r0 = p004o.C0587nn.CHAT     // Catch:{ NoSuchFieldError -> 0x0022 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
            r1 = 10
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0022 }
        L_0x0022:
            o.nn r0 = p004o.C0587nn.ELEM     // Catch:{ NoSuchFieldError -> 0x002d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
            r1 = 11
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002d }
        L_0x002d:
            o.nn r0 = p004o.C0587nn.HOM     // Catch:{ NoSuchFieldError -> 0x0037 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0037 }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0037 }
        L_0x0037:
            o.nn r0 = p004o.C0587nn.ITEM     // Catch:{ NoSuchFieldError -> 0x0041 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0041 }
            r1 = 7
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0041 }
        L_0x0041:
            o.nn r0 = p004o.C0587nn.MER     // Catch:{ NoSuchFieldError -> 0x004b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
            r1 = 6
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            o.nn r0 = p004o.C0587nn.MOB     // Catch:{ NoSuchFieldError -> 0x0055 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0055 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0055 }
        L_0x0055:
            o.nn r0 = p004o.C0587nn.NPC     // Catch:{ NoSuchFieldError -> 0x0060 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
            r1 = 9
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0060 }
        L_0x0060:
            o.nn r0 = p004o.C0587nn.NUL     // Catch:{ NoSuchFieldError -> 0x006a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
        L_0x006a:
            o.nn r0 = p004o.C0587nn.PC     // Catch:{ NoSuchFieldError -> 0x0074 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0074 }
        L_0x0074:
            o.nn r0 = p004o.C0587nn.PET     // Catch:{ NoSuchFieldError -> 0x007e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x007e }
        L_0x007e:
            o.nn r0 = p004o.C0587nn.SKILL     // Catch:{ NoSuchFieldError -> 0x0089 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0089 }
            r1 = 8
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0089 }
        L_0x0089:
            f8039 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1752.m2419():int[]");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4495(C0548mb mbVar) {
        this.f8048 = mbVar;
        C0520le leVar = mbVar.f1769;
        C1919 r3 = C1919.class.isAssignableFrom(leVar.getClass()) ? leVar : null;
        boolean z = (r3 == null || r3.f8658 == null || r3.f8658.length() <= 0) ? false : true;
        boolean z2 = this.f8047 == null || z != this.f8041;
        this.f8041 = z;
        if (z2) {
            if (this.f8047 != null) {
                C1014.f6147.f51.f1412.removeView(this.f8047);
            }
            if (this.f8041) {
                this.f8047 = (RelativeLayout) C1014.f6147.getLayoutInflater().inflate(R.layout.name_caption2, null);
            } else {
                this.f8047 = (RelativeLayout) C1014.f6147.getLayoutInflater().inflate(R.layout.name_caption, null);
            }
            this.f8045 = (TextView) this.f8047.findViewById(R.id.textView1);
            if (this.f8041) {
                this.f8044 = (TextView) this.f8047.findViewById(R.id.textView2);
                this.f8040 = (ImageView) this.f8047.findViewById(R.id.imageView1);
                mo4493();
            }
            C1014.f6147.f51.f1412.addView(this.f8047);
            C1014.f6147.f51.f1412.bringChildToFront(this.f8047);
        }
        if (r3 != null) {
            if (r3.f8657 != null) {
                this.f8043 = r3.f8657.split("#")[0];
            } else {
                this.f8043 = "";
            }
            if (r3.f8651 != null && r3.f8651.length() > 0) {
                this.f8043 += " (" + r3.f8651 + ")";
            }
            this.f8045.setText(this.f8043);
            if (this.f8041) {
                this.f8046 = r3.f8658 + " [" + r3.f8648 + "]";
                this.f8044.setText(this.f8046);
            }
            int[] r0 = m2419();
            C0252cp cpVar = C1014.f6158;
            switch (r0[C0522lg.m563(mbVar.f1769.f1633).ordinal()]) {
                case 3:
                    this.f8045.setTextColor(-14650);
                    break;
                case 9:
                    this.f8045.setTextColor(-7029257);
                    break;
                default:
                    this.f8045.setTextColor(-1);
                    break;
            }
        } else if (mbVar.f1769.f1629 == C0587nn.ITEM) {
            C0520le leVar2 = mbVar.f1769;
            C1645 r7 = C1645.class.isAssignableFrom(leVar2.getClass()) ? leVar2 : null;
            C1708 r02 = C1014.f6158.f674.f608;
            int i = r7.f1633;
            boolean z3 = r7.f7604;
            C1701 r72 = r02.mo4465(i);
            this.f8043 = r72 == null ? null : r72.mo4462(z3);
            this.f8045.setText(this.f8043);
            this.f8045.setTextColor(-4204);
        } else {
            return;
        }
        mo4494();
    }

    C1752(C0548mb mbVar) {
        mo4495(mbVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4494() {
        C0525li r6 = C1014.f6142.mo3974(this.f8048.f1707);
        if (r6 != null) {
            if (this.f8042 == null) {
                this.f8047.measure(0, 0);
                this.f8042 = new c_point(this.f8047.getMeasuredWidth(), this.f8047.getMeasuredHeight());
            }
            c_activity c_activity = C1014.f6147;
            C0453ix.m487(this.f8047, new Point((int) r6.f1649, C1014.f6142.f1690.y - (((int) r6.f1648) - 40)), (Point) this.f8042);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final void mo4493() {
        if (this.f8040 != null) {
            C0520le leVar = this.f8048.f1769;
            C1919 r0 = C1919.class.isAssignableFrom(leVar.getClass()) ? leVar : null;
            C1919 r3 = r0;
            if (r0.f8637 != 0) {
                C0252cp cpVar = C1014.f6158;
                Bitmap r4 = C0252cp.m264(r3.f8637, r3.f8638);
                if (r4 == null) {
                    C1014.f6144.mo3652((C0839ue) new C1545(r3.f8637));
                } else {
                    this.f8040.setImageBitmap(r4);
                }
            }
        }
    }
}
