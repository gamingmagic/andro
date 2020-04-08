package p004o;

/* renamed from: o.쾎 */
class C2029 implements Runnable {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ float f8922;

    /* renamed from: 櫯 */
    private final /* synthetic */ String f8923;

    /* renamed from: 鷭 */
    final /* synthetic */ C1641 f8924;

    C2029(C1641 r1, String str, float f) {
        this.f8924 = r1;
        this.f8923 = str;
        this.f8922 = f;
    }

    public final void run() {
        try {
            this.f8924.mo4429(this.f8923, (byte[]) C1014.f6158.f677.mo3613("data\\wav\\" + this.f8923 + ".wav", false));
            this.f8924.mo4425(this.f8923, this.f8922);
        } catch (C0825tu unused) {
        }
    }
}
