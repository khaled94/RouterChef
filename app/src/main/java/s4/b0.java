package s4;

import c1.f;
import java.util.List;

/* loaded from: classes.dex */
public final class b0 extends u {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    public b0() {
        this.f18127a.add(e0.ADD);
        this.f18127a.add(e0.DIVIDE);
        this.f18127a.add(e0.MODULUS);
        this.f18127a.add(e0.MULTIPLY);
        this.f18127a.add(e0.NEGATE);
        this.f18127a.add(e0.POST_DECREMENT);
        this.f18127a.add(e0.POST_INCREMENT);
        this.f18127a.add(e0.PRE_DECREMENT);
        this.f18127a.add(e0.PRE_INCREMENT);
        this.f18127a.add(e0.SUBTRACT);
    }

    @Override // s4.u
    public final n a(String str, a4 a4Var, List<n> list) {
        e0 e0Var = e0.ADD;
        int ordinal = f.j(str).ordinal();
        if (ordinal == 0) {
            f.m("ADD", 2, list);
            n b10 = a4Var.b(list.get(0));
            n b11 = a4Var.b(list.get(1));
            if (!(b10 instanceof j) && !(b10 instanceof r) && !(b11 instanceof j) && !(b11 instanceof r)) {
                return new g(Double.valueOf(b11.f().doubleValue() + b10.f().doubleValue()));
            }
            String valueOf = String.valueOf(b10.h());
            String valueOf2 = String.valueOf(b11.h());
            return new r(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        } else if (ordinal == 21) {
            e0 e0Var2 = e0.DIVIDE;
            f.m("DIVIDE", 2, list);
            return new g(Double.valueOf(a4Var.b(list.get(0)).f().doubleValue() / a4Var.b(list.get(1)).f().doubleValue()));
        } else if (ordinal == 59) {
            e0 e0Var3 = e0.SUBTRACT;
            f.m("SUBTRACT", 2, list);
            n b12 = a4Var.b(list.get(0));
            Double valueOf3 = Double.valueOf(-a4Var.b(list.get(1)).f().doubleValue());
            if (valueOf3 == null) {
                valueOf3 = Double.valueOf(Double.NaN);
            }
            return new g(Double.valueOf(valueOf3.doubleValue() + b12.f().doubleValue()));
        } else if (ordinal == 52 || ordinal == 53) {
            f.m(str, 2, list);
            n b13 = a4Var.b(list.get(0));
            a4Var.b(list.get(1));
            return b13;
        } else if (ordinal == 55 || ordinal == 56) {
            f.m(str, 1, list);
            return a4Var.b(list.get(0));
        } else {
            switch (ordinal) {
                case 44:
                    e0 e0Var4 = e0.MODULUS;
                    f.m("MODULUS", 2, list);
                    return new g(Double.valueOf(a4Var.b(list.get(0)).f().doubleValue() % a4Var.b(list.get(1)).f().doubleValue()));
                case 45:
                    e0 e0Var5 = e0.MULTIPLY;
                    f.m("MULTIPLY", 2, list);
                    return new g(Double.valueOf(a4Var.b(list.get(0)).f().doubleValue() * a4Var.b(list.get(1)).f().doubleValue()));
                case 46:
                    e0 e0Var6 = e0.NEGATE;
                    f.m("NEGATE", 1, list);
                    return new g(Double.valueOf(-a4Var.b(list.get(0)).f().doubleValue()));
                default:
                    b(str);
                    throw null;
            }
        }
    }
}
