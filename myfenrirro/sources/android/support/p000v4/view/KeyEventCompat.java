package android.support.p000v4.view;

import android.os.Build.VERSION;
import android.view.KeyEvent;
import android.view.KeyEvent.Callback;
import android.view.View;
import org.apache.commons.net.telnet.TelnetCommand;

/* renamed from: android.support.v4.view.KeyEventCompat */
public final class KeyEventCompat {
    static final KeyEventVersionImpl IMPL;

    /* renamed from: android.support.v4.view.KeyEventCompat$BaseKeyEventVersionImpl */
    static class BaseKeyEventVersionImpl implements KeyEventVersionImpl {
        private static final int META_ALL_MASK = 247;
        private static final int META_MODIFIER_MASK = 247;

        BaseKeyEventVersionImpl() {
        }

        private static int metaStateFilterDirectionalModifiers(int i, int i2, int i3, int i4, int i5) {
            boolean z = (i2 & i3) != 0;
            int i6 = i4 | i5;
            boolean z2 = (i2 & i6) != 0;
            if (z) {
                if (!z2) {
                    return (i6 ^ -1) & i;
                }
                throw new IllegalArgumentException("bad arguments");
            } else if (z2) {
                return (i3 ^ -1) & i;
            } else {
                return i;
            }
        }

        public int normalizeMetaState(int i) {
            if ((i & 192) != 0) {
                i |= 1;
            }
            if ((i & 48) != 0) {
                i |= 2;
            }
            return i & TelnetCommand.f8996EC;
        }

        public boolean metaStateHasModifiers(int i, int i2) {
            return metaStateFilterDirectionalModifiers(metaStateFilterDirectionalModifiers(normalizeMetaState(i) & TelnetCommand.f8996EC, i2, 1, 64, 128), i2, 2, 16, 32) == i2;
        }

        public boolean metaStateHasNoModifiers(int i) {
            return (normalizeMetaState(i) & TelnetCommand.f8996EC) == 0;
        }

        public void startTracking(KeyEvent keyEvent) {
        }

        public boolean isTracking(KeyEvent keyEvent) {
            return false;
        }

        public Object getKeyDispatcherState(View view) {
            return null;
        }

        public boolean dispatch(KeyEvent keyEvent, Callback callback, Object obj, Object obj2) {
            return keyEvent.dispatch(callback);
        }
    }

    /* renamed from: android.support.v4.view.KeyEventCompat$EclairKeyEventVersionImpl */
    static class EclairKeyEventVersionImpl extends BaseKeyEventVersionImpl {
        EclairKeyEventVersionImpl() {
        }

        public void startTracking(KeyEvent keyEvent) {
            KeyEventCompatEclair.startTracking(keyEvent);
        }

        public boolean isTracking(KeyEvent keyEvent) {
            return KeyEventCompatEclair.isTracking(keyEvent);
        }

        public Object getKeyDispatcherState(View view) {
            return KeyEventCompatEclair.getKeyDispatcherState(view);
        }

        public boolean dispatch(KeyEvent keyEvent, Callback callback, Object obj, Object obj2) {
            return KeyEventCompatEclair.dispatch(keyEvent, callback, obj, obj2);
        }
    }

    /* renamed from: android.support.v4.view.KeyEventCompat$HoneycombKeyEventVersionImpl */
    static class HoneycombKeyEventVersionImpl extends EclairKeyEventVersionImpl {
        HoneycombKeyEventVersionImpl() {
        }

        public int normalizeMetaState(int i) {
            return KeyEventCompatHoneycomb.normalizeMetaState(i);
        }

        public boolean metaStateHasModifiers(int i, int i2) {
            return KeyEventCompatHoneycomb.metaStateHasModifiers(i, i2);
        }

        public boolean metaStateHasNoModifiers(int i) {
            return KeyEventCompatHoneycomb.metaStateHasNoModifiers(i);
        }
    }

    /* renamed from: android.support.v4.view.KeyEventCompat$KeyEventVersionImpl */
    interface KeyEventVersionImpl {
        boolean dispatch(KeyEvent keyEvent, Callback callback, Object obj, Object obj2);

        Object getKeyDispatcherState(View view);

        boolean isTracking(KeyEvent keyEvent);

        boolean metaStateHasModifiers(int i, int i2);

        boolean metaStateHasNoModifiers(int i);

        int normalizeMetaState(int i);

        void startTracking(KeyEvent keyEvent);
    }

    static {
        if (VERSION.SDK_INT >= 11) {
            IMPL = new HoneycombKeyEventVersionImpl();
        } else {
            IMPL = new BaseKeyEventVersionImpl();
        }
    }

    public static int normalizeMetaState(int i) {
        return IMPL.normalizeMetaState(i);
    }

    public static boolean metaStateHasModifiers(int i, int i2) {
        return IMPL.metaStateHasModifiers(i, i2);
    }

    public static boolean metaStateHasNoModifiers(int i) {
        return IMPL.metaStateHasNoModifiers(i);
    }

    public static boolean hasModifiers(KeyEvent keyEvent, int i) {
        return IMPL.metaStateHasModifiers(keyEvent.getMetaState(), i);
    }

    public static boolean hasNoModifiers(KeyEvent keyEvent) {
        return IMPL.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    public static void startTracking(KeyEvent keyEvent) {
        IMPL.startTracking(keyEvent);
    }

    public static boolean isTracking(KeyEvent keyEvent) {
        return IMPL.isTracking(keyEvent);
    }

    public static Object getKeyDispatcherState(View view) {
        return IMPL.getKeyDispatcherState(view);
    }

    public static boolean dispatch(KeyEvent keyEvent, Callback callback, Object obj, Object obj2) {
        return IMPL.dispatch(keyEvent, callback, obj, obj2);
    }

    private KeyEventCompat() {
    }
}
