package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import net.hockeyapp.android.PaintActivity;

/* renamed from: o.aav */
public class aav implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ PaintActivity f150;

    public aav(PaintActivity paintActivity) {
        this.f150 = paintActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case -2:
                this.f150.finish();
                break;
            case -1:
                this.f150.m50();
                return;
        }
    }
}
