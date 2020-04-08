package p004o;

import android.support.p000v4.view.ViewCompat;

/* renamed from: o.al */
final class C0189al extends C1443 {

    /* renamed from: Ą */
    private static final int[] f399 = {2634565, 3372142, 987406, 4982803, 3366715, 7632966, 4404548, 3748647, 7829365, 131889, 795167, 327680};

    static {
    }

    C0189al(C1739 r11, int i) {
        if (!(C1014.f6142.f1680.f1198.f1316.get("party_minimap_mark") != null)) {
            byte[] bArr = new byte[36];
            bArr[7] = 1;
            bArr[8] = 1;
            bArr[9] = 1;
            bArr[10] = 1;
            bArr[13] = 1;
            bArr[14] = 1;
            bArr[15] = 1;
            bArr[16] = 1;
            bArr[19] = 1;
            bArr[20] = 1;
            bArr[21] = 1;
            bArr[22] = 1;
            bArr[25] = 1;
            bArr[26] = 1;
            bArr[27] = 1;
            bArr[28] = 1;
            int[] iArr = new int[256];
            iArr[0] = -1;
            iArr[1] = -16777216;
            C1014.f6142.f1680.f1198.mo3836(bArr, iArr, 6, 6, "party_minimap_mark", null);
            C1812 r9 = C1014.f6142.f1698;
            C0190am amVar = new C0190am();
            C1812 r7 = r9;
            synchronized (r9) {
                r7.f8360.add(amVar);
            }
        }
        String str = "party_minimap_pal" + i;
        if (!(C1014.f6142.f1680.f1198.f1319.get(str) != null)) {
            int length = i % f399.length;
            int[] iArr2 = new int[256];
            iArr2[0] = -2130706433;
            iArr2[1] = f399[length] | ViewCompat.MEASURED_STATE_MASK;
            C1014.f6142.f1680.f1198.mo3835(iArr2, str);
            C1812 r92 = C1014.f6142.f1698;
            C0191an anVar = new C0191an();
            C1812 r72 = r92;
            synchronized (r92) {
                r72.f8360.add(anVar);
            }
        }
        super.mo4341(r11, C1014.f6142.f1680.f1198, "party_minimap_mark", 2.0f);
    }
}
