package p004o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import com.libroserver.apk.R;
import java.util.ArrayList;
import java.util.Map.Entry;

/* renamed from: o.橉 */
final class C1646 extends BaseAdapter {

    /* renamed from: 鷭 */
    ArrayList<C1999> f7605 = new ArrayList<>();

    /* renamed from: 鷭 */
    private static int m2321(C1992 r5) {
        for (Entry entry : C1014.f6137.f1636.f6528.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if (r5.f8848 == ((C1992) entry.getValue()).f8848) {
                return intValue;
            }
        }
        return 0;
    }

    C1646(C1992[] r6, int[] iArr, int[] iArr2) {
        for (int i = 0; i < r6.length; i++) {
            this.f7605.add(new C1999(r6[i], iArr2[i], -1));
        }
    }

    C1646(ArrayList<C1992> arrayList, ArrayList<Integer> arrayList2, ArrayList<Integer> arrayList3) {
        for (int i = 0; i < arrayList.size(); i++) {
            this.f7605.add(new C1999((C1992) arrayList.get(i), ((Integer) arrayList3.get(i)).intValue(), arrayList2 == null ? -1 : ((Integer) arrayList2.get(i)).intValue()));
        }
    }

    C1646(ArrayList<C1999> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            this.f7605.add(new C1999(((C1999) arrayList.get(i)).f8872, ((C1999) arrayList.get(i)).f8871, m2321(((C1999) arrayList.get(i)).f8872)));
        }
    }

    public final int getCount() {
        return this.f7605.size();
    }

    public final Object getItem(int i) {
        return this.f7605.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return ((C1999) this.f7605.get(i)).mo4618((RelativeLayout) C1014.f6147.getLayoutInflater().inflate(R.layout.inventory_item, null), false);
    }
}
