package m4;

import android.os.RemoteException;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class dv0 extends kq {

    /* renamed from: s */
    public final Object f7645s = new Object();
    @Nullable

    /* renamed from: t */
    public final lq f7646t;
    @Nullable

    /* renamed from: u */
    public final t10 f7647u;

    public dv0(@Nullable lq lqVar, @Nullable t10 t10Var) {
        this.f7646t = lqVar;
        this.f7647u = t10Var;
    }

    @Override // m4.lq
    public final void W1(boolean z10) {
        throw new RemoteException();
    }

    @Override // m4.lq
    public final float b() {
        throw new RemoteException();
    }

    @Override // m4.lq
    public final float d() {
        t10 t10Var = this.f7647u;
        if (t10Var != null) {
            return t10Var.e();
        }
        return 0.0f;
    }

    @Override // m4.lq
    public final float e() {
        t10 t10Var = this.f7647u;
        if (t10Var != null) {
            return t10Var.f();
        }
        return 0.0f;
    }

    @Override // m4.lq
    public final int f() {
        throw new RemoteException();
    }

    @Override // m4.lq
    public final pq h() {
        synchronized (this.f7645s) {
            lq lqVar = this.f7646t;
            if (lqVar != null) {
                return lqVar.h();
            }
            return null;
        }
    }

    @Override // m4.lq
    public final void j() {
        throw new RemoteException();
    }

    @Override // m4.lq
    public final boolean k() {
        throw new RemoteException();
    }

    @Override // m4.lq
    public final void l() {
        throw new RemoteException();
    }

    @Override // m4.lq
    public final boolean m() {
        throw new RemoteException();
    }

    @Override // m4.lq
    public final void n() {
        throw new RemoteException();
    }

    @Override // m4.lq
    public final boolean s() {
        throw new RemoteException();
    }

    @Override // m4.lq
    public final void y2(@Nullable pq pqVar) {
        synchronized (this.f7645s) {
            lq lqVar = this.f7646t;
            if (lqVar != null) {
                lqVar.y2(pqVar);
            }
        }
    }
}
