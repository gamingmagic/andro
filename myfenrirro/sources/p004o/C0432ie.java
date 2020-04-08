package p004o;

import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.GridView;
import com.libroserver.apk.R;

/* renamed from: o.ie */
final class C0432ie extends C0186aj {

    /* renamed from: ȃ */
    private OnItemLongClickListener f1274;

    /* renamed from: ˮ͈ */
    private OnItemClickListener f1275;

    /* renamed from: 櫯 */
    GridView f1276;

    /* renamed from: 鷭 */
    C0572mz f1277;

    @Deprecated
    private C0432ie(int i, C0572mz mzVar) {
        super(R.layout.inventory_pager_item);
        this.f1275 = new C0434ig(this);
        this.f1274 = new C0435ih(this);
        this.f1277 = mzVar;
        this.f1276 = (GridView) this.f385.findViewById(R.id.gridView1);
        this.f1276.setAdapter(new C0431id(this.f1277));
        this.f1276.setOnItemClickListener(this.f1275);
        this.f1276.setOnItemLongClickListener(this.f1274);
    }

    C0432ie(C0572mz mzVar) {
        this(R.layout.inventory_pager_item, mzVar);
    }
}
