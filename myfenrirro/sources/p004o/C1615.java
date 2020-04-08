package p004o;

import java.util.Arrays;

/* renamed from: o.揟 */
final class C1615 {

    /* renamed from: ȃ */
    C2038[] f7532 = new C2038[0];

    /* renamed from: ˮ͈ */
    C1617 f7533 = new C1617();

    /* renamed from: 櫯 */
    C1616if f7534 = new C1616if();

    /* renamed from: 鷭 */
    C1616if f7535 = new C1616if();

    /* renamed from: o.揟$if */
    class C1616if {

        /* renamed from: 櫯 */
        int f7537;

        /* renamed from: 鷭 */
        C0604od[] f7538 = new C0604od[0];

        C1616if() {
        }
    }

    /* renamed from: o.揟$鷭 */
    class C1617 {

        /* renamed from: 櫯 */
        int f7540;

        /* renamed from: 鷭 */
        C2014[] f7541 = new C2014[0];

        C1617() {
        }
    }

    C1615() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public final C1615 clone() {
        C1615 r3 = new C1615();
        r3.f7535.f7538 = (C0604od[]) Arrays.copyOf(this.f7535.f7538, this.f7535.f7538.length);
        r3.f7535.f7537 = this.f7535.f7537;
        if (this.f7534 != null) {
            r3.f7534.f7538 = (C0604od[]) Arrays.copyOf(this.f7534.f7538, this.f7534.f7538.length);
            r3.f7534.f7537 = this.f7534.f7537;
        }
        if (!(this.f7533 == null || this.f7533.f7541 == null)) {
            r3.f7533.f7541 = (C2014[]) Arrays.copyOf(this.f7533.f7541, this.f7533.f7541.length);
            r3.f7533.f7540 = this.f7533.f7540;
        }
        return r3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4413(C0438ik ikVar, C0530ln lnVar, C2014[] r11, C1735 r12) {
        C0604od[] odVarArr;
        C0604od[] odVarArr2;
        C1735 r5 = r12;
        C2014[] r4 = r11;
        if (r4 == null) {
            this.f7533 = null;
        } else {
            this.f7533 = new C1617();
            this.f7533.f7541 = new C2014[r4.length];
            for (C2014 r6 : r4) {
                if (!m2292(r6.f8908, r5)) {
                    C2014[] r0 = this.f7533.f7541;
                    C1617 r2 = this.f7533;
                    int i = r2.f7540;
                    r2.f7540 = i + 1;
                    r0[i] = r6;
                }
            }
        }
        C1735 r52 = r12;
        C0530ln lnVar2 = lnVar;
        if (lnVar2 == null) {
            this.f7534 = null;
        } else {
            this.f7534 = new C1616if();
            this.f7534.f7538 = new C0604od[lnVar2.f1665.length];
            for (C0604od odVar : lnVar2.f1665) {
                if (!m2292(odVar.f2967, r52)) {
                    C0604od[] odVarArr3 = this.f7534.f7538;
                    C1616if ifVar = this.f7534;
                    int i2 = ifVar.f7537;
                    ifVar.f7537 = i2 + 1;
                    odVarArr3[i2] = odVar;
                }
            }
        }
        C1735 r53 = r12;
        C0438ik ikVar2 = ikVar;
        if (ikVar2 == null) {
            this.f7535 = null;
            return;
        }
        this.f7535 = new C1616if();
        this.f7535.f7538 = new C0604od[ikVar2.f1304.length];
        for (C0604od odVar2 : ikVar2.f1304) {
            if (!m2292(odVar2.f2967, r53)) {
                C0604od[] odVarArr4 = this.f7535.f7538;
                C1616if ifVar2 = this.f7535;
                int i3 = ifVar2.f7537;
                ifVar2.f7537 = i3 + 1;
                odVarArr4[i3] = odVar2;
            }
        }
    }

    /* renamed from: 鷭 */
    private static boolean m2292(C1647 r4, C1735 r5) {
        float f = C0595nv.f2863 * 5.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(r5.f7989[i] - r4.f7606[i]) > r4.f7607[i] + f) {
                return true;
            }
        }
        return false;
    }
}
