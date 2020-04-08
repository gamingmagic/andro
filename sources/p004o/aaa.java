package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.lang.ref.WeakReference;

/* renamed from: o.aaa */
class aaa implements OnClickListener {

    /* renamed from: ˮ͈ */
    final /* synthetic */ boolean f111;

    /* renamed from: 櫯 */
    final /* synthetic */ WeakReference f112;

    /* renamed from: 鷭 */
    final /* synthetic */ aag f113 = null;

    aaa(aag aag, WeakReference weakReference, boolean z) {
        this.f112 = weakReference;
        this.f111 = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C1013zz.m1821(abp.CrashManagerUserInputDontSend, this.f113, this.f112, this.f111);
    }
}
