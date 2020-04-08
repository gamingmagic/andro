package p004o;

import android.os.Parcelable;
import android.support.p000v4.view.PagerAdapter;
import android.support.p000v4.view.ViewPager;
import android.view.View;
import java.util.LinkedList;

/* renamed from: o.ai */
class C0185ai extends PagerAdapter {

    /* renamed from: 櫯 */
    LinkedList<C0186aj> f384 = new LinkedList<>();

    C0185ai(LinkedList<C0186aj> linkedList) {
        this.f384 = linkedList;
    }

    public int getCount() {
        return this.f384.size();
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public void destroyItem(View view, int i, Object obj) {
        ((ViewPager) view).removeView((View) obj);
    }

    public void finishUpdate(View view) {
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable saveState() {
        return null;
    }

    public void startUpdate(View view) {
    }

    public Object instantiateItem(View view, int i) {
        ((ViewPager) view).addView(((C0186aj) this.f384.get(i)).f385);
        return ((C0186aj) this.f384.get(i)).f385;
    }
}
