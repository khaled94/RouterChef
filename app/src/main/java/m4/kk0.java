package m4;

import android.os.RemoteException;
import k4.b;
import n3.g1;

/* loaded from: classes.dex */
public final /* synthetic */ class kk0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f10459s;

    /* renamed from: t */
    public final /* synthetic */ Object f10460t;

    public /* synthetic */ kk0(Object obj, int i10) {
        this.f10459s = i10;
        this.f10460t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10459s) {
            case 0:
                lk0 lk0Var = (lk0) this.f10460t;
                tv tvVar = lk0Var.f10886n.f11033d;
                if (tvVar == null) {
                    return;
                }
                try {
                    tvVar.r1(lk0Var.p.a(), new b(lk0Var.f10881i));
                    return;
                } catch (RemoteException e10) {
                    g1.h("RemoteException when notifyAdLoad is called", e10);
                    return;
                }
            default:
                ((sl1) this.f10460t).j();
                return;
        }
    }
}
