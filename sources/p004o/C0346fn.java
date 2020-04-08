package p004o;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Environment;
import android.util.Log;
import android.widget.EditText;
import java.io.File;

/* renamed from: o.fn */
class C0346fn implements OnClickListener {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ int f928;

    /* renamed from: 櫯 */
    private final /* synthetic */ EditText f929;

    /* renamed from: 鷭 */
    final /* synthetic */ C0345fm f930;

    C0346fn(C0345fm fmVar, EditText editText, int i) {
        this.f930 = fmVar;
        this.f929 = editText;
        this.f928 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        File file;
        String editable = this.f929.getText().toString();
        switch (this.f928) {
            case 0:
                file = new File(new StringBuilder(String.valueOf(C1014.f6147.getFilesDir().getAbsolutePath())).append("/").append(editable).toString());
                break;
            case 1:
                file = new File(new StringBuilder(String.valueOf(Environment.getExternalStorageDirectory().getAbsolutePath())).append("/").append(editable).toString());
                break;
            case 2:
                file = new File(editable);
                break;
            default:
                String str = "Unexpected choise";
                Log.e("AndRO", str);
                throw new C0588no(str);
        }
        if (file.exists()) {
            C0595nv.f2874 = file.getAbsolutePath();
            C1014.f6147.f51.f1386.f917.setText(C0595nv.f2874);
            Builder builder = new Builder(C1014.f6147);
            builder.setMessage("Directory has been successfully changed~ Please restart application for the changes to take effect.");
            builder.setPositiveButton("Quit", new C0347fo(this));
            builder.show();
            return;
        }
        Builder builder2 = new Builder(C1014.f6147);
        builder2.setMessage(new StringBuilder(String.valueOf(editable)).append(": directory doesn't exist. Create?").toString());
        builder2.setPositiveButton("Create", new C0348fp(this, file));
        builder2.setNegativeButton("Cancel", null);
        builder2.show();
    }
}
