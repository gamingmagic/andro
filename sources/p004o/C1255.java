package p004o;

import java.nio.ByteBuffer;
import java.util.HashMap;

/* renamed from: o.ˮ͝ */
final class C1255 extends C0762sz {
    C1255() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 695;
        int i3 = byteBuffer.getInt();
        byte b = byteBuffer.get();
        if (!z) {
            C0238ce ceVar = (C0238ce) C1014.f6152.f7979.get(Integer.valueOf(i3));
            if (ceVar == null) {
                HashMap<Integer, C0238ce> hashMap = C1014.f6152.f7979;
                Integer valueOf = Integer.valueOf(i3);
                ceVar = new C0238ce();
                hashMap.put(valueOf, ceVar);
            }
            ceVar.f565 = b != 0 ? C0239if.ACTIVE : C0239if.INACTIVE;
            C1014.f6147.f51.f1392.mo3594();
        }
    }
}
