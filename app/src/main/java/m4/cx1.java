package m4;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes.dex */
public final class cx1<K, V> extends gv1<Object, Object> {

    /* renamed from: x */
    public final transient nu1<? extends List<V>> f7153x;

    public cx1(Map<K, Collection<V>> map, nu1<? extends List<V>> nu1Var) {
        super(map);
        this.f7153x = nu1Var;
    }

    @Override // m4.jv1
    public final Map<K, Collection<V>> c() {
        Map<K, Collection<V>> map = this.f9054v;
        return map instanceof NavigableMap ? new xu1(this, (NavigableMap) map) : map instanceof SortedMap ? new av1(this, (SortedMap) map) : new tu1(this, map);
    }

    @Override // m4.jv1
    public final Set<K> d() {
        Map<K, Collection<V>> map = this.f9054v;
        return map instanceof NavigableMap ? new yu1(this, (NavigableMap) map) : map instanceof SortedMap ? new bv1(this, (SortedMap) map) : new wu1(this, map);
    }

    @Override // m4.gv1
    public final /* bridge */ /* synthetic */ Collection<Object> f() {
        return this.f7153x.mo19zza();
    }
}
