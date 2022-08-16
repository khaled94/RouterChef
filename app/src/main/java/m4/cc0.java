package m4;

import android.os.RemoteException;
import d4.m;
import java.util.Map;
import y4.e5;
import y4.j1;
import y4.k6;
import y4.w2;

/* loaded from: classes.dex */
public final /* synthetic */ class cc0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f6774s = 0;

    /* renamed from: t */
    public final /* synthetic */ Object f6775t;

    /* renamed from: u */
    public final /* synthetic */ Object f6776u;

    public /* synthetic */ cc0(fb0 fb0Var, Map map) {
        this.f6775t = fb0Var;
        this.f6776u = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6774s) {
            case 0:
                int i10 = dc0.O;
                ((fb0) this.f6775t).a("onGcacheInfoEvent", (Map) this.f6776u);
                return;
            default:
                e5 e5Var = (e5) this.f6776u;
                j1 j1Var = e5Var.f20389v;
                if (j1Var == null) {
                    ((w2) e5Var.f20505s).C().f20710x.a("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    m.h((k6) this.f6775t);
                    j1Var.A0((k6) this.f6775t);
                    ((e5) this.f6776u).r();
                    return;
                } catch (RemoteException e10) {
                    ((w2) ((e5) this.f6776u).f20505s).C().f20710x.b("Failed to send measurementEnabled to the service", e10);
                    return;
                }
        }
    }

    public cc0(e5 e5Var, k6 k6Var) {
        this.f6776u = e5Var;
        this.f6775t = k6Var;
    }
}
