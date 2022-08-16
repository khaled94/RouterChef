package w7;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: a */
    public final String f19933a;

    /* renamed from: b */
    public final c f19934b;

    public b(Set<d> set, c cVar) {
        this.f19933a = b(set);
        this.f19934b = cVar;
    }

    public static String b(Set<d> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<d> it = set.iterator();
        while (it.hasNext()) {
            d next = it.next();
            sb.append(next.a());
            sb.append('/');
            sb.append(next.b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // w7.g
    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        c cVar = this.f19934b;
        synchronized (cVar.f19936a) {
            unmodifiableSet = Collections.unmodifiableSet(cVar.f19936a);
        }
        if (unmodifiableSet.isEmpty()) {
            return this.f19933a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19933a);
        sb.append(' ');
        c cVar2 = this.f19934b;
        synchronized (cVar2.f19936a) {
            unmodifiableSet2 = Collections.unmodifiableSet(cVar2.f19936a);
        }
        sb.append(b(unmodifiableSet2));
        return sb.toString();
    }
}
