package p004o;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.libroserver.apk.R;

/* renamed from: o.by */
class C0230by implements Runnable {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ boolean[] f521;

    /* renamed from: 櫯 */
    private final /* synthetic */ Bitmap f522;

    /* renamed from: 鷭 */
    final /* synthetic */ C0229bx f523;

    C0230by(C0229bx bxVar, Bitmap bitmap, boolean[] zArr) {
        this.f523 = bxVar;
        this.f522 = bitmap;
        this.f521 = zArr;
    }

    public final void run() {
        C1014.f6147.mo3387((Runnable) new C0473jm(C1014.f6147.f51));
        C1014.f6147.setContentView(R.layout.loading);
        C1014.f6147.f51.f1371 = (ProgressBar) C1014.f6147.findViewById(R.id.progressbar);
        C1014.f6147.f51.f1371.setMax(100);
        ImageView imageView = (ImageView) C1014.f6147.findViewById(R.id.imageview_loadingscreen);
        ((TextView) C1014.f6147.findViewById(R.id.textView1)).setText(C1014.m1827());
        imageView.setImageBitmap(this.f522);
        this.f521[0] = true;
    }
}
