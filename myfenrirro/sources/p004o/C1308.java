package p004o;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import com.roworkshop.andro.c_activity;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: o.ր */
public class C1308 extends AsyncTask<Void, Integer, C0248cl> {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ ProgressDialog f6602;

    /* renamed from: 櫯 */
    private final /* synthetic */ File f6603;

    /* renamed from: 鷭 */
    final /* synthetic */ c_activity f6604;

    public C1308(c_activity c_activity, File file, ProgressDialog progressDialog) {
        this.f6604 = c_activity;
        this.f6603 = file;
        this.f6602 = progressDialog;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object... objArr) {
        Thread.currentThread().setName("AsyncTask: initialize resource filesystem");
        return new C0248cl(this.f6604.f51, C1014.f6160, this.f6603.getAbsolutePath(), new ArrayList(Arrays.asList(C0248cl.m802(this.f6603, null))), false);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        C0248cl clVar = (C0248cl) obj;
        super.onPostExecute(clVar);
        this.f6602.setProgress(100);
        this.f6602.dismiss();
        try {
            C1014.f6161.f6167 = (byte[]) clVar.mo3613("data/clientinfo.xml", false);
            C1014.f6160.mo3792();
            C1014.f6161.mo4256(false);
        } catch (C0825tu e) {
            throw new C0822tr((Exception) e);
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onProgressUpdate(Object... objArr) {
        Integer[] numArr = (Integer[]) objArr;
        super.onProgressUpdate(numArr);
        this.f6602.setProgress(numArr[0].intValue());
    }
}
