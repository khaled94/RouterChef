package m4;

import java.util.Set;

/* loaded from: classes.dex */
public final class uy1 extends x50 {
    @Override // m4.x50
    public final int a(vy1<?> vy1Var) {
        int i10;
        synchronized (vy1Var) {
            i10 = vy1Var.A - 1;
            vy1Var.A = i10;
        }
        return i10;
    }

    @Override // m4.x50
    public final void g(vy1 vy1Var, Set set) {
        synchronized (vy1Var) {
            if (vy1Var.f14797z == null) {
                vy1Var.f14797z = set;
            }
        }
    }
}
