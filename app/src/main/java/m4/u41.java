package m4;

import android.database.sqlite.SQLiteDatabase;
import n3.g1;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class u41 implements z41, kz1, rk1, cl1 {

    /* renamed from: s */
    public final Object f14252s;

    public /* synthetic */ u41(Object obj) {
        this.f14252s = obj;
    }

    public /* synthetic */ u41(ko1 ko1Var) {
        this.f14252s = ko1Var;
    }

    @Override // m4.kz1
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            ((ko1) this.f14252s).mo30h((SQLiteDatabase) obj);
        } catch (Exception e10) {
            String valueOf = String.valueOf(e10.getMessage());
            g1.g(valueOf.length() != 0 ? "Error executing function on offline buffered ping database: ".concat(valueOf) : new String("Error executing function on offline buffered ping database: "));
        }
    }

    @Override // m4.cl1
    public final eo0 b(bl1 bl1Var) {
        return ((sj1) this.f14252s).c(bl1Var);
    }

    public final int c() {
        int optInt = ((JSONObject) this.f14252s).optInt("media_type", -1);
        if (optInt != 0) {
            return optInt != 1 ? 3 : 1;
        }
        return 2;
    }

    @Override // m4.z41
    public final tz1 e(o50 o50Var) {
        return ((a51) this.f14252s).f6051c.a().Q3(st.f13819c.e().booleanValue() ? o50Var.f12001z : o50Var.B);
    }

    @Override // m4.kz1
    public final void f(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        g1.g(valueOf.length() != 0 ? "Failed to get offline buffered ping database: ".concat(valueOf) : new String("Failed to get offline buffered ping database: "));
    }

    @Override // m4.rk1
    public final void h(Object obj) {
        ((po) obj).E(((cn) this.f14252s).f7067s);
    }
}
