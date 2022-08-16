package l1;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import k1.c;
import s.h;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: s */
    public final Context f5724s;

    /* renamed from: t */
    public final String f5725t;

    /* renamed from: u */
    public final c.a f5726u;

    /* renamed from: v */
    public final boolean f5727v;

    /* renamed from: w */
    public final boolean f5728w;

    /* renamed from: x */
    public final Object f5729x = new Object();
    public a y;

    /* renamed from: z */
    public boolean f5730z;

    /* loaded from: classes.dex */
    public static class a extends SQLiteOpenHelper {

        /* renamed from: s */
        public final l1.a[] f5731s;

        /* renamed from: t */
        public final Context f5732t;

        /* renamed from: u */
        public final c.a f5733u;

        /* renamed from: v */
        public final boolean f5734v;

        /* renamed from: w */
        public boolean f5735w;

        /* renamed from: x */
        public final m1.a f5736x;
        public boolean y;

        /* renamed from: l1.b$a$a */
        /* loaded from: classes.dex */
        public class C0090a implements DatabaseErrorHandler {

            /* renamed from: a */
            public final /* synthetic */ c.a f5737a;

            /* renamed from: b */
            public final /* synthetic */ l1.a[] f5738b;

            public C0090a(c.a aVar, l1.a[] aVarArr) {
                this.f5737a = aVar;
                this.f5738b = aVarArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                c.a aVar = this.f5737a;
                l1.a j3 = a.j(this.f5738b, sQLiteDatabase);
                Objects.requireNonNull(aVar);
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + j3.A());
                if (j3.isOpen()) {
                    List<Pair<String, String>> list = null;
                    try {
                        try {
                            list = j3.b();
                        } finally {
                            if (list != null) {
                                for (Pair<String, String> next : list) {
                                    aVar.a((String) next.second);
                                }
                            } else {
                                aVar.a(j3.A());
                            }
                        }
                    } catch (SQLiteException unused) {
                    }
                    try {
                        j3.close();
                    } catch (IOException unused2) {
                    }
                }
            }
        }

        /* renamed from: l1.b$a$b */
        /* loaded from: classes.dex */
        public static final class C0091b extends RuntimeException {

            /* renamed from: s */
            public final int f5739s;

            /* renamed from: t */
            public final Throwable f5740t;

            public C0091b(int i10, Throwable th) {
                super(th);
                this.f5739s = i10;
                this.f5740t = th;
            }

            @Override // java.lang.Throwable
            public final Throwable getCause() {
                return this.f5740t;
            }
        }

        public a(Context context, String str, l1.a[] aVarArr, c.a aVar, boolean z10) {
            super(context, str, null, aVar.f5568a, new C0090a(aVar, aVarArr));
            this.f5732t = context;
            this.f5733u = aVar;
            this.f5731s = aVarArr;
            this.f5734v = z10;
            this.f5736x = new m1.a(str == null ? UUID.randomUUID().toString() : str, context.getCacheDir(), false);
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x000c, code lost:
            if ((r1.f5722s == r3) == false) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static l1.a j(l1.a[] r2, android.database.sqlite.SQLiteDatabase r3) {
            /*
                r0 = 0
                r1 = r2[r0]
                if (r1 == 0) goto Le
                android.database.sqlite.SQLiteDatabase r1 = r1.f5722s
                if (r1 != r3) goto Lb
                r1 = 1
                goto Lc
            Lb:
                r1 = r0
            Lc:
                if (r1 != 0) goto L15
            Le:
                l1.a r1 = new l1.a
                r1.<init>(r3)
                r2[r0] = r1
            L15:
                r2 = r2[r0]
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: l1.b.a.j(l1.a[], android.database.sqlite.SQLiteDatabase):l1.a");
        }

        public final SQLiteDatabase G(boolean z10) {
            return z10 ? getWritableDatabase() : getReadableDatabase();
        }

        public final SQLiteDatabase H(boolean z10) {
            File parentFile;
            String databaseName = getDatabaseName();
            if (databaseName != null && (parentFile = this.f5732t.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return G(z10);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return G(z10);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof C0091b) {
                        C0091b c0091b = th;
                        Throwable th2 = c0091b.f5740t;
                        int b10 = h.b(c0091b.f5739s);
                        if (b10 == 0 || b10 == 1 || b10 == 2 || b10 == 3) {
                            throw th2;
                        }
                        if (!(th2 instanceof SQLiteException)) {
                            throw th2;
                        }
                    } else if (!(th instanceof SQLiteException)) {
                        throw th;
                    } else {
                        if (databaseName == null || !this.f5734v) {
                            throw th;
                        }
                    }
                    this.f5732t.deleteDatabase(databaseName);
                    try {
                        return G(z10);
                    } catch (C0091b e10) {
                        throw e10.f5740t;
                    }
                }
            }
        }

        public final k1.b b(boolean z10) {
            k1.b bVar;
            try {
                this.f5736x.a(!this.y && getDatabaseName() != null);
                this.f5735w = false;
                SQLiteDatabase H = H(z10);
                if (this.f5735w) {
                    close();
                    bVar = b(z10);
                } else {
                    bVar = c(H);
                }
                return bVar;
            } finally {
                this.f5736x.b();
            }
        }

        public final l1.a c(SQLiteDatabase sQLiteDatabase) {
            return j(this.f5731s, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final void close() {
            try {
                m1.a aVar = this.f5736x;
                aVar.a(aVar.f5943c);
                super.close();
                this.f5731s[0] = null;
                this.y = false;
            } finally {
                this.f5736x.b();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            try {
                c.a aVar = this.f5733u;
                c(sQLiteDatabase);
                aVar.b();
            } catch (Throwable th) {
                throw new C0091b(1, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                this.f5733u.c(c(sQLiteDatabase));
            } catch (Throwable th) {
                throw new C0091b(2, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f5735w = true;
            try {
                this.f5733u.d(c(sQLiteDatabase), i10, i11);
            } catch (Throwable th) {
                throw new C0091b(4, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f5735w) {
                try {
                    this.f5733u.e(c(sQLiteDatabase));
                } catch (Throwable th) {
                    throw new C0091b(5, th);
                }
            }
            this.y = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f5735w = true;
            try {
                this.f5733u.f(c(sQLiteDatabase), i10, i11);
            } catch (Throwable th) {
                throw new C0091b(3, th);
            }
        }
    }

    public b(Context context, String str, c.a aVar, boolean z10, boolean z11) {
        this.f5724s = context;
        this.f5725t = str;
        this.f5726u = aVar;
        this.f5727v = z10;
        this.f5728w = z11;
    }

    public final a b() {
        a aVar;
        synchronized (this.f5729x) {
            if (this.y == null) {
                l1.a[] aVarArr = new l1.a[1];
                if (this.f5725t == null || !this.f5727v) {
                    this.y = new a(this.f5724s, this.f5725t, aVarArr, this.f5726u, this.f5728w);
                } else {
                    this.y = new a(this.f5724s, new File(this.f5724s.getNoBackupFilesDir(), this.f5725t).getAbsolutePath(), aVarArr, this.f5726u, this.f5728w);
                }
                this.y.setWriteAheadLoggingEnabled(this.f5730z);
            }
            aVar = this.y;
        }
        return aVar;
    }

    @Override // k1.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b().close();
    }

    @Override // k1.c
    public final String getDatabaseName() {
        return this.f5725t;
    }

    @Override // k1.c
    public final k1.b h0() {
        return b().b(true);
    }

    @Override // k1.c
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        synchronized (this.f5729x) {
            a aVar = this.y;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z10);
            }
            this.f5730z = z10;
        }
    }
}
