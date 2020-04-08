package p004o;

import android.support.p000v4.view.InputDeviceCompat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: o.諒 */
final class C2047 extends C0762sz {
    C2047() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        String str;
        this.f4671 = 2045;
        String str2 = "???";
        int i3 = 512;
        byte b = byteBuffer.get();
        int i4 = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
        byte b2 = byteBuffer.get();
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        byte[] bArr2 = bArr;
        if (!z) {
            ByteBuffer byteBuffer2 = (ByteBuffer) ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN).position(0);
            ByteBuffer byteBuffer3 = byteBuffer2;
            C0618op opVar = C0618op.LOCAL;
            byte[] bArr3 = new byte[b2];
            byteBuffer2.get(bArr3);
            String r12 = C0622ot.m741(bArr3, opVar);
            byte b3 = byteBuffer3.get();
            if (b == 0) {
                i3 = C1014.f6140.f4506 ? byteBuffer3.getInt() : C0622ot.m731(byteBuffer3.getShort());
            } else {
                C0618op opVar2 = C0618op.LOCAL;
                byte[] bArr4 = new byte[b3];
                byteBuffer3.get(bArr4);
                str2 = C0622ot.m741(bArr4, opVar2);
            }
            C0453ix ixVar = C1014.f6147.f51;
            C0252cp cpVar = C1014.f6158;
            String r9 = C1014.f6160.mo3796(1629);
            String str3 = r9 == null ? "MSG1629" : r9;
            Object[] objArr = new Object[3];
            objArr[0] = r12;
            if (b == 0) {
                C1701 r8 = C1014.f6158.f674.f608.mo4465(i3);
                str = r8 == null ? null : r8.mo4462(true);
            } else {
                str = str2;
            }
            objArr[1] = str;
            C1701 r82 = C1014.f6158.f674.f608.mo4465(i4);
            objArr[2] = r82 == null ? null : r82.mo4462(true);
            ixVar.mo3873(String.format(str3, objArr), (int) InputDeviceCompat.SOURCE_ANY);
        }
    }
}
