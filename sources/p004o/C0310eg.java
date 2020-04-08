package p004o;

import com.libroserver.apk.R;
import java.util.HashMap;
import org.apache.commons.net.SocketClient;

/* renamed from: o.eg */
final class C0310eg {

    /* renamed from: 鷭 */
    HashMap<Integer, C0311> f843 = new HashMap<>();

    /* renamed from: o.eg$鷭 */
    class C0311 {

        /* renamed from: 櫯 */
        String f845;

        /* renamed from: 鷭 */
        C0586nm f846;

        C0311() {
        }
    }

    /* renamed from: 鷭 */
    private void m342() {
        String[] split;
        for (String str : C0622ot.m741(C1014.f6147.mo3388((int) R.raw.stateicon_extracted), C0618op.UTF8).split(SocketClient.NETASCII_EOL)) {
            String[] split2 = str.split("\t");
            if (split2.length >= 2) {
                try {
                    int parseInt = Integer.parseInt(split2[0]);
                    C0311 r9 = (C0311) this.f843.get(Integer.valueOf(parseInt));
                    if (r9 == null) {
                        r9 = new C0311();
                        r9.f846 = C0586nm.m664(parseInt);
                        this.f843.put(Integer.valueOf(parseInt), r9);
                    }
                    r9.f845 = split2[1];
                } catch (NumberFormatException unused) {
                    C0592ns.m674("Invalid stateicon resource ID line: " + str);
                }
            }
        }
    }

    C0310eg(C0248cl clVar) {
        C0453ix ixVar = C1014.f6147.f51;
        String str = "Reading sc_db...";
        if (ixVar.f1370 != null) {
            C1014.f6147.mo3387((Runnable) new C0473jm(ixVar));
        }
        C1014.f6147.mo3387((Runnable) new C0471jk(ixVar, str));
        m342();
    }
}
