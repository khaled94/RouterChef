package m4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public abstract class jv1<K, V> implements zw1<K, V> {
    @CheckForNull

    /* renamed from: s */
    public transient Set<K> f10205s;
    @CheckForNull

    /* renamed from: t */
    public transient Collection<V> f10206t;
    @CheckForNull

    /* renamed from: u */
    public transient Map<K, Collection<V>> f10207u;

    public Iterator<V> a() {
        throw null;
    }

    public abstract Map<K, Collection<V>> c();

    public abstract Set<K> d();

    public boolean e(@CheckForNull Object obj) {
        for (Collection<V> collection : p().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zw1) {
            return p().equals(((zw1) obj).p());
        }
        return false;
    }

    public final int hashCode() {
        return p().hashCode();
    }

    @Override // m4.zw1
    public Map<K, Collection<V>> p() {
        Map<K, Collection<V>> map = this.f10207u;
        if (map == null) {
            Map<K, Collection<V>> c10 = c();
            this.f10207u = c10;
            return c10;
        }
        return map;
    }

    public final String toString() {
        return p().toString();
    }
}
