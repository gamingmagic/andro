package p004o;

import android.widget.ImageView;
import android.widget.TextView;
import com.libroserver.apk.R;

/* renamed from: o.ῡ */
final class C1379 extends C1637 {

    /* renamed from: Ą */
    ImageView f6939;

    /* renamed from: ą */
    TextView f6940;

    /* renamed from: Ć */
    TextView f6941;

    /* renamed from: ć */
    TextView f6942;

    /* renamed from: ȃ */
    int f6943;

    /* renamed from: ˮ͈ */
    int f6944;

    /* renamed from: 櫯 */
    int f6945;

    /* renamed from: 鷭 */
    int f6946;

    C1379(int i, int i2, int i3, int i4) {
        super(R.layout.cashshop_item);
        this.f6946 = i;
        this.f6945 = i2;
        this.f6944 = i3;
        this.f6943 = i4;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3595() {
        this.f6939 = (ImageView) this.f7591.findViewById(R.id.imageView1);
        this.f6940 = (TextView) this.f7591.findViewById(R.id.textView1);
        this.f6941 = (TextView) this.f7591.findViewById(R.id.textView2);
        this.f6942 = (TextView) this.f7591.findViewById(R.id.textView3);
        C1992 r5 = new C1992(this.f6946);
        C0453ix ixVar = C1014.f6147.f51;
        C1992 r8 = r5;
        ixVar.mo3871(this.f6939, C1014.f6158.f674.mo3608(r8.f8848, r8.f8837, true), ixVar.f1450);
        this.f6940.setText(r5.mo4615(C1014.f6158.f674.f608));
        this.f6941.setText(new StringBuilder(String.valueOf(C0622ot.m736((long) this.f6945))).append(" CP").toString());
        if (this.f6944 > 0) {
            this.f6942.setVisibility(0);
            this.f6942.setText(String.valueOf(this.f6944));
            return;
        }
        this.f6942.setVisibility(8);
    }
}
