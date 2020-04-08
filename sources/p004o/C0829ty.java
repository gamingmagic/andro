package p004o;

import android.support.p000v4.media.session.PlaybackStateCompat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.p005io.CopyStreamEvent;
import org.apache.commons.net.p005io.CopyStreamListener;
import org.apache.http.HttpHeaders;
import org.apache.http.protocol.HTTP;

/* renamed from: o.ty */
public abstract class C0829ty {

    /* renamed from: Ą */
    static HashSet<String> f5012 = new HashSet<>();

    /* renamed from: ȃ */
    static int f5013 = 100;

    /* renamed from: ˮ͈ */
    static int f5014 = 0;

    /* renamed from: 櫯 */
    static long f5015 = 0;

    /* renamed from: 鷭 */
    static URL f5016 = null;

    /* renamed from: o.ty$if */
    static class C0830if implements CopyStreamListener {

        /* renamed from: Ą */
        private long f5017 = System.currentTimeMillis();

        /* renamed from: ą */
        private long f5018 = 0;

        /* renamed from: ȃ */
        private long f5019 = 0;

        /* renamed from: ˮ͈ */
        private long f5020 = 0;

        /* renamed from: 櫯 */
        private long f5021 = 0;

        /* renamed from: 鷭 */
        C0813tl f5022;

        C0830if(C0813tl tlVar) {
            this.f5022 = tlVar;
        }

        public final void bytesTransferred(long j, int i, long j2) {
            long j3;
            if (C0829ty.f5015 != 0) {
                int i2 = i;
                this.f5019 += (long) i2;
                if (this.f5021 == 0) {
                    this.f5021 = System.currentTimeMillis();
                    j3 = 0;
                } else if (this.f5021 == System.currentTimeMillis()) {
                    j3 = 0;
                } else {
                    long currentTimeMillis = System.currentTimeMillis() - this.f5021;
                    long j4 = currentTimeMillis;
                    if (currentTimeMillis >= 1000) {
                        this.f5020 = ((this.f5019 / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) * 1000) / j4;
                        this.f5021 = System.currentTimeMillis();
                        this.f5019 = 0;
                    }
                    j3 = this.f5020;
                }
                long j5 = (100 * j) / C0829ty.f5015;
                if (this.f5017 < System.currentTimeMillis() - 300 || j5 != this.f5018) {
                    this.f5017 = System.currentTimeMillis();
                    this.f5018 = j5;
                    if (this.f5022 != null) {
                        this.f5022.mo3957("Downloading update\n[" + (C0829ty.f5014 + 1) + "/" + C0829ty.f5013 + "] " + C0829ty.f5016.getFile() + ":\n" + j5 + "% (" + C0622ot.m736(j) + "/" + C0622ot.m736(C0829ty.f5015) + ")\n" + j3 + " KBytes/s");
                    }
                }
            }
        }

        public final void bytesTransferred(CopyStreamEvent copyStreamEvent) {
            bytesTransferred(copyStreamEvent.getTotalBytesTransferred(), copyStreamEvent.getBytesTransferred(), copyStreamEvent.getStreamSize());
        }
    }

    /* renamed from: o.ty$櫯 */
    public static class C0831 {

        /* renamed from: 櫯 */
        public long f5023;

        /* renamed from: 鷭 */
        public long f5024;
    }

    /* renamed from: o.ty$鷭 */
    static final class C0832 extends GZIPInputStream {
        public C0832(InputStream inputStream) {
            super(inputStream);
        }

        /* renamed from: 鷭 */
        public final Inflater mo4120() {
            return this.inf;
        }
    }

    static {
    }

