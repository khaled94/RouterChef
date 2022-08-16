package m4;

import a6.f;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.FrameLayout;
import d4.m;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
import k4.a;
import l3.s;
import m3.b;
import n3.g1;
import n3.s1;

/* loaded from: classes.dex */
public final class nj1 extends cp implements b, ui, up0 {
    public nj0 B;
    @GuardedBy("this")
    public xj0 C;

    /* renamed from: s */
    public final if0 f11805s;

    /* renamed from: t */
    public final Context f11806t;

    /* renamed from: u */
    public final FrameLayout f11807u;

    /* renamed from: w */
    public final String f11809w;

    /* renamed from: x */
    public final jj1 f11810x;
    public final vj1 y;

    /* renamed from: z */
    public final o90 f11811z;

    /* renamed from: v */
    public AtomicBoolean f11808v = new AtomicBoolean();
    public long A = -1;

    public nj1(if0 if0Var, Context context, String str, jj1 jj1Var, vj1 vj1Var, o90 o90Var) {
        this.f11807u = new FrameLayout(context);
        this.f11805s = if0Var;
        this.f11806t = context;
        this.f11809w = str;
        this.f11810x = jj1Var;
        this.y = vj1Var;
        vj1Var.f14706w.set(this);
        this.f11811z = o90Var;
    }

    public static on N3(nj1 nj1Var) {
        return ql.a(nj1Var.f11806t, Collections.singletonList(nj1Var.C.f6191b.f7060s.get(0)));
    }

    @Override // m4.dp
    public final void B() {
    }

    @Override // m4.dp
    public final synchronized void C() {
    }

    @Override // m4.dp
    public final synchronized void D3(on onVar) {
        m.d("setAdSize must be called on the main UI thread.");
    }

    @Override // m4.dp
    public final synchronized void F() {
        m.d("pause must be called on the main UI thread.");
    }

    @Override // m4.dp
    public final synchronized boolean F1(jn jnVar) {
        m.d("loadAd must be called on the main UI thread.");
        s1 s1Var = s.B.f5789c;
        if (s1.j(this.f11806t) && jnVar.K == null) {
            g1.g("Failed to load the ad because app ID is missing.");
            this.y.d(f.n(4, null, null));
            return false;
        }
        synchronized (this) {
            if (this.f11810x.zza()) {
                return false;
            }
            this.f11808v = new AtomicBoolean();
            return this.f11810x.a(jnVar, this.f11809w, new lj1(), new mj1(this));
        }
    }

    @Override // m4.dp
    public final void G() {
    }

    @Override // m4.dp
    public final void G2(gq gqVar) {
    }

    @Override // m4.dp
    public final void H2(yi yiVar) {
        this.y.f14703t.set(yiVar);
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
        xj0 xj0Var = this.C;
        if (xj0Var != null) {
            xj0Var.a();
        }
    }

    @Override // m4.dp
    public final synchronized void L2(or orVar) {
    }

    public final synchronized void O3(int i10) {
        zi ziVar;
        if (this.f11808v.compareAndSet(false, true)) {
            xj0 xj0Var = this.C;
            if (xj0Var != null && (ziVar = xj0Var.f15380o) != null) {
                this.y.f14704u.set(ziVar);
            }
            this.y.c();
            this.f11807u.removeAllViews();
            nj0 nj0Var = this.B;
            if (nj0Var != null) {
                s.B.f5792f.d(nj0Var);
            }
            if (this.C != null) {
                long j3 = -1;
                if (this.A != -1) {
                    Objects.requireNonNull(s.B.f5796j);
                    j3 = SystemClock.elapsedRealtime() - this.A;
                }
                this.C.f15379n.a(j3, i10);
            }
            L();
        }
    }

    @Override // m4.dp
    public final void R() {
    }

    @Override // m4.dp
    public final synchronized void R1(mp mpVar) {
    }

    @Override // m4.dp
    public final void S2(e60 e60Var) {
    }

    @Override // m4.dp
    public final void T() {
    }

    @Override // m4.dp
    public final void Y0(po poVar) {
    }

    @Override // m4.dp
    public final void c1(pp ppVar) {
    }

    @Override // m4.dp
    public final synchronized on e() {
        m.d("getAdSize must be called on the main UI thread.");
        xj0 xj0Var = this.C;
        if (xj0Var != null) {
            return ql.a(this.f11806t, Collections.singletonList(xj0Var.f6191b.f7060s.get(0)));
        }
        return null;
    }

    @Override // m3.b
    public final void e0() {
        O3(4);
    }

    @Override // m4.dp
    public final void e2(boolean z10) {
    }

    @Override // m4.dp
    public final void e3(un unVar) {
        this.f11810x.f13701h.f11847i = unVar;
    }

    @Override // m4.up0
    public final void f() {
        if (this.C == null) {
            return;
        }
        s sVar = s.B;
        Objects.requireNonNull(sVar.f5796j);
        this.A = SystemClock.elapsedRealtime();
        int i10 = this.C.f15376k;
        if (i10 <= 0) {
            return;
        }
        nj0 nj0Var = new nj0(this.f11805s.c(), sVar.f5796j);
        this.B = nj0Var;
        nj0Var.a(i10, new mb0(this, 1));
    }

    @Override // m4.dp
    public final Bundle g() {
        return new Bundle();
    }

    @Override // m4.dp
    public final void g0() {
    }

    @Override // m4.dp
    public final po h() {
        return null;
    }

    @Override // m4.dp
    public final void h0() {
    }

    @Override // m4.dp
    public final ip i() {
        return null;
    }

    @Override // m4.dp
    public final a j() {
        m.d("getAdFrame must be called on the main UI thread.");
        return new k4.b(this.f11807u);
    }

    @Override // m4.dp
    public final void k1(a aVar) {
    }

    @Override // m4.dp
    public final synchronized lq l() {
        return null;
    }

    @Override // m4.dp
    public final synchronized iq n() {
        return null;
    }

    @Override // m4.dp
    public final void n2(ip ipVar) {
    }

    @Override // m4.dp
    public final boolean o0() {
        return false;
    }

    @Override // m4.dp
    public final synchronized String p() {
        return null;
    }

    @Override // m4.dp
    public final synchronized String r() {
        return null;
    }

    @Override // m4.dp
    public final void r3(jn jnVar, to toVar) {
    }

    @Override // m4.dp
    public final synchronized void v3(vs vsVar) {
    }

    @Override // m4.dp
    public final synchronized String x() {
        return this.f11809w;
    }

    @Override // m4.dp
    public final synchronized void y() {
        m.d("resume must be called on the main UI thread.");
    }

    @Override // m4.dp
    public final synchronized boolean z2() {
        return this.f11810x.zza();
    }

    @Override // m4.dp
    public final synchronized void z3(boolean z10) {
    }

    @Override // m4.ui
    public final void zza() {
        O3(3);
    }
}
