package n6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class m {

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final n6.b<?> f16643a;

        /* renamed from: b */
        public final Set<b> f16644b = new HashSet();

        /* renamed from: c */
        public final Set<b> f16645c = new HashSet();

        public b(n6.b<?> bVar) {
            this.f16643a = bVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<n6.m$b>] */
        public final boolean a() {
            return this.f16645c.isEmpty();
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final Class<?> f16646a;

        /* renamed from: b */
        public final boolean f16647b;

        public c(Class cls, boolean z10, a aVar) {
            this.f16646a = cls;
            this.f16647b = z10;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                return cVar.f16646a.equals(this.f16646a) && cVar.f16647b == this.f16647b;
            }
            return false;
        }

        public final int hashCode() {
            return ((this.f16646a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f16647b).hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.HashSet, java.util.Set<n6.m$b>] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.HashSet, java.util.Set<n6.m$b>] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashSet, java.util.Set<n6.m$b>] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.HashSet, java.util.Set<n6.m$b>] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.HashSet, java.util.Set<n6.m$b>] */
    public static void a(List<n6.b<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator<n6.b<?>> it = list.iterator();
        while (true) {
            int i10 = 0;
            if (it.hasNext()) {
                n6.b<?> next = it.next();
                b bVar = new b(next);
                for (Class<? super Object> cls : next.f16616a) {
                    boolean z10 = !next.b();
                    c cVar = new c(cls, z10, null);
                    if (!hashMap.containsKey(cVar)) {
                        hashMap.put(cVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(cVar);
                    if (!set2.isEmpty() && !z10) {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                    }
                    set2.add(bVar);
                }
            } else {
                for (Set<b> set3 : hashMap.values()) {
                    for (b bVar2 : set3) {
                        for (n nVar : bVar2.f16643a.f16617b) {
                            if ((nVar.f16650c == 0) && (set = (Set) hashMap.get(new c(nVar.f16648a, nVar.a(), null))) != null) {
                                for (b bVar3 : set) {
                                    bVar2.f16644b.add(bVar3);
                                    bVar3.f16645c.add(bVar2);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                for (Set set4 : hashMap.values()) {
                    hashSet.addAll(set4);
                }
                HashSet hashSet2 = new HashSet();
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b bVar4 = (b) it2.next();
                    if (bVar4.a()) {
                        hashSet2.add(bVar4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    b bVar5 = (b) hashSet2.iterator().next();
                    hashSet2.remove(bVar5);
                    i10++;
                    Iterator it3 = bVar5.f16644b.iterator();
                    while (it3.hasNext()) {
                        b bVar6 = (b) it3.next();
                        bVar6.f16645c.remove(bVar5);
                        if (bVar6.a()) {
                            hashSet2.add(bVar6);
                        }
                    }
                }
                if (i10 == list.size()) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    b bVar7 = (b) it4.next();
                    if (!bVar7.a() && !bVar7.f16644b.isEmpty()) {
                        arrayList.add(bVar7.f16643a);
                    }
                }
                throw new o(arrayList);
            }
        }
    }
}
