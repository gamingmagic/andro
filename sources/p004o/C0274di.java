package p004o;

import android.app.AlertDialog.Builder;
import p004o.C1782.C1785;

/* renamed from: o.di */
class C0274di implements C1785 {

    /* renamed from: 鷭 */
    final /* synthetic */ C0271df f732;

    C0274di(C0271df dfVar) {
        this.f732 = dfVar;
    }

    /* renamed from: 鷭 */
    public final void mo3641(C1375 r4, C1530 r5) {
        if (!this.f732.f727) {
            throw new IllegalStateException("Not purchasing anything, yet received IabPurchaseFinished. Where this result could come from..?");
        }
        this.f732.f727 = false;
        if (!(r4.f6936 == 0)) {
            C0592ns.m674("Error while purchasing: " + r4.f6935);
            new Builder(C1014.f6147).setMessage("Purchase failed: " + r4.f6935).show();
            C1014.f6147.mo3387((Runnable) new C0473jm(C1014.f6147.f51));
            return;
        }
        this.f732.mo3639(r5);
    }
}
