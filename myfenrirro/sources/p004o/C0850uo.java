package p004o;

/* renamed from: o.uo */
public class C0850uo extends C0659pi {
    @C0845uk(mo4122 = 2)

    /* renamed from: Ą */
    public int f5075;
    @C0845uk(mo4122 = 3)

    /* renamed from: ą */
    public int f5076;
    @C0845uk(mo4122 = 4)

    /* renamed from: Ć */
    public char[] f5077;
    @C0845uk(mo4122 = 1)

    /* renamed from: ȃ */
    public C0851 f5078;

    /* renamed from: o.uo$鷭 */
    public enum C0851 {
        SUCCESS_STARTING_TRANSFER,
        FAIL_FILE_NOT_EXISTS,
        FAIL_UNKNOWN_ERROR,
        SUCCESS_STARTING_UNPACKED_TRANSFER
    }

    /* renamed from: ȃ */
    public final short mo4090() {
        return C0636oz.BC_RESOURCEACK.f4229;
    }

    private C0850uo(C0851 r2, int i, int i2, String str) {
        this.f5078 = r2;
        this.f5075 = i;
        this.f5076 = i2;
        this.f5077 = str.toCharArray();
    }

    public C0850uo() {
    }
}
