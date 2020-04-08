package p004o;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: o.ku */
class C0508ku implements Runnable {

    /* renamed from: 櫯 */
    private final /* synthetic */ C0405hk f1582;

    /* renamed from: 鷭 */
    final /* synthetic */ C0507kt f1583;

    C0508ku(C0507kt ktVar, C0405hk hkVar) {
        this.f1583 = ktVar;
        this.f1582 = hkVar;
    }

    public final void run() {
        ImageView imageView = this.f1583.f1581.f1550;
        C0252cp cpVar = C1014.f6158;
        imageView.setImageBitmap(Bitmap.createScaledBitmap(C0252cp.m268(this.f1582), this.f1583.f1581.f1565.x, this.f1583.f1581.f1565.y, false));
    }
}
