package p004o;

import android.support.p000v4.view.ViewPager;
import android.widget.TextView;
import com.libroserver.apk.R;
import java.util.LinkedList;

/* renamed from: o.ii */
final class C0436ii extends C0519ld {

    /* renamed from: 櫯 */
    ViewPager f1292 = ((ViewPager) this.f1626.findViewById(R.id.viewpager));

    /* renamed from: 鷭 */
    TextView f1293 = ((TextView) this.f1626.findViewById(R.id.textView1));

    C0436ii() {
        super(R.layout.storage2);
    }

    /* renamed from: ȃ */
    public final void mo3546() {
        mo3950();
        LinkedList linkedList = new LinkedList();
        linkedList.add(new C0432ie(C0572mz.USABLE));
        linkedList.add(new C0432ie(C0572mz.EQUIP));
        linkedList.add(new C0432ie(C0572mz.ETC));
        this.f1292.setAdapter(new C0185ai(linkedList));
    }

    /* renamed from: Ą */
    public final void mo3544() {
    }

    /* renamed from: 櫯 */
    private C0432ie m446(C0572mz mzVar) {
        C0185ai aiVar = (C0185ai) this.f1292.getAdapter();
        if (aiVar == null) {
            return null;
        }
        for (int i = 0; i < aiVar.getCount(); i++) {
            C0432ie ieVar = (C0432ie) aiVar.f384.get(i);
            if (ieVar.f1277 == mzVar) {
                return ieVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3828(C0572mz mzVar) {
        while (true) {
            if (this.f1626.getParent() != null) {
                if (mzVar == null) {
                    mo3828(C0572mz.USABLE);
                    mo3828(C0572mz.EQUIP);
                    mzVar = C0572mz.ETC;
                } else {
                    C0432ie r2 = m446(mzVar);
                    if (r2 != null) {
                        r2.f1276.setAdapter(new C0431id(mzVar));
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
    }
}
