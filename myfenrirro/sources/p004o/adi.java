package p004o;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.Log;
import java.io.IOException;

/* renamed from: o.adi */
class adi extends AsyncTask<Object, Void, Bitmap> {

    /* renamed from: 鷭 */
    final /* synthetic */ adh f367;

    adi(adh adh) {
        this.f367 = adh;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m175(objArr);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            this.f367.setImageBitmap(bitmap);
        }
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        this.f367.setAdjustViewBounds(true);
    }

    /* renamed from: 鷭 */
    private static Bitmap m175(Object... objArr) {
        Context context = objArr[0];
        try {
            return adh.m174(context.getContentResolver(), objArr[1], objArr[2].intValue(), objArr[3].intValue());
        } catch (IOException e) {
            String str = "Could not load image into ImageView.";
            IOException iOException = e;
            String str2 = "HockeyApp";
            if (acr.f312 <= 6) {
                Log.e(str2, str, iOException);
            }
            return null;
        }
    }
}
