package m4;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class u10 extends kq {

    /* renamed from: s */
    public final Object f14240s = new Object();

    /* renamed from: t */
    public volatile pq f14241t;

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
        throw new RemoteException();
    }

    @Override // m4.lq
    public final float e() {
        throw new RemoteException();
    }

    @Override // m4.lq
    public final int f() {
        throw new RemoteException();
    }

    @Override // m4.lq
    public final pq h() {
        pq pqVar;
        synchronized (this.f14240s) {
            pqVar = this.f14241t;
        }
        return pqVar;
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
    public final void y2(pq pqVar) {
        synchronized (this.f14240s) {
            this.f14241t = pqVar;
        }
    }
}
