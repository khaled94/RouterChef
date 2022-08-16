package l1;

import android.database.sqlite.SQLiteStatement;
import k1.f;

/* loaded from: classes.dex */
public final class e extends d implements f {

    /* renamed from: t */
    public final SQLiteStatement f5742t;

    public e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f5742t = sQLiteStatement;
    }

    @Override // k1.f
    public final long i0() {
        return this.f5742t.executeInsert();
    }

    @Override // k1.f
    public final int s() {
        return this.f5742t.executeUpdateDelete();
    }
}
