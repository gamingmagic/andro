package p004o;

/* renamed from: o.扩 */
class C1608 implements C0597nx {

    /* renamed from: 鷭 */
    final /* synthetic */ C1204 f7526;

    C1608(C1204 r1) {
        this.f7526 = r1;
    }

    /* renamed from: 鷭 */
    public final void mo3669(C0512ky kyVar) {
        C1204 r6 = this.f7526;
        r6.f6306 = 0;
        r6.f6315 = false;
        r6.f6317.clear();
        C1014.f6147.f51.f1389.mo4298();
        C1315 r4 = C1014.f6147.f51.f1389;
        C1992 r5 = kyVar.f1595;
        r4.f6611.setText(r5.mo4615(C1014.f6158.f674.f608));
        r4.f6611.setTextColor(r5.mo4610());
        r4.f6608.setVisibility(0);
        C0453ix ixVar = C1014.f6147.f51;
        C1992 r8 = r5;
        ixVar.mo3871(r4.f6608, C1014.f6158.f674.mo3608(r8.f8848, r8.f8837, false), ixVar.f1450);
        r4.f6615 = r5.f8848;
        r4.f6607.setText((String) C1014.f6158.f674.f607.f6452.get(Integer.valueOf(r5.f8848)));
        if (kyVar.f1595.f8848 == this.f7526.f6308 || kyVar.f1595.f8848 == this.f7526.f6309 || kyVar.f1595.f8848 == this.f7526.f6314 || kyVar.f1595.f8848 == this.f7526.f6316 || kyVar.f1595.f8848 == this.f7526.f6310 || kyVar.f1595.f8848 == this.f7526.f6318) {
            this.f7526.mo4271(kyVar.f1595.f8848, true);
        } else {
            this.f7526.mo4271(kyVar.f1595.f8848, false);
        }
    }

    /* renamed from: 鷭 */
    public final void mo3668() {
        C1204 r4 = this.f7526;
        r4.f6306 = 0;
        r4.f6315 = false;
        r4.f6317.clear();
        C1014.f6147.f51.f1389.mo4298();
        C1014.f6144.mo3652((C0839ue) new C1082(0, null));
    }
}
