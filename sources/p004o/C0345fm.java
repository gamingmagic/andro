package p004o;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;

/* renamed from: o.fm */
class C0345fm implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0344fl f927;

    C0345fm(C0344fl flVar) {
        this.f927 = flVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Builder builder = new Builder(C1014.f6147);
        EditText editText = new EditText(C1014.f6147);
        editText.setText(C0595nv.f2874);
        builder.setTitle("Input client subdirectory name");
        editText.setText("ragnarok");
        builder.setView(editText);
        builder.setPositiveButton("Ok", new C0346fn(this, editText, i));
        builder.setNegativeButton("Cancel", null);
        builder.show();
    }
}
