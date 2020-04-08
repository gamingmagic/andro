package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.lang.ref.WeakReference;
import org.json.JSONArray;

/* renamed from: o.ace */
class ace implements OnClickListener {

    /* renamed from: 櫯 */
    final /* synthetic */ acc f262;

    /* renamed from: 鷭 */
    final /* synthetic */ JSONArray f263;

    ace(acc acc, JSONArray jSONArray) {
        this.f262 = acc;
        this.f263 = jSONArray;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        acz.m146(this.f262.f259, "[]");
        WeakReference weakReference = new WeakReference(this.f262.f259);
        if (!acx.m142().booleanValue() || !acx.m143(weakReference).booleanValue()) {
            this.f262.m97(this.f263, Boolean.valueOf(false));
        } else {
            acc.m95(this.f262, this.f263);
        }
    }
}
