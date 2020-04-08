package p004o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils.InsertHelper;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.SparseArray;
import com.roworkshop.andro.c_activity;
import java.nio.CharBuffer;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: o.hp */
public final class C0415hp {

    /* renamed from: 櫯 */
    SQLiteDatabase f1210 = this.f1211.getWritableDatabase();

    /* renamed from: 鷭 */
    SQLiteOpenHelper f1211;

    /* renamed from: o.hp$鷭 */
    static class C0416 {

        /* renamed from: 鷭 */
        static final String f1212 = (C0595nv.f2879 == C0564mr.localclient ? "client_dir_localclient" : "client_dir");

        C0416() {
        }

        static {
        }
    }

    /* renamed from: Ą */
    private boolean m412() {
        try {
            this.f1210.execSQL("CREATE TABLE IF NOT EXISTS \"file_versions_v3\" (\"id\"  INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\"name\"  TEXT NOT NULL,\"size\"  INTEGER NOT NULL,\"last_modified\"  INTEGER NOT NULL,\"md5\"  TEXT NOT NULL)");
            this.f1210.execSQL("CREATE TABLE IF NOT EXISTS \"skill_db\" (\"id\"  INTEGER NOT NULL,\"name\"  TEXT NOT NULL,\"visible_name\"  TEXT NOT NULL,\"maxlv\"  INTEGER NOT NULL,\"sp_amount\"  TEXT NOT NULL,\"range\"  TEXT NOT NULL,\"separate_lv\"  INTEGER NOT NULL,\"prerecs\"  TEXT NOT NULL,\"description\"  TEXT NOT NULL,PRIMARY KEY (\"id\"))");
            this.f1210.execSQL("CREATE TABLE IF NOT EXISTS \"item_db_v2\" (\"id\"  INTEGER,\"unidentifiedDisplayName\"  TEXT,\"unidentifiedResourceName\"  TEXT,\"unidentifiedDescriptionName\"  TEXT,\"identifiedDisplayName\"  TEXT,\"identifiedResourceName\"  TEXT,\"identifiedDescriptionName\"  TEXT,\"slotCount\"  INTEGER,\"ClassNum\"  INTEGER,\"IT\"  INTEGER,PRIMARY KEY (\"id\"))");
            this.f1210.execSQL("CREATE TABLE IF NOT EXISTS \"mp3\" (\"map\"  TEXT,\"bgm\"  TEXT)");
            this.f1210.execSQL("CREATE TABLE IF NOT EXISTS \"msgstringtable\" (\"line\"  INTEGER NOT NULL,\"text\"  TEXT NOT NULL,PRIMARY KEY (\"line\"))");
            this.f1210.execSQL("CREATE TABLE IF NOT EXISTS \"settings\" (\"name\"  TEXT NOT NULL,\"idx\"  INTEGER NOT NULL,\"val\"  TEXT NOT NULL,PRIMARY KEY (\"name\" ASC, \"idx\"))");
            this.f1210.execSQL("CREATE TABLE IF NOT EXISTS \"questid2display\" (\"id\"  INTEGER,\"name\"  TEXT,\"image1\"  TEXT,\"image2\"  TEXT,\"desc\"  TEXT,PRIMARY KEY (\"id\"))");
            this.f1210.execSQL("CREATE TABLE IF NOT EXISTS \"remote_filelist\" (\"filename\"  TEXT NOT NULL COLLATE NOCASE ,PRIMARY KEY (\"filename\"));");
            return true;
        } catch (SQLException unused) {
            return false;
        }
    }

