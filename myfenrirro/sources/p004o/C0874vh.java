package p004o;

/* renamed from: o.vh */
public final class C0874vh extends C0659pi {
    @C0845uk(mo4122 = 2)

    /* renamed from: Ą */
    public short f5144;
    @C0845uk(mo4122 = 5)

    /* renamed from: ą */
    public byte[] f5145;
    @C0845uk(mo4122 = 1)

    /* renamed from: ȃ */
    public short f5146;

    public C0874vh() {
    }

    public C0874vh(String str, String str2) {
        byte[] r3 = C0622ot.m750(str, C0618op.LATIN, false);
        byte[] r4 = C0622ot.m750(str2, C0618op.LATIN, false);
        this.f5146 = (short) r3.length;
        this.f5144 = (short) r4.length;
        this.f5145 = C0619oq.m711(r3, r4);
    }

    /* renamed from: ȃ */
    public final short mo4090() {
        return C0636oz.CB_VERIFYPURCHASE.f4229;
    }
}
