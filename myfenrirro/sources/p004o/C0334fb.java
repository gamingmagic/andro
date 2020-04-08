package p004o;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface.OnClickListener;

/* renamed from: o.fb */
final class C0334fb extends C0329ex {

    /* renamed from: ą */
    String f903;

    /* renamed from: Ć */
    String[] f904;

    /* renamed from: ć */
    private OnClickListener f905 = new C0335fc(this);

    C0334fb(String str, String str2, String[] strArr) {
        this.f903 = str2;
        this.f904 = strArr;
        String str3 = strArr[C1014.f6160.mo3795(str2, 0)];
        String str4 = str;
        this.f897 = str4;
        this.f896 = str3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3700() {
        Builder builder = new Builder(C1014.f6147);
        builder.setTitle(this.f897);
        builder.setItems(this.f904, this.f905);
        builder.show();
    }
}
