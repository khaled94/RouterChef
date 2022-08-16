package da;

import d.b;
import e9.f;
import k9.e;

/* loaded from: classes.dex */
public final class q implements d<Object> {

    /* renamed from: a */
    public final /* synthetic */ e f4059a;

    public q(e eVar) {
        this.f4059a = eVar;
    }

    @Override // da.d
    public final void a(b<Object> bVar, a0<Object> a0Var) {
        f.f(bVar, "call");
        f.f(a0Var, "response");
        this.f4059a.d(a0Var);
    }

    @Override // da.d
    public final void b(b<Object> bVar, Throwable th) {
        f.f(bVar, "call");
        f.f(th, "t");
        this.f4059a.d(b.a(th));
    }
}
