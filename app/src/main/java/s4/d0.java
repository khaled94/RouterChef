package s4;

import c1.f;
import java.util.List;

/* loaded from: classes.dex */
public final class d0 extends u {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    public d0() {
        this.f18127a.add(e0.ASSIGN);
        this.f18127a.add(e0.CONST);
        this.f18127a.add(e0.CREATE_ARRAY);
        this.f18127a.add(e0.CREATE_OBJECT);
        this.f18127a.add(e0.EXPRESSION_LIST);
        this.f18127a.add(e0.GET);
        this.f18127a.add(e0.GET_INDEX);
        this.f18127a.add(e0.GET_PROPERTY);
        this.f18127a.add(e0.NULL);
        this.f18127a.add(e0.SET_PROPERTY);
        this.f18127a.add(e0.TYPEOF);
        this.f18127a.add(e0.UNDEFINED);
        this.f18127a.add(e0.VAR);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.Map<java.lang.String, java.lang.Boolean>, java.util.HashMap] */
    @Override // s4.u
    public final n a(String str, a4 a4Var, List<n> list) {
        String str2;
        e0 e0Var = e0.ADD;
        int ordinal = f.j(str).ordinal();
        int i10 = 0;
        if (ordinal == 3) {
            e0 e0Var2 = e0.ASSIGN;
            f.m("ASSIGN", 2, list);
            n b10 = a4Var.b(list.get(0));
            if (!(b10 instanceof r)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", b10.getClass().getCanonicalName()));
            }
            if (!a4Var.g(b10.h())) {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", b10.h()));
            }
            n b11 = a4Var.b(list.get(1));
            a4Var.f(b10.h(), b11);
            return b11;
        } else if (ordinal == 14) {
            e0 e0Var3 = e0.CONST;
            f.n("CONST", 2, list);
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            for (int i11 = 0; i11 < list.size() - 1; i11 += 2) {
                n b12 = a4Var.b(list.get(i11));
                if (b12 instanceof r) {
                    String h10 = b12.h();
                    a4Var.e(h10, a4Var.b(list.get(i11 + 1)));
                    a4Var.f17713d.put(h10, Boolean.TRUE);
                } else {
                    throw new IllegalArgumentException(String.format("Expected string for const name. got %s", b12.getClass().getCanonicalName()));
                }
            }
            return n.f18009j;
        } else if (ordinal == 24) {
            e0 e0Var4 = e0.EXPRESSION_LIST;
            f.n("EXPRESSION_LIST", 1, list);
            n nVar = n.f18009j;
            while (i10 < list.size()) {
                nVar = a4Var.b(list.get(i10));
                if (nVar instanceof f) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i10++;
            }
            return nVar;
        } else if (ordinal == 33) {
            e0 e0Var5 = e0.GET;
            f.m("GET", 1, list);
            n b13 = a4Var.b(list.get(0));
            if (!(b13 instanceof r)) {
                throw new IllegalArgumentException(String.format("Expected string for get var. got %s", b13.getClass().getCanonicalName()));
            }
            return a4Var.d(b13.h());
        } else if (ordinal == 49) {
            e0 e0Var6 = e0.NULL;
            f.m("NULL", 0, list);
            return n.f18010k;
        } else if (ordinal == 58) {
            e0 e0Var7 = e0.SET_PROPERTY;
            f.m("SET_PROPERTY", 3, list);
            n b14 = a4Var.b(list.get(0));
            n b15 = a4Var.b(list.get(1));
            n b16 = a4Var.b(list.get(2));
            if (b14 == n.f18009j || b14 == n.f18010k) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", b15.h(), b14.h()));
            }
            if ((b14 instanceof d) && (b15 instanceof g)) {
                ((d) b14).u(b15.f().intValue(), b16);
            } else if (b14 instanceof j) {
                ((j) b14).k(b15.h(), b16);
            }
            return b16;
        } else if (ordinal == 17) {
            if (list.isEmpty()) {
                return new d();
            }
            d dVar = new d();
            for (n nVar2 : list) {
                n b17 = a4Var.b(nVar2);
                if (b17 instanceof f) {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
                dVar.u(i10, b17);
                i10++;
            }
            return dVar;
        } else if (ordinal == 18) {
            if (list.isEmpty()) {
                return new k();
            }
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            k kVar = new k();
            while (i10 < list.size() - 1) {
                n b18 = a4Var.b(list.get(i10));
                n b19 = a4Var.b(list.get(i10 + 1));
                if ((b18 instanceof f) || (b19 instanceof f)) {
                    throw new IllegalStateException("Failed to evaluate map entry");
                }
                kVar.k(b18.h(), b19);
                i10 += 2;
            }
            return kVar;
        } else if (ordinal == 35 || ordinal == 36) {
            e0 e0Var8 = e0.GET_PROPERTY;
            f.m("GET_PROPERTY", 2, list);
            n b20 = a4Var.b(list.get(0));
            n b21 = a4Var.b(list.get(1));
            if ((b20 instanceof d) && f.p(b21)) {
                return ((d) b20).o(b21.f().intValue());
            }
            if (b20 instanceof j) {
                return ((j) b20).O(b21.h());
            }
            if (b20 instanceof r) {
                if ("length".equals(b21.h())) {
                    return new g(Double.valueOf(b20.h().length()));
                }
                if (f.p(b21) && b21.f().doubleValue() < b20.h().length()) {
                    return new r(String.valueOf(b20.h().charAt(b21.f().intValue())));
                }
            }
            return n.f18009j;
        } else {
            switch (ordinal) {
                case 62:
                    e0 e0Var9 = e0.TYPEOF;
                    f.m("TYPEOF", 1, list);
                    n b22 = a4Var.b(list.get(0));
                    if (b22 instanceof s) {
                        str2 = "undefined";
                    } else if (b22 instanceof e) {
                        str2 = "boolean";
                    } else if (b22 instanceof g) {
                        str2 = "number";
                    } else if (b22 instanceof r) {
                        str2 = "string";
                    } else if (b22 instanceof m) {
                        str2 = "function";
                    } else if ((b22 instanceof o) || (b22 instanceof f)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", b22));
                    } else {
                        str2 = "object";
                    }
                    return new r(str2);
                case 63:
                    e0 e0Var10 = e0.UNDEFINED;
                    f.m("UNDEFINED", 0, list);
                    return n.f18009j;
                case 64:
                    e0 e0Var11 = e0.VAR;
                    f.n("VAR", 1, list);
                    for (n nVar3 : list) {
                        n b23 = a4Var.b(nVar3);
                        if (!(b23 instanceof r)) {
                            throw new IllegalArgumentException(String.format("Expected string for var name. got %s", b23.getClass().getCanonicalName()));
                        }
                        a4Var.e(b23.h(), n.f18009j);
                    }
                    return n.f18009j;
                default:
                    b(str);
                    throw null;
            }
        }
    }
}
