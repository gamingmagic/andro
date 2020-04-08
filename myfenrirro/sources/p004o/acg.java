package p004o;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Environment;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.UUID;
import net.hockeyapp.android.UpdateActivity;
import org.apache.http.HttpHeaders;
import p004o.aay.C0165;

/* renamed from: o.acg */
public class acg extends AsyncTask<Void, Integer, Long> {

    /* renamed from: Ą */
    protected String f264 = (Environment.getExternalStorageDirectory().getAbsolutePath() + "/Download");

    /* renamed from: ą */
    protected ProgressDialog f265;

    /* renamed from: Ć */
    private String f266;

    /* renamed from: ȃ */
    protected String f267 = (UUID.randomUUID() + ".apk");

    /* renamed from: ˮ͈ */
    protected String f268;

    /* renamed from: 櫯 */
    protected abn f269;

    /* renamed from: 鷭 */
    protected Context f270;

    /* access modifiers changed from: protected */
    public /* synthetic */ Object doInBackground(Object[] objArr) {
        return mo3484();
    }

    public acg(Activity activity, String str, abn abn) {
        this.f270 = activity;
        this.f268 = str;
        this.f269 = abn;
        this.f266 = null;
    }

    /* renamed from: 鷭 */
    public final void mo3487(UpdateActivity updateActivity) {
        this.f270 = updateActivity;
    }

    /* renamed from: 鷭 */
    public final void mo3485() {
        this.f270 = null;
        this.f265 = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: 櫯 */
    public Long mo3484() {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            HttpURLConnection r5 = m101(new URL(this.f268 + "&type=apk"), 6);
            r5.connect();
            int contentLength = r5.getContentLength();
            String contentType = r5.getContentType();
            if (contentType == null || !contentType.contains("text")) {
                File file = new File(this.f264);
                if (file.mkdirs() || file.exists()) {
                    File file2 = new File(file, this.f267);
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(r5.getInputStream());
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    byte[] bArr = new byte[1024];
                    long j = 0;
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        j += (long) read;
                        publishProgress(new Integer[]{Integer.valueOf(Math.round((((float) j) * 100.0f) / ((float) contentLength)))});
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.flush();
                    Long valueOf = Long.valueOf(j);
                    try {
                        fileOutputStream.close();
                        bufferedInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return valueOf;
                }
                throw new IOException("Could not create the dir(s):" + file.getAbsolutePath());
            }
            this.f266 = "The requested download does not appear to be a file.";
            return Long.valueOf(0);
        } catch (IOException e2) {
            e2.printStackTrace();
            Long valueOf2 = Long.valueOf(0);
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                    return valueOf2;
                }
            }
            if (inputStream != null) {
                inputStream.close();
            }
            return valueOf2;
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                    throw th;
                }
            }
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    /* renamed from: 鷭 */
    protected static HttpURLConnection m101(URL url, int i) {
        HttpURLConnection httpURLConnection;
        while (true) {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
            httpURLConnection = httpURLConnection2;
            httpURLConnection2.addRequestProperty("User-Agent", "HockeySDK/Android");
            httpURLConnection2.setInstanceFollowRedirects(true);
            if (VERSION.SDK_INT <= 9) {
                httpURLConnection2.setRequestProperty("connection", "close");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if ((responseCode == 301 || responseCode == 302 || responseCode == 303) && i != 0) {
                URL url2 = new URL(httpURLConnection.getHeaderField(HttpHeaders.LOCATION));
                if (url.getProtocol().equals(url2.getProtocol())) {
                    break;
                }
                httpURLConnection.disconnect();
                i--;
                url = url2;
            } else {
                return httpURLConnection;
            }
        }
        return httpURLConnection;
    }

    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public void onProgressUpdate(Integer... numArr) {
        try {
            if (this.f265 == null) {
                this.f265 = new ProgressDialog(this.f270);
                this.f265.setProgressStyle(1);
                this.f265.setMessage("Loading...");
                this.f265.setCancelable(false);
                this.f265.show();
            }
            this.f265.setProgress(numArr[0].intValue());
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public void onPostExecute(Long l) {
        String str;
        if (this.f265 != null) {
            try {
                this.f265.dismiss();
            } catch (Exception unused) {
            }
        }
        if (l.longValue() > 0) {
            this.f269.mo3449(this);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.fromFile(new File(this.f264, this.f267)), "application/vnd.android.package-archive");
            intent.setFlags(268435456);
            this.f270.startActivity(intent);
            return;
        }
        try {
            Builder builder = new Builder(this.f270);
            builder.setTitle(C0165.hockeyapp_download_failed_dialog_title);
            if (this.f266 == null) {
                str = this.f270.getString(C0165.hockeyapp_download_failed_dialog_message);
            } else {
                str = this.f266;
            }
            builder.setMessage(str);
            builder.setNegativeButton(C0165.hockeyapp_download_failed_dialog_negative_button, new ach(this));
            builder.setPositiveButton(C0165.hockeyapp_download_failed_dialog_positive_button, new aci(this));
            builder.create().show();
        } catch (Exception unused2) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ˮ͈ */
    public final String mo3483() {
        return this.f268 + "&type=apk";
    }
}
