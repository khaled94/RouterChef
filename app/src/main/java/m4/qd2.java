package m4;

import a6.d;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class qd2<K, V> extends kd2<K, V, V> {

    /* renamed from: b */
    public static final /* synthetic */ int f12805b = 0;

    static {
        od2.b(Collections.emptyMap());
    }

    public /* synthetic */ qd2(Map map) {
        super(map);
    }

    /* renamed from: b */
    public final Map<K, V> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(d.l(this.f10371a.size()));
        for (Map.Entry<K, vd2<V>> entry : this.f10371a.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().a());
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }
}
