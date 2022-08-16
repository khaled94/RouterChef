package b3;

import android.database.sqlite.SQLiteDatabase;
import b3.b0;
import c5.d;
import c5.i;
import com.raouf.routerchef.StorePurchase;
import f8.m2;
import h2.f;
import java.util.List;
import java.util.Objects;
import q8.e;
import u7.q0;
import u7.t0;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements b0.a, d {

    /* renamed from: s */
    public final /* synthetic */ Object f2531s;

    public /* synthetic */ n(Object obj) {
        this.f2531s = obj;
    }

    @Override // b3.b0.a
    public Object a(Object obj) {
        b0 b0Var = (b0) this.f2531s;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        Objects.requireNonNull(b0Var);
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + b0Var.f2497t.a()).execute();
        return null;
    }

    public void b(f fVar, List list) {
        e eVar = (e) this.f2531s;
        Objects.requireNonNull(eVar);
        if (fVar.f4994a != 0 || list == null) {
            return;
        }
        StorePurchase storePurchase = (StorePurchase) eVar.f17160c;
        storePurchase.Q.post(new m2(storePurchase, list, 0));
    }

    @Override // c5.d
    public void c(i iVar) {
        int i10 = q0.f19572t;
        ((t0.a) this.f2531s).a();
    }
}
