package p004o;

import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.libroserver.apk.R;

/* renamed from: o.ڇ */
public final class C1315 extends C0519ld {

    /* renamed from: Ą */
    TextView[] f6606 = new TextView[3];

    /* renamed from: ą */
    TextView f6607 = ((TextView) this.f1626.findViewById(R.id.allmaterials));

    /* renamed from: Ć */
    ImageView f6608 = ((ImageView) this.f1626.findViewById(R.id.imageView1));

    /* renamed from: ć */
    ImageView[] f6609 = new ImageView[3];

    /* renamed from: ċ */
    boolean f6610 = false;

    /* renamed from: ȃ */
    TextView f6611 = ((TextView) this.f1626.findViewById(R.id.textView1));

    /* renamed from: Ȋ */
    int[] f6612;

    /* renamed from: ˮ͈ */
    public C0597nx f6613;

    /* renamed from: ˮ͍ */
    GridView f6614;

    /* renamed from: 岱 */
    int f6615;

    /* renamed from: 櫯 */
    ListView f6616;

    /* renamed from: 纫 */
    private OnItemClickListener f6617 = new C1635(this);

    /* renamed from: 鷭 */
    Button f6618;

    C1315() {
        super(R.layout.material_select);
        this.f6606[0] = (TextView) this.f1626.findViewById(R.id.material1);
        this.f6609[0] = (ImageView) this.f1626.findViewById(R.id.ImageMaterial1);
        this.f6606[1] = (TextView) this.f1626.findViewById(R.id.material2);
        this.f6609[1] = (ImageView) this.f1626.findViewById(R.id.ImageMaterial2);
        this.f6606[2] = (TextView) this.f1626.findViewById(R.id.material3);
        this.f6609[2] = (ImageView) this.f1626.findViewById(R.id.ImageMaterial3);
        this.f6616 = (ListView) this.f1626.findViewById(R.id.listView1);
        this.f6614 = (GridView) this.f1626.findViewById(R.id.gridLayout1);
        this.f6616.setOnItemClickListener(this.f6617);
        this.f6618 = (Button) this.f1626.findViewById(R.id.btn_ok);
        this.f6618.setOnClickListener(new C1319(this));
        this.f6616.setOnItemClickListener(this.f6617);
        mo4298();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Ć */
    public final void mo4298() {
        this.f6606[0].setText(null);
        this.f6606[1].setText(null);
        this.f6606[2].setText(null);
        this.f6609[0].setVisibility(4);
        this.f6609[1].setVisibility(4);
        this.f6609[2].setVisibility(4);
        this.f6607.setText(null);
        this.f6608.setVisibility(4);
        this.f6611.setText(null);
        this.f6615 = 0;
        this.f6612 = new int[3];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ą */
    public final void mo3948() {
        LayoutParams layoutParams = (LayoutParams) this.f1626.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.addRule(13);
            this.f1626.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: ȃ */
    public final void mo3546() {
        LayoutParams layoutParams = (LayoutParams) this.f1626.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.addRule(13);
            this.f1626.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: Ą */
    public final void mo3544() {
    }
}
