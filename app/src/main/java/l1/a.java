package l1;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.util.Pair;
import java.util.List;
import k1.b;
import k1.e;
import k1.f;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: t */
    public static final String[] f5721t = new String[0];

    /* renamed from: s */
    public final SQLiteDatabase f5722s;

    /* renamed from: l1.a$a */
    /* loaded from: classes.dex */
    public class C0089a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        public final /* synthetic */ e f5723a;

        public C0089a(e eVar) {
            this.f5723a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f5723a.b(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public a(SQLiteDatabase sQLiteDatabase) {
        this.f5722s = sQLiteDatabase;
    }

    @Override // k1.b
    public final String A() {
        return this.f5722s.getPath();
    }

    @Override // k1.b
    public final boolean C() {
        return this.f5722s.inTransaction();
    }

    @Override // k1.b
    public final boolean M() {
        return this.f5722s.isWriteAheadLoggingEnabled();
    }

    @Override // k1.b
    public final void Q() {
        this.f5722s.setTransactionSuccessful();
    }

    @Override // k1.b
    public final void T(String str, Object[] objArr) {
        this.f5722s.execSQL(str, objArr);
    }

    @Override // k1.b
    public final void W() {
        this.f5722s.beginTransactionNonExclusive();
    }

    public final List<Pair<String, String>> b() {
        return this.f5722s.getAttachedDbs();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5722s.close();
    }

    @Override // k1.b
    public final Cursor f(e eVar) {
        return this.f5722s.rawQueryWithFactory(new C0089a(eVar), eVar.c(), f5721t, null);
    }

    @Override // k1.b
    public final void g() {
        this.f5722s.endTransaction();
    }

    @Override // k1.b
    public final void h() {
        this.f5722s.beginTransaction();
    }

    @Override // k1.b
    public final boolean isOpen() {
        return this.f5722s.isOpen();
    }

    @Override // k1.b
    public final Cursor j0(String str) {
        return f(new k1.a(str, (Object) null));
    }

    @Override // k1.b
    public final void n(String str) {
        this.f5722s.execSQL(str);
    }

    @Override // k1.b
    public final f t(String str) {
        return new e(this.f5722s.compileStatement(str));
    }
}
