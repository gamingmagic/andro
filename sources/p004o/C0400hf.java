package p004o;

import android.graphics.LightingColorFilter;
import android.support.p000v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.libroserver.apk.R;

/* renamed from: o.hf */
final class C0400hf extends BaseAdapter {

    /* renamed from: ˮ͈ */
    OnClickListener f1133 = new C0401hg(this);

    /* renamed from: 櫯 */
    OnClickListener f1134;

    /* renamed from: 鷭 */
    C0605oe[] f1135;

    C0400hf(C0605oe[] oeVarArr, OnClickListener onClickListener) {
        this.f1135 = oeVarArr;
        this.f1134 = onClickListener;
    }

    public final int getCount() {
        return this.f1135.length;
    }

    public final Object getItem(int i) {
        return null;
    }

    public final long getItemId(int i) {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final int mo3774(RelativeLayout relativeLayout) {
        for (int i = 0; i < this.f1135.length; i++) {
            if (relativeLayout == this.f1135[i].f2971) {
                return i;
            }
        }
        return -1;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        RelativeLayout relativeLayout = (RelativeLayout) ((LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater")).inflate(R.layout.skills_entry, null);
        this.f1135[i].f2971 = relativeLayout;
        C0605oe oeVar = this.f1135[i];
        ImageView imageView = (ImageView) oeVar.f2971.findViewById(R.id.imageView1);
        TextView textView = (TextView) oeVar.f2971.findViewById(R.id.textView2);
        TextView textView2 = (TextView) oeVar.f2971.findViewById(R.id.textView3);
        Button button = (Button) oeVar.f2971.findViewById(R.id.button1);
        ((TextView) oeVar.f2971.findViewById(R.id.textView1)).setText(oeVar.f2973.f1071);
        if (!oeVar.f2974.f1049 || !oeVar.f2972) {
            button.setVisibility(4);
        } else {
            button.setVisibility(0);
        }
        button.setOnClickListener(this.f1133);
        if (oeVar.f2974.f1051 > 0) {
            textView.setText("Lv : " + oeVar.f2974.f1051);
            oeVar.f2971.setBackgroundColor(-13421773);
            imageView.setColorFilter(new LightingColorFilter(-1, 0));
        } else {
            textView.setText("Not learned");
            oeVar.f2971.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            imageView.setColorFilter(new LightingColorFilter(-4473925, 0));
        }
        C0453ix ixVar = C1014.f6147.f51;
        ixVar.mo3871(imageView, C1014.f6158.f674.mo3609(C1014.f6158.f674.f609.mo3752(oeVar.f2974.f1053).f1073), ixVar.f1456);
        if (oeVar.f2974.f1051 > 0) {
            if (oeVar.f2974.f1052 == 0) {
                textView2.setText("Passive");
            } else {
                textView2.setText("SP : " + oeVar.f2974.f1050);
            }
        } else {
            textView2.setText(null);
        }
        oeVar.f2971.setOnClickListener(this.f1134);
        return relativeLayout;
    }
}
