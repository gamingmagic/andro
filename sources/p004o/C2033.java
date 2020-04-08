package p004o;

import android.graphics.Point;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: o.킑 */
final class C2033 extends C0918wt implements C0838ud {
    C2033() {
    }

    /* renamed from: 鷭 */
    public final void mo4051() {
        C0603oc ocVar = new C0603oc();
        ocVar.f2965 = -1;
        ocVar.f2962 = this.f5448;
        ocVar.f2948 = this.f5448;
        ocVar.f2945 = this.f5437;
        ocVar.f2931 = this.f5425;
        ocVar.f2932 = this.f5426;
        ocVar.f2933 = this.f5427;
        ocVar.f2934 = this.f5428;
        ocVar.f2949 = this.f5439;
        ocVar.f2958 = ByteBuffer.wrap(new byte[4]).order(ByteOrder.LITTLE_ENDIAN).putInt(this.f5443).getShort(0);
        ocVar.f2946 = ByteBuffer.wrap(new byte[4]).order(ByteOrder.LITTLE_ENDIAN).putInt(this.f5443).getShort(2);
        ocVar.f2935 = this.f5438;
        int i = this.f5429;
        ocVar.f2963 = this.f5446;
        ocVar.f2956 = this.f5442;
        ocVar.f2964 = this.f5447;
        ocVar.f2950 = this.f5440;
        ocVar.f2959 = this.f5444;
        ocVar.f2937 = this.f5430;
        ocVar.f2938 = this.f5431;
        ocVar.f2966 = this.f5432;
        ocVar.f2953 = this.f5449;
        ocVar.f2939 = this.f5441;
        ocVar.f2940 = this.f5433;
        C0213bh bhVar = new C0213bh(ByteBuffer.wrap(this.f5434));
        C0213bh bhVar2 = bhVar;
        ocVar.f2941 = new Point((short) (((bhVar2.f490[0] & 255) << 2) | ((bhVar2.f490[1] & 255) >> 6)), bhVar2.mo3562());
        ocVar.f2960 = this.f5435;
        ocVar.f2957 = this.f5436;
        ocVar.f2961 = this.f5445;
        C1388.m2094(ocVar, i, bhVar);
    }
}
