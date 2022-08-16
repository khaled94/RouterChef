package m4;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import d4.m;
import javax.annotation.concurrent.GuardedBy;
import k4.a;
import k4.b;

/* loaded from: classes.dex */
public final class am1 extends c60 {

    /* renamed from: s */
    public final wl1 f6198s;

    /* renamed from: t */
    public final sl1 f6199t;

    /* renamed from: u */
    public final mm1 f6200u;
    @GuardedBy("this")

    /* renamed from: v */
    public hz0 f6201v;
    @GuardedBy("this")

    /* renamed from: w */
    public boolean f6202w = false;

    public am1(wl1 wl1Var, sl1 sl1Var, mm1 mm1Var) {
        this.f6198s = wl1Var;
        this.f6199t = sl1Var;
        this.f6200u = mm1Var;
    }

    public final Bundle N3() {
        Bundle bundle;
        m.d("getAdMetadata can only be called from the UI thread.");
        hz0 hz0Var = this.f6201v;
        if (hz0Var != null) {
            rp0 rp0Var = hz0Var.f9482n;
            synchronized (rp0Var) {
                bundle = new Bundle(rp0Var.f13414t);
            }
            return bundle;
        }
        return new Bundle();
    }

    public final synchronized iq O3() {
        if (!((Boolean) jo.f10145d.f10148c.a(es.D4)).booleanValue()) {
            return null;
        }
        hz0 hz0Var = this.f6201v;
        if (hz0Var == null) {
            return null;
        }
        return hz0Var.f6195f;
    }

    public final synchronized void P3(String str) {
        m.d("#008 Must be called on the main UI thread.: setCustomData");
        this.f6200u.f11249b = str;
    }

    public final synchronized void Q3(boolean z10) {
        m.d("setImmersiveMode must be called on the main UI thread.");
        this.f6202w = z10;
    }

    public final synchronized void R2(a aVar) {
        m.d("destroy must be called on the main UI thread.");
        Context context = null;
        this.f6199t.s(null);
        if (this.f6201v != null) {
            if (aVar != null) {
                context = (Context) b.e0(aVar);
            }
            this.f6201v.f6192c.O0(context);
        }
    }

    public final synchronized void R3(a aVar) {
        m.d("showAd must be called on the main UI thread.");
        if (this.f6201v != null) {
            Activity activity = null;
            if (aVar != null) {
                Object e02 = b.e0(aVar);
                if (e02 instanceof Activity) {
                    activity = (Activity) e02;
                }
            }
            this.f6201v.c(this.f6202w, activity);
        }
    }

    public final synchronized boolean S3() {
        boolean z10;
        hz0 hz0Var = this.f6201v;
        if (hz0Var != null) {
            if (!hz0Var.f9483o.f12925t.get()) {
                z10 = true;
            }
        }
        z10 = false;
        return z10;
    }

    public final synchronized void W(a aVar) {
        m.d("pause must be called on the main UI thread.");
        if (this.f6201v != null) {
            this.f6201v.f6192c.P0(aVar == null ? null : (Context) b.e0(aVar));
        }
    }

    public final synchronized void g2(a aVar) {
        m.d("resume must be called on the main UI thread.");
        if (this.f6201v != null) {
            this.f6201v.f6192c.R0(aVar == null ? null : (Context) b.e0(aVar));
        }
    }
}
