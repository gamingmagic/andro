package p004o;

import java.io.File;

/* renamed from: o.xq */
public final class C0945xq implements C0940xm {

    /* renamed from: 鷭 */
    private final File f5651;

    public C0945xq(File file) {
        this.f5651 = file;
    }

    /* renamed from: 鷭 */
    public final C0944xp mo4133(C0937xj xjVar, C0939xl xlVar) {
        String str;
        if (xlVar == null) {
            return new C0944xp(xjVar, this.f5651);
        }
        C0944xp xpVar = (C0944xp) xlVar;
        boolean z = !xjVar.f5626.mo4161() || xjVar.f5625.f5736;
        String absolutePath = xpVar.f5650.getAbsolutePath();
        if (!z) {
            int length = absolutePath.length();
            int i = length - 1;
            while (i >= 0) {
                char charAt = absolutePath.charAt(i);
                if (charAt >= '0' && charAt <= '9') {
                    break;
                }
                i--;
            }
            int i2 = i + 1;
            int i3 = i - 1;
            while (i3 >= 0) {
                char charAt2 = absolutePath.charAt(i3);
                if (!(charAt2 >= '0' && charAt2 <= '9')) {
                    break;
                }
                i3--;
            }
            if (i3 < 0) {
                str = null;
            } else {
                int i4 = i3 + 1;
                StringBuilder sb = new StringBuilder(length);
                sb.append(absolutePath, 0, i4);
                char[] cArr = new char[((i - i4) + 1)];
                absolutePath.getChars(i4, i + 1, cArr, 0);
                int length2 = cArr.length - 1;
                while (length2 >= 0) {
                    char c = (char) (cArr[length2] + 1);
                    cArr[length2] = c;
                    if (c != ':') {
                        break;
                    }
                    cArr[length2] = '0';
                    length2--;
                }
                if (length2 < 0) {
                    sb.append('1');
                }
                sb.append(cArr);
                sb.append(absolutePath, i2, length);
                str = sb.toString();
            }
        } else {
            int length3 = absolutePath.length();
            if (length3 <= 4 || absolutePath.charAt(length3 - 4) != '.') {
                str = null;
            } else {
                StringBuilder sb2 = new StringBuilder();
                int i5 = length3 - 3;
                sb2.append(absolutePath, 0, i5);
                char charAt3 = absolutePath.charAt(i5 + 1);
                if (charAt3 >= '0' && charAt3 <= '9') {
                    char charAt4 = absolutePath.charAt(i5 + 2);
                    if (charAt4 >= '0' && charAt4 <= '9') {
                        char[] cArr2 = new char[3];
                        absolutePath.getChars(i5, length3, cArr2, 0);
                        int length4 = cArr2.length - 1;
                        while (true) {
                            char c2 = (char) (cArr2[length4] + 1);
                            cArr2[length4] = c2;
                            if (c2 != ':') {
                                break;
                            }
                            cArr2[length4] = '0';
                            length4--;
                        }
                        sb2.append(cArr2);
                        str = sb2.toString();
                    }
                }
                sb2.append("r00");
                str = sb2.toString();
            }
        }
        return new C0944xp(xjVar, new File(str));
    }
}
