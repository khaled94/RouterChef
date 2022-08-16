package m4;

import a6.f;
import android.content.Context;
import android.widget.FrameLayout;
import d4.m;
import i4.b;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import m4.am0;
import m4.eo0;
import m4.wj0;
import n3.g1;

/* loaded from: classes.dex */
public abstract class sj1<AppOpenAd extends am0, AppOpenRequestComponent extends wj0<AppOpenAd>, AppOpenRequestComponentBuilder extends eo0<AppOpenRequestComponent>> implements uc1<AppOpenAd> {

    /* renamed from: a */
    public final Context f13694a;

    /* renamed from: b */
    public final Executor f13695b;

    /* renamed from: c */
    public final if0 f13696c;

    /* renamed from: d */
    public final vj1 f13697d;

    /* renamed from: e */
    public final dl1<AppOpenRequestComponent, AppOpenAd> f13698e;

    /* renamed from: f */
    public final FrameLayout f13699f;

    /* renamed from: g */
    public final qp1 f13700g;
    @GuardedBy("this")

    /* renamed from: h */
    public final nm1 f13701h;
    @GuardedBy("this")
    @Nullable

    /* renamed from: i */
    public tz1<AppOpenAd> f13702i;

    public sj1(Context context, Executor executor, if0 if0Var, dl1<AppOpenRequestComponent, AppOpenAd> dl1Var, vj1 vj1Var, nm1 nm1Var) {
        this.f13694a = context;
        this.f13695b = executor;
        this.f13696c = if0Var;
        this.f13698e = dl1Var;
        this.f13697d = vj1Var;
        this.f13701h = nm1Var;
        this.f13699f = new FrameLayout(context);
        this.f13700g = if0Var.a();
    }

    @Override // m4.uc1
    public final synchronized boolean a(jn jnVar, String str, f fVar, tc1<? super AppOpenAd> tc1Var) {
        op1 g10 = op1.g(this.f13694a, 7, jnVar);
        m.d("loadAd must be called on the main UI thread.");
        if (str == null) {
            g1.g("Ad unit ID should not be null for app open ad.");
            this.f13695b.execute(new b(this, 3));
            if (g10 != null) {
                qp1 qp1Var = this.f13700g;
                g10.d(false);
                qp1Var.a(g10.f());
            }
            return false;
        } else if (this.f13702i != null) {
            if (g10 != null) {
                qp1 qp1Var2 = this.f13700g;
                g10.d(false);
                qp1Var2.a(g10.f());
            }
            return false;
        } else {
            x90.d(this.f13694a, jnVar.f10133x);
            if (((Boolean) jo.f10145d.f10148c.a(es.S5)).booleanValue() && jnVar.f10133x) {
                this.f13696c.p().c(true);
            }
            nm1 nm1Var = this.f13701h;
            nm1Var.f11841c = str;
            nm1Var.f11840b = new on("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
            nm1Var.f11839a = jnVar;
            om1 a10 = nm1Var.a();
            rj1 rj1Var = new rj1(null);
            rj1Var.f13371a = a10;
            tz1<AppOpenAd> a11 = this.f13698e.a(new el1(rj1Var, null), new u41(this));
            this.f13702i = a11;
            mz1.t(a11, new qj1(this, tc1Var, g10, rj1Var), this.f13695b);
            return true;
        }
    }

    public abstract eo0 b(ho0 ho0Var, dr0 dr0Var);

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashSet, java.util.Set<m4.es0<m4.up0>>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.HashSet, java.util.Set<m4.es0<m3.p>>] */
    public final synchronized AppOpenRequestComponentBuilder c(bl1 bl1Var) {
        rj1 rj1Var = (rj1) bl1Var;
        if (((Boolean) jo.f10145d.f10148c.a(es.f8163o5)).booleanValue()) {
            go0 go0Var = new go0();
            go0Var.f8988a = this.f13694a;
            go0Var.f8989b = rj1Var.f13371a;
            ho0 ho0Var = new ho0(go0Var);
            cr0 cr0Var = new cr0();
            cr0Var.c(this.f13697d, this.f13695b);
            cr0Var.i(this.f13697d, this.f13695b);
            return (AppOpenRequestComponentBuilder) b(ho0Var, new dr0(cr0Var));
        }
        vj1 vj1Var = this.f13697d;
        vj1 vj1Var2 = new vj1(vj1Var.f14702s);
        vj1Var2.f14708z = vj1Var;
        cr0 cr0Var2 = new cr0();
        cr0Var2.b(vj1Var2, this.f13695b);
        cr0Var2.f7121g.add(new es0(vj1Var2, this.f13695b));
        cr0Var2.f7128n.add(new es0(vj1Var2, this.f13695b));
        cr0Var2.f(vj1Var2, this.f13695b);
        cr0Var2.c(vj1Var2, this.f13695b);
        cr0Var2.i(vj1Var2, this.f13695b);
        cr0Var2.f7129o = vj1Var2;
        go0 go0Var2 = new go0();
        go0Var2.f8988a = this.f13694a;
        go0Var2.f8989b = rj1Var.f13371a;
        return (AppOpenRequestComponentBuilder) b(new ho0(go0Var2), new dr0(cr0Var2));
    }

    @Override // m4.uc1
    public final boolean zza() {
        tz1<AppOpenAd> tz1Var = this.f13702i;
        return tz1Var != null && !tz1Var.isDone();
    }
}
