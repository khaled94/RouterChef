package m4;

import android.content.Context;
import android.text.TextUtils;
import java.util.Objects;
import java.util.regex.Pattern;
import l3.s;
import l4.b;
import n3.s1;

/* loaded from: classes.dex */
public final class y01 implements uq0, ym, ep0, wo0 {

    /* renamed from: s */
    public final Context f15550s;

    /* renamed from: t */
    public final wm1 f15551t;

    /* renamed from: u */
    public final f11 f15552u;

    /* renamed from: v */
    public final km1 f15553v;

    /* renamed from: w */
    public final cm1 f15554w;

    /* renamed from: x */
    public final v61 f15555x;
    public Boolean y;

    /* renamed from: z */
    public final boolean f15556z = ((Boolean) jo.f10145d.f10148c.a(es.E4)).booleanValue();

    public y01(Context context, wm1 wm1Var, f11 f11Var, km1 km1Var, cm1 cm1Var, v61 v61Var) {
        this.f15550s = context;
        this.f15551t = wm1Var;
        this.f15552u = f11Var;
        this.f15553v = km1Var;
        this.f15554w = cm1Var;
        this.f15555x = v61Var;
    }

    @Override // m4.ym
    public final void N() {
        if (!this.f15554w.f7045g0) {
            return;
        }
        e(b("click"));
    }

    @Override // m4.wo0
    public final void a() {
        if (!this.f15556z) {
            return;
        }
        e11 b10 = b("ifts");
        b10.a("reason", "blocked");
        b10.c();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.concurrent.ConcurrentHashMap] */
    public final e11 b(String str) {
        e11 a10 = this.f15552u.a();
        a10.b(this.f15553v.f10489b.f10126b);
        a10.f7689a.put("aai", this.f15554w.f7065x);
        a10.a("action", str);
        if (!this.f15554w.f7062u.isEmpty()) {
            a10.a("ancn", this.f15554w.f7062u.get(0));
        }
        if (this.f15554w.f7045g0) {
            s sVar = s.B;
            s1 s1Var = sVar.f5789c;
            a10.a("device_connectivity", true != s1.h(this.f15550s) ? "offline" : "online");
            Objects.requireNonNull(sVar.f5796j);
            a10.a("event_timestamp", String.valueOf(System.currentTimeMillis()));
            a10.a("offline_ad", "1");
        }
        if (((Boolean) jo.f10145d.f10148c.a(es.N4)).booleanValue()) {
            boolean u10 = b.u(this.f15553v);
            a10.a("scar", String.valueOf(u10));
            if (u10) {
                String q10 = b.q(this.f15553v);
                if (!TextUtils.isEmpty(q10)) {
                    a10.a("ragent", q10);
                }
                String m10 = b.m(this.f15553v);
                if (!TextUtils.isEmpty(m10)) {
                    a10.a("rtype", m10);
                }
            }
        }
        return a10;
    }

    @Override // m4.uq0
    public final void c() {
        if (!f()) {
            return;
        }
        b("adapter_shown").c();
    }

    @Override // m4.wo0
    public final void d(cn cnVar) {
        cn cnVar2;
        if (!this.f15556z) {
            return;
        }
        e11 b10 = b("ifts");
        b10.a("reason", "adapter");
        int i10 = cnVar.f7067s;
        String str = cnVar.f7068t;
        if (cnVar.f7069u.equals("com.google.android.gms.ads") && (cnVar2 = cnVar.f7070v) != null && !cnVar2.f7069u.equals("com.google.android.gms.ads")) {
            cn cnVar3 = cnVar.f7070v;
            i10 = cnVar3.f7067s;
            str = cnVar3.f7068t;
        }
        if (i10 >= 0) {
            b10.a("arec", String.valueOf(i10));
        }
        String a10 = this.f15551t.a(str);
        if (a10 != null) {
            b10.a("areec", a10);
        }
        b10.c();
    }

    public final void e(e11 e11Var) {
        if (!this.f15554w.f7045g0) {
            e11Var.c();
            return;
        }
        j11 j11Var = e11Var.f7690b.f8318a;
        String a10 = j11Var.f10240e.a(e11Var.f7689a);
        Objects.requireNonNull(s.B.f5796j);
        this.f15555x.c(new w61(System.currentTimeMillis(), this.f15553v.f10489b.f10126b.f8004b, a10, 2));
    }

    public final boolean f() {
        if (this.y == null) {
            synchronized (this) {
                if (this.y == null) {
                    String str = (String) jo.f10145d.f10148c.a(es.W0);
                    s1 s1Var = s.B.f5789c;
                    String L = s1.L(this.f15550s);
                    boolean z10 = false;
                    if (str != null) {
                        try {
                            z10 = Pattern.matches(str, L);
                        } catch (RuntimeException e10) {
                            s.B.f5793g.g(e10, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.y = Boolean.valueOf(z10);
                }
            }
        }
        return this.y.booleanValue();
    }

    @Override // m4.uq0
    public final void g() {
        if (!f()) {
            return;
        }
        b("adapter_impression").c();
    }

    @Override // m4.ep0
    public final void l() {
        if (f() || this.f15554w.f7045g0) {
            e(b("impression"));
        }
    }

    @Override // m4.wo0
    public final void p0(pt0 pt0Var) {
        if (!this.f15556z) {
            return;
        }
        e11 b10 = b("ifts");
        b10.a("reason", "exception");
        if (!TextUtils.isEmpty(pt0Var.getMessage())) {
            b10.a("msg", pt0Var.getMessage());
        }
        b10.c();
    }
}
