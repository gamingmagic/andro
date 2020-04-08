package p004o;

import android.app.AlertDialog.Builder;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.fl */
class C0344fl implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0340fh f926;

    C0344fl(C0340fh fhVar) {
        this.f926 = fhVar;
    }

    public final void onClick(View view) {
        Builder builder = new Builder(C1014.f6147);
        builder.setTitle("Set client directory");
        builder.setItems(new String[]{"Internal storage: " + C1014.f6147.getFilesDir().getAbsolutePath(), "External storage: " + Environment.getExternalStorageDirectory().getAbsolutePath(), "Custom"}, new C0345fm(this));
        builder.show();
    }
}
