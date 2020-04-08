package p004o;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import p004o.C0643pc.C0650;

/* renamed from: o.es */
class C0323es implements Runnable {

    /* renamed from: 鷭 */
    final /* synthetic */ C0317em f876;

    C0323es(C0317em emVar) {
        this.f876 = emVar;
    }

    public final void run() {
        boolean z;
        C0317em emVar = this.f876;
        for (int i = 0; i < emVar.f866.length; i++) {
            C0650 r4 = emVar.f866[i];
            int i2 = i;
            if (r4.f4480 == null) {
                C1014.f6147.mo3387((Runnable) new C0321eq(emVar, i2));
            } else {
                String str = r4.f4488 != null ? r4.f4488 : r4.f4480;
                int i3 = r4.f4508 != 0 ? r4.f4508 : r4.f4441;
                Socket socket = new Socket();
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    socket.connect(new InetSocketAddress(str, i3), 1000);
                    z = socket.isConnected();
                    socket.close();
                    if (Thread.currentThread().isInterrupted()) {
                        return;
                    }
                } catch (IOException e) {
                    e.getMessage();
                    z = false;
                }
                C1014.f6147.mo3387((Runnable) new C0322er(emVar, i2, !z ? -2 : (int) (System.currentTimeMillis() - currentTimeMillis)));
            }
        }
    }
}
