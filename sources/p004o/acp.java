package p004o;

/* renamed from: o.acp */
public final class acp {

    /* renamed from: o.acp$鷭 */
    public static class C0175 {

        /* renamed from: 鷭 */
        public static final acp f311 = new acp();

        static {
        }
    }

    private acp() {
    }

    /* JADX WARNING: type inference failed for: r22v0, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r22v1 */
    /* JADX WARNING: type inference failed for: r0v63, types: [java.util.List<o.abt>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p004o.abw m119(java.lang.String r31) {
        /*
            r2 = 0
            if (r31 == 0) goto L_0x0230
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x022c }
            r0 = r31
            r3.<init>(r0)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r0 = "feedback"
            org.json.JSONObject r4 = r3.getJSONObject(r0)     // Catch:{ JSONException -> 0x022c }
            o.abs r31 = new o.abs     // Catch:{ JSONException -> 0x022c }
            r0 = r31
            r0.<init>()     // Catch:{ JSONException -> 0x022c }
            java.lang.String r0 = "messages"
            org.json.JSONArray r5 = r4.getJSONArray(r0)     // Catch:{ JSONException -> 0x022c }
            r6 = 0
            int r0 = r5.length()     // Catch:{ JSONException -> 0x022c }
            if (r0 <= 0) goto L_0x01b3
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ JSONException -> 0x022c }
            r6.<init>()     // Catch:{ JSONException -> 0x022c }
            r8 = 0
        L_0x002a:
            int r0 = r5.length()     // Catch:{ JSONException -> 0x022c }
            if (r8 >= r0) goto L_0x01b3
            org.json.JSONObject r0 = r5.getJSONObject(r8)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r1 = "subject"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r9 = r0.toString()     // Catch:{ JSONException -> 0x022c }
            org.json.JSONObject r0 = r5.getJSONObject(r8)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r1 = "text"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r10 = r0.toString()     // Catch:{ JSONException -> 0x022c }
            org.json.JSONObject r0 = r5.getJSONObject(r8)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r1 = "oem"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r11 = r0.toString()     // Catch:{ JSONException -> 0x022c }
            org.json.JSONObject r0 = r5.getJSONObject(r8)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r1 = "model"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r12 = r0.toString()     // Catch:{ JSONException -> 0x022c }
            org.json.JSONObject r0 = r5.getJSONObject(r8)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r1 = "os_version"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r13 = r0.toString()     // Catch:{ JSONException -> 0x022c }
            org.json.JSONObject r0 = r5.getJSONObject(r8)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r1 = "created_at"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r14 = r0.toString()     // Catch:{ JSONException -> 0x022c }
            org.json.JSONObject r0 = r5.getJSONObject(r8)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r1 = "id"
            int r15 = r0.getInt(r1)     // Catch:{ JSONException -> 0x022c }
            org.json.JSONObject r0 = r5.getJSONObject(r8)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r1 = "token"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r16 = r0.toString()     // Catch:{ JSONException -> 0x022c }
            org.json.JSONObject r0 = r5.getJSONObject(r8)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r1 = "via"
            int r17 = r0.getInt(r1)     // Catch:{ JSONException -> 0x022c }
            org.json.JSONObject r0 = r5.getJSONObject(r8)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r1 = "user_string"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r18 = r0.toString()     // Catch:{ JSONException -> 0x022c }
            org.json.JSONObject r0 = r5.getJSONObject(r8)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r1 = "clean_text"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r19 = r0.toString()     // Catch:{ JSONException -> 0x022c }
            org.json.JSONObject r0 = r5.getJSONObject(r8)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r1 = "name"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r20 = r0.toString()     // Catch:{ JSONException -> 0x022c }
            org.json.JSONObject r0 = r5.getJSONObject(r8)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r1 = "app_id"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r21 = r0.toString()     // Catch:{ JSONException -> 0x022c }
            org.json.JSONObject r0 = r5.getJSONObject(r8)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r1 = "attachments"
            org.json.JSONArray r7 = r0.optJSONArray(r1)     // Catch:{ JSONException -> 0x022c }
            java.util.List r22 = java.util.Collections.emptyList()     // Catch:{ JSONException -> 0x022c }
            if (r7 == 0) goto L_0x017d
            java.util.ArrayList r22 = new java.util.ArrayList     // Catch:{ JSONException -> 0x022c }
            r0 = r22
            r0.<init>()     // Catch:{ JSONException -> 0x022c }
            r23 = 0
        L_0x00f7:
            int r0 = r7.length()     // Catch:{ JSONException -> 0x022c }
            r1 = r23
            if (r1 >= r0) goto L_0x017d
            r0 = r23
            org.json.JSONObject r0 = r7.getJSONObject(r0)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r1 = "id"
            int r24 = r0.getInt(r1)     // Catch:{ JSONException -> 0x022c }
            r0 = r23
            org.json.JSONObject r0 = r7.getJSONObject(r0)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r1 = "feedback_message_id"
            int r25 = r0.getInt(r1)     // Catch:{ JSONException -> 0x022c }
            r0 = r23
            org.json.JSONObject r0 = r7.getJSONObject(r0)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r1 = "file_name"
            java.lang.String r26 = r0.getString(r1)     // Catch:{ JSONException -> 0x022c }
            r0 = r23
            org.json.JSONObject r0 = r7.getJSONObject(r0)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r1 = "url"
            java.lang.String r27 = r0.getString(r1)     // Catch:{ JSONException -> 0x022c }
            r0 = r23
            org.json.JSONObject r0 = r7.getJSONObject(r0)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r1 = "created_at"
            java.lang.String r28 = r0.getString(r1)     // Catch:{ JSONException -> 0x022c }
            r0 = r23
            org.json.JSONObject r0 = r7.getJSONObject(r0)     // Catch:{ JSONException -> 0x022c }
            java.lang.String r1 = "updated_at"
            java.lang.String r29 = r0.getString(r1)     // Catch:{ JSONException -> 0x022c }
            o.abt r30 = new o.abt     // Catch:{ JSONException -> 0x022c }
            r0 = r30
            r0.<init>()     // Catch:{ JSONException -> 0x022c }
            r0 = r24
            r1 = r30
            r1.f212 = r0     // Catch:{ JSONException -> 0x022c }
            r0 = r25
            r1 = r30
            r1.f211 = r0     // Catch:{ JSONException -> 0x022c }
            r0 = r26
            r1 = r30
            r1.f210 = r0     // Catch:{ JSONException -> 0x022c }
            r0 = r27
            r1 = r30
            r1.f209 = r0     // Catch:{ JSONException -> 0x022c }
            r0 = r28
            r1 = r30
            r1.f207 = r0     // Catch:{ JSONException -> 0x022c }
            r0 = r29
            r1 = r30
            r1.f208 = r0     // Catch:{ JSONException -> 0x022c }
            r0 = r22
            r1 = r30
            r0.add(r1)     // Catch:{ JSONException -> 0x022c }
            int r23 = r23 + 1
            goto L_0x00f7
        L_0x017d:
            o.abv r7 = new o.abv     // Catch:{ JSONException -> 0x022c }
            r7.<init>()     // Catch:{ JSONException -> 0x022c }
            r0 = r21
            r7.f226 = r0     // Catch:{ JSONException -> 0x022c }
            r0 = r19
            r7.f220 = r0     // Catch:{ JSONException -> 0x022c }
            r7.f215 = r14     // Catch:{ JSONException -> 0x022c }
            r7.f216 = r15     // Catch:{ JSONException -> 0x022c }
            r7.f219 = r12     // Catch:{ JSONException -> 0x022c }
            r0 = r20
            r7.f218 = r0     // Catch:{ JSONException -> 0x022c }
            r7.f221 = r11     // Catch:{ JSONException -> 0x022c }
            r7.f214 = r13     // Catch:{ JSONException -> 0x022c }
            r7.f227 = r9     // Catch:{ JSONException -> 0x022c }
            r7.f225 = r10     // Catch:{ JSONException -> 0x022c }
            r0 = r16
            r7.f217 = r0     // Catch:{ JSONException -> 0x022c }
            r0 = r18
            r7.f224 = r0     // Catch:{ JSONException -> 0x022c }
            r0 = r17
            r7.f222 = r0     // Catch:{ JSONException -> 0x022c }
            r0 = r22
            r7.f223 = r0     // Catch:{ JSONException -> 0x022c }
            r6.add(r7)     // Catch:{ JSONException -> 0x022c }
            int r8 = r8 + 1
            goto L_0x002a
        L_0x01b3:
            r0 = r31
            r0.f202 = r6     // Catch:{ JSONException -> 0x022c }
            java.lang.String r0 = "name"
            java.lang.String r0 = r4.getString(r0)     // Catch:{ JSONException -> 0x01c6 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x01c6 }
            r1 = r31
            r1.f206 = r0     // Catch:{ JSONException -> 0x01c6 }
            goto L_0x01ca
        L_0x01c6:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ JSONException -> 0x022c }
        L_0x01ca:
            java.lang.String r0 = "email"
            java.lang.String r0 = r4.getString(r0)     // Catch:{ JSONException -> 0x01d9 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x01d9 }
            r1 = r31
            r1.f205 = r0     // Catch:{ JSONException -> 0x01d9 }
            goto L_0x01dd
        L_0x01d9:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ JSONException -> 0x022c }
        L_0x01dd:
            java.lang.String r0 = "id"
            int r0 = r4.getInt(r0)     // Catch:{ JSONException -> 0x01e8 }
            r1 = r31
            r1.f204 = r0     // Catch:{ JSONException -> 0x01e8 }
            goto L_0x01ec
        L_0x01e8:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ JSONException -> 0x022c }
        L_0x01ec:
            java.lang.String r0 = "created_at"
            java.lang.String r0 = r4.getString(r0)     // Catch:{ JSONException -> 0x01fb }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x01fb }
            r1 = r31
            r1.f203 = r0     // Catch:{ JSONException -> 0x01fb }
            goto L_0x01ff
        L_0x01fb:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ JSONException -> 0x022c }
        L_0x01ff:
            o.abw r0 = new o.abw     // Catch:{ JSONException -> 0x022c }
            r0.<init>()     // Catch:{ JSONException -> 0x022c }
            r2 = r0
            r1 = r31
            r0.f229 = r1     // Catch:{ JSONException -> 0x022c }
            java.lang.String r0 = "status"
            java.lang.String r0 = r3.getString(r0)     // Catch:{ JSONException -> 0x0216 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0216 }
            r2.f230 = r0     // Catch:{ JSONException -> 0x0216 }
            goto L_0x021a
        L_0x0216:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ JSONException -> 0x022c }
        L_0x021a:
            java.lang.String r0 = "token"
            java.lang.String r0 = r3.getString(r0)     // Catch:{ JSONException -> 0x0227 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0227 }
            r2.f228 = r0     // Catch:{ JSONException -> 0x0227 }
            goto L_0x0230
        L_0x0227:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ JSONException -> 0x022c }
            goto L_0x0230
        L_0x022c:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0230:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.acp.m119(java.lang.String):o.abw");
    }
}
