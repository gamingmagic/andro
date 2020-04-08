package p004o;

/* renamed from: o.bt */
class C0225bt implements Runnable {

    /* renamed from: 鷭 */
    final /* synthetic */ C0214bi f514;

    C0225bt(C0214bi biVar) {
        this.f514 = biVar;
    }

    public final void run() {
        C0234cb cbVar = C1014.f6147.f51.f1416;
        C1301 r3 = C1014.f6137.f1636;
        cbVar.f545.setText(r3.f8657);
        cbVar.mo3590(r3);
        C0523 r5 = (C0523) C1014.f6158.f674.f626.f1638.get(Integer.valueOf(r3.f1633));
        cbVar.f534.setText(r5 != null ? r5.f1645 : "Poring");
        cbVar.mo3589(r3);
        cbVar.mo3588(r3);
        cbVar.mo3587(r3);
        cbVar.mo3583(r3);
        cbVar.mo3584(r3);
        cbVar.mo3585(r3);
        cbVar.mo3586(r3);
        for (C0586nm nmVar : C1014.f6137.f1636.f8640.keySet()) {
            C1014.f6147.f51.mo3867(nmVar.f2836);
        }
    }
}
