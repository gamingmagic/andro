package p004o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import org.apache.commons.net.SocketClient;

/* renamed from: o.acw */
public final class acw {

    /* renamed from: ˮ͈ */
    private static final char[] f324 = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    /* renamed from: Ą */
    private boolean f325 = false;

    /* renamed from: ȃ */
    private boolean f326 = false;

    /* renamed from: 櫯 */
    String f327;

    /* renamed from: 鷭 */
    ByteArrayOutputStream f328 = new ByteArrayOutputStream();

    static {
    }

    public acw() {
        StringBuffer stringBuffer = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            stringBuffer.append(f324[random.nextInt(f324.length)]);
        }
        this.f327 = stringBuffer.toString();
    }

    /* renamed from: 鷭 */
    public final void mo3509() {
        if (!this.f325) {
            this.f328.write(("--" + this.f327 + SocketClient.NETASCII_EOL).getBytes());
        }
        this.f325 = true;
    }

    /* renamed from: 櫯 */
    public final void mo3508() {
        if (!this.f326) {
            try {
                this.f328.write(("\r\n--" + this.f327 + "--\r\n").getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.f326 = true;
        }
    }

    /* renamed from: 鷭 */
    public final void mo3510(String str, String str2, InputStream inputStream, String str3, boolean z) {
        mo3509();
        try {
            String str4 = "Content-Type: " + str3 + SocketClient.NETASCII_EOL;
            this.f328.write(("Content-Disposition: form-data; name=\"" + str + "\"; filename=\"" + str2 + "\"\r\n").getBytes());
            this.f328.write(str4.getBytes());
            this.f328.write("Content-Transfer-Encoding: binary\r\n\r\n".getBytes());
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                this.f328.write(bArr, 0, read);
            }
            this.f328.flush();
            if (z) {
                mo3508();
            } else {
                this.f328.write(("\r\n--" + this.f327 + SocketClient.NETASCII_EOL).getBytes());
            }
            try {
            } catch (IOException e) {
                e.printStackTrace();
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: ˮ͈ */
    public final long mo3507() {
        mo3508();
        return (long) this.f328.toByteArray().length;
    }

    /* renamed from: ȃ */
    public final ByteArrayOutputStream mo3506() {
        mo3508();
        return this.f328;
    }
}
