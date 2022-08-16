package r;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class f<K, V> {

    /* renamed from: a */
    public f<K, V>.b f17181a;

    /* renamed from: b */
    public f<K, V>.c f17182b;

    /* renamed from: c */
    public f<K, V>.e f17183c;

    /* loaded from: classes.dex */
    public final class a<T> implements Iterator<T> {

        /* renamed from: s */
        public final int f17184s;

        /* renamed from: t */
        public int f17185t;

        /* renamed from: u */
        public int f17186u;

        /* renamed from: v */
        public boolean f17187v = false;

        public a(int i10) {
            f.this = r2;
            this.f17184s = i10;
            this.f17185t = r2.d();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f17186u < this.f17185t;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (hasNext()) {
                T t10 = (T) f.this.b(this.f17186u, this.f17184s);
                this.f17186u++;
                this.f17187v = true;
                return t10;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (this.f17187v) {
                int i10 = this.f17186u - 1;
                this.f17186u = i10;
                this.f17185t--;
                this.f17187v = false;
                f.this.h(i10);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes.dex */
    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
            f.this = r1;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d5 = f.this.d();
            for (Map.Entry<K, V> entry : collection) {
                f.this.g(entry.getKey(), entry.getValue());
            }
            return d5 != f.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            f.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e10 = f.this.e(entry.getKey());
            if (e10 >= 0) {
                return l4.b.e(f.this.b(e10, 1), entry.getValue());
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return f.j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            int i10 = 0;
            for (int d5 = f.this.d() - 1; d5 >= 0; d5--) {
                Object b10 = f.this.b(d5, 0);
                Object b11 = f.this.b(d5, 1);
                i10 += (b10 == null ? 0 : b10.hashCode()) ^ (b11 == null ? 0 : b11.hashCode());
            }
            return i10;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return f.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return f.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    public final class c implements Set<K> {
        public c() {
            f.this = r1;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            f.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return f.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Map<K, V> c10 = f.this.c();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!c10.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return f.j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            int i10 = 0;
            for (int d5 = f.this.d() - 1; d5 >= 0; d5--) {
                Object b10 = f.this.b(d5, 0);
                i10 += b10 == null ? 0 : b10.hashCode();
            }
            return i10;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return f.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            int e10 = f.this.e(obj);
            if (e10 >= 0) {
                f.this.h(e10);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            Map<K, V> c10 = f.this.c();
            int size = c10.size();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                c10.remove(it.next());
            }
            return size != c10.size();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return f.k(f.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return f.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            f fVar = f.this;
            int d5 = fVar.d();
            Object[] objArr = new Object[d5];
            for (int i10 = 0; i10 < d5; i10++) {
                objArr[i10] = fVar.b(i10, 0);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) f.this.l(tArr, 0);
        }
    }

    /* loaded from: classes.dex */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: s */
        public int f17191s;

        /* renamed from: u */
        public boolean f17193u = false;

        /* renamed from: t */
        public int f17192t = -1;

        public d() {
            f.this = r2;
            this.f17191s = r2.d() - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (this.f17193u) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return l4.b.e(entry.getKey(), f.this.b(this.f17192t, 0)) && l4.b.e(entry.getValue(), f.this.b(this.f17192t, 1));
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (this.f17193u) {
                return (K) f.this.b(this.f17192t, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (this.f17193u) {
                return (V) f.this.b(this.f17192t, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f17192t < this.f17191s;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (this.f17193u) {
                int i10 = 0;
                Object b10 = f.this.b(this.f17192t, 0);
                Object b11 = f.this.b(this.f17192t, 1);
                int hashCode = b10 == null ? 0 : b10.hashCode();
                if (b11 != null) {
                    i10 = b11.hashCode();
                }
                return hashCode ^ i10;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (hasNext()) {
                this.f17192t++;
                this.f17193u = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (this.f17193u) {
                f.this.h(this.f17192t);
                this.f17192t--;
                this.f17191s--;
                this.f17193u = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            if (this.f17193u) {
                return (V) f.this.i(this.f17192t, v10);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* loaded from: classes.dex */
    public final class e implements Collection<V> {
        public e() {
            f.this = r1;
        }

        @Override // java.util.Collection
        public final boolean add(V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            f.this.a();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return f.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return f.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            int f10 = f.this.f(obj);
            if (f10 >= 0) {
                f.this.h(f10);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            int d5 = f.this.d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < d5) {
                if (collection.contains(f.this.b(i10, 1))) {
                    f.this.h(i10);
                    i10--;
                    d5--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            int d5 = f.this.d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < d5) {
                if (!collection.contains(f.this.b(i10, 1))) {
                    f.this.h(i10);
                    i10--;
                    d5--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public final int size() {
            return f.this.d();
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            f fVar = f.this;
            int d5 = fVar.d();
            Object[] objArr = new Object[d5];
            for (int i10 = 0; i10 < d5; i10++) {
                objArr[i10] = fVar.b(i10, 1);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) f.this.l(tArr, 1);
        }
    }

    public static <T> boolean j(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean k(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void a();

    public abstract Object b(int i10, int i11);

    public abstract Map<K, V> c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(K k10, V v10);

    public abstract void h(int i10);

    public abstract V i(int i10, V v10);

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T[] l(T[] tArr, int i10) {
        int d5 = d();
        if (tArr.length < d5) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), d5));
        }
        for (int i11 = 0; i11 < d5; i11++) {
            tArr[i11] = b(i11, i10);
        }
        if (tArr.length > d5) {
            tArr[d5] = null;
        }
        return tArr;
    }
}
