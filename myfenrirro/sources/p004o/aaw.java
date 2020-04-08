package p004o;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.AsyncTask;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import net.hockeyapp.android.PaintActivity;

/* renamed from: o.aaw */
public class aaw extends AsyncTask<File, Void, Void> {

    /* renamed from: 櫯 */
    final /* synthetic */ PaintActivity f151;

    /* renamed from: 鷭 */
    final /* synthetic */ Bitmap f152;

    public aaw(PaintActivity paintActivity, Bitmap bitmap) {
        this.f151 = paintActivity;
        this.f152 = bitmap;
    }

    /* access modifiers changed from: private */
    /* renamed from: 鷭 */
    public Void doInBackground(File... fileArr) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileArr[0]);
            this.f152.compress(CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            String str = "Could not save image.";
            IOException iOException = e;
            String str2 = "HockeyApp";
            if (acr.f312 <= 6) {
                Log.e(str2, str, iOException);
            }
        }
        return null;
    }
}
