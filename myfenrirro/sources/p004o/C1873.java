package p004o;

import android.os.Parcelable;
import android.support.p000v4.view.PagerAdapter;
import android.support.p000v4.view.ViewPager;
import android.view.View;

/* renamed from: o.ꆞ */
final class C1873 extends PagerAdapter {

    /* renamed from: 鷭 */
    C2041[] f8462;

    C1873(C2041[] r1) {
        this.f8462 = r1;
    }

    public final int getCount() {
        return this.f8462.length;
    }

    public final void destroyItem(View view, int i, Object obj) {
        ((ViewPager) view).removeView((View) obj);
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public final void finishUpdate(View view) {
    }

    public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public final Parcelable saveState() {
        return null;
    }

    public final void startUpdate(View view) {
    }

    public final Object instantiateItem(View view, int i) {
        ((ViewPager) view).addView(this.f8462[i].f8943);
        return this.f8462[i].f8943;
    }
}
