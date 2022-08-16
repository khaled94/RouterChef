package m4;

import d.b;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
import m2.a;

/* loaded from: classes.dex */
public abstract class kw1<K, V> implements Map<K, V>, Serializable {
    @CheckForNull

    /* renamed from: s */
    public transient pw1<Map.Entry<K, V>> f10592s;
    @CheckForNull

    /* renamed from: t */
    public transient pw1<K> f10593t;
    @CheckForNull

    /* renamed from: u */
    public transient bw1<V> f10594u;

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> kw1<K, V> c(Map<? extends K, ? extends V> map) {
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        boolean z10 = entrySet instanceof Collection;
        jw1 jw1Var = new jw1(z10 ? entrySet.size() : 4);
        if (z10) {
            jw1Var.c(entrySet.size() + jw1Var.f10211b);
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            jw1Var.a(entry.getKey(), entry.getValue());
        }
        return jw1Var.b();
    }

    public abstract bw1<V> a();

    /* renamed from: b */
    public final bw1<V> values() {
        bw1<V> bw1Var = this.f10594u;
        if (bw1Var == null) {
            bw1<V> a10 = a();
            this.f10594u = a10;
            return a10;
        }
        return bw1Var;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    public abstract pw1<Map.Entry<K, V>> d();

    public abstract pw1<K> e();

    @Override // java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* renamed from: f */
    public final pw1<Map.Entry<K, V>> entrySet() {
        pw1<Map.Entry<K, V>> pw1Var = this.f10592s;
        if (pw1Var == null) {
            pw1<Map.Entry<K, V>> d5 = d();
            this.f10592s = d5;
            return d5;
        }
        return pw1Var;
    }

    @Override // java.util.Map
    @CheckForNull
    public abstract V get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    public final V getOrDefault(@CheckForNull Object obj, @CheckForNull V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return a.r(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        pw1<K> pw1Var = this.f10593t;
        if (pw1Var == null) {
            pw1<K> e10 = e();
            this.f10593t = e10;
            return e10;
        }
        return pw1Var;
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final V remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        b.c(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z10 = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z10) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z10 = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
