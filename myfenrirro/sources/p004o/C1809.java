package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: o.馈 */
class C1809 implements OnClickListener {

    /* renamed from: 櫯 */
    private final /* synthetic */ C1537if f8338;

    /* renamed from: 鷭 */
    final /* synthetic */ C1536 f8339;

    C1809(C1536 r1, C1537if ifVar) {
        this.f8339 = r1;
        this.f8338 = ifVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case 0:
                C1014.f6147.f51.mo3876(C0501.GAMEMENU, this.f8338.ordinal(), -1, 0, 0);
                return;
            default:
                return;
        }
    }
}
