package m4;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public class tu1 extends yw1 {

    /* renamed from: u */
    public final transient Map f14168u;

    /* renamed from: v */
    public final /* synthetic */ gv1 f14169v;

    public tu1(gv1 gv1Var, Map map) {
        this.f14169v = gv1Var;
        this.f14168u = map;
    }

    public final Map.Entry a(Map.Entry entry) {
        Object key = entry.getKey();
        cx1 cx1Var = (cx1) this.f14169v;
        Objects.requireNonNull(cx1Var);
        List list = (List) ((Collection) entry.getValue());
        return new cw1(key, list instanceof RandomAccess ? new zu1(cx1Var, key, list, null) : new fv1(cx1Var, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.f14168u;
        gv1 gv1Var = this.f14169v;
        if (map == gv1Var.f9054v) {
            gv1Var.m();
            return;
        }
        su1 su1Var = new su1(this);
        while (su1Var.hasNext()) {
            su1Var.next();
            su1Var.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        Map map = this.f14168u;
        Objects.requireNonNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        return this == obj || this.f14168u.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        Object obj2;
        Map map = this.f14168u;
        Objects.requireNonNull(map);
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        cx1 cx1Var = (cx1) this.f14169v;
        Objects.requireNonNull(cx1Var);
        List list = (List) collection;
        return list instanceof RandomAccess ? new zu1(cx1Var, obj, list, null) : new fv1(cx1Var, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f14168u.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set keySet() {
        gv1 gv1Var = this.f14169v;
        Set<K> set = gv1Var.f10205s;
        if (set == 0) {
            Set<K> d5 = gv1Var.d();
            gv1Var.f10205s = d5;
            return d5;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final /* bridge */ /* synthetic */ Object remove(@CheckForNull Object obj) {
        Collection collection = (Collection) this.f14168u.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection f10 = this.f14169v.f();
        f10.addAll(collection);
        this.f14169v.f9055w -= collection.size();
        collection.clear();
        return f10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f14168u.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f14168u.toString();
    }
}
