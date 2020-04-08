package p004o;

import java.util.Arrays;

/* renamed from: o.Ǔ */
final class C1100 extends C0328ew {
    C1100() {
        this.f4671 = -15470;
        byte[] r3 = C0622ot.m748(C0594nu.m681(), ":");
        if (r3.length != 6) {
            r3 = Arrays.copyOf(r3, 6);
        }
        int position = this.f4538.position();
        this.f4538.putInt(0);
        int position2 = this.f4538.position();
        this.f4538.putInt(0);
        this.f4538.putInt(C1014.f6140.f4476 != 0 ? C1014.f6140.f4476 : C1014.f6144.f7001.mo4076());
        this.f4538.putInt((int) C1014.m1823());
        this.f4538.put(r3);
        this.f4538.putShort(0);
        this.f4538.putShort((short) C1014.f6144.f7001.f4617);
        this.f4538.putShort((short) C1014.f6144.f7001.f4615);
        this.f4538.putShort((short) C1014.f6144.f7001.f4611);
        this.f4538.putShort((short) C1014.f6144.f7001.f4616);
        this.f4538.putInt(position, C1014.f6144.f7001.mo4077(this.f4538.array(), position2, this.f4538.position() - position2));
        this.f4540 = (short) (this.f4538.position() + 4);
    }
}
