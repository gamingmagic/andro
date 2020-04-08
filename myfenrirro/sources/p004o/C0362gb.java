package p004o;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.roworkshop.andro.c_activity;

/* renamed from: o.gb */
class C0362gb implements OnItemClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0357fy f996;

    C0362gb(C0357fy fyVar) {
        this.f996 = fyVar;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0357fy fyVar = this.f996;
        int i2 = i;
        c_activity c_activity = (c_activity) fyVar.f1626.getContext();
        C0353fu fuVar = (C0353fu) fyVar.f977.getAdapter();
        C0353fu fuVar2 = (C0353fu) fyVar.f971.getAdapter();
        C0354fv fvVar = fuVar2.f942[i2];
        C0354fv fvVar2 = null;
        C0354fv[] fvVarArr = fuVar.f942;
        int length = fvVarArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            C0354fv fvVar3 = fvVarArr[i3];
            if ((fvVar.f947.mo4608() || fvVar3.f947.f8846 <= 0) && fvVar3.f947.mo4616(fvVar.f947)) {
                fvVar2 = fvVar3;
                break;
            }
            i3++;
        }
        if (fvVar2 != null) {
            fyVar.f974 -= fvVar.f949 * fvVar.f947.f8846;
            fyVar.mo3727();
            if (fvVar2.f947.f8846 != -1) {
                fvVar2.f947.f8846 += fvVar.f947.f8846;
                fvVar2.mo3723(fvVar2.f944);
            }
            if (fuVar2.f942.length == 1) {
                fyVar.f971.setAdapter(null);
                return;
            }
            fuVar2.f942[i2] = null;
            C0354fv[] fvVarArr2 = new C0354fv[(fuVar2.f942.length - 1)];
            int i4 = 0;
            for (int i5 = 0; i5 < fuVar2.f942.length; i5++) {
                if (fuVar2.f942[i5] != null) {
                    int i6 = i4;
                    i4++;
                    fvVarArr2[i6] = fuVar2.f942[i5];
                }
            }
            fyVar.f971.setAdapter(new C0353fu(c_activity, fvVarArr2));
        }
    }
}
