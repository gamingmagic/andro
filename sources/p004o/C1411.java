package p004o;

import android.graphics.Point;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: o.㖝 */
final class C1411 extends C0921ww implements C0838ud {
    C1411() {
    }

    /* renamed from: 鷭 */
    public final void mo4051() {
        C0603oc ocVar = new C0603oc();
        ocVar.f2965 = -1;
        ocVar.f2962 = this.f5508;
        ocVar.f2948 = this.f5508;
        ocVar.f2945 = this.f5498;
        ocVar.f2931 = this.f5486;
        ocVar.f2932 = this.f5487;
        ocVar.f2933 = this.f5488;
        ocVar.f2934 = this.f5489;
        ocVar.f2949 = this.f5500;
        ocVar.f2958 = ByteBuffer.wrap(new byte[4]).order(ByteOrder.LITTLE_ENDIAN).putInt(this.f5504).getShort(0);
        ocVar.f2946 = ByteBuffer.wrap(new byte[4]).order(ByteOrder.LITTLE_ENDIAN).putInt(this.f5504).getShort(2);
        ocVar.f2935 = this.f5499;
        ocVar.f2963 = this.f5490;
        ocVar.f2956 = this.f5506;
        ocVar.f2964 = this.f5503;
        ocVar.f2950 = this.f5507;
        ocVar.f2959 = this.f5501;
        ocVar.f2937 = this.f5505;
        ocVar.f2938 = this.f5491;
        ocVar.f2966 = this.f5492;
        ocVar.f2953 = this.f5493;
        ocVar.f2939 = this.f5509;
        ocVar.f2940 = this.f5502;
        C0212bg bgVar = new C0212bg(ByteBuffer.wrap(this.f5494));
        C0212bg bgVar2 = bgVar;
        ocVar.f2941 = new Point((short) (((bgVar2.f489[0] & 255) << 2) | ((bgVar2.f489[1] & 255) >> 6)), (short) ((((bgVar2.f489[1] & 255) & 63) << 4) | ((bgVar2.f489[2] & 255) >> 4)));
        ocVar.f2942 = (short) (bgVar.f489[2] & 15);
        ocVar.f2960 = this.f5495;
        ocVar.f2957 = this.f5496;
        ocVar.f2961 = this.f5497;
        C1763.m2436(ocVar);
    }
}
