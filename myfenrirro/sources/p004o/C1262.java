package p004o;

import android.graphics.Point;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: o.Κ */
final class C1262 extends C0917ws implements C0838ud {
    C1262() {
    }

    /* renamed from: 鷭 */
    public final void mo4051() {
        C0603oc ocVar = new C0603oc();
        ocVar.f2965 = -1;
        ocVar.f2962 = this.f5411;
        ocVar.f2948 = this.f5411;
        ocVar.f2945 = this.f5399;
        ocVar.f2931 = this.f5400;
        ocVar.f2932 = this.f5401;
        ocVar.f2933 = this.f5402;
        ocVar.f2934 = this.f5413;
        ocVar.f2949 = this.f5418;
        ocVar.f2958 = ByteBuffer.wrap(new byte[4]).order(ByteOrder.LITTLE_ENDIAN).putInt(this.f5412).getShort(0);
        ocVar.f2946 = ByteBuffer.wrap(new byte[4]).order(ByteOrder.LITTLE_ENDIAN).putInt(this.f5412).getShort(2);
        ocVar.f2935 = this.f5403;
        int i = this.f5421;
        ocVar.f2963 = this.f5416;
        ocVar.f2956 = this.f5422;
        ocVar.f2964 = this.f5414;
        ocVar.f2950 = this.f5419;
        ocVar.f2959 = this.f5404;
        ocVar.f2937 = this.f5405;
        ocVar.f2938 = this.f5406;
        ocVar.f2966 = this.f5424;
        ocVar.f2953 = this.f5415;
        ocVar.f2939 = this.f5407;
        ocVar.f2940 = this.f5408;
        C0213bh bhVar = new C0213bh(ByteBuffer.wrap(this.f5409));
        C0213bh bhVar2 = bhVar;
        ocVar.f2941 = new Point((short) (((bhVar2.f490[0] & 255) << 2) | ((bhVar2.f490[1] & 255) >> 6)), bhVar2.mo3562());
        ocVar.f2960 = this.f5410;
        ocVar.f2957 = this.f5420;
        ocVar.f2961 = this.f5417;
        C1388.m2094(ocVar, i, bhVar);
    }
}
