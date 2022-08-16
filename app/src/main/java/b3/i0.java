package b3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class i0 extends SQLiteOpenHelper {
    public static final h0 A;
    public static final List<a> B;

    /* renamed from: u */
    public static final String f2518u;

    /* renamed from: v */
    public static int f2519v = 5;

    /* renamed from: w */
    public static final d0 f2520w;

    /* renamed from: x */
    public static final e0 f2521x;
    public static final f0 y;

    /* renamed from: z */
    public static final g0 f2522z;

    /* renamed from: s */
    public final int f2523s;

    /* renamed from: t */
    public boolean f2524t = false;

    /* loaded from: classes.dex */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        StringBuilder c10 = androidx.activity.result.a.c("INSERT INTO global_log_event_state VALUES (");
        c10.append(System.currentTimeMillis());
        c10.append(")");
        f2518u = c10.toString();
        d0 d0Var = d0.f2508a;
        f2520w = d0Var;
        e0 e0Var = e0.f2510a;
        f2521x = e0Var;
        f0 f0Var = f0.f2512a;
        y = f0Var;
        g0 g0Var = g0.f2514a;
        f2522z = g0Var;
        h0 h0Var = h0.f2516a;
        A = h0Var;
        B = Arrays.asList(d0Var, e0Var, f0Var, g0Var, h0Var);
    }

    public i0(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f2523s = i10;
    }

    public final void b(SQLiteDatabase sQLiteDatabase) {
        if (!this.f2524t) {
            onConfigure(sQLiteDatabase);
        }
    }

    public final void c(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List<a> list = B;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                B.get(i10).a(sQLiteDatabase);
                i10++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i10 + " to " + i11 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f2524t = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i10 = this.f2523s;
        b(sQLiteDatabase);
        c(sQLiteDatabase, 0, i10);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        b(sQLiteDatabase);
        c(sQLiteDatabase, 0, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        b(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        b(sQLiteDatabase);
        c(sQLiteDatabase, i10, i11);
    }
}
