package r;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import r.f;

/* loaded from: classes.dex */
public final class a<K, V> extends g<K, V> implements Map<K, V> {

    /* renamed from: z */
    public f<K, V> f17161z;

    /* renamed from: r.a$a */
    /* loaded from: classes.dex */
    public class C0107a extends f<K, V> {
        public C0107a() {
            a.this = r1;
        }

        @Override // r.f
        public final void a() {
            a.this.clear();
        }

        @Override // r.f
        public final Object b(int i10, int i11) {
            return a.this.f17200t[(i10 << 1) + i11];
        }

        @Override // r.f
        public final Map<K, V> c() {
            return a.this;
        }

        @Override // r.f
        public final int d() {
            return a.this.f17201u;
        }

        @Override // r.f
        public final int e(Object obj) {
            return a.this.e(obj);
        }

        @Override // r.f
        public final int f(Object obj) {
            return a.this.g(obj);
        }

        @Override // r.f
        public final void g(K k10, V v10) {
            a.this.put(k10, v10);
        }

        @Override // r.f
        public final void h(int i10) {
            a.this.i(i10);
        }

        @Override // r.f
        public final V i(int i10, V v10) {
            return a.this.j(i10, v10);
        }
    }

    public a() {
    }

    public a(int i10) {
        super(i10);
    }

    public a(g gVar) {
        super(gVar);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        f<K, V> l10 = l();
        if (l10.f17181a == null) {
            l10.f17181a = new f.b();
        }
        return l10.f17181a;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        f<K, V> l10 = l();
        if (l10.f17182b == null) {
            l10.f17182b = new f.c();
        }
        return l10.f17182b;
    }

    public final f<K, V> l() {
        if (this.f17161z == null) {
            this.f17161z = new C0107a();
        }
        return this.f17161z;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.f17201u);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        f<K, V> l10 = l();
        if (l10.f17183c == null) {
            l10.f17183c = new f.e();
        }
        return l10.f17183c;
    }
}
