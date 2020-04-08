package p004o;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import com.libroserver.apk.R;

/* renamed from: o.kj */
class C0496kj implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0456 f1538;

    C0496kj(C0456 r1) {
        this.f1538 = r1;
    }

    public final void onClick(View view) {
        C0456 r7 = this.f1538;
        TextView textView = (TextView) r7.f1471.findViewById(R.id.edit_text);
        String charSequence = textView.getText().toString();
        if (charSequence.length() != 0) {
            if (r7.f1470) {
                int i = -1;
                try {
                    i = Integer.parseInt(charSequence);
                } catch (NumberFormatException unused) {
                }
                if (i < 0) {
                    Toast.makeText(C1014.f6147, "Please input a valid number", 0).show();
                    return;
                }
                C1014.f6144.mo3652((C0839ue) new C1048(i, r7.f1469));
            } else {
                C1014.f6144.mo3652((C0839ue) new C1051(charSequence, r7.f1469));
            }
            textView.setText("");
            r7.f1471.dismiss();
        }
    }
}
