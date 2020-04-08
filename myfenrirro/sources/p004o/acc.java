package p004o;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;
import net.hockeyapp.android.UpdateActivity;
import org.json.JSONArray;
import p004o.aay.C0165;

/* renamed from: o.acc */
public final class acc extends acb {

    /* renamed from: ą */
    protected boolean f258 = false;
    /* access modifiers changed from: private */

    /* renamed from: Ć */
    public Activity f259 = null;

    /* renamed from: ć */
    private AlertDialog f260 = null;

    /* renamed from: 鷭 */
    static /* synthetic */ void m95(acc acc, JSONArray jSONArray) {
        if (acc.f259 != null) {
            FragmentTransaction beginTransaction = acc.f259.getFragmentManager().beginTransaction();
            beginTransaction.setTransition(android.support.p000v4.app.FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            Fragment findFragmentByTag = acc.f259.getFragmentManager().findFragmentByTag("hockey_update_dialog");
            if (findFragmentByTag != null) {
                beginTransaction.remove(findFragmentByTag);
            }
            beginTransaction.addToBackStack(null);
            Class<abg> cls = abg.class;
            if (acc.f252 != null) {
                cls = abg.class;
            }
            try {
                ((DialogFragment) cls.getMethod("newInstance", new Class[]{JSONArray.class, String.class}).invoke(null, new Object[]{jSONArray, acc.mo3475("apk")})).show(beginTransaction, "hockey_update_dialog");
            } catch (Exception e) {
                String str = "An exception happened while showing the update fragment:";
                String str2 = "HockeyApp";
                if (acr.f312 <= 6) {
                    Log.e(str2, str);
                }
                e.printStackTrace();
                String str3 = "Showing update activity instead.";
                String str4 = "HockeyApp";
                if (acr.f312 <= 6) {
                    Log.e(str4, str3);
                }
                acc.m97(jSONArray, Boolean.valueOf(false));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [o.њ, o.abl] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=o.abl, code=null, for r5v0, types: [o.њ, o.abl] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public acc(java.lang.ref.WeakReference<android.app.Activity> r2, java.lang.String r3, java.lang.String r4, p004o.abl r5, boolean r6) {
        /*
            r1 = this;
            r1.<init>(r2, r3, r4, r5)
            r0 = 0
            r1.f259 = r0
            r0 = 0
            r1.f260 = r0
            r0 = 0
            r1.f258 = r0
            if (r2 == 0) goto L_0x0016
            java.lang.Object r0 = r2.get()
            android.app.Activity r0 = (android.app.Activity) r0
            r1.f259 = r0
        L_0x0016:
            r0 = 0
            r1.f258 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.acc.<init>(java.lang.ref.WeakReference, java.lang.String, java.lang.String, o.њ, boolean):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public final void onPostExecute(JSONArray jSONArray) {
        super.onPostExecute(jSONArray);
        if (jSONArray != null && this.f258) {
            JSONArray jSONArray2 = jSONArray;
            acz.m146(this.f259, jSONArray2.toString());
            if (this.f259 != null && !this.f259.isFinishing()) {
                Builder builder = new Builder(this.f259);
                builder.setTitle(C0165.hockeyapp_update_dialog_title);
                if (!this.f254.booleanValue()) {
                    builder.setMessage(C0165.hockeyapp_update_dialog_message);
                    builder.setNegativeButton(C0165.hockeyapp_update_dialog_negative_button, new acd(this));
                    builder.setPositiveButton(C0165.hockeyapp_update_dialog_positive_button, new ace(this, jSONArray2));
                    this.f260 = builder.create();
                    this.f260.show();
                    return;
                }
                String r4 = acx.m139((Context) this.f259);
                Toast.makeText(this.f259, String.format(this.f259.getString(C0165.hockeyapp_update_mandatory_toast), new Object[]{r4}), 1).show();
                m97(jSONArray2, Boolean.valueOf(true));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: 鷭 */
    public void m97(JSONArray jSONArray, Boolean bool) {
        Class<UpdateActivity> cls = null;
        if (this.f252 != null) {
            cls = UpdateActivity.class;
        }
        if (cls == null) {
            cls = UpdateActivity.class;
        }
        if (this.f259 != null) {
            Intent intent = new Intent();
            intent.setClass(this.f259, cls);
            intent.putExtra("json", jSONArray.toString());
            intent.putExtra("url", mo3475("apk"));
            this.f259.startActivity(intent);
            if (bool.booleanValue()) {
                this.f259.finish();
            }
        }
        super.mo3476();
        this.f259 = null;
        this.f260 = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public final void mo3476() {
        super.mo3476();
        this.f259 = null;
        this.f260 = null;
    }
}
