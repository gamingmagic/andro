package p004o;

/* renamed from: o.ak */
final class C0187ak {

    /* renamed from: Ą */
    C0188[] f386 = new C0188[0];

    /* renamed from: ȃ */
    C0581nh f387 = C0581nh.PICKER;

    /* renamed from: ˮ͈ */
    C0580ng f388 = C0580ng.KILLER;

    /* renamed from: 櫯 */
    C0579nf f389 = C0579nf.EACH_TAKE;

    /* renamed from: 鷭 */
    String f390;

    /* renamed from: o.ak$鷭 */
    class C0188 {

        /* renamed from: Ą */
        boolean f391;

        /* renamed from: ą */
        int f392;

        /* renamed from: Ć */
        int f393;

        /* renamed from: ȃ */
        C0582ni f395;

        /* renamed from: ˮ͈ */
        String f396;

        /* renamed from: 櫯 */
        String f397;

        /* renamed from: 鷭 */
        int f398;

        /* access modifiers changed from: 0000 */
        /* renamed from: 鷭 */
        public final void mo3534(int i, String str, String str2, byte b, byte b2) {
            this.f398 = i;
            this.f397 = str;
            this.f396 = str2;
            this.f395 = C0582ni.values()[b];
            this.f391 = b2 == 0;
        }

        C0188() {
        }
    }

    C0187ak() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final int mo3533(int i) {
        for (int i2 = 0; i2 < this.f386.length; i2++) {
            if (this.f386[i2] != null && this.f386[i2].f398 == i) {
                return i2;
            }
        }
        return -1;
    }
}
