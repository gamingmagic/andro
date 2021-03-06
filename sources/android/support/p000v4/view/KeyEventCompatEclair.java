package android.support.p000v4.view;

import android.view.KeyEvent;
import android.view.KeyEvent.Callback;
import android.view.KeyEvent.DispatcherState;
import android.view.View;

/* renamed from: android.support.v4.view.KeyEventCompatEclair */
class KeyEventCompatEclair {
    KeyEventCompatEclair() {
    }

    public static Object getKeyDispatcherState(View view) {
        return view.getKeyDispatcherState();
    }

    public static boolean dispatch(KeyEvent keyEvent, Callback callback, Object obj, Object obj2) {
        return keyEvent.dispatch(callback, (DispatcherState) obj, obj2);
    }

    public static void startTracking(KeyEvent keyEvent) {
        keyEvent.startTracking();
    }

    public static boolean isTracking(KeyEvent keyEvent) {
        return keyEvent.isTracking();
    }
}
