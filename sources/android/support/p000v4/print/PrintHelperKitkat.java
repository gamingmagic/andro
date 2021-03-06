package android.support.p000v4.print;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.pdf.PdfDocument.Page;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.CancellationSignal.OnCancelListener;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintAttributes.MediaSize;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentAdapter.LayoutResultCallback;
import android.print.PrintDocumentAdapter.WriteResultCallback;
import android.print.PrintDocumentInfo.Builder;
import android.print.PrintManager;
import android.print.pdf.PrintedPdfDocument;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: android.support.v4.print.PrintHelperKitkat */
class PrintHelperKitkat {
    public static final int COLOR_MODE_COLOR = 2;
    public static final int COLOR_MODE_MONOCHROME = 1;
    private static final String LOG_TAG = "PrintHelperKitkat";
    private static final int MAX_PRINT_SIZE = 3500;
    public static final int ORIENTATION_LANDSCAPE = 1;
    public static final int ORIENTATION_PORTRAIT = 2;
    public static final int SCALE_MODE_FILL = 2;
    public static final int SCALE_MODE_FIT = 1;
    int mColorMode = 2;
    final Context mContext;
    Options mDecodeOptions = null;
    /* access modifiers changed from: private */
    public final Object mLock = new Object();
    int mOrientation = 1;
    int mScaleMode = 2;

    /* renamed from: android.support.v4.print.PrintHelperKitkat$OnPrintFinishCallback */
    public interface OnPrintFinishCallback {
        void onFinish();
    }

    PrintHelperKitkat(Context context) {
        this.mContext = context;
    }

    public void setScaleMode(int i) {
        this.mScaleMode = i;
    }

    public int getScaleMode() {
        return this.mScaleMode;
    }

    public void setColorMode(int i) {
        this.mColorMode = i;
    }

    public void setOrientation(int i) {
        this.mOrientation = i;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getColorMode() {
        return this.mColorMode;
    }

    public void printBitmap(String str, Bitmap bitmap, OnPrintFinishCallback onPrintFinishCallback) {
        if (bitmap != null) {
            int i = this.mScaleMode;
            PrintManager printManager = (PrintManager) this.mContext.getSystemService("print");
            MediaSize mediaSize = MediaSize.UNKNOWN_PORTRAIT;
            if (bitmap.getWidth() > bitmap.getHeight()) {
                mediaSize = MediaSize.UNKNOWN_LANDSCAPE;
            }
            final String str2 = str;
            final Bitmap bitmap2 = bitmap;
            final int i2 = i;
            final OnPrintFinishCallback onPrintFinishCallback2 = onPrintFinishCallback;
            printManager.print(str, new PrintDocumentAdapter() {
                private PrintAttributes mAttributes;

                public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, LayoutResultCallback layoutResultCallback, Bundle bundle) {
                    this.mAttributes = printAttributes2;
                    layoutResultCallback.onLayoutFinished(new Builder(str2).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
                }

                public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, WriteResultCallback writeResultCallback) {
                    PrintedPdfDocument printedPdfDocument = new PrintedPdfDocument(PrintHelperKitkat.this.mContext, this.mAttributes);
                    Bitmap access$000 = PrintHelperKitkat.this.convertBitmapForColorMode(bitmap2, this.mAttributes.getColorMode());
                    try {
                        Page startPage = printedPdfDocument.startPage(1);
                        startPage.getCanvas().drawBitmap(access$000, PrintHelperKitkat.this.getMatrix(access$000.getWidth(), access$000.getHeight(), new RectF(startPage.getInfo().getContentRect()), i2), null);
                        printedPdfDocument.finishPage(startPage);
                        printedPdfDocument.writeTo(new FileOutputStream(parcelFileDescriptor.getFileDescriptor()));
                        writeResultCallback.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
                    } catch (IOException e) {
                        Log.e(PrintHelperKitkat.LOG_TAG, "Error writing printed content", e);
                        writeResultCallback.onWriteFailed(null);
                    } catch (Throwable th) {
                        printedPdfDocument.close();
                        if (parcelFileDescriptor != null) {
                            try {
                                parcelFileDescriptor.close();
                            } catch (IOException unused) {
                            }
                        }
                        if (access$000 != bitmap2) {
                            access$000.recycle();
                        }
                        throw th;
                    }
                    printedPdfDocument.close();
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (access$000 != bitmap2) {
                        access$000.recycle();
                    }
                }

                public void onFinish() {
                    if (onPrintFinishCallback2 != null) {
                        onPrintFinishCallback2.onFinish();
                    }
                }
            }, new PrintAttributes.Builder().setMediaSize(mediaSize).setColorMode(this.mColorMode).build());
        }
    }

