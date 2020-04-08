package p004o;

import java.util.TreeMap;

/* renamed from: o.sy */
public class C0760sy {

    /* renamed from: ˮ͈ */
    public TreeMap<Integer, C0761> f4661 = new TreeMap<>();

    /* renamed from: 櫯 */
    String f4662;

    /* renamed from: 鷭 */
    protected C0761 f4663 = new C0761();

    /* renamed from: o.sy$鷭 */
    public static class C0761 {

        /* renamed from: ȃ */
        public String[] f4664 = new String[2];

        /* renamed from: ˮ͈ */
        public String f4665;

        /* renamed from: 櫯 */
        public String f4666;

        /* renamed from: 鷭 */
        public String f4667;

        public final String toString() {
            return this.f4667 + "#" + this.f4666 + "#" + this.f4665 + "#\n" + this.f4664[0] + "#\n" + this.f4664[1] + "#\n\n";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public final void mo4094(String str, String str2) {
        this.f4662 = str2;
        this.f4663.f4667 = "Unknown quest";
        this.f4663.f4666 = "SG_FEEL";
        this.f4663.f4665 = "QUE_NOIMAGE";
        this.f4663.f4664[0] = " ";
        this.f4663.f4664[1] = " ";
        String replace = str.replace("\r", "");
        StringBuilder sb = new StringBuilder(replace.length());
        String[] split = replace.split("\n");
        boolean z = false;
        int i = 0;
        while (i < split.length) {
            if (z) {
                String str3 = split[i];
                if (str3.indexOf("*/") != -1) {
                    split[i] = str3.split("\\*/", 2)[1];
                    z = false;
                } else {
                    continue;
                    i++;
                }
            }
            String str4 = split[i];
            int indexOf = str4.indexOf("//");
            int indexOf2 = str4.indexOf("/*");
            char c = (indexOf == -1 || indexOf2 == -1) ? indexOf != -1 ? 0 : indexOf2 != -1 ? (char) 1 : 65535 : Math.min(indexOf, indexOf2) == indexOf ? (char) 0 : 1;
            switch (c) {
                case 65535:
                    sb.append(str4);
                    sb.append("\n");
                    break;
                case 0:
                    sb.append(str4.split("//", 2)[0]);
                    sb.append("\n");
                    break;
                case 1:
                    String[] split2 = str4.split("/\\*", 2);
                    sb.append(split2[0]);
                    int i2 = i;
                    i--;
                    split[i2] = split2[1];
                    z = true;
                    break;
                default:
                    throw new RuntimeException();
            }
            i++;
        }
        String[] split3 = sb.toString().split("#");
        for (int i3 = 0; i3 < split3.length - 5; i3 += 6) {
            C0761 r3 = new C0761();
            try {
                int parseInt = Integer.parseInt(split3[i3].trim());
                r3.f4667 = split3[i3 + 1];
                r3.f4666 = split3[i3 + 2];
                r3.f4665 = split3[i3 + 3];
                r3.f4664[0] = split3[i3 + 4];
                r3.f4664[1] = split3[i3 + 5];
                this.f4661.put(Integer.valueOf(parseInt), r3);
            } catch (NumberFormatException unused) {
                C0624ov.m759("ClientQuestid2displayDB: invalid split near " + split3[i3] + "#" + split3[i3 + 1] + "#" + split3[i3 + 2] + "#" + split3[i3 + 3] + "#" + split3[i3 + 4]);
            }
        }
    }

    /* renamed from: 鷭 */
    public C0761 mo4093(int i) {
        C0761 r3 = (C0761) this.f4661.get(Integer.valueOf(i));
        if (r3 != null) {
            return r3;
        }
        return this.f4663;
    }
}
