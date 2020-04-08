package p004o;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import p004o.C0766tb.C0768.C0769.C0770if;

/* renamed from: o.ꅗ */
class C1871 implements Runnable {

    /* renamed from: 櫯 */
    private final /* synthetic */ C1506 f8460;

    /* renamed from: 鷭 */
    final /* synthetic */ C2048 f8461;

    C1871(C2048 r1, C1506 r2) {
        this.f8461 = r1;
        this.f8460 = r2;
    }

    public final void run() {
        C0405hk hkVar = new C0405hk(C1014.f6158.f674.mo3610(C1761.m2430(this.f8460.f7228), (int) this.f8460.f7234, this.f8460.f7227), false, false, true);
        int[] iArr = null;
        if (this.f8460.f7232 > 0) {
            iArr = C1014.f6158.mo3619(C1761.m2430(this.f8460.f7228), false, this.f8460.f7234, this.f8460.f7232, C1977.values()[this.f8460.f7227], false, false).f681;
        }
        if (iArr == null) {
            iArr = new int[256];
            for (int i = 0; i < hkVar.f1146.length; i++) {
                int i2 = hkVar.f1146[i];
                iArr[i] = (-16711936 & i2) | ((16711680 & i2) >> 16) | ((i2 & 255) << 16);
            }
        }
        int i3 = -1;
        for (C0770if ifVar : hkVar.f1148.f4682[0].f4692[0].f4697) {
            i3 = ifVar.f4708;
            if (i3 >= 0) {
                break;
            }
        }
        if (i3 != -1) {
            byte[] bArr = hkVar.f1144[i3].f1164;
            int[] iArr2 = new int[bArr.length];
            for (int i4 = 0; i4 < bArr.length; i4++) {
                iArr2[i4] = iArr[C0622ot.m730(bArr[i4])];
            }
            Bitmap createBitmap = Bitmap.createBitmap(hkVar.f1144[i3].f1157, hkVar.f1144[i3].f1158, Config.ARGB_8888);
            createBitmap.setPixels(iArr2, 0, hkVar.f1144[i3].f1157, 0, 0, hkVar.f1144[i3].f1157, hkVar.f1144[i3].f1158);
            C1014.f6147.mo3387((Runnable) new C1696(this, createBitmap));
        }
    }
}
