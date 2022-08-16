package a8;

import a8.n;
import e8.a;
import e8.c;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import x7.h;
import x7.w;

/* loaded from: classes.dex */
public final class p<T> extends w<T> {

    /* renamed from: a */
    public final h f341a;

    /* renamed from: b */
    public final w<T> f342b;

    /* renamed from: c */
    public final Type f343c;

    public p(h hVar, w<T> wVar, Type type) {
        this.f341a = hVar;
        this.f342b = wVar;
        this.f343c = type;
    }

    @Override // x7.w
    public final T a(a aVar) {
        return this.f342b.a(aVar);
    }

    @Override // x7.w
    public final void b(c cVar, T t10) {
        w<T> wVar = this.f342b;
        Type type = this.f343c;
        if (t10 != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t10.getClass();
        }
        if (type != this.f343c) {
            wVar = this.f341a.c(new d8.a<>(type));
            if (wVar instanceof n.a) {
                w<T> wVar2 = this.f342b;
                if (!(wVar2 instanceof n.a)) {
                    wVar = wVar2;
                }
            }
        }
        wVar.b(cVar, t10);
    }
}
