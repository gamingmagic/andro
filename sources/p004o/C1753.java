package p004o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import p004o.C1637;

/* renamed from: o.討 */
class C1753<T extends C1637> extends BaseAdapter {

    /* renamed from: 鷭 */
    T[] f8049;

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.f8049[i];
    }

    C1753(T[] tArr) {
        this.f8049 = tArr;
    }

    public int getCount() {
        return this.f8049.length;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        T t = this.f8049[i];
        t.f7591 = (RelativeLayout) C1014.f6147.getLayoutInflater().inflate(t.f7590, null);
        t.mo3595();
        return t.f7591;
    }
}
