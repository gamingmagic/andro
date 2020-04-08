package p004o;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.libroserver.apk.R;
import com.roworkshop.andro.c_activity;

/* renamed from: o.y */
final class C0955y {

    /* renamed from: Ą */
    C0540lv f5678;

    /* renamed from: ą */
    RelativeLayout f5679 = ((RelativeLayout) C1014.f6147.getLayoutInflater().inflate(R.layout.overhead_box, null));

    /* renamed from: Ć */
    TextView f5680 = ((TextView) this.f5679.findViewById(R.id.textView1));

    /* renamed from: ć */
    ImageView f5681 = ((ImageView) this.f5679.findViewById(R.id.imageView1));

    /* renamed from: ȃ */
    C0958 f5682;

    /* renamed from: ˮ͈ */
    C0959 f5683;

    /* renamed from: ˮ͍ */
    Point f5684;

    /* renamed from: 岱 */
    OnClickListener f5685 = new C0986z(this);

    /* renamed from: 櫯 */
    C0957 f5686;

    /* renamed from: 鷭 */
    C0956if f5687;

    /* renamed from: o.y$if */
    class C0956if {

        /* renamed from: ȃ */
        Runnable f5689;

        /* renamed from: ˮ͈ */
        String f5690;

        /* renamed from: 櫯 */
        Bitmap f5691;

        C0956if(Bitmap bitmap, String str, Runnable runnable) {
            this.f5691 = bitmap;
            this.f5690 = str;
            this.f5689 = runnable;
        }
    }

    /* renamed from: o.y$ˮ͈ */
    class C0957 extends C0956if {
        C0957(String str) {
            super(C1014.f6158.f665, str, new C0172ac(C0955y.this));
        }
    }

    /* renamed from: o.y$櫯 */
    class C0958 extends C0956if {

        /* renamed from: ą */
        int f5693;

        /* renamed from: Ć */
        int f5694;

        /* renamed from: ć */
        String f5695;

        /* renamed from: 鷭 */
        int f5697;

        C0958(String str, int i, C0565ms msVar, int i2, int i3) {
            super(msVar == C0565ms.PROTECTED ? C1014.f6158.f652 : C1014.f6158.f663, new StringBuilder(String.valueOf(str)).append("(").append(i3).append("/").append(i2).append(")").toString(), new C0168ab(C0955y.this, i));
            this.f5695 = str;
            this.f5694 = i;
            this.f5697 = i2;
            this.f5693 = i3;
        }
    }

    /* renamed from: o.y$鷭 */
    class C0959 extends C0956if {
        C0959(String str) {
            super(C1014.f6158.f654, str, new C0163aa(C0955y.this));
        }
    }

    C0955y(C0540lv lvVar) {
        this.f5679.setOnClickListener(this.f5685);
        this.f5681.setOnClickListener(this.f5685);
        this.f5680.setOnClickListener(this.f5685);
        this.f5678 = lvVar;
        C1014.f6147.f51.f1412.addView(this.f5679);
        C1014.f6147.f51.f1412.bringChildToFront(this.f5679);
        this.f5679.measure(0, 0);
        this.f5684 = new Point(this.f5679.getMeasuredWidth(), this.f5679.getMeasuredHeight());
        mo4154();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4155() {
        if (this.f5683 != null) {
            this.f5687 = this.f5683;
        } else if (this.f5682 != null) {
            this.f5687 = this.f5682;
        } else {
            this.f5687 = this.f5686;
        }
        if (this.f5687 != null) {
            this.f5681.setImageBitmap(this.f5687.f5691);
            this.f5680.setText(this.f5687.f5690);
            return;
        }
        C0540lv lvVar = this.f5678;
        if (lvVar.f1728 != null) {
            C1014.f6147.f51.f1412.removeView(lvVar.f1728.f5679);
            lvVar.f1728 = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final void mo4154() {
        if (C1014.f6147.f53 != null) {
            C0525li r6 = C1014.f6142.mo3974(this.f5678.f1707);
            if (r6.f1649 <= 0.0f || r6.f1649 >= ((float) C1014.f6142.f1690.x) || r6.f1648 <= 0.0f || r6.f1648 >= ((float) C1014.f6142.f1690.y)) {
                this.f5679.setVisibility(8);
                return;
            }
            this.f5679.setVisibility(0);
            Point point = new Point((int) r6.f1649, (int) (((float) C1014.f6147.f53.getHeight()) - (r6.f1648 + ((((float) C1014.f6147.getResources().getDisplayMetrics().densityDpi) / 160.0f) * 45.0f))));
            Point point2 = point;
            point.y -= this.f5684.y / 2;
            c_activity c_activity = C1014.f6147;
            C0453ix.m487(this.f5679, point2, this.f5684);
        }
    }
}