    /* access modifiers changed from: private */
    public Matrix getMatrix(int i, int i2, RectF rectF, int i3) {
        float f;
        Matrix matrix = new Matrix();
        float width = rectF.width() / ((float) i);
        if (i3 == 2) {
            f = Math.max(width, rectF.height() / ((float) i2));
        } else {
            f = Math.min(width, rectF.height() / ((float) i2));
        }
        matrix.postScale(f, f);
        matrix.postTranslate((rectF.width() - (((float) i) * f)) / 2.0f, (rectF.height() - (((float) i2) * f)) / 2.0f);
        return matrix;
    }

    public void printBitmap(String str, Uri uri, OnPrintFinishCallback onPrintFinishCallback) {
        final String str2 = str;
        final Uri uri2 = uri;
        final OnPrintFinishCallback onPrintFinishCallback2 = onPrintFinishCallback;
        final int i = this.mScaleMode;
        C00952 r9 = new PrintDocumentAdapter() {
            private PrintAttributes mAttributes;
            Bitmap mBitmap = null;
            AsyncTask<Uri, Boolean, Bitmap> mLoadBitmap;

            public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, LayoutResultCallback layoutResultCallback, Bundle bundle) {
                this.mAttributes = printAttributes2;
                if (cancellationSignal.isCanceled()) {
                    layoutResultCallback.onLayoutCancelled();
                } else if (this.mBitmap != null) {
                    layoutResultCallback.onLayoutFinished(new Builder(str2).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
                } else {
                    final CancellationSignal cancellationSignal2 = cancellationSignal;
                    final PrintAttributes printAttributes3 = printAttributes2;
                    final PrintAttributes printAttributes4 = printAttributes;
                    final LayoutResultCallback layoutResultCallback2 = layoutResultCallback;
                    this.mLoadBitmap = new AsyncTask<Uri, Boolean, Bitmap>() {
                        /* access modifiers changed from: protected */
                        public void onPreExecute() {
                            cancellationSignal2.setOnCancelListener(new OnCancelListener() {
                                public void onCancel() {
                                    C00952.this.cancelLoad();
                                    C00961.this.cancel(false);
                                }
                            });
                        }

                        /* access modifiers changed from: protected */
                        public Bitmap doInBackground(Uri... uriArr) {
                            try {
                                return PrintHelperKitkat.this.loadConstrainedBitmap(uri2, PrintHelperKitkat.MAX_PRINT_SIZE);
                            } catch (FileNotFoundException unused) {
                                return null;
                            }
                        }

                        /* access modifiers changed from: protected */
                        public void onPostExecute(Bitmap bitmap) {
                            super.onPostExecute(bitmap);
                            C00952.this.mBitmap = bitmap;
                            if (bitmap != null) {
                                layoutResultCallback2.onLayoutFinished(new Builder(str2).setContentType(1).setPageCount(1).build(), !printAttributes3.equals(printAttributes4));
                            } else {
                                layoutResultCallback2.onLayoutFailed(null);
                            }
                            C00952.this.mLoadBitmap = null;
                        }

                        /* access modifiers changed from: protected */
                        public void onCancelled(Bitmap bitmap) {
                            layoutResultCallback2.onLayoutCancelled();
                            C00952.this.mLoadBitmap = null;
                        }
                    }.execute(new Uri[0]);
                }
            }

            /* access modifiers changed from: private */
            public void cancelLoad() {
                synchronized (PrintHelperKitkat.this.mLock) {
                    if (PrintHelperKitkat.this.mDecodeOptions != null) {
                        PrintHelperKitkat.this.mDecodeOptions.requestCancelDecode();
                        PrintHelperKitkat.this.mDecodeOptions = null;
                    }
                }
            }

            public void onFinish() {
                super.onFinish();
                cancelLoad();
                if (this.mLoadBitmap != null) {
                    this.mLoadBitmap.cancel(true);
                }
                if (onPrintFinishCallback2 != null) {
                    onPrintFinishCallback2.onFinish();
                }
                if (this.mBitmap != null) {
                    this.mBitmap.recycle();
                    this.mBitmap = null;
                }
            }

            public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, WriteResultCallback writeResultCallback) {
                PrintedPdfDocument printedPdfDocument = new PrintedPdfDocument(PrintHelperKitkat.this.mContext, this.mAttributes);
                Bitmap access$000 = PrintHelperKitkat.this.convertBitmapForColorMode(this.mBitmap, this.mAttributes.getColorMode());
                try {
                    Page startPage = printedPdfDocument.startPage(1);
                    startPage.getCanvas().drawBitmap(access$000, PrintHelperKitkat.this.getMatrix(this.mBitmap.getWidth(), this.mBitmap.getHeight(), new RectF(startPage.getInfo().getContentRect()), i), null);
                    printedPdfDocument.finishPage(startPage);
                    printedPdfDocument.writeTo(new FileOutputStream(parcelFileDescriptor.getFileDescriptor()));
                    writeResultCallback.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
                } catch (IOException e) {
                    Log.e(PrintHelperKitkat.LOG_TAG, "Error writing printed content", e);
                    writeResultCallback.onWriteFailed(null);
                } catch (Throwable th) {
                    printedPdfDocument.close();
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException unused) {
                        }
                    }
                    if (access$000 != this.mBitmap) {
                        access$000.recycle();
                    }
                    throw th;
                }
                printedPdfDocument.close();
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (IOException unused2) {
                    }
                }
                if (access$000 != this.mBitmap) {
                    access$000.recycle();
                }
            }
        };
        PrintManager printManager = (PrintManager) this.mContext.getSystemService("print");
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        builder.setColorMode(this.mColorMode);
        if (this.mOrientation == 1) {
            builder.setMediaSize(MediaSize.UNKNOWN_LANDSCAPE);
        } else if (this.mOrientation == 2) {
            builder.setMediaSize(MediaSize.UNKNOWN_PORTRAIT);
        }
        printManager.print(str, r9, builder.build());
    }

    /* access modifiers changed from: private */
    public Bitmap loadConstrainedBitmap(Uri uri, int i) {
        Options options;
        if (i <= 0 || uri == null || this.mContext == null) {
            throw new IllegalArgumentException("bad argument to getScaledBitmap");
        }
        Options options2 = new Options();
        options2.inJustDecodeBounds = true;
        loadBitmap(uri, options2);
        int i2 = options2.outWidth;
        int i3 = options2.outHeight;
        if (i2 <= 0 || i3 <= 0) {
            return null;
        }
        int max = Math.max(i2, i3);
        int i4 = 1;
        while (max > i) {
            max >>>= 1;
            i4 <<= 1;
        }
        if (i4 <= 0 || 0 >= Math.min(i2, i3) / i4) {
            return null;
        }
        synchronized (this.mLock) {
            this.mDecodeOptions = new Options();
            this.mDecodeOptions.inMutable = true;
            this.mDecodeOptions.inSampleSize = i4;
            options = this.mDecodeOptions;
        }
        try {
            Bitmap loadBitmap = loadBitmap(uri, options);
            synchronized (this.mLock) {
                this.mDecodeOptions = null;
            }
            return loadBitmap;
        } catch (Throwable th) {
            synchronized (this.mLock) {
                this.mDecodeOptions = null;
                throw th;
            }
        }
    }

    private Bitmap loadBitmap(Uri uri, Options options) {
        if (uri == null || this.mContext == null) {
            throw new IllegalArgumentException("bad argument to loadBitmap");
        }
        InputStream inputStream = null;
        try {
            InputStream openInputStream = this.mContext.getContentResolver().openInputStream(uri);
            inputStream = openInputStream;
            Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return decodeStream;
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public Bitmap convertBitmapForColorMode(Bitmap bitmap, int i) {
        if (i != 1) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }
}
