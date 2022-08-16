package m4;

import android.os.RemoteException;
import android.webkit.WebView;
import d4.m;
import java.util.Objects;
import y4.e5;
import y4.j1;
import y4.k6;
import y4.w2;

/* loaded from: classes.dex */
public final /* synthetic */ class rb0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f13239s;

    /* renamed from: t */
    public final Object f13240t;

    /* renamed from: u */
    public final /* synthetic */ Object f13241u;

    public /* synthetic */ rb0(Object obj, Object obj2, int i10) {
        this.f13239s = i10;
        this.f13240t = obj;
        this.f13241u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13239s) {
            case 0:
                String str = (String) this.f13241u;
                oa0 oa0Var = ((sb0) this.f13240t).f13581x;
                if (oa0Var == null) {
                    return;
                }
                ((ta0) oa0Var).d("ExoPlayerAdapter error", str);
                return;
            case 1:
                ((WebView) this.f13240t).destroy();
                return;
            case 2:
                eo2 eo2Var = (eo2) this.f13240t;
                o02 o02Var = (o02) this.f13241u;
                Objects.requireNonNull(eo2Var);
                synchronized (o02Var) {
                }
                fo2 fo2Var = eo2Var.f8030b;
                int i10 = ls1.f10971a;
                fo2Var.h(o02Var);
                return;
            default:
                e5 e5Var = (e5) this.f13241u;
                j1 j1Var = e5Var.f20389v;
                if (j1Var == null) {
                    ((w2) e5Var.f20505s).C().f20710x.a("Failed to reset data on the service: not connected to service");
                    return;
                }
                try {
                    m.h((k6) this.f13240t);
                    j1Var.x2((k6) this.f13240t);
                } catch (RemoteException e10) {
                    ((w2) ((e5) this.f13241u).f20505s).C().f20710x.b("Failed to reset data on the service: remote exception", e10);
                }
                ((e5) this.f13241u).r();
                return;
        }
    }

    public rb0(dr1 dr1Var) {
        this.f13239s = 1;
        this.f13241u = dr1Var;
        this.f13240t = dr1Var.f7612d;
    }

    public rb0(e5 e5Var, k6 k6Var) {
        this.f13239s = 3;
        this.f13241u = e5Var;
        this.f13240t = k6Var;
    }
}
