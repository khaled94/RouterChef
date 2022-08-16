package da;

import java.util.Objects;
import r9.g0;

/* loaded from: classes.dex */
public final class k extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a0<?> a0Var) {
        super("HTTP " + a0Var.f4004a.f17375u + " " + a0Var.f4004a.f17376v);
        Objects.requireNonNull(a0Var, "response == null");
        g0 g0Var = a0Var.f4004a;
        int i10 = g0Var.f17375u;
        String str = g0Var.f17376v;
    }
}
