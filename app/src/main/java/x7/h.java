package x7;

import a8.b;
import a8.j;
import a8.l;
import a8.n;
import a8.q;
import a8.r;
import a8.s;
import c8.d;
import e8.c;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import z7.e;
import z7.i;
import z7.k;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: i */
    public static final d8.a<?> f20076i = new d8.a<>(Object.class);

    /* renamed from: c */
    public final e f20079c;

    /* renamed from: d */
    public final a8.e f20080d;

    /* renamed from: e */
    public final List<x> f20081e;

    /* renamed from: g */
    public final List<x> f20083g;

    /* renamed from: h */
    public final List<x> f20084h;

    /* renamed from: a */
    public final ThreadLocal<Map<d8.a<?>, a<?>>> f20077a = new ThreadLocal<>();

    /* renamed from: b */
    public final Map<d8.a<?>, w<?>> f20078b = new ConcurrentHashMap();

    /* renamed from: f */
    public final boolean f20082f = true;

    /* loaded from: classes.dex */
    public static class a<T> extends w<T> {

        /* renamed from: a */
        public w<T> f20085a;

        @Override // x7.w
        public final T a(e8.a aVar) {
            w<T> wVar = this.f20085a;
            if (wVar != null) {
                return wVar.a(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // x7.w
        public final void b(c cVar, T t10) {
            w<T> wVar = this.f20085a;
            if (wVar != null) {
                wVar.b(cVar, t10);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public h() {
        i iVar = i.f21021u;
        Map emptyMap = Collections.emptyMap();
        List<x> emptyList = Collections.emptyList();
        List<x> emptyList2 = Collections.emptyList();
        List emptyList3 = Collections.emptyList();
        e eVar = new e(emptyMap);
        this.f20079c = eVar;
        this.f20083g = emptyList;
        this.f20084h = emptyList2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(q.W);
        arrayList.add(l.f317c);
        arrayList.add(iVar);
        arrayList.addAll(emptyList3);
        arrayList.add(q.C);
        arrayList.add(q.f356m);
        arrayList.add(q.f350g);
        arrayList.add(q.f352i);
        arrayList.add(q.f354k);
        w<Number> wVar = q.f362t;
        arrayList.add(new s(Long.TYPE, Long.class, wVar));
        arrayList.add(new s(Double.TYPE, Double.class, new d()));
        arrayList.add(new s(Float.TYPE, Float.class, new e()));
        arrayList.add(j.f314b);
        arrayList.add(q.f358o);
        arrayList.add(q.f359q);
        arrayList.add(new r(AtomicLong.class, new v(new f(wVar))));
        arrayList.add(new r(AtomicLongArray.class, new v(new g(wVar))));
        arrayList.add(q.f361s);
        arrayList.add(q.f366x);
        arrayList.add(q.E);
        arrayList.add(q.G);
        arrayList.add(new r(BigDecimal.class, q.f367z));
        arrayList.add(new r(BigInteger.class, q.A));
        arrayList.add(new r(k.class, q.B));
        arrayList.add(q.I);
        arrayList.add(q.K);
        arrayList.add(q.O);
        arrayList.add(q.Q);
        arrayList.add(q.U);
        arrayList.add(q.M);
        arrayList.add(q.f347d);
        arrayList.add(a8.c.f304b);
        arrayList.add(q.S);
        if (d.f2823a) {
            arrayList.add(d.f2825c);
            arrayList.add(d.f2824b);
            arrayList.add(d.f2826d);
        }
        arrayList.add(a8.a.f298c);
        arrayList.add(q.f345b);
        arrayList.add(new b(eVar));
        arrayList.add(new a8.h(eVar));
        a8.e eVar2 = new a8.e(eVar);
        this.f20080d = eVar2;
        arrayList.add(eVar2);
        arrayList.add(q.X);
        arrayList.add(new n(eVar, iVar, eVar2));
        this.f20081e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d5) {
        if (Double.isNaN(d5) || Double.isInfinite(d5)) {
            throw new IllegalArgumentException(d5 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> T b(java.lang.String r6, java.lang.Class<T> r7) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.h.b(java.lang.String, java.lang.Class):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<d8.a<?>, x7.w<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Map<d8.a<?>, x7.w<?>>, java.util.concurrent.ConcurrentHashMap] */
    public final <T> w<T> c(d8.a<T> aVar) {
        w<T> wVar = (w) this.f20078b.get(aVar);
        if (wVar != null) {
            return wVar;
        }
        Map<d8.a<?>, a<?>> map = this.f20077a.get();
        boolean z10 = false;
        if (map == null) {
            map = new HashMap<>();
            this.f20077a.set(map);
            z10 = true;
        }
        a<?> aVar2 = map.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            a<?> aVar3 = new a<>();
            map.put(aVar, aVar3);
            for (x xVar : this.f20081e) {
                w<T> a10 = xVar.a(this, aVar);
                if (a10 != null) {
                    if (aVar3.f20085a == null) {
                        aVar3.f20085a = a10;
                        this.f20078b.put(aVar, a10);
                        return a10;
                    }
                    throw new AssertionError();
                }
            }
            throw new IllegalArgumentException("GSON (2.9.0) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z10) {
                this.f20077a.remove();
            }
        }
    }

    public final <T> w<T> d(x xVar, d8.a<T> aVar) {
        if (!this.f20081e.contains(xVar)) {
            xVar = this.f20080d;
        }
        boolean z10 = false;
        for (x xVar2 : this.f20081e) {
            if (z10) {
                w<T> a10 = xVar2.a(this, aVar);
                if (a10 != null) {
                    return a10;
                }
            } else if (xVar2 == xVar) {
                z10 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f20081e + ",instanceCreators:" + this.f20079c + "}";
    }
}
