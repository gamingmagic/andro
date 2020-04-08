package p004o;

/* renamed from: o.Ʀ */
final class C1082 extends C0328ew {
    C1082(int i, int[] iArr) {
        this.f4671 = 398;
        if (iArr == null) {
            iArr = new int[3];
        }
        if (C1014.f6140.f4506) {
            this.f4538.putInt(i);
            for (int putInt : iArr) {
                this.f4538.putInt(putInt);
            }
            return;
        }
        this.f4538.putShort((short) i);
        for (int i2 : iArr) {
            this.f4538.putShort((short) i2);
        }
    }
}
