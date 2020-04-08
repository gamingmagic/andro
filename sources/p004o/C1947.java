package p004o;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.libroserver.apk.R;
import java.text.NumberFormat;

/* renamed from: o.럃 */
final class C1947 extends BaseAdapter {

    /* renamed from: 鷭 */
    C2048[] f8740;

    C1947() {
        this.f8740 = new C2048[0];
        this.f8740 = new C2048[C1014.f6137.f1636.f6541.f7213.size()];
        for (int i = 0; i < C1014.f6137.f1636.f6541.f7213.size(); i++) {
            this.f8740[i] = new C2048((C1506) C1014.f6137.f1636.f6541.f7213.get(i));
        }
    }

    public final int getCount() {
        return this.f8740.length;
    }

    public final Object getItem(int i) {
        return this.f8740[i];
    }

    public final long getItemId(int i) {
        return (long) this.f8740[i].f8974.f7240;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C2048 r6 = this.f8740[i];
        r6.f8973 = (RelativeLayout) C1014.f6147.getLayoutInflater().inflate(R.layout.guild_members_item, null);
        r6.f8970 = (ImageView) r6.f8973.findViewById(R.id.imageView1);
        r6.f8966 = (TextView) r6.f8973.findViewById(R.id.textView1);
        r6.f8967 = (TextView) r6.f8973.findViewById(R.id.textView4);
        r6.f8968 = (TextView) r6.f8973.findViewById(R.id.textView5);
        r6.f8969 = (TextView) r6.f8973.findViewById(R.id.textView6);
        r6.f8972 = (TextView) r6.f8973.findViewById(R.id.textView3);
        C2048 r7 = r6;
        r6.f8966.setText(r7.f8974.f7233);
        r7.f8967.setText(C1014.f6137.f1636.f6541.mo4362(r7.f8974.f7237).f7226);
        C0523 r8 = (C0523) C1014.f6158.f674.f626.f1638.get(Integer.valueOf(r7.f8974.f7228));
        r7.f8968.setText(r8 != null ? r8.f1645 : "Poring");
        r7.f8969.setText("Lv " + r7.f8974.f7229);
        if (r7.f8974.f7230 <= 0 || C1014.f6147.f51.f1383.f7300.f8458 == 0) {
            r7.f8972.setText(null);
        } else {
            r7.f8972.setText(NumberFormat.getInstance().format((long) r7.f8974.f7230) + " EXP (" + ((r7.f8974.f7230 * 100) / C1014.f6147.f51.f1383.f7300.f8458) + "%)");
        }
        r7.f8970.setVisibility(r7.f8974.f7235 ? 0 : 4);
        if (r7.f8974.f7235) {
            Bitmap bitmap = r7.f8971 != null ? r7.f8971 : (Bitmap) C1014.f6147.f51.f1383.f7300.f8457.get(r7.mo4636());
            if (bitmap == null) {
                C1014.f6158.mo3387((Runnable) new C1871(r7, r7.f8974));
            } else {
                r7.f8970.setImageBitmap(bitmap);
            }
        }
        return r6.f8973;
    }
}
