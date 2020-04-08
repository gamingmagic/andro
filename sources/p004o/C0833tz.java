package p004o;

import org.apache.http.message.TokenParser;

/* renamed from: o.tz */
public final class C0833tz {
    /* renamed from: 鷭 */
    public static String[] m1530(byte[] bArr, C0419hs hsVar) {
        if (hsVar != null) {
            hsVar.mo4092(0, 1);
        }
        String[] split = new String(bArr).split("\\r?\\n");
        long length = ((long) split.length) / 10;
        long length2 = length + ((long) split.length);
        if (hsVar != null) {
            hsVar.mo4092(length, length2);
        }
        String str = null;
        for (int i = 0; i < split.length; i++) {
            if (hsVar != null) {
                hsVar.mo4092(((long) i) + length, length2);
            }
            split[i] = split[i].trim().replace(TokenParser.ESCAPE, '/');
            String str2 = split[i];
            if (str2.length() > 0) {
                if (i == 0) {
                    str = str2;
                }
                int length3 = str.length();
                if (str2.length() < length3) {
                    str = str2;
                } else if (!str.regionMatches(0, str2, 0, length3)) {
                    int lastIndexOf = str2.toLowerCase().lastIndexOf("/data/");
                    if (lastIndexOf != -1) {
                        lastIndexOf++;
                    }
                    if (str2.startsWith("data/")) {
                        lastIndexOf = 0;
                    }
                    int i2 = 0;
                    while (i2 < length3 && str2.charAt(i2) == str.charAt(i2) && (lastIndexOf == -1 || i2 != lastIndexOf)) {
                        i2++;
                    }
                    if (i2 < length3) {
                        str = str2.substring(0, i2);
                    }
                }
            }
        }
        int length4 = str.length();
        for (int i3 = 0; i3 < split.length; i3++) {
            split[i3] = split[i3].substring(length4, split[i3].length());
        }
        if (hsVar != null) {
            hsVar.mo4092(length2, length2);
        }
        return split;
    }
}
