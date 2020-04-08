package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.囃 */
final class C1541 extends C0762sz {
    C1541() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = -28635;
        if (!z) {
            C1357 r8 = C1014.f6144.f7003;
            r8.f2995 = true;
            if (r8.f2995) {
                r8.f2991 = ByteBuffer.allocate(16);
            } else {
                r8.f2991 = null;
            }
            C1428 r0 = C1014.f6144;
            int i3 = C1014.f6161.f6162;
            int i4 = C1014.f6161.f6169;
            int i5 = C1014.f6161.f6164.f6177;
            try {
                Object[] objArr = new Object[4];
                objArr[3] = Byte.valueOf(C1014.f6161.f6165.f2901);
                objArr[2] = Integer.valueOf(i5);
                objArr[1] = Integer.valueOf(i4);
                objArr[0] = Integer.valueOf(i3);
                r0.mo3652((C0839ue) $cON.m1858("o.Ŀ").getDeclaredConstructor(new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Byte.TYPE}).newInstance(objArr));
            } catch (Throwable th) {
                throw th.getCause();
            }
        }
    }
}
