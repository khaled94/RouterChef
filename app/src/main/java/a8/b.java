package a8;

import e8.c;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import x7.h;
import x7.w;
import x7.x;
import z7.e;
import z7.m;

/* loaded from: classes.dex */
public final class b implements x {

    /* renamed from: s */
    public final e f301s;

    /* loaded from: classes.dex */
    public static final class a<E> extends w<Collection<E>> {

        /* renamed from: a */
        public final w<E> f302a;

        /* renamed from: b */
        public final m<? extends Collection<E>> f303b;

        public a(h hVar, Type type, w<E> wVar, m<? extends Collection<E>> mVar) {
            this.f302a = new p(hVar, wVar, type);
            this.f303b = mVar;
        }

        @Override // x7.w
        public final Object a(e8.a aVar) {
            if (aVar.x0() == 9) {
                aVar.t0();
                return null;
            }
            Collection<E> c10 = this.f303b.c();
            aVar.b();
            while (aVar.d0()) {
                c10.add(this.f302a.a(aVar));
            }
            aVar.H();
            return c10;
        }

        @Override // x7.w
        public final void b(c cVar, Object obj) {
            Collection<E> collection = (Collection) obj;
            if (collection == null) {
                cVar.Z();
                return;
            }
            cVar.c();
            for (E e10 : collection) {
                this.f302a.b(cVar, e10);
            }
            cVar.H();
        }
    }

    public b(e eVar) {
        this.f301s = eVar;
    }

    @Override // x7.x
    public final <T> w<T> a(h hVar, d8.a<T> aVar) {
        Type type = aVar.f3995b;
        Class<? super T> cls = aVar.f3994a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type g10 = z7.a.g(type, cls, Collection.class);
        if (g10 instanceof WildcardType) {
            g10 = ((WildcardType) g10).getUpperBounds()[0];
        }
        Class cls2 = g10 instanceof ParameterizedType ? ((ParameterizedType) g10).getActualTypeArguments()[0] : Object.class;
        return new a(hVar, cls2, hVar.c(new d8.a<>(cls2)), this.f301s.a(aVar));
    }
}
