package p004o;

/* renamed from: o.uu */
public class C0858uu extends C0756su {
    @C0845uk(mo4122 = 1)

    /* renamed from: 鷭 */
    public C0859 f5100 = null;

    /* renamed from: o.uu$鷭 */
    public enum C0859 {
        SUCCESS("The operation has completed successfully"),
        FAIL_ALREADYACTIVATED("Cash points have already been loaded for this purchase"),
        FAIL_RAGNAROK_SERVER_OFFLINE("Ragnarok server is offline. The purchase will be verified automatically when the server comes online."),
        FAIL_OTHER("Unknown error occured"),
        FAIL_MALFORMED_DATA("Sent data is malformed"),
        FAIL_NO_SUCH_PRODUCT("Product has been removed");
        

        /* renamed from: Ć */
        public String f5108;

        private C0859(String str) {
            this.f5108 = str;
        }
    }

    /* renamed from: ȃ */
    public final short mo4090() {
        return C0636oz.BC_VERIFYPURCHASEACK.f4229;
    }

    public C0858uu(C0859 r3) {
        new StringBuilder("Creating ").append(getClass()).append(" result=").append(null);
        C0624ov.m757();
    }
}
