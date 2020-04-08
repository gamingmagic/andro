package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: o.hy */
public class C0425hy implements OnClickListener {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ String f1230;

    /* renamed from: 櫯 */
    private final /* synthetic */ String f1231;

    /* renamed from: 鷭 */
    final /* synthetic */ C0421hu f1232;

    public C0425hy(C0421hu huVar, String str, String str2) {
        this.f1232 = huVar;
        this.f1231 = str;
        this.f1230 = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C0421hu huVar = this.f1232;
        String str = this.f1231;
        String str2 = this.f1230;
        if (C0595nv.f2876 == null) {
            C0595nv.f2876 = new C0205ba(null, false, false, str, str2, null);
        }
        huVar.f1226.mo3385();
    }
}
