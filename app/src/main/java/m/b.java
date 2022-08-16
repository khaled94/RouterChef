package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: s */
    public c<K, V> f5833s;

    /* renamed from: t */
    public c<K, V> f5834t;

    /* renamed from: u */
    public WeakHashMap<f<K, V>, Boolean> f5835u = new WeakHashMap<>();

    /* renamed from: v */
    public int f5836v = 0;

    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // m.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f5840v;
        }

        @Override // m.b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f5839u;
        }
    }

    /* renamed from: m.b$b */
    /* loaded from: classes.dex */
    public static class C0092b<K, V> extends e<K, V> {
        public C0092b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // m.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f5839u;
        }

        @Override // m.b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f5840v;
        }
    }

    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: s */
        public final K f5837s;

        /* renamed from: t */
        public final V f5838t;

        /* renamed from: u */
        public c<K, V> f5839u;

        /* renamed from: v */
        public c<K, V> f5840v;

        public c(K k10, V v10) {
            this.f5837s = k10;
            this.f5838t = v10;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f5837s.equals(cVar.f5837s) && this.f5838t.equals(cVar.f5838t);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f5837s;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f5838t;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.f5837s.hashCode() ^ this.f5838t.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f5837s + "=" + this.f5838t;
        }
    }

    /* loaded from: classes.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: s */
        public c<K, V> f5841s;

        /* renamed from: t */
        public boolean f5842t = true;

        public d() {
            b.this = r1;
        }

        @Override // m.b.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f5841s;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f5840v;
                this.f5841s = cVar3;
                this.f5842t = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f5842t) {
                return b.this.f5833s != null;
            }
            c<K, V> cVar = this.f5841s;
            return (cVar == null || cVar.f5839u == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar;
            if (this.f5842t) {
                this.f5842t = false;
                cVar = b.this.f5833s;
            } else {
                c<K, V> cVar2 = this.f5841s;
                cVar = cVar2 != null ? cVar2.f5839u : null;
            }
            this.f5841s = cVar;
            return cVar;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: s */
        public c<K, V> f5844s;

        /* renamed from: t */
        public c<K, V> f5845t;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f5844s = cVar2;
            this.f5845t = cVar;
        }

        @Override // m.b.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.f5844s == cVar && cVar == this.f5845t) {
                this.f5845t = null;
                this.f5844s = null;
            }
            c<K, V> cVar3 = this.f5844s;
            if (cVar3 == cVar) {
                this.f5844s = b(cVar3);
            }
            c<K, V> cVar4 = this.f5845t;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.f5844s;
                if (cVar4 != cVar5 && cVar5 != null) {
                    cVar2 = c(cVar4);
                }
                this.f5845t = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f5845t != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar = this.f5845t;
            c<K, V> cVar2 = this.f5844s;
            this.f5845t = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    /* loaded from: classes.dex */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public c<K, V> d(K k10) {
        c<K, V> cVar = this.f5833s;
        while (cVar != null && !cVar.f5837s.equals(k10)) {
            cVar = cVar.f5839u;
        }
        return cVar;
    }

    public final b<K, V>.d e() {
        b<K, V>.d dVar = new d();
        this.f5835u.put(dVar, Boolean.FALSE);
        return dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r3.hasNext() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (((m.b.e) r7).hasNext() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof m.b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            m.b r7 = (m.b) r7
            int r1 = r6.f5836v
            int r3 = r7.f5836v
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            m.b$e r3 = (m.b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            m.b$e r4 = (m.b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            m.b$e r7 = (m.b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.b.equals(java.lang.Object):boolean");
    }

    public final c<K, V> g(K k10, V v10) {
        c<K, V> cVar = new c<>(k10, v10);
        this.f5836v++;
        c<K, V> cVar2 = this.f5834t;
        if (cVar2 == null) {
            this.f5833s = cVar;
        } else {
            cVar2.f5839u = cVar;
            cVar.f5840v = cVar2;
        }
        this.f5834t = cVar;
        return cVar;
    }

    public V h(K k10, V v10) {
        c<K, V> d5 = d(k10);
        if (d5 != null) {
            return d5.f5838t;
        }
        g(k10, v10);
        return null;
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i10 = 0;
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                i10 += ((Map.Entry) eVar.next()).hashCode();
            } else {
                return i10;
            }
        }
    }

    public V i(K k10) {
        c<K, V> d5 = d(k10);
        if (d5 == null) {
            return null;
        }
        this.f5836v--;
        if (!this.f5835u.isEmpty()) {
            for (f<K, V> fVar : this.f5835u.keySet()) {
                fVar.a(d5);
            }
        }
        c<K, V> cVar = d5.f5840v;
        c<K, V> cVar2 = d5.f5839u;
        if (cVar != null) {
            cVar.f5839u = cVar2;
        } else {
            this.f5833s = cVar2;
        }
        c<K, V> cVar3 = d5.f5839u;
        if (cVar3 != null) {
            cVar3.f5840v = cVar;
        } else {
            this.f5834t = cVar;
        }
        d5.f5839u = null;
        d5.f5840v = null;
        return d5.f5838t;
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f5833s, this.f5834t);
        this.f5835u.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                c10.append("]");
                return c10.toString();
            }
            c10.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                c10.append(", ");
            }
        }
    }
}
