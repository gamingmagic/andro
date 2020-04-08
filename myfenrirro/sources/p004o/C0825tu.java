package p004o;

/* renamed from: o.tu */
public class C0825tu extends C0826tv {

    /* renamed from: 鷭 */
    public String f5011;

    public C0825tu(Exception exc, String str, String str2) {
        super(new StringBuilder(String.valueOf(str2 == null ? "Resource not found" : str2)).append(": ").append(str).toString());
        this.f5011 = str;
        if (exc != null) {
            initCause(exc);
        }
    }
}
