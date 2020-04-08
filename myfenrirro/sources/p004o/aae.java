package p004o;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: o.aae */
class aae implements FilenameFilter {
    aae() {
    }

    public final boolean accept(File file, String str) {
        return str.endsWith(".stacktrace");
    }
}
