package android.support.p000v4.media;

import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Creator<RatingCompat> CREATOR = new Creator<RatingCompat>() {
        public final RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        public final RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    };
    public static final int RATING_3_STARS = 3;
    public static final int RATING_4_STARS = 4;
    public static final int RATING_5_STARS = 5;
    public static final int RATING_HEART = 1;
    public static final int RATING_NONE = 0;
    private static final float RATING_NOT_RATED = -1.0f;
    public static final int RATING_PERCENTAGE = 6;
    public static final int RATING_THUMB_UP_DOWN = 2;
    private static final String TAG = "Rating";
    private Object mRatingObj;
    private final int mRatingStyle;
    private final float mRatingValue;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.RatingCompat$StarStyle */
    public @interface StarStyle {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.RatingCompat$Style */
    public @interface Style {
    }

    private RatingCompat(int i, float f) {
        this.mRatingStyle = i;
        this.mRatingValue = f;
    }

    public final String toString() {
        return "Rating:style=" + this.mRatingStyle + " rating=" + (this.mRatingValue < 0.0f ? "unrated" : String.valueOf(this.mRatingValue));
    }

    public final int describeContents() {
        return this.mRatingStyle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mRatingStyle);
        parcel.writeFloat(this.mRatingValue);
    }

    static {
    }

    public static RatingCompat newUnratedRating(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i, RATING_NOT_RATED);
            default:
                return null;
        }
    }

    public static RatingCompat newHeartRating(boolean z) {
        return new RatingCompat(1, z ? 1.0f : 0.0f);
    }

    public static RatingCompat newThumbRating(boolean z) {
        return new RatingCompat(2, z ? 1.0f : 0.0f);
    }

    public static RatingCompat newStarRating(int i, float f) {
        float f2;
        switch (i) {
            case 3:
                f2 = 3.0f;
                break;
            case 4:
                f2 = 4.0f;
                break;
            case 5:
                f2 = 5.0f;
                break;
            default:
                Log.e(TAG, "Invalid rating style (" + i + ") for a star rating");
                return null;
        }
        if (f >= 0.0f && f <= f2) {
            return new RatingCompat(i, f);
        }
        Log.e(TAG, "Trying to set out of range star-based rating");
        return null;
    }

    public static RatingCompat newPercentageRating(float f) {
        if (f >= 0.0f && f <= 100.0f) {
            return new RatingCompat(6, f);
        }
        Log.e(TAG, "Invalid percentage-based rating value");
        return null;
    }

    public final boolean isRated() {
        return this.mRatingValue >= 0.0f;
    }

    public final int getRatingStyle() {
        return this.mRatingStyle;
    }

    public final boolean hasHeart() {
        if (this.mRatingStyle != 1) {
            return false;
        }
        return this.mRatingValue == 1.0f;
    }

    public final boolean isThumbUp() {
        if (this.mRatingStyle != 2) {
            return false;
        }
        return this.mRatingValue == 1.0f;
    }

    public final float getStarRating() {
        switch (this.mRatingStyle) {
            case 3:
            case 4:
            case 5:
                if (isRated()) {
                    return this.mRatingValue;
                }
                break;
        }
        return RATING_NOT_RATED;
    }

    public final float getPercentRating() {
        if (this.mRatingStyle != 6 || !isRated()) {
            return RATING_NOT_RATED;
        }
        return this.mRatingValue;
    }

    public static RatingCompat fromRating(Object obj) {
        RatingCompat ratingCompat;
        if (obj == null || VERSION.SDK_INT < 21) {
            return null;
        }
        int ratingStyle = RatingCompatApi21.getRatingStyle(obj);
        if (RatingCompatApi21.isRated(obj)) {
            switch (ratingStyle) {
                case 1:
                    ratingCompat = newHeartRating(RatingCompatApi21.hasHeart(obj));
                    break;
                case 2:
                    ratingCompat = newThumbRating(RatingCompatApi21.isThumbUp(obj));
                    break;
                case 3:
                case 4:
                case 5:
                    ratingCompat = newStarRating(ratingStyle, RatingCompatApi21.getStarRating(obj));
                    break;
                case 6:
                    ratingCompat = newPercentageRating(RatingCompatApi21.getPercentRating(obj));
                    break;
                default:
                    return null;
            }
        } else {
            ratingCompat = newUnratedRating(ratingStyle);
        }
        ratingCompat.mRatingObj = obj;
        return ratingCompat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getRating() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.mRatingObj
            if (r0 != 0) goto L_0x000a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 >= r1) goto L_0x000d
        L_0x000a:
            java.lang.Object r0 = r2.mRatingObj
            return r0
        L_0x000d:
            boolean r0 = r2.isRated()
            if (r0 == 0) goto L_0x0059
            int r0 = r2.mRatingStyle
            switch(r0) {
                case 1: goto L_0x002a;
                case 2: goto L_0x0035;
                case 3: goto L_0x0040;
                case 4: goto L_0x0040;
                case 5: goto L_0x0040;
                case 6: goto L_0x004d;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x0057
        L_0x002a:
            boolean r0 = r2.hasHeart()
            java.lang.Object r0 = android.support.p000v4.media.RatingCompatApi21.newHeartRating(r0)
            r2.mRatingObj = r0
            goto L_0x0061
        L_0x0035:
            boolean r0 = r2.isThumbUp()
            java.lang.Object r0 = android.support.p000v4.media.RatingCompatApi21.newThumbRating(r0)
            r2.mRatingObj = r0
            goto L_0x0061
        L_0x0040:
            int r0 = r2.mRatingStyle
            float r1 = r2.getStarRating()
            java.lang.Object r0 = android.support.p000v4.media.RatingCompatApi21.newStarRating(r0, r1)
            r2.mRatingObj = r0
            goto L_0x0061
        L_0x004d:
            float r0 = r2.getPercentRating()
            java.lang.Object r0 = android.support.p000v4.media.RatingCompatApi21.newPercentageRating(r0)
            r2.mRatingObj = r0
        L_0x0057:
            r0 = 0
            return r0
        L_0x0059:
            int r0 = r2.mRatingStyle
            java.lang.Object r0 = android.support.p000v4.media.RatingCompatApi21.newUnratedRating(r0)
            r2.mRatingObj = r0
        L_0x0061:
            java.lang.Object r0 = r2.mRatingObj
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p000v4.media.RatingCompat.getRating():java.lang.Object");
    }
}
