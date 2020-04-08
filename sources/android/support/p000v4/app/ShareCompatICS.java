package android.support.p000v4.app;

import android.app.Activity;
import android.content.Intent;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.widget.ShareActionProvider;

/* renamed from: android.support.v4.app.ShareCompatICS */
class ShareCompatICS {
    private static final String HISTORY_FILENAME_PREFIX = ".sharecompat_";

    ShareCompatICS() {
    }

    public static void configureMenuItem(MenuItem menuItem, Activity activity, Intent intent) {
        ShareActionProvider shareActionProvider;
        ActionProvider actionProvider = menuItem.getActionProvider();
        if (!(actionProvider instanceof ShareActionProvider)) {
            shareActionProvider = new ShareActionProvider(activity);
        } else {
            shareActionProvider = (ShareActionProvider) actionProvider;
        }
        shareActionProvider.setShareHistoryFileName(new StringBuilder(HISTORY_FILENAME_PREFIX).append(activity.getClass().getName()).toString());
        shareActionProvider.setShareIntent(intent);
        menuItem.setActionProvider(shareActionProvider);
    }
}
