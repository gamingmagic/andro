package p004o;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: o.pf */
class C0656pf implements FilenameFilter {
    C0656pf() {
    }

    public final boolean accept(File file, String str) {
        return str.endsWith(".grf") && !str.equals("ddata.grf") && !str.equals("datadir.grf");
    }
}
