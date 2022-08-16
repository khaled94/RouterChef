package y4;

import android.content.SharedPreferences;
import android.util.Pair;
import d4.m;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes.dex */
public final class g2 extends j3 {
    public static final Pair<String, Long> O = new Pair<>("", 0L);
    public long A;
    public boolean G;

    /* renamed from: u */
    public SharedPreferences f20467u;

    /* renamed from: v */
    public d2 f20468v;
    public String y;

    /* renamed from: z */
    public boolean f20471z;
    public final c2 B = new c2(this, "session_timeout", 1800000);
    public final a2 C = new a2(this, "start_new_session", true);
    public final c2 F = new c2(this, "last_pause_time", 0);
    public final e2 D = new e2(this, "non_personalized_ads");
    public final a2 E = new a2(this, "allow_remote_dynamite", false);

    /* renamed from: w */
    public final c2 f20469w = new c2(this, "first_open_time", 0);

    /* renamed from: x */
    public final e2 f20470x = new e2(this, "app_instance_id");
    public final a2 H = new a2(this, "app_backgrounded", false);
    public final a2 I = new a2(this, "deep_link_retrieval_complete", false);
    public final c2 J = new c2(this, "deep_link_retrieval_attempts", 0);
    public final e2 K = new e2(this, "firebase_feature_rollouts");
    public final e2 L = new e2(this, "deferred_attribution_cache");
    public final c2 M = new c2(this, "deferred_attribution_cache_timestamp", 0);
    public final b2 N = new b2(this);

    public g2(w2 w2Var) {
        super(w2Var);
        m.e("app_install_time");
    }

    @Override // y4.j3
    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    public final void h() {
        SharedPreferences sharedPreferences = ((w2) this.f20505s).f20786s.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f20467u = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.G = z10;
        if (!z10) {
            SharedPreferences.Editor edit = this.f20467u.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        Objects.requireNonNull((w2) this.f20505s);
        this.f20468v = new d2(this, Math.max(0L, f1.f20401c.a(null).longValue()));
    }

    @Override // y4.j3
    public final boolean i() {
        return true;
    }

    public final SharedPreferences n() {
        g();
        j();
        m.h(this.f20467u);
        return this.f20467u;
    }

    public final f o() {
        g();
        return f.b(n().getString("consent_settings", "G1"));
    }

    public final Boolean p() {
        g();
        if (n().contains("measurement_enabled")) {
            return Boolean.valueOf(n().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public final void q(Boolean bool) {
        g();
        SharedPreferences.Editor edit = n().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    public final void r(boolean z10) {
        g();
        ((w2) this.f20505s).C().F.b("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor edit = n().edit();
        edit.putBoolean("deferred_analytics_collection", z10);
        edit.apply();
    }

    public final boolean s(long j3) {
        return j3 - this.B.a() > this.F.a();
    }

    public final boolean t(int i10) {
        return i10 <= n().getInt("consent_source", 100);
    }
}
