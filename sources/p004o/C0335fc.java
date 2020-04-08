package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: o.fc */
class C0335fc implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0334fb f906;

    C0335fc(C0334fb fbVar) {
        this.f906 = fbVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C0334fb fbVar = this.f906;
        fbVar.f893.setText(fbVar.f904[i]);
        C1014.f6160.mo3805(fbVar.f903, 0, String.valueOf(i));
        C1014.f6160.mo3794();
    }
}
