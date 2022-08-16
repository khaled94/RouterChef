package s4;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class x8<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int y = 0;

    /* renamed from: s */
    public final int f18187s;

    /* renamed from: v */
    public boolean f18190v;

    /* renamed from: w */
    public volatile w8 f18191w;

    /* renamed from: t */
    public List<t8> f18188t = Collections.emptyList();

    /* renamed from: u */
    public Map<K, V> f18189u = Collections.emptyMap();

    /* renamed from: x */
    public Map<K, V> f18192x = Collections.emptyMap();

    public void a() {
        if (!this.f18190v) {
            this.f18189u = this.f18189u.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f18189u);
            this.f18192x = this.f18192x.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f18192x);
            this.f18190v = true;
        }
    }

    public final int b() {
        return this.f18188t.size();
    }

    /* renamed from: c */
    public final V put(K k10, V v10) {
        h();
        int e10 = e(k10);
        if (e10 >= 0) {
            return (V) this.f18188t.get(e10).setValue(v10);
        }
        h();
        if (this.f18188t.isEmpty() && !(this.f18188t instanceof ArrayList)) {
            this.f18188t = new ArrayList(this.f18187s);
        }
        int i10 = -(e10 + 1);
        if (i10 >= this.f18187s) {
            return g().put(k10, v10);
        }
        int size = this.f18188t.size();
        int i11 = this.f18187s;
        if (size == i11) {
            t8 remove = this.f18188t.remove(i11 - 1);
            g().put((K) remove.f18120s, (V) remove.f18121t);
        }
        this.f18188t.add(i10, new t8(this, k10, v10));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
        if (!this.f18188t.isEmpty()) {
            this.f18188t.clear();
        }
        if (!this.f18189u.isEmpty()) {
            this.f18189u.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f18189u.containsKey(comparable);
    }

    public final Map.Entry<K, V> d(int i10) {
        return this.f18188t.get(i10);
    }

    public final int e(K k10) {
        int size = this.f18188t.size() - 1;
        int i10 = 0;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f18188t.get(size).f18120s);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = k10.compareTo(this.f18188t.get(i11).f18120s);
            if (compareTo2 < 0) {
                size = i11 - 1;
            } else if (compareTo2 <= 0) {
                return i11;
            } else {
                i10 = i11 + 1;
            }
        }
        return -(i10 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f18191w == null) {
            this.f18191w = new w8(this);
        }
        return this.f18191w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8)) {
            return super.equals(obj);
        }
        x8 x8Var = (x8) obj;
        int size = size();
        if (size != x8Var.size()) {
            return false;
        }
        int b10 = b();
        if (b10 != x8Var.b()) {
            return ((AbstractSet) entrySet()).equals(x8Var.entrySet());
        }
        for (int i10 = 0; i10 < b10; i10++) {
            if (!d(i10).equals(x8Var.d(i10))) {
                return false;
            }
        }
        if (b10 == size) {
            return true;
        }
        return this.f18189u.equals(x8Var.f18189u);
    }

    public final V f(int i10) {
        h();
        V v10 = (V) this.f18188t.remove(i10).f18121t;
        if (!this.f18189u.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = g().entrySet().iterator();
            List<t8> list = this.f18188t;
            Map.Entry<K, V> next = it.next();
            list.add(new t8(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v10;
    }

    public final SortedMap<K, V> g() {
        h();
        if (this.f18189u.isEmpty() && !(this.f18189u instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f18189u = treeMap;
            this.f18192x = treeMap.descendingMap();
        }
        return (SortedMap) this.f18189u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int e10 = e(comparable);
        if (e10 >= 0) {
            return (V) this.f18188t.get(e10).f18121t;
        }
        return this.f18189u.get(comparable);
    }

    public final void h() {
        if (!this.f18190v) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int b10 = b();
        int i10 = 0;
        for (int i11 = 0; i11 < b10; i11++) {
            i10 += this.f18188t.get(i11).hashCode();
        }
        return this.f18189u.size() > 0 ? this.f18189u.hashCode() + i10 : i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int e10 = e(comparable);
        if (e10 >= 0) {
            return (V) f(e10);
        }
        if (!this.f18189u.isEmpty()) {
            return this.f18189u.remove(comparable);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f18189u.size() + this.f18188t.size();
    }
}
