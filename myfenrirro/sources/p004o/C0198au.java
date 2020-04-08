package p004o;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: o.au */
class C0198au implements OnItemClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0197at f426;

    C0198au(C0197at atVar) {
        this.f426 = atVar;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0197at atVar = this.f426;
        C0203az azVar = (C0203az) atVar.f424.getAdapter().getItem(i);
        if (azVar.f434.f398 == C1014.f6137.f1636.f1630) {
            Builder builder = new Builder(C1014.f6147);
            builder.setTitle(null).setMessage(null);
            String[] strArr = new String[1];
            C0252cp cpVar = C1014.f6158;
            String r8 = C1014.f6160.mo3796(97);
            strArr[0] = r8 == null ? "MSG97" : r8;
            builder.setItems(strArr, new C0199av(atVar));
            builder.show();
            return;
        }
        if (C1014.f6137.f1636.mo4291()) {
            Builder builder2 = new Builder(C1014.f6147);
            builder2.setTitle(null).setMessage(null);
            String[] strArr2 = new String[2];
            C0252cp cpVar2 = C1014.f6158;
            String r82 = C1014.f6160.mo3796(1533);
            strArr2[0] = r82 == null ? "MSG1533" : r82;
            C0252cp cpVar3 = C1014.f6158;
            String r83 = C1014.f6160.mo3796(98);
            strArr2[1] = r83 == null ? "MSG98" : r83;
            builder2.setItems(strArr2, new C0200aw(atVar, azVar));
            builder2.show();
        }
    }
}
