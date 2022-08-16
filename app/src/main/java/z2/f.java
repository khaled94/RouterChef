package z2;

import a3.c;
import a3.f;
import d3.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import q2.d;
import u8.a;

/* loaded from: classes.dex */
public final class f implements a {

    /* renamed from: a */
    public final a<d3.a> f20920a = b.a.f3798a;

    @Override // u8.a
    public final Object get() {
        d3.a aVar = this.f20920a.get();
        HashMap hashMap = new HashMap();
        d dVar = d.DEFAULT;
        f.a.AbstractC0002a a10 = f.a.a();
        a10.b(30000L);
        a10.c();
        hashMap.put(dVar, a10.a());
        d dVar2 = d.HIGHEST;
        f.a.AbstractC0002a a11 = f.a.a();
        a11.b(1000L);
        a11.c();
        hashMap.put(dVar2, a11.a());
        d dVar3 = d.VERY_LOW;
        f.a.AbstractC0002a a12 = f.a.a();
        a12.b(86400000L);
        a12.c();
        Set<f.b> unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(f.b.NETWORK_UNMETERED, f.b.DEVICE_IDLE)));
        c.b bVar = (c.b) a12;
        Objects.requireNonNull(unmodifiableSet, "Null flags");
        bVar.f44c = unmodifiableSet;
        hashMap.put(dVar3, bVar.a());
        Objects.requireNonNull(aVar, "missing required property: clock");
        if (hashMap.keySet().size() >= d.values().length) {
            new HashMap();
            return new a3.b(aVar, hashMap);
        }
        throw new IllegalStateException("Not all priorities have been configured");
    }
}
