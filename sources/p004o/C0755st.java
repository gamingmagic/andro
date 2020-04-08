package p004o;

import java.io.File;

/* renamed from: o.st */
public abstract class C0755st {
    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public abstract int mo4085(String str);

    /* renamed from: 鷭 */
    public abstract int mo4086(byte[] bArr);

    /* renamed from: 鷭 */
    public abstract int mo4087(byte[] bArr, byte[] bArr2);

    /* renamed from: 鷭 */
    public abstract void mo4088();

    /* renamed from: 櫯 */
    public final boolean mo4084(String str) {
        File file = new File(str);
        C0622ot.m719(file.getAbsolutePath());
        if (mo4085(str) == 0) {
            C0624ov.m759("Failed to open GRF " + str + ". Checking possible reasons...");
            if (!file.exists() || !file.canWrite()) {
                C0624ov.m759("Probably no access to GRF. Aborting data folder packing.");
                return false;
            }
            C0624ov.m759("Probably incorrect format. Deleting old file and creating a new one...");
            if (!file.delete()) {
                C0624ov.m759("Couldn't delete file. We've fucked up....");
                return false;
            } else if (mo4085(str) == 0) {
                C0624ov.m759("Failed to open a newly created GRF. Reason is unknown. Aborting data folder packing.");
                return false;
            }
        }
        return true;
    }
}
