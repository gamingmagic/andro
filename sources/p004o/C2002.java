package p004o;

import android.graphics.Point;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: o.졁 */
final class C2002 extends C0915wq implements C0838ud {
    C2002() {
    }

    /* renamed from: 鷭 */
    public final void mo4051() {
        C0603oc ocVar = new C0603oc();
        ocVar.f2965 = -1;
        ocVar.f2962 = this.f5363;
        ocVar.f2948 = this.f5363;
        ocVar.f2945 = this.f5352;
        ocVar.f2931 = this.f5340;
        ocVar.f2932 = this.f5341;
        ocVar.f2933 = this.f5342;
        ocVar.f2934 = this.f5343;
        ocVar.f2949 = this.f5354;
        ocVar.f2958 = ByteBuffer.wrap(new byte[4]).order(ByteOrder.LITTLE_ENDIAN).putInt(this.f5358).getShort(0);
        ocVar.f2946 = ByteBuffer.wrap(new byte[4]).order(ByteOrder.LITTLE_ENDIAN).putInt(this.f5358).getShort(2);
        ocVar.f2935 = this.f5353;
        ocVar.f2963 = this.f5344;
        ocVar.f2956 = this.f5361;
        ocVar.f2964 = this.f5357;
        ocVar.f2950 = this.f5362;
        ocVar.f2959 = this.f5355;
        ocVar.f2937 = this.f5359;
        ocVar.f2938 = this.f5345;
        ocVar.f2966 = this.f5346;
        ocVar.f2953 = this.f5347;
        ocVar.f2939 = this.f5364;
        ocVar.f2940 = this.f5356;
        C0212bg bgVar = new C0212bg(ByteBuffer.wrap(this.f5348));
        C0212bg bgVar2 = bgVar;
        ocVar.f2941 = new Point((short) (((bgVar2.f489[0] & 255) << 2) | ((bgVar2.f489[1] & 255) >> 6)), (short) ((((bgVar2.f489[1] & 255) & 63) << 4) | ((bgVar2.f489[2] & 255) >> 4)));
        ocVar.f2942 = (short) (bgVar.f489[2] & 15);
        ocVar.f2960 = this.f5349;
        ocVar.f2957 = this.f5350;
        ocVar.f2952 = this.f5351;
        ocVar.f2961 = this.f5360;
        C1741.m2402(ocVar);
    }
}
