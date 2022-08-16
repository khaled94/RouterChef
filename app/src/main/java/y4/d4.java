package y4;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.Objects;
import m4.mb0;
import m4.ob0;

@TargetApi(14)
/* loaded from: classes.dex */
public final class d4 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: s */
    public final /* synthetic */ f4 f20358s;

    public /* synthetic */ d4(f4 f4Var) {
        this.f20358s = f4Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Uri data;
        try {
            try {
                ((w2) this.f20358s.f20505s).C().F.a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent != null && (data = intent.getData()) != null && data.isHierarchical()) {
                    ((w2) this.f20358s.f20505s).z();
                    String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                    boolean z10 = true;
                    String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "auto" : "gs";
                    String queryParameter = data.getQueryParameter("referrer");
                    if (bundle != null) {
                        z10 = false;
                    }
                    ((w2) this.f20358s.f20505s).B().q(new c4(this, z10, data, str, queryParameter));
                }
            } catch (RuntimeException e10) {
                ((w2) this.f20358s.f20505s).C().f20710x.b("Throwable caught in onActivityCreated", e10);
            }
        } finally {
            ((w2) this.f20358s.f20505s).w().p(activity, bundle);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.concurrent.ConcurrentHashMap, java.util.Map<android.app.Activity, y4.l4>] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        p4 w10 = ((w2) this.f20358s.f20505s).w();
        synchronized (w10.D) {
            if (activity == w10.y) {
                w10.y = null;
            }
        }
        if (!((w2) w10.f20505s).y.u()) {
            return;
        }
        w10.f20654x.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        u2 u2Var;
        Runnable runnable;
        p4 w10 = ((w2) this.f20358s.f20505s).w();
        synchronized (w10.D) {
            w10.C = false;
            w10.f20655z = true;
        }
        Objects.requireNonNull(((w2) w10.f20505s).F);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!((w2) w10.f20505s).y.u()) {
            w10.f20651u = null;
            u2Var = ((w2) w10.f20505s).B();
            runnable = new o4(w10, elapsedRealtime);
        } else {
            l4 r10 = w10.r(activity);
            w10.f20652v = w10.f20651u;
            w10.f20651u = null;
            u2Var = ((w2) w10.f20505s).B();
            runnable = new r(w10, r10, elapsedRealtime, 1);
        }
        u2Var.q(runnable);
        q5 y = ((w2) this.f20358s.f20505s).y();
        Objects.requireNonNull(((w2) y.f20505s).F);
        ((w2) y.f20505s).B().q(new l5(y, SystemClock.elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        q5 y = ((w2) this.f20358s.f20505s).y();
        Objects.requireNonNull(((w2) y.f20505s).F);
        ((w2) y.f20505s).B().q(new k5(y, SystemClock.elapsedRealtime()));
        p4 w10 = ((w2) this.f20358s.f20505s).w();
        synchronized (w10.D) {
            w10.C = true;
            if (activity != w10.y) {
                synchronized (w10.D) {
                    w10.y = activity;
                    w10.f20655z = false;
                }
                if (((w2) w10.f20505s).y.u()) {
                    w10.A = null;
                    ((w2) w10.f20505s).B().q(new ob0(w10, 2));
                }
            }
        }
        if (!((w2) w10.f20505s).y.u()) {
            w10.f20651u = w10.A;
            ((w2) w10.f20505s).B().q(new mb0(w10, 3));
            return;
        }
        w10.k(activity, w10.r(activity), false);
        m0 m10 = ((w2) w10.f20505s).m();
        Objects.requireNonNull(((w2) m10.f20505s).F);
        ((w2) m10.f20505s).B().q(new u(m10, SystemClock.elapsedRealtime()));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.concurrent.ConcurrentHashMap, java.util.Map<android.app.Activity, y4.l4>] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        l4 l4Var;
        p4 w10 = ((w2) this.f20358s.f20505s).w();
        if (!((w2) w10.f20505s).y.u() || bundle == null || (l4Var = (l4) w10.f20654x.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", l4Var.f20553c);
        bundle2.putString("name", l4Var.f20551a);
        bundle2.putString("referrer_name", l4Var.f20552b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
