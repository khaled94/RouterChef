package s4;

import c1.f;
import g1.l;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class id extends h {

    /* renamed from: u */
    public final l f17932u;

    public id(l lVar) {
        super("internal.registerCallback");
        this.f17932u = lVar;
    }

    @Override // s4.h
    public final n a(a4 a4Var, List<n> list) {
        Object obj;
        f.m(this.f17900s, 3, list);
        a4Var.b(list.get(0)).h();
        n b10 = a4Var.b(list.get(1));
        if (b10 instanceof m) {
            n b11 = a4Var.b(list.get(2));
            if (!(b11 instanceof k)) {
                throw new IllegalArgumentException("Invalid callback params");
            }
            k kVar = (k) b11;
            if (kVar.d("type")) {
                String h10 = kVar.O("type").h();
                int e10 = kVar.d("priority") ? f.e(kVar.O("priority").f().doubleValue()) : 1000;
                l lVar = this.f17932u;
                m mVar = (m) b10;
                Objects.requireNonNull(lVar);
                if ("create".equals(h10)) {
                    obj = lVar.f4819t;
                } else if (!"edit".equals(h10)) {
                    String valueOf = String.valueOf(h10);
                    throw new IllegalStateException(valueOf.length() != 0 ? "Unknown callback type: ".concat(valueOf) : new String("Unknown callback type: "));
                } else {
                    obj = lVar.f4818s;
                }
                TreeMap treeMap = (TreeMap) obj;
                if (treeMap.containsKey(Integer.valueOf(e10))) {
                    e10 = ((Integer) treeMap.lastKey()).intValue() + 1;
                }
                treeMap.put(Integer.valueOf(e10), mVar);
                return n.f18009j;
            }
            throw new IllegalArgumentException("Undefined rule type");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
