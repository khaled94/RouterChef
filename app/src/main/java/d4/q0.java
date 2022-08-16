package d4;

import android.os.Bundle;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class q0 extends h0 {

    /* renamed from: s */
    public b f3910s;

    /* renamed from: t */
    public final int f3911t;

    public q0(b bVar, int i10) {
        this.f3910s = bVar;
        this.f3911t = i10;
    }

    public final void c0(int i10, IBinder iBinder, Bundle bundle) {
        m.i(this.f3910s, "onPostInitComplete can be called only once per call to getRemoteService");
        b bVar = this.f3910s;
        int i11 = this.f3911t;
        o0 o0Var = bVar.f3810f;
        o0Var.sendMessage(o0Var.obtainMessage(1, i11, -1, new s0(bVar, i10, iBinder, bundle)));
        this.f3910s = null;
    }
}
