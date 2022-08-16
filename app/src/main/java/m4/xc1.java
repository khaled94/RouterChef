package m4;

import a6.f;
import android.content.Context;
import d.a;
import h2.d0;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;
import l3.s;
import n3.g1;
import n3.h;
import n3.s1;

/* loaded from: classes.dex */
public final class xc1 implements uc1<am0> {
    @GuardedBy("this")

    /* renamed from: a */
    public final nm1 f15296a;

    /* renamed from: b */
    public final if0 f15297b;

    /* renamed from: c */
    public final Context f15298c;

    /* renamed from: d */
    public final sc1 f15299d;

    /* renamed from: e */
    public final qp1 f15300e;
    @GuardedBy("this")

    /* renamed from: f */
    public km0 f15301f;

    public xc1(if0 if0Var, Context context, sc1 sc1Var, nm1 nm1Var) {
        this.f15297b = if0Var;
        this.f15298c = context;
        this.f15299d = sc1Var;
        this.f15296a = nm1Var;
        this.f15300e = if0Var.a();
        nm1Var.f11854q = sc1Var.f13591b;
    }

    @Override // m4.uc1
    public final boolean a(jn jnVar, String str, f fVar, tc1<? super am0> tc1Var) {
        op1 g10 = op1.g(this.f15298c, 8, jnVar);
        s1 s1Var = s.B.f5789c;
        if (s1.j(this.f15298c) && jnVar.K == null) {
            g1.g("Failed to load the ad because app ID is missing.");
            this.f15297b.b().execute(new h(this, 1));
            if (g10 != null) {
                qp1 qp1Var = this.f15300e;
                g10.d(false);
                qp1Var.a(g10.f());
            }
            return false;
        } else if (str == null) {
            g1.g("Ad unit ID should not be null for NativeAdLoader.");
            this.f15297b.b().execute(new d0(this, 4));
            if (g10 != null) {
                qp1 qp1Var2 = this.f15300e;
                g10.d(false);
                qp1Var2.a(g10.f());
            }
            return false;
        } else {
            x90.d(this.f15298c, jnVar.f10133x);
            if (((Boolean) jo.f10145d.f10148c.a(es.S5)).booleanValue() && jnVar.f10133x) {
                this.f15297b.p().c(true);
            }
            int i10 = ((vc1) fVar).X;
            nm1 nm1Var = this.f15296a;
            nm1Var.f11839a = jnVar;
            nm1Var.f11851m = i10;
            om1 a10 = nm1Var.a();
            ip ipVar = a10.f12213n;
            if (ipVar != null) {
                this.f15299d.f13591b.f(ipVar);
            }
            bg0 l10 = this.f15297b.l();
            go0 go0Var = new go0();
            go0Var.f8988a = this.f15298c;
            go0Var.f8989b = a10;
            l10.f6512c = new ho0(go0Var);
            cr0 cr0Var = new cr0();
            cr0Var.h(this.f15299d.f13591b, this.f15297b.b());
            l10.f6511b = new dr0(cr0Var);
            sc1 sc1Var = this.f15299d;
            l10.f6513d = new yt0(sc1Var.f13590a, sc1Var.f13591b.a(), 0);
            l10.f6514e = new fk0(null, 0);
            cu0 f10 = l10.f();
            this.f15297b.A().b(1);
            t90 t90Var = u90.f14294a;
            a.d(t90Var);
            ScheduledExecutorService c10 = this.f15297b.c();
            wm0<hm0> a11 = f10.a();
            tz1<hm0> b10 = a11.b(a11.c());
            km0 km0Var = new km0(t90Var, c10, b10);
            this.f15301f = km0Var;
            mz1.t(b10, new jm0(km0Var, new wc1(this, tc1Var, g10, f10)), t90Var);
            return true;
        }
    }

    @Override // m4.uc1
    public final boolean zza() {
        km0 km0Var = this.f15301f;
        return km0Var != null && km0Var.f10487d;
    }
}
