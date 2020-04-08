package p004o;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: o.ka */
class C0487ka implements Runnable {

    /* renamed from: 鷭 */
    private final /* synthetic */ String f1529;

    C0487ka(String str) {
        this.f1529 = str;
    }

    public final void run() {
        Bitmap r2 = C1014.f6158.mo3616();
        if (r2 != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f1529);
                r2.compress(CompressFormat.JPEG, 50, fileOutputStream);
                fileOutputStream.close();
            } catch (IOException unused) {
            }
        }
    }
}
