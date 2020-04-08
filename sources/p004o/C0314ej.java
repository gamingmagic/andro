package p004o;

import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.ej */
class C0314ej implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0312eh f856;

    C0314ej(C0312eh ehVar) {
        this.f856 = ehVar;
    }

    public final void onClick(View view) {
        this.f856.mo3679(Environment.getExternalStorageDirectory(), false);
    }
}
