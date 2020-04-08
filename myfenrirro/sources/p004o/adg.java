package p004o;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.adg */
class adg implements OnClickListener {

    /* renamed from: 櫯 */
    final /* synthetic */ adc f360;

    /* renamed from: 鷭 */
    final /* synthetic */ boolean f361;

    adg(adc adc, boolean z) {
        this.f360 = adc;
        this.f361 = z;
    }

    public final void onClick(View view) {
        if (this.f361) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setDataAndType(this.f360.f353, "*/*");
            this.f360.f352.startActivity(intent);
        }
    }
}
