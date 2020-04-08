package p004o;

import android.graphics.Point;
import java.nio.ByteBuffer;

/* renamed from: o.띏 */
final class C1943 extends C0922wx implements C0838ud {
    C1943() {
    }

    /* renamed from: 鷭 */
    public final void mo4051() {
        C0603oc ocVar = new C0603oc();
        ocVar.f2965 = -1;
        ocVar.f2962 = this.f5519;
        ocVar.f2945 = this.f5510;
        ocVar.f2931 = this.f5511;
        ocVar.f2932 = this.f5512;
        ocVar.f2933 = this.f5513;
        ocVar.f2949 = this.f5521;
        ocVar.f2958 = this.f5525;
        ocVar.f2935 = this.f5520;
        ocVar.f2934 = this.f5514;
        ocVar.f2946 = this.f5527;
        ocVar.f2963 = this.f5524;
        ocVar.f2956 = this.f5528;
        ocVar.f2949 = this.f5522;
        ocVar.f2950 = this.f5526;
        ocVar.f2959 = this.f5515;
        ocVar.f2939 = this.f5516;
        ocVar.f2940 = this.f5517;
        C0212bg bgVar = new C0212bg(ByteBuffer.wrap(this.f5530));
        ocVar.f2941 = new Point((short) (((bgVar.f489[0] & 255) << 2) | ((bgVar.f489[1] & 255) >> 6)), (short) ((((bgVar.f489[1] & 255) & 63) << 4) | ((bgVar.f489[2] & 255) >> 4)));
        ocVar.f2960 = this.f5523;
        ocVar.f2957 = this.f5518;
        C1763.m2436(ocVar);
    }
}
