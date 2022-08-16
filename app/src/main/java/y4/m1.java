package y4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m1 extends f2 {

    /* renamed from: u */
    public final l1 f20573u;

    /* renamed from: v */
    public boolean f20574v;

    public m1(w2 w2Var) {
        super(w2Var);
        w2 w2Var2 = (w2) this.f20505s;
        Context context = w2Var2.f20786s;
        Objects.requireNonNull(w2Var2);
        this.f20573u = new l1(this, context);
    }

    @Override // y4.f2
    public final boolean j() {
        return false;
    }

    public final SQLiteDatabase k() {
        if (this.f20574v) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f20573u.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f20574v = true;
        return null;
    }

    public final void l() {
        int delete;
        g();
        try {
            SQLiteDatabase k10 = k();
            if (k10 == null || (delete = k10.delete("messages", null, null)) <= 0) {
                return;
            }
            ((w2) this.f20505s).C().F.b("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e10) {
            ((w2) this.f20505s).C().f20710x.b("Error resetting local analytics data. error", e10);
        }
    }

    public final boolean m() {
        w2 w2Var = (w2) this.f20505s;
        Context context = w2Var.f20786s;
        Objects.requireNonNull(w2Var);
        return context.getDatabasePath("google_app_measurement_local.db").exists();
    }

    public final boolean n() {
        g();
        if (!this.f20574v && m()) {
            int i10 = 5;
            for (int i11 = 0; i11 < 5; i11++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase k10 = k();
                        if (k10 == null) {
                            this.f20574v = true;
                            return false;
                        }
                        k10.beginTransaction();
                        k10.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        k10.setTransactionSuccessful();
                        k10.endTransaction();
                        k10.close();
                        return true;
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i10);
                        i10 += 20;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteFullException e10) {
                    ((w2) this.f20505s).C().f20710x.b("Error deleting app launch break from local database", e10);
                    this.f20574v = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                } catch (SQLiteException e11) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    ((w2) this.f20505s).C().f20710x.b("Error deleting app launch break from local database", e11);
                    this.f20574v = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            ((w2) this.f20505s).C().A.a("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.m1.o(int, byte[]):boolean");
    }
}
