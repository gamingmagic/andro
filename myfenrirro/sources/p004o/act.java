package p004o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: o.act */
public final class act {
    /* renamed from: 鷭 */
    public static int m125(File file) {
        InputStream inputStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileInputStream fileInputStream2 = fileInputStream;
            int r2 = m126((InputStream) fileInputStream);
            fileInputStream2.close();
            return r2;
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    /* renamed from: 鷭 */
    public static int m123(Context context, Uri uri) {
        InputStream inputStream = null;
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            inputStream = openInputStream;
            return m126(openInputStream);
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    /* renamed from: 鷭 */
    private static int m126(InputStream inputStream) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            return 0;
        }
        return ((float) options.outWidth) / ((float) options.outHeight) > 1.0f ? 1 : 0;
    }

    /* renamed from: 鷭 */
    public static Bitmap m127(File file, int i, int i2) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        options.inSampleSize = m124(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(file.getAbsolutePath(), options);
    }

    /* renamed from: 鷭 */
    public static int m124(Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 > i2 && i7 / i5 > i) {
                i5 *= 2;
            }
        }
        return i5;
    }
}
