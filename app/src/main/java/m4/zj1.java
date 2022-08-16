package m4;

import a6.f;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import d4.m;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
import k4.a;
import l3.s;
import m3.p;
import n3.g1;
import n3.h;
import n3.s1;

/* loaded from: classes.dex */
public final class zj1 extends cp implements p, ui {
    @GuardedBy("this")
    public ck0 A;

    /* renamed from: s */
    public final if0 f16251s;

    /* renamed from: t */
    public final Context f16252t;

    /* renamed from: v */
    public final String f16254v;

    /* renamed from: w */
    public final wj1 f16255w;

    /* renamed from: x */
    public final vj1 f16256x;
    @GuardedBy("this")

    /* renamed from: z */
    public nj0 f16257z;

    /* renamed from: u */
    public AtomicBoolean f16253u = new AtomicBoolean();
    @GuardedBy("this")
    public long y = -1;

    public zj1(if0 if0Var, Context context, String str, wj1 wj1Var, vj1 vj1Var) {
        this.f16251s = if0Var;
        this.f16252t = context;
        this.f16254v = str;
        this.f16255w = wj1Var;
        this.f16256x = vj1Var;
        vj1Var.f14707x.set(this);
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
        if (s1.j(this.f16252t) && jnVar.K == null) {
            g1.g("Failed to load the ad because app ID is missing.");
            this.f16256x.d(f.n(4, null, null));
            return false;
        }
        synchronized (this) {
            if (this.f16255w.zza()) {
                return false;
            }
            this.f16253u = new AtomicBoolean();
            return this.f16255w.a(jnVar, this.f16254v, new yj1(), new fk0(this, 9));
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
        this.f16256x.f14703t.set(yiVar);
    }

    @Override // m3.p
    public final void J3() {
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
        ck0 ck0Var = this.A;
        if (ck0Var != null) {
            ck0Var.a();
        }
    }

    @Override // m4.dp
    public final synchronized void L2(or orVar) {
    }

    public final synchronized void N3(int i10) {
        if (this.f16253u.compareAndSet(false, true)) {
            this.f16256x.c();
            nj0 nj0Var = this.f16257z;
            if (nj0Var != null) {
                s.B.f5792f.d(nj0Var);
            }
            if (this.A != null) {
                long j3 = -1;
                if (this.y != -1) {
                    Objects.requireNonNull(s.B.f5796j);
                    j3 = SystemClock.elapsedRealtime() - this.y;
                }
                this.A.f7007l.a(j3, i10);
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

    @Override // m3.p
    public final void Z1() {
    }

    @Override // m3.p
    public final synchronized void a() {
        if (this.A == null) {
            return;
        }
        s sVar = s.B;
        Objects.requireNonNull(sVar.f5796j);
        this.y = SystemClock.elapsedRealtime();
        int i10 = this.A.f7005j;
        if (i10 <= 0) {
            return;
        }
        nj0 nj0Var = new nj0(this.f16251s.c(), sVar.f5796j);
        this.f16257z = nj0Var;
        nj0Var.a(i10, new h(this, 2));
    }

    @Override // m3.p
    public final synchronized void b() {
        ck0 ck0Var = this.A;
        if (ck0Var != null) {
            Objects.requireNonNull(s.B.f5796j);
            ck0Var.f7007l.a(SystemClock.elapsedRealtime() - this.y, 1);
        }
    }

    @Override // m4.dp
    public final void c1(pp ppVar) {
    }

    @Override // m4.dp
    public final synchronized on e() {
        return null;
    }

    @Override // m4.dp
    public final void e2(boolean z10) {
    }

    @Override // m4.dp
    public final void e3(un unVar) {
        this.f16255w.f13701h.f11847i = unVar;
    }

    @Override // m4.dp
    public final Bundle g() {
        return new Bundle();
    }

    @Override // m4.dp
    public final synchronized void g0() {
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
        return null;
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

    @Override // m3.p
    public final void v2() {
    }

    @Override // m4.dp
    public final synchronized void v3(vs vsVar) {
    }

    @Override // m3.p
    public final void w(int i10) {
        int i11;
        int i12 = i10 - 1;
        if (i10 != 0) {
            if (i12 == 0) {
                N3(2);
                return;
            }
            if (i12 == 1) {
                i11 = 4;
            } else if (i12 == 2) {
                N3(3);
                return;
            } else if (i12 != 3) {
                return;
            } else {
                i11 = 6;
            }
            N3(i11);
            return;
        }
        throw null;
    }

    @Override // m4.dp
    public final synchronized String x() {
        return this.f16254v;
    }

    @Override // m4.dp
    public final synchronized void y() {
        m.d("resume must be called on the main UI thread.");
    }

    @Override // m4.dp
    public final synchronized boolean z2() {
        return this.f16255w.zza();
    }

    @Override // m4.dp
    public final synchronized void z3(boolean z10) {
    }

    @Override // m4.ui
    public final void zza() {
        N3(3);
    }
}
