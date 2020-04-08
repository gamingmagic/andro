package p004o;

/* renamed from: o.ậ */
public final class C1375 {

    /* renamed from: 櫯 */
    public String f6935;

    /* renamed from: 鷭 */
    public int f6936;

    public C1375(int i, String str) {
        this.f6936 = i;
        if (str == null || str.trim().length() == 0) {
            this.f6935 = C1782.m2448(i);
        } else {
            this.f6935 = new StringBuilder(String.valueOf(str)).append(" (response: ").append(C1782.m2448(i)).append(")").toString();
        }
    }

    public final String toString() {
        return "IabResult: " + this.f6935;
    }
}
