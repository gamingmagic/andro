package p004o;

import android.app.AlertDialog.Builder;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.libroserver.apk.R;

/* renamed from: o.뽅 */
public final class C1978 extends C0519ld {

    /* renamed from: Ą */
    private ImageView f8796 = ((ImageView) this.f1626.findViewById(R.id.imageView2));

    /* renamed from: ą */
    private ImageView[] f8797 = new ImageView[4];

    /* renamed from: Ć */
    private boolean[] f8798 = new boolean[4];

    /* renamed from: ć */
    private boolean[] f8799 = new boolean[5];

    /* renamed from: ȃ */
    private TextView[] f8800 = new TextView[5];

    /* renamed from: Ȋ */
    private OnLongClickListener f8801 = new C2036(this);

    /* renamed from: ˮ͈ */
    private TextView f8802 = ((TextView) this.f1626.findViewById(R.id.textView1));

    /* renamed from: ˮ͍ */
    private View f8803;

    /* renamed from: 岱 */
    private OnClickListener f8804 = new C1898(this);

    /* renamed from: 櫯 */
    private TextView f8805 = ((TextView) this.f1626.findViewById(R.id.textView2));

    /* renamed from: 鷭 */
    C1992 f8806;

    C1978(LayoutInflater layoutInflater) {
        super(R.layout.itemdesc);
        this.f8802.setMovementMethod(new ScrollingMovementMethod());
        this.f8800[0] = (TextView) this.f1626.findViewById(R.id.textView3);
        this.f8800[1] = (TextView) this.f1626.findViewById(R.id.textView4);
        this.f8800[2] = (TextView) this.f1626.findViewById(R.id.textView5);
        this.f8800[3] = (TextView) this.f1626.findViewById(R.id.textView6);
        this.f8800[4] = (TextView) this.f1626.findViewById(R.id.textView7);
        this.f8803 = this.f1626.findViewById(R.id.view1);
        this.f8797[0] = (ImageView) this.f1626.findViewWithTag("card1");
        this.f8797[1] = (ImageView) this.f1626.findViewWithTag("card2");
        this.f8797[2] = (ImageView) this.f1626.findViewWithTag("card3");
        this.f8797[3] = (ImageView) this.f1626.findViewWithTag("card4");
        this.f8797[0].setOnClickListener(this.f8804);
        this.f8797[1].setOnClickListener(this.f8804);
        this.f8797[2].setOnClickListener(this.f8804);
        this.f8797[3].setOnClickListener(this.f8804);
        this.f8797[0].setOnLongClickListener(this.f8801);
        this.f8797[1].setOnLongClickListener(this.f8801);
        this.f8797[2].setOnLongClickListener(this.f8801);
        this.f8797[3].setOnLongClickListener(this.f8801);
    }

    /* renamed from: 鷭 */
    static /* synthetic */ void m2643(C1978 r5, View view) {
        int i = 0;
        while (i < 4) {
            int i2 = i;
            if (r5.f8797[i] != view || !r5.f8798[i]) {
                i++;
            } else {
                Builder builder = new Builder(C1014.f6147);
                builder.setTitle(new C1992((int) (short) r5.f8806.f8845[i]).mo4611());
                builder.setItems(new String[]{"View description"}, new C1527(r5, i2));
                builder.show();
                return;
            }
        }
    }

    /* renamed from: 鷭 */
    public final void mo4599(C1992 r10) {
        this.f8806 = r10.mo4612();
        C1701 r4 = C1014.f6158.f674.f608.mo4465(r10.f8848);
        if (r4 != null) {
            this.f8802.setText(C0453ix.m483(!r10.f8837 ? "Unknown item, requires identification. Use Magnifier to identify an item." : r4.f7764, false));
            this.f8805.setText(r4.mo4462(r10.f8837));
            for (int i = 0; i < 4; i++) {
                this.f8798[i] = false;
            }
            C1701 r8 = C1014.f6158.f674.f608.mo4465(r10.f8848);
            int i2 = r8 == null ? -1 : r8.f7761;
            C0453ix ixVar = C1014.f6147.f51;
            C1992 r82 = r10;
            ixVar.mo3871(this.f8796, C1014.f6158.f674.mo3608(r82.f8848, r82.f8837, true), ixVar.f1450);
            if (!r10.f8837 || r10.mo4608() || r10.mo4609()) {
                this.f8803.setVisibility(8);
                for (int i3 = 0; i3 < 4; i3++) {
                    this.f8797[i3].setVisibility(8);
                }
            } else {
                this.f8803.setVisibility(0);
                for (int i4 = 0; i4 < 4; i4++) {
                    this.f8797[i4].setVisibility(0);
                    if (r10.f8845[i4] != 0) {
                        C0453ix ixVar2 = C1014.f6147.f51;
                        ImageView imageView = this.f8797[i4];
                        C1992 r83 = new C1992((short) r10.f8845[i4], 1, true);
                        ixVar2.mo3871(imageView, C1014.f6158.f674.mo3608(r83.f8848, r83.f8837, false), ixVar2.f1450);
                        this.f8798[i4] = true;
                    } else if (i4 < i2) {
                        this.f8797[i4].setImageBitmap(C1014.f6158.f676);
                    } else {
                        this.f8797[i4].setImageBitmap(C1014.f6158.f669);
                    }
                }
            }
            if (!C1014.f6140.f4456 || r10.f8844 == null) {
                for (int i5 = 0; i5 < 5; i5++) {
                    this.f8800[i5].setVisibility(8);
                }
                return;
            }
            int i6 = 0;
            for (int i7 = 0; i7 < 5; i7++) {
                String r6 = r10.mo4614(i7);
                if (r6 != null) {
                    this.f8800[i6].setText(r6);
                    i6++;
                }
            }
            while (i6 < 5) {
                this.f8800[i6].setVisibility(8);
                i6++;
            }
        }
    }

    /* renamed from: ȃ */
    public final void mo3546() {
    }

    /* renamed from: Ą */
    public final void mo3544() {
    }
}
