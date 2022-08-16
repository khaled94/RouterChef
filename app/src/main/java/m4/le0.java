package m4;

import android.os.RemoteException;
import n3.g1;

/* loaded from: classes.dex */
public final /* synthetic */ class le0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ me0 f10737s;

    /* renamed from: t */
    public final /* synthetic */ int f10738t;

    /* renamed from: u */
    public final /* synthetic */ int f10739u;

    /* renamed from: v */
    public final /* synthetic */ boolean f10740v;

    /* renamed from: w */
    public final /* synthetic */ boolean f10741w;

    public /* synthetic */ le0(me0 me0Var, int i10, int i11, boolean z10, boolean z11) {
        this.f10737s = me0Var;
        this.f10738t = i10;
        this.f10739u = i11;
        this.f10740v = z10;
        this.f10741w = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        int i10;
        boolean z11;
        pq pqVar;
        pq pqVar2;
        pq pqVar3;
        me0 me0Var = this.f10737s;
        int i11 = this.f10738t;
        int i12 = this.f10739u;
        boolean z12 = this.f10740v;
        boolean z13 = this.f10741w;
        synchronized (me0Var.f11171t) {
            boolean z14 = me0Var.y;
            boolean z15 = false;
            if (z14 || i12 != 1) {
                i10 = i12;
                z10 = false;
            } else {
                i10 = 1;
                z10 = true;
            }
            if (i11 == i12 || i10 != 1) {
                z11 = false;
            } else {
                i10 = 1;
                z11 = true;
            }
            boolean z16 = i11 != i12 && i10 == 2;
            boolean z17 = i11 != i12 && i10 == 3;
            if (z14 || z10) {
                z15 = true;
            }
            me0Var.y = z15;
            if (z10) {
                try {
                    pq pqVar4 = me0Var.f11175x;
                    if (pqVar4 != null) {
                        pqVar4.h();
                    }
                } catch (RemoteException e10) {
                    g1.l("#007 Could not call remote method.", e10);
                }
            }
            if (z11 && (pqVar3 = me0Var.f11175x) != null) {
                pqVar3.f();
            }
            if (z16 && (pqVar2 = me0Var.f11175x) != null) {
                pqVar2.e();
            }
            if (z17) {
                pq pqVar5 = me0Var.f11175x;
                if (pqVar5 != null) {
                    pqVar5.b();
                }
                me0Var.f11170s.u();
            }
            if (z12 != z13 && (pqVar = me0Var.f11175x) != null) {
                pqVar.l2(z13);
            }
        }
    }
}
