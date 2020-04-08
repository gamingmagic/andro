package p004o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.libroserver.apk.R;

/* renamed from: o.ﲱ */
final class C2055 extends BaseAdapter {

    /* renamed from: 鷭 */
    C1369[] f8978;

    C2055() {
        C1503 r3 = C1014.f6137.f1636.f6541;
        this.f8978 = new C1369[(r3.f7215 == null ? 0 : r3.f7215.length)];
        for (int i = 0; i < this.f8978.length; i++) {
            this.f8978[i] = new C1369(C1014.f6137.f1636.f6541.mo4362(i));
        }
    }

    public final int getCount() {
        return this.f8978.length;
    }

    public final Object getItem(int i) {
        return this.f8978[i];
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1369 r4 = this.f8978[i];
        r4.f6918 = (RelativeLayout) C1014.f6147.getLayoutInflater().inflate(R.layout.guild_positions_item, null);
        r4.f6917 = (TextView) r4.f6918.findViewById(R.id.textView1);
        r4.f6916 = (TextView) r4.f6918.findViewById(R.id.textView2);
        r4.f6914 = (CheckBox) r4.f6918.findViewById(R.id.checkBox1);
        r4.f6915 = (CheckBox) r4.f6918.findViewById(R.id.checkBox2);
        C1369 r5 = r4;
        r4.f6917.setText(r5.f6919.f7226);
        r5.f6916.setText(new StringBuilder(String.valueOf(String.valueOf(r5.f6919.f7223))).append(" %").toString());
        r5.f6914.setChecked(r5.f6919.f7225);
        r5.f6915.setChecked(r5.f6919.f7224);
        r5.f6914.setEnabled(C1014.f6137.f1636.f455);
        r5.f6915.setEnabled(C1014.f6137.f1636.f455);
        return r4.f6918;
    }
}
