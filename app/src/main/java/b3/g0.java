package b3;

import android.database.sqlite.SQLiteDatabase;
import b3.i0;

/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements i0.a {

    /* renamed from: a */
    public static final /* synthetic */ g0 f2514a = new g0();

    @Override // b3.i0.a
    public final void a(SQLiteDatabase sQLiteDatabase) {
        String str = i0.f2518u;
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }
}
