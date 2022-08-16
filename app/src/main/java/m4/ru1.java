package m4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class ru1 extends vw1 {

    /* renamed from: s */
    public final /* synthetic */ tu1 f13438s;

    public ru1(tu1 tu1Var) {
        this.f13438s = tu1Var;
    }

    @Override // m4.vw1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        Set entrySet = this.f13438s.f14168u.entrySet();
        Objects.requireNonNull(entrySet);
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return new su1(this.f13438s);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        gv1 gv1Var = this.f13438s.f14169v;
        Object key = entry.getKey();
        Map<K, Collection<V>> map = gv1Var.f9054v;
        Objects.requireNonNull(map);
        try {
            obj2 = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        gv1Var.f9055w -= size;
        return true;
    }
}
