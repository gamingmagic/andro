package p004o;

import android.view.View;
import android.view.View.OnClickListener;
import java.text.NumberFormat;

/* renamed from: o.r */
class C0708r implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0546m f4638;

    C0708r(C0546m mVar) {
        this.f4638 = mVar;
    }

    public final void onClick(View view) {
        try {
            C0546m mVar = this.f4638;
            mVar.f1752 = Integer.parseInt(this.f4638.f1754.f7750.getText().toString());
            if (mVar.f1756 != null) {
                mVar.f1756.setText(NumberFormat.getInstance().format((long) mVar.f1752));
            }
            C0515l lVar = (C0515l) C1014.f6147.f51.f1385.f1657.getAdapter();
            C1014.f6147.f51.f1385.f1657.setAdapter(new C0515l(lVar.f1619, this.f4638.f1759));
        } catch (NumberFormatException unused) {
        }
    }
}
