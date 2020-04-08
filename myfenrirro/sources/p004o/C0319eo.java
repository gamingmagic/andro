package p004o;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import p004o.C0643pc.C0650;
import p004o.C0643pc.aux;

/* renamed from: o.eo */
class C0319eo implements OnItemClickListener {
    /* access modifiers changed from: 0000 */

    /* renamed from: 鷭 */
    public final /* synthetic */ C0317em f868;

    C0319eo(C0317em emVar) {
        this.f868 = emVar;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0650 r3 = this.f868.f866[i];
        String iSO3Country = this.f868.f863.getResources().getConfiguration().locale.getISO3Country();
        if (r3.f4443 != aux.iRO_Renewal || iSO3Country.equals("USA")) {
            this.f868.mo3685(r3);
            return;
        }
        Builder builder = new Builder(this.f868.f863);
        builder.setMessage("Non-USA users may have problems while registering on this server. If you're having such problems, please choose a different server\n");
        builder.setPositiveButton("Ok", new C0320ep(this, r3));
        builder.setNegativeButton("Cancel", null);
        builder.show();
    }
}
