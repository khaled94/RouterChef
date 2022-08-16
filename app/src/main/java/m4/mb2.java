package m4;

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
public class mb2<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int y = 0;

    /* renamed from: s */
    public final int f11139s;

    /* renamed from: v */
    public boolean f11142v;

    /* renamed from: w */
    public volatile lb2 f11143w;

    /* renamed from: t */
    public List<jb2> f11140t = Collections.emptyList();

    /* renamed from: u */
    public Map<K, V> f11141u = Collections.emptyMap();

    /* renamed from: x */
    public Map<K, V> f11144x = Collections.emptyMap();

    public void a() {
        if (!this.f11142v) {
            this.f11141u = this.f11141u.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f11141u);
            this.f11144x = this.f11144x.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f11144x);
            this.f11142v = true;
        }
    }

    public final int b() {
        return this.f11140t.size();
    }

    /* renamed from: c */
    public final V put(K k10, V v10) {
        h();
        int e10 = e(k10);
        if (e10 >= 0) {
            return (V) this.f11140t.get(e10).setValue(v10);
        }
        h();
        if (this.f11140t.isEmpty() && !(this.f11140t instanceof ArrayList)) {
            this.f11140t = new ArrayList(this.f11139s);
        }
        int i10 = -(e10 + 1);
        if (i10 >= this.f11139s) {
            return g().put(k10, v10);
        }
        int size = this.f11140t.size();
        int i11 = this.f11139s;
        if (size == i11) {
            jb2 remove = this.f11140t.remove(i11 - 1);
            g().put((K) remove.f9901s, (V) remove.f9902t);
        }
        this.f11140t.add(i10, new jb2(this, k10, v10));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
        if (!this.f11140t.isEmpty()) {
            this.f11140t.clear();
        }
        if (!this.f11141u.isEmpty()) {
            this.f11141u.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f11141u.containsKey(comparable);
    }

    public final Map.Entry<K, V> d(int i10) {
        return this.f11140t.get(i10);
    }

    public final int e(K k10) {
        int size = this.f11140t.size() - 1;
        int i10 = 0;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f11140t.get(size).f9901s);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = k10.compareTo(this.f11140t.get(i11).f9901s);
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
        if (this.f11143w == null) {
            this.f11143w = new lb2(this);
        }
        return this.f11143w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb2)) {
            return super.equals(obj);
        }
        mb2 mb2Var = (mb2) obj;
        int size = size();
        if (size != mb2Var.size()) {
            return false;
        }
        int b10 = b();
        if (b10 != mb2Var.b()) {
            return ((AbstractSet) entrySet()).equals(mb2Var.entrySet());
        }
        for (int i10 = 0; i10 < b10; i10++) {
            if (!d(i10).equals(mb2Var.d(i10))) {
                return false;
            }
        }
        if (b10 == size) {
            return true;
        }
        return this.f11141u.equals(mb2Var.f11141u);
    }

    public final V f(int i10) {
        h();
        V v10 = (V) this.f11140t.remove(i10).f9902t;
        if (!this.f11141u.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = g().entrySet().iterator();
            List<jb2> list = this.f11140t;
            Map.Entry<K, V> next = it.next();
            list.add(new jb2(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v10;
    }

    public final SortedMap<K, V> g() {
        h();
        if (this.f11141u.isEmpty() && !(this.f11141u instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f11141u = treeMap;
            this.f11144x = treeMap.descendingMap();
        }
        return (SortedMap) this.f11141u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int e10 = e(comparable);
        if (e10 >= 0) {
            return (V) this.f11140t.get(e10).f9902t;
        }
        return this.f11141u.get(comparable);
    }

    public final void h() {
        if (!this.f11142v) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int b10 = b();
        int i10 = 0;
        for (int i11 = 0; i11 < b10; i11++) {
            i10 += this.f11140t.get(i11).hashCode();
        }
        return this.f11141u.size() > 0 ? this.f11141u.hashCode() + i10 : i10;
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
        if (!this.f11141u.isEmpty()) {
            return this.f11141u.remove(comparable);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f11141u.size() + this.f11140t.size();
    }
}
