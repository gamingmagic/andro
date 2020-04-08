package p004o;

/* renamed from: o.bq */
class C0222bq implements Runnable {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ boolean[] f506;

    /* renamed from: 櫯 */
    private final /* synthetic */ C1558[] f507;

    /* renamed from: 鷭 */
    final /* synthetic */ C0214bi f508;

    C0222bq(C0214bi biVar, C1558[] r2, boolean[] zArr) {
        this.f508 = biVar;
        this.f507 = r2;
        this.f506 = zArr;
    }

    public final void run() {
        C1812 r4 = C1014.f6142.f1698;
        r4.mo4525(this.f507[0], C1014.f6142.f1680.f1198);
        r4.mo4524(C1014.f6142.f1680.f1198, C1813if.SPRITE_COLORS, C1813if.SPRITE_PALETTES, true);
        r4.f8351 = C0574na.READY;
        this.f506[0] = true;
    }
}
