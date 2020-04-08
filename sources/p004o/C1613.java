package p004o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.libroserver.apk.R;

/* renamed from: o.揇 */
final class C1613 extends BaseAdapter {

    /* renamed from: 鷭 */
    C1290[] f7531 = new C1290[C1014.f6137.f1636.f6541.f7212.size()];

    C1613() {
        for (int i = 0; i < C1014.f6137.f1636.f6541.f7212.size(); i++) {
            this.f7531[i] = new C1290((C1504if) C1014.f6137.f1636.f6541.f7212.get(i));
        }
    }

    public final int getCount() {
        return this.f7531.length;
    }

    public final Object getItem(int i) {
        return this.f7531[i];
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1290 r4 = this.f7531[i];
        r4.f6463 = (RelativeLayout) C1014.f6147.getLayoutInflater().inflate(R.layout.guild_expulsions_item, null);
        r4.f6462 = (TextView) r4.f6463.findViewById(R.id.textView1);
        r4.f6461 = (TextView) r4.f6463.findViewById(R.id.textView2);
        C1290 r5 = r4;
        r4.f6462.setText(r5.f6464.f7222);
        r5.f6461.setText(r5.f6464.f7221);
        return r4.f6463;
    }
}
