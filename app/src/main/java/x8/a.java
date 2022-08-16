package x8;

import d9.p;
import x8.f;

/* loaded from: classes.dex */
public abstract class a implements f.b {
    private final f.c<?> key;

    public a(f.c<?> cVar) {
        e9.f.e(cVar, "key");
        this.key = cVar;
    }

    @Override // x8.f
    public <R> R fold(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        e9.f.e(pVar, "operation");
        return pVar.b(r10, this);
    }

    @Override // x8.f.b, x8.f
    public <E extends f.b> E get(f.c<E> cVar) {
        return (E) f.b.a.a(this, cVar);
    }

    @Override // x8.f.b
    public f.c<?> getKey() {
        return this.key;
    }

    @Override // x8.f
    public f minusKey(f.c<?> cVar) {
        return f.b.a.b(this, cVar);
    }

    public f plus(f fVar) {
        e9.f.e(fVar, "context");
        return f.a.a(this, fVar);
    }
}
