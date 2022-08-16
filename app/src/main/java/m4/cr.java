package m4;

import android.os.RemoteException;
import java.lang.ref.WeakReference;
import n3.g1;

/* loaded from: classes.dex */
public final class cr implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f7113s;

    /* renamed from: t */
    public final Object f7114t;

    public /* synthetic */ cr(Object obj, int i10) {
        this.f7113s = i10;
        this.f7114t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7113s) {
            case 0:
                Object obj = this.f7114t;
                if (((dr) obj).f7595s.f8041s == null) {
                    return;
                }
                try {
                    ((dr) obj).f7595s.f8041s.E(1);
                    return;
                } catch (RemoteException e10) {
                    g1.k("Could not notify onAdFailedToLoad event.", e10);
                    return;
                }
            case 1:
                ((vd0) this.f7114t).destroy();
                return;
            default:
                cq0 cq0Var = (cq0) ((WeakReference) this.f7114t).get();
                if (cq0Var == null) {
                    return;
                }
                cq0Var.M0(hu1.f9453t);
                return;
        }
    }

    public /* synthetic */ cr(cq0 cq0Var) {
        this.f7113s = 2;
        this.f7114t = new WeakReference(cq0Var);
    }
}
