package p004o;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: o.aw */
class C0200aw implements OnClickListener {

    /* renamed from: 櫯 */
    private final /* synthetic */ C0203az f428;

    /* renamed from: 鷭 */
    final /* synthetic */ C0197at f429;

    C0200aw(C0197at atVar, C0203az azVar) {
        this.f429 = atVar;
        this.f428 = azVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case 0:
                Builder builder = new Builder(C1014.f6147);
                builder.setTitle(null).setMessage("Do you really want to change party leadership to " + this.f428.f434.f397 + " ?");
                builder.setPositiveButton("Yes", new C0201ax(this, this.f428));
                builder.setNegativeButton("No", null);
                builder.show();
                return;
            case 1:
                C1014.f6144.mo3652((C0839ue) new C1056(this.f428.f434.f398, this.f428.f434.f397));
                break;
        }
    }
}
