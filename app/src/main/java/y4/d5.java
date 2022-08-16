package y4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import d4.b;
import d4.m;
import g4.a;
import m4.k8;
import m4.pj;
import m4.r3;
import n3.s;
import o4.f;

/* loaded from: classes.dex */
public final class d5 implements ServiceConnection, b.a, b.AbstractC0056b {

    /* renamed from: a */
    public volatile boolean f20359a;

    /* renamed from: b */
    public volatile o1 f20360b;

    /* renamed from: c */
    public final /* synthetic */ e5 f20361c;

    public d5(e5 e5Var) {
        this.f20361c = e5Var;
    }

    @Override // d4.b.AbstractC0056b
    public final void c0(a4.b bVar) {
        m.d("MeasurementServiceConnection.onConnectionFailed");
        w2 w2Var = (w2) this.f20361c.f20505s;
        s1 s1Var = w2Var.A;
        s1 s1Var2 = (s1Var == null || !s1Var.m()) ? null : w2Var.A;
        if (s1Var2 != null) {
            s1Var2.A.b("Service connection failed", bVar);
        }
        synchronized (this) {
            this.f20359a = false;
            this.f20360b = null;
        }
        ((w2) this.f20361c.f20505s).B().q(new s(this, 6));
    }

    @Override // d4.b.a
    public final void e0() {
        m.d("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                m.h(this.f20360b);
                ((w2) this.f20361c.f20505s).B().q(new f(this, this.f20360b.v(), 2));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f20360b = null;
                this.f20359a = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        m.d("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f20359a = false;
                ((w2) this.f20361c.f20505s).C().f20710x.a("Service connected with null binder");
                return;
            }
            j1 j1Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    j1Var = queryLocalInterface instanceof j1 ? (j1) queryLocalInterface : new g1(iBinder);
                    ((w2) this.f20361c.f20505s).C().F.a("Bound to IMeasurementService interface");
                } else {
                    ((w2) this.f20361c.f20505s).C().f20710x.b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                ((w2) this.f20361c.f20505s).C().f20710x.a("Service connect failed to get IMeasurementService");
            }
            if (j1Var == null) {
                this.f20359a = false;
                try {
                    a b10 = a.b();
                    e5 e5Var = this.f20361c;
                    b10.c(((w2) e5Var.f20505s).f20786s, e5Var.f20388u);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                ((w2) this.f20361c.f20505s).B().q(new pj(this, j1Var));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        m.d("MeasurementServiceConnection.onServiceDisconnected");
        ((w2) this.f20361c.f20505s).C().E.a("Service disconnected");
        ((w2) this.f20361c.f20505s).B().q(new r3(this, componentName, 2));
    }

    @Override // d4.b.a
    public final void w(int i10) {
        m.d("MeasurementServiceConnection.onConnectionSuspended");
        ((w2) this.f20361c.f20505s).C().E.a("Service connection suspended");
        ((w2) this.f20361c.f20505s).B().q(new k8(this, 1));
    }
}
