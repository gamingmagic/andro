package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;

/* renamed from: o.즸 */
class C2007 implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C2027 f8875;

    C2007(C2027 r1) {
        this.f8875 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C2027 r6 = this.f8875;
        C1582 r4 = (C1582) r6.f8921.getAdapter().getItem(r6.f8919);
        if (r4 != null) {
            switch (i) {
                case 0:
                    if (!r4.f7495.f7649) {
                        Toast.makeText(C1014.f6147, new StringBuilder(String.valueOf((String) C1014.f6152.f7977.get(Integer.valueOf(r4.f7495.f7650)))).append(" is offline.").toString(), 1).show();
                        return;
                    }
                    r6.mo3538();
                    C1014.f6147.f51.f1427.mo3537h_();
                    C1014.f6147.f51.f1427.f8027.setText((CharSequence) C1014.f6152.f7977.get(Integer.valueOf(r4.f7495.f7650)));
                    return;
                case 1:
                    C1014.f6144.mo3652((C0839ue) new C1777(r4.f7495.f7651, r4.f7495.f7650));
                    break;
            }
        }
    }
}
