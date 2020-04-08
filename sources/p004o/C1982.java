package p004o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import com.libroserver.apk.R;

/* renamed from: o.삦 */
final class C1982 extends BaseAdapter {

    /* renamed from: 鷭 */
    C1582[] f8808 = new C1582[C1014.f6137.f1636.f6519.length];

    C1982() {
        for (int i = 0; i < C1014.f6137.f1636.f6519.length; i++) {
            this.f8808[i] = new C1582(C1014.f6137.f1636.f6519[i]);
        }
    }

    public final int getCount() {
        return this.f8808.length;
    }

    public final Object getItem(int i) {
        return this.f8808[i];
    }

    public final long getItemId(int i) {
        return (long) this.f8808[i].f7495.f7650;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1582 r5 = this.f8808[i];
        r5.f7494 = (RelativeLayout) C1014.f6147.getLayoutInflater().inflate(R.layout.friends_item, null);
        r5.f7493 = (RadioButton) r5.f7494.findViewById(R.id.radioButton1);
        r5.f7493.setText((CharSequence) C1014.f6152.f7977.get(Integer.valueOf(r5.f7495.f7650)));
        r5.f7493.setChecked(r5.f7495.f7649);
        return this.f8808[i].f7494;
    }
}
