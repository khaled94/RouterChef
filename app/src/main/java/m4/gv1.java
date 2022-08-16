package m4;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class gv1<K, V> extends jv1<K, V> implements Serializable {

    /* renamed from: v */
    public transient Map<K, Collection<V>> f9054v;

    /* renamed from: w */
    public transient int f9055w;

    public gv1(Map<K, Collection<V>> map) {
        if (map.isEmpty()) {
            this.f9054v = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // m4.jv1
    public final Iterator<V> a() {
        return new qu1(this);
    }

    @Override // m4.zw1
    public final int b() {
        return this.f9055w;
    }

    public abstract Collection<V> f();

    @Override // m4.zw1
    public final void m() {
        for (Collection<V> collection : this.f9054v.values()) {
            collection.clear();
        }
        this.f9054v.clear();
        this.f9055w = 0;
    }
}
