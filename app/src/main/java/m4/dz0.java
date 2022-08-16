package m4;

import android.os.RemoteException;
import f3.m;
import n3.g1;

/* loaded from: classes.dex */
public final class dz0 extends m.a {

    /* renamed from: a */
    public final ev0 f7670a;

    public dz0(ev0 ev0Var) {
        this.f7670a = ev0Var;
    }

    public static pq d(ev0 ev0Var) {
        lq k10 = ev0Var.k();
        if (k10 == null) {
            return null;
        }
        try {
            return k10.h();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // f3.m.a
    public final void a() {
        pq d5 = d(this.f7670a);
        if (d5 == null) {
            return;
        }
        try {
            d5.b();
        } catch (RemoteException e10) {
            g1.k("Unable to call onVideoEnd()", e10);
        }
    }

    @Override // f3.m.a
    public final void b() {
        pq d5 = d(this.f7670a);
        if (d5 == null) {
            return;
        }
        try {
            d5.e();
        } catch (RemoteException e10) {
            g1.k("Unable to call onVideoEnd()", e10);
        }
    }

    @Override // f3.m.a
    public final void c() {
        pq d5 = d(this.f7670a);
        if (d5 == null) {
            return;
        }
        try {
            d5.h();
        } catch (RemoteException e10) {
            g1.k("Unable to call onVideoEnd()", e10);
        }
    }
}
