package m4;

import android.os.SystemClock;
import java.util.Objects;
import l3.s;
import n3.k1;

/* loaded from: classes.dex */
public final class u51 implements ur0 {

    /* renamed from: u */
    public final String f14257u;

    /* renamed from: v */
    public final ep1 f14258v;

    /* renamed from: s */
    public boolean f14255s = false;

    /* renamed from: t */
    public boolean f14256t = false;

    /* renamed from: w */
    public final k1 f14259w = (k1) s.B.f5793g.c();

    public u51(String str, ep1 ep1Var) {
        this.f14257u = str;
        this.f14258v = ep1Var;
    }

    @Override // m4.ur0
    public final void X(String str) {
        ep1 ep1Var = this.f14258v;
        dp1 a10 = a("adapter_init_finished");
        a10.a("ancn", str);
        ep1Var.a(a10);
    }

    public final dp1 a(String str) {
        String str2 = this.f14259w.J() ? "" : this.f14257u;
        dp1 b10 = dp1.b(str);
        Objects.requireNonNull(s.B.f5796j);
        b10.a("tms", Long.toString(SystemClock.elapsedRealtime(), 10));
        b10.a("tid", str2);
        return b10;
    }

    @Override // m4.ur0
    public final synchronized void b() {
        if (!this.f14255s) {
            this.f14258v.a(a("init_started"));
            this.f14255s = true;
        }
    }

    @Override // m4.ur0
    public final void e(String str, String str2) {
        ep1 ep1Var = this.f14258v;
        dp1 a10 = a("adapter_init_finished");
        a10.a("ancn", str);
        a10.a("rqe", str2);
        ep1Var.a(a10);
    }

    @Override // m4.ur0
    public final synchronized void g() {
        if (!this.f14256t) {
            this.f14258v.a(a("init_finished"));
            this.f14256t = true;
        }
    }

    @Override // m4.ur0
    public final void z(String str) {
        ep1 ep1Var = this.f14258v;
        dp1 a10 = a("adapter_init_started");
        a10.a("ancn", str);
        ep1Var.a(a10);
    }
}
