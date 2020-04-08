package p004o;

import p004o.C0638pa.C0639if;
import p004o.C0638pa.C0640;

/* renamed from: o.衮 */
class C1748 implements Runnable {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ C0548mb f8035;

    /* renamed from: 櫯 */
    private final /* synthetic */ C0540lv f8036;

    /* renamed from: 鷭 */
    private final /* synthetic */ C0640 f8037;

    C1748(C0640 r1, C0540lv lvVar, C0540lv lvVar2) {
        this.f8037 = r1;
        this.f8036 = lvVar;
        this.f8035 = lvVar2;
    }

    public final void run() {
        C0639if[] ifVarArr;
        for (C0639if ifVar : this.f8037.f4238) {
            C0548mb mbVar = null;
            C0548mb mbVar2 = null;
            switch ((ifVar.f4232 >> 8) & 3) {
                case 0:
                    mbVar = this.f8036;
                    break;
                case 1:
                    mbVar = this.f8035;
                    break;
            }
            switch ((ifVar.f4232 >> 8) & 3) {
                case 0:
                    mbVar2 = this.f8036;
                    break;
                case 1:
                    mbVar2 = this.f8035;
                    break;
            }
            if (mbVar != null) {
                if (ifVar.f4233 != null) {
                    mbVar.mo4003(ifVar.f4233);
                }
                C1885 r2 = new C1885(mbVar, mbVar2, ifVar.f4234);
                C0548mb mbVar3 = mbVar;
                synchronized (mbVar.f1773) {
                    mbVar3.f1773.add(r2);
                }
            }
        }
    }
}
