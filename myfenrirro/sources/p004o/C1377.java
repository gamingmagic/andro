package p004o;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.Ἆ */
class C1377 implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1907 f6937;

    C1377(C1907 r1) {
        this.f6937 = r1;
    }

    public final void onClick(View view) {
        C1907 r0 = this.f6937;
        C0252cp cpVar = C1014.f6158;
        C1761 r1 = C1014.f6140.f4489 ? this.f6937.f8587.isChecked() ? C1761.SUMMONER : C1761.NOVICE : C1761.NOVICE;
        r0.f8579 = C0247ck.m239(r1, this.f6937.f8579 - 1);
        this.f6937.mo4565();
    }
}
