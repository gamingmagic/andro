package p004o;

import android.graphics.Bitmap;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* renamed from: o.gv */
final class C0387gv {

    /* renamed from: ċ */
    private static /* synthetic */ int[] f1094;

    /* renamed from: Ą */
    ImageView f1095;

    /* renamed from: ą */
    TextView f1096;

    /* renamed from: Ć */
    TextView f1097;

    /* renamed from: ć */
    TextView f1098;

    /* renamed from: ȃ */
    RelativeLayout f1099;

    /* renamed from: Ȋ */
    OnClickListener f1100 = new C0392gz(this);

    /* renamed from: ˮ͈ */
    Bitmap f1101;

    /* renamed from: ˮ͍ */
    Button f1102;

    /* renamed from: 岱 */
    OnClickListener f1103 = new C0389gw(this);

    /* renamed from: 櫯 */
    C0377gm f1104;

    /* renamed from: 鷭 */
    C0388 f1105 = C0388.CHARACTER;

    /* renamed from: o.gv$鷭 */
    enum C0388 {
        CHARACTER,
        GUILD
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:3|4|5|6|7|8|10) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ int[] m386() {
        /*
            int[] r0 = f1094
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.gv$鷭[] r0 = p004o.C0387gv.C0388.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.gv$鷭 r0 = p004o.C0387gv.C0388.CHARACTER     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.gv$鷭 r0 = p004o.C0387gv.C0388.GUILD     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            f1094 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0387gv.m386():int[]");
    }

    C0387gv(C0377gm gmVar, C0388 r3) {
        this.f1104 = gmVar;
    }
}
