package p004o;

import android.support.p000v4.view.ViewPager.OnPageChangeListener;

/* renamed from: o.ꍀ */
class C1876 implements OnPageChangeListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1842 f8466;

    C1876(C1842 r1) {
        this.f8466 = r1;
    }

    public final void onPageSelected(int i) {
        C1291 r2 = (C1291) ((C0185ai) this.f8466.f8433.getAdapter()).f384.get(i);
        this.f8466.f8434 = r2.f6469;
        this.f8466.mo4535(i);
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }

    public final void onPageScrollStateChanged(int i) {
    }
}
