package p004o;

/* renamed from: o.sx */
public abstract class C0759sx {

    /* renamed from: 櫯 */
    private int f4659;

    /* renamed from: 鷭 */
    private boolean f4660;

    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public abstract void mo3614(long j, long j2, int i);

    public C0759sx(boolean z) {
        this.f4660 = true;
        this.f4659 = -1;
        this.f4660 = true;
    }

    /* renamed from: 鷭 */
    public final void mo4092(long j, long j2) {
        int i = (int) ((100 * j) / j2);
        if (this.f4660) {
            if (i != this.f4659) {
                this.f4659 = i;
            } else {
                return;
            }
        }
        mo3614(j, j2, i);
    }
}
