package p004o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import com.libroserver.apk.R;
import com.roworkshop.andro.c_activity;
import java.util.ArrayList;

/* renamed from: o.fu */
final class C0353fu extends BaseAdapter {

    /* renamed from: 鷭 */
    C0354fv[] f942;

    C0353fu(c_activity c_activity, C0354fv[] fvVarArr) {
        this.f942 = fvVarArr;
    }

    C0353fu(ArrayList<C0354fv> arrayList) {
        this.f942 = new C0354fv[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.f942[i] = (C0354fv) arrayList.get(i);
        }
    }

    public final int getCount() {
        return this.f942.length;
    }

    public final Object getItem(int i) {
        return null;
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        RelativeLayout relativeLayout;
        Context context = viewGroup.getContext();
        if (view == null) {
            relativeLayout = (RelativeLayout) ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.npcshop_item, null);
        } else {
            relativeLayout = (RelativeLayout) view;
        }
        this.f942[i].mo3723(relativeLayout);
        return relativeLayout;
    }
}
