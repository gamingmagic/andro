package p004o;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout.LayoutParams;
import com.libroserver.apk.R;

/* renamed from: o.ld */
public abstract class C0519ld extends C0499km {

    /* renamed from: ġ */
    public View f1626;

    /* renamed from: 鷭 */
    private AlertDialog f1627;

    /* renamed from: Ą */
    public abstract void mo3544();

    /* renamed from: ȃ */
    public abstract void mo3546();

    public C0519ld(int i) {
        this.f1626 = C1014.f6147.getLayoutInflater().inflate(i, null);
    }

    /* renamed from: 櫯 */
    public final boolean mo3539() {
        return this.f1626.getParent() != null;
    }

    /* renamed from: h_ */
    public final void mo3537h_() {
        if (!(this.f1626.getParent() != null)) {
            if (C1014.f6147.f51.f1412 != null) {
                C1014.f6147.f51.f1412.addView(this.f1626);
            } else {
                ((ViewGroup) C1014.f6147.findViewById(16908290)).addView(this.f1626);
            }
            C1014.f6147.f51.f1434.push(this);
        }
        if (C1014.f6147.f51.f1412 != null) {
            C1014.f6147.f51.f1412.bringChildToFront(this.f1626);
            mo3546();
            return;
        }
        ((ViewGroup) C1014.f6147.findViewById(16908290)).bringChildToFront(this.f1626);
    }

    /* renamed from: ˮ͍ */
    public final void mo3949() {
        if (!(this.f1626.getParent() != null)) {
            Builder builder = new Builder(C1014.f6147);
            builder.setView(this.f1626);
            builder.setCancelable(true);
            this.f1627 = builder.create();
            this.f1627.show();
            C1014.f6147.f51.f1434.push(this);
        }
    }

    /* renamed from: ˮ͈ */
    public final void mo3538() {
        if (!(this.f1626.getParent() != null)) {
            mo3544();
        } else {
            if (this.f1627 != null) {
                this.f1627.dismiss();
            } else if (C1014.f6147.f51.f1412 != null) {
                C1014.f6147.f51.f1412.removeView(this.f1626);
            } else {
                ((ViewGroup) C1014.f6147.findViewById(16908290)).removeView(this.f1626);
            }
            do {
            } while (C1014.f6147.f51.f1434.remove(this));
        }
        mo3544();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ą */
    public void mo3948() {
        LayoutParams layoutParams = (LayoutParams) this.f1626.getLayoutParams();
        layoutParams.addRule(13);
        this.f1626.setLayoutParams(layoutParams);
    }

    /* renamed from: 岱 */
    public final void mo3950() {
        LayoutParams layoutParams = (LayoutParams) this.f1626.getLayoutParams();
        layoutParams.addRule(10);
        layoutParams.width = -1;
        layoutParams.addRule(2, R.id.view1);
        this.f1626.setLayoutParams(layoutParams);
    }
}
