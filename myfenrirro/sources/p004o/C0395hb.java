package p004o;

import android.graphics.Bitmap;

/* renamed from: o.hb */
class C0395hb implements Runnable {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ String f1117;

    /* renamed from: 櫯 */
    private final /* synthetic */ Bitmap f1118;

    /* renamed from: 鷭 */
    final /* synthetic */ C0394ha f1119;

    C0395hb(C0394ha haVar, Bitmap bitmap, String str) {
        this.f1119 = haVar;
        this.f1118 = bitmap;
        this.f1117 = str;
    }

    public final void run() {
        this.f1119.f1116.f1101 = this.f1118;
        this.f1119.f1116.f1095.setImageBitmap(this.f1118);
        C1014.f6147.f51.f1425.put(this.f1117, this.f1118);
    }
}
