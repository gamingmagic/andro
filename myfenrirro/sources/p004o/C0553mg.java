package p004o;

/* renamed from: o.mg */
class C0553mg implements Runnable {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ C0548mb f1789;

    /* renamed from: 櫯 */
    private final /* synthetic */ int f1790;

    /* renamed from: 鷭 */
    final /* synthetic */ C0552mf f1791;

    C0553mg(C0552mf mfVar, int i, C0540lv lvVar) {
        this.f1791 = mfVar;
        this.f1790 = i;
        this.f1789 = lvVar;
    }

    public final void run() {
        String str;
        C1715if ifVar = C1014.f6158.f674.f623.f7903;
        C0405hk hkVar = new C0405hk("shadow");
        String sb = new StringBuilder(String.valueOf(ifVar.f7908.f7924)).append("\\").toString();
        String str2 = "_미니";
        switch (this.f1790) {
            case 10:
                str = new StringBuilder(String.valueOf(sb)).append("선물상자카트").toString();
                if ((C1761.m2430(this.f1789.f1769.f1633).mo4502().f7485 & 8192) > 0) {
                    str = new StringBuilder(String.valueOf(str)).append(str2).toString();
                    break;
                }
                break;
            case 11:
                str = new StringBuilder(String.valueOf(sb)).append("포링싣은카트").toString();
                if ((C1761.m2430(this.f1789.f1769.f1633).mo4502().f7485 & 8192) > 0) {
                    str = new StringBuilder(String.valueOf(str)).append(str2).toString();
                    break;
                }
                break;
            case 12:
                str = new StringBuilder(String.valueOf(sb)).append("포링카트").toString();
                if ((C1761.m2430(this.f1789.f1769.f1633).mo4502().f7485 & 8192) > 0) {
                    str = new StringBuilder(String.valueOf(str)).append(str2).toString();
                    break;
                }
                break;
            default:
                str = new StringBuilder(String.valueOf(ifVar.f7908.f7924)).append("\\").append(ifVar.f7908.f7923).toString();
                if (this.f1790 > 1) {
                    str = new StringBuilder(String.valueOf(str)).append(this.f1790 - 1).toString();
                    break;
                }
                break;
        }
        C0405hk hkVar2 = new C0405hk(str);
        C1014.f6147.mo3387((Runnable) new C0554mh(this, new C0408hl(hkVar2, new C0405hk[]{hkVar, hkVar2})));
    }
}
