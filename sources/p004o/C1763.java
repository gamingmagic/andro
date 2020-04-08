package p004o;

import android.graphics.Point;
import java.nio.ByteBuffer;

/* renamed from: o.輞 */
final class C1763 extends C0762sz {
    C1763() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2319;
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
        C0212bg bgVar = new C0212bg(byteBuffer);
        C0212bg bgVar2 = bgVar;
        ocVar.f2941 = new Point((short) (((bgVar2.f489[0] & 255) << 2) | ((bgVar2.f489[1] & 255) >> 6)), (short) ((((bgVar2.f489[1] & 255) & 63) << 4) | ((bgVar2.f489[2] & 255) >> 4)));
        ocVar.f2942 = (short) (bgVar.f489[2] & 15);
        ocVar.f2960 = byteBuffer.get();
        ocVar.f2957 = byteBuffer.get();
        ocVar.f2961 = byteBuffer.getShort();
        ocVar.f2955 = byteBuffer.getShort();
        ocVar.f2947 = byteBuffer.getInt();
        ocVar.f2943 = byteBuffer.getInt();
        ocVar.f2951 = byteBuffer.get();
        ByteBuffer byteBuffer2 = byteBuffer;
        byte[] bArr = new byte[i];
        byteBuffer2.get(bArr);
        ocVar.f2954 = bArr;
        if (!z) {
            C0603oc ocVar2 = ocVar;
            C1014 r0 = C1014.f6161;
            C1014.m1841((C0520le) C0520le.m556(ocVar2));
        }
    }

    /* renamed from: 鷭 */
    static void m2436(C0603oc ocVar) {
        C1014 r0 = C1014.f6161;
        C1014.m1841((C0520le) C0520le.m556(ocVar));
    }
}
