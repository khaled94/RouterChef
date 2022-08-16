package s4;

import c1.f;
import java.util.List;

/* loaded from: classes.dex */
public final class y extends u {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<s4.e0>, java.util.ArrayList] */
    public y() {
        this.f18127a.add(e0.AND);
        this.f18127a.add(e0.NOT);
        this.f18127a.add(e0.OR);
    }

    @Override // s4.u
    public final n a(String str, a4 a4Var, List<n> list) {
        e0 e0Var = e0.ADD;
        int ordinal = f.j(str).ordinal();
        if (ordinal == 1) {
            e0 e0Var2 = e0.AND;
            f.m("AND", 2, list);
            n b10 = a4Var.b(list.get(0));
            if (!b10.e().booleanValue()) {
                return b10;
            }
        } else if (ordinal == 47) {
            e0 e0Var3 = e0.NOT;
            f.m("NOT", 1, list);
            return new e(Boolean.valueOf(!a4Var.b(list.get(0)).e().booleanValue()));
        } else if (ordinal != 50) {
            b(str);
            throw null;
        } else {
            e0 e0Var4 = e0.OR;
            f.m("OR", 2, list);
            n b11 = a4Var.b(list.get(0));
            if (b11.e().booleanValue()) {
                return b11;
            }
        }
        return a4Var.b(list.get(1));
    }
}
