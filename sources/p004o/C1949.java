package p004o;

import android.app.AlertDialog.Builder;
import com.roworkshop.andro.c_activity;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.util.Arrays;

/* renamed from: o.렸 */
final class C1949 extends C0762sz {
    C1949() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 183;
        int i3 = byteBuffer.getInt();
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        if (!z) {
            C0455 r11 = C1014.f6147.f51.f1373;
            String r12 = C0622ot.m741(bArr, C0618op.LOCAL);
            int i4 = i3;
            c_activity c_activity = C1014.f6147;
            String[] split = r12.split(":");
            String[] strArr = new String[split.length];
            int i5 = 0;
            String[] strArr2 = split;
            int length = split.length;
            for (int i6 = 0; i6 < length; i6++) {
                String str = strArr2[i6];
                if (!str.isEmpty()) {
                    int i7 = i5;
                    i5++;
                    strArr[i7] = str;
                }
            }
            String[] strArr3 = (String[]) Arrays.copyOf(strArr, i5);
            for (int i8 = 0; i8 < strArr3.length; i8++) {
                int i9 = 0;
                while (i9 < strArr3[i8].length()) {
                    try {
                        int indexOf = strArr3[i8].indexOf("^", i9);
                        if (indexOf == -1) {
                            break;
                        }
                        try {
                            C0455.m512(strArr3[i8], indexOf);
                            strArr3[i8] = new StringBuilder(String.valueOf(strArr3[i8].substring(0, indexOf))).append(strArr3[i8].substring(indexOf + 7, strArr3[i8].length())).toString();
                        } catch (ParseException e) {
                            C0592ns.m674("Faulty menu item color: " + strArr3[i8] + ". At " + (i9 + indexOf + e.getErrorOffset()) + ": " + e.getMessage());
                        }
                        i9 = indexOf + 1;
                    } catch (StringIndexOutOfBoundsException e2) {
                        throw new C0588no("Faulty NPC script menu text=" + r12 + "\n\n" + e2.toString());
                    }
                }
            }
            Builder builder = new Builder(c_activity);
            builder.setTitle("");
            builder.setItems(strArr3, new C0497kk(r11));
            builder.setCancelable(true).setOnCancelListener(new C0498kl(r11));
            r11.f1465 = i4;
            r11.f1466 = builder.create();
            r11.f1466.show();
        }
    }
}
