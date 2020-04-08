package p004o;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.檝 */
class C1650 implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1941 f7613;

    C1650(C1941 r1) {
        this.f7613 = r1;
    }

    public final void onClick(View view) {
        C1941 r3 = this.f7613;
        r3.f8724.setVisibility(4);
        r3.f8723.setVisibility(0);
        r3.f8720.setText("Costumes");
        r3.f8721 = true;
        r3.mo4588();
    }
}
