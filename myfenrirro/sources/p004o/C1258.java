package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ˮ͢ */
final class C1258 extends C0762sz {
    C1258() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2548;
        long j = byteBuffer.getLong();
        C0560mn mnVar = C0560mn.values()[byteBuffer.get()];
        C0555mi miVar = C0555mi.values()[byteBuffer.get()];
        if (!z) {
            C1746 r0 = C1014.f6147.f51.f1427;
            C0252cp cpVar = C1014.f6158;
            int i3 = miVar.f1798;
            String r8 = C1014.f6160.mo3796(i3);
            r0.mo4490(r8 == null ? "MSG" + i3 : r8, 16776960);
            C1973 r6 = C1014.f6147.f51.f1433.f782;
            if (r6.f8782 == j && r6.f8783 == mnVar) {
                C1014.f6147.f51.f1433.mo3657(new C1992[0]);
            }
        }
    }
}
