package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.띥 */
final class C1944 extends C0762sz {

    /* renamed from: 鷭 */
    C1945 f8735 = new C1945();

    /* renamed from: o.띥$鷭 */
    class C1945 {

        /* renamed from: ˮ͈ */
        byte[] f8737 = new byte[32];

        /* renamed from: 櫯 */
        byte[] f8738 = new byte[16];

        /* renamed from: 鷭 */
        int f8739;

        C1945() {
        }
    }

    C1944() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = -28637;
        this.f8735.f8739 = byteBuffer.getInt();
        byteBuffer.get(this.f8735.f8738);
        byteBuffer.get(this.f8735.f8737);
        if (!z) {
            C1014.f6144.f7003.f2994 = this.f8735.f8739;
            C1014.f6144.f7003.f2993 = this.f8735.f8738;
            C1014.f6144.f7003.f2990 = this.f8735.f8737;
            C1357 r8 = C1014.f6144.f7003;
            r8.f2995 = true;
            if (r8.f2995) {
                r8.f2991 = ByteBuffer.allocate(16);
            } else {
                r8.f2991 = null;
            }
            C1357 r7 = C1014.f6144.f7003;
            if (r7.f2993 != null) {
                if (r7.f2992 == null) {
                    r7.f2992 = new byte[(r7.f2993.length + 16)];
                }
                for (int i3 = 0; i3 < r7.f2993.length; i3++) {
                    r7.f2992[i3] = r7.f2993[i3];
                }
                for (int length = r7.f2993.length; length < r7.f2992.length; length++) {
                    r7.f2992[length] = (byte) ((int) ((Math.random() - 0.5d) * 255.0d));
                }
            }
            C1014.f6160.mo3805("v1", 0, String.valueOf(r7.f2994));
            C1014.f6160.mo3805("v2", 0, C0622ot.m723(r7.f2992));
            C1014.f6160.mo3805("v3", 0, C0622ot.m723(r7.f2990));
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
