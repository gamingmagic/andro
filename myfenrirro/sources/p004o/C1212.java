package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ˮ̎ */
final class C1212 extends C0762sz {
    C1212() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 674;
        short s = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        if (!z) {
            if (C1014.f6137.f1636.f6538 == null) {
                C1014.f6137.f1636.f6538 = new C1302if();
            }
            if (C1014.f6137.f1636.f6538.f6567 == null) {
                C1014.f6137.f1636.f6538.f6567 = new C1305();
            }
            C1305 r6 = C1014.f6137.f1636.f6538.f6567;
            C1302if ifVar = C1014.f6137.f1636.f6538;
            if (s == C1328.ATK1.f6850) {
                ifVar.f6573 = (short) i3;
            } else if (s == C1328.MATK1.f6850) {
                ifVar.f6564 = (short) i3;
            } else if (s == C1328.HIT.f6850) {
                ifVar.f6562 = (short) i3;
            } else if (s == C1328.CRITICAL.f6850) {
                ifVar.f6550 = (short) i3;
            } else if (s == C1328.DEF1.f6850) {
                ifVar.f6551 = (short) i3;
            } else if (s == C1328.MDEF1.f6850) {
                ifVar.f6552 = (short) i3;
            } else if (s == C1328.MERCFLEE.f6850) {
                ifVar.f6553 = (short) i3;
            } else if (s == C1328.ASPD.f6850) {
                ifVar.f6565 = (short) i3;
            } else if (s == C1328.HP.f6850) {
                r6.f6599 = i3;
            } else if (s == C1328.MAXHP.f6850) {
                r6.f6597 = i3;
            } else if (s == C1328.SP.f6850) {
                r6.f6594 = i3;
            } else if (s == C1328.MAXSP.f6850) {
                r6.f6592 = i3;
            } else if (s == C1328.MERCKILLS.f6850) {
                ifVar.f6566 = i3;
            } else if (s == C1328.MERCFAITH.f6850) {
                r6.f6589 = (short) i3;
            }
            C1014.f6147.f51.f1455.mo4358();
        }
    }
}
