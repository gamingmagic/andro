package p004o;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import p004o.C0357fy.C0358;

/* renamed from: o.ga */
class C0361ga implements OnItemClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0357fy f995;

    C0361ga(C0357fy fyVar) {
        this.f995 = fyVar;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0353fu fuVar = (C0353fu) this.f995.f977.getAdapter();
        C0353fu fuVar2 = (C0353fu) this.f995.f971.getAdapter();
        if (!C1014.f6140.f4528 && this.f995.f979 == C0358.CASHSHOP && fuVar2 != null && fuVar2.f942 != null && fuVar2.f942.length > 0) {
            return;
        }
        if (!fuVar.f942[i].f947.mo4608() || !this.f995.f972.isChecked()) {
            this.f995.mo3728(i, -1);
            return;
        }
        C0357fy fyVar = this.f995;
        int i2 = i;
        C0353fu fuVar3 = (C0353fu) fyVar.f977.getAdapter();
        fyVar.f975 = i2;
        if (fyVar.f979 == C0358.NPCSHOP_BUYFROMNPC || fyVar.f979 == C0358.VENDING || fyVar.f979 == C0358.CASHSHOP) {
            C1695 r0 = fyVar.f980;
            r0.f7751.setText("Input [" + fuVar3.f942[i2].f945.getText() + "] amount to buy");
        } else if (fyVar.f979 == C0358.NPCSHOP_SELLTONPC || fyVar.f979 == C0358.CHANGE_MATERIAL) {
            C1695 r02 = fyVar.f980;
            r02.f7751.setText("Input [" + fuVar3.f942[i2].f945.getText() + "] amount to sell");
        } else {
            throw new C0588no();
        }
        fyVar.f980.mo3537h_();
    }
}