    /* renamed from: 櫯 */
    private static final URL m1525(String str) {
        try {
            URL url = new URL(str);
            return new URL(new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef()).toASCIIString());
        } catch (URISyntaxException e) {
            throw new C0822tr((Exception) e, true);
        } catch (MalformedURLException e2) {
            throw new C0822tr((Exception) e2, true);
        }
    }

    /* renamed from: 鷭 */
    public static synchronized void m1527(String str, String str2, String[] strArr, boolean z, C0813tl tlVar) {
        String str3;
        URL r4;
        synchronized (C0829ty.class) {
            C0813tl tlVar2 = tlVar;
            boolean z2 = z;
            int i = 1;
            loop0:
            while (true) {
                try {
                    URL r42 = m1525(str);
                    if (tlVar2 != null) {
                        tlVar2.mo3957("Opening\n" + r42.getFile());
                    }
                    FTPClient fTPClient = new FTPClient();
                    fTPClient.setConnectTimeout(60000);
                    fTPClient.connect(r42.getHost());
                    fTPClient.setDefaultTimeout(60000);
                    fTPClient.setDataTimeout(60000);
                    fTPClient.login("anonymous", "");
                    fTPClient.enterLocalPassiveMode();
                    fTPClient.setBufferSize(1000000);
                    fTPClient.setReceiveBufferSize(1000000);
                    fTPClient.setSendBufferSize(1000000);
                    fTPClient.setFileType(2);
                    fTPClient.setFileTransferMode(12);
                    for (int i2 = 0; i2 < strArr.length; i2++) {
                        str3 = strArr[i2];
                        if (str3 != null) {
                            r4 = m1525(new StringBuilder(String.valueOf(str)).append("/").append(str3).toString());
                            if (tlVar2 != null) {
                                tlVar2.mo3957("Downloading update\n[" + (i2 + 1) + "/" + strArr.length + "] " + str3);
                            }
                            FTPFile[] listFiles = fTPClient.listFiles(r4.getFile());
                            if (listFiles != null && listFiles.length > 0 && listFiles[0] != null) {
                                long size = listFiles[0].getSize();
                                String sb = new StringBuilder(String.valueOf(str2)).append("/").append(str3).toString();
                                C0622ot.m719(sb);
                                File file = new File(sb);
                                if (file.exists()) {
                                    if (!z2) {
                                        file.delete();
                                    } else {
                                        continue;
                                    }
                                }
                                if (new File(str2).getFreeSpace() < size) {
                                    throw new C0822tr("Can't download " + str3 + ": no device space left.", false);
                                }
                                File file2 = new File(new StringBuilder(String.valueOf(sb)).append(".tmp").toString());
                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                f5016 = r4;
                                f5015 = size;
                                f5014 = i2;
                                f5013 = strArr.length;
                                fTPClient.setCopyStreamListener(new C0830if(tlVar2));
                                if (!fTPClient.retrieveFile(r4.getFile(), fileOutputStream)) {
                                    throw new C0822tr("Failed to download " + r4.toString());
                                }
                                fileOutputStream.close();
                                if (file2.length() != size) {
                                    throw new C0822tr("Downloaded file " + r4.toString() + " has invalid size");
                                }
                                file2.renameTo(file);
                            }
                        }
                    }
                    fTPClient.disconnect();
                } catch (FileNotFoundException e) {
                    throw new C0822tr(e, "File " + str3 + " can't be opened for writing", true);
                } catch (MalformedURLException e2) {
                    throw new C0826tv((Exception) e2);
                } catch (SocketException e3) {
                    if (i > 0) {
                        i--;
                    } else {
                        throw new C0822tr(e3, e3.getMessage(), true);
                    }
                } catch (UnknownHostException e4) {
                    if (i > 0) {
                        i--;
                    } else {
                        throw new C0822tr((Exception) e4);
                    }
                } catch (IOException e5) {
                    if (e5.toString().contains("ENOSPC")) {
                        throw new C0822tr("Couldn't download file: no space left on device.");
                    } else if (e5.toString().contains("SocketTimeoutException")) {
                        if (i > 0) {
                            i--;
                        } else {
                            throw new C0822tr("Timeout while downloading file from FTP. Check your Internet connection.");
                        }
                    } else if (i > 0) {
                        i--;
                    } else {
                        throw new C0822tr(e5, e5.getMessage(), true);
                    }
                } catch (RuntimeException e6) {
                    if (e6.getMessage().contains("ENETUNREACH")) {
                        throw new C0822tr("Failed to download file from FTP: network is unreachable. Check your Internet connection\n\n" + e6.toString());
                    }
                    throw e6;
                }
            }
            throw new C0822tr("File not found on FTP: " + r4.getFile());
        }
    }

    /* renamed from: 鷭 */
    public static C0831 m1526(String str) {
        C0831 r3 = new C0831();
        if (f5012.contains(str)) {
            throw new C0825tu(new FileNotFoundException(), str, ":(");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) m1525(str).openConnection();
        httpURLConnection.setRequestProperty("Connection", HTTP.CONN_KEEP_ALIVE);
        httpURLConnection.setRequestProperty("User-agent", "AndRO");
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, HTTP.IDENTITY_CODING);
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200 || responseCode == 206) {
            try {
                r3.f5024 = Long.parseLong(httpURLConnection.getHeaderField("Content-Length"));
            } catch (NumberFormatException unused) {
                r3.f5024 = -1;
            }
            r3.f5023 = httpURLConnection.getLastModified();
            return r3;
        }
        throw new C0825tu(null, str, null);
    }

    /* JADX WARNING: type inference failed for: r22v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r22v2 */
    /* JADX WARNING: type inference failed for: r0v45, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v49, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v50, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v94, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v97, types: [o.ty$鷭] */
    /* JADX WARNING: type inference failed for: r1v84, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r22v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x04a8, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x04ce, code lost:
        throw new p004o.C0822tr(r5, "Failed to download " + r20 + " : connection timeout\n\n" + r5.getLocalizedMessage(), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04cf, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x04da, code lost:
        if (r5.toString().contains("ETIMEDOUT") != false) goto L_0x04dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0501, code lost:
        throw new p004o.C0822tr(r5, "Timeout occured while trying to download " + r20 + "\nCheck your Internet connection settings\n\n" + r5.getLocalizedMessage(), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0502, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0503, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x050e, code lost:
        if (r5.getMessage().contains("ENOSPC") != false) goto L_0x0510;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0518, code lost:
        throw new p004o.C0822tr(r5, "No space left on device", false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x051e, code lost:
        throw new java.lang.RuntimeException(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r6 = (long) r5.getContentLength();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x0175 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x04a8 A[ExcHandler: SocketTimeoutException (r5v2 'e' java.net.SocketTimeoutException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x04cf A[ExcHandler: RuntimeException (r5v1 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0503 A[ExcHandler: IOException (r5v0 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m1528(java.lang.String r20, java.io.File r21, boolean r22, boolean r23, p004o.C0653pe.C0654if r24, p004o.C0658ph r25) {
        /*
            java.util.HashSet<java.lang.String> r0 = f5012     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r1 = r20
            boolean r0 = r0.contains(r1)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            if (r0 == 0) goto L_0x002c
            o.tu r0 = new o.tu     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r1.<init>()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r3 = "to="
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r3 = r21
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r3 = r20
            r0.<init>(r1, r3, r2)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
        L_0x002c:
            r0 = r20
            java.net.URL r5 = m1525(r0)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            o.pe$if r0 = p004o.C0653pe.C0654if.SKIP     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r1 = r24
            if (r1 != r0) goto L_0x0051
            if (r21 == 0) goto L_0x0051
            r0 = r21
            boolean r0 = r0.exists()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            if (r0 == 0) goto L_0x0051
            if (r22 == 0) goto L_0x004f
            r0 = r21
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            byte[] r0 = p004o.C0622ot.m720(r0)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            return r0
        L_0x004f:
            r0 = 0
            return r0
        L_0x0051:
            java.lang.String r0 = r5.getProtocol()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r1 = "ftp"
            boolean r0 = r0.equals(r1)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            if (r0 == 0) goto L_0x0091
            r0 = r21
            java.io.File r0 = r0.getParentFile()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r2 = r21
            java.lang.String r2 = r2.getName()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r3 = 0
            r1[r3] = r2     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            o.pe$if r2 = p004o.C0653pe.C0654if.SKIP     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r3 = r24
            if (r3 != r2) goto L_0x007b
            r2 = 1
            goto L_0x007c
        L_0x007b:
            r2 = 0
        L_0x007c:
            r3 = r20
            r4 = 0
            m1527(r3, r0, r1, r2, r4)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            if (r22 == 0) goto L_0x008f
            r0 = r21
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            byte[] r0 = p004o.C0622ot.m720(r0)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            return r0
        L_0x008f:
            r0 = 0
            return r0
        L_0x0091:
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            if (r21 == 0) goto L_0x00ca
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r1 = r21
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r1 = ".tmp"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r14 = r0.toString()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.io.File r10 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r10.<init>(r14)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            boolean r0 = r10.exists()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            if (r0 == 0) goto L_0x00ca
            o.pe$if r0 = p004o.C0653pe.C0654if.RESUME     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r1 = r24
            if (r1 != r0) goto L_0x00c7
            long r12 = r10.length()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            goto L_0x00ca
        L_0x00c7:
            r10.delete()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
        L_0x00ca:
            r14 = 0
            java.net.URLConnection r0 = r5.openConnection()     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r5 = r0
            java.lang.String r0 = "Connection"
            java.lang.String r1 = "Keep-Alive"
            r5.setRequestProperty(r0, r1)     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            if (r23 == 0) goto L_0x00e4
            java.lang.String r0 = "Accept-Encoding"
            java.lang.String r1 = "gzip"
            r5.setRequestProperty(r0, r1)     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            goto L_0x00eb
        L_0x00e4:
            java.lang.String r0 = "Accept-Encoding"
            java.lang.String r1 = "identity"
            r5.setRequestProperty(r0, r1)     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
        L_0x00eb:
            java.lang.String r0 = "User-agent"
            java.lang.String r1 = "AndRO"
            r5.setRequestProperty(r0, r1)     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r0 = 0
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0112
            java.lang.String r0 = "Range"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r2 = "bytes="
            r1.<init>(r2)     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.StringBuilder r1 = r1.append(r12)     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r2 = "-"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r1 = r1.toString()     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r5.setRequestProperty(r0, r1)     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
        L_0x0112:
            r0 = 60000(0xea60, float:8.4078E-41)
            r5.setConnectTimeout(r0)     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r0 = 60000(0xea60, float:8.4078E-41)
            r5.setReadTimeout(r0)     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            int r23 = r5.getResponseCode()     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r0 = 0
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0130
            r0 = r23
            r1 = 206(0xce, float:2.89E-43)
            if (r0 == r1) goto L_0x0130
            r12 = 0
        L_0x0130:
            if (r21 == 0) goto L_0x016a
            r0 = r23
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L_0x016a
            o.pe$if r0 = p004o.C0653pe.C0654if.RETURN_NULL_IF_SAME_LASTMODIFIED     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r1 = r24
            if (r1 != r0) goto L_0x016a
            long r14 = r5.getLastModified()     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.util.Date r0 = new java.util.Date     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r0.<init>(r14)     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.util.Date r0 = new java.util.Date     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r1 = r21
            long r1 = r1.lastModified()     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r0.<init>(r1)     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            p004o.C0624ov.m756()     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r0 = 0
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x016a
            r0 = r21
            long r0 = r0.lastModified()     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x016a
            r5.disconnect()     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r0 = 0
            return r0
        L_0x016a:
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r5.getHeaderField(r0)     // Catch:{ NumberFormatException -> 0x0175 }
            long r6 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x017a
        L_0x0175:
            int r0 = r5.getContentLength()     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            long r6 = (long) r0     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
        L_0x017a:
            if (r22 == 0) goto L_0x01b3
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a1
            o.tr r0 = new o.tr     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r2 = "Requested resource "
            r1.<init>(r2)     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r2 = r20
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r2 = " is too large to store in memory"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r1 = r1.toString()     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r2 = 1
            r0.<init>(r1, r2)     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            throw r0     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
        L_0x01a1:
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ae
            o.of r9 = new o.of     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            int r0 = (int) r6     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r9.<init>(r0)     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            goto L_0x01b3
        L_0x01ae:
            o.of r9 = new o.of     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r9.<init>()     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
        L_0x01b3:
            java.io.InputStream r22 = r5.getInputStream()     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r16 = r5.getContentEncoding()     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            if (r16 == 0) goto L_0x01d1
            java.lang.String r0 = "gzip"
            r1 = r16
            boolean r0 = r1.equals(r0)     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            if (r0 == 0) goto L_0x01d1
            o.ty$鷭 r0 = new o.ty$鷭     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r1 = r22
            r0.<init>(r1)     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r8 = r0
            r22 = r0
        L_0x01d1:
            java.io.InputStream r17 = r5.getErrorStream()     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            if (r17 == 0) goto L_0x0225
            if (r22 == 0) goto L_0x01de
            r0 = r22
            r0.close()     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
        L_0x01de:
            o.ol r22 = new o.ol     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r0 = r22
            r1 = r17
            r0.<init>(r1)     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r0 = r22
            byte[] r24 = r0.mo4039()     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r18 = new java.lang.String     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r0 = r18
            r1 = r24
            r0.<init>(r1)     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r0 = r22
            java.io.InputStream r0 = r0.f3001     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r0.close()     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r0 = 0
            r1 = r22
            r1.f3001 = r0     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            o.tr r0 = new o.tr     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r2 = "Error "
            r1.<init>(r2)     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r2 = r23
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r2 = ": "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r2 = r18
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r1 = r1.toString()     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r0.<init>(r1)     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            throw r0     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
        L_0x0225:
            r0 = r23
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto L_0x02dd
            r0 = r23
            r1 = 206(0xce, float:2.89E-43)
            if (r0 == r1) goto L_0x02dd
            o.tu r0 = new o.tu     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r2 = "to="
            r1.<init>(r2)     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            if (r21 == 0) goto L_0x0243
            r2 = r21
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            goto L_0x0245
        L_0x0243:
            java.lang.String r2 = "memory"
        L_0x0245:
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r1 = r1.toString()     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r2 = 0
            r3 = r20
            r0.<init>(r2, r3, r1)     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            throw r0     // Catch:{ ConnectException -> 0x0254, EOFException -> 0x027c, UnknownHostException -> 0x02a4, FileNotFoundException -> 0x02b1, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
        L_0x0254:
            r23 = move-exception
            o.tr r0 = new o.tr     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r2 = "Failed to open remote file: "
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r2 = r20
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r2 = "\nCheck your Internet connection\n\n"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r2 = r23
            java.lang.String r2 = r2.getMessage()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r1 = r1.toString()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
        L_0x027c:
            r23 = move-exception
            o.tr r0 = new o.tr     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r2 = "Failed to download "
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r2 = r20
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r2 = "\nCheck your internet connection\n\n"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r2 = r23
            java.lang.String r2 = r2.getMessage()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r1 = r1.toString()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
        L_0x02a4:
            r23 = move-exception
            o.tr r0 = new o.tr     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r1 = r23
            java.lang.String r1 = r1.toString()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
        L_0x02b1:
            r23 = move-exception
            java.util.HashSet<java.lang.String> r0 = f5012     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r1 = r20
            r0.add(r1)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            o.tu r0 = new o.tu     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r2 = "to="
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            if (r21 == 0) goto L_0x02cb
            r2 = r21
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            goto L_0x02cd
        L_0x02cb:
            java.lang.String r2 = "memory"
        L_0x02cd:
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r1 = r1.toString()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r2 = r23
            r3 = r20
            r0.<init>(r2, r3, r1)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
        L_0x02dd:
            r23 = 0
            if (r21 == 0) goto L_0x0335
            r0 = r21
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            p004o.C0622ot.m719(r0)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r0 = r21
            boolean r0 = r0.exists()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            if (r0 == 0) goto L_0x02f7
            r0 = r21
            r0.delete()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
        L_0x02f7:
            java.io.FileOutputStream r23 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0308, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r0 = 0
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0301
            r0 = 1
            goto L_0x0302
        L_0x0301:
            r0 = 0
        L_0x0302:
            r1 = r23
            r1.<init>(r10, r0)     // Catch:{ FileNotFoundException -> 0x0308, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            goto L_0x0335
        L_0x0308:
            r16 = move-exception
            o.tr r0 = new o.tr     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r2 = "Failed to open file for writing: "
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r2 = r10.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r2 = ". More info:\n"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r2 = r16
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r1 = r1.toString()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r2 = r16
            r3 = 0
            r0.<init>(r2, r1, r3)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
        L_0x0335:
            r16 = 0
            r18 = r12
            r0 = 1048576(0x100000, float:1.469368E-39)
            byte[] r0 = new byte[r0]     // Catch:{ EOFException -> 0x03a4 }
            r24 = r0
        L_0x033f:
            r0 = r22
            r1 = r24
            int r11 = r0.read(r1)     // Catch:{ EOFException -> 0x03a4 }
            if (r11 <= 0) goto L_0x0389
            if (r9 == 0) goto L_0x0350
            r0 = r24
            r9.mo4027(r0, r11)     // Catch:{ EOFException -> 0x03a4 }
        L_0x0350:
            if (r23 == 0) goto L_0x035a
            r0 = r23
            r1 = r24
            r2 = 0
            r0.write(r1, r2, r11)     // Catch:{ EOFException -> 0x03a4 }
        L_0x035a:
            long r0 = (long) r11     // Catch:{ EOFException -> 0x03a4 }
            long r18 = r18 + r0
            if (r25 == 0) goto L_0x033f
            r0 = 250(0xfa, double:1.235E-321)
            long r0 = r16 + r0
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ EOFException -> 0x03a4 }
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x033f
            if (r8 == 0) goto L_0x037c
            java.util.zip.Inflater r0 = r8.mo4120()     // Catch:{ EOFException -> 0x03a4 }
            long r0 = r0.getBytesRead()     // Catch:{ EOFException -> 0x03a4 }
            long r0 = r0 + r12
            r2 = r25
            r2.mo3626(r0, r6)     // Catch:{ EOFException -> 0x03a4 }
            goto L_0x0383
        L_0x037c:
            r0 = r25
            r1 = r18
            r0.mo3626(r1, r6)     // Catch:{ EOFException -> 0x03a4 }
        L_0x0383:
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ EOFException -> 0x03a4 }
            goto L_0x033f
        L_0x0389:
            if (r25 == 0) goto L_0x03ca
            if (r8 == 0) goto L_0x039c
            java.util.zip.Inflater r0 = r8.mo4120()     // Catch:{ EOFException -> 0x03a4 }
            long r0 = r0.getBytesRead()     // Catch:{ EOFException -> 0x03a4 }
            long r0 = r0 + r12
            r2 = r25
            r2.mo3626(r0, r6)     // Catch:{ EOFException -> 0x03a4 }
            goto L_0x03ca
        L_0x039c:
            r0 = r25
            r1 = r18
            r0.mo3626(r1, r6)     // Catch:{ EOFException -> 0x03a4 }
            goto L_0x03ca
        L_0x03a4:
            if (r23 == 0) goto L_0x03ab
            r0 = r23
            r0.close()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
        L_0x03ab:
            r0 = r22
            r0.close()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r5.disconnect()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            o.tr r0 = new o.tr     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r2 = "Failed to download "
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r2 = r20
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            java.lang.String r1 = r1.toString()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
        L_0x03ca:
            if (r23 == 0) goto L_0x03d1
            r0 = r23
            r0.close()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
        L_0x03d1:
            r0 = r22
            r0.close()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r5.disconnect()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            if (r21 == 0) goto L_0x03eb
            r0 = r21
            r10.renameTo(r0)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r0 = 0
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x03eb
            r0 = r21
            r0.setLastModified(r14)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
        L_0x03eb:
            if (r9 == 0) goto L_0x0402
            r22 = r9
            java.nio.ByteBuffer r0 = r9.f2975     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            byte[] r0 = r0.array()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            r1 = r22
            java.nio.ByteBuffer r1 = r1.f2975     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            int r1 = r1.position()     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch:{ FileNotFoundException -> 0x0404, SocketTimeoutException -> 0x04a8, RuntimeException -> 0x04cf, IOException -> 0x0503 }
            return r0
        L_0x0402:
            r0 = 0
            return r0
        L_0x0404:
            r5 = move-exception
            if (r21 == 0) goto L_0x043c
            java.lang.String r0 = r5.toString()
            java.lang.String r1 = "EROFS"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x043c
            o.tr r0 = new o.tr
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Couldn't create file "
            r1.<init>(r2)
            r2 = r21
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ": file system is read-only\n\n"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r5.getMessage()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x043c:
            if (r21 == 0) goto L_0x0473
            java.lang.String r0 = r5.toString()
            java.lang.String r1 = "EACCES"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0473
            o.tr r0 = new o.tr
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Couldn't create file "
            r1.<init>(r2)
            r2 = r21
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ": file system access error\n\n"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r5.getMessage()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0473:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FileNotFoundException (url = "
            r0.<init>(r1)
            r1 = r20
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", to="
            java.lang.StringBuilder r0 = r0.append(r1)
            if (r21 == 0) goto L_0x048f
            r1 = r21
            java.lang.String r1 = r1.getAbsolutePath()
            goto L_0x0491
        L_0x048f:
            java.lang.String r1 = "memory"
        L_0x0491:
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "). Details:"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            p004o.C0624ov.m759(r0)
            o.tv r0 = new o.tv
            r0.<init>(r5)
            throw r0
        L_0x04a8:
            r5 = move-exception
            o.tr r0 = new o.tr
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to download "
            r1.<init>(r2)
            r2 = r20
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " : connection timeout\n\n"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r5.getLocalizedMessage()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r0.<init>(r5, r1, r2)
            throw r0
        L_0x04cf:
            r5 = move-exception
            java.lang.String r0 = r5.toString()
            java.lang.String r1 = "ETIMEDOUT"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0502
            o.tr r0 = new o.tr
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Timeout occured while trying to download "
            r1.<init>(r2)
            r2 = r20
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\nCheck your Internet connection settings\n\n"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r5.getLocalizedMessage()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r0.<init>(r5, r1, r2)
            throw r0
        L_0x0502:
            throw r5
        L_0x0503:
            r5 = move-exception
            java.lang.String r0 = r5.getMessage()
            java.lang.String r1 = "ENOSPC"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0519
            o.tr r0 = new o.tr
            java.lang.String r1 = "No space left on device"
            r2 = 0
            r0.<init>(r5, r1, r2)
            throw r0
        L_0x0519:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0829ty.m1528(java.lang.String, java.io.File, boolean, boolean, o.pe$if, o.ph):byte[]");
    }
}
