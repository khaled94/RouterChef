package y4;

import android.os.RemoteException;
import d4.m;
import s4.v0;

/* loaded from: classes.dex */
public final class t4 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ k6 f20741s;

    /* renamed from: t */
    public final /* synthetic */ v0 f20742t;

    /* renamed from: u */
    public final /* synthetic */ e5 f20743u;

    public t4(e5 e5Var, k6 k6Var, v0 v0Var) {
        this.f20743u = e5Var;
        this.f20741s = k6Var;
        this.f20742t = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = null;
        try {
            try {
                if (!((w2) this.f20743u.f20505s).s().o().g()) {
                    ((w2) this.f20743u.f20505s).C().C.a("Analytics storage consent denied; will not get app instance id");
                    ((w2) this.f20743u.f20505s).u().t(null);
                    ((w2) this.f20743u.f20505s).s().f20470x.b(null);
                } else {
                    e5 e5Var = this.f20743u;
                    j1 j1Var = e5Var.f20389v;
                    if (j1Var == null) {
                        ((w2) e5Var.f20505s).C().f20710x.a("Failed to get app instance id");
                    } else {
                        m.h(this.f20741s);
                        str = j1Var.p2(this.f20741s);
                        if (str != null) {
                            ((w2) this.f20743u.f20505s).u().t(str);
                            ((w2) this.f20743u.f20505s).s().f20470x.b(str);
                        }
                        this.f20743u.r();
                    }
                }
            } catch (RemoteException e10) {
                ((w2) this.f20743u.f20505s).C().f20710x.b("Failed to get app instance id", e10);
            }
        } finally {
            ((w2) this.f20743u.f20505s).z().I(this.f20742t, null);
        }
    }
}
