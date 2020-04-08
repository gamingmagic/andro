package p004o;

import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import com.libroserver.apk.R;
import java.util.ArrayList;

/* renamed from: o.ꍚ */
final class C1877 extends C0519ld {

    /* renamed from: Ą */
    ListView f8467 = ((ListView) this.f1626.findViewById(R.id.listview_sell));

    /* renamed from: ą */
    ListView f8468 = ((ListView) this.f1626.findViewById(R.id.listview_want));

    /* renamed from: Ć */
    ListView f8469 = ((ListView) this.f1626.findViewById(R.id.listview_all));

    /* renamed from: ć */
    TextView f8470 = ((TextView) this.f1626.findViewById(R.id.textView4));

    /* renamed from: ċ */
    CheckBox f8471 = ((CheckBox) this.f1626.findViewById(R.id.checkBox1));

    /* renamed from: đ */
    OnItemClickListener f8472 = new C1933(this);

    /* renamed from: Ē */
    OnClickListener f8473 = new C1494(this);

    /* renamed from: ē */
    private OnItemClickListener f8474 = new C1826(this);

    /* renamed from: ȃ */
    TextView f8475 = ((TextView) this.f1626.findViewById(R.id.textView5));

    /* renamed from: Ȋ */
    Button f8476 = ((Button) this.f1626.findViewById(R.id.button1));

    /* renamed from: ˮ͈ */
    TextView f8477 = ((TextView) this.f1626.findViewById(R.id.textView2));

    /* renamed from: ˮ͍ */
    TextView f8478 = ((TextView) this.f1626.findViewById(R.id.textView1));

    /* renamed from: ܕ */
    int f8479;

    /* renamed from: 䒧 */
    int f8480 = 0;

    /* renamed from: 岱 */
    TextView f8481 = ((TextView) this.f1626.findViewById(R.id.textView7));

    /* renamed from: 庸 */
    int f8482;

    /* renamed from: 櫯 */
    TextView f8483 = ((TextView) this.f1626.findViewById(R.id.textView3));

    /* renamed from: 纫 */
    int f8484 = 0;

    /* renamed from: 躆 */
    int f8485 = 0;

    /* renamed from: 鷭 */
    C1695 f8486;

    C1877(LayoutInflater layoutInflater) {
        super(R.layout.autobuyshop);
        this.f8476.setOnClickListener(new C1548(this));
        this.f8486 = new C1695(null, true, "1", this.f8473);
        this.f8469.setOnItemClickListener(this.f8472);
        this.f8467.setOnItemClickListener(this.f8474);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4546(int i) {
        C0252cp cpVar = C1014.f6158;
        String r5 = C1014.f6160.mo3796(1998);
        String str = r5 == null ? "MSG1998" : r5;
        String str2 = str;
        if (str.contains("%s")) {
            this.f8478.setText(String.format(str2, new Object[]{C0622ot.m736((long) i)}));
        } else if (str2.contains("%d")) {
            this.f8478.setText(String.format(str2, new Object[]{Integer.valueOf(i)}));
        } else {
            this.f8478.setText(String.format("Zeny : %s", new Object[]{C0622ot.m736((long) i)}));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4547(int i, int i2) {
        C1646 r5 = (C1646) this.f8469.getAdapter();
        C1646 r6 = (C1646) this.f8467.getAdapter();
        C1646 r7 = (C1646) this.f8468.getAdapter();
        C1999 r8 = (C1999) r5.f7605.get(i);
        if (r8.f8872.f8846 != 0) {
            if (r8.f8872.f8846 - i2 < 0) {
                i2 = r8.f8872.f8846;
            }
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i4 >= r7.f7605.size()) {
                    break;
                } else if (((C1999) r7.f7605.get(i4)).f8872.f8848 == ((C1999) r5.f7605.get(i)).f8872.f8848) {
                    i3 = i4;
                    break;
                } else {
                    i4++;
                }
            }
            if (((C1999) r7.f7605.get(i3)).f8872.f8846 < i2) {
                i2 = ((C1999) r7.f7605.get(i3)).f8872.f8846;
            }
            if ((this.f8480 - (r8.f8871 * (r13 + 1))) - this.f8484 < 0) {
                r13 = 0;
                for (int i5 = this.f8480; i5 - r8.f8871 >= 0; i5 -= r8.f8871) {
                    r13++;
                }
                C1746 r0 = C1014.f6147.f51.f1427;
                C0252cp cpVar = C1014.f6158;
                String r52 = C1014.f6160.mo3796(1740);
                r0.mo4490(String.format(r52 == null ? "MSG1740" : r52, new Object[]{Integer.valueOf(r13)}), 16763080);
            }
            ArrayList<C1999> arrayList = new ArrayList<>();
            if (!(r6 == null || r6.f7605 == null)) {
                arrayList = r6.f7605;
            }
            boolean z = false;
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                if (((C1999) arrayList.get(i6)).f8872.f8848 == r8.f8872.f8848 && r8.f8872.mo4608()) {
                    z = true;
                }
            }
            if (!z) {
                arrayList.add(new C1999(r8.f8872.mo4612(), r8.f8871, i3));
                int i7 = 0;
                while (true) {
                    if (i7 >= arrayList.size()) {
                        break;
                    } else if (((C1999) arrayList.get(i7)).f8872.f8848 == r8.f8872.f8848 || r13 < ((C1999) arrayList.get(i7)).f8872.f8846 || r8.f8872.f8846 > 0) {
                        this.f8484 += r8.f8871 * r13;
                        r8.f8872.f8846 -= r13;
                    } else {
                        i7++;
                    }
                }
                this.f8484 += r8.f8871 * r13;
                r8.f8872.f8846 -= r13;
                if (r8.f8872.f8846 >= 0) {
                    ((C1999) arrayList.get(i7)).f8872.f8846 = r13;
                    this.f8480 -= this.f8484;
                    TextView textView = this.f8470;
                    C0252cp cpVar2 = C1014.f6158;
                    String r53 = C1014.f6160.mo3796(1857);
                    textView.setText(new StringBuilder(String.valueOf(r53 == null ? "MSG1857" : r53)).append(" ").append(C0622ot.m736((long) this.f8480)).append(" Z").toString());
                    mo4546(C1014.f6137.f1636.f6542 + this.f8484);
                    mo4545d_();
                    r8.mo4618(r8.f8864, true);
                    this.f8467.setAdapter(new C1646(arrayList));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d_ */
    public final void mo4545d_() {
        String str;
        C0252cp cpVar = C1014.f6158;
        String r3 = C1014.f6160.mo3796(1736);
        String str2 = r3 == null ? "MSG1736" : r3;
        String str3 = str2;
        if (str2.contains("%s")) {
            str = String.format(str3, new Object[]{C0622ot.m736((long) this.f8484)});
        } else if (str3.contains("%d")) {
            str = String.format(str3, new Object[]{Integer.valueOf(this.f8484)});
        } else {
            str = "Price limit: " + C0622ot.m736((long) this.f8484);
        }
        this.f8481.setText(str);
    }

    /* renamed from: ȃ */
    public final void mo3546() {
    }

    /* renamed from: Ą */
    public final void mo3544() {
    }
}
