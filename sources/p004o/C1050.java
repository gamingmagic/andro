package p004o;

/* renamed from: o.ũ */
final class C1050 extends C0328ew {
    C1050(int[] iArr, int[] iArr2) {
        this.f4671 = 201;
        for (int i = 0; i < iArr.length; i++) {
            this.f4538.putShort((short) (iArr[i] + 2));
            this.f4538.putShort((short) iArr2[i]);
        }
        this.f4540 = (short) (this.f4538.position() + 4);
    }
}
