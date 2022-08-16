package m4;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Objects;
import java.util.concurrent.Executor;
import n3.g1;

/* loaded from: classes.dex */
public final class bk1 implements kz1<ik0> {

    /* renamed from: s */
    public final /* synthetic */ tc1 f6552s;

    /* renamed from: t */
    public final /* synthetic */ op1 f6553t;

    /* renamed from: u */
    public final /* synthetic */ dl0 f6554u;

    /* renamed from: v */
    public final /* synthetic */ ck1 f6555v;

    public bk1(ck1 ck1Var, tc1 tc1Var, op1 op1Var, dl0 dl0Var) {
        this.f6555v = ck1Var;
        this.f6552s = tc1Var;
        this.f6553t = op1Var;
        this.f6554u = dl0Var;
    }

    @Override // m4.kz1
    public final void a(Object obj) {
        ik0 ik0Var = (ik0) obj;
        synchronized (this.f6555v) {
            ck1 ck1Var = this.f6555v;
            ck1Var.f7021k = null;
            ck1Var.f7016f.removeAllViews();
            if (ik0Var.d() != null) {
                ViewParent parent = ik0Var.d().getParent();
                if (parent instanceof ViewGroup) {
                    String str = "";
                    oo0 oo0Var = ik0Var.f6195f;
                    if (oo0Var != null) {
                        str = oo0Var.f12238s;
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
                    sb.append("Banner view provided from ");
                    sb.append(str);
                    sb.append(" already has a parent view. Removing its old parent.");
                    g1.j(sb.toString());
                    ((ViewGroup) parent).removeView(ik0Var.d());
                }
            }
            yr<Boolean> yrVar = es.f8155n5;
            jo joVar = jo.f10145d;
            if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
                w3 w3Var = ik0Var.f6196g.f12264s;
                w3Var.b(this.f6555v.f7014d);
                ((oq0) w3Var.f14854s).f12266u = this.f6555v.f7015e;
            }
            this.f6555v.f7016f.addView(ik0Var.d());
            this.f6552s.a(ik0Var);
            if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
                ck1 ck1Var2 = this.f6555v;
                Executor executor = ck1Var2.f7012b;
                final lc1 lc1Var = ck1Var2.f7014d;
                Objects.requireNonNull(lc1Var);
                executor.execute(new Runnable() { // from class: m4.ak1
                    @Override // java.lang.Runnable
                    public final void run() {
                        lc1.this.j();
                    }
                });
            }
            this.f6555v.f7018h.O0(ik0Var.c());
            op1 op1Var = this.f6553t;
            if (op1Var != null) {
                qp1 qp1Var = this.f6555v.f7019i;
                op1Var.b(ik0Var.f6190a.f10489b);
                op1Var.c(ik0Var.f6195f.f12238s);
                op1Var.d(true);
                qp1Var.a(op1Var.f());
            }
        }
    }

    @Override // m4.kz1
    public final void f(Throwable th) {
        cn a10 = this.f6554u.c().a(th);
        synchronized (this.f6555v) {
            this.f6555v.f7021k = null;
            this.f6554u.d().d(a10);
            if (((Boolean) jo.f10145d.f10148c.a(es.f8155n5)).booleanValue()) {
                this.f6555v.f7012b.execute(new nz(this, a10, 2));
            }
            this.f6555v.f7018h.O0(60);
            x90.i(a10.f7067s, th, "BannerAdLoader.onFailure");
            this.f6552s.mo22zza();
            op1 op1Var = this.f6553t;
            if (op1Var != null) {
                qp1 qp1Var = this.f6555v.f7019i;
                op1Var.a(a10);
                op1Var.d(false);
                qp1Var.a(op1Var.f());
            }
        }
    }
}
