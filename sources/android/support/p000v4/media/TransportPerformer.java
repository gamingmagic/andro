package android.support.p000v4.media;

import android.os.SystemClock;
import android.view.KeyEvent;
import org.apache.commons.net.finger.FingerClient;

/* renamed from: android.support.v4.media.TransportPerformer */
public abstract class TransportPerformer {
    static final int AUDIOFOCUS_GAIN = 1;
    static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
    static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
    static final int AUDIOFOCUS_LOSS = -1;
    static final int AUDIOFOCUS_LOSS_TRANSIENT = -2;
    static final int AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK = -3;

    public abstract long onGetCurrentPosition();

    public abstract long onGetDuration();

    public abstract boolean onIsPlaying();

    public abstract void onPause();

    public abstract void onSeekTo(long j);

    public abstract void onStart();

    public abstract void onStop();

    public int onGetBufferPercentage() {
        return 100;
    }

    public int onGetTransportControlFlags() {
        return 60;
    }

    public boolean onMediaButtonDown(int i, KeyEvent keyEvent) {
        switch (i) {
            case FingerClient.DEFAULT_PORT /*79*/:
            case 85:
                if (!onIsPlaying()) {
                    onStart();
                    break;
                } else {
                    onPause();
                    break;
                }
            case 86:
                onStop();
                return true;
            case TransportMediator.KEYCODE_MEDIA_PLAY /*126*/:
                onStart();
                return true;
            case TransportMediator.KEYCODE_MEDIA_PAUSE /*127*/:
                onPause();
                return true;
        }
        return true;
    }

    public boolean onMediaButtonUp(int i, KeyEvent keyEvent) {
        return true;
    }

    public void onAudioFocusChange(int i) {
        char c = 0;
        switch (i) {
            case -1:
                c = 127;
                break;
        }
        if (c != 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = uptimeMillis;
            onMediaButtonDown(TransportMediator.KEYCODE_MEDIA_PAUSE, new KeyEvent(j, j, 0, TransportMediator.KEYCODE_MEDIA_PAUSE, 0));
            long j2 = uptimeMillis;
            onMediaButtonUp(TransportMediator.KEYCODE_MEDIA_PAUSE, new KeyEvent(j2, j2, 1, TransportMediator.KEYCODE_MEDIA_PAUSE, 0));
        }
    }
}
