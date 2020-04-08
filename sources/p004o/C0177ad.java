package p004o;

import android.graphics.Point;
import android.text.SpannableString;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.libroserver.apk.R;
import com.roworkshop.andro.c_activity;

/* renamed from: o.ad */
final class C0177ad {

    /* renamed from: Ą */
    private SpannableString f333;

    /* renamed from: ȃ */
    private C0548mb f334;

    /* renamed from: ˮ͈ */
    Point f335;

    /* renamed from: 櫯 */
    long f336;

    /* renamed from: 鷭 */
    RelativeLayout f337;

    C0177ad(C0540lv lvVar, String str, int i, long j) {
        this.f334 = lvVar;
        mo3513(str, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3512() {
        C0525li r6 = C1014.f6142.mo3974(this.f334.f1707);
        if (this.f337 == null && C1014.f6147.f51.f1412 != null) {
            this.f337 = (RelativeLayout) C1014.f6147.getLayoutInflater().inflate(R.layout.screen_text, null);
            C1014.f6147.f51.f1412.addView(this.f337);
            C1014.f6147.f51.f1412.bringChildToFront(this.f337);
            ((TextView) this.f337.findViewById(R.id.text_view)).setText(this.f333);
            this.f337.measure(0, 0);
            this.f335 = new Point(this.f337.getMeasuredWidth(), this.f337.getMeasuredHeight());
        }
        Point point = new Point((int) r6.f1649, (int) (((float) C1014.f6142.f1690.y) - (r6.f1648 + ((((float) C1014.f6147.getResources().getDisplayMetrics().densityDpi) / 160.0f) * 45.0f))));
        c_activity c_activity = C1014.f6147;
        C0453ix.m487(this.f337, point, this.f335);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3513(String str, int i) {
        this.f333 = C1746.m2406(str, i, false);
        this.f336 = System.currentTimeMillis() + 5000;
        mo3512();
        if (this.f337 != null) {
            TextView textView = (TextView) this.f337.findViewById(R.id.text_view);
            textView.setText(this.f333);
            textView.setLinkTextColor(-16777216 | i);
        }
    }
}
