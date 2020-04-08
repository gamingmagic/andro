package p004o;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: o.霋 */
class C1800 extends ClickableSpan {

    /* renamed from: 鷭 */
    private final /* synthetic */ C1327 f8329;

    C1800(C1327 r1) {
        this.f8329 = r1;
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
    }

    public final void onClick(View view) {
        C1014.f6147.f51.f1380.mo4599(this.f8329.f6631);
        C1014.f6147.f51.f1380.mo3537h_();
    }
}
