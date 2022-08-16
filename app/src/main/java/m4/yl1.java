package m4;

import a6.f;
import android.app.Activity;
import android.content.Context;
import d4.m;
import javax.annotation.concurrent.GuardedBy;
import k4.a;
import k4.b;
import l3.s;
import n3.g1;
import n3.s1;

/* loaded from: classes.dex */
public final class yl1 extends o60 {

    /* renamed from: s */
    public final wl1 f15831s;

    /* renamed from: t */
    public final sl1 f15832t;

    /* renamed from: u */
    public final String f15833u;

    /* renamed from: v */
    public final mm1 f15834v;

    /* renamed from: w */
    public final Context f15835w;
    @GuardedBy("this")

    /* renamed from: x */
    public hz0 f15836x;
    @GuardedBy("this")
    public boolean y = ((Boolean) jo.f10145d.f10148c.a(es.f8173q0)).booleanValue();

    public yl1(String str, wl1 wl1Var, Context context, sl1 sl1Var, mm1 mm1Var) {
        this.f15833u = str;
        this.f15831s = wl1Var;
        this.f15832t = sl1Var;
        this.f15834v = mm1Var;
        this.f15835w = context;
    }

    public final synchronized void N3(jn jnVar, v60 v60Var) {
        R3(jnVar, v60Var, 2);
    }

    public final synchronized void O3(jn jnVar, v60 v60Var) {
        R3(jnVar, v60Var, 3);
    }

    public final synchronized void P3(boolean z10) {
        m.d("setImmersiveMode must be called on the main UI thread.");
        this.y = z10;
    }

    public final synchronized void Q3(a aVar, boolean z10) {
        m.d("#008 Must be called on the main UI thread.");
        if (this.f15836x == null) {
            g1.j("Rewarded can not be shown before loaded");
            this.f15832t.d0(f.n(9, null, null));
            return;
        }
        this.f15836x.c(z10, (Activity) b.e0(aVar));
    }

    public final synchronized void R3(jn jnVar, v60 v60Var, int i10) {
        m.d("#008 Must be called on the main UI thread.");
        this.f15832t.f13733u.set(v60Var);
        s1 s1Var = s.B.f5789c;
        if (s1.j(this.f15835w) && jnVar.K == null) {
            g1.g("Failed to load the ad because app ID is missing.");
            this.f15832t.d(f.n(4, null, null));
            return;
        }
        if (this.f15836x != null) {
            return;
        }
        tl1 tl1Var = new tl1();
        wl1 wl1Var = this.f15831s;
        wl1Var.f15049h.f11853o.f9379a = i10;
        wl1Var.a(jnVar, this.f15833u, tl1Var, new bs(this));
    }
}
