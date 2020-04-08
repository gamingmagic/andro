package p004o;

/* renamed from: o.ta */
public final class C0765ta {

    /* renamed from: ˮ͈ */
    public int f4677;

    /* renamed from: 櫯 */
    public int f4678;

    /* renamed from: 鷭 */
    public byte[] f4679;

    public C0765ta(int i) {
        this.f4679 = new byte[i];
    }

    /* renamed from: 鷭 */
    public final void mo4099() {
        if (!(this.f4677 == this.f4678 || this.f4678 == 0)) {
            System.arraycopy(this.f4679, this.f4678, this.f4679, 0, this.f4677 - this.f4678);
        }
        this.f4677 -= this.f4678;
        this.f4678 = 0;
    }
}
