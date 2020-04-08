package p004o;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: o.髚 */
class C1826 implements OnItemClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1877 f8419;

    C1826(C1877 r1) {
        this.f8419 = r1;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C1877 r8 = this.f8419;
        int i2 = i;
        C1646 r10 = (C1646) r8.f8469.getAdapter();
        C1646 r11 = (C1646) r8.f8467.getAdapter();
        C1999 r12 = (C1999) r11.f7605.get(i2);
        if (r12.f8872.f8846 >= 0) {
            ArrayList<C1999> arrayList = r10.f7605;
            ArrayList<C1999> arrayList2 = new ArrayList<>();
            if (!(r11 == null || r11.f7605 == null)) {
                arrayList2 = r11.f7605;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList.size()) {
                    break;
                } else if (r12.f8872.f8848 != ((C1999) arrayList.get(i3)).f8872.f8848 || r12.f8872.f8846 <= 0) {
                    i3++;
                } else {
                    r8.f8480 += r8.f8484;
                    r8.f8484 -= r12.f8872.f8846 * r12.f8871;
                    TextView textView = r8.f8470;
                    C0252cp cpVar = C1014.f6158;
                    String r6 = C1014.f6160.mo3796(1857);
                    textView.setText(new StringBuilder(String.valueOf(r6 == null ? "MSG1857" : r6)).append(" ").append(C0622ot.m736((long) r8.f8480)).append(" Z").toString());
                    r8.mo4546(C1014.f6137.f1636.f6542 + r8.f8484);
                    r8.mo4545d_();
                    ((C1999) r10.f7605.get(i3)).f8872.f8846 += r12.f8872.f8846;
                    arrayList2.remove(i2);
                    RelativeLayout relativeLayout = ((C1999) r10.f7605.get(i3)).f8864;
                    arrayList.get(i3);
                    r12.mo4618(relativeLayout, true);
                }
            }
            r8.f8467.setAdapter(new C1646(arrayList2));
            r8.f8469.setAdapter(new C1646(r10.f7605));
        }
    }
}
