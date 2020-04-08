package p004o;

import android.graphics.Point;
import java.nio.ByteBuffer;

/* renamed from: o.쫗 */
final class C2011 extends C0923wy implements C0838ud {
    C2011() {
    }

    /* renamed from: 鷭 */
    public final void mo4051() {
        C0603oc ocVar = new C0603oc();
        ocVar.f2965 = -1;
        ocVar.f2962 = this.f5549;
        ocVar.f2945 = this.f5539;
        ocVar.f2931 = this.f5531;
        ocVar.f2932 = this.f5532;
        ocVar.f2933 = this.f5533;
        ocVar.f2949 = this.f5534;
        ocVar.f2958 = this.f5541;
        ocVar.f2935 = this.f5545;
        ocVar.f2934 = this.f5540;
        ocVar.f2946 = this.f5535;
        ocVar.f2963 = this.f5547;
        ocVar.f2956 = this.f5544;
        ocVar.f2949 = this.f5548;
        ocVar.f2950 = this.f5542;
        ocVar.f2959 = this.f5546;
        ocVar.f2939 = this.f5536;
        ocVar.f2940 = this.f5537;
        C0212bg bgVar = new C0212bg(ByteBuffer.wrap(this.f5538));
        ocVar.f2941 = new Point((short) (((bgVar.f489[0] & 255) << 2) | ((bgVar.f489[1] & 255) >> 6)), (short) ((((bgVar.f489[1] & 255) & 63) << 4) | ((bgVar.f489[2] & 255) >> 4)));
        ocVar.f2960 = this.f5550;
        ocVar.f2957 = this.f5543;
        C1763.m2436(ocVar);
    }
}
