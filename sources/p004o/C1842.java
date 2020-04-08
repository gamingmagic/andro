package p004o;

import android.support.p000v4.view.ViewPager;
import android.support.p000v4.view.ViewPager.OnPageChangeListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.libroserver.apk.R;
import com.roworkshop.andro.c_activity;
import java.util.LinkedList;

/* renamed from: o.魘 */
final class C1842 extends C0519ld {

    /* renamed from: Ą */
    TextView f8429 = ((TextView) this.f1626.findViewById(R.id.textView3));

    /* renamed from: ą */
    OnPageChangeListener f8430 = new C1876(this);

    /* renamed from: ȃ */
    TextView f8431 = ((TextView) this.f1626.findViewById(R.id.textView2));

    /* renamed from: ˮ͈ */
    TextView f8432 = ((TextView) this.f1626.findViewById(R.id.textView1));

    /* renamed from: 櫯 */
    ViewPager f8433 = ((ViewPager) this.f1626.findViewById(R.id.viewpager));

    /* renamed from: 鷭 */
    C0572mz f8434;

    C1842() {
        super(R.layout.inventory2);
        this.f8433.setOnPageChangeListener(this.f8430);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4535(int i) {
        this.f8432.setText(((C1291) ((C0185ai) this.f8433.getAdapter()).f384.get(i)).f6469.name());
        if (i > 0) {
            this.f8429.setVisibility(0);
            this.f8429.setText(((C1291) ((C0185ai) this.f8433.getAdapter()).f384.get(i - 1)).f6469.name());
        } else {
            this.f8429.setVisibility(4);
        }
        if (i < this.f8433.getAdapter().getCount() - 1) {
            this.f8431.setVisibility(0);
            this.f8431.setText(((C1291) ((C0185ai) this.f8433.getAdapter()).f384.get(i + 1)).f6469.name());
            return;
        }
        this.f8431.setVisibility(4);
    }

    /* renamed from: ȃ */
    private int m2508(C0572mz mzVar) {
        if (this.f8433.getAdapter() == null) {
            return -1;
        }
        for (int i = 0; i < this.f8433.getAdapter().getCount(); i++) {
            if (((C1291) ((C0185ai) this.f8433.getAdapter()).f384.get(i)).f6469 == mzVar) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final C1291 mo4534(C0572mz mzVar) {
        for (int i = 0; i < this.f8433.getAdapter().getCount(); i++) {
            C1291 r2 = (C1291) ((C0185ai) this.f8433.getAdapter()).f384.get(i);
            if (r2.f6469 == mzVar) {
                return r2;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final void mo4533(C0572mz mzVar) {
        if (this.f1626.getParent() != null) {
            C1291 r2 = null;
            if (mzVar != null) {
                r2 = mo4534(mzVar);
            }
            if (r2 == null) {
                mo4531();
            } else {
                r2.f6468.setAdapter(new C1516(mzVar));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Ć */
    public final void mo4531() {
        if (this.f1626.getParent() != null) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(new C1291(C0572mz.USABLE));
            linkedList.add(new C1291(C0572mz.EQUIP));
            linkedList.add(new C1291(C0572mz.ETC));
            C1301 r3 = C1014.f6137.f1636;
            if (r3.f8640.containsKey(C0586nm.ON_PUSH_CART) || (r3.f8646 & 1928) > 0) {
                linkedList.add(new C1880());
            }
            this.f8433.setAdapter(new C0185ai(linkedList));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4536(C1472 r2) {
        if (this.f1626.getParent() != null) {
            mo4533(C0572mz.m662(r2));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˮ͈ */
    public final void mo4532(C0572mz mzVar) {
        if (this.f8434 != mzVar) {
            this.f8434 = mzVar;
            int r3 = m2508(mzVar);
            if (r3 != -1) {
                this.f8433.setCurrentItem(r3, false);
            }
        }
    }

    /* renamed from: ȃ */
    public final void mo3546() {
        mo4531();
        mo4535(0);
        int r3 = m2508(this.f8434);
        if (r3 != -1) {
            this.f8433.setCurrentItem(r3, false);
        }
        c_activity c_activity = C1014.f6147;
        ((ImageView) C1014.f6147.findViewById(R.id.imageview_inventory)).setImageBitmap(C1014.f6147.f51.f1423[1]);
    }

    /* renamed from: Ą */
    public final void mo3544() {
        this.f8433.setAdapter(null);
        c_activity c_activity = C1014.f6147;
        ((ImageView) C1014.f6147.findViewById(R.id.imageview_inventory)).setImageBitmap(C1014.f6147.f51.f1423[0]);
    }
}
