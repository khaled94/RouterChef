package d4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class r0 implements ServiceConnection {

    /* renamed from: a */
    public final int f3914a;

    /* renamed from: b */
    public final /* synthetic */ b f3915b;

    public r0(b bVar, int i10) {
        this.f3915b = bVar;
        this.f3914a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b bVar = this.f3915b;
        if (iBinder == null) {
            b.A(bVar);
            return;
        }
        synchronized (bVar.f3812h) {
            b bVar2 = this.f3915b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            bVar2.f3813i = (queryLocalInterface == null || !(queryLocalInterface instanceof j)) ? new i0(iBinder) : (j) queryLocalInterface;
        }
        b bVar3 = this.f3915b;
        int i10 = this.f3914a;
        o0 o0Var = bVar3.f3810f;
        o0Var.sendMessage(o0Var.obtainMessage(7, i10, -1, new t0(bVar3, 0)));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        b bVar;
        synchronized (this.f3915b.f3812h) {
            bVar = this.f3915b;
            bVar.f3813i = null;
        }
        o0 o0Var = bVar.f3810f;
        o0Var.sendMessage(o0Var.obtainMessage(6, this.f3914a, 1));
    }
}
