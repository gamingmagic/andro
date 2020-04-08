package p004o;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.roworkshop.andro.c_point;

/* renamed from: o.kx */
class C0511kx implements OnSeekBarChangeListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0500kn f1586;

    C0511kx(C0500kn knVar) {
        this.f1586 = knVar;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        float f = (float) (C0500kn.f1544 + i);
        float f2 = (float) (C0500kn.f1544 + i);
        this.f1586.f1565 = new c_point((int) ((((float) C1014.f6147.getResources().getDisplayMetrics().densityDpi) / 160.0f) * f), (int) ((((float) C1014.f6147.getResources().getDisplayMetrics().densityDpi) / 160.0f) * f2));
        this.f1586.f1549 = i;
        C0500kn.m530(this.f1586);
        this.f1586.m518();
        this.f1586.m520();
    }
}
