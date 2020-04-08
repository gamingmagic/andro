package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.喓 */
final class C1540 extends C0762sz {
    C1540() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 538;
        String[] strArr = new String[10];
        for (int i3 = 0; i3 < strArr.length; i3++) {
            C0618op opVar = C0618op.LOCAL;
            byte[] bArr = new byte[24];
            byteBuffer.get(bArr);
            strArr[i3] = C0622ot.m741(bArr, opVar);
        }
        int[] iArr = new int[10];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            iArr[i4] = byteBuffer.getInt();
        }
        if (!z) {
            m2228("ALCHEMIST", strArr, iArr, -1);
        }
    }

    /* renamed from: 鷭 */
    static void m2228(String str, String[] strArr, int[] iArr, int i) {
        C1014.f6147.f51.f1427.mo4490("=== " + str + " RANK ===", 11927477);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            C1014.f6147.f51.f1427.mo4490(String.format("[ %2d ] %24s : %d POINT", new Object[]{Integer.valueOf(i2 + 1), strArr[i2], Integer.valueOf(iArr[i2])}), 11927477);
        }
        C1014.f6147.f51.f1427.mo4490("=====================", 11927477);
        C1014.f6147.f51.f1427.mo4490("MY POINT : " + (i == -1 ? C1014.f6137.f1636.f6512 : i) + " POINT", 11927477);
        C1014.f6147.f51.f1427.mo4490("=====================", 11927477);
    }
}
