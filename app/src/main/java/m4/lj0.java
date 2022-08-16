package m4;

import h4.a;
import java.util.concurrent.Executor;
import n3.g1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class lj0 implements rh {

    /* renamed from: s */
    public vd0 f10873s;

    /* renamed from: t */
    public final Executor f10874t;

    /* renamed from: u */
    public final zi0 f10875u;

    /* renamed from: v */
    public final a f10876v;

    /* renamed from: w */
    public boolean f10877w = false;

    /* renamed from: x */
    public boolean f10878x = false;
    public final cj0 y = new cj0();

    public lj0(Executor executor, zi0 zi0Var, a aVar) {
        this.f10874t = executor;
        this.f10875u = zi0Var;
        this.f10876v = aVar;
    }

    public final void a() {
        try {
            JSONObject a10 = this.f10875u.a(this.y);
            if (this.f10873s == null) {
                return;
            }
            this.f10874t.execute(new kj0(this, a10, 0));
        } catch (JSONException e10) {
            g1.b("Failed to call video active view js", e10);
        }
    }

    @Override // m4.rh
    public final void x(qh qhVar) {
        cj0 cj0Var = this.y;
        cj0Var.f6995a = this.f10878x ? false : qhVar.f12866j;
        cj0Var.f6997c = this.f10876v.b();
        this.y.f6999e = qhVar;
        if (this.f10877w) {
            a();
        }
    }
}
