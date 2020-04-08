package p004o;

import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import com.libroserver.apk.R;

/* renamed from: o.d */
final class C0265d extends C0499km {

    /* renamed from: Ą */
    OnClickListener f709 = new C0295e(this);

    /* renamed from: ą */
    OnClickListener f710 = new C0332f(this);

    /* renamed from: ȃ */
    int f711;

    /* renamed from: ˮ͈ */
    Button f712;

    /* renamed from: 櫯 */
    Button f713;

    /* renamed from: 鷭 */
    LinearLayout f714;

    C0265d(LayoutInflater layoutInflater) {
        this.f714 = (LinearLayout) layoutInflater.inflate(R.layout.npcbuysell, null);
        this.f713 = (Button) this.f714.findViewById(R.id.button1);
        this.f712 = (Button) this.f714.findViewById(R.id.button2);
        this.f713.setOnClickListener(this.f709);
        this.f712.setOnClickListener(this.f710);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h_ */
    public final void mo3537h_() {
        if (!(this.f714.getParent() != null)) {
            C1014.f6147.f51.f1412.addView(this.f714);
            C1014.f6147.f51.f1434.push(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final boolean mo3539() {
        return this.f714.getParent() != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˮ͈ */
    public final void mo3538() {
        if (this.f714.getParent() != null) {
            C1014.f6147.f51.f1434.remove(this);
            C1014.f6147.f51.f1412.removeView(this.f714);
            if (C1014.f6140.f4512) {
                C1014.f6144.mo3652((C0839ue) new C1611());
            }
        }
    }
}
