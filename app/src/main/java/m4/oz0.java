package m4;

import java.util.HashSet;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import l3.l;
import p1.t;
import t3.b0;

/* loaded from: classes.dex */
public final class oz0 implements l, kz1, wy1, v91 {

    /* renamed from: s */
    public final /* synthetic */ Object f12315s;

    public /* synthetic */ oz0(Object obj) {
        this.f12315s = obj;
    }

    @Override // l3.l
    public final void M0() {
        cq0 cq0Var = ((yz0) this.f12315s).f15931g;
        synchronized (cq0Var) {
            if (!cq0Var.f7110x) {
                ScheduledFuture<?> scheduledFuture = cq0Var.y;
                if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                    cq0Var.f7109w = -1L;
                } else {
                    cq0Var.y.cancel(true);
                    cq0Var.f7109w = cq0Var.f7108v - cq0Var.f7107u.b();
                }
                cq0Var.f7110x = true;
            }
        }
    }

    @Override // m4.kz1
    public final void a(Object obj) {
        km1 km1Var = (km1) obj;
        if (((Boolean) jo.f10145d.f10148c.a(es.Z3)).booleanValue()) {
            i61 i61Var = ((x31) this.f12315s).f15220e;
            int i10 = km1Var.f10489b.f10126b.f8007e;
            synchronized (i61Var.f9541e) {
                i61Var.f9537a = i10;
            }
            i61 i61Var2 = ((x31) this.f12315s).f15220e;
            long j3 = km1Var.f10489b.f10126b.f8008f;
            synchronized (i61Var2.f9542f) {
                i61Var2.f9538b = j3;
            }
        }
    }

    @Override // m4.kz1
    public final void f(Throwable th) {
        if (((Boolean) jo.f10145d.f10148c.a(es.Z3)).booleanValue()) {
            Matcher matcher = x31.f15215f.matcher(th.getMessage());
            if (!matcher.matches()) {
                return;
            }
            String group = matcher.group(1);
            i61 i61Var = ((x31) this.f12315s).f15220e;
            int parseInt = Integer.parseInt(group);
            synchronized (i61Var.f9541e) {
                i61Var.f9537a = parseInt;
            }
        }
    }

    @Override // l3.l
    public final void g() {
        cq0 cq0Var = ((yz0) this.f12315s).f15931g;
        synchronized (cq0Var) {
            if (cq0Var.f7110x) {
                if (cq0Var.f7109w > 0 && cq0Var.y.isCancelled()) {
                    cq0Var.P0(cq0Var.f7109w);
                }
                cq0Var.f7110x = false;
            }
        }
    }

    @Override // m4.v91
    public final void h(Object obj) {
        ((rx) obj).M(((ze2) this.f12315s).f16177m);
    }

    @Override // m4.wy1
    public final tz1 zza() {
        rg1 rg1Var = (rg1) this.f12315s;
        String str = rg1Var.f13323a;
        yr<Boolean> yrVar = es.P4;
        jo joVar = jo.f10145d;
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            str = "UNKNOWN";
        }
        fu1 s10 = rg1Var.f13328f.s();
        go0 go0Var = new go0();
        go0Var.f8988a = rg1Var.f13326d;
        nm1 nm1Var = new nm1();
        nm1Var.f11841c = "adUnitId";
        nm1Var.f11839a = rg1Var.f13327e.f12203d;
        nm1Var.f11840b = new on();
        go0Var.f8989b = nm1Var.a();
        s10.f8649c = new ho0(go0Var);
        t tVar = new t();
        tVar.f16942s = str;
        s10.f8650d = new b0(tVar);
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        return mz1.i(mz1.o((gz1) mz1.q(gz1.r(s10.a().a()), ((Long) joVar.f10148c.a(es.Q4)).longValue(), TimeUnit.MILLISECONDS, rg1Var.f13325c), og1.f12158a, rg1Var.f13324b), Exception.class, pg1.f12508a, rg1Var.f13324b);
    }
}
