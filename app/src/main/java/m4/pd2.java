package m4;

import java.util.LinkedHashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class pd2<K, V> extends l7 {
    public /* synthetic */ pd2(int i10) {
        super(i10);
    }

    public final pd2<K, V> d(K k10, vd2<V> vd2Var) {
        Objects.requireNonNull(vd2Var, "provider");
        ((LinkedHashMap) this.f10665t).put(k10, vd2Var);
        return this;
    }

    public final qd2<K, V> e() {
        return new qd2<>((LinkedHashMap) this.f10665t);
    }
}
