package p004o;

/* renamed from: o.뛚 */
final class C1940 extends C0328ew {
    C1940(int[] iArr, int[] iArr2) {
        this.f4671 = 200;
        for (int i = 0; i < iArr.length; i++) {
            this.f4538.putShort((short) iArr2[i]);
            if (C1014.f6140.f4506) {
                this.f4538.putInt(iArr[i]);
            } else {
                this.f4538.putShort((short) iArr[i]);
            }
        }
        this.f4540 = (short) (this.f4538.position() + 4);
    }
}
