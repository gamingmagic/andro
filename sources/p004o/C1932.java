package p004o;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.딐 */
class C1932 implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1629 f8716;

    C1932(C1629 r1) {
        this.f8716 = r1;
    }

    public final void onClick(View view) {
        C1629 r9 = this.f8716;
        C1379[] r2 = r9.mo4420();
        int[] iArr = new int[r2.length];
        int[] iArr2 = new int[r2.length];
        int[] iArr3 = new int[r2.length];
        int i = 0;
        for (int i2 = 0; i2 < r2.length; i2++) {
            iArr[i2] = r2[i2].f6946;
            iArr2[i2] = r2[i2].f6944;
            iArr3[i2] = r2[i2].f6943;
            i += r2[i2].f6945 * r2[i2].f6944;
        }
        C1014.f6144.mo3652((C0839ue) new C1788(iArr, iArr2, iArr3, Math.min(C1014.f6152.f7978.f6455, i)));
        r9.mo3538();
    }
}
