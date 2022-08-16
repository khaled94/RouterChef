package m4;

import a6.f;
import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import l3.s;
import n3.g1;
import n3.s1;

/* loaded from: classes.dex */
public final class hz0 extends am0 {

    /* renamed from: i */
    public final Context f9477i;

    /* renamed from: j */
    public final WeakReference<vd0> f9478j;

    /* renamed from: k */
    public final qt0 f9479k;

    /* renamed from: l */
    public final xr0 f9480l;

    /* renamed from: m */
    public final zo0 f9481m;

    /* renamed from: n */
    public final rp0 f9482n;

    /* renamed from: o */
    public final qm0 f9483o;
    public final z60 p;

    /* renamed from: q */
    public final fs1 f9484q;

    /* renamed from: r */
    public boolean f9485r = false;

    public hz0(zl0 zl0Var, Context context, vd0 vd0Var, qt0 qt0Var, xr0 xr0Var, zo0 zo0Var, rp0 rp0Var, qm0 qm0Var, cm1 cm1Var, fs1 fs1Var) {
        super(zl0Var);
        this.f9477i = context;
        this.f9479k = qt0Var;
        this.f9478j = new WeakReference<>(vd0Var);
        this.f9480l = xr0Var;
        this.f9481m = zo0Var;
        this.f9482n = rp0Var;
        this.f9483o = qm0Var;
        this.f9484q = fs1Var;
        k60 k60Var = cm1Var.f7055m;
        this.p = new z60(k60Var != null ? k60Var.f10283s : "", k60Var != null ? k60Var.f10284t : 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.content.Context] */
    public final boolean c(boolean z10, Activity activity) {
        yr<Boolean> yrVar = es.f8158o0;
        jo joVar = jo.f10145d;
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            s1 s1Var = s.B.f5789c;
            if (s1.i(this.f9477i)) {
                g1.j("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f9481m.a();
                if (((Boolean) joVar.f10148c.a(es.f8165p0)).booleanValue()) {
                    this.f9484q.a(this.f6190a.f10489b.f10126b.f8004b);
                }
                return false;
            }
        }
        if (this.f9485r) {
            g1.j("The rewarded ad have been showed.");
            this.f9481m.d(f.n(10, null, null));
            return false;
        }
        this.f9485r = true;
        this.f9480l.M0(wr0.f15096s);
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f9477i;
        }
        try {
            this.f9479k.c(z10, activity2, this.f9481m);
            this.f9480l.M0(vr0.f14773s);
            return true;
        } catch (pt0 e10) {
            this.f9481m.p0(e10);
            return false;
        }
    }

    public final void finalize() {
        try {
            vd0 vd0Var = this.f9478j.get();
            if (((Boolean) jo.f10145d.f10148c.a(es.B4)).booleanValue()) {
                if (!this.f9485r && vd0Var != null) {
                    u90.f14298e.execute(new cj(vd0Var, 5));
                }
            } else if (vd0Var != null) {
                vd0Var.destroy();
            }
        } finally {
            super.finalize();
        }
    }
}
