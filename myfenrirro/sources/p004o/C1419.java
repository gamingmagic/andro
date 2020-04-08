package p004o;

/* renamed from: o.㤀 */
final class C1419 extends C0328ew {
    C1419(int i, int i2, int[] iArr, int[] iArr2) {
        if (C1014.f6140.f4470 >= 20100105) {
            this.f4671 = 2049;
            this.f4538.putInt(i);
            this.f4538.putInt(i2);
        } else {
            this.f4671 = 308;
            this.f4538.putInt(i);
        }
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.f4538.putShort((short) iArr2[i3]);
            this.f4538.putShort((short) iArr[i3]);
        }
        this.f4540 = (short) (this.f4538.position() + 4);
    }
}
