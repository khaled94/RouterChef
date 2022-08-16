package s4;

import c1.f;
import java.util.List;

/* loaded from: classes.dex */
public final class t extends u {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    public t() {
        this.f18127a.add(e0.BITWISE_AND);
        this.f18127a.add(e0.BITWISE_LEFT_SHIFT);
        this.f18127a.add(e0.BITWISE_NOT);
        this.f18127a.add(e0.BITWISE_OR);
        this.f18127a.add(e0.BITWISE_RIGHT_SHIFT);
        this.f18127a.add(e0.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f18127a.add(e0.BITWISE_XOR);
    }

    @Override // s4.u
    public final n a(String str, a4 a4Var, List<n> list) {
        e0 e0Var = e0.ADD;
        switch (f.j(str).ordinal()) {
            case 4:
                e0 e0Var2 = e0.BITWISE_AND;
                f.m("BITWISE_AND", 2, list);
                return new g(Double.valueOf(f.e(a4Var.b(list.get(0)).f().doubleValue()) & f.e(a4Var.b(list.get(1)).f().doubleValue())));
            case 5:
                e0 e0Var3 = e0.BITWISE_LEFT_SHIFT;
                f.m("BITWISE_LEFT_SHIFT", 2, list);
                return new g(Double.valueOf(f.e(a4Var.b(list.get(0)).f().doubleValue()) << ((int) (f.i(a4Var.b(list.get(1)).f().doubleValue()) & 31))));
            case 6:
                e0 e0Var4 = e0.BITWISE_NOT;
                f.m("BITWISE_NOT", 1, list);
                return new g(Double.valueOf(~f.e(a4Var.b(list.get(0)).f().doubleValue())));
            case 7:
                e0 e0Var5 = e0.BITWISE_OR;
                f.m("BITWISE_OR", 2, list);
                return new g(Double.valueOf(f.e(a4Var.b(list.get(0)).f().doubleValue()) | f.e(a4Var.b(list.get(1)).f().doubleValue())));
            case 8:
                e0 e0Var6 = e0.BITWISE_RIGHT_SHIFT;
                f.m("BITWISE_RIGHT_SHIFT", 2, list);
                return new g(Double.valueOf(f.e(a4Var.b(list.get(0)).f().doubleValue()) >> ((int) (f.i(a4Var.b(list.get(1)).f().doubleValue()) & 31))));
            case 9:
                e0 e0Var7 = e0.BITWISE_UNSIGNED_RIGHT_SHIFT;
                f.m("BITWISE_UNSIGNED_RIGHT_SHIFT", 2, list);
                return new g(Double.valueOf(f.i(a4Var.b(list.get(0)).f().doubleValue()) >>> ((int) (f.i(a4Var.b(list.get(1)).f().doubleValue()) & 31))));
            case 10:
                e0 e0Var8 = e0.BITWISE_XOR;
                f.m("BITWISE_XOR", 2, list);
                return new g(Double.valueOf(f.e(a4Var.b(list.get(0)).f().doubleValue()) ^ f.e(a4Var.b(list.get(1)).f().doubleValue())));
            default:
                b(str);
                throw null;
        }
    }
}
