package n6;

import androidx.activity.result.d;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import l7.c;
import o7.b;

/* loaded from: classes.dex */
public final class z extends d {

    /* renamed from: b */
    public final Set<Class<?>> f16669b;

    /* renamed from: c */
    public final Set<Class<?>> f16670c;

    /* renamed from: d */
    public final Set<Class<?>> f16671d;

    /* renamed from: e */
    public final Set<Class<?>> f16672e;

    /* renamed from: f */
    public final Set<Class<?>> f16673f;

    /* renamed from: g */
    public final Set<Class<?>> f16674g;

    /* renamed from: h */
    public final c f16675h;

    /* loaded from: classes.dex */
    public static class a implements c {

        /* renamed from: a */
        public final c f16676a;

        public a(c cVar) {
            this.f16676a = cVar;
        }
    }

    public z(b<?> bVar, c cVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (n nVar : bVar.f16617b) {
            int i10 = nVar.f16650c;
            boolean z10 = true;
            if (!(i10 == 0)) {
                if (i10 != 2 ? false : z10) {
                    hashSet3.add(nVar.f16648a);
                } else if (nVar.a()) {
                    hashSet5.add(nVar.f16648a);
                } else {
                    hashSet2.add(nVar.f16648a);
                }
            } else if (nVar.a()) {
                hashSet4.add(nVar.f16648a);
            } else {
                hashSet.add(nVar.f16648a);
            }
        }
        if (!bVar.f16621f.isEmpty()) {
            hashSet.add(c.class);
        }
        this.f16669b = Collections.unmodifiableSet(hashSet);
        this.f16670c = Collections.unmodifiableSet(hashSet2);
        this.f16671d = Collections.unmodifiableSet(hashSet3);
        this.f16672e = Collections.unmodifiableSet(hashSet4);
        this.f16673f = Collections.unmodifiableSet(hashSet5);
        this.f16674g = bVar.f16621f;
        this.f16675h = cVar;
    }

    @Override // androidx.activity.result.d, n6.c
    public final <T> T a(Class<T> cls) {
        if (this.f16669b.contains(cls)) {
            T t10 = (T) this.f16675h.a(cls);
            return !cls.equals(c.class) ? t10 : (T) new a((c) t10);
        }
        throw new p(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // androidx.activity.result.d, n6.c
    public final <T> Set<T> b(Class<T> cls) {
        if (this.f16672e.contains(cls)) {
            return this.f16675h.b(cls);
        }
        throw new p(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // n6.c
    public final <T> b<T> c(Class<T> cls) {
        if (this.f16670c.contains(cls)) {
            return this.f16675h.c(cls);
        }
        throw new p(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // n6.c
    public final <T> b<Set<T>> d(Class<T> cls) {
        if (this.f16673f.contains(cls)) {
            return this.f16675h.d(cls);
        }
        throw new p(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override // n6.c
    public final <T> o7.a<T> e(Class<T> cls) {
        if (this.f16671d.contains(cls)) {
            return this.f16675h.e(cls);
        }
        throw new p(String.format("Attempting to request an undeclared dependency Deferred<%s>.", cls));
    }
}
