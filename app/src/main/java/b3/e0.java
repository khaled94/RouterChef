package b3;

import android.database.sqlite.SQLiteDatabase;
import b3.i0;

/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements i0.a {

    /* renamed from: a */
    public static final /* synthetic */ e0 f2510a = new e0();

    @Override // b3.i0.a
    public final void a(SQLiteDatabase sQLiteDatabase) {
        String str = i0.f2518u;
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }
}
