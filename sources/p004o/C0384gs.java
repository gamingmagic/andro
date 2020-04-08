package p004o;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

/* renamed from: o.gs */
class C0384gs implements OnSeekBarChangeListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0383gr f1091;

    C0384gs(C0383gr grVar) {
        this.f1091 = grVar;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f1091.mo3753(i + 1);
    }
}
