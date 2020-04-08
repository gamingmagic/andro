package p004o;

import android.util.Log;

/* renamed from: o.廕 */
final class C1573 extends C0328ew {
    C1573(byte[] bArr) {
        this.f4671 = 516;
        if (bArr.length != 16) {
            String str = "Invalid hash";
            Log.e("AndRO", str);
            throw new C0588no(str);
        }
        this.f4538.put(bArr);
    }
}
