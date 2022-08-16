package y4;

import a4.j;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import d4.m;
import h2.n;
import h4.c;
import h4.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import m4.oe;
import m4.pe;
import m4.t61;
import m4.v3;
import m4.vu0;

/* loaded from: classes.dex */
public final class h3 extends i1 {

    /* renamed from: s */
    public final a6 f20483s;

    /* renamed from: t */
    public Boolean f20484t;

    /* renamed from: u */
    public String f20485u = null;

    public h3(a6 a6Var) {
        Objects.requireNonNull(a6Var, "null reference");
        this.f20483s = a6Var;
    }

    @Override // y4.j1
    public final void A0(k6 k6Var) {
        Z1(k6Var);
        E1(new oe(this, k6Var, 5));
    }

    @Override // y4.j1
    public final void A3(k6 k6Var) {
        Z1(k6Var);
        E1(new vu0(this, k6Var, 2, null));
    }

    public final void E1(Runnable runnable) {
        if (this.f20483s.B().s()) {
            runnable.run();
        } else {
            this.f20483s.B().q(runnable);
        }
    }

    @Override // y4.j1
    public final void I1(k6 k6Var) {
        m.e(k6Var.f20535s);
        m.h(k6Var.N);
        pe peVar = new pe(this, k6Var, 3);
        if (this.f20483s.B().s()) {
            peVar.run();
        } else {
            this.f20483s.B().r(peVar);
        }
    }

    @Override // y4.j1
    public final List<b> K3(String str, String str2, k6 k6Var) {
        Z1(k6Var);
        String str3 = k6Var.f20535s;
        m.h(str3);
        try {
            return (List) ((FutureTask) this.f20483s.B().o(new b3(this, str3, str, str2))).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f20483s.C().f20710x.b("Failed to get conditional user properties", e10);
            return Collections.emptyList();
        }
    }

    @Override // y4.j1
    public final void L0(p pVar, k6 k6Var) {
        Objects.requireNonNull(pVar, "null reference");
        Z1(k6Var);
        E1(new d3(this, pVar, k6Var));
    }

    @Override // y4.j1
    public final void P2(d6 d6Var, k6 k6Var) {
        Objects.requireNonNull(d6Var, "null reference");
        Z1(k6Var);
        E1(new t61(this, d6Var, k6Var));
    }

