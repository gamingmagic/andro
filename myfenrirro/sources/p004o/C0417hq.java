package p004o;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import com.roworkshop.andro.c_activity;

/* renamed from: o.hq */
class C0417hq extends SQLiteOpenHelper {

    /* renamed from: 鷭 */
    final /* synthetic */ C0415hp f1213;

    C0417hq(C0415hp hpVar, c_activity c_activity, String str, CursorFactory cursorFactory, int i) {
        this.f1213 = hpVar;
        super(c_activity, str, null, 1);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
    }
}
