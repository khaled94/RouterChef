package m4;

import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public class ww1<K, V> extends px1<K> {

    /* renamed from: s */
    public final Map<K, V> f15127s;

    public ww1(Map<K, V> map) {
        Objects.requireNonNull(map);
        this.f15127s = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.f15127s.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f15127s.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f15127s.size();
    }
}
