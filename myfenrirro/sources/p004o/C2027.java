package p004o;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import com.libroserver.apk.R;

/* renamed from: o.캤 */
final class C2027 extends C0519ld {

    /* renamed from: Ą */
    OnClickListener f8917 = new C2007(this);

    /* renamed from: ȃ */
    OnItemClickListener f8918 = new C1378(this);

    /* renamed from: ˮ͈ */
    int f8919;

    /* renamed from: 櫯 */
    AlertDialog f8920;

    /* renamed from: 鷭 */
    ListView f8921 = ((ListView) this.f1626.findViewById(R.id.listView1));

    C2027() {
        super(R.layout.friends);
        this.f8921.setOnItemClickListener(this.f8918);
        Builder builder = new Builder(C1014.f6147);
        builder.setTitle(null);
        builder.setItems(new String[]{"Message", "Delete"}, this.f8917);
        this.f8920 = builder.create();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4624(boolean z) {
        if (this.f1626.getParent() != null) {
            if (z) {
                C1982 r5 = (C1982) this.f8921.getAdapter();
                for (int i = 0; i < r5.getCount(); i++) {
                    C1582 r3 = (C1582) r5.getItem(i);
                    if (r3.f7493 != null) {
                        r3.f7493.setChecked(r3.f7495.f7649);
                    }
                }
                return;
            }
            this.f8921.setAdapter(new C1982());
        }
    }

    /* renamed from: ȃ */
    public final void mo3546() {
        LayoutParams layoutParams = (LayoutParams) this.f1626.getLayoutParams();
        layoutParams.addRule(2, R.id.imageview_chat);
        this.f1626.setLayoutParams(layoutParams);
        mo4624(false);
    }

    /* renamed from: Ą */
    public final void mo3544() {
        this.f8921.setAdapter(null);
    }
}
