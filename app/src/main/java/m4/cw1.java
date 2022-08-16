package m4;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class cw1<K, V> extends hv1<K, V> implements Serializable {

    /* renamed from: s */
    public final K f7148s;

    /* renamed from: t */
    public final V f7149t;

    public cw1(K k10, V v10) {
        this.f7148s = k10;
        this.f7149t = v10;
    }

    @Override // m4.hv1, java.util.Map.Entry
    public final K getKey() {
        return this.f7148s;
    }

    @Override // m4.hv1, java.util.Map.Entry
    public final V getValue() {
        return this.f7149t;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }
}
