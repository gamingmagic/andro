package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.뢂 */
final class C1954 extends C0762sz {
    C1954() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 179;
        byte b = byteBuffer.get();
        if (!z) {
            if (b == 0) {
                C1746 r0 = C1014.f6147.f51.f1427;
                C0252cp cpVar = C1014.f6158;
                String r5 = C1014.f6160.mo3796(503);
                r0.mo4490(r5 == null ? "MSG503" : r5, 16711680);
                return;
            }
            C1014.f6144.mo4336(true);
            C0758sw swVar = C1014.f6144.f7018;
            swVar.f4656.f4678 = 0;
            swVar.f4656.f4677 = 0;
            if (C1014.f6144.f7007 != null) {
                C1014.f6144.f7007.f7022 = null;
            }
            C1014.f6148.mo3387(new C1588(this));
        }
    }
}
