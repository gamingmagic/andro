package p004o;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

/* renamed from: o.䏬 */
class C1458 implements OnSeekBarChangeListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1585 f7117;

    C1458(C1585 r1) {
        this.f7117 = r1;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f7117.f7498.setText(String.valueOf(i + 2));
    }
}
