package p004o;

/* renamed from: o.뛒 */
public class C1937 extends C0328ew {
    public C1937(int[] iArr, int i, int i2, int[] iArr2) {
        this.f4671 = 2020;
        this.f4538.putInt(i);
        this.f4538.putInt(i2);
        for (int i3 = 0; i3 < iArr2.length; i3++) {
            this.f4538.putShort((short) iArr2[i3]);
            this.f4538.putShort((short) iArr[i3]);
        }
        this.f4540 = (short) (this.f4538.position() + 4);
    }
}
