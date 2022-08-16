package m4;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import y4.d6;
import y4.h3;
import y4.k6;

/* loaded from: classes.dex */
public final /* synthetic */ class t61 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f13930s = 0;

    /* renamed from: t */
    public final /* synthetic */ Object f13931t;

    /* renamed from: u */
    public final /* synthetic */ Object f13932u;

    /* renamed from: v */
    public final /* synthetic */ Object f13933v;

    public /* synthetic */ t61(SQLiteDatabase sQLiteDatabase, String str, n90 n90Var) {
        this.f13931t = sQLiteDatabase;
        this.f13932u = str;
        this.f13933v = n90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13930s) {
            case 0:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f13931t;
                ContentValues contentValues = new ContentValues();
                contentValues.put("event_state", (Integer) 1);
                sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{(String) this.f13932u});
                v61.H(sQLiteDatabase, (n90) this.f13933v);
                return;
            default:
                ((h3) this.f13933v).f20483s.a();
                if (((d6) this.f13931t).s() == null) {
                    ((h3) this.f13933v).f20483s.m((d6) this.f13931t, (k6) this.f13932u);
                    return;
                } else {
                    ((h3) this.f13933v).f20483s.q((d6) this.f13931t, (k6) this.f13932u);
                    return;
                }
        }
    }

    public t61(h3 h3Var, d6 d6Var, k6 k6Var) {
        this.f13933v = h3Var;
        this.f13931t = d6Var;
        this.f13932u = k6Var;
    }
}
