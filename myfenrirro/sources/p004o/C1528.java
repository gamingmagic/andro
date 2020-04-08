package p004o;

import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import com.libroserver.apk.R;

/* renamed from: o.冱 */
public final class C1528 extends C0519ld {

    /* renamed from: ˮ͈ */
    private OnItemClickListener f7282 = new C1918(this);

    /* renamed from: 櫯 */
    public C0597nx f7283;

    /* renamed from: 鷭 */
    ListView f7284 = ((ListView) this.f1626.findViewById(R.id.listView1));

    C1528() {
        super(R.layout.magnifier);
        this.f7284.setOnItemClickListener(this.f7282);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ą */
    public final void mo3948() {
        LayoutParams layoutParams = (LayoutParams) this.f1626.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.addRule(13);
            this.f1626.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: ȃ */
    public final void mo3546() {
        LayoutParams layoutParams = (LayoutParams) this.f1626.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.addRule(13);
            this.f1626.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: Ą */
    public final void mo3544() {
    }
}
