package android.support.p000v4.media;

import android.os.Bundle;
import android.support.p000v4.media.MediaBrowserCompat.MediaItem;
import java.util.List;

/* renamed from: android.support.v4.media.MediaBrowserCompatUtils */
public class MediaBrowserCompatUtils {
    public static boolean areSameOptions(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        return bundle == null ? bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == -1 && bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1 : bundle2 == null ? bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == -1 && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1 : bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
    }

    public static boolean hasDuplicatedItems(Bundle bundle, Bundle bundle2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = bundle == null ? -1 : bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
        int i6 = bundle2 == null ? -1 : bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
        int i7 = bundle == null ? -1 : bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
        int i8 = bundle2 == null ? -1 : bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
        if (i5 == -1 || i7 == -1) {
            i2 = 0;
            i = Integer.MAX_VALUE;
        } else {
            i2 = i7 * (i5 - 1);
            i = (i2 + i7) - 1;
        }
        if (i6 == -1 || i8 == -1) {
            i4 = 0;
            i3 = Integer.MAX_VALUE;
        } else {
            i4 = i8 * (i6 - 1);
            i3 = (i4 + i8) - 1;
        }
        if (i2 <= i4 && i4 <= i) {
            return true;
        }
        if (i2 > i3 || i3 > i) {
            return false;
        }
        return true;
    }

    public static List<MediaItem> applyOptions(List<MediaItem> list, Bundle bundle) {
        int i = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
        int i2 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
        if (i == -1 && i2 == -1) {
            return list;
        }
        int i3 = i2 * (i - 1);
        int i4 = i3 + i2;
        if (i <= 0 || i2 <= 0 || i3 >= list.size()) {
            return null;
        }
        if (i4 > list.size()) {
            i4 = list.size();
        }
        return list.subList(i3, i4);
    }
}
