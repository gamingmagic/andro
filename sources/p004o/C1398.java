package p004o;

import android.support.p000v4.view.MotionEventCompat;
import java.nio.ByteBuffer;

/* renamed from: o.ㆁ */
final class C1398 extends C0762sz {
    C1398() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        this.f4671 = 526;
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String r9 = C0622ot.m741(bArr, opVar);
        int i7 = byteBuffer.getInt();
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        if (!z) {
            switch (b2) {
                case 0:
                    switch (b) {
                        case 0:
                            i6 = 838;
                            break;
                        case 1:
                            i6 = 839;
                            break;
                        case 2:
                            i6 = 840;
                            break;
                        default:
                            return;
                    }
                    C1746 r0 = C1014.f6147.f51.f1427;
                    C0252cp cpVar = C1014.f6158;
                    String r6 = C1014.f6160.mo3796(i6);
                    r0.mo4490(String.format(r6 == null ? "MSG" + i6 : r6, new Object[]{C1014.f6137.f1636.f8657, r9}), 13553407);
                    return;
                case 1:
                    switch (b) {
                        case 0:
                            i5 = 841;
                            break;
                        case 1:
                            i5 = 842;
                            break;
                        case 2:
                            i5 = 843;
                            break;
                        default:
                            return;
                    }
                    C1746 r02 = C1014.f6147.f51.f1427;
                    C0252cp cpVar2 = C1014.f6158;
                    String r62 = C1014.f6160.mo3796(i5);
                    r02.mo4490(String.format(r62 == null ? "MSG" + i5 : r62, new Object[]{C1014.f6137.f1636.f8657, r9}), 13553407);
                    return;
                case 10:
                    switch (b) {
                        case 0:
                            i4 = 844;
                            break;
                        case 1:
                            i4 = 845;
                            break;
                        case 2:
                            i4 = 846;
                            break;
                        default:
                            return;
                    }
                    C1746 r03 = C1014.f6147.f51.f1427;
                    C0252cp cpVar3 = C1014.f6158;
                    String r63 = C1014.f6160.mo3796(i4);
                    r03.mo4490(String.format(r63 == null ? "MSG" + i4 : r63, new Object[]{C1014.f6137.f1636.f8657, r9}), 13553407);
                    return;
                case 11:
                    switch (b) {
                        case 0:
                            i3 = 847;
                            break;
                        case 1:
                            i3 = 848;
                            break;
                        case 2:
                            i3 = 849;
                            break;
                        default:
                            return;
                    }
                    C1746 r04 = C1014.f6147.f51.f1427;
                    C0252cp cpVar4 = C1014.f6158;
                    String r64 = C1014.f6160.mo3796(i3);
                    r04.mo4490(String.format(r64 == null ? "MSG" + i3 : r64, new Object[]{C1014.f6137.f1636.f8657, r9}), 13553407);
                    return;
                case 20:
                    C1746 r05 = C1014.f6147.f51.f1427;
                    C0252cp cpVar5 = C1014.f6158;
                    String r65 = C1014.f6160.mo3796(928);
                    r05.mo4490(String.format(r65 == null ? "MSG928" : r65, new Object[]{r9, Byte.valueOf(b)}), 13553407);
                    return;
                case 21:
                    C1746 r06 = C1014.f6147.f51.f1427;
                    C0252cp cpVar6 = C1014.f6158;
                    String r66 = C1014.f6160.mo3796(1191);
                    r06.mo4490(String.format(r66 == null ? "MSG1191" : r66, new Object[]{r9}), 13553407);
                    return;
                case 22:
                    C1746 r07 = C1014.f6147.f51.f1427;
                    C0252cp cpVar7 = C1014.f6158;
                    String r67 = C1014.f6160.mo3796(1266);
                    String str = r67 == null ? "MSG1266" : r67;
                    Object[] objArr = new Object[1];
                    C1701 r11 = C1014.f6158.f674.f608.mo4465(i7);
                    objArr[0] = r11 == null ? null : r11.mo4462(true);
                    r07.mo4490(String.format(str, objArr), 13553407);
                    return;
                case 30:
                    C1746 r08 = C1014.f6147.f51.f1427;
                    C0252cp cpVar8 = C1014.f6158;
                    String r68 = C1014.f6160.mo3796(1034);
                    r08.mo4490(r68 == null ? "MSG1034" : r68, 13553407);
                    return;
                case MotionEventCompat.AXIS_GENERIC_9 /*40*/:
                    C1014.f6147.f51.f1427.mo4490("Target HP: " + i7, 13553407);
                    break;
            }
        }
    }
}
