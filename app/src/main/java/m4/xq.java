package m4;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import d4.m;
import k3.a;
import s4.v0;
import y4.e5;
import y4.j1;
import y4.k6;
import y4.t4;
import y4.w2;

/* loaded from: classes.dex */
public final /* synthetic */ class xq implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f15447s;

    /* renamed from: t */
    public final /* synthetic */ Object f15448t;

    /* renamed from: u */
    public final /* synthetic */ Object f15449u;

    public /* synthetic */ xq(Object obj, Object obj2, int i10) {
        this.f15447s = i10;
        this.f15449u = obj;
        this.f15448t = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15447s) {
            case 0:
                wq wqVar = ((yq) this.f15448t).f15887g;
                ((a) this.f15449u).a();
                return;
            case 1:
                e5 x10 = ((AppMeasurementDynamiteService) this.f15449u).f2969s.x();
                x10.g();
                x10.h();
                x10.s(new t4(x10, x10.p(false), (v0) this.f15448t));
                return;
            default:
                e5 e5Var = (e5) this.f15449u;
                j1 j1Var = e5Var.f20389v;
                if (j1Var == null) {
                    ((w2) e5Var.f20505s).C().f20710x.a("Discarding data. Failed to send app launch");
                    return;
                }
                try {
                    m.h((k6) this.f15448t);
                    j1Var.A3((k6) this.f15448t);
                    ((w2) ((e5) this.f15449u).f20505s).q().n();
                    ((e5) this.f15449u).k(j1Var, null, (k6) this.f15448t);
                    ((e5) this.f15449u).r();
                    return;
                } catch (RemoteException e10) {
                    ((w2) ((e5) this.f15449u).f20505s).C().f20710x.b("Failed to send app launch to the service", e10);
                    return;
                }
        }
    }
}
