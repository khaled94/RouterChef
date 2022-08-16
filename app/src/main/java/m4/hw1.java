package m4;

import d.b;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class hw1<K, V> extends lw1<K, V> {
    public final hw1<K, V> a(K k10, V... vArr) {
        List asList = Arrays.asList(vArr);
        Collection<V> collection = this.f11038a.get(k10);
        Iterator it = asList.iterator();
        if (collection != null) {
            while (it.hasNext()) {
                V v10 = (V) it.next();
                b.l(k10, v10);
                collection.add(v10);
            }
        } else if (it.hasNext()) {
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                Object next = it.next();
                b.l(k10, next);
                arrayList.add(next);
            }
            this.f11038a.put(k10, arrayList);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final iw1<K, V> b() {
        Set<Map.Entry<K, Collection<V>>> entrySet = this.f11038a.entrySet();
        if (((AbstractCollection) entrySet).isEmpty()) {
            return yv1.f15912x;
        }
        ov1 ov1Var = (ov1) entrySet;
        jw1 jw1Var = new jw1(ov1Var.size());
        Iterator<Map.Entry> it = ov1Var.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Map.Entry next = it.next();
            Object key = next.getKey();
            gw1 q10 = gw1.q((Collection) next.getValue());
            if (!q10.isEmpty()) {
                jw1Var.a(key, q10);
                i10 += q10.size();
            }
        }
        return new iw1<>(jw1Var.b(), i10);
    }
}
