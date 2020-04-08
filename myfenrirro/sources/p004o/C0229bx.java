package p004o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* renamed from: o.bx */
class C0229bx implements Runnable {

    /* renamed from: 櫯 */
    private final /* synthetic */ boolean[] f519;

    /* renamed from: 鷭 */
    final /* synthetic */ C0214bi f520;

    C0229bx(C0214bi biVar, boolean[] zArr) {
        this.f520 = biVar;
        this.f519 = zArr;
    }

    public final void run() {
        Bitmap bitmap;
        String str;
        try {
            C0252cp cpVar = C1014.f6158;
            if (C1014.f6140.f4473 == null || C1014.f6140.f4473.size() == 0) {
                str = String.format("loading%02d.jpg", new Object[]{Integer.valueOf((int) (Math.random() * 11.0d))});
            } else {
                str = (String) C1014.f6140.f4473.get((int) (Math.random() * ((double) C1014.f6140.f4473.size())));
            }
            byte[] bArr = (byte[]) cpVar.f677.mo3613("data\\texture\\" + cpVar.f674.f623.f7904.f7928 + "\\" + str, false);
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        } catch (C0825tu unused) {
            bitmap = null;
        }
        C1014.f6147.mo3387((Runnable) new C0230by(this, bitmap, this.f519));
    }
}
