package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.lang.ref.WeakReference;

/* renamed from: o.aab */
class aab implements OnClickListener {

    /* renamed from: ˮ͈ */
    final /* synthetic */ boolean f114;

    /* renamed from: 櫯 */
    final /* synthetic */ WeakReference f115;

    /* renamed from: 鷭 */
    final /* synthetic */ aag f116 = null;

    aab(aag aag, WeakReference weakReference, boolean z) {
        this.f115 = weakReference;
        this.f114 = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C1013zz.m1821(abp.CrashManagerUserInputAlwaysSend, this.f116, this.f115, this.f114);
    }
}
