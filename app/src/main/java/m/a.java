package m;

import java.util.HashMap;
import m.b;

/* loaded from: classes.dex */
public final class a<K, V> extends b<K, V> {

    /* renamed from: w */
    public HashMap<K, b.c<K, V>> f5832w = new HashMap<>();

    public final boolean contains(K k10) {
        return this.f5832w.containsKey(k10);
    }

    @Override // m.b
    public final b.c<K, V> d(K k10) {
        return this.f5832w.get(k10);
    }

    @Override // m.b
    public final V h(K k10, V v10) {
        b.c<K, V> d5 = d(k10);
        if (d5 != null) {
            return d5.f5838t;
        }
        this.f5832w.put(k10, g(k10, v10));
        return null;
    }

    @Override // m.b
    public final V i(K k10) {
        V v10 = (V) super.i(k10);
        this.f5832w.remove(k10);
        return v10;
    }
}
