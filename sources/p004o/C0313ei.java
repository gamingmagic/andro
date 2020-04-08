package p004o;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.io.File;

/* renamed from: o.ei */
class C0313ei implements OnItemClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0312eh f855;

    C0313ei(C0312eh ehVar) {
        this.f855 = ehVar;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0312eh ehVar = this.f855;
        int i2 = i;
        ehVar.mo3679(ehVar.f852[i2].equals("..") ? ehVar.f853.getParentFile() : new File(ehVar.f853 + File.separator + ehVar.f852[i2]), false);
    }
}
