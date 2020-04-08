package p004o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.libroserver.apk.R;

/* renamed from: o.ay */
final class C0202ay extends BaseAdapter {

    /* renamed from: 鷭 */
    C0203az[] f432 = new C0203az[C1014.f6137.f1636.f6502.f386.length];

    C0202ay() {
        for (int i = 0; i < this.f432.length; i++) {
            this.f432[i] = new C0203az(C1014.f6137.f1636.f6502.f386[i], i);
        }
    }

    public final int getCount() {
        return this.f432.length;
    }

    public final Object getItem(int i) {
        return this.f432[i];
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C0203az azVar = this.f432[i];
        azVar.f437 = (RelativeLayout) C1014.f6147.getLayoutInflater().inflate(R.layout.party_item, null);
        azVar.f436 = (TextView) azVar.f437.findViewById(R.id.textView1);
        azVar.f435 = (ImageView) azVar.f437.findViewById(R.id.imageView1);
        if (!azVar.f434.f391) {
            azVar.f435.setImageBitmap(null);
        } else if (azVar.f434.f395 == C0582ni.LEADER) {
            azVar.f435.setImageResource(17301520);
        } else {
            azVar.f435.setImageResource(17301519);
        }
        if (!azVar.f434.f391) {
            azVar.f436.setText(azVar.f434.f397);
        } else {
            azVar.f436.setText(new StringBuilder(String.valueOf(azVar.f434.f397)).append(" (").append(azVar.f434.f396).append(")").toString());
        }
        return this.f432[i].f437;
    }
}
