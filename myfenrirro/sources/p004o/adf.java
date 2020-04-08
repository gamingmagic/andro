package p004o;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.adf */
class adf implements OnClickListener {

    /* renamed from: 櫯 */
    final /* synthetic */ adc f358;

    /* renamed from: 鷭 */
    final /* synthetic */ boolean f359;

    adf(adc adc, boolean z) {
        this.f358 = adc;
        this.f359 = z;
    }

    public final void onClick(View view) {
        if (this.f359) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setDataAndType(this.f358.f353, "image/*");
            this.f358.f352.startActivity(intent);
        }
    }
}
