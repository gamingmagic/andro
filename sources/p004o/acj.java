package p004o;

import android.app.Activity;
import java.io.IOException;
import java.net.URL;

/* renamed from: o.acj */
public final class acj extends acg {

    /* renamed from: Ć */
    public long f273;

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return mo3484();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onProgressUpdate(Object[] objArr) {
    }

    public acj(Activity activity, String str, abn abn) {
        super(activity, str, abn);
    }

    /* access modifiers changed from: protected */
    /* renamed from: 櫯 */
    public final Long mo3484() {
        try {
            return Long.valueOf((long) m101(new URL(mo3483()), 6).getContentLength());
        } catch (IOException e) {
            e.printStackTrace();
            return Long.valueOf(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public final void mo3488(Integer... numArr) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public final void onPostExecute(Long l) {
        this.f273 = l.longValue();
        if (this.f273 > 0) {
            this.f269.mo3449((acg) this);
        } else {
            this.f269.mo3450(Boolean.valueOf(false));
        }
    }
}
