package p004o;

/* renamed from: o.oo */
public final class C0617oo {

    /* renamed from: ȃ */
    public int f3010;

    /* renamed from: ˮ͈ */
    public int f3011;

    /* renamed from: 櫯 */
    public int f3012;

    /* renamed from: 鷭 */
    public int f3013;

    /* renamed from: 鷭 */
    public final C0617oo mo4043(C0617oo ooVar) {
        this.f3013 += ooVar.f3013;
        this.f3012 += ooVar.f3012;
        this.f3011 += ooVar.f3011;
        this.f3010 += ooVar.f3010;
        m707();
        return this;
    }

    /* renamed from: 鷭 */
    private void m707() {
        if (this.f3013 > 255) {
            this.f3013 = 255;
        }
        if (this.f3012 > 255) {
            this.f3012 = 255;
        }
        if (this.f3011 > 255) {
            this.f3011 = 255;
        }
        if (this.f3010 > 255) {
            this.f3010 = 255;
        }
    }

    /* renamed from: 櫯 */
    public final C0617oo mo4041(C0617oo ooVar) {
        this.f3013 = ooVar.f3013;
        this.f3012 = ooVar.f3012;
        this.f3011 = ooVar.f3011;
        this.f3010 = ooVar.f3010;
        return this;
    }

    /* renamed from: 鷭 */
    public final C0617oo mo4042(int i) {
        this.f3010 = (i >> 24) & 255;
        this.f3011 = (i >> 16) & 255;
        this.f3012 = (i >> 8) & 255;
        this.f3013 = i & 255;
        return this;
    }
}
