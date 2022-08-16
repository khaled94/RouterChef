package m4;

import a6.f;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import d4.m;
import javax.annotation.concurrent.GuardedBy;
import k4.a;
import k4.b;
import l3.s;
import n3.g1;
import n3.s1;

/* loaded from: classes.dex */
public final class oc1 extends cp {

    /* renamed from: s */
    public final on f12096s;

    /* renamed from: t */
    public final Context f12097t;

    /* renamed from: u */
    public final ll1 f12098u;

    /* renamed from: v */
    public final String f12099v;

    /* renamed from: w */
    public final lc1 f12100w;

    /* renamed from: x */
    public final sl1 f12101x;
    @GuardedBy("this")
    public xs0 y;
    @GuardedBy("this")

    /* renamed from: z */
    public boolean f12102z = ((Boolean) jo.f10145d.f10148c.a(es.f8173q0)).booleanValue();

    public oc1(Context context, on onVar, String str, ll1 ll1Var, lc1 lc1Var, sl1 sl1Var) {
        this.f12096s = onVar;
        this.f12099v = str;
        this.f12097t = context;
        this.f12098u = ll1Var;
        this.f12100w = lc1Var;
        this.f12101x = sl1Var;
    }

    @Override // m4.dp
    public final void B() {
        m.d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // m4.dp
    public final void C() {
    }

    @Override // m4.dp
    public final void D3(on onVar) {
    }

    @Override // m4.dp
    public final synchronized void F() {
        m.d("pause must be called on the main UI thread.");
        xs0 xs0Var = this.y;
        if (xs0Var != null) {
            xs0Var.f6192c.P0(null);
        }
    }

    @Override // m4.dp
    public final synchronized boolean F1(jn jnVar) {
        m.d("loadAd must be called on the main UI thread.");
        s1 s1Var = s.B.f5789c;
        if (s1.j(this.f12097t) && jnVar.K == null) {
            g1.g("Failed to load the ad because app ID is missing.");
            lc1 lc1Var = this.f12100w;
            if (lc1Var != null) {
                lc1Var.d(f.n(4, null, null));
            }
            return false;
        } else if (N3()) {
            return false;
        } else {
            x90.d(this.f12097t, jnVar.f10133x);
            this.y = null;
            return this.f12098u.a(jnVar, this.f12099v, new jl1(this.f12096s), new m7(this, 4));
        }
    }

    @Override // m4.dp
    public final void G() {
    }

    @Override // m4.dp
    public final void G2(gq gqVar) {
        m.d("setPaidEventListener must be called on the main UI thread.");
        this.f12100w.f10716u.set(gqVar);
    }

    @Override // m4.dp
    public final void H2(yi yiVar) {
    }

    @Override // m4.dp
    public final void K() {
    }

    @Override // m4.dp
    public final void K0(mo moVar) {
    }

    @Override // m4.dp
    public final synchronized void L() {
        m.d("destroy must be called on the main UI thread.");
        xs0 xs0Var = this.y;
        if (xs0Var != null) {
            xs0Var.f6192c.O0(null);
        }
    }

    @Override // m4.dp
    public final void L2(or orVar) {
    }

    public final synchronized boolean N3() {
        boolean z10;
        xs0 xs0Var = this.y;
        if (xs0Var != null) {
            if (!xs0Var.f15465m.f12925t.get()) {
                z10 = true;
            }
        }
        z10 = false;
        return z10;
    }

    @Override // m4.dp
    public final void R() {
    }

    @Override // m4.dp
    public final void R1(mp mpVar) {
    }

    @Override // m4.dp
    public final void S2(e60 e60Var) {
        this.f12101x.f13735w.set(e60Var);
    }

    @Override // m4.dp
    public final void T() {
    }

    @Override // m4.dp
    public final void Y0(po poVar) {
        m.d("setAdListener must be called on the main UI thread.");
        this.f12100w.b(poVar);
    }

    @Override // m4.dp
    public final void c1(pp ppVar) {
        this.f12100w.f10718w.set(ppVar);
    }

    @Override // m4.dp
    public final on e() {
        return null;
    }

    @Override // m4.dp
    public final synchronized void e2(boolean z10) {
        m.d("setImmersiveMode must be called on the main UI thread.");
        this.f12102z = z10;
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
    public final synchronized void g0() {
        m.d("showInterstitial must be called on the main UI thread.");
        xs0 xs0Var = this.y;
        if (xs0Var != null) {
            xs0Var.c(this.f12102z, null);
            return;
        }
        g1.j("Interstitial can not be shown before loaded.");
        this.f12100w.d0(f.n(9, null, null));
    }

    @Override // m4.dp
    public final po h() {
        return this.f12100w.a();
    }

    @Override // m4.dp
    public final void h0() {
    }

    @Override // m4.dp
    public final ip i() {
        ip ipVar;
        lc1 lc1Var = this.f12100w;
        synchronized (lc1Var) {
            ipVar = lc1Var.f10715t.get();
        }
        return ipVar;
    }

    @Override // m4.dp
    public final a j() {
        return null;
    }

    @Override // m4.dp
    public final synchronized void k1(a aVar) {
        if (this.y == null) {
            g1.j("Interstitial can not be shown before loaded.");
            this.f12100w.d0(f.n(9, null, null));
            return;
        }
        this.y.c(this.f12102z, (Activity) b.e0(aVar));
    }

    @Override // m4.dp
    public final lq l() {
        return null;
    }

    @Override // m4.dp
    public final synchronized iq n() {
        if (!((Boolean) jo.f10145d.f10148c.a(es.D4)).booleanValue()) {
            return null;
        }
        xs0 xs0Var = this.y;
        if (xs0Var == null) {
            return null;
        }
        return xs0Var.f6195f;
    }

    @Override // m4.dp
    public final void n2(ip ipVar) {
        m.d("setAppEventListener must be called on the main UI thread.");
        this.f12100w.f(ipVar);
    }

    @Override // m4.dp
    public final synchronized boolean o0() {
        m.d("isLoaded must be called on the main UI thread.");
        return N3();
    }

    @Override // m4.dp
    public final synchronized String p() {
        oo0 oo0Var;
        xs0 xs0Var = this.y;
        if (xs0Var == null || (oo0Var = xs0Var.f6195f) == null) {
            return null;
        }
        return oo0Var.f12238s;
    }

    @Override // m4.dp
    public final synchronized String r() {
        oo0 oo0Var;
        xs0 xs0Var = this.y;
        if (xs0Var == null || (oo0Var = xs0Var.f6195f) == null) {
            return null;
        }
        return oo0Var.f12238s;
    }

    @Override // m4.dp
    public final void r3(jn jnVar, to toVar) {
        this.f12100w.f10717v.set(toVar);
        F1(jnVar);
    }

    @Override // m4.dp
    public final synchronized void v3(vs vsVar) {
        m.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f12098u.f10913f = vsVar;
    }

    @Override // m4.dp
    public final synchronized String x() {
        return this.f12099v;
    }

    @Override // m4.dp
    public final synchronized void y() {
        m.d("resume must be called on the main UI thread.");
        xs0 xs0Var = this.y;
        if (xs0Var != null) {
            xs0Var.f6192c.R0(null);
        }
    }

    @Override // m4.dp
    public final synchronized boolean z2() {
        return this.f12098u.zza();
    }

    @Override // m4.dp
    public final void z3(boolean z10) {
    }
}
