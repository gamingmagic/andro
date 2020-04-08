package p004o;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import com.libroserver.apk.R;

/* renamed from: o.jb */
class C0462jb implements OnTouchListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0453ix f1483;

    C0462jb(C0453ix ixVar) {
        this.f1483 = ixVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                ((ImageView) C1014.f6147.findViewById(R.id.imageview_attackbtn)).setImageResource(R.drawable.btn_1on1_a);
                break;
            case 1:
                ((ImageView) C1014.f6147.findViewById(R.id.imageview_attackbtn)).setImageResource(R.drawable.btn_1on1);
                break;
        }
        return false;
    }
}
