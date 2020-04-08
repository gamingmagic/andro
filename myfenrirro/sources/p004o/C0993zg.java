package p004o;

/* renamed from: o.zg */
public final class C0993zg {

    /* renamed from: Ą */
    private C0975yp f5973;

    /* renamed from: ȃ */
    final C0994 f5974 = new C0994();

    /* renamed from: ˮ͈ */
    long f5975;

    /* renamed from: 櫯 */
    long f5976;

    /* renamed from: 鷭 */
    long f5977;

    /* renamed from: o.zg$鷭 */
    public static class C0994 {

        /* renamed from: ˮ͈ */
        long f5978;

        /* renamed from: 櫯 */
        long f5979;

        /* renamed from: 鷭 */
        long f5980;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SubRange[");
            sb.append("\n  lowCount=");
            sb.append(this.f5980);
            sb.append("\n  highCount=");
            sb.append(this.f5979);
            sb.append("\n  scale=");
            sb.append(this.f5978);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: 鷭 */
    public final void mo4207(C0975yp ypVar) {
        this.f5973 = ypVar;
        this.f5976 = 0;
        this.f5977 = 0;
        this.f5975 = 4294967295L;
        for (int i = 0; i < 4; i++) {
            this.f5976 = ((this.f5976 << 8) | ((long) this.f5973.mo4168())) & 4294967295L;
        }
    }

    /* renamed from: 鷭 */
    public final int mo4206() {
        this.f5975 = (this.f5975 / this.f5974.f5978) & 4294967295L;
        return (int) ((this.f5976 - this.f5977) / this.f5975);
    }

    /* renamed from: 櫯 */
    public final void mo4205() {
        this.f5977 = (this.f5977 + (this.f5975 * (this.f5974.f5980 & 4294967295L))) & 4294967295L;
        this.f5975 = (this.f5975 * (this.f5974.f5979 - (this.f5974.f5980 & 4294967295L))) & 4294967295L;
    }

    /* renamed from: ˮ͈ */
    public final void mo4204() {
        boolean z = false;
        while (true) {
            if ((this.f5977 ^ (this.f5977 + this.f5975)) >= 16777216) {
                z = this.f5975 < 32768;
                if (!z) {
                    return;
                }
            }
            if (z) {
                this.f5975 = (-this.f5977) & 32767 & 4294967295L;
                z = false;
            }
            this.f5976 = ((this.f5976 << 8) | ((long) this.f5973.mo4168())) & 4294967295L;
            this.f5975 = (this.f5975 << 8) & 4294967295L;
            this.f5977 = (this.f5977 << 8) & 4294967295L;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RangeCoder[");
        sb.append("\n  low=");
        sb.append(this.f5977);
        sb.append("\n  code=");
        sb.append(this.f5976);
        sb.append("\n  range=");
        sb.append(this.f5975);
        sb.append("\n  subrange=");
        sb.append(this.f5974);
        sb.append("]");
        return sb.toString();
    }
}
