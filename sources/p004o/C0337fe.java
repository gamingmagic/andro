package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: o.fe */
class C0337fe implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0336fd f910;

    C0337fe(C0336fd fdVar) {
        this.f910 = fdVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C0595nv.f2871 = C0336fd.f907[i];
        this.f910.f893.setText(C0336fd.f908[i]);
        C1014.f6160.mo3792();
        C1014.f6147.setRequestedOrientation(C0336fd.f907[i]);
    }
}
