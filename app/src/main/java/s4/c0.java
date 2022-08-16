package s4;

import java.util.List;

/* loaded from: classes.dex */
public final class c0 extends u {
    @Override // s4.u
    public final n a(String str, a4 a4Var, List<n> list) {
        if (str == null || str.isEmpty() || !a4Var.g(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        n d5 = a4Var.d(str);
        if (!(d5 instanceof h)) {
            throw new IllegalArgumentException(String.format("Function %s is not defined", str));
        }
        return ((h) d5).a(a4Var, list);
    }
}
