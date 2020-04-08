package p004o;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import org.json.JSONException;

/* renamed from: o.鑺 */
public final class C1782 {

    /* renamed from: Ą */
    String f8306;

    /* renamed from: ą */
    public Context f8307;

    /* renamed from: Ć */
    public C1858 f8308;

    /* renamed from: ć */
    public int f8309;

    /* renamed from: ȃ */
    boolean f8310;

    /* renamed from: Ȋ */
    public C1785 f8311;

    /* renamed from: ˮ͈ */
    public boolean f8312;

    /* renamed from: ˮ͍ */
    public String f8313;

    /* renamed from: 岱 */
    String f8314;

    /* renamed from: 櫯 */
    boolean f8315;

    /* renamed from: 鷭 */
    public String f8316;

    /* renamed from: o.鑺$if */
    public interface C1783if {
    }

    /* renamed from: o.鑺$ˮ͈ */
    public interface C1784 {
    }

    /* renamed from: o.鑺$櫯 */
    public interface C1785 {
        /* renamed from: 鷭 */
        void mo3641(C1375 r1, C1530 r2);
    }

    /* renamed from: o.鑺$鷭 */
    public interface C1786 {
        /* renamed from: 鷭 */
        void mo3640(C1530 r1, C1375 r2);
    }

    /* renamed from: 鷭 */
    public final boolean mo4509(int i, int i2, Intent intent) {
        int i3;
        boolean z;
        if (i != this.f8309) {
            return false;
        }
        mo4508("handleActivityResult");
        this.f8306 = "";
        this.f8310 = false;
        if (intent == null) {
            Log.e(this.f8316, "In-app billing error: " + "Null data in IAB activity result.");
            C1375 r8 = new C1375(-1002, "Null data in IAB result");
            if (this.f8311 != null) {
                this.f8311.mo3641(r8, null);
            }
            return true;
        }
        Object obj = intent.getExtras().get("RESPONSE_CODE");
        if (obj == null) {
            Log.e(this.f8316, "In-app billing error: " + "Intent with no response code, assuming OK (known issue)");
            i3 = 0;
        } else if (obj instanceof Integer) {
            i3 = ((Integer) obj).intValue();
        } else if (obj instanceof Long) {
            i3 = (int) ((Long) obj).longValue();
        } else {
            Log.e(this.f8316, "In-app billing error: " + "Unexpected type for intent response code.");
            Log.e(this.f8316, "In-app billing error: " + obj.getClass().getName());
            throw new RuntimeException("Unexpected type for intent response code: " + obj.getClass().getName());
        }
        String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
        String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
        if (i2 == -1 && i3 == 0) {
            new StringBuilder("Extras: ").append(intent.getExtras());
            if (stringExtra == null || stringExtra2 == null) {
                Log.e(this.f8316, "In-app billing error: " + "BUG: either purchaseData or dataSignature is null.");
                intent.getExtras();
                C1375 r82 = new C1375(-1008, "IAB returned null purchaseData or dataSignature");
                if (this.f8311 != null) {
                    this.f8311.mo3641(r82, null);
                }
                return true;
            }
            try {
                C1530 r9 = new C1530(this.f8313, stringExtra, stringExtra2);
                String str = r9.f7290;
                String str2 = stringExtra2;
                String str3 = stringExtra;
                String str4 = this.f8314;
                if (str3 == null) {
                    Log.e("IABUtil/Security", "data is null");
                    z = false;
                } else {
                    z = TextUtils.isEmpty(str2) || C1890.m2563(C1890.m2562(str4), str3, str2);
                }
                if (!z) {
                    Log.e(this.f8316, "In-app billing error: " + ("Purchase signature verification FAILED for sku " + str));
                    C1375 r83 = new C1375(-1003, "Signature verification failed for sku " + str);
                    if (this.f8311 != null) {
                        this.f8311.mo3641(r83, r9);
                    }
                    return true;
                } else if (this.f8311 != null) {
                    this.f8311.mo3641(new C1375(0, "Success"), r9);
                }
            } catch (JSONException e) {
                Log.e(this.f8316, "In-app billing error: " + "Failed to parse purchase data.");
                e.printStackTrace();
                C1375 r84 = new C1375(-1002, "Failed to parse purchase data.");
                if (this.f8311 != null) {
                    this.f8311.mo3641(r84, null);
                }
                return true;
            }
        } else if (i2 == -1) {
            m2448(i3);
            if (this.f8311 != null) {
                this.f8311.mo3641(new C1375(i3, "Problem purchashing item."), null);
            }
        } else if (i2 == 0) {
            m2448(i3);
            C1375 r85 = new C1375(-1005, "User canceled.");
            if (this.f8311 != null) {
                this.f8311.mo3641(r85, null);
            }
        } else {
            Log.e(this.f8316, "In-app billing error: " + ("Purchase failed. Result code: " + Integer.toString(i2) + ". Response: " + m2448(i3)));
            C1375 r86 = new C1375(-1006, "Unknown purchase response.");
            if (this.f8311 != null) {
                this.f8311.mo3641(r86, null);
            }
        }
        return true;
    }

    /* renamed from: 鷭 */
    public static String m2448(int i) {
        String[] split = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split("/");
        String[] split2 = "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error/-1009:Subscriptions not available/-1010:Invalid consumption attempt".split("/");
        if (i <= -1000) {
            int i2 = -1000 - i;
            if (i2 < 0 || i2 >= split2.length) {
                return String.valueOf(i) + ":Unknown IAB Helper Error";
            }
            return split2[i2];
        } else if (i < 0 || i >= split.length) {
            return String.valueOf(i) + ":Unknown";
        } else {
            return split[i];
        }
    }

    /* renamed from: 鷭 */
    public final void mo4508(String str) {
        if (!this.f8315) {
            Log.e(this.f8316, "In-app billing error: " + ("Illegal state for operation (" + str + "): IAB helper is not set up."));
            throw new IllegalStateException("IAB helper is not set up. Can't perform operation: " + str);
        }
    }

    /* renamed from: 櫯 */
    public final void mo4507(String str) {
        if (this.f8310) {
            throw new IllegalStateException("Can't start async operation (" + str + ") because another async operation(" + this.f8306 + ") is in progress.");
        }
        this.f8306 = str;
        this.f8310 = true;
    }
}
