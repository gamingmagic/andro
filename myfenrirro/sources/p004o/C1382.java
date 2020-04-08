package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ↂ */
final class C1382 extends C0762sz {
    C1382() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 664;
        int i3 = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
        int i4 = byteBuffer.getInt();
        if (!z) {
            C1746 r0 = C1014.f6147.f51.f1427;
            C0252cp cpVar = C1014.f6158;
            String r9 = C1014.f6160.mo3796(1271);
            String str = r9 == null ? "MSG1271" : r9;
            Object[] objArr = new Object[2];
            C1701 r7 = C1014.f6158.f674.f608.mo4465(i3);
            objArr[0] = r7 == null ? null : r7.mo4462(true);
            objArr[1] = Integer.valueOf(i4);
            r0.mo4490(String.format(str, objArr), 16776960);
        }
    }
}
