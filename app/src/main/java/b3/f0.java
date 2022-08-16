package b3;

import android.database.sqlite.SQLiteDatabase;
import b3.i0;

/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements i0.a {

    /* renamed from: a */
    public static final /* synthetic */ f0 f2512a = new f0();

    @Override // b3.i0.a
    public final void a(SQLiteDatabase sQLiteDatabase) {
        String str = i0.f2518u;
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
