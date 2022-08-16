package m4;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class f61 {

    /* renamed from: a */
    public final c61 f8360a;

    /* renamed from: b */
    public final uz1 f8361b;

    public f61(c61 c61Var, uz1 uz1Var) {
        this.f8360a = c61Var;
        this.f8361b = uz1Var;
    }

    public final void a(ko1<SQLiteDatabase, Void> ko1Var) {
        uz1 uz1Var = this.f8361b;
        final c61 c61Var = this.f8360a;
        mz1.t(uz1Var.Z(new Callable() { // from class: m4.e61
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c61.this.getWritableDatabase();
            }
        }), new w3((ko1) ko1Var), this.f8361b);
    }
}
