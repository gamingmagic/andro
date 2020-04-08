package p004o;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.net.SocketClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.protocol.HTTP;

/* renamed from: o.acs */
public final class acs {

    /* renamed from: Ą */
    private acw f313;

    /* renamed from: ą */
    private int f314 = 120000;

    /* renamed from: ȃ */
    private String f315;

    /* renamed from: ˮ͈ */
    private final String f316;

    /* renamed from: 櫯 */
    public final Map<String, String> f317;

    /* renamed from: 鷭 */
    public String f318;

    public acs(String str) {
        this.f316 = str;
        this.f317 = new HashMap();
    }

    /* renamed from: 鷭 */
    public final acs mo3502(Map<String, String> map) {
        String str = HTTP.UTF_8;
        try {
            ArrayList arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                String encode = URLEncoder.encode(str2, str);
                arrayList.add(encode + "=" + URLEncoder.encode(str3, str));
            }
            String join = TextUtils.join("&", arrayList);
            String str4 = URLEncodedUtils.CONTENT_TYPE;
            this.f317.put("Content-Type", str4);
            this.f315 = join;
            return this;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: 鷭 */
    public final acs mo3501(Map<String, String> map, Context context, List<Uri> list) {
        try {
            this.f313 = new acw();
            this.f313.mo3509();
            for (String str : map.keySet()) {
                acw acw = this.f313;
                String str2 = (String) map.get(str);
                String str3 = str;
                acw acw2 = acw;
                acw.mo3509();
                acw2.f328.write(("Content-Disposition: form-data; name=\"" + str3 + "\"\r\n").getBytes());
                acw2.f328.write("Content-Type: text/plain; charset=UTF-8\r\n".getBytes());
                acw2.f328.write("Content-Transfer-Encoding: 8bit\r\n\r\n".getBytes());
                acw2.f328.write(str2.getBytes());
                acw2.f328.write(("\r\n--" + acw2.f327 + SocketClient.NETASCII_EOL).getBytes());
            }
            int i = 0;
            while (i < list.size()) {
                Uri uri = (Uri) list.get(i);
                boolean z = i == list.size() + -1;
                this.f313.mo3510("attachment" + i, uri.getLastPathSegment(), context.getContentResolver().openInputStream(uri), "application/octet-stream", z);
                i++;
            }
            this.f313.mo3508();
            this.f317.put("Content-Type", "multipart/form-data; boundary=" + this.f313.f327);
            return this;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: 鷭 */
    public final HttpURLConnection mo3500() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f316).openConnection();
        httpURLConnection.setConnectTimeout(this.f314);
        httpURLConnection.setReadTimeout(this.f314);
        if (VERSION.SDK_INT <= 9) {
            httpURLConnection.setRequestProperty("Connection", "close");
        }
        if (!TextUtils.isEmpty(this.f318)) {
            httpURLConnection.setRequestMethod(this.f318);
            if (!TextUtils.isEmpty(this.f315) || this.f318.equalsIgnoreCase(HttpPost.METHOD_NAME) || this.f318.equalsIgnoreCase(HttpPut.METHOD_NAME)) {
                httpURLConnection.setDoOutput(true);
            }
        }
        for (String str : this.f317.keySet()) {
            httpURLConnection.setRequestProperty(str, (String) this.f317.get(str));
        }
        if (!TextUtils.isEmpty(this.f315)) {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(httpURLConnection.getOutputStream(), HTTP.UTF_8));
            bufferedWriter.write(this.f315);
            bufferedWriter.flush();
            bufferedWriter.close();
        }
        if (this.f313 != null) {
            httpURLConnection.setRequestProperty("Content-Length", String.valueOf(this.f313.mo3507()));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            bufferedOutputStream.write(this.f313.mo3506().toByteArray());
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        }
        return httpURLConnection;
    }
}
