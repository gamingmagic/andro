package p004o;

import java.util.ArrayList;
import java.util.List;
import p004o.C1782.C1786;

/* renamed from: o.閇 */
class C1795 implements Runnable {

    /* renamed from: ȃ */
    private final /* synthetic */ List f8319;

    /* renamed from: ˮ͈ */
    private final /* synthetic */ List f8320;

    /* renamed from: 櫯 */
    private final /* synthetic */ C1786 f8321;

    /* renamed from: 鷭 */
    final /* synthetic */ C1509 f8322;

    C1795(C1509 r1, C1786 r2, List list, ArrayList arrayList) {
        this.f8322 = r1;
        this.f8321 = r2;
        this.f8320 = list;
        this.f8319 = arrayList;
    }

    public final void run() {
        this.f8321.mo3640((C1530) this.f8320.get(0), (C1375) this.f8319.get(0));
    }
}
