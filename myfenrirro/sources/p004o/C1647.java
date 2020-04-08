package p004o;

import java.util.Arrays;

/* renamed from: o.橙 */
final class C1647 {

    /* renamed from: ȃ */
    float[] f7606 = new float[3];

    /* renamed from: ˮ͈ */
    float[] f7607 = new float[3];

    /* renamed from: 櫯 */
    float[] f7608 = {-999999.0f, -999999.0f, -999999.0f};

    /* renamed from: 鷭 */
    float[] f7609 = {999999.0f, 999999.0f, 999999.0f};

    C1647() {
    }

    /* renamed from: 鷭 */
    public final C1647 clone() {
        C1647 r2 = new C1647();
        r2.f7609 = Arrays.copyOf(this.f7609, 3);
        r2.f7608 = Arrays.copyOf(this.f7608, 3);
        r2.f7607 = Arrays.copyOf(this.f7607, 3);
        r2.f7606 = Arrays.copyOf(this.f7606, 3);
        return r2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final void mo4436() {
        for (int i = 0; i < 3; i++) {
            if (this.f7609[i] > this.f7608[i]) {
                float f = this.f7609[i];
                this.f7609[i] = this.f7608[i];
                this.f7608[i] = f;
            }
            this.f7607[i] = (this.f7608[i] - this.f7609[i]) / 2.0f;
            this.f7606[i] = this.f7609[i] + this.f7607[i];
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4438(float[] fArr) {
        float[] fArr2 = fArr;
        for (int i = 0; i < 3; i++) {
            if (this.f7609[i] > fArr2[i + 0]) {
                this.f7609[i] = fArr2[i + 0];
            }
            if (this.f7608[i] < fArr2[i + 0]) {
                this.f7608[i] = fArr2[i + 0];
            }
        }
    }
}
