package p004o;

/* renamed from: o.tr */
public class C0822tr extends RuntimeException {

    /* renamed from: 鷭 */
    public boolean f5010;

    public C0822tr(Exception exc, String str, boolean z) {
        super(str);
        if (exc != null) {
            initCause(exc);
        }
        this.f5010 = z;
    }

    public C0822tr(String str) {
        this(null, str, false);
    }

    public C0822tr(String str, boolean z) {
        this(str);
        this.f5010 = z;
    }

    public C0822tr(Exception exc) {
        super(exc);
    }

    public C0822tr(Exception exc, boolean z) {
        super(exc);
        this.f5010 = true;
    }
}
