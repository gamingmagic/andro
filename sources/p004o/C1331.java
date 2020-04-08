package p004o;

import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.GridView;
import android.widget.RelativeLayout.LayoutParams;
import com.libroserver.apk.R;

/* renamed from: o.ટ */
final class C1331 extends C0519ld {

    /* renamed from: ˮ͈ */
    OnItemLongClickListener f6856 = new C1832(this);

    /* renamed from: 櫯 */
    OnItemClickListener f6857 = new C1295(this);

    /* renamed from: 鷭 */
    GridView f6858 = ((GridView) this.f1626.findViewById(R.id.gridView1));

    C1331() {
        super(R.layout.emotion);
        this.f6858.setOnItemClickListener(this.f6857);
        this.f6858.setOnItemLongClickListener(this.f6856);
    }

    /* renamed from: ȃ */
    public final void mo3546() {
        LayoutParams layoutParams = (LayoutParams) this.f1626.getLayoutParams();
        layoutParams.addRule(2, R.id.imageview_chat);
        this.f1626.setLayoutParams(layoutParams);
        this.f6858.setAdapter(new C1736());
    }

    /* renamed from: Ą */
    public final void mo3544() {
        this.f6858.setAdapter(null);
    }
}