    public C0415hp(c_activity c_activity) {
        this.f1211 = new C0417hq(this, c_activity, "mydb", null, 1);
        if (!this.f1210.isOpen()) {
            String str = "Couldn't obtain writable database";
            Log.e("AndRO", str);
            throw new C0588no(str);
        } else if (!m412()) {
            String str2 = "Failed to init SQLite GRF cache";
            Log.e("AndRO", str2);
            throw new C0588no(str2);
        } else {
            mo3794();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final long mo3800(boolean z, int i, String str, int i2, int i3, String str2) {
        if (z) {
            this.f1210.beginTransaction();
        }
        this.f1210.delete("file_versions_v3", "`name` = ?", new String[]{str});
        ContentValues contentValues = new ContentValues();
        if (i != -1) {
            contentValues.put("id", Integer.valueOf(i));
        }
        contentValues.put("name", str);
        contentValues.put("size", Integer.valueOf(i2));
        contentValues.put("last_modified", Integer.valueOf(i3));
        if (str2 != null) {
            contentValues.put("md5", str2);
        } else {
            contentValues.put("md5", "");
        }
        long insert = this.f1210.insert("file_versions_v3", null, contentValues);
        long j = insert;
        if (insert == -1) {
            if (z) {
                this.f1210.endTransaction();
            }
            return -1;
        }
        if (z) {
            this.f1210.setTransactionSuccessful();
            this.f1210.endTransaction();
        }
        return j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3808(boolean z, String[] strArr) {
        StringBuilder sb = new StringBuilder(128);
        String[] strArr2 = null;
        if (strArr != null) {
            strArr2 = new String[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                sb.append(" AND name <> ?");
                strArr2[i] = strArr[i];
            }
        }
        if (z) {
            this.f1210.beginTransaction();
        }
        this.f1210.delete("file_versions_v3", "`name` LIKE '%.grf'" + sb.toString(), strArr2);
        if (z) {
            this.f1210.setTransactionSuccessful();
            this.f1210.endTransaction();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final SparseArray<String> mo3801() {
        SparseArray<String> sparseArray = new SparseArray<>();
        Cursor query = this.f1210.query("file_versions_v3", new String[]{"name", "id"}, "`name` LIKE '%.grf'", null, null, null, null);
        if (!query.moveToFirst()) {
            query.close();
            return sparseArray;
        }
        do {
            sparseArray.put(query.getInt(1), query.getString(0));
        } while (query.moveToNext());
        query.close();
        return sparseArray;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final int mo3799(String str, int i, int i2, String str2) {
        Cursor query = this.f1210.query("file_versions_v3", new String[]{"id", "size", "last_modified", "md5"}, "`name` = ?", new String[]{str}, null, null, null);
        if (query.getCount() > 0) {
            if (query.getCount() != 1) {
                String str3 = "Unexpected result file count: " + query.getCount() + " (filename: " + str + ")";
                Log.e("AndRO", str3);
                throw new C0588no(str3);
            }
            query.moveToFirst();
            int i3 = query.getInt(0);
            int i4 = query.getInt(1);
            int i5 = query.getInt(2);
            String string = query.getString(3);
            if (i == i4 && i2 == i5 && (str2 == null || str2.equals(string))) {
                query.close();
                return i3;
            }
        }
        query.close();
        return -1;
    }

    /* renamed from: 鷭 */
    private static String m413(int[] iArr) {
        if (iArr == null) {
            return "";
        }
        CharBuffer allocate = CharBuffer.allocate(iArr.length * 10);
        for (int i = 0; i < iArr.length; i++) {
            if (i != 0) {
                allocate.append(":");
            }
            allocate.append(String.valueOf(iArr[i]));
        }
        return String.valueOf(allocate.array());
    }

    /* renamed from: 鷭 */
    private static String m414(C0382[] r4) {
        if (r4 == null) {
            return "";
        }
        CharBuffer allocate = CharBuffer.allocate(r4.length * 50);
        for (int i = 0; i < r4.length; i++) {
            if (i != 0) {
                allocate.append(":");
            }
            allocate.append((r4[i].f1076 == null ? null : String.valueOf(r4[i].f1076)) + ":" + String.valueOf(r4[i].f1078) + ":" + String.valueOf(r4[i].f1077));
        }
        return String.valueOf(allocate.array());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3804(SparseArray<C0381gq> sparseArray) {
        this.f1210.beginTransaction();
        this.f1210.delete("skill_db", null, null);
        InsertHelper insertHelper = new InsertHelper(this.f1210, "skill_db");
        int columnIndex = insertHelper.getColumnIndex("id");
        int columnIndex2 = insertHelper.getColumnIndex("name");
        int columnIndex3 = insertHelper.getColumnIndex("visible_name");
        int columnIndex4 = insertHelper.getColumnIndex("maxlv");
        int columnIndex5 = insertHelper.getColumnIndex("sp_amount");
        int columnIndex6 = insertHelper.getColumnIndex("range");
        int columnIndex7 = insertHelper.getColumnIndex("separate_lv");
        int columnIndex8 = insertHelper.getColumnIndex("prerecs");
        int columnIndex9 = insertHelper.getColumnIndex("description");
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            C0381gq gqVar = (C0381gq) sparseArray.valueAt(i);
            if (gqVar != null) {
                insertHelper.prepareForInsert();
                insertHelper.bind(columnIndex, keyAt);
                insertHelper.bind(columnIndex2, gqVar.f1073);
                insertHelper.bind(columnIndex3, gqVar.f1071);
                insertHelper.bind(columnIndex4, gqVar.f1070);
                insertHelper.bind(columnIndex5, m413(gqVar.f1066));
                insertHelper.bind(columnIndex6, m413(gqVar.f1067));
                insertHelper.bind(columnIndex7, gqVar.f1068);
                insertHelper.bind(columnIndex8, m414(gqVar.f1069));
                insertHelper.bind(columnIndex9, gqVar.f1072);
                if (insertHelper.execute() == -1) {
                    String str = "Failed to insert entry into cache: " + gqVar.f1073;
                    Log.e("AndRO", str);
                    throw new C0588no(str);
                }
            }
        }
        insertHelper.close();
        this.f1210.setTransactionSuccessful();
        this.f1210.endTransaction();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final void mo3798(SparseArray<C1701> sparseArray) {
        this.f1210.beginTransaction();
        this.f1210.delete("item_db_v2", null, null);
        int size = sparseArray.size();
        String[] strArr = new String[(size * 10)];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            C1701 r9 = (C1701) sparseArray.valueAt(i2);
            if (!(r9 == null || r9.f7767 == null)) {
                strArr[i + 0] = String.valueOf(keyAt);
                strArr[i + 1] = r9.f7763;
                strArr[i + 2] = r9.f7759;
                strArr[i + 3] = r9.f7760;
                strArr[i + 4] = r9.f7767;
                strArr[i + 5] = r9.f7766;
                strArr[i + 6] = r9.f7764;
                strArr[i + 7] = String.valueOf(r9.f7761);
                strArr[i + 8] = String.valueOf(r9.f7762);
                strArr[i + 9] = String.valueOf(r9.f7765 == null ? C1472.ETC.ordinal() : r9.f7765.ordinal());
                i += 10;
            }
        }
        mo3806("INSERT INTO `item_db_v2` (`id`,`unidentifiedDisplayName`,`unidentifiedResourceName`,`unidentifiedDescriptionName`,`identifiedDisplayName`,`identifiedResourceName`,`identifiedDescriptionName`,`slotCount`,`ClassNum`,`IT`) VALUES ", strArr, 10, (C0759sx) new C0418hr(this, true));
        this.f1210.setTransactionSuccessful();
        this.f1210.endTransaction();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3807(HashMap<String, String> hashMap) {
        this.f1210.beginTransaction();
        this.f1210.delete("mp3", null, null);
        InsertHelper insertHelper = new InsertHelper(this.f1210, "mp3");
        int columnIndex = insertHelper.getColumnIndex("map");
        int columnIndex2 = insertHelper.getColumnIndex("bgm");
        Set<Entry> entrySet = hashMap.entrySet();
        for (Entry entry : entrySet) {
            insertHelper.prepareForInsert();
            insertHelper.bind(columnIndex, (String) entry.getKey());
            insertHelper.bind(columnIndex2, (String) entry.getValue());
            insertHelper.execute();
        }
        this.f1210.setTransactionSuccessful();
        this.f1210.endTransaction();
        entrySet.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final C1701 mo3803(int i) {
        C1701 r8 = new C1701();
        Cursor query = this.f1210.query("item_db_v2", new String[]{"unidentifiedDisplayName", "unidentifiedResourceName", "unidentifiedDescriptionName", "identifiedDisplayName", "identifiedResourceName", "identifiedDescriptionName", "slotCount", "ClassNum", "IT"}, "`id` = ?", new String[]{String.valueOf(i)}, null, null, null);
        if (query.getCount() == 0) {
            return null;
        }
        query.moveToFirst();
        r8.f7763 = query.getString(0);
        r8.f7759 = query.getString(1);
        r8.f7760 = query.getString(2);
        r8.f7767 = query.getString(3);
        r8.f7766 = query.getString(4);
        r8.f7764 = query.getString(5);
        r8.f7761 = query.getInt(6);
        r8.f7762 = query.getInt(7);
        r8.f7765 = C1472.values()[query.getInt(8)];
        query.close();
        return r8;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3809(String[] strArr) {
        this.f1210.beginTransaction();
        this.f1210.delete("msgstringtable", null, null);
        InsertHelper insertHelper = new InsertHelper(this.f1210, "msgstringtable");
        int columnIndex = insertHelper.getColumnIndex("line");
        int columnIndex2 = insertHelper.getColumnIndex("text");
        for (int i = 0; i < strArr.length; i++) {
            insertHelper.prepareForInsert();
            insertHelper.bind(columnIndex, i + 1);
            insertHelper.bind(columnIndex2, strArr[i].trim());
            insertHelper.execute();
        }
        this.f1210.setTransactionSuccessful();
        this.f1210.endTransaction();
        insertHelper.close();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final String mo3796(int i) {
        Cursor query = this.f1210.query("msgstringtable", new String[]{"text"}, " line = ?", new String[]{String.valueOf(i)}, null, null, null);
        if (!query.moveToFirst()) {
            query.close();
            return null;
        }
        String string = query.getString(0);
        query.close();
        return string;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final HashMap<Integer, C0381gq> mo3797() {
        HashMap<Integer, C0381gq> hashMap = new HashMap<>();
        Cursor query = this.f1210.query("skill_db", new String[]{"id", "visible_name"}, null, null, null, null, null);
        if (query.getCount() == 0) {
            query.close();
            return hashMap;
        }
        query.moveToFirst();
        do {
            C0381gq gqVar = new C0381gq();
            int i = query.getInt(0);
            gqVar.f1071 = query.getString(1);
            hashMap.put(Integer.valueOf(i), gqVar);
        } while (query.moveToNext());
        query.close();
        return hashMap;
    }

    /* renamed from: 鷭 */
    private static int[] m415(String str) {
        if (str.equals("") || str == null) {
            return null;
        }
        String[] split = str.trim().split(":");
        int[] iArr = new int[split.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = Integer.valueOf(split[i]).intValue();
        }
        return iArr;
    }

    /* renamed from: 鷭 */
    private static C0382[] m416(C0381gq gqVar, String str) {
        if (str.equals("") || str == null) {
            return null;
        }
        String[] split = str.trim().split(":");
        C0382[] r3 = new C0382[(split.length / 3)];
        for (int i = 0; i < r3.length; i++) {
            r3[i] = new C0382();
            r3[i].f1076 = (split[(i * 3) + 0] == null || split[(i * 3) + 0].equals("null")) ? null : C1761.valueOf(split[(i * 3) + 0]);
            r3[i].f1078 = Integer.valueOf(split[(i * 3) + 1]).intValue();
            r3[i].f1077 = Integer.valueOf(split[(i * 3) + 2]).intValue();
        }
        return r3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˮ͈ */
    public final C0381gq mo3793(int i) {
        C0381gq gqVar = new C0381gq();
        Cursor query = this.f1210.query("skill_db", new String[]{"name", "visible_name", "maxlv", "sp_amount", "range", "separate_lv", "prerecs", "description"}, "`id` = ?", new String[]{String.valueOf(i)}, null, null, null);
        if (query.getCount() == 0) {
            return null;
        }
        query.moveToFirst();
        gqVar.f1073 = query.getString(0);
        gqVar.f1071 = query.getString(1);
        gqVar.f1070 = query.getInt(2);
        gqVar.f1066 = m415(query.getString(3));
        gqVar.f1067 = m415(query.getString(4));
        gqVar.f1068 = query.getInt(5) != 0;
        gqVar.f1069 = m416(gqVar, query.getString(6));
        gqVar.f1072 = query.getString(7);
        query.close();
        return gqVar;
    }

    /* renamed from: 鷭 */
    public final String mo3802(String str, int i) {
        Cursor query = this.f1210.query("settings", new String[]{"val"}, "`name` = ? AND `idx` = ?", new String[]{str, String.valueOf(i)}, null, null, null);
        if (!query.moveToFirst()) {
            query.close();
            return null;
        }
        String string = query.getString(0);
        query.close();
        return string;
    }

    /* renamed from: 櫯 */
    public final int mo3795(String str, int i) {
        String r2 = mo3802(str, 0);
        String str2 = r2 == null ? null : r2;
        String str3 = str2;
        if (str2 == null) {
            return i;
        }
        if (str3.equals("true")) {
            return 1;
        }
        if (str3.equals("false")) {
            return 0;
        }
        return Integer.parseInt(str3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3805(String str, int i, String str2) {
        if (str2 == null) {
            this.f1210.beginTransaction();
            this.f1210.delete("settings", "`name` = ? AND `idx` = ?", new String[]{str, String.valueOf(i)});
            this.f1210.setTransactionSuccessful();
            this.f1210.endTransaction();
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", str);
        contentValues.put("idx", Integer.valueOf(i));
        contentValues.put("val", str2);
        this.f1210.beginTransaction();
        this.f1210.replace("settings", null, contentValues);
        this.f1210.setTransactionSuccessful();
        this.f1210.endTransaction();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3806(String str, String[] strArr, int i, C0759sx sxVar) {
        StringBuilder sb = null;
        String[] strArr2 = null;
        int i2 = 500 / i;
        int length = strArr.length / i;
        int i3 = -1;
        int i4 = 0;
        if (sxVar != null) {
            sxVar.mo4092(0, (long) length);
        }
        if (strArr.length % i != 0) {
            throw new IllegalArgumentException("values.length(" + strArr.length + ") % nCols(" + i + ") != 0");
        }
        String str2 = "(?";
        for (int i5 = 0; i5 < i - 1; i5++) {
            str2 = new StringBuilder(String.valueOf(str2)).append(",?").toString();
        }
        String sb2 = new StringBuilder(String.valueOf(str2)).append(")").toString();
        for (int i6 = 0; i6 < length; i6++) {
            if (i4 == 0) {
                i3 = Math.min(i2, length - i6);
                strArr2 = new String[(i3 * i)];
                sb = new StringBuilder();
            } else {
                sb.append(',');
            }
            sb.append(sb2);
            for (int i7 = 0; i7 < i; i7++) {
                strArr2[(i * i4) + i7] = strArr[(i * i6) + i7];
            }
            i4++;
            if (i4 == i3) {
                this.f1210.execSQL(new StringBuilder(String.valueOf(str)).append(sb.toString()).toString(), strArr2);
                i4 = 0;
                if (sxVar != null) {
                    sxVar.mo4092((long) (i6 + 1), (long) length);
                }
            } else if (i6 == length - 1) {
                throw new C0588no("Final query not executed!!!!");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˮ͈ */
    public final void mo3794() {
        boolean z = C0595nv.f2868;
        String r3 = mo3802("hires_textures", 0);
        String str = r3 == null ? null : r3;
        C0595nv.f2868 = str == null ? z : Boolean.parseBoolean(str);
        boolean z2 = C0595nv.f2870;
        String r32 = mo3802("use_colormap", 0);
        String str2 = r32 == null ? null : r32;
        C0595nv.f2870 = str2 == null ? z2 : Boolean.parseBoolean(str2);
        boolean z3 = C0595nv.f2860;
        String r33 = mo3802("interpolate", 0);
        String str3 = r33 == null ? null : r33;
        C0595nv.f2860 = str3 == null ? z3 : Boolean.parseBoolean(str3);
        String str4 = C0416.f1212;
        String str5 = C0595nv.f2874;
        String r2 = mo3802(str4, 0);
        C0595nv.f2874 = r2 == null ? str5 : r2;
        C0595nv.f2871 = mo3795("screen_orientation", C0595nv.f2871);
        C1014.f6147.setRequestedOrientation(C0595nv.f2871);
        C0595nv.f2872 = mo3795("noshift_enemy", 0) > 0;
        C0595nv.f2875 = mo3795("noshift_friend", 0) > 0;
        String str6 = C0595nv.f2865;
        String r22 = mo3802("party_wis_prefix", 0);
        C0595nv.f2865 = r22 == null ? str6 : r22;
        String str7 = C0595nv.f2866;
        String r23 = mo3802("guild_wis_prefix", 0);
        C0595nv.f2866 = r23 == null ? str7 : r23;
        C1014.f6147.f51.f1427.mo4486();
        boolean z4 = C0595nv.f2861;
        String r34 = mo3802("monsterhp", 0);
        String str8 = r34 == null ? null : r34;
        C0595nv.f2861 = str8 == null ? z4 : Boolean.parseBoolean(str8);
        boolean z5 = C0595nv.f2867;
        String r35 = mo3802("enable_land_effects", 0);
        String str9 = r35 == null ? null : r35;
        C0595nv.f2867 = str9 == null ? z5 : Boolean.parseBoolean(str9);
        boolean z6 = C0595nv.f2877;
        String r36 = mo3802("is_userai", 0);
        String str10 = r36 == null ? null : r36;
        C0595nv.f2877 = str10 == null ? z6 : Boolean.parseBoolean(str10);
    }

    /* renamed from: ȃ */
    public final void mo3792() {
        mo3805("hires_textures", 0, String.valueOf(C0595nv.f2868));
        mo3805("use_colormap", 0, String.valueOf(C0595nv.f2870));
        mo3805("interpolate", 0, String.valueOf(C0595nv.f2860));
        mo3805(C0416.f1212, 0, C0595nv.f2874);
        mo3805("screen_orientation", 0, String.valueOf(C0595nv.f2871));
        mo3805("monsterhp", 0, String.valueOf(C0595nv.f2861));
        mo3805("is_userai", 0, String.valueOf(C0595nv.f2877));
    }
}
