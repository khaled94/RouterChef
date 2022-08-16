package m4;

import a6.f;
import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;
import l3.s;
import n3.g1;
import n3.s1;

/* loaded from: classes.dex */
public final class xs0 extends am0 {

    /* renamed from: i */
    public final Context f15461i;

    /* renamed from: j */
    public final WeakReference<vd0> f15462j;

    /* renamed from: k */
    public final xr0 f15463k;

    /* renamed from: l */
    public final qt0 f15464l;

    /* renamed from: m */
    public final qm0 f15465m;

    /* renamed from: n */
    public final fs1 f15466n;

    /* renamed from: o */
    public final zo0 f15467o;
    public boolean p = false;

    public xs0(zl0 zl0Var, Context context, @Nullable vd0 vd0Var, xr0 xr0Var, qt0 qt0Var, qm0 qm0Var, fs1 fs1Var, zo0 zo0Var) {
        super(zl0Var);
        this.f15461i = context;
        this.f15462j = new WeakReference<>(vd0Var);
        this.f15463k = xr0Var;
        this.f15464l = qt0Var;
        this.f15465m = qm0Var;
        this.f15466n = fs1Var;
        this.f15467o = zo0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.content.Context] */
    public final boolean c(boolean z10, @Nullable Activity activity) {
        yr<Boolean> yrVar = es.f8158o0;
        jo joVar = jo.f10145d;
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            s1 s1Var = s.B.f5789c;
            if (s1.i(this.f15461i)) {
                g1.j("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f15467o.a();
                if (!((Boolean) joVar.f10148c.a(es.f8165p0)).booleanValue()) {
                    return false;
                }
                this.f15466n.a(this.f6190a.f10489b.f10126b.f8004b);
                return false;
            }
        }
        if (((Boolean) joVar.f10148c.a(es.f8240y6)).booleanValue() && this.p) {
            g1.j("The interstitial ad has been showed.");
            this.f15467o.d(f.n(10, null, null));
        }
        if (!this.p) {
            this.f15463k.M0(wr0.f15096s);
            Activity activity2 = activity;
            if (activity == null) {
                activity2 = this.f15461i;
            }
            try {
                this.f15464l.c(z10, activity2, this.f15467o);
                this.f15463k.M0(vr0.f14773s);
                this.p = true;
                return true;
            } catch (pt0 e10) {
                this.f15467o.p0(e10);
                return false;
            }
        }
        return false;
    }

    public final void finalize() {
        try {
            final vd0 vd0Var = this.f15462j.get();
            if (((Boolean) jo.f10145d.f10148c.a(es.B4)).booleanValue()) {
                if (!this.p && vd0Var != null) {
                    u90.f14298e.execute(new Runnable() { // from class: m4.ws0
                        @Override // java.lang.Runnable
                        public final void run() {
                            vd0.this.destroy();
                        }
                    });
                }
            } else if (vd0Var != null) {
                vd0Var.destroy();
            }
        } finally {
            super.finalize();
        }
    }
}
