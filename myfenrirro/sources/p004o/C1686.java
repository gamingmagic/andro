package p004o;

/* renamed from: o.瑷 */
final class C1686 extends C0328ew {
    C1686(int i, byte[] bArr) {
        this.f4671 = 2089;
        if (bArr.length != 6) {
            throw new C0588no("Unexpected birth date length != 6: " + bArr.length);
        }
        this.f4538.putInt(i);
        this.f4538.put(bArr);
    }
}
