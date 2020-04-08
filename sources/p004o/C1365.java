package p004o;

import android.support.p000v4.internal.view.SupportMenu;
import com.roworkshop.p003ro.natives;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: o.ᠡ */
class C1365 implements Runnable {

    /* renamed from: 櫯 */
    private final /* synthetic */ C0839ue f6905;

    /* renamed from: 鷭 */
    final /* synthetic */ C1428 f6906;

    C1365(C1428 r1, C0839ue ueVar) {
        this.f6906 = r1;
        this.f6905 = ueVar;
    }

    public final void run() {
        C1428 r5 = this.f6906;
        C0839ue ueVar = this.f6905;
        if (ueVar.mo4090() == 0) {
            throw new RuntimeException("Trying to send " + ueVar.getClass() + " with zero header. Probably packet header not set in the constructor.");
        } else if (r5.f7007 != null && r5.f7007.f7030.isConnected() && !r5.f7007.f7030.isClosed()) {
            synchronized (r5.f7007) {
                C0564mr mrVar = C0595nv.f2879;
                if (!((mrVar == C0564mr.MOTR || mrVar == C0564mr.all) && r5.f7003.f2995)) {
                    int position = r5.f7007.f7032.position();
                    ueVar.mo4053(r5.f7007.f7032, true);
                    r5.mo4335(ueVar, r5.f7007.f7032, position);
                    if (r5.f7000 != null) {
                        int position2 = r5.f7007.f7032.position();
                        r5.f7007.f7032.position(position);
                        r5.f7000.mo4071(r5.f7007.f7032, (C0837uc) ueVar, C0622ot.m731(r5.f7007.f7032.getShort(position)));
                        r5.f7007.f7032.position(position2);
                    }
                    if (r5.f7001 != null) {
                        int position3 = r5.f7007.f7032.position();
                        r5.f7007.f7032.position(position);
                        r5.f7001.mo4079(r5.f7007.f7032, (C0837uc) ueVar, C0622ot.m731(r5.f7007.f7032.getShort(position)), true);
                        r5.f7007.f7032.position(position3);
                    }
                    r5.mo4334(ueVar, r5.f7007.f7032, position);
                    if (ueVar.getClass() != C0865uz.class) {
                        new StringBuilder("Sending ").append(ueVar.getClass()).append(" (0x").append(Integer.toHexString(C0622ot.m731(ueVar.mo4090()))).append("/").append(r5.f7007.f7032.position() - position).append(")");
                    }
                } else {
                    if (r5.f7012 == null) {
                        r5.f7012 = ByteBuffer.allocate(SupportMenu.USER_MASK).order(ByteOrder.LITTLE_ENDIAN);
                    }
                    r5.f7012.position(4);
                    ueVar.mo4053(r5.f7012, true);
                    r5.mo4335(ueVar, r5.f7012, 4);
                    r5.mo4334(ueVar, r5.f7012, 4);
                    if (ueVar.getClass() != C0865uz.class) {
                        new StringBuilder("AES Sending ").append(ueVar.getClass()).append(" (0x").append(Integer.toHexString(C0622ot.m731(ueVar.mo4090()))).append("/").append(r5.f7012.position() - 4).append(")");
                    }
                    r5.f7012.putInt(0, r5.f7012.position());
                    r5.f7007.f7032.position(r5.f7007.f7032.position() + natives.procpacketsend(r5.f7012.array(), r5.f7012.position(), r5.f7003.f2993, r5.f7007.f7032.array(), r5.f7007.f7032.position()));
                }
                r5.f7007.f7032.flip();
                try {
                    r5.f7007.f7030.getOutputStream().write(r5.f7007.f7032.array(), r5.f7007.f7032.position(), r5.f7007.f7032.remaining());
                    r5.f7007.f7030.getOutputStream().flush();
                } catch (IOException unused) {
                    C1428 r8 = r5;
                    if (r5.f7007 != null) {
                        r8.f7007.f7024 = true;
                    }
                }
                r5.f7007.f7032.position(0);
                r5.f7007.f7032.limit(r5.f7007.f7032.capacity());
            }
        }
    }
}
