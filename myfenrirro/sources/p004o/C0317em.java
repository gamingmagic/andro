package p004o;

import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import com.libroserver.apk.R;
import com.roworkshop.andro.c_activity;
import java.util.Arrays;
import p004o.C0643pc.C0650;

/* renamed from: o.em */
final class C0317em {

    /* renamed from: Ą */
    C0445ip f860;

    /* renamed from: ą */
    OnClickListener f861 = new C0318en(this);

    /* renamed from: Ć */
    OnItemClickListener f862 = new C0319eo(this);

    /* renamed from: ȃ */
    c_activity f863;

    /* renamed from: ˮ͈ */
    Button f864;

    /* renamed from: 櫯 */
    ListView f865;

    /* renamed from: 鷭 */
    C0650[] f866;

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3684() {
        int[] iArr = new int[this.f866.length];
        Arrays.fill(iArr, -1);
        this.f865.setAdapter(new C0326ev(this.f866, iArr));
        this.f860 = new C0445ip("Ping thread");
        this.f860.mo3387(new C0323es(this));
        this.f860.mo3387(new C0324et(this));
    }

    C0317em(c_activity c_activity, C0650[] r4) {
        this.f863 = c_activity;
        this.f866 = r4;
        Arrays.sort(this.f866, new C0325eu(this));
        this.f865 = (ListView) this.f863.findViewById(R.id.listView1);
        this.f864 = (Button) this.f863.findViewById(R.id.button1);
        this.f865.setOnItemClickListener(this.f862);
        this.f864.setOnClickListener(this.f861);
        C0453ix.m477(R.id.relativeLayout1);
        mo3684();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3685(C0650 r3) {
        if (!(this.f860 == null || this.f860.f1341 == null)) {
            this.f860.f1341.interrupt();
        }
        C1014.f6147.setContentView(R.layout.clear);
        C0453ix.m477(R.id.relativeLayout1);
        this.f863.f51.f1430 = null;
        C1014.f6158 = null;
        C1014.m1842(r3);
    }
}
