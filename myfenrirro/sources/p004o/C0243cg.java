package p004o;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: o.cg */
class C0243cg implements OnItemClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0241cf f583;

    C0243cg(C0241cf cfVar) {
        this.f583 = cfVar;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0240[] r3;
        C0242 r6 = (C0242) this.f583.f576.getAdapter().getItem(i);
        Builder builder = new Builder(C1014.f6147);
        builder.setIcon(r6.f579.getDrawable());
        builder.setTitle(r6.f580.f4667);
        String sb = new StringBuilder(String.valueOf(r6.f580.f4664[0])).append(r6.f580.f4664[1]).append("^000000").toString();
        if (r6.f581.f562 != null) {
            for (C0240 r62 : r6.f581.f562) {
                if (!(r62.f570 == null || r62.f574 == 0)) {
                    if (r62.f570 == null) {
                        C1014.f6158.f674.f626.f1638.get(Integer.valueOf(r62.f574));
                    }
                    sb = new StringBuilder(String.valueOf(sb)).append("\n").append(r62.f570).append(": ").append(r62.f573).append("/").append(r62.f572).toString();
                }
            }
        }
        builder.setMessage(C0453ix.m483(sb, true));
        builder.show();
    }
}
