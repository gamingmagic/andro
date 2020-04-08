package p004o;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface.OnClickListener;

/* renamed from: o.fd */
final class C0336fd extends C0329ex {
    /* access modifiers changed from: private */

    /* renamed from: ą */
    public static final int[] f907;
    /* access modifiers changed from: private */

    /* renamed from: Ć */
    public static final String[] f908 = {"Default", "Landscape", "Portrait", "Sensor"};

    /* renamed from: ć */
    private OnClickListener f909 = new C0337fe(this);

    static {
        int[] iArr = new int[4];
        iArr[0] = -1;
        iArr[2] = 1;
        iArr[3] = 4;
        f907 = iArr;
    }

    C0336fd() {
        for (int i = 0; i < f907.length; i++) {
            if (C0595nv.f2871 == f907[i]) {
                String str = f908[i];
                this.f897 = "Screen orientation";
                this.f896 = str;
                return;
            }
        }
        String str2 = f908[0];
        this.f897 = "Screen orientation";
        this.f896 = str2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3700() {
        Builder builder = new Builder(C1014.f6147);
        builder.setItems(f908, this.f909);
        builder.show();
    }
}
