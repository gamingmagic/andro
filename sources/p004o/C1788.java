package p004o;

import p004o.C0643pc.aux;

/* renamed from: o.锣 */
final class C1788 extends C0328ew {
    C1788(int[] iArr, int[] iArr2, int[] iArr3, int i) {
        this.f4671 = 2120;
        this.f4538.putShort((short) iArr.length);
        if (C1014.f6140.f4443 != aux.iRO_Renewal) {
            this.f4538.putInt(i);
        }
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f4538.putInt(iArr[i2]);
            this.f4538.putInt(iArr2[i2]);
            this.f4538.putShort((short) iArr3[i2]);
        }
        this.f4540 = (short) (this.f4538.position() + 4);
    }
}
