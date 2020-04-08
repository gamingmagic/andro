package p004o;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

/* renamed from: o.Ք */
class C1299 implements OnClickListener {

    /* renamed from: 櫯 */
    private final /* synthetic */ C1695 f6483;

    /* renamed from: 鷭 */
    final /* synthetic */ C1905if f6484;

    C1299(C1905if ifVar, C1695 r2) {
        this.f6484 = ifVar;
        this.f6483 = r2;
    }

    public final void onClick(View view) {
        String editable = this.f6483.f7750.getText().toString();
        if (editable.length() != 6) {
            Toast.makeText(C1014.f6147, "Birth date should have YYMMDD format and have 6 digits.", 1).show();
            return;
        }
        C1014.f6144.mo3652((C0839ue) new C1686(this.f6484.f8560.f8598.f2923, C0622ot.m749(editable, C0618op.LATIN, 6)));
    }
}
