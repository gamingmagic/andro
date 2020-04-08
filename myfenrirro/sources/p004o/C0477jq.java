package p004o;

import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Toast;

/* renamed from: o.jq */
class C0477jq extends ClickableSpan {

    /* renamed from: 鷭 */
    private final /* synthetic */ String[] f1509;

    C0477jq(String[] strArr) {
        this.f1509 = strArr;
    }

    public final void onClick(View view) {
        Toast.makeText(view.getContext(), new StringBuilder(String.valueOf(this.f1509[0])).append(" ").append(this.f1509[1]).append(",").append(this.f1509[2]).toString(), 0).show();
    }
}
