package p004o;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/* renamed from: o.dj */
class C0275dj implements Runnable {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ boolean[] f733;

    /* renamed from: 櫯 */
    private final /* synthetic */ int[] f734;

    /* renamed from: 鷭 */
    final /* synthetic */ C0271df f735;

    C0275dj(C0271df dfVar, int[] iArr, boolean[] zArr) {
        this.f735 = dfVar;
        this.f734 = iArr;
        this.f733 = zArr;
    }

    public final void run() {
        boolean z;
        for (int i = 0; i < C1014.f6140.f4497.size(); i++) {
            int i2 = i;
            long currentTimeMillis = System.currentTimeMillis();
            String str = (String) C1014.f6140.f4497.get(i2);
            int intValue = ((Integer) C1014.f6140.f4519.get(i2)).intValue();
            Socket socket = new Socket();
            try {
                socket.connect(new InetSocketAddress(str, intValue), 1000);
                z = socket.isConnected();
                socket.close();
            } catch (IOException e) {
                e.getMessage();
                z = false;
            }
            if (!z) {
                this.f734[i2] = -2;
            } else {
                this.f734[i2] = (int) (System.currentTimeMillis() - currentTimeMillis);
            }
        }
        this.f733[0] = true;
    }
}
