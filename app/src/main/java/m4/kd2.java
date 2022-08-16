package m4;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class kd2<K, V, V2> implements nd2<Map<K, V2>> {

    /* renamed from: a */
    public final Map<K, vd2<V>> f10371a;

    public kd2(Map<K, vd2<V>> map) {
        this.f10371a = Collections.unmodifiableMap(map);
    }
}
