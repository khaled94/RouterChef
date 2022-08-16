package l1;

import android.database.sqlite.SQLiteProgram;

/* loaded from: classes.dex */
public class d implements k1.d {

    /* renamed from: s */
    public final SQLiteProgram f5741s;

    public d(SQLiteProgram sQLiteProgram) {
        this.f5741s = sQLiteProgram;
    }

    @Override // k1.d
    public final void P(int i10, long j3) {
        this.f5741s.bindLong(i10, j3);
    }

    @Override // k1.d
    public final void a0(int i10, byte[] bArr) {
        this.f5741s.bindBlob(i10, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5741s.close();
    }

    @Override // k1.d
    public final void o(int i10, String str) {
        this.f5741s.bindString(i10, str);
    }

    @Override // k1.d
    public final void v(int i10) {
        this.f5741s.bindNull(i10);
    }

    @Override // k1.d
    public final void x(int i10, double d5) {
        this.f5741s.bindDouble(i10, d5);
    }
}
