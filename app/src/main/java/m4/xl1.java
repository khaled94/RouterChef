package m4;

import android.os.RemoteException;
import n3.g1;

/* loaded from: classes.dex */
public final class xl1 extends xr1 {

    /* renamed from: a */
    public final /* synthetic */ dq f15393a;

    /* renamed from: b */
    public final /* synthetic */ yl1 f15394b;

    public xl1(yl1 yl1Var, dq dqVar) {
        this.f15394b = yl1Var;
        this.f15393a = dqVar;
    }

    @Override // m4.xr1
    public final void r() {
        if (this.f15394b.f15836x != null) {
            try {
                this.f15393a.b();
            } catch (RemoteException e10) {
                g1.l("#007 Could not call remote method.", e10);
            }
        }
    }
}
