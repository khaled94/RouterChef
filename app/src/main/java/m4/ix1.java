package m4;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class ix1<K, V> extends pw1<Map.Entry<K, V>> {

    /* renamed from: v */
    public final transient kw1<K, V> f9762v;

    /* renamed from: w */
    public final transient Object[] f9763w;

    /* renamed from: x */
    public final transient int f9764x;

    public ix1(kw1 kw1Var, Object[] objArr, int i10) {
        this.f9762v = kw1Var;
        this.f9763w = objArr;
        this.f9764x = i10;
    }

    @Override // m4.bw1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f9762v.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // m4.bw1
    public final int d(Object[] objArr, int i10) {
        return h().d(objArr, i10);
    }

    @Override // m4.bw1
    public final sx1<Map.Entry<K, V>> i() {
        return h().listIterator(0);
    }

    @Override // m4.pw1, m4.bw1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return h().listIterator(0);
    }

    @Override // m4.pw1
    public final gw1<Map.Entry<K, V>> o() {
        return new hx1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f9764x;
    }
}
