package y4;

import android.content.ServiceConnection;
import android.os.Bundle;
import s4.k0;

/* loaded from: classes.dex */
public final class h2 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ k0 f20481s;

    /* renamed from: t */
    public final /* synthetic */ i2 f20482t;

    public h2(i2 i2Var, k0 k0Var, ServiceConnection serviceConnection) {
        this.f20482t = i2Var;
        this.f20481s = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i2 i2Var = this.f20482t;
        j2 j2Var = i2Var.f20504b;
        String str = i2Var.f20503a;
        k0 k0Var = this.f20481s;
        j2Var.f20518a.B().g();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            if (k0Var.l0(bundle) == null) {
                j2Var.f20518a.C().f20710x.a("Install Referrer Service returned a null response");
            }
        } catch (Exception e10) {
            j2Var.f20518a.C().f20710x.b("Exception occurred while retrieving the Install Referrer", e10.getMessage());
        }
        j2Var.f20518a.B().g();
        w2.i();
        throw null;
    }
}
