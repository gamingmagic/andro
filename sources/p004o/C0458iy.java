package p004o;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Spinner;
import com.libroserver.apk.R;
import com.roworkshop.andro.c_activity;

/* renamed from: o.iy */
class C0458iy implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0453ix f1479;

    C0458iy(C0453ix ixVar) {
        this.f1479 = ixVar;
    }

    public final void onClick(View view) {
        int selectedItemId = (int) ((Spinner) ((c_activity) view.getContext()).findViewById(R.id.spinner1)).getSelectedItemId();
        if (C1014.f6161.f6164 == null || C1014.f6161.f6164.f6175 == null || selectedItemId < 0 || selectedItemId >= C1014.f6161.f6164.f6175.length) {
            C0592ns.m674("Invalid selection");
        } else {
            C1014.m1844(C1014.f6161.f6164.f6175[selectedItemId]);
        }
    }
}
