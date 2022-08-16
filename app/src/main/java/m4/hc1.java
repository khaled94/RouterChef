package m4;

import a6.f;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import d4.m;
import java.util.Collections;
import javax.annotation.concurrent.GuardedBy;
import k4.a;
import k4.b;
import l3.s;
import n3.g1;
import n3.m0;
import n3.s1;

/* loaded from: classes.dex */
public final class hc1 extends cp implements dq0 {

    /* renamed from: s */
    public final Context f9187s;

    /* renamed from: t */
    public final ck1 f9188t;

    /* renamed from: u */
    public final String f9189u;

    /* renamed from: v */
    public final lc1 f9190v;

    /* renamed from: w */
    public on f9191w;
    @GuardedBy("this")

    /* renamed from: x */
    public final nm1 f9192x;
    @GuardedBy("this")
    public ik0 y;

    public hc1(Context context, on onVar, String str, ck1 ck1Var, lc1 lc1Var) {
        this.f9187s = context;
        this.f9188t = ck1Var;
        this.f9191w = onVar;
        this.f9189u = str;
        this.f9190v = lc1Var;
        this.f9192x = ck1Var.f7020j;
        ck1Var.f7018h.I0(this, ck1Var.f7012b);
    }

    @Override // m4.dp
    public final void B() {
        m.d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // m4.dp
    public final synchronized void C() {
        m.d("recordManualImpression must be called on the main UI thread.");
        ik0 ik0Var = this.y;
        if (ik0Var != null) {
            ik0Var.h();
        }
    }

    @Override // m4.dp
    public final synchronized void D3(on onVar) {
        m.d("setAdSize must be called on the main UI thread.");
        this.f9192x.f11840b = onVar;
        this.f9191w = onVar;
        ik0 ik0Var = this.y;
        if (ik0Var != null) {
            ik0Var.i(this.f9188t.f7016f, onVar);
        }
    }

    @Override // m4.dp
    public final synchronized void F() {
        m.d("pause must be called on the main UI thread.");
        ik0 ik0Var = this.y;
        if (ik0Var != null) {
            ik0Var.f6192c.P0(null);
        }
    }

    @Override // m4.dp
    public final synchronized boolean F1(jn jnVar) {
        on onVar = this.f9191w;
        synchronized (this) {
            nm1 nm1Var = this.f9192x;
            nm1Var.f11840b = onVar;
            nm1Var.p = this.f9191w.F;
        }
        return N3(jnVar);
        return N3(jnVar);
    }

    @Override // m4.dp
    public final void G() {
    }

    @Override // m4.dp
    public final void G2(gq gqVar) {
        m.d("setPaidEventListener must be called on the main UI thread.");
        this.f9190v.f10716u.set(gqVar);
    }

    @Override // m4.dp
    public final void H2(yi yiVar) {
    }

    @Override // m4.dp
    public final void K() {
    }

    @Override // m4.dp
    public final void K0(mo moVar) {
        m.d("setAdListener must be called on the main UI thread.");
        nc1 nc1Var = this.f9188t.f7015e;
        synchronized (nc1Var) {
            nc1Var.f11630s = moVar;
        }
    }

    @Override // m4.dp
    public final synchronized void L() {
        m.d("destroy must be called on the main UI thread.");
        ik0 ik0Var = this.y;
        if (ik0Var != null) {
            ik0Var.a();
        }
    }

    @Override // m4.dp
    public final synchronized void L2(or orVar) {
        m.d("setVideoOptions must be called on the main UI thread.");
        this.f9192x.f11842d = orVar;
    }

    public final synchronized boolean N3(jn jnVar) {
        m.d("loadAd must be called on the main UI thread.");
        s1 s1Var = s.B.f5789c;
        if (!s1.j(this.f9187s) || jnVar.K != null) {
            x90.d(this.f9187s, jnVar.f10133x);
            return this.f9188t.a(jnVar, this.f9189u, null, new m0(this));
        }
        g1.g("Failed to load the ad because app ID is missing.");
        lc1 lc1Var = this.f9190v;
        if (lc1Var != null) {
            lc1Var.d(f.n(4, null, null));
        }
        return false;
    }

    @Override // m4.dp
    public final void R() {
    }

    @Override // m4.dp
    public final synchronized void R1(mp mpVar) {
        m.d("setCorrelationIdProvider must be called on the main UI thread");
        this.f9192x.f11855r = mpVar;
    }

    @Override // m4.dp
    public final void S2(e60 e60Var) {
    }

    @Override // m4.dp
    public final void T() {
    }

    @Override // m4.dp
    public final void Y0(po poVar) {
        m.d("setAdListener must be called on the main UI thread.");
        this.f9190v.b(poVar);
    }

    @Override // m4.dp
    public final void c1(pp ppVar) {
    }

    @Override // m4.dp
    public final synchronized on e() {
        m.d("getAdSize must be called on the main UI thread.");
        ik0 ik0Var = this.y;
        if (ik0Var != null) {
            return ql.a(this.f9187s, Collections.singletonList(ik0Var.f()));
        }
        return this.f9192x.f11840b;
    }

    @Override // m4.dp
    public final void e2(boolean z10) {
    }

    @Override // m4.dp
    public final void e3(un unVar) {
    }

    @Override // m4.dp
    public final Bundle g() {
        m.d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // m4.dp
    public final void g0() {
    }

    @Override // m4.dp
    public final po h() {
        return this.f9190v.a();
    }

    @Override // m4.dp
    public final void h0() {
    }

    @Override // m4.dp
    public final ip i() {
        ip ipVar;
        lc1 lc1Var = this.f9190v;
        synchronized (lc1Var) {
            ipVar = lc1Var.f10715t.get();
        }
        return ipVar;
    }

    @Override // m4.dp
    public final a j() {
        m.d("destroy must be called on the main UI thread.");
        return new b(this.f9188t.f7016f);
    }

    @Override // m4.dp
    public final void k1(a aVar) {
    }

    @Override // m4.dp
    public final synchronized lq l() {
        m.d("getVideoController must be called from the main thread.");
        ik0 ik0Var = this.y;
        if (ik0Var != null) {
            return ik0Var.e();
        }
        return null;
    }

    @Override // m4.dp
    public final synchronized iq n() {
        if (!((Boolean) jo.f10145d.f10148c.a(es.D4)).booleanValue()) {
            return null;
        }
        ik0 ik0Var = this.y;
        if (ik0Var == null) {
            return null;
        }
        return ik0Var.f6195f;
    }

    @Override // m4.dp
    public final void n2(ip ipVar) {
        m.d("setAppEventListener must be called on the main UI thread.");
        this.f9190v.f(ipVar);
    }

    @Override // m4.dp
    public final boolean o0() {
        return false;
    }

    @Override // m4.dp
    public final synchronized String p() {
        oo0 oo0Var;
        ik0 ik0Var = this.y;
        if (ik0Var == null || (oo0Var = ik0Var.f6195f) == null) {
            return null;
        }
        return oo0Var.f12238s;
    }

    @Override // m4.dp
    public final synchronized String r() {
        oo0 oo0Var;
        ik0 ik0Var = this.y;
        if (ik0Var == null || (oo0Var = ik0Var.f6195f) == null) {
            return null;
        }
        return oo0Var.f12238s;
    }

    @Override // m4.dp
    public final void r3(jn jnVar, to toVar) {
    }

    @Override // m4.dp
    public final synchronized void v3(vs vsVar) {
        m.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f9188t.f7017g = vsVar;
    }

    @Override // m4.dp
    public final synchronized String x() {
        return this.f9189u;
    }

    @Override // m4.dp
    public final synchronized void y() {
        m.d("resume must be called on the main UI thread.");
        ik0 ik0Var = this.y;
        if (ik0Var != null) {
            ik0Var.f6192c.R0(null);
        }
    }

    @Override // m4.dp
    public final synchronized boolean z2() {
        return this.f9188t.zza();
    }

    @Override // m4.dp
    public final synchronized void z3(boolean z10) {
        m.d("setManualImpressionsEnabled must be called from the main thread.");
        this.f9192x.f11843e = z10;
    }

    @Override // m4.dq0
    public final synchronized void zza() {
        if (this.f9188t.b()) {
            on onVar = this.f9192x.f11840b;
            ik0 ik0Var = this.y;
            if (ik0Var != null && ik0Var.g() != null && this.f9192x.p) {
                onVar = ql.a(this.f9187s, Collections.singletonList(this.y.g()));
            }
            synchronized (this) {
                nm1 nm1Var = this.f9192x;
                nm1Var.f11840b = onVar;
                nm1Var.p = this.f9191w.F;
                try {
                    N3(nm1Var.f11839a);
                } catch (RemoteException unused) {
                    g1.j("Failed to refresh the banner ad.");
                    return;
                }
            }
            return;
        }
        this.f9188t.f7018h.O0(60);
    }
}
