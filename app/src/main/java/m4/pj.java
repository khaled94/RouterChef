package m4;

import android.content.Context;
import c5.j;
import java.util.Objects;
import java.util.concurrent.Future;
import y4.d5;
import y4.e5;
import y4.j1;
import y4.w2;

/* loaded from: classes.dex */
public final /* synthetic */ class pj implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f12524s;

    /* renamed from: t */
    public final /* synthetic */ Object f12525t;

    /* renamed from: u */
    public final /* synthetic */ Object f12526u;

    public /* synthetic */ pj(Object obj, Object obj2, int i10) {
        this.f12524s = i10;
        this.f12525t = obj;
        this.f12526u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12524s) {
            case 0:
                Future future = (Future) this.f12526u;
                if (!((w90) this.f12525t).isCancelled()) {
                    return;
                }
                future.cancel(true);
                return;
            case 1:
                ((j) this.f12526u).b(nt1.a((Context) this.f12525t, "GLAS"));
                return;
            case 2:
                qg2 qg2Var = ((pg2) this.f12525t).f12510b;
                int i10 = ls1.f10971a;
                qg2Var.C((String) this.f12526u);
                return;
            default:
                synchronized (((d5) this.f12526u)) {
                    ((d5) this.f12526u).f20359a = false;
                    if (!((d5) this.f12526u).f20361c.m()) {
                        ((w2) ((d5) this.f12526u).f20361c.f20505s).C().F.a("Connected to service");
                        e5 e5Var = ((d5) this.f12526u).f20361c;
                        j1 j1Var = (j1) this.f12525t;
                        e5Var.g();
                        Objects.requireNonNull(j1Var, "null reference");
                        e5Var.f20389v = j1Var;
                        e5Var.r();
                        e5Var.q();
                    }
                }
                return;
        }
    }

    public pj(d5 d5Var, j1 j1Var) {
        this.f12524s = 3;
        this.f12526u = d5Var;
        this.f12525t = j1Var;
    }
}
