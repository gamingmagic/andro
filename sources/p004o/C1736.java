package p004o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.libroserver.apk.R;
import com.roworkshop.andro.c_point;
import java.util.Arrays;

/* renamed from: o.肀 */
final class C1736 extends BaseAdapter {

    /* renamed from: 鷭 */
    C1340[] f8001 = new C1340[C0569mw.values().length];

    C1736() {
        C0569mw[] values;
        int i = 0;
        for (C0569mw mwVar : C0569mw.values()) {
            C0252cp cpVar = C1014.f6158;
            if (C0252cp.m263(mwVar.ordinal())) {
                int i2 = i;
                i++;
                this.f8001[i2] = new C1340(mwVar);
            }
        }
        this.f8001 = (C1340[]) Arrays.copyOf(this.f8001, i);
    }

    public final int getCount() {
        return this.f8001.length;
    }

    public final Object getItem(int i) {
        return this.f8001[i];
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1340 r7 = this.f8001[i];
        r7.f6873 = (RelativeLayout) C1014.f6147.getLayoutInflater().inflate(R.layout.emotion_item, null);
        r7.f6871 = (TextView) r7.f6873.findViewById(R.id.textView1);
        r7.f6870 = (ImageView) r7.f6873.findViewById(R.id.imageView1);
        r7.f6871.setText(r7.f6872.ordinal() + ". /" + r7.f6872.name());
        ImageView imageView = r7.f6870;
        C0252cp cpVar = C1014.f6158;
        imageView.setImageBitmap(C0252cp.m266(r7.f6872.ordinal(), new c_point(64, 64)));
        return this.f8001[i].f6873;
    }
}
