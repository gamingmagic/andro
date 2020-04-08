package p004o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* renamed from: o.怞 */
final class C1584 extends C0762sz {
    C1584() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2754;
        byteBuffer.get();
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        byte[] bArr2 = bArr;
        if (!z) {
            ByteBuffer byteBuffer2 = (ByteBuffer) ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN).position(0);
            ArrayList arrayList = new ArrayList();
            while (byteBuffer2.position() < i) {
                ByteBuffer byteBuffer3 = byteBuffer2;
                C1973 r2 = new C1973();
                r2.f8783 = C0560mn.values()[byteBuffer3.get()];
                r2.f8782 = byteBuffer3.getLong();
                r2.f8781 = byteBuffer3.get() != 0;
                r2.f8780 = C0558ml.values()[byteBuffer3.get()];
                C0618op opVar = C0618op.LOCAL;
                byte[] bArr3 = new byte[24];
                byteBuffer3.get(bArr3);
                r2.f8776 = C0622ot.m741(bArr3, opVar);
                r2.f8778 = byteBuffer3.getInt();
                short s = byteBuffer3.getShort();
                C0618op opVar2 = C0618op.LOCAL;
                byte[] bArr4 = new byte[s];
                byteBuffer3.get(bArr4);
                r2.f8779 = C0622ot.m741(bArr4, opVar2);
                arrayList.add(r2);
            }
            C1014.f6147.f51.f1451.mo3672(arrayList);
        }
    }
}
