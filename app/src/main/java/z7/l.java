package z7;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class l<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: z */
    public static final Comparator<Comparable> f21032z = new a();

    /* renamed from: s */
    public Comparator<? super K> f21033s;

    /* renamed from: t */
    public e<K, V> f21034t;

    /* renamed from: u */
    public int f21035u = 0;

    /* renamed from: v */
    public int f21036v = 0;

    /* renamed from: w */
    public final e<K, V> f21037w = new e<>();

    /* renamed from: x */
    public l<K, V>.b f21038x;
    public l<K, V>.c y;

    /* loaded from: classes.dex */
    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* loaded from: classes.dex */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* loaded from: classes.dex */
        public class a extends l<K, V>.d<Map.Entry<K, V>> {
            public a(b bVar) {
                super();
            }

            @Override // java.util.Iterator
            public final Object next() {
                return a();
            }
        }

        public b() {
            l.this = r1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            l.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && l.this.b((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            e<K, V> b10;
            if ((obj instanceof Map.Entry) && (b10 = l.this.b((Map.Entry) obj)) != null) {
                l.this.e(b10, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return l.this.f21035u;
        }
    }

    /* loaded from: classes.dex */
    public final class c extends AbstractSet<K> {

        /* loaded from: classes.dex */
        public class a extends l<K, V>.d<K> {
            public a(c cVar) {
                super();
            }

            @Override // java.util.Iterator
            public final K next() {
                return a().f21050x;
            }
        }

        public c() {
            l.this = r1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            l.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return l.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            l lVar = l.this;
            e<K, V> c10 = lVar.c(obj);
            if (c10 != null) {
                lVar.e(c10, true);
            }
            return c10 != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return l.this.f21035u;
        }
    }

    /* loaded from: classes.dex */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: s */
        public e<K, V> f21041s;

        /* renamed from: t */
        public e<K, V> f21042t = null;

        /* renamed from: u */
        public int f21043u;

        public d() {
            l.this = r2;
            this.f21041s = r2.f21037w.f21048v;
            this.f21043u = r2.f21036v;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.f21041s;
            l lVar = l.this;
            if (eVar != lVar.f21037w) {
                if (lVar.f21036v != this.f21043u) {
                    throw new ConcurrentModificationException();
                }
                this.f21041s = eVar.f21048v;
                this.f21042t = eVar;
                return eVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f21041s != l.this.f21037w;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f21042t;
            if (eVar != null) {
                l.this.e(eVar, true);
                this.f21042t = null;
                this.f21043u = l.this.f21036v;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes.dex */
    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: s */
        public e<K, V> f21045s;

        /* renamed from: t */
        public e<K, V> f21046t;

        /* renamed from: u */
        public e<K, V> f21047u;

        /* renamed from: v */
        public e<K, V> f21048v;

        /* renamed from: w */
        public e<K, V> f21049w;

        /* renamed from: x */
        public final K f21050x;
        public V y;

        /* renamed from: z */
        public int f21051z;

        public e() {
            this.f21050x = null;
            this.f21049w = this;
            this.f21048v = this;
        }

        public e(e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f21045s = eVar;
            this.f21050x = k10;
            this.f21051z = 1;
            this.f21048v = eVar2;
            this.f21049w = eVar3;
            eVar3.f21048v = this;
            eVar2.f21049w = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.f21050x;
                if (k10 == null) {
                    if (entry.getKey() != null) {
                        return false;
                    }
                } else if (!k10.equals(entry.getKey())) {
                    return false;
                }
                V v10 = this.y;
                Object value = entry.getValue();
                if (v10 == null) {
                    if (value != null) {
                        return false;
                    }
                } else if (!v10.equals(value)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f21050x;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.y;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k10 = this.f21050x;
            int i10 = 0;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.y;
            if (v10 != null) {
                i10 = v10.hashCode();
            }
            return hashCode ^ i10;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            V v11 = this.y;
            this.y = v10;
            return v11;
        }

        public final String toString() {
            return this.f21050x + "=" + this.y;
        }
    }

    public l() {
        Comparator<Comparable> comparator = f21032z;
        this.f21033s = comparator;
    }

    public final e<K, V> a(K k10, boolean z10) {
        int i10;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f21033s;
        e<K, V> eVar2 = this.f21034t;
        if (eVar2 != null) {
            Comparable comparable = comparator == f21032z ? (Comparable) k10 : null;
            while (true) {
                Object obj = (K) eVar2.f21050x;
                i10 = comparable != null ? comparable.compareTo(obj) : comparator.compare(k10, obj);
                if (i10 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i10 < 0 ? eVar2.f21046t : eVar2.f21047u;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i10 = 0;
        }
        if (!z10) {
            return null;
        }
        e<K, V> eVar4 = this.f21037w;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k10, eVar4, eVar4.f21049w);
            if (i10 < 0) {
                eVar2.f21046t = eVar;
            } else {
                eVar2.f21047u = eVar;
            }
            d(eVar2, true);
        } else if (comparator == f21032z && !(k10 instanceof Comparable)) {
            throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
        } else {
            eVar = new e<>(eVar2, k10, eVar4, eVar4.f21049w);
            this.f21034t = eVar;
        }
        this.f21035u++;
        this.f21036v++;
        return eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
        if ((r3 == r5 || (r3 != null && r3.equals(r5))) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final z7.l.e<K, V> b(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            z7.l$e r0 = r4.c(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L23
            V r3 = r0.y
            java.lang.Object r5 = r5.getValue()
            if (r3 == r5) goto L1f
            if (r3 == 0) goto L1d
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L1d
            goto L1f
        L1d:
            r5 = r2
            goto L20
        L1f:
            r5 = r1
        L20:
            if (r5 == 0) goto L23
            goto L24
        L23:
            r1 = r2
        L24:
            if (r1 == 0) goto L27
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.l.b(java.util.Map$Entry):z7.l$e");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e<K, V> c(Object obj) {
        if (obj != 0) {
            try {
                return a(obj, false);
            } catch (ClassCastException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f21034t = null;
        this.f21035u = 0;
        this.f21036v++;
        e<K, V> eVar = this.f21037w;
        eVar.f21049w = eVar;
        eVar.f21048v = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return c(obj) != null;
    }

    public final void d(e<K, V> eVar, boolean z10) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f21046t;
            e<K, V> eVar3 = eVar.f21047u;
            int i10 = 0;
            int i11 = eVar2 != null ? eVar2.f21051z : 0;
            int i12 = eVar3 != null ? eVar3.f21051z : 0;
            int i13 = i11 - i12;
            if (i13 == -2) {
                e<K, V> eVar4 = eVar3.f21046t;
                e<K, V> eVar5 = eVar3.f21047u;
                int i14 = eVar5 != null ? eVar5.f21051z : 0;
                if (eVar4 != null) {
                    i10 = eVar4.f21051z;
                }
                int i15 = i10 - i14;
                if (i15 != -1 && (i15 != 0 || z10)) {
                    h(eVar3);
                }
                g(eVar);
                if (z10) {
                    return;
                }
            } else if (i13 == 2) {
                e<K, V> eVar6 = eVar2.f21046t;
                e<K, V> eVar7 = eVar2.f21047u;
                int i16 = eVar7 != null ? eVar7.f21051z : 0;
                if (eVar6 != null) {
                    i10 = eVar6.f21051z;
                }
                int i17 = i10 - i16;
                if (i17 != 1 && (i17 != 0 || z10)) {
                    g(eVar2);
                }
                h(eVar);
                if (z10) {
                    return;
                }
            } else if (i13 == 0) {
                eVar.f21051z = i11 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f21051z = Math.max(i11, i12) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f21045s;
        }
    }

    public final void e(e<K, V> eVar, boolean z10) {
        int i10;
        if (z10) {
            e<K, V> eVar2 = eVar.f21049w;
            eVar2.f21048v = eVar.f21048v;
            eVar.f21048v.f21049w = eVar2;
        }
        e<K, V> eVar3 = eVar.f21046t;
        e<K, V> eVar4 = eVar.f21047u;
        e<K, V> eVar5 = eVar.f21045s;
        int i11 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                f(eVar, eVar3);
                eVar.f21046t = null;
            } else if (eVar4 != null) {
                f(eVar, eVar4);
                eVar.f21047u = null;
            } else {
                f(eVar, null);
            }
            d(eVar5, false);
            this.f21035u--;
            this.f21036v++;
            return;
        }
        if (eVar3.f21051z > eVar4.f21051z) {
            while (true) {
                e<K, V> eVar6 = eVar3.f21047u;
                if (eVar6 == null) {
                    break;
                }
                eVar3 = eVar6;
            }
        } else {
            while (true) {
                e<K, V> eVar7 = eVar4.f21046t;
                if (eVar7 == null) {
                    break;
                }
                eVar4 = eVar7;
            }
            eVar3 = eVar4;
        }
        e(eVar3, false);
        e<K, V> eVar8 = eVar.f21046t;
        if (eVar8 != null) {
            i10 = eVar8.f21051z;
            eVar3.f21046t = eVar8;
            eVar8.f21045s = eVar3;
            eVar.f21046t = null;
        } else {
            i10 = 0;
        }
        e<K, V> eVar9 = eVar.f21047u;
        if (eVar9 != null) {
            i11 = eVar9.f21051z;
            eVar3.f21047u = eVar9;
            eVar9.f21045s = eVar3;
            eVar.f21047u = null;
        }
        eVar3.f21051z = Math.max(i10, i11) + 1;
        f(eVar, eVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        l<K, V>.b bVar = this.f21038x;
        if (bVar != null) {
            return bVar;
        }
        l<K, V>.b bVar2 = new b();
        this.f21038x = bVar2;
        return bVar2;
    }

    public final void f(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f21045s;
        eVar.f21045s = null;
        if (eVar2 != null) {
            eVar2.f21045s = eVar3;
        }
        if (eVar3 == null) {
            this.f21034t = eVar2;
        } else if (eVar3.f21046t == eVar) {
            eVar3.f21046t = eVar2;
        } else {
            eVar3.f21047u = eVar2;
        }
    }

    public final void g(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f21046t;
        e<K, V> eVar3 = eVar.f21047u;
        e<K, V> eVar4 = eVar3.f21046t;
        e<K, V> eVar5 = eVar3.f21047u;
        eVar.f21047u = eVar4;
        if (eVar4 != null) {
            eVar4.f21045s = eVar;
        }
        f(eVar, eVar3);
        eVar3.f21046t = eVar;
        eVar.f21045s = eVar3;
        int i10 = 0;
        int max = Math.max(eVar2 != null ? eVar2.f21051z : 0, eVar4 != null ? eVar4.f21051z : 0) + 1;
        eVar.f21051z = max;
        if (eVar5 != null) {
            i10 = eVar5.f21051z;
        }
        eVar3.f21051z = Math.max(max, i10) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        e<K, V> c10 = c(obj);
        if (c10 != null) {
            return c10.y;
        }
        return null;
    }

    public final void h(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f21046t;
        e<K, V> eVar3 = eVar.f21047u;
        e<K, V> eVar4 = eVar2.f21046t;
        e<K, V> eVar5 = eVar2.f21047u;
        eVar.f21046t = eVar5;
        if (eVar5 != null) {
            eVar5.f21045s = eVar;
        }
        f(eVar, eVar2);
        eVar2.f21047u = eVar;
        eVar.f21045s = eVar2;
        int i10 = 0;
        int max = Math.max(eVar3 != null ? eVar3.f21051z : 0, eVar5 != null ? eVar5.f21051z : 0) + 1;
        eVar.f21051z = max;
        if (eVar4 != null) {
            i10 = eVar4.f21051z;
        }
        eVar2.f21051z = Math.max(max, i10) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        l<K, V>.c cVar = this.y;
        if (cVar != null) {
            return cVar;
        }
        l<K, V>.c cVar2 = new c();
        this.y = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        Objects.requireNonNull(k10, "key == null");
        e<K, V> a10 = a(k10, true);
        V v11 = a10.y;
        a10.y = v10;
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        e<K, V> c10 = c(obj);
        if (c10 != null) {
            e(c10, true);
        }
        if (c10 != null) {
            return c10.y;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f21035u;
    }
}
