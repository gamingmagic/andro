package p004o;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.驩 */
class C1819 implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1496 f8417;

    C1819(C1496 r1) {
        this.f8417 = r1;
    }

    public final void onClick(View view) {
        C1496 r6 = this.f8417;
        Builder builder = new Builder(C1014.f6147);
        builder.setTitle("Message");
        C0252cp cpVar = C1014.f6158;
        String r4 = C1014.f6160.mo3796(1371);
        builder.setMessage(C0453ix.m483(new StringBuilder(String.valueOf(r4 == null ? "MSG1371" : r4)).append("\n").toString(), true));
        builder.setPositiveButton("Ok", new C1934(r6));
        builder.setNegativeButton("Cancel", new C1609(r6));
        builder.show();
    }
}
