package n6;

import android.util.Log;
import androidx.activity.result.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import l7.c;
import o7.a;
import o7.b;

/* loaded from: classes.dex */
public final class k extends d implements g7.a {

    /* renamed from: e */
    public final List<b<f>> f16639e;

    /* renamed from: f */
    public final r f16640f;

    /* renamed from: b */
    public final Map<b<?>, b<?>> f16636b = new HashMap();

    /* renamed from: c */
    public final Map<Class<?>, b<?>> f16637c = new HashMap();

    /* renamed from: d */
    public final Map<Class<?>, u<?>> f16638d = new HashMap();

    /* renamed from: g */
    public final AtomicReference<Boolean> f16641g = new AtomicReference<>();

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map<n6.b<?>, o7.b<?>>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.Map<n6.b<?>, o7.b<?>>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.util.Map<n6.b<?>, o7.b<?>>, java.util.HashMap] */
    public k(Executor executor, Iterable iterable, Collection collection, a aVar) {
        r rVar = new r(executor);
        this.f16640f = rVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(b.c(rVar, r.class, l7.d.class, c.class));
        arrayList.add(b.c(this, g7.a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterable) {
            arrayList2.add(obj);
        }
        this.f16639e = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                try {
                    f fVar = (f) ((b) it2.next()).get();
                    if (fVar != null) {
                        arrayList.addAll(fVar.getComponents());
                        it2.remove();
                    }
                } catch (s e10) {
                    it2.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            if (this.f16636b.isEmpty()) {
                m.a(arrayList);
            } else {
                ArrayList arrayList4 = new ArrayList(this.f16636b.keySet());
                arrayList4.addAll(arrayList);
                m.a(arrayList4);
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                final b bVar2 = (b) it3.next();
                this.f16636b.put(bVar2, new t(new b() { // from class: n6.i
                    @Override // o7.b
                    public final Object get() {
                        k kVar = k.this;
                        b bVar3 = bVar2;
                        Objects.requireNonNull(kVar);
                        return bVar3.f16620e.a(new z(bVar3, kVar));
                    }
                }));
            }
            arrayList3.addAll(j(arrayList));
            arrayList3.addAll(k());
            i();
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        Boolean bool = this.f16641g.get();
        if (bool != null) {
            h(this.f16636b, bool.booleanValue());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, o7.b<?>>] */
    @Override // n6.c
    public final synchronized <T> b<T> c(Class<T> cls) {
        return (b) this.f16637c.get(cls);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.Class<?>, n6.u<?>>, java.util.HashMap] */
    @Override // n6.c
    public final synchronized <T> b<Set<T>> d(Class<T> cls) {
        u uVar = (u) this.f16638d.get(cls);
        if (uVar != null) {
            return uVar;
        }
        return j.f16635a;
    }

    @Override // n6.c
    public final <T> o7.a<T> e(Class<T> cls) {
        b<T> c10 = c(cls);
        if (c10 == null) {
            return new y(g1.c.f4784t, x.f16665a);
        }
        return c10 instanceof y ? (y) c10 : new y(null, c10);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayDeque, java.util.Queue<l7.a<?>>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<l7.b<java.lang.Object>, java.util.concurrent.Executor>>, java.util.HashMap] */
    public final void h(Map<b<?>, b<?>> map, boolean z10) {
        Queue<l7.a<?>> queue;
        Set<Map.Entry> emptySet;
        Iterator<Map.Entry<b<?>, b<?>>> it = map.entrySet().iterator();
        while (true) {
            boolean z11 = false;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<b<?>, b<?>> next = it.next();
            b<?> value = next.getValue();
            int i10 = next.getKey().f16618c;
            if (!(i10 == 1)) {
                if (i10 == 2) {
                    z11 = true;
                }
                if (z11 && z10) {
                }
            }
            value.get();
        }
        r rVar = this.f16640f;
        synchronized (rVar) {
            try {
                queue = rVar.f16656b;
                if (queue != null) {
                    rVar.f16656b = null;
                } else {
                    queue = null;
                }
            } finally {
            }
        }
        if (queue != null) {
            for (l7.a<?> aVar : queue) {
                Objects.requireNonNull(aVar);
                synchronized (rVar) {
                    ?? r32 = rVar.f16656b;
                    if (r32 != 0) {
                        r32.add(aVar);
                    } else {
                        synchronized (rVar) {
                            Map map2 = (Map) rVar.f16655a.get(null);
                            emptySet = map2 == null ? Collections.emptySet() : map2.entrySet();
                        }
                        for (Map.Entry entry : emptySet) {
                            ((Executor) entry.getValue()).execute(new q(entry, aVar, 0));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<n6.b<?>, o7.b<?>>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, o7.b<?>>] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.Map<java.lang.Class<?>, n6.u<?>>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, o7.b<?>>] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.Map<java.lang.Class<?>, n6.u<?>>, java.util.HashMap] */
    public final void i() {
        for (b bVar : this.f16636b.keySet()) {
            for (n nVar : bVar.f16617b) {
                if (nVar.a() && !this.f16638d.containsKey(nVar.f16648a)) {
                    this.f16638d.put(nVar.f16648a, new u(Collections.emptySet()));
                } else if (this.f16637c.containsKey(nVar.f16648a)) {
                    continue;
                } else if (!(nVar.f16649b == 1)) {
                    if (!nVar.a()) {
                        this.f16637c.put(nVar.f16648a, new y(g1.c.f4784t, x.f16665a));
                    }
                } else {
                    throw new v(String.format("Unsatisfied dependency for component %s: %s", bVar, nVar.f16648a));
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map<n6.b<?>, o7.b<?>>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, o7.b<?>>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, o7.b<?>>] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, o7.b<?>>] */
    public final List<Runnable> j(List<b<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (b<?> bVar : list) {
            if (bVar.b()) {
                final b bVar2 = (b) this.f16636b.get(bVar);
                for (Class<? super Object> cls : bVar.f16616a) {
                    if (!this.f16637c.containsKey(cls)) {
                        this.f16637c.put(cls, bVar2);
                    } else {
                        final y yVar = (y) ((b) this.f16637c.get(cls));
                        arrayList.add(new Runnable() { // from class: n6.h
                            @Override // java.lang.Runnable
                            public final void run() {
                                a.AbstractC0098a<T> abstractC0098a;
                                y yVar2 = y.this;
                                b<T> bVar3 = bVar2;
                                if (yVar2.f16668b == x.f16665a) {
                                    synchronized (yVar2) {
                                        abstractC0098a = yVar2.f16667a;
                                        yVar2.f16667a = null;
                                        yVar2.f16668b = bVar3;
                                    }
                                    abstractC0098a.b(bVar3);
                                    return;
                                }
                                throw new IllegalStateException("provide() can be called only once.");
                            }
                        });
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map<n6.b<?>, o7.b<?>>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map<java.lang.Class<?>, n6.u<?>>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Map<java.lang.Class<?>, n6.u<?>>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Map<java.lang.Class<?>, n6.u<?>>, java.util.HashMap] */
    public final List<Runnable> k() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f16636b.entrySet()) {
            b bVar = (b) entry.getKey();
            if (!bVar.b()) {
                b bVar2 = (b) entry.getValue();
                Iterator it = bVar.f16616a.iterator();
                while (it.hasNext()) {
                    Class cls = (Class) it.next();
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(bVar2);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.f16638d.containsKey(entry2.getKey())) {
                this.f16638d.put((Class) entry2.getKey(), new u((Set) ((Collection) entry2.getValue())));
            } else {
                final u uVar = (u) this.f16638d.get(entry2.getKey());
                for (final b bVar3 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: n6.g
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            Set set;
                            b bVar4;
                            u uVar2 = u.this;
                            b bVar5 = bVar3;
                            synchronized (uVar2) {
                                if (uVar2.f16662b == null) {
                                    set = uVar2.f16661a;
                                    bVar4 = bVar5;
                                } else {
                                    set = uVar2.f16662b;
                                    bVar4 = bVar5.get();
                                }
                                set.add(bVar4);
                            }
                        }
                    });
                }
            }
        }
        return arrayList;
    }
}
