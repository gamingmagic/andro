package p004o;

import android.widget.ImageView;
import android.widget.TextView;
import com.libroserver.apk.R;

/* renamed from: o.Ȳ */
class C1128 implements Runnable {

    /* renamed from: 鷭 */
    final /* synthetic */ C1588 f6230;

    C1128(C1588 r1) {
        this.f6230 = r1;
    }

    public final void run() {
        C1014.f6147.setContentView(R.layout.loading);
        ((ImageView) C1014.f6147.findViewById(R.id.imageview_loadingscreen)).setImageResource(R.drawable.ragnaroklogo);
        ((TextView) C1014.f6147.findViewById(R.id.textView1)).setText(null);
        C1014.m1844(C1014.f6159);
    }
}
