package p004o;

import android.support.p000v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: o.sw */
public final class C0758sw {

    /* renamed from: Ą */
    Class<?> f4652;

    /* renamed from: ą */
    public int f4653;

    /* renamed from: Ć */
    int f4654;

    /* renamed from: ȃ */
    public boolean f4655 = false;

    /* renamed from: ˮ͈ */
    public C0765ta f4656;

    /* renamed from: 櫯 */
    public int f4657;

    /* renamed from: 鷭 */
    public C0757sv f4658;

    public C0758sw(int i) {
        if (i == 0) {
            i = SupportMenu.USER_MASK;
        }
        if (i < 65535) {
            throw new IllegalArgumentException("recvbuf_size=" + i + " < MAX_PACKET_LENGTH=65535");
        }
        this.f4656 = new C0765ta(i);
    }

    /* renamed from: 鷭 */
    public final boolean mo4091(ByteBuffer byteBuffer, C0660pj pjVar, C0663pk pkVar) {
        int i;
        if (this.f4657 != 0) {
            if (byteBuffer.remaining() < 4) {
                return false;
            }
            int i2 = byteBuffer.getInt();
            if (i2 != this.f4657) {
                String str = "Unexpected account_id arrived: " + i2 + " instead of " + this.f4657;
                C0624ov.m759(new StringBuilder(String.valueOf(str)).append(" Packet dump: ").append(C0622ot.m737((Object) byteBuffer.array())).toString());
                throw new RuntimeException(str);
            }
            this.f4657 = 0;
            return true;
        } else if (byteBuffer.remaining() < 2) {
            return false;
        } else {
            int position = byteBuffer.position();
            int r5 = C0622ot.m731(byteBuffer.getShort(byteBuffer.position()));
            C0838ud udVar = (C0838ud) this.f4658.f4651.get(Integer.valueOf(r5));
            if (udVar == null) {
                C0622ot.m740(Arrays.copyOfRange(byteBuffer.array(), byteBuffer.position(), byteBuffer.position() + byteBuffer.remaining()), ",");
                C0624ov.m756();
                throw new C0823ts("Unexpected packet 0x" + Integer.toHexString(r5) + " received (probable length = " + byteBuffer.remaining() + ")\n Prev. packet: " + this.f4652 + " (0x" + Integer.toHexString(this.f4653) + ", " + this.f4654 + " bytes)\n");
            }
            int r6 = udVar.mo4050();
            if (r6 != -1) {
                i = r6 + 2;
            } else if (byteBuffer.remaining() < 4) {
                return false;
            } else {
                i = C0622ot.m731(byteBuffer.getShort(byteBuffer.position() + 2));
            }
            if (byteBuffer.remaining() < i) {
                return false;
            }
            this.f4652 = udVar.getClass();
            this.f4653 = r5;
            this.f4654 = i;
            if (!(r5 == C0636oz.BC_RESOURCECHUNK.f4229 || r5 == C0636oz.BC_KEEPALIVE_ACK.f4229 || r5 == C0636oz.CB_KEEPALIVE.f4229)) {
                new StringBuilder("Parsing ").append(udVar.getClass()).append(" (0x").append(Integer.toHexString(r5)).append("/").append(i).append(")");
                C0624ov.m757();
            }
            if (pjVar != null) {
                pjVar.mo4071(byteBuffer, (C0837uc) udVar, r5);
            }
            if (pkVar != null) {
                pkVar.mo4079(byteBuffer, (C0837uc) udVar, r5, false);
            }
            byteBuffer.position(byteBuffer.position() + 2);
            udVar.mo4097(byteBuffer);
            try {
                udVar.mo4051();
            } catch (C0828tx e) {
                e.getMessage();
                C0624ov.m757();
            }
            byteBuffer.position(position + i);
            return true;
        }
    }
}
