package p004o;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteStatement;
import java.util.Map.Entry;
import java.util.TreeMap;
import p004o.C0760sy.C0761;

/* renamed from: o.齯 */
final class C1863 extends C0760sy {
    public C1863(C0248cl clVar, boolean z) {
        C0453ix ixVar = C1014.f6147.f51;
        String str = "Reading questid2display...";
        if (ixVar.f1370 != null) {
            C1014.f6147.mo3387((Runnable) new C0473jm(ixVar));
        }
        C1014.f6147.mo3387((Runnable) new C0471jk(ixVar, str));
        String str2 = "data\\questid2display.txt";
        byte[] bArr = (byte[]) clVar.mo3613(str2, false);
        String r7 = C0622ot.m738(bArr);
        if (-1 == C1014.f6160.mo3799(str2, bArr.length, 0, r7)) {
            mo4094(C0622ot.m741(bArr, C0618op.LOCAL).replace("\r", ""), C0622ot.f3030.name());
            C0415hp hpVar = C1014.f6160;
            TreeMap treeMap = this.f4661;
            hpVar.f1210.beginTransaction();
            hpVar.f1210.delete("questid2display", null, null);
            SQLiteStatement compileStatement = hpVar.f1210.compileStatement("INSERT INTO `questid2display` (`id`,`name`,`image1`,`image2`,`desc`) VALUES (?, ?, ?, ?, ?)");
            try {
                for (Entry entry : treeMap.entrySet()) {
                    C0761 r12 = (C0761) entry.getValue();
                    compileStatement.clearBindings();
                    compileStatement.bindLong(1, (long) ((Integer) entry.getKey()).intValue());
                    compileStatement.bindString(2, r12.f4667);
                    compileStatement.bindString(3, r12.f4666);
                    compileStatement.bindString(4, r12.f4665);
                    compileStatement.bindString(5, new StringBuilder(String.valueOf(r12.f4664[0])).append("#").append(r12.f4664[1]).toString());
                    compileStatement.executeInsert();
                }
                hpVar.f1210.setTransactionSuccessful();
                hpVar.f1210.endTransaction();
                this.f4661.clear();
                C1014.f6160.mo3800(true, -1, str2, bArr.length, 0, r7);
            } catch (SQLException e) {
                throw new C0588no((Exception) e);
            } catch (Throwable th) {
                hpVar.f1210.endTransaction();
                throw th;
            }
        }
    }

    /* renamed from: 鷭 */
    public final C0761 mo4093(int i) {
        C0761[] r0;
        int[] iArr = {i};
        C0415hp hpVar = C1014.f6160;
        C0761[] r10 = new C0761[iArr.length];
        StringBuilder sb = new StringBuilder(iArr.length * 5);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i2 != 0) {
                sb.append(" OR ");
            }
            sb.append("`id`='" + iArr[i2] + "'");
        }
        Cursor query = hpVar.f1210.query("questid2display", null, sb.toString(), null, null, null, null, null);
        if (!query.moveToFirst()) {
            query.close();
            r0 = r10;
        } else {
            do {
                int i3 = query.getInt(0);
                int i4 = 0;
                while (i4 < iArr.length && iArr[i4] != i3) {
                    i4++;
                }
                if (i4 == iArr.length) {
                    throw new C0588no();
                }
                r10[i4] = new C0761();
                r10[i4].f4667 = query.getString(1);
                r10[i4].f4666 = query.getString(2);
                r10[i4].f4665 = query.getString(3);
                String string = query.getString(4);
                if (string != null) {
                    r10[i4].f4664 = string.split("#");
                }
            } while (query.moveToNext());
            query.close();
            r0 = r10;
        }
        return r0[0];
    }
}
