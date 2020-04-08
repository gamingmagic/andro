package p004o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: o.lh */
public final class C0524lh extends C0813tl {

    /* renamed from: 鷭 */
    private static C0524lh f1647 = null;

    static {
    }

    private C0524lh() {
    }

    /* renamed from: 鷭 */
    static synchronized C0524lh m567() {
        C0524lh lhVar;
        synchronized (C0524lh.class) {
            if (f1647 == null) {
                f1647 = new C0524lh();
            }
            lhVar = f1647;
        }
        return lhVar;
    }

    /* renamed from: 鷭 */
    public final void mo3957(String str) {
        if (C1014.f6147 != null && C1014.f6147.f51 != null) {
            C1014.f6147.f51.mo3872(str);
        }
    }

    /* renamed from: 櫯 */
    public final boolean mo3956() {
        if (C1014.f6149 == null || C1014.f6149.f729 == null) {
            return false;
        }
        return C1014.f6149.f729.mo3654();
    }

    /* renamed from: 鷭 */
    public final byte[] mo3958(String str, long j, boolean z) {
        return C1014.f6149.f729.mo3655(str, j, z, (C0658ph) null);
    }

    /* renamed from: 櫯 */
    public final int mo3955(String str) {
        try {
            SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(str, null, 0);
            if (!openDatabase.isOpen()) {
                throw new C0823ts("failed to open db");
            }
            Cursor query = openDatabase.query("SysVars", new String[]{"Value"}, "`Key` = ?", new String[]{"patch_id"}, null, null, null);
            if (!query.moveToFirst()) {
                query.close();
                throw new C0823ts("failed to find patch_id in db");
            }
            int i = query.getInt(0);
            query.close();
            openDatabase.close();
            return i;
        } catch (SQLiteException unused) {
            return 0;
        } catch (C0823ts unused2) {
            return 0;
        }
    }
}
