package p004o;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.libroserver.apk.R;

/* renamed from: o.j */
class C0460j implements OnTouchListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0360g f1481;

    C0460j(C0360g gVar) {
        this.f1481 = gVar;
    }

    @SuppressLint({"NewApi"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 1:
                if (view.getId() == R.id.npcdialog) {
                    this.f1481.f991.f1649 = motionEvent.getRawX();
                    this.f1481.f991.f1648 = motionEvent.getRawY();
                    this.f1481.mo3733();
                    break;
                } else {
                    return false;
                }
            case 2:
                this.f1481.f991.f1649 = motionEvent.getRawX();
                this.f1481.f991.f1648 = motionEvent.getRawY();
                this.f1481.mo3733();
                break;
        }
        return true;
    }
}
