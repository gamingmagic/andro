package p004o;

import java.util.Arrays;

/* renamed from: o.Ĭ */
final class C1032 extends C0867va {
    C1032(String str) {
        if (C1014.f6154 != null) {
            C1014.f6154.getChars(0, Math.min(C1014.f6154.length(), this.f5130.length), this.f5130, 0);
        }
        if (!(C1014.f6137 == null || C1014.f6137.f1636 == null)) {
            C1301 r5 = C1014.f6137.f1636;
            if (r5.f8657 != null) {
                r5.f8657.getChars(0, Math.min(r5.f8657.length(), this.f5126.length), this.f5126, 0);
            }
            this.f5127 = (short) r5.f1633;
            this.f5132 = (short) r5.f1634;
            this.f5134 = (short) r5.f1631;
        }
        if (!(C1014.f6141 == null || C1014.f6141.f6185 == null)) {
            C1014.f6141.f6185.getChars(0, Math.min(this.f5128.length, C1014.f6141.f6185.length()), this.f5128, 0);
        }
        if (!(C1014.f6141 == null || C1014.f6141.f6184 == null)) {
            C1014.f6141.f6184.getChars(0, Math.min(this.f5131.length, C1014.f6141.f6184.length()), this.f5131, 0);
        }
        this.f5129 = (short) C1014.f6144.f7018.f4653;
        if (!(C1014.f6141 == null || C1014.f6141.f6182 == null)) {
            C1014.f6141.f6182.getChars(0, Math.min(this.f5135.length, C1014.f6141.f6182.length()), this.f5135, 0);
        }
        if (!(C1014.f6140 == null || C1014.f6140.f4522 == null)) {
            C1014.f6140.f4522.getChars(0, Math.min(this.f5133.length, C1014.f6140.f4522.length()), this.f5133, 0);
        }
        this.f5136 = str != null ? str.toCharArray() : "null".toCharArray();
        if (this.f5136.length > 1000) {
            this.f5136 = Arrays.copyOf(this.f5136, 1000);
        }
    }
}
