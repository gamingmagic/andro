package p004o;

/* renamed from: o.pa */
public abstract class C0638pa {

    /* renamed from: 鷭 */
    public static final C0640[] f4231;

    /* renamed from: o.pa$if */
    public static class C0639if {

        /* renamed from: ˮ͈ */
        public short f4232 = 0;

        /* renamed from: 櫯 */
        public C0626ox f4233;

        /* renamed from: 鷭 */
        public C0626ox f4234;

        C0639if(C0626ox oxVar) {
            this.f4234 = oxVar;
        }
    }

    /* renamed from: o.pa$鷭 */
    public static class C0640 {

        /* renamed from: Ą */
        public C0626ox f4235;

        /* renamed from: ą */
        public C0626ox f4236 = C0626ox.HIT1;

        /* renamed from: Ć */
        public String f4237;

        /* renamed from: ć */
        public C0639if[] f4238;

        /* renamed from: ȃ */
        public C0626ox f4239 = C0626ox.BASH;

        /* renamed from: ˮ͈ */
        public C0626ox f4240 = C0626ox.BASH;

        /* renamed from: 櫯 */
        public int f4241;

        /* renamed from: 鷭 */
        public int f4242;

        C0640() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: 鷭 */
        public final C0640 mo4049(C0639if ifVar) {
            int length = this.f4238 == null ? 1 : this.f4238.length + 1;
            C0639if[] ifVarArr = new C0639if[length];
            int i = 0;
            while (i < length - 1) {
                ifVarArr[i] = this.f4238[i];
                i++;
            }
            ifVarArr[i] = ifVar;
            this.f4238 = ifVarArr;
            return this;
        }
    }

    static {
        C0640[] r0 = new C0640[13000];
        f4231 = r0;
        C0640[] r1 = f4231;
        C0640 r4 = new C0640();
        r4.f4241 = 2;
        r4.f4242 = 2;
        C0640 r2 = r4;
        C0640 r42 = r2;
        r2.f4235 = C0626ox.HIT2;
        r1[5] = r42;
        r0[46] = r42;
        C0640[] r02 = f4231;
        C0640 r43 = new C0640();
        r43.f4241 = 2;
        r43.f4242 = 2;
        C0640 r12 = r43;
        C0640 r44 = r12;
        r12.f4236 = C0626ox.FIREHIT;
        r02[7] = r44.mo4049(new C0639if(C0626ox.MAGNUMBREAK));
        f4231[142] = new C0640().mo4049(new C0639if(C0626ox.FIRSTAID));
    }
}
