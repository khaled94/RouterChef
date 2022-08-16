package m4;

import android.os.Bundle;
import java.io.IOException;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class ig1 implements wy1, fk2, xh2 {

    /* renamed from: s */
    public final Object f9644s;

    /* renamed from: t */
    public Object f9645t;

    /* renamed from: u */
    public Object f9646u;

    /* renamed from: v */
    public final /* synthetic */ Object f9647v;

    public ig1(jj2 jj2Var, Object obj) {
        this.f9647v = jj2Var;
        this.f9645t = jj2Var.f7988c.a(0, null);
        this.f9646u = jj2Var.f7989d.a(0, null);
        this.f9644s = obj;
    }

    public /* synthetic */ ig1(lg1 lg1Var, String str, cc1 cc1Var, Bundle bundle) {
        this.f9644s = lg1Var;
        this.f9645t = str;
        this.f9646u = cc1Var;
        this.f9647v = bundle;
    }

    @Override // m4.fk2
    public final void B(int i10, uj2 uj2Var, nj2 nj2Var, w3 w3Var) {
        if (a(i10, uj2Var)) {
            ((ek2) this.f9645t).d(nj2Var, w3Var);
        }
    }

    public final boolean a(int i10, uj2 uj2Var) {
        uj2 uj2Var2;
        if (uj2Var != null) {
            uj2Var2 = ((jj2) this.f9647v).p(this.f9644s, uj2Var);
            if (uj2Var2 == null) {
                return false;
            }
        } else {
            uj2Var2 = null;
        }
        ek2 ek2Var = (ek2) this.f9645t;
        if (ek2Var.f7995a != i10 || !ls1.f(ek2Var.f7996b, uj2Var2)) {
            this.f9645t = ((jj2) this.f9647v).f7988c.a(i10, uj2Var2);
        }
        wh2 wh2Var = (wh2) this.f9646u;
        if (wh2Var.f15026a != i10 || !ls1.f(wh2Var.f15027b, uj2Var2)) {
            this.f9646u = ((jj2) this.f9647v).f7989d.a(i10, uj2Var2);
            return true;
        }
        return true;
    }

    @Override // m4.fk2
    public final void e(int i10, uj2 uj2Var, w3 w3Var) {
        if (a(i10, uj2Var)) {
            ((ek2) this.f9645t).b(w3Var);
        }
    }

    @Override // m4.fk2
    public final void r(int i10, uj2 uj2Var, nj2 nj2Var, w3 w3Var) {
        if (a(i10, uj2Var)) {
            ((ek2) this.f9645t).c(nj2Var, w3Var);
        }
    }

    @Override // m4.fk2
    public final void u(int i10, uj2 uj2Var, nj2 nj2Var, w3 w3Var) {
        if (a(i10, uj2Var)) {
            ((ek2) this.f9645t).f(nj2Var, w3Var);
        }
    }

    @Override // m4.fk2
    public final void v(int i10, uj2 uj2Var, nj2 nj2Var, w3 w3Var, IOException iOException, boolean z10) {
        if (a(i10, uj2Var)) {
            ((ek2) this.f9645t).e(nj2Var, w3Var, iOException, z10);
        }
    }

    @Override // m4.wy1
    public final tz1 zza() {
        lg1 lg1Var = (lg1) this.f9644s;
        String str = (String) this.f9645t;
        cc1 cc1Var = (cc1) this.f9646u;
        Bundle bundle = (Bundle) this.f9647v;
        Objects.requireNonNull(lg1Var);
        return lg1Var.b(str, Collections.singletonList(cc1Var.f6780d), bundle, cc1Var.f6778b, cc1Var.f6779c);
    }
}
