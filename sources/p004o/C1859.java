package p004o;

/* renamed from: o.麹 */
final class C1859 extends C0328ew {
    C1859(int i, boolean z, byte[] bArr, String str) {
        this.f4671 = 213;
        if (bArr.length != 8) {
            throw new C0588no("Invalid chatroom password length " + bArr.length);
        }
        this.f4538.putShort((short) i);
        this.f4538.put((byte) (z ? 0 : 1));
        this.f4538.put(bArr);
        this.f4538.put(C0622ot.m750(str, C0618op.LOCAL, false));
        this.f4540 = (short) (this.f4538.position() + 4);
    }
}
