package m4;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import k1.a;

/* loaded from: classes.dex */
public final class v61 extends SQLiteOpenHelper {

    /* renamed from: s */
    public final Context f14590s;

    /* renamed from: t */
    public final uz1 f14591t;

    public v61(Context context, uz1 uz1Var) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) jo.f10145d.f10148c.a(es.f8247z5)).intValue());
        this.f14590s = context;
        this.f14591t = uz1Var;
    }

    public static final void G(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    public static void H(SQLiteDatabase sQLiteDatabase, n90 n90Var) {
        sQLiteDatabase.beginTransaction();
        try {
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{"url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i10 = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex("url");
                if (columnIndex != -1) {
                    strArr[i10] = query.getString(columnIndex);
                }
                i10++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i11 = 0; i11 < count; i11++) {
                n90Var.b(strArr[i11]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public final void b(String str) {
        j(new a(this, str));
    }

    public final void c(w61 w61Var) {
        j(new ps(this, w61Var));
    }

    public final void j(ko1<SQLiteDatabase, Void> ko1Var) {
        mz1.t(this.f14591t.Z(new u61(this, 0)), new u41((ko1) ko1Var), this.f14591t);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}
