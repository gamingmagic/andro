package p004o;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: o.co */
class C0251co extends C0246cj {

    /* renamed from: ą */
    FloatBuffer f641;

    /* renamed from: Ć */
    FloatBuffer f642;

    /* renamed from: ć */
    float[][] f643;

    /* renamed from: ˮ͍ */
    boolean f644 = true;

    /* renamed from: 櫯 */
    C0405hk[] f645;

    /* renamed from: 鷭 */
    C0807ti f646;

    C0251co() {
    }

    /* renamed from: ą */
    public final void mo3600() {
        if (this.f645 != null) {
            for (C0405hk r0 : this.f645) {
                r0.mo3601();
            }
            this.f645 = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public final String mo3602(String str) {
        return "data/texture/effect/" + str;
    }

    /* renamed from: 鷭 */
    public final boolean mo3603(byte[] bArr) {
        try {
            this.f646 = new C0807ti((ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).position(0));
            this.f645 = new C0405hk[this.f646.f4942.length];
            for (int i = 0; i < this.f645.length; i++) {
                this.f645[i] = (C0405hk) C0246cj.m229("effect/" + this.f646.f4942[i], C0405hk.class);
            }
            this.f642 = ByteBuffer.allocateDirect(this.f646.f4948 * 64).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f641 = ByteBuffer.allocateDirect(this.f646.f4948 * 32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f643 = new float[this.f646.f4948][];
            for (int i2 = 0; i2 < this.f646.f4948; i2++) {
                FloatBuffer floatBuffer = this.f642;
                C0407 r5 = this.f645[this.f646.f4949[i2]].f1144[0];
                float[] fArr = this.f646.f4944;
                int i3 = i2 << 3;
                int i4 = C0595nv.f2860 ? 1 : 0;
                floatBuffer.put(new float[]{fArr[i3 + 0] * ((float) (r5.f1157 - i4)), fArr[i3 + 1] * ((float) (r5.f1158 - i4)), 0.0f, 0.0f, fArr[i3 + 2] * ((float) (r5.f1157 - i4)), fArr[i3 + 3] * ((float) (r5.f1158 - i4)), 0.0f, 0.0f, fArr[i3 + 4] * ((float) (r5.f1157 - i4)), fArr[i3 + 5] * ((float) (r5.f1158 - i4)), 0.0f, 0.0f, fArr[i3 + 6] * ((float) (r5.f1157 - i4)), fArr[i3 + 7] * ((float) (r5.f1158 - i4)), 0.0f, 0.0f});
                for (int i5 = 0; i5 < 8; i5 += 2) {
                    this.f641.put(this.f646.f4943[(i2 << 3) + i5 + 0] * 0.14285715f);
                    this.f641.put(this.f646.f4943[(i2 << 3) + i5 + 1] * -0.14285715f);
                }
                this.f643[i2] = new float[]{this.f646.f4945[(i2 << 2) + 0], this.f646.f4945[(i2 << 2) + 1], this.f646.f4945[(i2 << 2) + 2], this.f646.f4945[(i2 << 2) + 3]};
            }
            this.f642.position(0);
            this.f641.position(0);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
