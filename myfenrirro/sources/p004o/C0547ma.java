package p004o;

/* renamed from: o.ma */
class C0547ma implements Runnable {

    /* renamed from: 櫯 */
    private final /* synthetic */ C0626ox f1766;

    /* renamed from: 鷭 */
    final /* synthetic */ C0545lz f1767;

    C0547ma(C0545lz lzVar, C0626ox oxVar) {
        this.f1767 = lzVar;
        this.f1766 = oxVar;
    }

    public final void run() {
        C1885 r2 = new C1885(this.f1767, this.f1766);
        C0545lz lzVar = this.f1767;
        C1885 r4 = r2;
        synchronized (lzVar.f1773) {
            lzVar.f1773.add(r4);
        }
        C1885 r0 = r2;
        C0545lz lzVar2 = this.f1767;
        C0534lq lqVar = C1014.f6142;
        C0525li r3 = C0534lq.m593(lzVar2.f1707);
        C1885 r22 = r0;
        C0525li liVar = r0.f587;
        C0525li liVar2 = r3;
        C0525li liVar3 = liVar;
        liVar.f1649 = liVar2.f1649;
        liVar3.f1648 = liVar2.f1648;
        r22.mo3591();
    }
}
