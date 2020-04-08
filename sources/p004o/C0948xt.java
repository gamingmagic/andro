package p004o;

import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: o.xt */
public class C0948xt extends RandomAccessFile implements C0946xr {

    /* renamed from: 鷭 */
    static final /* synthetic */ boolean f5652 = (!C0948xt.class.desiredAssertionStatus());

    static {
    }

    public C0948xt(File file) {
        super(file, "r");
    }

    /* renamed from: 鷭 */
    public final int mo4137(byte[] bArr, int i) {
        if (f5652 || i > 0) {
            readFully(bArr, 0, i);
            return i;
        }
        throw new AssertionError(i);
    }

    /* renamed from: 鷭 */
    public final long mo4138() {
        return getFilePointer();
    }

    /* renamed from: 鷭 */
    public final void mo4139(long j) {
        seek(j);
    }
}
