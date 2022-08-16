package a8;

import androidx.activity.result.d;
import e8.c;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import x7.j;
import x7.l;
import x7.n;
import x7.o;
import x7.q;
import x7.s;
import x7.w;
import x7.x;
import z7.e;
import z7.m;

/* loaded from: classes.dex */
public final class h implements x {

    /* renamed from: s */
    public final e f307s;

    /* renamed from: t */
    public final boolean f308t = false;

    /* loaded from: classes.dex */
    public final class a<K, V> extends w<Map<K, V>> {

        /* renamed from: a */
        public final w<K> f309a;

        /* renamed from: b */
        public final w<V> f310b;

        /* renamed from: c */
        public final m<? extends Map<K, V>> f311c;

        public a(x7.h hVar, Type type, w<K> wVar, Type type2, w<V> wVar2, m<? extends Map<K, V>> mVar) {
            h.this = r1;
            this.f309a = new p(hVar, wVar, type);
            this.f310b = new p(hVar, wVar2, type2);
            this.f311c = mVar;
        }

        @Override // x7.w
        public final Object a(e8.a aVar) {
            int x0 = aVar.x0();
            if (x0 == 9) {
                aVar.t0();
                return null;
            }
            Map<K, V> c10 = this.f311c.c();
            if (x0 == 1) {
                aVar.b();
                while (aVar.d0()) {
                    aVar.b();
                    K a10 = this.f309a.a(aVar);
                    if (c10.put(a10, this.f310b.a(aVar)) != null) {
                        throw new s("duplicate key: " + a10);
                    }
                    aVar.H();
                }
                aVar.H();
            } else {
                aVar.c();
                while (aVar.d0()) {
                    d.f428a.h(aVar);
                    K a11 = this.f309a.a(aVar);
                    if (c10.put(a11, this.f310b.a(aVar)) != null) {
                        throw new s("duplicate key: " + a11);
                    }
                }
                aVar.I();
            }
            return c10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List<x7.l>, java.util.ArrayList] */
        @Override // x7.w
        public final void b(c cVar, Object obj) {
            String str;
            Map map = (Map) obj;
            if (map == null) {
                cVar.Z();
                return;
            }
            if (!h.this.f308t) {
                cVar.j();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.L(String.valueOf(entry.getKey()));
                    this.f310b.b(cVar, entry.getValue());
                }
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i10 = 0;
                boolean z10 = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    w<K> wVar = this.f309a;
                    K key = entry2.getKey();
                    Objects.requireNonNull(wVar);
                    try {
                        g gVar = new g();
                        wVar.b(gVar, key);
                        if (gVar.E.isEmpty()) {
                            l lVar = gVar.G;
                            arrayList.add(lVar);
                            arrayList2.add(entry2.getValue());
                            Objects.requireNonNull(lVar);
                            z10 |= (lVar instanceof j) || (lVar instanceof o);
                        } else {
                            throw new IllegalStateException("Expected one JSON element but was " + gVar.E);
                        }
                    } catch (IOException e10) {
                        throw new x7.m(e10);
                    }
                }
                if (z10) {
                    cVar.c();
                    int size = arrayList.size();
                    while (i10 < size) {
                        cVar.c();
                        j0.d.d((l) arrayList.get(i10), cVar);
                        this.f310b.b(cVar, arrayList2.get(i10));
                        cVar.H();
                        i10++;
                    }
                    cVar.H();
                    return;
                }
                cVar.j();
                int size2 = arrayList.size();
                while (i10 < size2) {
                    l lVar2 = (l) arrayList.get(i10);
                    Objects.requireNonNull(lVar2);
                    if (lVar2 instanceof q) {
                        q d5 = lVar2.d();
                        Serializable serializable = d5.f20089a;
                        if (serializable instanceof Number) {
                            str = String.valueOf(d5.g());
                        } else if (serializable instanceof Boolean) {
                            str = Boolean.toString(d5.e());
                        } else if (!(serializable instanceof String)) {
                            throw new AssertionError();
                        } else {
                            str = d5.h();
                        }
                    } else if (!(lVar2 instanceof n)) {
                        throw new AssertionError();
                    } else {
                        str = "null";
                    }
                    cVar.L(str);
                    this.f310b.b(cVar, arrayList2.get(i10));
                    i10++;
                }
            }
            cVar.I();
        }
    }

    public h(e eVar) {
        this.f307s = eVar;
    }

    @Override // x7.x
    public final <T> w<T> a(x7.h hVar, d8.a<T> aVar) {
        Type[] typeArr;
        Type type = aVar.f3995b;
        if (!Map.class.isAssignableFrom(aVar.f3994a)) {
            return null;
        }
        Class<?> f10 = z7.a.f(type);
        if (type == Properties.class) {
            typeArr = new Type[]{String.class, String.class};
        } else {
            Type g10 = z7.a.g(type, f10, Map.class);
            typeArr = g10 instanceof ParameterizedType ? ((ParameterizedType) g10).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = typeArr[0];
        return new a(hVar, typeArr[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? q.f349f : hVar.c(new d8.a<>(type2)), typeArr[1], hVar.c(new d8.a<>(typeArr[1])), this.f307s.a(aVar));
    }
}
