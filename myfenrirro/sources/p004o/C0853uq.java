package p004o;

/* renamed from: o.uq */
public final class C0853uq extends C0659pi {
    @C0845uk(mo4122 = 2)

    /* renamed from: Ą */
    public int f5089;
    @C0845uk(mo4122 = 3)

    /* renamed from: ą */
    public int f5090;
    @C0845uk(mo4122 = 4)

    /* renamed from: Ć */
    public byte[] f5091;
    @C0845uk(mo4122 = 1)

    /* renamed from: ȃ */
    public C0854 f5092;

    /* renamed from: o.uq$鷭 */
    public enum C0854 {
        SUCCESS_STARTING_TRANSFER,
        FAIL_FILE_NOT_EXISTS,
        FAIL_UNKNOWN_ERROR,
        SUCCESS_STARTING_UNPACKED_TRANSFER
    }

    /* renamed from: ȃ */
    public final short mo4090() {
        return C0636oz.BC_RESOURCEACK_ASCII.f4229;
    }

    private C0853uq(C0854 r3, int i, int i2, String str) {
        this.f5092 = r3;
        this.f5089 = i;
        this.f5090 = i2;
        this.f5091 = C0622ot.m750(str, C0618op.KOREAN, true);
    }

    public C0853uq() {
    }
}
