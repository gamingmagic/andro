package p004o;

import android.graphics.Bitmap;
import com.roworkshop.andro.c_activity;

/* renamed from: o.fx */
class C0356fx implements Runnable {

    /* renamed from: ȃ */
    private final /* synthetic */ String f957;

    /* renamed from: ˮ͈ */
    private final /* synthetic */ c_activity f958;

    /* renamed from: 櫯 */
    private final /* synthetic */ Bitmap f959;

    /* renamed from: 鷭 */
    final /* synthetic */ C0355fw f960;

    C0356fx(C0355fw fwVar, Bitmap bitmap, c_activity c_activity, String str) {
        this.f960 = fwVar;
        this.f959 = bitmap;
        this.f958 = c_activity;
        this.f957 = str;
    }

    public final void run() {
        this.f960.f956.f943 = this.f959;
        if (this.f960.f956.f951 != null) {
            this.f960.f956.f951.setImageBitmap(this.f959);
        }
        this.f958.f51.f1425.put(this.f957, this.f959);
    }
}
