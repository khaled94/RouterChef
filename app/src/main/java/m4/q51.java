package m4;

import android.content.Context;
import android.text.TextUtils;
import java.util.Objects;
import java.util.regex.Pattern;
import l3.s;
import n3.s1;

/* loaded from: classes.dex */
public final class q51 implements uq0, ym, ep0, wo0 {
    public final String A;

    /* renamed from: s */
    public final Context f12707s;

    /* renamed from: t */
    public final wm1 f12708t;

    /* renamed from: u */
    public final km1 f12709u;

    /* renamed from: v */
    public final cm1 f12710v;

    /* renamed from: w */
    public final v61 f12711w;

    /* renamed from: x */
    public Boolean f12712x;
    public final boolean y = ((Boolean) jo.f10145d.f10148c.a(es.E4)).booleanValue();

    /* renamed from: z */
    public final ep1 f12713z;

    public q51(Context context, wm1 wm1Var, km1 km1Var, cm1 cm1Var, v61 v61Var, ep1 ep1Var, String str) {
        this.f12707s = context;
        this.f12708t = wm1Var;
        this.f12709u = km1Var;
        this.f12710v = cm1Var;
        this.f12711w = v61Var;
        this.f12713z = ep1Var;
        this.A = str;
    }

    @Override // m4.ym
    public final void N() {
        if (!this.f12710v.f7045g0) {
            return;
        }
        e(b("click"));
    }

    @Override // m4.wo0
    public final void a() {
        if (!this.y) {
            return;
        }
        ep1 ep1Var = this.f12713z;
        dp1 b10 = b("ifts");
        b10.a("reason", "blocked");
        ep1Var.a(b10);
    }

    public final dp1 b(String str) {
        dp1 b10 = dp1.b(str);
        b10.f(this.f12709u, null);
        b10.f7586a.put("aai", this.f12710v.f7065x);
        b10.a("request_id", this.A);
        if (!this.f12710v.f7062u.isEmpty()) {
            b10.a("ancn", this.f12710v.f7062u.get(0));
        }
        if (this.f12710v.f7045g0) {
            s sVar = s.B;
            s1 s1Var = sVar.f5789c;
            b10.a("device_connectivity", true != s1.h(this.f12707s) ? "offline" : "online");
            Objects.requireNonNull(sVar.f5796j);
            b10.a("event_timestamp", String.valueOf(System.currentTimeMillis()));
            b10.a("offline_ad", "1");
        }
        return b10;
    }

    @Override // m4.uq0
    public final void c() {
        if (!f()) {
            return;
        }
        this.f12713z.a(b("adapter_shown"));
    }

    @Override // m4.wo0
    public final void d(cn cnVar) {
        cn cnVar2;
        if (!this.y) {
            return;
        }
        int i10 = cnVar.f7067s;
        String str = cnVar.f7068t;
        if (cnVar.f7069u.equals("com.google.android.gms.ads") && (cnVar2 = cnVar.f7070v) != null && !cnVar2.f7069u.equals("com.google.android.gms.ads")) {
            cn cnVar3 = cnVar.f7070v;
            i10 = cnVar3.f7067s;
            str = cnVar3.f7068t;
        }
        String a10 = this.f12708t.a(str);
        dp1 b10 = b("ifts");
        b10.a("reason", "adapter");
        if (i10 >= 0) {
            b10.a("arec", String.valueOf(i10));
        }
        if (a10 != null) {
            b10.a("areec", a10);
        }
        this.f12713z.a(b10);
    }

    public final void e(dp1 dp1Var) {
        if (!this.f12710v.f7045g0) {
            this.f12713z.a(dp1Var);
            return;
        }
        String b10 = this.f12713z.b(dp1Var);
        Objects.requireNonNull(s.B.f5796j);
        this.f12711w.c(new w61(System.currentTimeMillis(), this.f12709u.f10489b.f10126b.f8004b, b10, 2));
    }

    public final boolean f() {
        if (this.f12712x == null) {
            synchronized (this) {
                if (this.f12712x == null) {
                    String str = (String) jo.f10145d.f10148c.a(es.W0);
                    s1 s1Var = s.B.f5789c;
                    String L = s1.L(this.f12707s);
                    boolean z10 = false;
                    if (str != null) {
                        try {
                            z10 = Pattern.matches(str, L);
                        } catch (RuntimeException e10) {
                            s.B.f5793g.g(e10, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f12712x = Boolean.valueOf(z10);
                }
            }
        }
        return this.f12712x.booleanValue();
    }

    @Override // m4.uq0
    public final void g() {
        if (!f()) {
            return;
        }
        this.f12713z.a(b("adapter_impression"));
    }

    @Override // m4.ep0
    public final void l() {
        if (f() || this.f12710v.f7045g0) {
            e(b("impression"));
        }
    }

    @Override // m4.wo0
    public final void p0(pt0 pt0Var) {
        if (!this.y) {
            return;
        }
        dp1 b10 = b("ifts");
        b10.a("reason", "exception");
        if (!TextUtils.isEmpty(pt0Var.getMessage())) {
            b10.a("msg", pt0Var.getMessage());
        }
        this.f12713z.a(b10);
    }
}
