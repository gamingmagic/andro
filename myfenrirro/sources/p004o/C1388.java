package p004o;

import android.graphics.Point;
import java.nio.ByteBuffer;

/* renamed from: o.か */
final class C1388 extends C0762sz {
    C1388() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2324;
        C0603oc ocVar = new C0603oc();
        ocVar.f2965 = byteBuffer.get();
        ocVar.f2962 = byteBuffer.getInt();
        ocVar.f2945 = byteBuffer.getShort();
        ocVar.f2931 = byteBuffer.getShort();
        ocVar.f2932 = byteBuffer.getShort();
        ocVar.f2933 = byteBuffer.getInt();
        ocVar.f2934 = byteBuffer.getShort();
        ocVar.f2949 = byteBuffer.getShort();
        ocVar.f2958 = byteBuffer.getShort();
        ocVar.f2946 = byteBuffer.getShort();
        ocVar.f2935 = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        ocVar.f2963 = byteBuffer.getShort();
        ocVar.f2956 = byteBuffer.getShort();
        ocVar.f2964 = byteBuffer.getShort();
        ocVar.f2950 = byteBuffer.getShort();
        ocVar.f2959 = byteBuffer.getShort();
        ocVar.f2936 = C1014.f6140.f4492 ? byteBuffer.getShort() : 0;
        ocVar.f2937 = byteBuffer.getInt();
        ocVar.f2938 = byteBuffer.getShort();
        ocVar.f2966 = byteBuffer.getShort();
        ocVar.f2953 = byteBuffer.getInt();
        ocVar.f2939 = byteBuffer.get();
        ocVar.f2940 = byteBuffer.get();
        C0213bh bhVar = new C0213bh(byteBuffer);
        C0213bh bhVar2 = bhVar;
        ocVar.f2941 = new Point((short) (((bhVar2.f490[0] & 255) << 2) | ((bhVar2.f490[1] & 255) >> 6)), bhVar2.mo3562());
        ocVar.f2960 = byteBuffer.get();
        ocVar.f2957 = byteBuffer.get();
        ocVar.f2961 = byteBuffer.getShort();
        ocVar.f2955 = byteBuffer.getShort();
        ocVar.f2947 = byteBuffer.getInt();
        ocVar.f2943 = byteBuffer.getInt();
        ocVar.f2951 = byteBuffer.get();
        byteBuffer.get(new byte[i]);
        if (!z) {
            m2094(ocVar, i3, bhVar);
        }
    }

    /* renamed from: 鷭 */
    static void m2094(C0603oc ocVar, int i, C0213bh bhVar) {
        C0521lf lfVar = C1014.f6137;
        C0520le leVar = (C0520le) lfVar.f1637.get(ocVar.f2962);
        if (leVar == null) {
            leVar = C0520le.m556(ocVar);
            C1014 r0 = C1014.f6161;
            C1014.m1841(leVar);
        } else {
            leVar.mo3558(ocVar);
            C0540lv r14 = C1014.f6142.mo3978(ocVar.f2962);
            if (r14 != null) {
                r14.mo4018();
            }
        }
        C1919 r02 = (C1919) leVar;
        C0772tc tcVar = C1014.f6142.f1695.f7342;
        short s = (short) (((bhVar.f490[0] & 255) << 2) | ((bhVar.f490[1] & 255) >> 6));
        short r3 = bhVar.mo3562();
        short r4 = bhVar.mo3561();
        short r5 = bhVar.mo3560();
        C1428 r10 = C1014.f6144;
        r02.mo4582(tcVar, (int) s, (int) r3, (int) r4, (int) r5, C0622ot.m735(i) + (r10.f7010 - r10.f7013));
    }
}
