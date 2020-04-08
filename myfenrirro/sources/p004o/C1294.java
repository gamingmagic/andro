package p004o;

import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.view.View.OnKeyListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SlidingDrawer;
import android.widget.TextView;
import com.libroserver.apk.R;
import java.util.Iterator;

/* renamed from: o.Ҽ */
final class C1294 extends C0519ld {

    /* renamed from: Ą */
    private OnKeyListener f6474 = new C1649(this);

    /* renamed from: ȃ */
    Button f6475 = ((Button) this.f1626.findViewById(R.id.button1));

    /* renamed from: ˮ͈ */
    EditText f6476 = ((EditText) this.f1626.findViewById(R.id.editText1));

    /* renamed from: 櫯 */
    TextView f6477 = ((TextView) this.f1626.findViewById(R.id.textView1));

    /* renamed from: 鷭 */
    ListView f6478 = ((ListView) ((LinearLayout) ((SlidingDrawer) this.f1626.findViewById(R.id.slidingDrawer1)).findViewById(R.id.content)).findViewById(R.id.listView1));

    C1294() {
        super(R.layout.chatroom);
        this.f6475.setOnClickListener(new C1574(this));
        this.f6476.setOnKeyListener(this.f6474);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i_ */
    public final void mo4283i_() {
        if (this.f6476.getText() != null) {
            String trim = this.f6476.getText().toString().trim();
            if (trim.length() != 0) {
                C1014.f6144.mo3652((C0839ue) new C1667(C1014.f6137.f1636.f8657, trim));
                this.f6476.setText(null);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Ć */
    public final void mo4284() {
        if (C1014.f6137.f1636.f6522 == null) {
            if (this.f1626.getParent() != null) {
                mo3538();
            }
        }
        int i = 0;
        String[] strArr = new String[C1014.f6137.f1636.f6522.f8900.size()];
        Iterator it = C1014.f6137.f1636.f6522.f8900.iterator();
        while (it.hasNext()) {
            int i2 = i;
            i++;
            strArr[i2] = ((C2013) it.next()).f8906;
        }
        this.f6478.setAdapter(new ArrayAdapter(C1014.f6147, R.layout.spinner_item, strArr));
    }

    /* renamed from: ȃ */
    public final void mo3546() {
        mo3950();
        mo4284();
    }

    /* renamed from: Ą */
    public final void mo3544() {
        this.f6477.setText(null);
        if (C1014.f6137.f1636.f6522 != null) {
            C1014.f6144.mo3652((C0839ue) new C1326());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4285(String str, int i) {
        CharSequence text = this.f6477.getText();
        int i2 = 0;
        if (text != null) {
            i2 = text.length();
            this.f6477.append(new StringBuilder(String.valueOf(str)).append("\n").toString());
        } else {
            this.f6477.setText(str);
        }
        ((Spannable) this.f6477.getText()).setSpan(new ForegroundColorSpan(-16777216 | i), i2, str.length() + i2 + 1, 0);
    }
}
