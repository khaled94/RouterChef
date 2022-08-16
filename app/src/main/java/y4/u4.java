package y4;

import android.os.Bundle;
import android.os.RemoteException;
import d4.m;

/* loaded from: classes.dex */
public final class u4 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ k6 f20757s;

    /* renamed from: t */
    public final /* synthetic */ Bundle f20758t;

    /* renamed from: u */
    public final /* synthetic */ e5 f20759u;

    public u4(e5 e5Var, k6 k6Var, Bundle bundle) {
        this.f20759u = e5Var;
        this.f20757s = k6Var;
        this.f20758t = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e5 e5Var = this.f20759u;
        j1 j1Var = e5Var.f20389v;
        if (j1Var == null) {
            ((w2) e5Var.f20505s).C().f20710x.a("Failed to send default event parameters to service");
            return;
        }
        try {
            m.h(this.f20757s);
            j1Var.f3(this.f20758t, this.f20757s);
        } catch (RemoteException e10) {
            ((w2) this.f20759u.f20505s).C().f20710x.b("Failed to send default event parameters to service", e10);
        }
    }
}
