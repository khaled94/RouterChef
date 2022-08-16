package m4;

import android.util.Pair;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ue2 implements fk2, xh2 {

    /* renamed from: s */
    public final we2 f14392s;

    /* renamed from: t */
    public ek2 f14393t;

    /* renamed from: u */
    public wh2 f14394u;

    /* renamed from: v */
    public final /* synthetic */ ye2 f14395v;

    public ue2(ye2 ye2Var, we2 we2Var) {
        this.f14395v = ye2Var;
        this.f14393t = ye2Var.f15665e;
        this.f14394u = ye2Var.f15666f;
        this.f14392s = we2Var;
    }

    @Override // m4.fk2
    public final void B(int i10, uj2 uj2Var, nj2 nj2Var, w3 w3Var) {
        if (a(i10, uj2Var)) {
            this.f14393t.d(nj2Var, w3Var);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List<m4.uj2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List<m4.uj2>, java.util.ArrayList] */
    public final boolean a(int i10, uj2 uj2Var) {
        uj2 uj2Var2 = null;
        if (uj2Var != null) {
            we2 we2Var = this.f14392s;
            int i11 = 0;
            while (true) {
                if (i11 >= we2Var.f14949c.size()) {
                    break;
                } else if (((uj2) we2Var.f14949c.get(i11)).f8976d == uj2Var.f8976d) {
                    uj2Var2 = uj2Var.b(Pair.create(we2Var.f14948b, uj2Var.f8973a));
                    break;
                } else {
                    i11++;
                }
            }
            if (uj2Var2 == null) {
                return false;
            }
        }
        int i12 = i10 + this.f14392s.f14950d;
        ek2 ek2Var = this.f14393t;
        if (ek2Var.f7995a != i12 || !ls1.f(ek2Var.f7996b, uj2Var2)) {
            this.f14393t = this.f14395v.f15665e.a(i12, uj2Var2);
        }
        wh2 wh2Var = this.f14394u;
        if (wh2Var.f15026a != i12 || !ls1.f(wh2Var.f15027b, uj2Var2)) {
            this.f14394u = this.f14395v.f15666f.a(i12, uj2Var2);
            return true;
        }
        return true;
    }

    @Override // m4.fk2
    public final void e(int i10, uj2 uj2Var, w3 w3Var) {
        if (a(i10, uj2Var)) {
            this.f14393t.b(w3Var);
        }
    }

    @Override // m4.fk2
    public final void r(int i10, uj2 uj2Var, nj2 nj2Var, w3 w3Var) {
        if (a(i10, uj2Var)) {
            this.f14393t.c(nj2Var, w3Var);
        }
    }

    @Override // m4.fk2
    public final void u(int i10, uj2 uj2Var, nj2 nj2Var, w3 w3Var) {
        if (a(i10, uj2Var)) {
            this.f14393t.f(nj2Var, w3Var);
        }
    }

    @Override // m4.fk2
    public final void v(int i10, uj2 uj2Var, nj2 nj2Var, w3 w3Var, IOException iOException, boolean z10) {
        if (a(i10, uj2Var)) {
            this.f14393t.e(nj2Var, w3Var, iOException, z10);
        }
    }
}
