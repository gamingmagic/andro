package p004o;

import java.io.File;
import java.io.IOException;

/* renamed from: o.tq */
public class C0821tq extends RuntimeException {

    /* renamed from: 鷭 */
    public File f5009;

    public C0821tq(IOException iOException, String str, File file) {
        super(new StringBuilder(String.valueOf(str != null ? new StringBuilder(String.valueOf(str)).append(" ").toString() : "Corrupted patch file: ")).append(file.getAbsolutePath()).toString(), iOException);
        this.f5009 = file;
    }
}
