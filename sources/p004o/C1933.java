package p004o;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: o.땜 */
class C1933 implements OnItemClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1877 f8717;

    C1933(C1877 r1) {
        this.f8717 = r1;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C1646 r5 = (C1646) this.f8717.f8469.getAdapter();
        if (!((C1999) r5.f7605.get(i)).f8872.mo4608() || !this.f8717.f8471.isChecked()) {
            this.f8717.mo4547(i, ((C1999) r5.f7605.get(i)).f8872.f8846);
            return;
        }
        C1877 r52 = this.f8717;
        int i2 = i;
        r52.f8485 = i2;
        C1646 r7 = (C1646) r52.f8469.getAdapter();
        C1695 r0 = r52.f8486;
        StringBuilder append = new StringBuilder(String.valueOf(((C1999) r7.f7605.get(i2)).f8872.mo4611())).append(": ");
        C0252cp cpVar = C1014.f6158;
        String r72 = C1014.f6160.mo3796(2509);
        r0.f7751.setText(append.append(r72 == null ? "MSG2509" : r72).toString());
        r52.f8486.mo3537h_();
    }
}
