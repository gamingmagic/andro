package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ʤ */
final class C1177 extends C0762sz {
    C1177() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 340;
        C1178[] r8 = new C1178[i];
        for (int i3 = 0; i3 < r8.length; i3++) {
            ByteBuffer byteBuffer2 = byteBuffer;
            C1178 r2 = new C1178();
            r2.f6297 = byteBuffer2.getInt();
            r2.f6295 = byteBuffer2.getInt();
            r2.f6292 = byteBuffer2.getShort();
            r2.f6290 = byteBuffer2.getShort();
            r2.f6285 = byteBuffer2.getShort();
            r2.f6286 = byteBuffer2.getShort();
            r2.f6287 = byteBuffer2.getShort();
            r2.f6288 = byteBuffer2.getInt();
            r2.f6293 = byteBuffer2.getInt();
            r2.f6294 = byteBuffer2.getInt();
            C0618op opVar = C0618op.LOCAL;
            byte[] bArr = new byte[50];
            byteBuffer2.get(bArr);
            r2.f6291 = C0622ot.m741(bArr, opVar);
            C0618op opVar2 = C0618op.LOCAL;
            byte[] bArr2 = new byte[24];
            byteBuffer2.get(bArr2);
            r2.f6289 = C0622ot.m741(bArr2, opVar2);
            r8[i3] = r2;
        }
        if (!z) {
            m1929(r8);
        }
    }

    /* renamed from: 鷭 */
    static void m1929(C1178[] r7) {
        if (C1014.f6137.f1636.f6541 == null) {
            C1014.f6137.f1636.f6541 = new C1503();
        }
        C1503 r3 = C1014.f6137.f1636.f6541;
        r3.f7213.clear();
        for (C1178 r5 : r7) {
            C1506 r6 = new C1506();
            r3.f7213.add(r6);
            r6.f7240 = r5.f6297;
            r6.f7238 = r5.f6295;
            r6.f7234 = r5.f6292;
            r6.f7232 = r5.f6290;
            r6.f7227 = (byte) r5.f6285;
            r6.f7228 = r5.f6286;
            r6.f7229 = r5.f6287;
            r6.f7230 = r5.f6288;
            r6.f7235 = r5.f6293 != 0;
            r6.f7237 = r5.f6294;
            r6.f7233 = r5.f6289;
            if (r6.f7233 == null) {
                r6.f7233 = (String) C1014.f6152.f7977.get(Integer.valueOf(r6.f7238));
                if (r6.f7233 == null) {
                    C1014.f6144.mo3652((C0839ue) new C1086(r6.f7238));
                }
            }
        }
        if (C1014.f6147.f51.f1383.f1626.getParent() != null) {
            C1014.f6147.f51.f1383.f7300.mo4444();
        }
    }
}
