package z8;

import x8.d;
import x8.e;
import x8.f;

/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: t */
    public final f f21059t;

    /* renamed from: u */
    public transient d<Object> f21060u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d<Object> dVar) {
        super(dVar);
        f context = dVar != null ? dVar.getContext() : null;
        this.f21059t = context;
    }

    @Override // z8.a
    public final void e() {
        d<?> dVar = this.f21060u;
        if (dVar != null && dVar != this) {
            f fVar = this.f21059t;
            e9.f.c(fVar);
            int i10 = e.f20101r;
            f.b bVar = fVar.get(e.a.f20102s);
            e9.f.c(bVar);
            ((e) bVar).c(dVar);
        }
        this.f21060u = b.f21058s;
    }

    @Override // x8.d
    public final f getContext() {
        f fVar = this.f21059t;
        e9.f.c(fVar);
        return fVar;
    }
}
