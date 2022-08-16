package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.g;
import e0.d;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import m.b;

/* loaded from: classes.dex */
public final class m extends g {

    /* renamed from: c */
    public final WeakReference<l> f1703c;

    /* renamed from: a */
    public m.a<k, a> f1701a = new m.a<>();

    /* renamed from: d */
    public int f1704d = 0;

    /* renamed from: e */
    public boolean f1705e = false;

    /* renamed from: f */
    public boolean f1706f = false;

    /* renamed from: g */
    public ArrayList<g.c> f1707g = new ArrayList<>();

    /* renamed from: b */
    public g.c f1702b = g.c.INITIALIZED;

    /* renamed from: h */
    public final boolean f1708h = true;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public g.c f1709a;

        /* renamed from: b */
        public j f1710b;

        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.d>>>, java.util.HashMap] */
        public a(k kVar, g.c cVar) {
            j jVar;
            Map<Class<?>, Integer> map = p.f1712a;
            boolean z10 = kVar instanceof j;
            boolean z11 = kVar instanceof c;
            if (z10 && z11) {
                jVar = new FullLifecycleObserverAdapter((c) kVar, (j) kVar);
            } else if (z11) {
                jVar = new FullLifecycleObserverAdapter((c) kVar, null);
            } else if (z10) {
                jVar = (j) kVar;
            } else {
                Class<?> cls = kVar.getClass();
                if (p.c(cls) == 2) {
                    List list = (List) p.f1713b.get(cls);
                    if (list.size() == 1) {
                        jVar = new SingleGeneratedAdapterObserver(p.a((Constructor) list.get(0), kVar));
                    } else {
                        d[] dVarArr = new d[list.size()];
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            dVarArr[i10] = p.a((Constructor) list.get(i10), kVar);
                        }
                        jVar = new CompositeGeneratedAdaptersObserver(dVarArr);
                    }
                } else {
                    jVar = new ReflectiveGenericLifecycleObserver(kVar);
                }
            }
            this.f1710b = jVar;
            this.f1709a = cVar;
        }

        public final void a(l lVar, g.b bVar) {
            g.c b10 = bVar.b();
            this.f1709a = m.g(this.f1709a, b10);
            this.f1710b.a(lVar, bVar);
            this.f1709a = b10;
        }
    }

    public m(l lVar) {
        this.f1703c = new WeakReference<>(lVar);
    }

    public static g.c g(g.c cVar, g.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    @Override // androidx.lifecycle.g
    public final void a(k kVar) {
        l lVar;
        e("addObserver");
        g.c cVar = this.f1702b;
        g.c cVar2 = g.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = g.c.INITIALIZED;
        }
        a aVar = new a(kVar, cVar2);
        if (this.f1701a.h(kVar, aVar) == null && (lVar = this.f1703c.get()) != null) {
            boolean z10 = this.f1704d != 0 || this.f1705e;
            g.c d5 = d(kVar);
            this.f1704d++;
            while (aVar.f1709a.compareTo(d5) < 0 && this.f1701a.contains(kVar)) {
                j(aVar.f1709a);
                g.b d10 = g.b.d(aVar.f1709a);
                if (d10 == null) {
                    StringBuilder c10 = androidx.activity.result.a.c("no event up from ");
                    c10.append(aVar.f1709a);
                    throw new IllegalStateException(c10.toString());
                }
                aVar.a(lVar, d10);
                i();
                d5 = d(kVar);
            }
            if (!z10) {
                l();
            }
            this.f1704d--;
        }
    }

    @Override // androidx.lifecycle.g
    public final g.c b() {
        return this.f1702b;
    }

    @Override // androidx.lifecycle.g
    public final void c(k kVar) {
        e("removeObserver");
        this.f1701a.i(kVar);
    }

    public final g.c d(k kVar) {
        m.a<k, a> aVar = this.f1701a;
        g.c cVar = null;
        b.c<k, a> cVar2 = aVar.contains(kVar) ? aVar.f5832w.get(kVar).f5840v : null;
        g.c cVar3 = cVar2 != null ? cVar2.f5838t.f1709a : null;
        if (!this.f1707g.isEmpty()) {
            ArrayList<g.c> arrayList = this.f1707g;
            cVar = arrayList.get(arrayList.size() - 1);
        }
        return g(g(this.f1702b, cVar3), cVar);
    }

    @SuppressLint({"RestrictedApi"})
    public final void e(String str) {
        if (!this.f1708h || l.a.h().i()) {
            return;
        }
        throw new IllegalStateException(d.a("Method ", str, " must be called on the main thread"));
    }

    public final void f(g.b bVar) {
        e("handleLifecycleEvent");
        h(bVar.b());
    }

    public final void h(g.c cVar) {
        g.c cVar2 = g.c.DESTROYED;
        g.c cVar3 = this.f1702b;
        if (cVar3 == cVar) {
            return;
        }
        if (cVar3 == g.c.INITIALIZED && cVar == cVar2) {
            StringBuilder c10 = androidx.activity.result.a.c("no event down from ");
            c10.append(this.f1702b);
            throw new IllegalStateException(c10.toString());
        }
        this.f1702b = cVar;
        if (this.f1705e || this.f1704d != 0) {
            this.f1706f = true;
            return;
        }
        this.f1705e = true;
        l();
        this.f1705e = false;
        if (this.f1702b != cVar2) {
            return;
        }
        this.f1701a = new m.a<>();
    }

    public final void i() {
        ArrayList<g.c> arrayList = this.f1707g;
        arrayList.remove(arrayList.size() - 1);
    }

    public final void j(g.c cVar) {
        this.f1707g.add(cVar);
    }

    public final void k() {
        g.c cVar = g.c.CREATED;
        e("setCurrentState");
        h(cVar);
    }

    public final void l() {
        l lVar = this.f1703c.get();
        if (lVar != null) {
            while (true) {
                m.a<k, a> aVar = this.f1701a;
                boolean z10 = true;
                if (aVar.f5836v != 0) {
                    g.c cVar = aVar.f5833s.getValue().f1709a;
                    g.c cVar2 = this.f1701a.f5834t.getValue().f1709a;
                    if (cVar != cVar2 || this.f1702b != cVar2) {
                        z10 = false;
                    }
                }
                this.f1706f = false;
                if (z10) {
                    return;
                }
                if (this.f1702b.compareTo(this.f1701a.f5833s.f5838t.f1709a) < 0) {
                    m.a<k, a> aVar2 = this.f1701a;
                    b.C0092b c0092b = new b.C0092b(aVar2.f5834t, aVar2.f5833s);
                    aVar2.f5835u.put(c0092b, Boolean.FALSE);
                    while (c0092b.hasNext() && !this.f1706f) {
                        Map.Entry entry = (Map.Entry) c0092b.next();
                        a aVar3 = (a) entry.getValue();
                        while (aVar3.f1709a.compareTo(this.f1702b) > 0 && !this.f1706f && this.f1701a.contains((k) entry.getKey())) {
                            int ordinal = aVar3.f1709a.ordinal();
                            g.b bVar = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : g.b.ON_PAUSE : g.b.ON_STOP : g.b.ON_DESTROY;
                            if (bVar != null) {
                                j(bVar.b());
                                aVar3.a(lVar, bVar);
                                i();
                            } else {
                                StringBuilder c10 = androidx.activity.result.a.c("no event down from ");
                                c10.append(aVar3.f1709a);
                                throw new IllegalStateException(c10.toString());
                            }
                        }
                    }
                }
                b.c<k, a> cVar3 = this.f1701a.f5834t;
                if (!this.f1706f && cVar3 != null && this.f1702b.compareTo(cVar3.f5838t.f1709a) > 0) {
                    b<k, a>.d e10 = this.f1701a.e();
                    while (e10.hasNext() && !this.f1706f) {
                        Map.Entry entry2 = (Map.Entry) e10.next();
                        a aVar4 = (a) entry2.getValue();
                        while (aVar4.f1709a.compareTo(this.f1702b) < 0 && !this.f1706f && this.f1701a.contains((k) entry2.getKey())) {
                            j(aVar4.f1709a);
                            g.b d5 = g.b.d(aVar4.f1709a);
                            if (d5 == null) {
                                StringBuilder c11 = androidx.activity.result.a.c("no event up from ");
                                c11.append(aVar4.f1709a);
                                throw new IllegalStateException(c11.toString());
                            }
                            aVar4.a(lVar, d5);
                            i();
                        }
                    }
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }
}
