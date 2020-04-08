package p004o;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

/* renamed from: o.Ұ */
class C1292 implements Runnable {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ C1761 f6470;

    /* renamed from: 櫯 */
    private final /* synthetic */ C1977 f6471;

    /* renamed from: 鷭 */
    final /* synthetic */ C1907 f6472;

    C1292(C1907 r1, C1977 r2, C1761 r3) {
        this.f6472 = r1;
        this.f6471 = r2;
        this.f6470 = r3;
    }

    public final void run() {
        if (!(this.f6472.f8580.f8572 == this.f6471 && this.f6472.f8580.f8571 == this.f6470)) {
            this.f6472.f8580 = new C1906(this.f6470, this.f6471);
        }
        C0252cp cpVar = C1014.f6158;
        C0405hk hkVar = this.f6472.f8580.f8573;
        C1761 r10 = this.f6470;
        int i = this.f6472.f8579;
        int i2 = this.f6472.f8591;
        byte ordinal = (byte) this.f6471.ordinal();
        C0253if ifVar = null;
        C0405hk r15 = cpVar.mo3623(r10, i, ordinal, true);
        if (i2 > 0) {
            ifVar = cpVar.mo3619(r10, false, i, i2, C1977.values()[ordinal], true, true);
        }
        C0408hl hlVar = new C0408hl(hkVar, new C0405hk[]{hkVar, r15});
        int[][] iArr = new int[2][];
        iArr[1] = ifVar != null ? ifVar.f681 : null;
        int[] r8 = hlVar.mo3787(iArr, C0561mo.STAND.f1849 * 8, 0, 128, 128, 64);
        Bitmap createBitmap = Bitmap.createBitmap(128, 128, Config.ARGB_8888);
        createBitmap.setPixels(r8, 0, 128, 0, 0, 128, 128);
        C1014.f6147.mo3387((Runnable) new C1884(this, createBitmap));
    }
}
