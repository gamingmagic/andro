package p004o;

/* renamed from: o.um */
public class C0847um extends C0659pi {
    @C0845uk(mo4122 = 1)

    /* renamed from: ȃ */
    public C0848[] f5070;

    /* renamed from: o.um$鷭 */
    public class C0848 {
        @C0845uk(mo4122 = 3)

        /* renamed from: ˮ͈ */
        public long f5072;
        @C0845uk(mo4122 = 2)

        /* renamed from: 櫯 */
        public char[] f5073 = new char[64];
        @C0845uk(mo4122 = 1)

        /* renamed from: 鷭 */
        public long f5074;

        private C0848() {
        }

        public C0848(C1026 r6, String str, long j, long j2) {
            C0847um.this = r6;
            System.arraycopy(str.toCharArray(), 0, this.f5073, 0, str.length());
            this.f5072 = j;
            this.f5074 = j2;
        }

        public boolean equals(Object obj) {
            if (obj.getClass() != C0848.class) {
                return false;
            }
            C0848 r7 = (C0848) obj;
            if (!new String(this.f5073).equals(new String(r7.f5073))) {
                return false;
            }
            if (this.f5072 != r7.f5072) {
                return false;
            }
            if (this.f5074 != r7.f5074) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: ȃ */
    public final short mo4090() {
        return C0636oz.BC_CLIENTCHECKSUM.f4229;
    }
}
