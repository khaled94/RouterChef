package s4;

import c1.f;
import java.util.Iterator;
import java.util.List;
import m4.ki;
import m4.l70;

/* loaded from: classes.dex */
public final class a0 extends u {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    public a0() {
        this.f18127a.add(e0.FOR_IN);
        this.f18127a.add(e0.FOR_IN_CONST);
        this.f18127a.add(e0.FOR_IN_LET);
        this.f18127a.add(e0.FOR_LET);
        this.f18127a.add(e0.FOR_OF);
        this.f18127a.add(e0.FOR_OF_CONST);
        this.f18127a.add(e0.FOR_OF_LET);
        this.f18127a.add(e0.WHILE);
    }

    public static n c(z zVar, Iterator<n> it, n nVar) {
        if (it != null) {
            while (it.hasNext()) {
                n c10 = zVar.b(it.next()).c((d) nVar);
                if (c10 instanceof f) {
                    f fVar = (f) c10;
                    if ("break".equals(fVar.f17855t)) {
                        return n.f18009j;
                    }
                    if ("return".equals(fVar.f17855t)) {
                        return fVar;
                    }
                }
            }
        }
        return n.f18009j;
    }

    public static n d(z zVar, n nVar, n nVar2) {
        return c(zVar, nVar.l(), nVar2);
    }

    public static n e(z zVar, n nVar, n nVar2) {
        if (nVar instanceof Iterable) {
            return c(zVar, ((Iterable) nVar).iterator(), nVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // s4.u
    public final n a(String str, a4 a4Var, List<n> list) {
        e0 e0Var = e0.ADD;
        int ordinal = f.j(str).ordinal();
        if (ordinal == 65) {
            e0 e0Var2 = e0.WHILE;
            f.m("WHILE", 4, list);
            n nVar = list.get(0);
            n nVar2 = list.get(1);
            n b10 = a4Var.b(list.get(3));
            if (a4Var.b(list.get(2)).e().booleanValue()) {
                n c10 = a4Var.c((d) b10);
                if (c10 instanceof f) {
                    f fVar = (f) c10;
                    if (!"break".equals(fVar.f17855t)) {
                        if ("return".equals(fVar.f17855t)) {
                            return fVar;
                        }
                    }
                    return n.f18009j;
                }
            }
            while (a4Var.b(nVar).e().booleanValue()) {
                n c11 = a4Var.c((d) b10);
                if (c11 instanceof f) {
                    f fVar2 = (f) c11;
                    if ("break".equals(fVar2.f17855t)) {
                        break;
                    } else if ("return".equals(fVar2.f17855t)) {
                        return fVar2;
                    }
                }
                a4Var.b(nVar2);
            }
            return n.f18009j;
        }
        switch (ordinal) {
            case 26:
                e0 e0Var3 = e0.FOR_IN;
                f.m("FOR_IN", 3, list);
                if (!(list.get(0) instanceof r)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                return d(new l70(a4Var, list.get(0).h()), a4Var.b(list.get(1)), a4Var.b(list.get(2)));
            case 27:
                e0 e0Var4 = e0.FOR_IN_CONST;
                f.m("FOR_IN_CONST", 3, list);
                if (!(list.get(0) instanceof r)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                return d(new ki(a4Var, list.get(0).h(), 2), a4Var.b(list.get(1)), a4Var.b(list.get(2)));
            case 28:
                e0 e0Var5 = e0.FOR_IN_LET;
                f.m("FOR_IN_LET", 3, list);
                if (!(list.get(0) instanceof r)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                return d(new h2.a0(a4Var, list.get(0).h()), a4Var.b(list.get(1)), a4Var.b(list.get(2)));
            case 29:
                e0 e0Var6 = e0.FOR_LET;
                f.m("FOR_LET", 4, list);
                n b11 = a4Var.b(list.get(0));
                if (!(b11 instanceof d)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                d dVar = (d) b11;
                n nVar3 = list.get(1);
                n nVar4 = list.get(2);
                n b12 = a4Var.b(list.get(3));
                a4 a10 = a4Var.a();
                for (int i10 = 0; i10 < dVar.m(); i10++) {
                    String h10 = dVar.o(i10).h();
                    a10.f(h10, a4Var.d(h10));
                }
                while (a4Var.b(nVar3).e().booleanValue()) {
                    n c12 = a4Var.c((d) b12);
                    if (c12 instanceof f) {
                        f fVar3 = (f) c12;
                        if ("break".equals(fVar3.f17855t)) {
                            return n.f18009j;
                        }
                        if ("return".equals(fVar3.f17855t)) {
                            return fVar3;
                        }
                    }
                    a4 a11 = a4Var.a();
                    for (int i11 = 0; i11 < dVar.m(); i11++) {
                        String h11 = dVar.o(i11).h();
                        a11.f(h11, a10.d(h11));
                    }
                    a11.b(nVar4);
                    a10 = a11;
                }
                return n.f18009j;
            case 30:
                e0 e0Var7 = e0.FOR_OF;
                f.m("FOR_OF", 3, list);
                if (!(list.get(0) instanceof r)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                return e(new l70(a4Var, list.get(0).h()), a4Var.b(list.get(1)), a4Var.b(list.get(2)));
            case 31:
                e0 e0Var8 = e0.FOR_OF_CONST;
                f.m("FOR_OF_CONST", 3, list);
                if (!(list.get(0) instanceof r)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                return e(new ki(a4Var, list.get(0).h(), 2), a4Var.b(list.get(1)), a4Var.b(list.get(2)));
            case 32:
                e0 e0Var9 = e0.FOR_OF_LET;
                f.m("FOR_OF_LET", 3, list);
                if (!(list.get(0) instanceof r)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                return e(new h2.a0(a4Var, list.get(0).h()), a4Var.b(list.get(1)), a4Var.b(list.get(2)));
            default:
                b(str);
                throw null;
        }
    }
}
