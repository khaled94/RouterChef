package m4;

import a6.f;
import android.content.Context;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import m3.h;
import n3.g1;

/* loaded from: classes.dex */
public final class ll1 implements uc1<xs0> {

    /* renamed from: a */
    public final Context f10908a;

    /* renamed from: b */
    public final Executor f10909b;

    /* renamed from: c */
    public final if0 f10910c;

    /* renamed from: d */
    public final lc1 f10911d;

    /* renamed from: e */
    public final sl1 f10912e;

    /* renamed from: f */
    public vs f10913f;

    /* renamed from: g */
    public final qp1 f10914g;
    @GuardedBy("this")

    /* renamed from: h */
    public final nm1 f10915h;
    @GuardedBy("this")

    /* renamed from: i */
    public tz1<xs0> f10916i;

    public ll1(Context context, Executor executor, if0 if0Var, lc1 lc1Var, sl1 sl1Var, nm1 nm1Var) {
        this.f10908a = context;
        this.f10909b = executor;
        this.f10910c = if0Var;
        this.f10911d = lc1Var;
        this.f10915h = nm1Var;
        this.f10912e = sl1Var;
        this.f10914g = if0Var.a();
    }

    @Override // m4.uc1
    public final boolean a(jn jnVar, String str, f fVar, tc1<? super xs0> tc1Var) {
        nt0 nt0Var;
        op1 g10 = op1.g(this.f10908a, 4, jnVar);
        if (str == null) {
            g1.g("Ad unit ID should not be null for interstitial ad.");
            this.f10909b.execute(new h(this, 5));
            if (g10 != null) {
                qp1 qp1Var = this.f10914g;
                g10.d(false);
                qp1Var.a(g10.f());
            }
            return false;
        } else if (zza()) {
            if (g10 != null) {
                qp1 qp1Var2 = this.f10914g;
                g10.d(false);
                qp1Var2.a(g10.f());
            }
            return false;
        } else {
            yr<Boolean> yrVar = es.S5;
            jo joVar = jo.f10145d;
            if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue() && jnVar.f10133x) {
                this.f10910c.p().c(true);
            }
            on onVar = ((jl1) fVar).X;
            nm1 nm1Var = this.f10915h;
            nm1Var.f11841c = str;
            nm1Var.f11840b = onVar;
            nm1Var.f11839a = jnVar;
            om1 a10 = nm1Var.a();
            if (((Boolean) joVar.f10148c.a(es.f8170p5)).booleanValue()) {
                xg0 k10 = this.f10910c.k();
                go0 go0Var = new go0();
                go0Var.f8988a = this.f10908a;
                go0Var.f8989b = a10;
                k10.f15328c = new ho0(go0Var);
                cr0 cr0Var = new cr0();
                cr0Var.g(this.f10911d, this.f10909b);
                cr0Var.h(this.f10911d, this.f10909b);
                k10.f15327b = new dr0(cr0Var);
                k10.f15329d = new rb1(this.f10913f, 0);
                nt0Var = k10.f();
            } else {
                cr0 cr0Var2 = new cr0();
                sl1 sl1Var = this.f10912e;
                if (sl1Var != null) {
                    cr0Var2.d(sl1Var, this.f10909b);
                    cr0Var2.e(this.f10912e, this.f10909b);
                    cr0Var2.b(this.f10912e, this.f10909b);
                }
                xg0 k11 = this.f10910c.k();
                go0 go0Var2 = new go0();
                go0Var2.f8988a = this.f10908a;
                go0Var2.f8989b = a10;
                k11.f15328c = new ho0(go0Var2);
                cr0Var2.g(this.f10911d, this.f10909b);
                cr0Var2.d(this.f10911d, this.f10909b);
                cr0Var2.e(this.f10911d, this.f10909b);
                cr0Var2.b(this.f10911d, this.f10909b);
                cr0Var2.a(this.f10911d, this.f10909b);
                cr0Var2.i(this.f10911d, this.f10909b);
                cr0Var2.h(this.f10911d, this.f10909b);
                cr0Var2.f(this.f10911d, this.f10909b);
                cr0Var2.c(this.f10911d, this.f10909b);
                k11.f15327b = new dr0(cr0Var2);
                k11.f15329d = new rb1(this.f10913f, 0);
                nt0Var = k11.f();
            }
            wm0<xs0> a11 = nt0Var.a();
            tz1<xs0> b10 = a11.b(a11.c());
            this.f10916i = (mo1) b10;
            mz1.t(b10, new kl1(this, tc1Var, g10, nt0Var), this.f10909b);
            return true;
        }
    }

    @Override // m4.uc1
    public final boolean zza() {
        tz1<xs0> tz1Var = this.f10916i;
        return tz1Var != null && !tz1Var.isDone();
    }
}
