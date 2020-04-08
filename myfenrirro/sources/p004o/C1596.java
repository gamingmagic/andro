package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.憙 */
final class C1596 extends C0762sz {
    C1596() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2008;
        short s = byteBuffer.getShort();
        byteBuffer.getShort();
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        if (!z) {
            m2277(s, b, b2);
        }
    }

    /* renamed from: 鷭 */
    static void m2277(short s, byte b, byte b2) {
        if (s < 0 || s >= C0579nf.values().length) {
            C0592ns.m674("PKT_MC_PARTYOPTION: Unexpected EXP value: " + s);
            return;
        }
        if (C1014.f6137.f1636.f6502 == null) {
            C1014.f6137.f1636.f6502 = new C0187ak();
        }
        C0579nf nfVar = C0579nf.values()[s];
        C0581nh nhVar = C0581nh.values()[b];
        C0580ng ngVar = C0580ng.values()[b2];
        if (C1014.f6137.f1636.f6502.f389 != nfVar) {
            C1014.f6137.f1636.f6502.f389 = nfVar;
            if (nfVar == C0579nf.EVEN_SHARE) {
                C1014.f6147.f51.f1427.mo4490("Party share EXP: Even Share", 16776960);
            } else {
                C1014.f6147.f51.f1427.mo4490("Party share EXP: Each Take", 16776960);
            }
        }
        if (C1014.f6137.f1636.f6502.f388 != ngVar) {
            C1014.f6137.f1636.f6502.f388 = ngVar;
            if (nhVar == C0581nh.PICKER) {
                C1014.f6147.f51.f1427.mo4490("Party pickup Items: Killer", 16776960);
            } else {
                C1014.f6147.f51.f1427.mo4490("Party pickup Items: Anyone", 16776960);
            }
        }
        if (C1014.f6137.f1636.f6502.f387 != nhVar) {
            C1014.f6137.f1636.f6502.f387 = nhVar;
            if (nhVar == C0581nh.PICKER) {
                C1014.f6147.f51.f1427.mo4490("Party share Items: Picker", 16776960);
            } else {
                C1014.f6147.f51.f1427.mo4490("Party share Items: Random", 16776960);
            }
        }
        if (C1014.f6147.f51.f1381.f1626.getParent() != null) {
            C1014.f6147.f51.f1381.mo3545();
        }
    }
}
