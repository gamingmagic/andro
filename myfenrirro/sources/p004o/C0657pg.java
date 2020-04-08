package p004o;

import java.util.Comparator;

/* renamed from: o.pg */
class C0657pg implements Comparator<String> {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        String str = (String) obj2;
        String str2 = (String) obj;
        int i = str.equals("data.grf") ? 0 : str.equals("rdata.grf") ? 1 : 2;
        int i2 = str2.equals("data.grf") ? 0 : str2.equals("rdata.grf") ? 1 : 2;
        return i - i2;
    }

    C0657pg() {
    }
}
