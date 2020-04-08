package p004o;

/* renamed from: o.zf */
public abstract class C0992zf {

    /* renamed from: ć */
    static final /* synthetic */ boolean f5970 = (!C0992zf.class.desiredAssertionStatus());

    /* renamed from: ą */
    protected byte[] f5971;

    /* renamed from: Ć */
    protected int f5972;

    static {
    }

    public C0992zf(byte[] bArr) {
        this.f5971 = bArr;
    }

    /* renamed from: ˮ͈ */
    public final int mo4202() {
        if (f5970 || this.f5971 != null) {
            return this.f5972;
        }
        throw new AssertionError();
    }

    /* renamed from: ˮ͈ */
    public void mo4193(int i) {
        if (!f5970 && this.f5971 == null) {
            throw new AssertionError();
        } else if (f5970 || (i >= 0 && i < this.f5971.length)) {
            this.f5972 = i;
        } else {
            throw new AssertionError(i);
        }
    }
}
