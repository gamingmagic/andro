package p004o;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.widget.Button;
import com.libroserver.apk.R;
import java.nio.ByteBuffer;

/* renamed from: o.ɒ */
final class C1131 extends C0762sz {

    /* renamed from: o.ɒ$鷭 */
    enum C1132 {
        DISAPPEAR,
        DIE,
        LOGOFF,
        TELEPORT
    }

    C1131() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        C1919 r0;
        this.f4671 = 128;
        int i3 = byteBuffer.getInt();
        byte b = byteBuffer.get();
        if (!z) {
            C0520le leVar = (C0520le) C1014.f6137.f1637.get(i3);
            C0520le leVar2 = (C0520le) C1014.f6137.f1637.get(i3);
            if (leVar2 == null) {
                r0 = null;
            } else {
                r0 = C1919.class.isAssignableFrom(leVar2.getClass()) ? leVar2 : null;
            }
            C1919 r7 = r0;
            if ((b != C1132.DIE.ordinal() || r7 == null || r7.f1629 == C0587nn.NPC) ? false : true) {
                r7.mo4580(true);
                if (r7 == C1014.f6137.f1636) {
                    C0454if ifVar = C1014.f6147.f51.f1444;
                    Context context = ifVar.f1463.getContext();
                    if (ifVar.f1462 == null) {
                        Builder builder = new Builder(context);
                        Builder builder2 = builder;
                        builder.setView(ifVar.f1463);
                        ifVar.f1462 = builder2.create();
                        ifVar.f1462.show();
                        ((Button) ifVar.f1462.findViewById(R.id.button_respawn)).setOnClickListener(ifVar.f1461);
                        ((Button) ifVar.f1462.findViewById(R.id.button_cancel)).setOnClickListener(ifVar.f1460);
                    } else {
                        ifVar.f1462.show();
                    }
                }
                C0548mb mbVar = C1014.f6142.f1693;
                if (mbVar != null && mbVar.f1769 == leVar) {
                    C1014.f6142.mo3976(mbVar, true);
                }
            } else {
                C1014 r02 = C1014.f6161;
                C1014.m1839(i3);
            }
        }
    }
}
