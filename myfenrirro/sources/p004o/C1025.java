package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.Ę */
final class C1025 extends C0762sz {

    /* renamed from: 鷭 */
    static final String[] f6193 = {"Failed to lock account to lock-file", "Account has been locked to key-file", "Server closed", "Server is on maintenance mode", "Invalid PIN code", "Your IP is banned", "Account is bound to a different key-file", "Failed to lock your account: you are not a premium user."};

    C1025() {
    }

    static {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = -28669;
        short s = byteBuffer.getShort();
        if (!z) {
            String str = null;
            if (s < 0) {
                short s2 = (short) (-s);
                if (s2 < C1808.f8337.length) {
                    C0252cp cpVar = C1014.f6158;
                    int i3 = C1808.f8337[s2];
                    String r4 = C1014.f6160.mo3796(i3);
                    str = r4 == null ? "MSG" + i3 : r4;
                }
            } else if (s < C1803.f8333.length) {
                C0252cp cpVar2 = C1014.f6158;
                int i4 = C1803.f8333[s];
                String r42 = C1014.f6160.mo3796(i4);
                str = r42 == null ? "MSG" + i4 : r42;
            } else if (s > 1000) {
                short s3 = (short) (s - 1000);
                if (s3 < f6193.length) {
                    str = f6193[s3];
                }
            }
            C1014.f6156 = str;
            C1428 r3 = C1014.f6144;
            if (r3.f7007 != null) {
                r3.f7007.f7024 = true;
            }
        }
    }
}
