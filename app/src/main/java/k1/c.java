package k1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.Closeable;
import java.io.File;

/* loaded from: classes.dex */
public interface c extends Closeable {

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a */
        public final int f5568a;

        public a(int i10) {
            this.f5568a = i10;
        }

        public final void a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e10) {
                Log.w("SupportSQLite", "delete failed: ", e10);
            }
        }

        public abstract void b();

        public abstract void c(k1.b bVar);

        public abstract void d(k1.b bVar, int i10, int i11);

        public abstract void e(k1.b bVar);

        public abstract void f(k1.b bVar, int i10, int i11);
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final Context f5569a;

        /* renamed from: b */
        public final String f5570b;

        /* renamed from: c */
        public final a f5571c;

        /* renamed from: d */
        public final boolean f5572d;

        public b(Context context, String str, a aVar, boolean z10) {
            this.f5569a = context;
            this.f5570b = str;
            this.f5571c = aVar;
            this.f5572d = z10;
        }
    }

    /* renamed from: k1.c$c */
    /* loaded from: classes.dex */
    public interface AbstractC0083c {
        c a(b bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    k1.b h0();

    void setWriteAheadLoggingEnabled(boolean z10);
}
