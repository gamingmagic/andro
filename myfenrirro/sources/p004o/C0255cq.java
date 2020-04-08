package p004o;

import android.app.AlertDialog.Builder;
import org.apache.http.HttpHeaders;
import p004o.C0643pc.aux;

/* renamed from: o.cq */
class C0255cq implements Runnable {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ boolean[] f689;

    /* renamed from: 櫯 */
    private final /* synthetic */ boolean[] f690;

    /* renamed from: 鷭 */
    final /* synthetic */ C0252cp f691;

    C0255cq(C0252cp cpVar, boolean[] zArr, boolean[] zArr2) {
        this.f691 = cpVar;
        this.f690 = zArr;
        this.f689 = zArr2;
    }

    public final void run() {
        Builder builder = new Builder(C1014.f6147);
        builder.setCancelable(false);
        builder.setTitle(HttpHeaders.WARNING);
        builder.setMessage("Game client not found in:\n" + C0595nv.f2869 + "\n\nPress \"Ignore (slow!)\" to run the game and download resources in real-time (slow!)\nPress \"Download all\" to download the game client before starting (~" + (C1014.f6140.f4443 == aux.ClassicRONet ? "506 MB" : "2 GB") + ")");
        builder.setPositiveButton("Ignore", new C0256cr(this, this.f690));
        builder.setNegativeButton("Download all", new C0257cs(this, this.f690, this.f689));
        builder.show();
    }
}
