package p004o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import com.libroserver.apk.R;
import java.util.ArrayList;

/* renamed from: o.ܯܶ */
final class C1323 extends BaseAdapter {

    /* renamed from: 鷭 */
    ArrayList<C0512ky> f6626 = new ArrayList<>();

    C1323(int[] iArr, C1992[] r7) {
        int i = 0;
        while (i < r7.length) {
            this.f6626.add(new C0512ky(r7[i], iArr != null ? iArr[i] : -1));
            i++;
        }
    }

    C1323(int[] iArr, ArrayList<C1992> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            this.f6626.add(new C0512ky((C1992) arrayList.get(i), -1));
        }
    }

    public final int getCount() {
        return this.f6626.size();
    }

    public final Object getItem(int i) {
        return this.f6626.get(i);
    }

    public final long getItemId(int i) {
        return (long) ((C0512ky) this.f6626.get(i)).f1595.f8848;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return ((C0512ky) this.f6626.get(i)).mo3937((RelativeLayout) C1014.f6147.getLayoutInflater().inflate(R.layout.inventory_item, null));
    }
}
