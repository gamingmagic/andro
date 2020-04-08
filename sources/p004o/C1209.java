package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ˮ̋ */
final class C1209 extends C0762sz {

    /* renamed from: o.ˮ̋$鷭 */
    enum C1210 {
        party,
        guild,
        siege,
        mineffect,
        nolockon,
        countpk,
        nopartyformation,
        bg,
        noitemconsumption,
        usecart,
        summonstarmiracle
    }

    C1209() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2459;
        byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        if (!z) {
            if (((1 << C1210.party.ordinal()) & i3) > 0) {
                C1014.f6142.f1695.f7350 = C0575nb.FREEPVPZONE;
                C1014.f6142.f1695.f7345 = C0576nc.ARENA;
            }
            if (((1 << C1210.guild.ordinal()) & i3) > 0) {
                C1014.f6142.f1695.f7350 = C0575nb.AGITZONE;
                C1014.f6142.f1695.f7345 = C0576nc.AGIT;
            }
            if (((1 << C1210.siege.ordinal()) & i3) > 0) {
                C1014.f6142.f1695.f7350 = C0575nb.AGITZONE;
                C1014.f6142.f1695.f7345 = C0576nc.AGIT;
            }
        }
    }
}
