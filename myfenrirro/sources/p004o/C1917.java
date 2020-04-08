package p004o;

import android.widget.ListView;
import android.widget.TextView;
import com.libroserver.apk.R;

/* renamed from: o.돪 */
final class C1917 extends C2041 {

    /* renamed from: 櫯 */
    TextView f8628 = ((TextView) this.f8943.findViewById(R.id.textView1));

    /* renamed from: 鷭 */
    ListView f8629 = ((ListView) this.f8943.findViewById(R.id.listView1));

    C1917() {
        super(R.layout.guild_skills, C0571my.SKILLS);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4444() {
        TextView textView = this.f8628;
        C0252cp cpVar = C1014.f6158;
        String r5 = C1014.f6160.mo3796(285);
        textView.setText(String.format(r5 == null ? "MSG285" : r5, new Object[]{Integer.valueOf(C1014.f6137.f1636.f6541.f7209)}));
        this.f8629.setAdapter(new C1664());
    }
}
