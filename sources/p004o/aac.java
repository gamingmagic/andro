package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.lang.ref.WeakReference;

/* renamed from: o.aac */
class aac implements OnClickListener {

    /* renamed from: ˮ͈ */
    final /* synthetic */ boolean f117;

    /* renamed from: 櫯 */
    final /* synthetic */ WeakReference f118;

    /* renamed from: 鷭 */
    final /* synthetic */ aag f119 = null;

    aac(aag aag, WeakReference weakReference, boolean z) {
        this.f118 = weakReference;
        this.f117 = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C1013zz.m1821(abp.CrashManagerUserInputSend, this.f119, this.f118, this.f117);
    }
}
