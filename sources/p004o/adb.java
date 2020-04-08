package p004o;

import java.util.Comparator;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.adb */
class adb implements Comparator<JSONObject> {

    /* renamed from: 鷭 */
    final /* synthetic */ ada f342;

    adb(ada ada) {
        this.f342 = ada;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return m160((JSONObject) obj, (JSONObject) obj2);
    }

    /* renamed from: 鷭 */
    private static int m160(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            if (jSONObject.getInt(ClientCookie.VERSION_ATTR) > jSONObject2.getInt(ClientCookie.VERSION_ATTR)) {
                return 0;
            }
        } catch (JSONException unused) {
        } catch (NullPointerException unused2) {
        }
        return 0;
    }
}
