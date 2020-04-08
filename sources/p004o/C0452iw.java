package p004o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import com.libroserver.apk.R;
import java.util.LinkedList;

/* renamed from: o.iw */
final class C0452iw extends BaseAdapter {

    /* renamed from: 鷭 */
    LinkedList<C0512ky> f1365;

    C0452iw(LinkedList<C0512ky> linkedList) {
        this.f1365 = linkedList;
    }

    public final int getCount() {
        return this.f1365.size();
    }

    public final Object getItem(int i) {
        return this.f1365.get(i);
    }

    public final long getItemId(int i) {
        return (long) ((C0512ky) this.f1365.get(i)).f1595.f8848;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return ((C0512ky) this.f1365.get(i)).mo3937((RelativeLayout) C1014.f6147.getLayoutInflater().inflate(R.layout.inventory_item, null));
    }
}
