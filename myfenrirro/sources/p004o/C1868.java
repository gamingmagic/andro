package p004o;

import android.graphics.Bitmap;
import android.widget.ListView;
import com.libroserver.apk.R;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: o.ꂅ */
final class C1868 extends C2041 {

    /* renamed from: ˮ͈ */
    HashMap<String, Bitmap> f8457 = new HashMap<>();

    /* renamed from: 櫯 */
    int f8458;

    /* renamed from: 鷭 */
    ListView f8459 = ((ListView) this.f8943.findViewById(R.id.listView1));

    C1868() {
        super(R.layout.guild_members, C0571my.MEMBERS);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4444() {
        this.f8458 = 0;
        Iterator it = C1014.f6137.f1636.f6541.f7213.iterator();
        while (it.hasNext()) {
            this.f8458 += ((C1506) it.next()).f7230;
        }
        this.f8459.setAdapter(new C1947());
    }
}
