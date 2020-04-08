package p004o;

import org.json.JSONObject;

/* renamed from: o.刴 */
public final class C1530 {

    /* renamed from: Ą */
    long f7286;

    /* renamed from: ą */
    int f7287;

    /* renamed from: Ć */
    String f7288;

    /* renamed from: ć */
    String f7289;

    /* renamed from: ȃ */
    String f7290;

    /* renamed from: ˮ͈ */
    String f7291;

    /* renamed from: ˮ͍ */
    public String f7292;

    /* renamed from: 岱 */
    public String f7293;

    /* renamed from: 櫯 */
    String f7294;

    /* renamed from: 鷭 */
    String f7295;

    public C1530(String str, String str2, String str3) {
        this.f7295 = str;
        this.f7292 = str2;
        JSONObject jSONObject = new JSONObject(this.f7292);
        this.f7294 = jSONObject.optString("orderId");
        this.f7291 = jSONObject.optString("packageName");
        this.f7290 = jSONObject.optString("productId");
        this.f7286 = jSONObject.optLong("purchaseTime");
        this.f7287 = jSONObject.optInt("purchaseState");
        this.f7288 = jSONObject.optString("developerPayload");
        this.f7289 = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
        this.f7293 = str3;
    }

    public final String toString() {
        return "PurchaseInfo(type:" + this.f7295 + "):" + this.f7292;
    }
}
