package s4;

import c1.f;
import java.util.List;

/* loaded from: classes.dex */
public final class v extends u {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    public v() {
        this.f18127a.add(e0.EQUALS);
        this.f18127a.add(e0.GREATER_THAN);
        this.f18127a.add(e0.GREATER_THAN_EQUALS);
        this.f18127a.add(e0.IDENTITY_EQUALS);
        this.f18127a.add(e0.IDENTITY_NOT_EQUALS);
        this.f18127a.add(e0.LESS_THAN);
        this.f18127a.add(e0.LESS_THAN_EQUALS);
        this.f18127a.add(e0.NOT_EQUALS);
    }

    public static boolean c(n nVar, n nVar2) {
        if (nVar.getClass().equals(nVar2.getClass())) {
            if ((nVar instanceof s) || (nVar instanceof l)) {
                return true;
            }
            if (!(nVar instanceof g)) {
                return nVar instanceof r ? nVar.h().equals(nVar2.h()) : nVar instanceof e ? nVar.e().equals(nVar2.e()) : nVar == nVar2;
            } else if (!Double.isNaN(nVar.f().doubleValue()) && !Double.isNaN(nVar2.f().doubleValue())) {
                return nVar.f().equals(nVar2.f());
            } else {
                return false;
            }
        } else if (((nVar instanceof s) || (nVar instanceof l)) && ((nVar2 instanceof s) || (nVar2 instanceof l))) {
            return true;
        } else {
            boolean z10 = nVar instanceof g;
            if (z10 && (nVar2 instanceof r)) {
                return c(nVar, new g(nVar2.f()));
            }
            boolean z11 = nVar instanceof r;
            if ((!z11 || !(nVar2 instanceof g)) && !(nVar instanceof e)) {
                if (nVar2 instanceof e) {
                    return c(nVar, new g(nVar2.f()));
                }
                if ((z11 || z10) && (nVar2 instanceof j)) {
                    return c(nVar, new r(nVar2.h()));
                }
                if ((nVar instanceof j) && ((nVar2 instanceof r) || (nVar2 instanceof g))) {
                    return c(new r(nVar.h()), nVar2);
                }
                return false;
            }
            return c(new g(nVar.f()), nVar2);
        }
    }

    public static boolean d(n nVar, n nVar2) {
        if (nVar instanceof j) {
            nVar = new r(nVar.h());
        }
        if (nVar2 instanceof j) {
            nVar2 = new r(nVar2.h());
        }
        if ((nVar instanceof r) && (nVar2 instanceof r)) {
            return nVar.h().compareTo(nVar2.h()) < 0;
        }
        double doubleValue = nVar.f().doubleValue();
        double doubleValue2 = nVar2.f().doubleValue();
        return !Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && Double.compare(doubleValue, doubleValue2) < 0;
    }

    public static boolean e(n nVar, n nVar2) {
        if (nVar instanceof j) {
            nVar = new r(nVar.h());
        }
        if (nVar2 instanceof j) {
            nVar2 = new r(nVar2.h());
        }
        return (((nVar instanceof r) && (nVar2 instanceof r)) || (!Double.isNaN(nVar.f().doubleValue()) && !Double.isNaN(nVar2.f().doubleValue()))) && !d(nVar2, nVar);
    }

    @Override // s4.u
    public final n a(String str, a4 a4Var, List<n> list) {
        boolean z10;
        boolean z11;
        f.m(f.j(str).name(), 2, list);
        n b10 = a4Var.b(list.get(0));
        n b11 = a4Var.b(list.get(1));
        int ordinal = f.j(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                z11 = c(b10, b11);
            } else if (ordinal == 42) {
                z10 = d(b10, b11);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        z10 = d(b11, b10);
                        break;
                    case 38:
                        z10 = e(b11, b10);
                        break;
                    case 39:
                        z10 = f.q(b10, b11);
                        break;
                    case 40:
                        z11 = f.q(b10, b11);
                        break;
                    default:
                        b(str);
                        throw null;
                }
            } else {
                z10 = e(b10, b11);
            }
            z10 = !z11;
        } else {
            z10 = c(b10, b11);
        }
        return z10 ? n.f18014o : n.p;
    }
}
