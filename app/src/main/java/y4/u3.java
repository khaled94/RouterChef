package y4;

import android.os.Bundle;
import d4.m;

/* loaded from: classes.dex */
public final class u3 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ Bundle f20755s;

    /* renamed from: t */
    public final /* synthetic */ f4 f20756t;

    public u3(f4 f4Var, Bundle bundle) {
        this.f20756t = f4Var;
        this.f20755s = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f4 f4Var = this.f20756t;
        Bundle bundle = this.f20755s;
        f4Var.g();
        f4Var.h();
        m.h(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        m.e(string);
        m.e(string2);
        m.h(bundle.get("value"));
        if (!((w2) f4Var.f20505s).f()) {
            ((w2) f4Var.f20505s).C().F.a("Conditional property not set since app measurement is disabled");
            return;
        }
        d6 d6Var = new d6(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            p t02 = ((w2) f4Var.f20505s).z().t0(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true);
            ((w2) f4Var.f20505s).x().l(new b(bundle.getString("app_id"), string2, d6Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), ((w2) f4Var.f20505s).z().t0(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true), bundle.getLong("trigger_timeout"), t02, bundle.getLong("time_to_live"), ((w2) f4Var.f20505s).z().t0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
