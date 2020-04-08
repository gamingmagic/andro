package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.Ē */
final class C1023 extends C0762sz {
    C1023() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = -28638;
        if (!z) {
            C1357 r7 = C1014.f6144.f7003;
            r7.f2995 = true;
            if (r7.f2995) {
                r7.f2991 = ByteBuffer.allocate(16);
            } else {
                r7.f2991 = null;
            }
            C1428 r0 = C1014.f6144;
            try {
                Object[] objArr = new Object[3];
                objArr[2] = Integer.valueOf((int) C1014.m1823());
                objArr[1] = null;
                objArr[0] = null;
                r0.mo3652((C0839ue) C2116$.m2261("o.廅").getDeclaredConstructor(new Class[]{String.class, String.class, Integer.TYPE}).newInstance(objArr));
            } catch (Throwable th) {
                throw th.getCause();
            }
        }
    }
}
