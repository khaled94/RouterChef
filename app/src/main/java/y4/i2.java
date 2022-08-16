package y4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import s4.i0;
import s4.j0;
import s4.k0;

/* loaded from: classes.dex */
public final class i2 implements ServiceConnection {

    /* renamed from: a */
    public final String f20503a;

    /* renamed from: b */
    public final /* synthetic */ j2 f20504b;

    public i2(j2 j2Var, String str) {
        this.f20504b = j2Var;
        this.f20503a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                int i10 = j0.f17933s;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                k0 i0Var = queryLocalInterface instanceof k0 ? (k0) queryLocalInterface : new i0(iBinder);
                if (i0Var == null) {
                    this.f20504b.f20518a.C().A.a("Install Referrer Service implementation was not found");
                    return;
                }
                this.f20504b.f20518a.C().F.a("Install Referrer Service connected");
                this.f20504b.f20518a.B().q(new h2(this, i0Var, this));
                return;
            } catch (RuntimeException e10) {
                this.f20504b.f20518a.C().A.b("Exception occurred while calling Install Referrer API", e10);
                return;
            }
        }
        this.f20504b.f20518a.C().A.a("Install Referrer connection returned with null binder");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f20504b.f20518a.C().F.a("Install Referrer Service disconnected");
    }
}
