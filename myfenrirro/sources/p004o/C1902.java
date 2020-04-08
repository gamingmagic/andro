package p004o;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.뇪 */
class C1902 implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1904 f8546;

    C1902(C1904 r1) {
        this.f8546 = r1;
    }

    public final void onClick(View view) {
        C0271df dfVar = C1014.f6149;
        if (dfVar.f727) {
            new Builder(C1014.f6147).setMessage("Already processing other purchase, can't show buying menu").show();
        } else if (dfVar.f728 == null) {
            new Builder(C1014.f6147).setMessage("Can't start purchase process: not connected to Billing Server. Please try again later.").show();
        } else {
            Builder builder = new Builder(C1014.f6147);
            builder.setTitle("Store");
            String[] strArr = new String[C1838.f8423.length];
            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = new StringBuilder(String.valueOf(C1838.f8423[i].f8427)).append(" -> $").append(C1838.f8423[i].f8426).toString();
            }
            builder.setItems(strArr, new C0279dn(dfVar));
            builder.show();
        }
    }
}
