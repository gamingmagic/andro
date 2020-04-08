package p004o;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o.썋 */
class C1990 implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1907 f8828;

    C1990(C1907 r1) {
        this.f8828 = r1;
    }

    public final void onClick(View view) {
        short s;
        C1907 r20 = this.f8828;
        ArrayList r12 = ((C1909) C1904.this.f8550.getAdapter()).mo4566();
        short s2 = 0;
        while (true) {
            if (s2 >= 12) {
                s = -1;
                break;
            }
            boolean z = false;
            Iterator it = r12.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C1908) it.next()).f8598.f2895 == s2) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z) {
                s = s2;
                break;
            }
            s2 = (short) (s2 + 1);
        }
        if (s == -1) {
            Toast.makeText(C1014.f6147, "Failed to create character: no slots available", 1).show();
            return;
        }
        C0453ix ixVar = C1014.f6147.f51;
        String str = "Creating character";
        if (ixVar.f1370 != null) {
            C1014.f6147.mo3387((Runnable) new C0473jm(ixVar));
        }
        C1014.f6147.mo3387((Runnable) new C0471jk(ixVar, str));
        int progress = r20.f8586.getProgress() + 1;
        int i = 10 - progress;
        int progress2 = r20.f8590.getProgress() + 1;
        int i2 = 10 - progress2;
        int progress3 = r20.f8584.getProgress() + 1;
        int i3 = 10 - progress3;
        if (C1014.f6140.f4489) {
            C1428 r0 = C1014.f6144;
            String editable = r20.f8585.getText().toString();
            short s3 = s;
            int i4 = r20.f8591;
            int i5 = r20.f8579;
            C1761 r6 = C1014.f6140.f4489 ? r20.f8587.isChecked() ? C1761.SUMMONER : C1761.NOVICE : C1761.NOVICE;
            r0.mo3652((C0839ue) new C1094(editable, s3, i4, i5, r6, r20.f8593.isChecked() ? C1977.MALE : C1977.FEMALE));
        } else {
            C1014.f6144.mo3652((C0839ue) new C1215(r20.f8585.getText().toString(), (byte) s, (short) r20.f8579, (short) r20.f8591, i, i3, i2, progress, progress2, progress3));
        }
        ((InputMethodManager) C1014.f6147.getSystemService("input_method")).hideSoftInputFromWindow(r20.f8585.getWindowToken(), 0);
    }
}
