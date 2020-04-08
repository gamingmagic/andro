package p004o;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;
import java.util.Queue;
import p004o.aay.C0165;

/* renamed from: o.aby */
public final class aby {

    /* renamed from: 櫯 */
    boolean f236;

    /* renamed from: 鷭 */
    public Queue<C0169if> f237;

    /* renamed from: o.aby$if */
    public static class C0169if {

        /* renamed from: ȃ */
        int f238;

        /* renamed from: ˮ͈ */
        boolean f239;

        /* renamed from: 櫯 */
        final adc f240;

        /* renamed from: 鷭 */
        final abt f241;

        public /* synthetic */ C0169if(abt abt, adc adc, abz abz) {
            this(abt, adc);
        }

        private C0169if(abt abt, adc adc) {
            this.f241 = abt;
            this.f240 = adc;
            this.f239 = false;
            this.f238 = 2;
        }
    }

    /* renamed from: o.aby$櫯 */
    static class C0170 extends AsyncTask<Void, Integer, Boolean> {

        /* renamed from: Ą */
        private int f242 = 0;

        /* renamed from: ȃ */
        private Bitmap f243 = null;

        /* renamed from: ˮ͈ */
        private File f244 = C1012zy.m1808();

        /* renamed from: 櫯 */
        private final Handler f245;

        /* renamed from: 鷭 */
        private final C0169if f246;

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return m84();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            Boolean bool = (Boolean) obj;
            adc adc = this.f246.f240;
            this.f246.f239 = bool.booleanValue();
            if (bool.booleanValue()) {
                adc.setImage(this.f243, this.f242);
            } else {
                if (!(this.f246.f238 > 0)) {
                    adc.f350.setText(C0165.hockeyapp_feedback_attachment_error);
                }
            }
            this.f245.sendEmptyMessage(0);
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void onProgressUpdate(Object[] objArr) {
        }

        public C0170(C0169if ifVar, abz abz) {
            this.f246 = ifVar;
            this.f245 = abz;
        }

        /* access modifiers changed from: protected */
        public final void onPreExecute() {
        }

        /* renamed from: 鷭 */
        private Boolean m84() {
            boolean z;
            abt abt = this.f246.f241;
            abt abt2 = abt;
            File r5 = C1012zy.m1808();
            if (!r5.exists() || !r5.isDirectory()) {
                z = false;
            } else {
                File[] listFiles = r5.listFiles(new abu(abt));
                z = listFiles != null && listFiles.length == 1;
            }
            if (z) {
                String str = "Cached...";
                String str2 = "HockeyApp";
                if (acr.f312 <= 6) {
                    Log.e(str2, str);
                }
                m83();
                return Boolean.valueOf(true);
            }
            String str3 = "Downloading...";
            String str4 = "HockeyApp";
            if (acr.f312 <= 6) {
                Log.e(str4, str3);
            }
            abt abt3 = abt2;
            boolean r3 = m85(abt2.f209, abt3.f211 + abt3.f212);
            if (r3) {
                m83();
            }
            return Boolean.valueOf(r3);
        }

        /* renamed from: 櫯 */
        private void m83() {
            try {
                abt abt = this.f246.f241;
                String str = abt.f211 + abt.f212;
                adc adc = this.f246.f240;
                this.f242 = act.m125(new File(this.f244, str));
                this.f243 = act.m127(new File(this.f244, str), this.f242 == 1 ? adc.f344 : adc.f348, this.f242 == 1 ? adc.f345 : adc.f343);
            } catch (IOException e) {
                e.printStackTrace();
                this.f243 = null;
            }
        }

        /* renamed from: 鷭 */
        private boolean m85(String str, String str2) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.addRequestProperty("User-Agent", "HockeySDK/Android");
                httpURLConnection.setInstanceFollowRedirects(true);
                if (VERSION.SDK_INT <= 9) {
                    httpURLConnection.setRequestProperty("connection", "close");
                }
                httpURLConnection.connect();
                int contentLength = httpURLConnection.getContentLength();
                String headerField = httpURLConnection.getHeaderField("Status");
                if (headerField != null && !headerField.startsWith("200")) {
                    return false;
                }
                File file = new File(this.f244, str2);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[1024];
                long j = 0;
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    j += (long) read;
                    publishProgress(new Integer[]{Integer.valueOf((int) ((100 * j) / ((long) contentLength)))});
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.flush();
                fileOutputStream.close();
                bufferedInputStream.close();
                return j > 0;
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    /* renamed from: o.aby$鷭 */
    public static class C0171 {

        /* renamed from: 鷭 */
        public static final aby f247 = new aby(null);

        static {
        }
    }

    /* synthetic */ aby(abz abz) {
        this();
    }

    private aby() {
        this.f237 = new LinkedList();
        this.f236 = false;
    }

    /* renamed from: 鷭 */
    public final void mo3465() {
        if (!this.f236) {
            C0169if ifVar = (C0169if) this.f237.peek();
            if (ifVar != null) {
                C0170 r2 = new C0170(ifVar, new abz(this));
                this.f236 = true;
                acn.m116(r2);
            }
        }
    }
}
