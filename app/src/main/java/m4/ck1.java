package m4;

import a6.f;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import l3.s;
import n3.g1;
import n3.s1;

/* loaded from: classes.dex */
public final class ck1 implements uc1<ik0> {

    /* renamed from: a */
    public final Context f7011a;

    /* renamed from: b */
    public final Executor f7012b;

    /* renamed from: c */
    public final if0 f7013c;

    /* renamed from: d */
    public final lc1 f7014d;

    /* renamed from: e */
    public final nc1 f7015e;

    /* renamed from: f */
    public final FrameLayout f7016f;

    /* renamed from: g */
    public vs f7017g;

    /* renamed from: h */
    public final cq0 f7018h;

    /* renamed from: i */
    public final qp1 f7019i;
    @GuardedBy("this")

    /* renamed from: j */
    public final nm1 f7020j;
    @GuardedBy("this")

    /* renamed from: k */
    public tz1<ik0> f7021k;

    public ck1(Context context, Executor executor, on onVar, if0 if0Var, lc1 lc1Var, nc1 nc1Var, nm1 nm1Var) {
        this.f7011a = context;
        this.f7012b = executor;
        this.f7013c = if0Var;
        this.f7014d = lc1Var;
        this.f7015e = nc1Var;
        this.f7020j = nm1Var;
        this.f7018h = if0Var.j();
        this.f7019i = if0Var.a();
        this.f7016f = new FrameLayout(context);
        nm1Var.f11840b = onVar;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.HashSet, java.util.Set<m4.es0<m4.ep0>>] */
    @Override // m4.uc1
    public final boolean a(jn jnVar, String str, f fVar, tc1<? super ik0> tc1Var) {
        mg0 mg0Var;
        fk0 fk0Var;
        op1 g10 = op1.g(this.f7011a, 3, jnVar);
        if (str == null) {
            g1.g("Ad unit ID should not be null for banner ad.");
            this.f7012b.execute(new gr(this, 2));
            if (g10 != null) {
                qp1 qp1Var = this.f7019i;
                g10.d(false);
                qp1Var.a(g10.f());
            }
            return false;
        } else if (zza()) {
            if (g10 != null) {
                qp1 qp1Var2 = this.f7019i;
                g10.d(false);
                qp1Var2.a(g10.f());
            }
            return false;
        } else {
            yr<Boolean> yrVar = es.S5;
            jo joVar = jo.f10145d;
            if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue() && jnVar.f10133x) {
                this.f7013c.p().c(true);
            }
            nm1 nm1Var = this.f7020j;
            nm1Var.f11841c = str;
            nm1Var.f11839a = jnVar;
            om1 a10 = nm1Var.a();
            if (rt.f13428b.e().booleanValue() && this.f7020j.f11840b.C) {
                lc1 lc1Var = this.f7014d;
                if (lc1Var != null) {
                    lc1Var.d(f.n(7, null, null));
                }
                if (g10 != null) {
                    qp1 qp1Var3 = this.f7019i;
                    g10.d(false);
                    qp1Var3.a(g10.f());
                }
                return false;
            }
            if (((Boolean) joVar.f10148c.a(es.f8155n5)).booleanValue()) {
                mg0Var = this.f7013c.i();
                go0 go0Var = new go0();
                go0Var.f8988a = this.f7011a;
                go0Var.f8989b = a10;
                mg0Var.f11187c = new ho0(go0Var);
                cr0 cr0Var = new cr0();
                cr0Var.g(this.f7014d, this.f7012b);
                cr0Var.h(this.f7014d, this.f7012b);
                mg0Var.f11186b = new dr0(cr0Var);
                mg0Var.f11188d = new rb1(this.f7017g, 0);
                mg0Var.f11191g = new yt0(lv0.f11029h, null, 0);
                mg0Var.f11189e = new ul0(this.f7018h, 0);
                fk0Var = new fk0(this.f7016f, 0);
            } else {
                mg0Var = this.f7013c.i();
                go0 go0Var2 = new go0();
                go0Var2.f8988a = this.f7011a;
                go0Var2.f8989b = a10;
                mg0Var.f11187c = new ho0(go0Var2);
                cr0 cr0Var2 = new cr0();
                cr0Var2.g(this.f7014d, this.f7012b);
                cr0Var2.a(this.f7014d, this.f7012b);
                cr0Var2.a(this.f7015e, this.f7012b);
                cr0Var2.i(this.f7014d, this.f7012b);
                cr0Var2.f7120f.add(new es0(this.f7014d, this.f7012b));
                cr0Var2.d(this.f7014d, this.f7012b);
                cr0Var2.e(this.f7014d, this.f7012b);
                cr0Var2.b(this.f7014d, this.f7012b);
                cr0Var2.h(this.f7014d, this.f7012b);
                cr0Var2.f(this.f7014d, this.f7012b);
                mg0Var.f11186b = new dr0(cr0Var2);
                mg0Var.f11188d = new rb1(this.f7017g, 0);
                mg0Var.f11191g = new yt0(lv0.f11029h, null, 0);
                mg0Var.f11189e = new ul0(this.f7018h, 0);
                fk0Var = new fk0(this.f7016f, 0);
            }
            mg0Var.f11190f = fk0Var;
            dl0 f10 = mg0Var.f();
            wm0<ik0> c10 = f10.c();
            tz1<ik0> b10 = c10.b(c10.c());
            this.f7021k = (mo1) b10;
            mz1.t(b10, new bk1(this, tc1Var, g10, f10), this.f7012b);
            return true;
        }
    }

    public final boolean b() {
        ViewParent parent = this.f7016f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        s1 s1Var = s.B.f5789c;
        Context context = view.getContext();
        Context applicationContext = context.getApplicationContext();
        KeyguardManager keyguardManager = null;
        PowerManager powerManager = applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null;
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            keyguardManager = (KeyguardManager) systemService;
        }
        return s1.t(view, powerManager, keyguardManager);
    }

    @Override // m4.uc1
    public final boolean zza() {
        tz1<ik0> tz1Var = this.f7021k;
        return tz1Var != null && !tz1Var.isDone();
    }
}
