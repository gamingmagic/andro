package p004o;

/* renamed from: o.Έ */
final class C1260 extends C0914wp implements C0838ud {
    C1260() {
    }

    /* renamed from: 鷭 */
    public final void mo4051() {
        int[] iArr = new int[this.f5339.length];
        C1992[] r3 = new C1992[this.f5339.length];
        for (int i = 0; i < r3.length; i++) {
            iArr[i] = this.f5339[i] - 2;
            r3[i] = (C1992) C1014.f6137.f1636.f6528.get(Integer.valueOf(iArr[i]));
        }
        C1528 r0 = C1014.f6147.f51.f1388;
        int[] iArr2 = iArr;
        C1528 r2 = r0;
        r0.f7283 = new C1980(this);
        r2.f7284.setAdapter(new C1323(iArr2, r3));
        r2.mo3537h_();
    }
}
