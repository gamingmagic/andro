package p004o;

import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.libroserver.apk.R;
import java.util.Map.Entry;
import p004o.C0760sy.C0761;

/* renamed from: o.cf */
final class C0241cf extends C0519ld {

    /* renamed from: 鷭 */
    ListView f576 = ((ListView) this.f1626.findViewById(R.id.listView1));

    /* renamed from: o.cf$鷭 */
    class C0242 extends C1637 {

        /* renamed from: Ą */
        TextView f577;

        /* renamed from: ȃ */
        ImageView f579;

        /* renamed from: ˮ͈ */
        C0761 f580;

        /* renamed from: 櫯 */
        C0238ce f581;

        /* renamed from: 鷭 */
        int f582;

        C0242(int i, C0238ce ceVar) {
            super(R.layout.quest_item);
            this.f582 = i;
            this.f581 = ceVar;
            this.f580 = C1014.f6158.f674.f624.mo4093(i);
            if (this.f580 == null) {
                this.f580 = new C0761();
                this.f580.f4667 = "Quest " + this.f582;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: 鷭 */
        public final void mo3595() {
            this.f579 = (ImageView) this.f7591.findViewById(R.id.imageView1);
            this.f577 = (TextView) this.f7591.findViewById(R.id.textView1);
            if (this.f580 == null || this.f580.f4666 == null || this.f580.f4666.length() <= 0) {
                this.f579.setImageBitmap(null);
            } else {
                C1014.f6147.f51.mo3871(this.f579, C1014.f6158.f674.mo3609(this.f580.f4666.toLowerCase()), C1014.f6147.f51.f1456);
            }
            this.f577.setText(this.f580 != null ? C0453ix.m483(this.f580.f4667, true) : "Quest " + this.f582);
        }
    }

    C0241cf() {
        super(R.layout.quest);
        this.f576.setOnItemClickListener(new C0243cg(this));
    }

    /* renamed from: ȃ */
    public final void mo3546() {
        mo3594();
    }

    /* renamed from: Ą */
    public final void mo3544() {
        this.f576.setAdapter(null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Ć */
    public final void mo3594() {
        if (this.f1626.getParent() != null) {
            C0242[] r4 = new C0242[C1014.f6152.f7979.size()];
            int i = 0;
            for (Entry entry : C1014.f6152.f7979.entrySet()) {
                int i2 = i;
                i++;
                r4[i2] = new C0242(((Integer) entry.getKey()).intValue(), (C0238ce) entry.getValue());
            }
            this.f576.setAdapter(new C1753(r4));
        }
    }
}
