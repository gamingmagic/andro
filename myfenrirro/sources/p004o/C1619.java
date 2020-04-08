package p004o;

import android.database.Cursor;
import java.util.HashMap;

/* renamed from: o.摁 */
final class C1619 {

    /* renamed from: 鷭 */
    C0248cl f7544;

    C1619(C0248cl clVar) {
        C0453ix ixVar = C1014.f6147.f51;
        String str = "Reading bgm_db...";
        if (ixVar.f1370 != null) {
            C1014.f6147.mo3387((Runnable) new C0473jm(ixVar));
        }
        C1014.f6147.mo3387((Runnable) new C0471jk(ixVar, str));
        this.f7544 = clVar;
        String str2 = "data\\mp3nametable.txt";
        byte[] bArr = (byte[]) clVar.mo3613(str2, false);
        String r8 = C0622ot.m738(bArr);
        if (C1014.f6160.mo3799(str2, bArr.length, 0, r8) == -1) {
            HashMap hashMap = new HashMap();
            String[] r10 = C0622ot.m751(C0622ot.m741(bArr, C0618op.KOREAN).replace("\\\\", "/").replace("\\", "/"), true, "#");
            for (int i = 0; i < r10.length / 2; i++) {
                String str3 = r10[(i * 2) + 0];
                String str4 = r10[(i * 2) + 1];
                if (str3.endsWith(".rsw")) {
                    hashMap.put(str3.substring(0, str3.length() - 4).trim(), str4.trim());
                }
            }
            C1014.f6160.mo3807(hashMap);
            C1014.f6160.mo3800(true, -1, str2, bArr.length, 0, r8);
        }
    }

    /* renamed from: 鷭 */
    static String m2295(String str) {
        String str2;
        Cursor query = C1014.f6160.f1210.query("mp3", new String[]{"bgm"}, " map = ?", new String[]{str}, null, null, null);
        if (!query.moveToFirst()) {
            query.close();
            str2 = null;
        } else {
            String string = query.getString(0);
            query.close();
            str2 = string;
        }
        if (str2 == null) {
            str2 = "BGM/01.mp3";
        }
        return str2.replace("bgm", "BGM");
    }
}
