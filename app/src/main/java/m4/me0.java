package m4;

import android.os.RemoteException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import n3.g1;
import n3.k;
import r.a;

/* loaded from: classes.dex */
public final class me0 extends kq {
    @GuardedBy("lock")
    public float A;
    @GuardedBy("lock")
    public float B;
    @GuardedBy("lock")
    public float C;
    @GuardedBy("lock")
    public boolean D;
    @GuardedBy("lock")
    public boolean E;
    @GuardedBy("lock")
    public rv F;

    /* renamed from: s */
    public final fb0 f11170s;

    /* renamed from: u */
    public final boolean f11172u;

    /* renamed from: v */
    public final boolean f11173v;
    @GuardedBy("lock")

    /* renamed from: w */
    public int f11174w;
    @GuardedBy("lock")

    /* renamed from: x */
    public pq f11175x;
    @GuardedBy("lock")
    public boolean y;

    /* renamed from: t */
    public final Object f11171t = new Object();
    @GuardedBy("lock")

    /* renamed from: z */
    public boolean f11176z = true;

    public me0(fb0 fb0Var, float f10, boolean z10, boolean z11) {
        this.f11170s = fb0Var;
        this.A = f10;
        this.f11172u = z10;
        this.f11173v = z11;
    }

    public final void O3(float f10, float f11, int i10, boolean z10, float f12) {
        boolean z11;
        boolean z12;
        int i11;
        synchronized (this.f11171t) {
            z11 = true;
            if (f11 == this.A && f12 == this.C) {
                z11 = false;
            }
            this.A = f11;
            this.B = f10;
            z12 = this.f11176z;
            this.f11176z = z10;
            i11 = this.f11174w;
            this.f11174w = i10;
            float f13 = this.C;
            this.C = f12;
            if (Math.abs(f12 - f13) > 1.0E-4f) {
                this.f11170s.A().invalidate();
            }
        }
        if (z11) {
            try {
                rv rvVar = this.F;
                if (rvVar != null) {
                    rvVar.e0(2, rvVar.w());
                }
            } catch (RemoteException e10) {
                g1.l("#007 Could not call remote method.", e10);
            }
        }
        u90.f14298e.execute(new le0(this, i11, i10, z12, z10));
    }

    public final void P3(or orVar) {
        boolean z10 = orVar.f12277s;
        boolean z11 = orVar.f12278t;
        boolean z12 = orVar.f12279u;
        synchronized (this.f11171t) {
            this.D = z11;
            this.E = z12;
        }
        String str = true != z10 ? "0" : "1";
        String str2 = true != z11 ? "0" : "1";
        String str3 = true != z12 ? "0" : "1";
        a aVar = new a(3);
        aVar.put("muteStart", str);
        aVar.put("customControlsRequested", str2);
        aVar.put("clickToExpandRequested", str3);
        Q3("initialState", Collections.unmodifiableMap(aVar));
    }

    public final void Q3(String str, Map<String, String> map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        u90.f14298e.execute(new k(this, hashMap, 2));
    }

    @Override // m4.lq
    public final void W1(boolean z10) {
        Q3(true != z10 ? "unmute" : "mute", null);
    }

    @Override // m4.lq
    public final float b() {
        float f10;
        synchronized (this.f11171t) {
            f10 = this.C;
        }
        return f10;
    }

    @Override // m4.lq
    public final float d() {
        float f10;
        synchronized (this.f11171t) {
            f10 = this.B;
        }
        return f10;
    }

    @Override // m4.lq
    public final float e() {
        float f10;
        synchronized (this.f11171t) {
            f10 = this.A;
        }
        return f10;
    }

    @Override // m4.lq
    public final int f() {
        int i10;
        synchronized (this.f11171t) {
            i10 = this.f11174w;
        }
        return i10;
    }

    @Override // m4.lq
    public final pq h() {
        pq pqVar;
        synchronized (this.f11171t) {
            pqVar = this.f11175x;
        }
        return pqVar;
    }

    @Override // m4.lq
    public final void j() {
        Q3("stop", null);
    }

    @Override // m4.lq
    public final boolean k() {
        boolean z10;
        boolean z11;
        synchronized (this.f11171t) {
            z10 = true;
            z11 = this.f11172u && this.D;
        }
        synchronized (this.f11171t) {
            if (!z11) {
                try {
                    if (this.E && this.f11173v) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z10 = false;
        }
        return z10;
    }

    @Override // m4.lq
    public final void l() {
        Q3("play", null);
    }

    @Override // m4.lq
    public final boolean m() {
        boolean z10;
        synchronized (this.f11171t) {
            z10 = false;
            if (this.f11172u && this.D) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // m4.lq
    public final void n() {
        Q3("pause", null);
    }

    @Override // m4.lq
    public final boolean s() {
        boolean z10;
        synchronized (this.f11171t) {
            z10 = this.f11176z;
        }
        return z10;
    }

    @Override // m4.lq
    public final void y2(pq pqVar) {
        synchronized (this.f11171t) {
            this.f11175x = pqVar;
        }
    }
}
