package m4;

import android.os.RemoteException;
import n3.g1;

/* loaded from: classes.dex */
public final /* synthetic */ class rc1 implements vo0 {

    /* renamed from: s */
    public final /* synthetic */ lc1 f13249s;

    /* renamed from: t */
    public final /* synthetic */ hz f13250t;

    public /* synthetic */ rc1(lc1 lc1Var, hz hzVar) {
        this.f13249s = lc1Var;
        this.f13250t = hzVar;
    }

    @Override // m4.vo0
    public final void d(cn cnVar) {
        lc1 lc1Var = this.f13249s;
        hz hzVar = this.f13250t;
        lc1Var.d(cnVar);
        if (hzVar != null) {
            try {
                hzVar.t(cnVar);
            } catch (RemoteException e10) {
                g1.l("#007 Could not call remote method.", e10);
            }
        }
        if (hzVar != null) {
            try {
                hzVar.E(cnVar.f7067s);
            } catch (RemoteException e11) {
                g1.l("#007 Could not call remote method.", e11);
            }
        }
    }
}
