package p004o;

import android.support.p000v4.view.ViewPager;
import android.widget.ImageView;
import android.widget.TextView;
import com.libroserver.apk.R;

/* renamed from: o.呏 */
final class C1535 extends C0519ld {

    /* renamed from: Ą */
    C1868 f7300 = new C1868();

    /* renamed from: ą */
    C1656 f7301 = new C1656();

    /* renamed from: Ć */
    C1895 f7302 = new C1895();

    /* renamed from: ć */
    C1917 f7303 = new C1917();

    /* renamed from: ȃ */
    C1896 f7304 = new C1896();

    /* renamed from: ˮ͈ */
    TextView f7305 = ((TextView) this.f1626.findViewById(R.id.textView1));

    /* renamed from: ˮ͍ */
    C0571my f7306 = C0571my.BASIC;

    /* renamed from: 櫯 */
    ImageView f7307 = ((ImageView) this.f1626.findViewById(R.id.imageView1));

    /* renamed from: 鷭 */
    ViewPager f7308 = ((ViewPager) this.f1626.findViewById(R.id.viewpager));

    C1535() {
        super(R.layout.guild_pager);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Ć */
    public final void mo4383() {
        if (this.f1626.getParent() != null) {
            this.f7305.setText(C1014.f6137.f1636.f8658);
            ImageView imageView = this.f7307;
            C0252cp cpVar = C1014.f6158;
            imageView.setImageBitmap(C0252cp.m264(C1014.f6137.f1636.f8637, C1014.f6137.f1636.f8638));
            if (C1014.f6137.f1636.f6541 != null) {
                C2041[] r6 = {this.f7304, this.f7300, this.f7301, this.f7303, this.f7302};
                C2041[] r3 = r6;
                for (C2041 r0 : r6) {
                    r0.mo4444();
                }
                this.f7308.setAdapter(new C1873(r3));
            }
        }
    }

    /* renamed from: ȃ */
    public final void mo3546() {
        C1014.f6144.mo3652((C0839ue) new C1040(C0571my.BASIC));
        C1014.f6144.mo3652((C0839ue) new C1040(C0571my.EXPULSIONS));
        C1014.f6144.mo3652((C0839ue) new C1040(C0571my.POSITIONS));
        C1014.f6144.mo3652((C0839ue) new C1040(C0571my.SKILLS));
        C1014.f6144.mo3652((C0839ue) new C1040(C0571my.MEMBERS));
        mo4383();
    }

    /* renamed from: Ą */
    public final void mo3544() {
    }
}
