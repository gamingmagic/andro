package android.support.p000v4.print;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;

/* renamed from: android.support.v4.print.PrintHelper */
public final class PrintHelper {
    public static final int COLOR_MODE_COLOR = 2;
    public static final int COLOR_MODE_MONOCHROME = 1;
    public static final int ORIENTATION_LANDSCAPE = 1;
    public static final int ORIENTATION_PORTRAIT = 2;
    public static final int SCALE_MODE_FILL = 2;
    public static final int SCALE_MODE_FIT = 1;
    PrintHelperVersionImpl mImpl;

    /* renamed from: android.support.v4.print.PrintHelper$OnPrintFinishCallback */
    public interface OnPrintFinishCallback {
        void onFinish();
    }

    /* renamed from: android.support.v4.print.PrintHelper$PrintHelperKitkatImpl */
    static final class PrintHelperKitkatImpl implements PrintHelperVersionImpl {
        private final PrintHelperKitkat mPrintHelper;

        PrintHelperKitkatImpl(Context context) {
            this.mPrintHelper = new PrintHelperKitkat(context);
        }

        public final void setScaleMode(int i) {
            this.mPrintHelper.setScaleMode(i);
        }

        public final int getScaleMode() {
            return this.mPrintHelper.getScaleMode();
        }

        public final void setColorMode(int i) {
            this.mPrintHelper.setColorMode(i);
        }

        public final int getColorMode() {
            return this.mPrintHelper.getColorMode();
        }

        public final void setOrientation(int i) {
            this.mPrintHelper.setOrientation(i);
        }

        public final int getOrientation() {
            return this.mPrintHelper.getOrientation();
        }

        public final void printBitmap(String str, Bitmap bitmap, final OnPrintFinishCallback onPrintFinishCallback) {
            C00921 r1 = null;
            if (onPrintFinishCallback != null) {
                r1 = new android.support.p000v4.print.PrintHelperKitkat.OnPrintFinishCallback() {
                    public void onFinish() {
                        onPrintFinishCallback.onFinish();
                    }
                };
            }
            this.mPrintHelper.printBitmap(str, bitmap, (android.support.p000v4.print.PrintHelperKitkat.OnPrintFinishCallback) r1);
        }

        public final void printBitmap(String str, Uri uri, final OnPrintFinishCallback onPrintFinishCallback) {
            C00932 r1 = null;
            if (onPrintFinishCallback != null) {
                r1 = new android.support.p000v4.print.PrintHelperKitkat.OnPrintFinishCallback() {
                    public void onFinish() {
                        onPrintFinishCallback.onFinish();
                    }
                };
            }
            this.mPrintHelper.printBitmap(str, uri, (android.support.p000v4.print.PrintHelperKitkat.OnPrintFinishCallback) r1);
        }
    }

    /* renamed from: android.support.v4.print.PrintHelper$PrintHelperStubImpl */
    static final class PrintHelperStubImpl implements PrintHelperVersionImpl {
        int mColorMode;
        int mOrientation;
        int mScaleMode;

        private PrintHelperStubImpl() {
            this.mScaleMode = 2;
            this.mColorMode = 2;
            this.mOrientation = 1;
        }

        public final void setScaleMode(int i) {
            this.mScaleMode = i;
        }

        public final int getColorMode() {
            return this.mColorMode;
        }

        public final void setColorMode(int i) {
            this.mColorMode = i;
        }

        public final void setOrientation(int i) {
            this.mOrientation = i;
        }

        public final int getOrientation() {
            return this.mOrientation;
        }

        public final int getScaleMode() {
            return this.mScaleMode;
        }

        public final void printBitmap(String str, Bitmap bitmap, OnPrintFinishCallback onPrintFinishCallback) {
        }

        public final void printBitmap(String str, Uri uri, OnPrintFinishCallback onPrintFinishCallback) {
        }
    }

    /* renamed from: android.support.v4.print.PrintHelper$PrintHelperVersionImpl */
    interface PrintHelperVersionImpl {
        int getColorMode();

        int getOrientation();

        int getScaleMode();

        void printBitmap(String str, Bitmap bitmap, OnPrintFinishCallback onPrintFinishCallback);

        void printBitmap(String str, Uri uri, OnPrintFinishCallback onPrintFinishCallback);

        void setColorMode(int i);

        void setOrientation(int i);

        void setScaleMode(int i);
    }

    public static boolean systemSupportsPrint() {
        if (VERSION.SDK_INT >= 19) {
            return true;
        }
        return false;
    }

    public PrintHelper(Context context) {
        if (systemSupportsPrint()) {
            this.mImpl = new PrintHelperKitkatImpl(context);
        } else {
            this.mImpl = new PrintHelperStubImpl();
        }
    }

    public final void setScaleMode(int i) {
        this.mImpl.setScaleMode(i);
    }

    public final int getScaleMode() {
        return this.mImpl.getScaleMode();
    }

    public final void setColorMode(int i) {
        this.mImpl.setColorMode(i);
    }

    public final int getColorMode() {
        return this.mImpl.getColorMode();
    }

    public final void setOrientation(int i) {
        this.mImpl.setOrientation(i);
    }

    public final int getOrientation() {
        return this.mImpl.getOrientation();
    }

    public final void printBitmap(String str, Bitmap bitmap) {
        this.mImpl.printBitmap(str, bitmap, (OnPrintFinishCallback) null);
    }

    public final void printBitmap(String str, Bitmap bitmap, OnPrintFinishCallback onPrintFinishCallback) {
        this.mImpl.printBitmap(str, bitmap, onPrintFinishCallback);
    }

    public final void printBitmap(String str, Uri uri) {
        this.mImpl.printBitmap(str, uri, (OnPrintFinishCallback) null);
    }

    public final void printBitmap(String str, Uri uri, OnPrintFinishCallback onPrintFinishCallback) {
        this.mImpl.printBitmap(str, uri, onPrintFinishCallback);
    }
}
