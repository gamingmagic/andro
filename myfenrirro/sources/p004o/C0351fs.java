package p004o;

/* renamed from: o.fs */
final class C0351fs {

    /* renamed from: 櫯 */
    C0531lo f938;

    /* renamed from: 鷭 */
    String f939;

    C0351fs(String str, byte[] bArr) {
        this.f939 = str;
        try {
            this.f938 = new C0531lo(bArr);
        } catch (Exception e) {
            throw new C0588no(e, "Failed to init wav: " + str);
        }
    }
}
