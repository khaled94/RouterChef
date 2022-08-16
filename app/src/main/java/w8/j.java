package w8;

import d.c;
import e9.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import v8.d;

/* loaded from: classes.dex */
public class j extends c {
    public static final Map m(Iterable iterable) {
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(c.c(collection.size()));
                n(iterable, linkedHashMap);
                return linkedHashMap;
            }
            d dVar = (d) ((List) iterable).get(0);
            f.e(dVar, "pair");
            Map singletonMap = Collections.singletonMap(dVar.f19829s, dVar.f19830t);
            f.d(singletonMap, "singletonMap(pair.first, pair.second)");
            return singletonMap;
        }
        return h.f19941s;
    }

    public static final Map n(Iterable iterable, Map map) {
        Iterator it = ((ArrayList) iterable).iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            map.put(dVar.f19829s, dVar.f19830t);
        }
        return map;
    }
}
