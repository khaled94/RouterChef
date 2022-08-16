package x8;

import d9.p;
import e9.g;
import x8.e;

/* loaded from: classes.dex */
public interface f {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: x8.f$a$a */
        /* loaded from: classes.dex */
        public static final class C0152a extends g implements p<f, b, f> {

            /* renamed from: t */
            public static final C0152a f20103t = new C0152a();

            public C0152a() {
                super(2);
            }

            @Override // d9.p
            public final f b(f fVar, b bVar) {
                x8.c cVar;
                f fVar2 = fVar;
                b bVar2 = bVar;
                e9.f.e(fVar2, "acc");
                e9.f.e(bVar2, "element");
                f minusKey = fVar2.minusKey(bVar2.getKey());
                g gVar = g.f20104s;
                if (minusKey == gVar) {
                    return bVar2;
                }
                int i10 = e.f20101r;
                e.a aVar = e.a.f20102s;
                e eVar = (e) minusKey.get(aVar);
                if (eVar == null) {
                    cVar = new x8.c(minusKey, bVar2);
                } else {
                    f minusKey2 = minusKey.minusKey(aVar);
                    if (minusKey2 == gVar) {
                        return new x8.c(bVar2, eVar);
                    }
                    cVar = new x8.c(new x8.c(minusKey2, bVar2), eVar);
                }
                return cVar;
            }
        }

        public static f a(f fVar, f fVar2) {
            e9.f.e(fVar2, "context");
            return fVar2 == g.f20104s ? fVar : (f) fVar2.fold(fVar, C0152a.f20103t);
        }
    }

    /* loaded from: classes.dex */
    public interface b extends f {

        /* loaded from: classes.dex */
        public static final class a {
            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E a(b bVar, c<E> cVar) {
                e9.f.e(cVar, "key");
                if (e9.f.a(bVar.getKey(), cVar)) {
                    return bVar;
                }
                return null;
            }

            public static f b(b bVar, c<?> cVar) {
                e9.f.e(cVar, "key");
                return e9.f.a(bVar.getKey(), cVar) ? g.f20104s : bVar;
            }
        }

        @Override // x8.f
        <E extends b> E get(c<E> cVar);

        c<?> getKey();
    }

    /* loaded from: classes.dex */
    public interface c<E extends b> {
    }

    <R> R fold(R r10, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E get(c<E> cVar);

    f minusKey(c<?> cVar);
}
