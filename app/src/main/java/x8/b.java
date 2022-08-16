package x8;

import d9.l;
import x8.f;
import x8.f.b;

/* loaded from: classes.dex */
public abstract class b<B extends f.b, E extends B> implements f.c<E> {

    /* renamed from: s */
    public final l<f.b, E> f20096s;

    /* renamed from: t */
    public final f.c<?> f20097t;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [d9.l<x8.f$b, E extends B>, d9.l<? super x8.f$b, ? extends E extends B>] */
    public b(f.c<B> cVar, l<? super f.b, ? extends E> lVar) {
        e9.f.e(cVar, "baseKey");
        this.f20096s = lVar;
        this.f20097t = cVar instanceof b ? (f.c<B>) ((b) cVar).f20097t : cVar;
    }

    public final f.b a(f.b bVar) {
        e9.f.e(bVar, "element");
        return (f.b) this.f20096s.c(bVar);
    }
}
