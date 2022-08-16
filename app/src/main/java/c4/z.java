package c4;

import b4.a;
import com.google.android.gms.common.api.Scope;
import d4.b;
import d4.h;
import d4.m;
import java.util.Set;

/* loaded from: classes.dex */
public final class z implements b.c, i0 {

    /* renamed from: a */
    public final a.e f2762a;

    /* renamed from: b */
    public final b<?> f2763b;

    /* renamed from: c */
    public h f2764c = null;

    /* renamed from: d */
    public Set<Scope> f2765d = null;

    /* renamed from: e */
    public boolean f2766e = false;

    /* renamed from: f */
    public final /* synthetic */ e f2767f;

    public z(e eVar, a.e eVar2, b<?> bVar) {
        this.f2767f = eVar;
        this.f2762a = eVar2;
        this.f2763b = bVar;
    }

    @Override // d4.b.c
    public final void a(a4.b bVar) {
        this.f2767f.F.post(new y(this, bVar));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<c4.b<?>, c4.w<?>>, java.util.concurrent.ConcurrentHashMap] */
    public final void b(a4.b bVar) {
        w wVar = (w) this.f2767f.B.get(this.f2763b);
        if (wVar != null) {
            m.c(wVar.E.F);
            a.e eVar = wVar.f2745t;
            String name = eVar.getClass().getName();
            String valueOf = String.valueOf(bVar);
            eVar.d(i0.b.a(new StringBuilder(name.length() + 25 + valueOf.length()), "onSignInFailed for ", name, " with ", valueOf));
            wVar.q(bVar, null);
        }
    }
}
