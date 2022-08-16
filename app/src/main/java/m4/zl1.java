package m4;

import android.os.RemoteException;
import n3.g1;

/* loaded from: classes.dex */
public final class zl1 extends xr1 {

    /* renamed from: a */
    public final /* synthetic */ gp f16274a;

    /* renamed from: b */
    public final /* synthetic */ am1 f16275b;

    public zl1(am1 am1Var, gp gpVar) {
        this.f16275b = am1Var;
        this.f16274a = gpVar;
    }

    @Override // m4.xr1
    public final void r() {
        if (this.f16275b.f6201v != null) {
            try {
                this.f16274a.b();
            } catch (RemoteException e10) {
                g1.l("#007 Could not call remote method.", e10);
            }
        }
    }
}
