package m4;

import a6.f;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import d.d;
import java.util.Objects;
import l3.s;
import m3.p;
import n3.g1;

/* loaded from: classes.dex */
public final class z21 implements p, ye0 {
    public boolean A;

    /* renamed from: s */
    public final Context f15982s;

    /* renamed from: t */
    public final o90 f15983t;

    /* renamed from: u */
    public x21 f15984u;

    /* renamed from: v */
    public he0 f15985v;

    /* renamed from: w */
    public boolean f15986w;

    /* renamed from: x */
    public boolean f15987x;
    public long y;

    /* renamed from: z */
    public bq f15988z;

    public z21(Context context, o90 o90Var) {
        this.f15982s = context;
        this.f15983t = o90Var;
    }

    @Override // m4.ye0
    public final synchronized void J(boolean z10) {
        if (z10) {
            g1.a("Ad inspector loaded.");
            this.f15986w = true;
            d();
            return;
        }
        g1.j("Ad inspector failed to load.");
        try {
            bq bqVar = this.f15988z;
            if (bqVar != null) {
                bqVar.h1(f.n(17, null, null));
            }
        } catch (RemoteException unused) {
        }
        this.A = true;
        this.f15985v.destroy();
    }

    @Override // m3.p
    public final void J3() {
    }

    @Override // m3.p
    public final void Z1() {
    }

    @Override // m3.p
    public final synchronized void a() {
        this.f15987x = true;
        d();
    }

    @Override // m3.p
    public final void b() {
    }

    public final synchronized void c(bq bqVar, mx mxVar) {
        if (!e(bqVar)) {
            return;
        }
        try {
            s sVar = s.B;
            ge0 ge0Var = sVar.f5790d;
            vd0 a10 = ge0.a(this.f15982s, cf0.a(), "", false, false, null, null, this.f15983t, null, null, new wj(), null, null);
            this.f15985v = (he0) a10;
            af0 q02 = ((he0) a10).q0();
            if (q02 == null) {
                g1.j("Failed to obtain a web view for the ad inspector");
                try {
                    bqVar.h1(f.n(17, "Failed to obtain a web view for the ad inspector", null));
                    return;
                } catch (RemoteException unused) {
                    return;
                }
            }
            this.f15988z = bqVar;
            ((ce0) q02).c(null, null, null, null, null, false, null, null, null, null, null, null, null, null, mxVar, null);
            ((ce0) q02).y = this;
            this.f15985v.loadUrl((String) jo.f10145d.f10148c.a(es.T5));
            d.e(this.f15982s, new AdOverlayInfoParcel(this, this.f15985v, this.f15983t), true);
            Objects.requireNonNull(sVar.f5796j);
            this.y = System.currentTimeMillis();
        } catch (fe0 e10) {
            g1.k("Failed to obtain a web view for the ad inspector", e10);
            try {
                bqVar.h1(f.n(17, "Failed to obtain a web view for the ad inspector", null));
            } catch (RemoteException unused2) {
            }
        }
    }

    public final synchronized void d() {
        if (this.f15986w && this.f15987x) {
            u90.f14298e.execute(new t9(this, 1));
        }
    }

    public final synchronized boolean e(bq bqVar) {
        yr<Boolean> yrVar = es.S5;
        jo joVar = jo.f10145d;
        if (!((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            g1.j("Ad inspector had an internal error.");
            try {
                bqVar.h1(f.n(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        } else if (this.f15984u == null) {
            g1.j("Ad inspector had an internal error.");
            try {
                bqVar.h1(f.n(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        } else {
            if (!this.f15986w && !this.f15987x) {
                Objects.requireNonNull(s.B.f5796j);
                if (System.currentTimeMillis() >= this.y + ((Integer) joVar.f10148c.a(es.V5)).intValue()) {
                    return true;
                }
            }
            g1.j("Ad inspector cannot be opened because it is already open.");
            try {
                bqVar.h1(f.n(19, null, null));
            } catch (RemoteException unused3) {
            }
            return false;
        }
    }

    @Override // m3.p
    public final void v2() {
    }

    @Override // m3.p
    public final synchronized void w(int i10) {
        this.f15985v.destroy();
        if (!this.A) {
            g1.a("Inspector closed.");
            bq bqVar = this.f15988z;
            if (bqVar != null) {
                try {
                    bqVar.h1(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f15987x = false;
        this.f15986w = false;
        this.y = 0L;
        this.A = false;
        this.f15988z = null;
    }
}