    @Override // y4.j1
    public final byte[] S1(p pVar, String str) {
        m.e(str);
        Objects.requireNonNull(pVar, "null reference");
        c0(str, true);
        this.f20483s.C().E.b("Log and bundle. event", this.f20483s.D.E.d(pVar.f20634s));
        Objects.requireNonNull((c) this.f20483s.c());
        long nanoTime = System.nanoTime() / 1000000;
        u2 B = this.f20483s.B();
        e3 e3Var = new e3(this, pVar, str);
        B.j();
        s2<?> s2Var = new s2<>(B, e3Var, true);
        if (Thread.currentThread() == B.f20750u) {
            s2Var.run();
        } else {
            B.t(s2Var);
        }
        try {
            byte[] bArr = (byte[]) s2Var.get();
            if (bArr == null) {
                this.f20483s.C().f20710x.b("Log and bundle returned null. appId", s1.s(str));
                bArr = new byte[0];
            }
            Objects.requireNonNull((c) this.f20483s.c());
            this.f20483s.C().E.d("Log and bundle processed. event, size, time_ms", this.f20483s.D.E.d(pVar.f20634s), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e10) {
            this.f20483s.C().f20710x.d("Failed to log and bundle. appId, event, error", s1.s(str), this.f20483s.D.E.d(pVar.f20634s), e10);
            return null;
        }
    }

    @Override // y4.j1
    public final List<b> V1(String str, String str2, String str3) {
        c0(str, true);
        try {
            return (List) ((FutureTask) this.f20483s.B().o(new c3(this, str, str2, str3))).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f20483s.C().f20710x.b("Failed to get conditional user properties as", e10);
            return Collections.emptyList();
        }
    }

    public final void Z1(k6 k6Var) {
        Objects.requireNonNull(k6Var, "null reference");
        m.e(k6Var.f20535s);
        c0(k6Var.f20535s, false);
        this.f20483s.Q().K(k6Var.f20536t, k6Var.I, k6Var.M);
    }

    @Override // y4.j1
    public final List<d6> a2(String str, String str2, boolean z10, k6 k6Var) {
        Z1(k6Var);
        String str3 = k6Var.f20535s;
        m.h(str3);
        try {
            List<f6> list = (List) ((FutureTask) this.f20483s.B().o(new y2(this, str3, str, str2))).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (f6 f6Var : list) {
                if (z10 || !h6.V(f6Var.f20458c)) {
                    arrayList.add(new d6(f6Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f20483s.C().f20710x.c("Failed to query user properties. appId", s1.s(k6Var.f20535s), e10);
            return Collections.emptyList();
        }
    }

    public final void c0(String str, boolean z10) {
        boolean z11;
        if (TextUtils.isEmpty(str)) {
            this.f20483s.C().f20710x.a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z10) {
            try {
                if (this.f20484t == null) {
                    if (!"com.google.android.gms".equals(this.f20485u) && !i.a(this.f20483s.D.f20786s, Binder.getCallingUid()) && !j.a(this.f20483s.D.f20786s).b(Binder.getCallingUid())) {
                        z11 = false;
                        this.f20484t = Boolean.valueOf(z11);
                    }
                    z11 = true;
                    this.f20484t = Boolean.valueOf(z11);
                }
                if (this.f20484t.booleanValue()) {
                    return;
                }
            } catch (SecurityException e10) {
                this.f20483s.C().f20710x.b("Measurement Service called with invalid calling package. appId", s1.s(str));
                throw e10;
            }
        }
        if (this.f20485u == null) {
            Context context = this.f20483s.D.f20786s;
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = a4.i.f139a;
            if (i.b(context, callingUid, str)) {
                this.f20485u = str;
            }
        }
        if (str.equals(this.f20485u)) {
            return;
        }
        throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
    }

    @Override // y4.j1
    public final List<d6> d1(String str, String str2, String str3, boolean z10) {
        c0(str, true);
        try {
            List<f6> list = (List) ((FutureTask) this.f20483s.B().o(new a3(this, str, str2, str3))).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (f6 f6Var : list) {
                if (z10 || !h6.V(f6Var.f20458c)) {
                    arrayList.add(new d6(f6Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f20483s.C().f20710x.c("Failed to get user properties as. appId", s1.s(str), e10);
            return Collections.emptyList();
        }
    }

    public final void e0(p pVar, k6 k6Var) {
        this.f20483s.a();
        this.f20483s.g(pVar, k6Var);
    }

    @Override // y4.j1
    public final void f3(Bundle bundle, k6 k6Var) {
        Z1(k6Var);
        String str = k6Var.f20535s;
        m.h(str);
        E1(new v3(this, str, bundle, 2));
    }

    @Override // y4.j1
    public final String p2(k6 k6Var) {
        Z1(k6Var);
        a6 a6Var = this.f20483s;
        try {
            return (String) ((FutureTask) a6Var.B().o(new x5(a6Var, k6Var))).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            a6Var.C().f20710x.c("Failed to get app instance id. appId", s1.s(k6Var.f20535s), e10);
            return null;
        }
    }

    @Override // y4.j1
    public final void x1(b bVar, k6 k6Var) {
        Objects.requireNonNull(bVar, "null reference");
        m.h(bVar.f20301u);
        Z1(k6Var);
        b bVar2 = new b(bVar);
        bVar2.f20299s = k6Var.f20535s;
        E1(new x2(this, bVar2, k6Var));
    }

    @Override // y4.j1
    public final void x2(k6 k6Var) {
        m.e(k6Var.f20535s);
        c0(k6Var.f20535s, false);
        E1(new n(this, k6Var, 4, null));
    }

    @Override // y4.j1
    public final void z0(long j3, String str, String str2, String str3) {
        E1(new g3(this, str2, str3, str, j3));
    }
}
