package p004o;

/* renamed from: o.Ɯ */
final class C1076 extends C0328ew {
    C1076(String str, long j, String str2, String str3, int i) {
        this.f4671 = 2668;
        this.f4538.put(C0622ot.m749(C1014.f6137.f1636.f8657, C0618op.LOCAL, 24));
        this.f4538.put(C0622ot.m749(str, C0618op.LOCAL, 24));
        this.f4538.putLong(j);
        this.f4538.putShort((short) (str2.length() + 1));
        this.f4538.putShort((short) str3.length());
        this.f4538.put(C0622ot.m749(str2, C0618op.LOCAL, str2.length() + 1));
        this.f4538.put(C0622ot.m749(str3, C0618op.LOCAL, str3.length() + 1));
        this.f4538.putInt(i);
        this.f4540 = (short) (this.f4538.position() + 4);
    }
}
