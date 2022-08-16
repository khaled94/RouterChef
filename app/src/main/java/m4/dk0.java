package m4;

import android.app.Activity;
import android.os.RemoteException;
import d4.m;
import k4.a;
import k4.b;
import n3.g1;

/* loaded from: classes.dex */
public final class dk0 extends vi {

    /* renamed from: s */
    public final ck0 f7531s;

    /* renamed from: t */
    public final dp f7532t;

    /* renamed from: u */
    public final vj1 f7533u;

    /* renamed from: v */
    public boolean f7534v = false;

    public dk0(ck0 ck0Var, dp dpVar, vj1 vj1Var) {
        this.f7531s = ck0Var;
        this.f7532t = dpVar;
        this.f7533u = vj1Var;
    }

    @Override // m4.wi
    public final void D0(gq gqVar) {
        m.d("setOnPaidEventListener must be called on the main UI thread.");
        vj1 vj1Var = this.f7533u;
        if (vj1Var != null) {
            vj1Var.y.set(gqVar);
        }
    }

    @Override // m4.wi
    public final dp b() {
        return this.f7532t;
    }

    @Override // m4.wi
    public final iq d() {
        if (!((Boolean) jo.f10145d.f10148c.a(es.D4)).booleanValue()) {
            return null;
        }
        return this.f7531s.f6195f;
    }

    @Override // m4.wi
    public final void k2(zi ziVar) {
    }

    @Override // m4.wi
    public final void k3(boolean z10) {
        this.f7534v = z10;
    }

    @Override // m4.wi
    public final void s2(a aVar, bj bjVar) {
        try {
            this.f7533u.f14705v.set(bjVar);
            this.f7531s.c((Activity) b.e0(aVar), bjVar, this.f7534v);
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
    }
}
