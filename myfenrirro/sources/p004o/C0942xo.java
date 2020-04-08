package p004o;

/* renamed from: o.xo */
public final class C0942xo extends Exception {

    /* renamed from: 鷭 */
    private C0943 f5638;

    /* renamed from: o.xo$鷭 */
    public enum C0943 {
        notImplementedYet,
        crcError,
        notRarArchive,
        badRarArchive,
        unkownError,
        headerNotInArchive,
        wrongHeaderType,
        ioError,
        rarEncryptedException
    }

    public C0942xo(Exception exc) {
        super(C0943.unkownError.name(), exc);
        this.f5638 = C0943.unkownError;
    }

    public C0942xo(C0943 r2) {
        super(r2.name());
        this.f5638 = r2;
    }
}
