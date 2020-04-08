package p004o;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;

/* renamed from: o.隵 */
class C1798 implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1681 f8326;

    C1798(C1681 r1) {
        this.f8326 = r1;
    }

    public final void onClick(View view) {
        this.f8326.mo3538();
        C1014.f6147.f51.f1427.mo3537h_();
        AutoCompleteTextView autoCompleteTextView = C1014.f6147.f51.f1427.f8027;
        C0520le leVar = this.f8326.f7679.f1769;
        autoCompleteTextView.setText((C0206bb.class.isAssignableFrom(leVar.getClass()) ? leVar : null).f8657);
    }
}
