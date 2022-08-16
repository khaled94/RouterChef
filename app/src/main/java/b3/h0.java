package b3;

import android.database.sqlite.SQLiteDatabase;
import b3.i0;

/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements i0.a {

    /* renamed from: a */
    public static final /* synthetic */ h0 f2516a = new h0();

    @Override // b3.i0.a
    public final void a(SQLiteDatabase sQLiteDatabase) {
        String str = i0.f2518u;
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(i0.f2518u);
    }
}
