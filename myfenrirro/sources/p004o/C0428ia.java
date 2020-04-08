package p004o;

import android.app.ProgressDialog;
import com.roworkshop.andro.c_activity;

/* renamed from: o.ia */
public class C0428ia implements Runnable {

    /* renamed from: Ą */
    private final /* synthetic */ String f1236;

    /* renamed from: ą */
    private final /* synthetic */ String f1237;

    /* renamed from: ȃ */
    private final /* synthetic */ long f1238;

    /* renamed from: ˮ͈ */
    private final /* synthetic */ long f1239;

    /* renamed from: 櫯 */
    private final /* synthetic */ ProgressDialog f1240;

    /* renamed from: 鷭 */
    final /* synthetic */ C0421hu f1241;

    public C0428ia(C0421hu huVar, ProgressDialog progressDialog, long j, long j2, String str, String str2) {
        this.f1241 = huVar;
        this.f1240 = progressDialog;
        this.f1239 = j;
        this.f1238 = j2;
        this.f1236 = str;
        this.f1237 = str2;
    }

    public final void run() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f1240.isShowing()) {
            if (currentTimeMillis < this.f1239 + this.f1238) {
                this.f1240.setProgress((int) (currentTimeMillis - this.f1239));
                c_activity c_activity = this.f1241.f1226;
                if (c_activity.f56 != null) {
                    c_activity.f56.postDelayed(new C1348(c_activity, this), 30);
                }
                return;
            }
            this.f1240.setProgress((int) this.f1238);
            this.f1240.dismiss();
            C0421hu huVar = this.f1241;
            String str = this.f1236;
            String str2 = this.f1237;
            if (C0595nv.f2876 == null) {
                C0595nv.f2876 = new C0205ba(null, false, false, str, str2, null);
            }
            huVar.f1226.mo3385();
        }
    }
}
