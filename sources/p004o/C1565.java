package p004o;

import p004o.C0643pc.aux;

/* renamed from: o.崲 */
final class C1565 extends C0328ew {
    C1565(String str, String str2, int i, byte b, boolean z) {
        if (C1014.f6140.f4443 == aux.Eden3) {
            this.f4671 = -26331;
        } else {
            this.f4671 = 2085;
        }
        String r11 = C0594nu.m681();
        String r3 = C0594nu.m680();
        String str3 = str;
        String str4 = str2;
        if (C1014.f6140.f4443 == aux.MOTR) {
            str3 = "andro";
            str4 = new StringBuilder(String.valueOf(str)).append("#").append(str2).toString();
        }
        this.f4538.putInt(i);
        this.f4538.put(b);
        this.f4538.put(C0622ot.m749(str3, C0618op.LATIN, 24));
        this.f4538.put(new byte[27]);
        this.f4538.put(C0622ot.m749(r11, C0618op.LATIN, 17));
        this.f4538.put(C0622ot.m749(r3, C0618op.LATIN, 15));
        this.f4538.put(C0622ot.m750(str4, C0618op.LATIN, true));
        this.f4540 = (short) (this.f4538.position() + 4);
    }
}
