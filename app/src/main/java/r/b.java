package r;

import java.util.Map;

/* loaded from: classes.dex */
public final class b extends f<Object, Object> {

    /* renamed from: d */
    public final /* synthetic */ c f17163d;

    public b(c cVar) {
        this.f17163d = cVar;
    }

    @Override // r.f
    public final void a() {
        this.f17163d.clear();
    }

    @Override // r.f
    public final Object b(int i10, int i11) {
        return this.f17163d.f17168t[i10];
    }

    @Override // r.f
    public final Map<Object, Object> c() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // r.f
    public final int d() {
        return this.f17163d.f17169u;
    }

    @Override // r.f
    public final int e(Object obj) {
        return this.f17163d.indexOf(obj);
    }

    @Override // r.f
    public final int f(Object obj) {
        return this.f17163d.indexOf(obj);
    }

    @Override // r.f
    public final void g(Object obj, Object obj2) {
        this.f17163d.add(obj);
    }

    @Override // r.f
    public final void h(int i10) {
        this.f17163d.i(i10);
    }

    @Override // r.f
    public final Object i(int i10, Object obj) {
        throw new UnsupportedOperationException("not a map");
    }
}
