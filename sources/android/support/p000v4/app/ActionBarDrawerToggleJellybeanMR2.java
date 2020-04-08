package android.support.p000v4.app;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v4.app.ActionBarDrawerToggleJellybeanMR2 */
class ActionBarDrawerToggleJellybeanMR2 {
    private static final String TAG = "ActionBarDrawerToggleImplJellybeanMR2";
    private static final int[] THEME_ATTRS = {16843531};

    ActionBarDrawerToggleJellybeanMR2() {
    }

    static {
    }

    public static Object setActionBarUpIndicator(Object obj, Activity activity, Drawable drawable, int i) {
        ActionBar actionBar = activity.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(drawable);
            actionBar.setHomeActionContentDescription(i);
        }
        return obj;
    }

    public static Object setActionBarDescription(Object obj, Activity activity, int i) {
        ActionBar actionBar = activity.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeActionContentDescription(i);
        }
        return obj;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r5v3, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable getThemeUpIndicator(android.app.Activity r5) {
        /*
            android.app.ActionBar r4 = r5.getActionBar()
            if (r4 == 0) goto L_0x000a
            android.content.Context r5 = r4.getThemedContext()
        L_0x000a:
            int[] r0 = THEME_ATTRS
            r1 = 0
            r2 = 16843470(0x10102ce, float:2.369557E-38)
            r3 = 0
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r1, r0, r2, r3)
            r0 = 0
            android.graphics.drawable.Drawable r4 = r5.getDrawable(r0)
            r5.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p000v4.app.ActionBarDrawerToggleJellybeanMR2.getThemeUpIndicator(android.app.Activity):android.graphics.drawable.Drawable");
    }
}
