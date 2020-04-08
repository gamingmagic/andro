package p004o;

/* renamed from: o.㓫 */
class C1410 implements Runnable {

    /* renamed from: 鷭 */
    final /* synthetic */ C1632 f6968;

    C1410(C1632 r1) {
        this.f6968 = r1;
    }

    public final void run() {
        try {
            C1014.f6142.f1698.mo4524(C1014.f6142.f1680.f1198, C1813if.SPRITE_COLORS, C1813if.SPRITE_PALETTES, false);
        } catch (C0588no e) {
            C0592ns.m674("Flying damage error " + e.getMessage());
        }
    }
}
