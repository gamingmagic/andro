package p004o;

import android.support.p000v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;
import org.apache.commons.net.telnet.TelnetCommand;

/* renamed from: o.Ǳ */
final class C1107 extends C0762sz {

    /* renamed from: 鷭 */
    static final int[] f6218 = {242, TelnetCommand.BREAK, TelnetCommand.f8999IP, -1};

    C1107() {
    }

    static {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 315;
        short s = byteBuffer.getShort();
        if (!z) {
            if (s == 0) {
                C1746 r0 = C1014.f6147.f51.f1427;
                C0252cp cpVar = C1014.f6158;
                String r5 = C1014.f6160.mo3796((int) TelnetCommand.BREAK);
                r0.mo4490(r5 == null ? "MSG243" : r5, 16711680);
            } else if (s == 1) {
                C1746 r02 = C1014.f6147.f51.f1427;
                C0252cp cpVar2 = C1014.f6158;
                String r52 = C1014.f6160.mo3796((int) TelnetCommand.f8999IP);
                r02.mo4490(r52 == null ? "MSG244" : r52, 16711680);
            } else if (s == 2) {
                C1746 r03 = C1014.f6147.f51.f1427;
                C0252cp cpVar3 = C1014.f6158;
                String r53 = C1014.f6160.mo3796((int) TelnetCommand.f8993AO);
                r03.mo4490(r53 == null ? "MSG245" : r53, 16711680);
            } else {
                if (s == 3) {
                    if (C1570.m2254(C1761.m2430(C1014.f6137.f1636.f1633).mo4502().f7485 & 4095) == C1570.ASSASSIN) {
                        C1746 r04 = C1014.f6147.f51.f1427;
                        C0252cp cpVar4 = C1014.f6158;
                        String r54 = C1014.f6160.mo3796(1041);
                        r04.mo4490(r54 == null ? "MSG1041" : r54, (int) SupportMenu.USER_MASK);
                    } else if (C1570.m2254(C1761.m2430(C1014.f6137.f1636.f1633).mo4502().f7485 & 255) == C1570.GUNSLINGER) {
                        C1746 r05 = C1014.f6147.f51.f1427;
                        C0252cp cpVar5 = C1014.f6158;
                        String r55 = C1014.f6160.mo3796(1176);
                        r05.mo4490(r55 == null ? "MSG1176" : r55, (int) SupportMenu.USER_MASK);
                    } else if (C1570.m2254(C1761.m2430(C1014.f6137.f1636.f1633).mo4502().f7485 & 255) != C1570.NINJA) {
                        C1746 r06 = C1014.f6147.f51.f1427;
                        C0252cp cpVar6 = C1014.f6158;
                        String r56 = C1014.f6160.mo3796((int) TelnetCommand.AYT);
                        r06.mo4490(r56 == null ? "MSG246" : r56, (int) SupportMenu.USER_MASK);
                    }
                }
            }
        }
    }
}
