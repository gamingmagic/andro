package p004o;

import android.graphics.Point;
import java.nio.ByteBuffer;

/* renamed from: o.懞 */
final class C1600 extends C0762sz {
    C1600() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2039;
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
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        ocVar.f2954 = bArr;
        if (!z) {
            C1388.m2094(ocVar, i3, bhVar);
        }
    }
}
