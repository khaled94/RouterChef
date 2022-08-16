package k9;

import d9.p;
import x8.f;

/* loaded from: classes.dex */
public final class c1 implements f.b, f.c<c1> {

    /* renamed from: s */
    public static final c1 f5642s = new c1();

    @Override // x8.f
    public final <R> R fold(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        return pVar.b(r10, this);
    }

    @Override // x8.f.b, x8.f
    public final <E extends f.b> E get(f.c<E> cVar) {
        return (E) f.b.a.a(this, cVar);
    }

    @Override // x8.f.b
    public final f.c<?> getKey() {
        return this;
    }

    @Override // x8.f
    public final f minusKey(f.c<?> cVar) {
        return f.b.a.b(this, cVar);
    }
}
