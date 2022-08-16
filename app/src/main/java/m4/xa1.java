package m4;

import android.os.RemoteException;
import s4.v0;
import y4.e5;
import y4.j1;
import y4.p;
import y4.w2;

/* loaded from: classes.dex */
public final /* synthetic */ class xa1 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f15261s = 0;

    /* renamed from: t */
    public final /* synthetic */ Object f15262t;

    /* renamed from: u */
    public final /* synthetic */ Object f15263u;

    /* renamed from: v */
    public final /* synthetic */ Object f15264v;

    /* renamed from: w */
    public final /* synthetic */ Object f15265w;

    public /* synthetic */ xa1(ya1 ya1Var, km1 km1Var, cm1 cm1Var, h71 h71Var) {
        this.f15262t = ya1Var;
        this.f15263u = km1Var;
        this.f15264v = cm1Var;
        this.f15265w = h71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15261s) {
            case 0:
                ab1 ab1Var = ((ya1) this.f15262t).f15636d;
                ab1.c((km1) this.f15263u, (cm1) this.f15264v, (h71) this.f15265w);
                return;
            default:
                byte[] bArr = null;
                try {
                    try {
                        Object obj = this.f15265w;
                        j1 j1Var = ((e5) obj).f20389v;
                        if (j1Var == null) {
                            ((w2) ((e5) obj).f20505s).C().f20710x.a("Discarding data. Failed to send event to service to bundle");
                        } else {
                            bArr = j1Var.S1((p) this.f15262t, (String) this.f15263u);
                            ((e5) this.f15265w).r();
                        }
                    } catch (RemoteException e10) {
                        ((w2) ((e5) this.f15265w).f20505s).C().f20710x.b("Failed to send event to the service to bundle", e10);
                    }
                    return;
                } finally {
                    ((w2) ((e5) this.f15265w).f20505s).z().F((v0) this.f15264v, bArr);
                }
        }
    }

    public xa1(e5 e5Var, p pVar, String str, v0 v0Var) {
        this.f15265w = e5Var;
        this.f15262t = pVar;
        this.f15263u = str;
        this.f15264v = v0Var;
    }
}
