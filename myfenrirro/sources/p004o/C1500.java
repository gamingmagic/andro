package p004o;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.䥯 */
class C1500 implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C2009 f7198;

    C1500(C2009 r1) {
        this.f7198 = r1;
    }

    public final void onClick(View view) {
        C2009 r6 = this.f7198;
        Builder builder = new Builder(C1014.f6147);
        builder.setTitle("Message");
        C0252cp cpVar = C1014.f6158;
        String r4 = C1014.f6160.mo3796(956);
        builder.setMessage(C0453ix.m483(new StringBuilder(String.valueOf(r4 == null ? "MSG956" : r4)).append("\n").toString(), true));
        builder.setPositiveButton("Ok", new C2016(r6));
        builder.setNegativeButton("Cancel", new C1557(r6));
        builder.show();
    }
}
