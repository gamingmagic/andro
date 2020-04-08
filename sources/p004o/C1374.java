package p004o;

import android.database.Cursor;
import android.util.Log;
import android.util.SparseArray;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.apache.http.message.TokenParser;

/* renamed from: o.ṇ */
final class C1374 extends C1455 {

    /* renamed from: Ą */
    C0415hp f6929;

    /* renamed from: ą */
    SparseArray<String> f6930;

    /* renamed from: Ć */
    private final boolean f6931 = false;

    /* renamed from: ȃ */
    HashMap<String, C0785te> f6932 = new HashMap<>();

    /* renamed from: ˮ͈ */
    HashSet<String> f6933 = new HashSet<>();

    /* renamed from: 櫯 */
    boolean f6934 = false;

    C1374(C0415hp hpVar, String[] strArr) {
        super(strArr);
        this.f6929 = hpVar;
        this.f6929.f1210.execSQL("CREATE TABLE IF NOT EXISTS \"grf_content_v2\" (\"id\"  INTEGER NOT NULL,\"grf_id\"  INTEGER NOT NULL,\"srclen\"  INTEGER NOT NULL,\"srclen_aligned\"  INTEGER NOT NULL,\"declen\"  INTEGER NOT NULL,\"srcpos\"  INTEGER NOT NULL,\"cycle\"  INTEGER NOT NULL,\"type\"  INTEGER NOT NULL,\"fn_str\"  TEXT NOT NULL COLLATE NOCASE,PRIMARY KEY (\"grf_id\", \"fn_str\"))");
        this.f6929.f1210.execSQL("CREATE INDEX IF NOT EXISTS \"\" ON \"grf_content_v2\" (\"fn_str\" ASC);");
        if (m2079(strArr)) {
            m2078(strArr);
            return;
        }
        this.f6929.f1210.beginTransaction();
        this.f6929.mo3808(false, (String[]) null);
        this.f6929.f1210.delete("grf_content_v2", null, null);
        this.f6929.f1210.setTransactionSuccessful();
        this.f6929.f1210.endTransaction();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final String[] mo4324() {
        int i = 0;
        String[] strArr = new String[this.f7116.length];
        for (int i2 = 0; i2 < this.f7116.length; i2++) {
            File file = new File(C0595nv.f2869, this.f7116[i2]);
            if (-1 == this.f6929.mo3799(this.f7116[i2], file.exists() ? (int) file.length() : 0, file.exists() ? (int) file.lastModified() : 0, (String) null)) {
                int i3 = i;
                i++;
                strArr[i3] = this.f7116[i2];
            }
        }
        return (String[]) Arrays.copyOf(strArr, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4323(String str, C0785te[] teVarArr, C0250cn cnVar) {
        int i;
        if (this.f6934) {
            String str2 = "Invalid operation: cache() on a read-only (prepared) db";
            Log.e("AndRO", str2);
            throw new C0588no(str2);
        }
        File file = new File(C0595nv.f2869, str);
        Cursor query = this.f6929.f1210.query("file_versions_v3", new String[]{"id"}, " `name` = ?", new String[]{str}, null, null, null);
        if (query.getCount() <= 0) {
            query.close();
            i = -1;
        } else {
            query.moveToFirst();
            int i2 = query.getInt(0);
            query.close();
            i = i2;
        }
        this.f6929.f1210.beginTransaction();
        this.f6929.f1210.delete("grf_content_v2", "`grf_id` = " + i, null);
        long r10 = this.f6929.mo3800(false, i, str, (int) file.length(), (int) file.lastModified(), null);
        if (teVarArr != null) {
            String[] strArr = new String[(teVarArr.length * 9)];
            int i3 = 0;
            for (int i4 = 0; i4 < teVarArr.length; i4++) {
                C0785te teVar = teVarArr[i4];
                if (teVar != null) {
                    int i5 = i3;
                    int i6 = i3 + 1;
                    strArr[i5] = String.valueOf(i4);
                    int i7 = i6;
                    int i8 = i6 + 1;
                    strArr[i7] = String.valueOf(r10);
                    int i9 = i8;
                    int i10 = i8 + 1;
                    strArr[i9] = String.valueOf(teVar.f4797);
                    int i11 = i10;
                    int i12 = i10 + 1;
                    strArr[i11] = String.valueOf(teVar.f4796);
                    int i13 = i12;
                    int i14 = i12 + 1;
                    strArr[i13] = String.valueOf(teVar.f4795);
                    int i15 = i14;
                    int i16 = i14 + 1;
                    strArr[i15] = String.valueOf(teVar.f4794);
                    int i17 = i16;
                    int i18 = i16 + 1;
                    strArr[i17] = String.valueOf(teVar.f4790);
                    int i19 = i18;
                    int i20 = i18 + 1;
                    strArr[i19] = String.valueOf(teVar.f4791);
                    int i21 = i20;
                    i3 = i20 + 1;
                    strArr[i21] = teVar.f4792;
                }
            }
            if (i3 != strArr.length) {
                strArr = (String[]) Arrays.copyOf(strArr, i3);
            }
            this.f6929.mo3806("INSERT OR IGNORE INTO `grf_content_v2` (`id`,`grf_id`,`srclen`,`srclen_aligned`,`declen`,`srcpos`,`cycle`,`type`,`fn_str`) VALUES ", strArr, 9, (C0759sx) cnVar);
        }
        this.f6929.f1210.setTransactionSuccessful();
        this.f6929.f1210.endTransaction();
    }

    /* renamed from: 鷭 */
    private boolean m2079(String[] strArr) {
        SparseArray r2 = this.f6929.mo3801();
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].equals(r2.valueAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final C0785te mo4322(String str) {
        if (!this.f6934) {
            String str2 = "Invalid operation: get() on a non-prepared db";
            Log.e("AndRO", str2);
            throw new C0588no(str2);
        } else if (this.f6933.contains(str)) {
            return null;
        } else {
            String replace = str.replace('/', TokenParser.ESCAPE);
            Cursor query = this.f6929.f1210.query("grf_content_v2", new String[]{"id", "grf_id", "srclen", "srclen_aligned", "declen", "srcpos", "cycle", "type"}, " `fn_str` = ?", new String[]{replace}, null, null, "grf_id", "1");
            if (!query.moveToFirst()) {
                query.close();
                return null;
            }
            C0785te teVar = new C0785te();
            int i = query.getInt(1);
            String str3 = (String) this.f6930.get(i);
            if (str3 == null) {
                String str4 = "Coudln't convert grf_id " + i + " to grf_name";
                Log.e("AndRO", str4);
                throw new C0588no(str4);
            }
            teVar.f4793 = new File(C0595nv.f2869, str3);
            teVar.f4797 = query.getInt(2);
            teVar.f4796 = query.getInt(3);
            teVar.f4795 = query.getInt(4);
            teVar.f4794 = query.getInt(5);
            teVar.f4790 = query.getInt(6);
            teVar.f4791 = (byte) query.getInt(7);
            teVar.f4792 = replace;
            query.close();
            return teVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final void mo4320() {
        if (this.f6934) {
            String str = "Invalid operation: prepare() on a read_only db";
            Log.e("AndRO", str);
            throw new C0588no(str);
        }
        this.f6934 = true;
        this.f6930 = this.f6929.mo3801();
        for (int i = 0; i < this.f6930.size(); i++) {
            this.f6930.valueAt(i);
            this.f6930.keyAt(i);
        }
    }

    /* renamed from: 櫯 */
    private void m2078(String[] strArr) {
        if (strArr.length == 0) {
            String str = "No used GRF files";
            Log.e("AndRO", str);
            throw new C0588no(str);
        }
        SparseArray r3 = this.f6929.mo3801();
        String[] strArr2 = new String[r3.size()];
        r3.size();
        int[] iArr = new int[r3.size()];
        int i = 0;
        for (int i2 = 0; i2 < r3.size(); i2++) {
            int keyAt = r3.keyAt(i2);
            String str2 = (String) r3.valueAt(i2);
            int i3 = 0;
            while (i3 < strArr.length && !str2.equals(strArr[i3])) {
                i3++;
            }
            if (i3 != strArr.length) {
                strArr2[i] = strArr[i2];
                int i4 = i;
                i++;
                iArr[i4] = keyAt;
            }
        }
        this.f6929.mo3808(true, (String[]) Arrays.copyOf(strArr2, i));
        if (i > 0) {
            StringBuilder sb = new StringBuilder(128);
            String[] strArr3 = new String[i];
            for (int i5 = 0; i5 < i; i5++) {
                if (i5 == 0) {
                    sb.append(" grf_id <> ?");
                } else {
                    sb.append(" AND grf_id <> ?");
                }
                strArr3[i5] = Integer.toString(iArr[i5]);
            }
            this.f6929.f1210.beginTransaction();
            this.f6929.f1210.delete("grf_content_v2", sb.toString(), strArr3);
            this.f6929.f1210.setTransactionSuccessful();
            this.f6929.f1210.endTransaction();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final void mo4321(String str) {
        this.f6933.add(str);
    }
}
