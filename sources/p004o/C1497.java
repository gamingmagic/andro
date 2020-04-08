package p004o;

/* renamed from: o.䚨 */
class C1497 implements Runnable {

    /* renamed from: 櫯 */
    private final /* synthetic */ String f7193;

    /* renamed from: 鷭 */
    final /* synthetic */ C1733 f7194;

    C1497(C1733 r1, String str) {
        this.f7194 = r1;
        this.f7193 = str;
    }

    public final void run() {
        try {
            C0252cp cpVar = C1014.f6158;
            String str = this.f7193;
            if (!str.toLowerCase().endsWith(".bmp")) {
                str = new StringBuilder(String.valueOf(str)).append(".bmp").toString();
            }
            C1014.f6147.mo3387((Runnable) new C1913(this, cpVar.mo3617("data\\texture\\" + cpVar.f674.f623.f7904.f7928 + "\\illust\\" + str, 1)));
        } catch (C0825tu unused) {
        }
    }
}
