package p004o;

import android.view.View;
import android.view.View.OnClickListener;
import com.roworkshop.andro.c_activity;
import p004o.C0357fy.C0358;

/* renamed from: o.gc */
class C0363gc implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0357fy f997;

    C0363gc(C0357fy fyVar) {
        this.f997 = fyVar;
    }

    public final void onClick(View view) {
        C0357fy fyVar = this.f997;
        c_activity c_activity = (c_activity) fyVar.f1626.getContext();
        C0353fu fuVar = (C0353fu) fyVar.f971.getAdapter();
        if (fuVar != null && fuVar.f942 != null && fuVar.f942.length != 0) {
            if (fyVar.f979 == C0358.NPCSHOP_BUYFROMNPC) {
                int[] iArr = new int[fuVar.f942.length];
                int[] iArr2 = new int[fuVar.f942.length];
                for (int i = 0; i < iArr.length; i++) {
                    iArr[i] = fuVar.f942[i].f947.f8848;
                    iArr2[i] = fuVar.f942[i].f947.f8846;
                }
                C1014.f6144.mo3652((C0839ue) new C1940(iArr, iArr2));
                if (C1014.f6140.f4512) {
                    C1014.f6144.mo3652((C0839ue) new C1611());
                }
            } else if (fyVar.f979 == C0358.NPCSHOP_SELLTONPC) {
                int[] iArr3 = new int[fuVar.f942.length];
                int[] iArr4 = new int[fuVar.f942.length];
                for (int i2 = 0; i2 < iArr3.length; i2++) {
                    iArr3[i2] = fuVar.f942[i2].f953;
                    iArr4[i2] = fuVar.f942[i2].f947.f8846;
                }
                C1014.f6144.mo3652((C0839ue) new C1050(iArr3, iArr4));
                if (C1014.f6140.f4512) {
                    C1014.f6144.mo3652((C0839ue) new C1611());
                }
            } else if (fyVar.f979 == C0358.VENDING) {
                int[] iArr5 = new int[fuVar.f942.length];
                int[] iArr6 = new int[fuVar.f942.length];
                for (int i3 = 0; i3 < iArr5.length; i3++) {
                    iArr5[i3] = fuVar.f942[i3].f953;
                    iArr6[i3] = fuVar.f942[i3].f947.f8846;
                }
                C1014.f6144.mo3652((C0839ue) new C1419(fyVar.f965, fyVar.f978, iArr5, iArr6));
            } else if (fyVar.f979 == C0358.CASHSHOP) {
                if (C1014.f6140.f4528) {
                    int[] iArr7 = new int[fuVar.f942.length];
                    int[] iArr8 = new int[fuVar.f942.length];
                    for (int i4 = 0; i4 < iArr7.length; i4++) {
                        iArr7[i4] = fuVar.f942[i4].f947.f8848;
                        iArr8[i4] = fuVar.f942[i4].f947.f8846;
                    }
                    C1014.f6144.mo3652((C0839ue) new C1035(iArr7, iArr8));
                } else {
                    C1014.f6144.mo3652((C0839ue) new C1437(fuVar.f942[0].f947.f8848, (short) fuVar.f942[0].f947.f8846, 0));
                }
            } else if (fyVar.f979 == C0358.CHANGE_MATERIAL) {
                int[] iArr9 = new int[fuVar.f942.length];
                int[] iArr10 = new int[fuVar.f942.length];
                for (int i5 = 0; i5 < fuVar.f942.length; i5++) {
                    iArr10[i5] = fuVar.f942[i5].f953 + 2;
                    iArr9[i5] = fuVar.f942[i5].f947.f8846;
                }
                C1014.f6144.mo3652((C0839ue) new C1937(iArr9, fyVar.f970, 1, iArr10));
            }
            c_activity.f51.f1412.removeView(fyVar.f1626);
        }
    }
}
