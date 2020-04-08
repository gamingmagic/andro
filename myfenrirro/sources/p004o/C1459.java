package p004o;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;

/* renamed from: o.䐭 */
class C1459 implements OnPreparedListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1641 f7118;

    C1459(C1641 r1) {
        this.f7118 = r1;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.start();
    }
}
