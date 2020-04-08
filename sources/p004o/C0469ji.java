package p004o;

import android.app.AlertDialog.Builder;
import android.view.ViewGroup;

/* renamed from: o.ji */
class C0469ji implements Runnable {

    /* renamed from: Ą */
    private final /* synthetic */ int f1490;

    /* renamed from: ȃ */
    private final /* synthetic */ int f1491;

    /* renamed from: ˮ͈ */
    private final /* synthetic */ String f1492;

    /* renamed from: 櫯 */
    private final /* synthetic */ String f1493;

    /* renamed from: 鷭 */
    final /* synthetic */ C0453ix f1494;

    C0469ji(C0453ix ixVar, String str, String str2, int i, int i2) {
        this.f1494 = ixVar;
        this.f1493 = str;
        this.f1492 = str2;
        this.f1491 = i;
        this.f1490 = i2;
    }

    public final void run() {
        if (this.f1494.f1370 == null) {
            Builder builder = new Builder(C1014.f6147);
            if (this.f1494.f1448.f1478.getParent() != null) {
                ((ViewGroup) this.f1494.f1448.f1478.getParent()).removeView(this.f1494.f1448.f1478);
            }
            builder.setView(this.f1494.f1448.f1478);
            builder.setPositiveButton("Cancel", new C0470jj(this));
            builder.setCancelable(false);
            this.f1494.f1370 = builder.show();
            this.f1494.f1448.f1475.setMax(100);
            this.f1494.f1448.f1473.setMax(100);
            this.f1494.f1448.f1475.setVisibility(0);
            this.f1494.f1448.f1475.setVisibility(0);
        }
        this.f1494.f1448.f1477.setText(this.f1493);
        this.f1494.f1448.f1476.setText(this.f1492);
        if (this.f1491 != -1) {
            this.f1494.f1448.f1475.setProgress(this.f1491);
        } else {
            this.f1494.f1448.f1475.setVisibility(8);
        }
        if (this.f1490 != -1) {
            this.f1494.f1448.f1473.setProgress(this.f1490);
        } else {
            this.f1494.f1448.f1473.setVisibility(8);
        }
    }
}
