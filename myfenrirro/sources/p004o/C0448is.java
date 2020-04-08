package p004o;

import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.libroserver.apk.R;
import java.text.NumberFormat;
import java.util.LinkedList;

/* renamed from: o.is */
final class C0448is extends C0519ld {

    /* renamed from: Ą */
    ListView f1350 = ((ListView) this.f1626.findViewById(R.id.listView2));

    /* renamed from: ą */
    Button f1351 = ((Button) this.f1626.findViewById(R.id.button1));

    /* renamed from: Ć */
    EditText f1352 = ((EditText) this.f1626.findViewById(R.id.editText1));

    /* renamed from: ć */
    EditText f1353 = ((EditText) this.f1626.findViewById(R.id.editText2));

    /* renamed from: ċ */
    OnClickListener f1354 = new C0451iv(this);

    /* renamed from: ȃ */
    ListView f1355 = ((ListView) this.f1626.findViewById(R.id.listView1));

    /* renamed from: Ȋ */
    OnItemClickListener f1356 = new C0450iu(this);

    /* renamed from: ˮ͈ */
    TextView f1357 = ((TextView) this.f1626.findViewById(R.id.textView2));

    /* renamed from: ˮ͍ */
    int f1358;

    /* renamed from: 岱 */
    OnItemClickListener f1359 = new C0449it(this);

    /* renamed from: 櫯 */
    TextView f1360 = ((TextView) this.f1626.findViewById(R.id.textView1));

    /* renamed from: 鷭 */
    TextView f1361 = ((TextView) this.f1626.findViewById(R.id.textView3));

    C0448is() {
        super(R.layout.trade);
        this.f1351.setOnClickListener(this.f1354);
        this.f1350.setOnItemClickListener(this.f1359);
        this.f1355.setOnItemClickListener(this.f1356);
        this.f1352.setTextColor(-1);
        this.f1353.setTextColor(-1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3848(C1992 r5) {
        LinkedList r3 = mo3845(true);
        if (r3 == null) {
            r3 = new LinkedList();
        }
        r3.add(new C0512ky(r5.mo4612(), 0));
        mo3849(true, r3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final LinkedList<C0512ky> mo3845(boolean z) {
        C0452iw iwVar = (C0452iw) (z ? this.f1350.getAdapter() : this.f1355.getAdapter());
        if (iwVar == null) {
            return null;
        }
        return iwVar.f1365;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3849(boolean z, LinkedList<C0512ky> linkedList) {
        C0452iw iwVar = null;
        if (linkedList != null) {
            iwVar = new C0452iw(linkedList);
        }
        if (z) {
            this.f1350.setAdapter(iwVar);
        } else {
            this.f1355.setAdapter(iwVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3847(String str, int i) {
        this.f1361.setText(new StringBuilder(String.valueOf(str)).append(" (Lv ").append(i).append(")").toString());
        this.f1357.setText(new StringBuilder(String.valueOf(str)).append("'s items.").toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3846(int i) {
        this.f1353.setText(new StringBuilder(String.valueOf(String.valueOf(NumberFormat.getInstance().format((long) i)))).append(" Z").toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Ć */
    public final void mo3844() {
        this.f1358 = 0;
        mo3849(false, null);
        mo3849(true, null);
        this.f1355.setEnabled(true);
        this.f1350.setEnabled(true);
        this.f1351.setEnabled(true);
        this.f1351.setText("Ok");
        this.f1352.setEnabled(true);
        this.f1352.setText(null);
        this.f1353.setText(null);
    }

    /* renamed from: ȃ */
    public final void mo3546() {
        C1014.f6147.f51.f1445.mo3537h_();
        LayoutParams layoutParams = (LayoutParams) this.f1626.getLayoutParams();
        layoutParams.addRule(10);
        layoutParams.width = -1;
        layoutParams.addRule(2, R.id.view1);
        this.f1626.setLayoutParams(layoutParams);
    }

    /* renamed from: Ą */
    public final void mo3544() {
    }
}
