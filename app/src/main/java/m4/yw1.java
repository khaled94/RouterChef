package m4;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public abstract class yw1<K, V> extends AbstractMap<K, V> {
    @CheckForNull

    /* renamed from: s */
    public transient Set<Map.Entry<K, V>> f15916s;
    @CheckForNull

    /* renamed from: t */
    public transient Collection<V> f15917t;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f15916s;
        if (set == null) {
            ru1 ru1Var = new ru1((tu1) this);
            this.f15916s = ru1Var;
            return ru1Var;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.f15917t;
        if (collection == null) {
            xw1 xw1Var = new xw1(this);
            this.f15917t = xw1Var;
            return xw1Var;
        }
        return collection;
    }
}
