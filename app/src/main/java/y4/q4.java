package y4;

import android.os.Bundle;
import android.os.RemoteException;
import d4.m;
import java.util.List;
import s4.v0;

/* loaded from: classes.dex */
public final class q4 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ String f20666s;

    /* renamed from: t */
    public final /* synthetic */ String f20667t;

    /* renamed from: u */
    public final /* synthetic */ k6 f20668u;

    /* renamed from: v */
    public final /* synthetic */ boolean f20669v;

    /* renamed from: w */
    public final /* synthetic */ v0 f20670w;

    /* renamed from: x */
    public final /* synthetic */ e5 f20671x;

    public q4(e5 e5Var, String str, String str2, k6 k6Var, boolean z10, v0 v0Var) {
        this.f20671x = e5Var;
        this.f20666s = str;
        this.f20667t = str2;
        this.f20668u = k6Var;
        this.f20669v = z10;
        this.f20670w = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th;
        Bundle bundle;
        RemoteException e10;
        Bundle bundle2 = new Bundle();
        try {
            e5 e5Var = this.f20671x;
            j1 j1Var = e5Var.f20389v;
            if (j1Var == null) {
                ((w2) e5Var.f20505s).C().f20710x.c("Failed to get user properties; not connected to service", this.f20666s, this.f20667t);
                ((w2) this.f20671x.f20505s).z().E(this.f20670w, bundle2);
                return;
            }
            m.h(this.f20668u);
            List<d6> a22 = j1Var.a2(this.f20666s, this.f20667t, this.f20669v, this.f20668u);
            bundle = new Bundle();
            if (a22 != null) {
                for (d6 d6Var : a22) {
                    String str = d6Var.f20366w;
                    if (str != null) {
                        bundle.putString(d6Var.f20363t, str);
                    } else {
                        Long l10 = d6Var.f20365v;
                        if (l10 != null) {
                            bundle.putLong(d6Var.f20363t, l10.longValue());
                        } else {
                            Double d5 = d6Var.y;
                            if (d5 != null) {
                                bundle.putDouble(d6Var.f20363t, d5.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    this.f20671x.r();
                    ((w2) this.f20671x.f20505s).z().E(this.f20670w, bundle);
                } catch (RemoteException e11) {
                    e10 = e11;
                    ((w2) this.f20671x.f20505s).C().f20710x.c("Failed to get user properties; remote exception", this.f20666s, e10);
                    ((w2) this.f20671x.f20505s).z().E(this.f20670w, bundle);
                }
            } catch (Throwable th2) {
                th = th2;
                bundle2 = bundle;
                ((w2) this.f20671x.f20505s).z().E(this.f20670w, bundle2);
                throw th;
            }
        } catch (RemoteException e12) {
            bundle = bundle2;
            e10 = e12;
        } catch (Throwable th3) {
            th = th3;
            ((w2) this.f20671x.f20505s).z().E(this.f20670w, bundle2);
            throw th;
        }
    }
}
