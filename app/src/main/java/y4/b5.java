package y4;

import android.os.Bundle;
import android.os.RemoteException;
import d4.m;
import java.util.ArrayList;
import s4.v0;

/* loaded from: classes.dex */
public final class b5 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ String f20321s;

    /* renamed from: t */
    public final /* synthetic */ String f20322t;

    /* renamed from: u */
    public final /* synthetic */ k6 f20323u;

    /* renamed from: v */
    public final /* synthetic */ v0 f20324v;

    /* renamed from: w */
    public final /* synthetic */ e5 f20325w;

    public b5(e5 e5Var, String str, String str2, k6 k6Var, v0 v0Var) {
        this.f20325w = e5Var;
        this.f20321s = str;
        this.f20322t = str2;
        this.f20323u = k6Var;
        this.f20324v = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            try {
                e5 e5Var = this.f20325w;
                j1 j1Var = e5Var.f20389v;
                if (j1Var == null) {
                    ((w2) e5Var.f20505s).C().f20710x.c("Failed to get conditional properties; not connected to service", this.f20321s, this.f20322t);
                } else {
                    m.h(this.f20323u);
                    arrayList = h6.s(j1Var.K3(this.f20321s, this.f20322t, this.f20323u));
                    this.f20325w.r();
                }
            } catch (RemoteException e10) {
                ((w2) this.f20325w.f20505s).C().f20710x.d("Failed to get conditional properties; remote exception", this.f20321s, this.f20322t, e10);
            }
        } finally {
            ((w2) this.f20325w.f20505s).z().D(this.f20324v, arrayList);
        }
    }
}
