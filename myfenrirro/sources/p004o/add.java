package p004o;

import android.graphics.Bitmap;
import android.os.AsyncTask;

/* renamed from: o.add */
class add extends AsyncTask<Void, Void, Bitmap> {

    /* renamed from: 鷭 */
    final /* synthetic */ adc f356;

    add(adc adc) {
        this.f356 = adc;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f356.m164();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            this.f356.m169(bitmap, false);
        } else {
            this.f356.m171(false);
        }
    }
}
