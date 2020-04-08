package p004o;

import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.ek */
class C0315ek implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0312eh f857;

    C0315ek(C0312eh ehVar) {
        this.f857 = ehVar;
    }

    public final void onClick(View view) {
        this.f857.mo3679(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), false);
    }
}
