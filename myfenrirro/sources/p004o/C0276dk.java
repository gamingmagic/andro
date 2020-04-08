package p004o;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;

/* renamed from: o.dk */
class C0276dk implements Runnable {

    /* renamed from: 鷭 */
    final /* synthetic */ C0271df f736;

    C0276dk(C0271df dfVar) {
        this.f736 = dfVar;
    }

    public final void run() {
        try {
            PackageInfo packageInfo = C1014.f6147.getPackageManager().getPackageInfo(C1014.f6147.getPackageName(), 0);
            this.f736.f729.mo3652((C0839ue) new C0875vi(packageInfo.versionCode, packageInfo.versionName));
        } catch (NameNotFoundException unused) {
        }
        this.f736.f729.mo3652((C0839ue) new C0872vf(C1014.f6140.f4522));
        if (C1014.f6158 == null) {
            C1014 r0 = C1014.f6161;
            C1014.m1838();
        }
    }
}
