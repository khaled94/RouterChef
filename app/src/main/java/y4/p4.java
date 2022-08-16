package y4;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import m4.an1;

/* loaded from: classes.dex */
public final class p4 extends f2 {
    public volatile l4 A;
    public l4 B;
    public boolean C;
    public String E;

    /* renamed from: u */
    public volatile l4 f20651u;

    /* renamed from: v */
    public volatile l4 f20652v;

    /* renamed from: w */
    public l4 f20653w;
    public Activity y;

    /* renamed from: z */
    public volatile boolean f20655z;
    public final Object D = new Object();

    /* renamed from: x */
    public final Map<Activity, l4> f20654x = new ConcurrentHashMap();

    public p4(w2 w2Var) {
        super(w2Var);
    }

    @Override // y4.f2
    public final boolean j() {
        return false;
    }

    public final void k(Activity activity, l4 l4Var, boolean z10) {
        l4 l4Var2;
        l4 l4Var3 = this.f20651u == null ? this.f20652v : this.f20651u;
        if (l4Var.f20552b == null) {
            l4Var2 = new l4(l4Var.f20551a, activity != null ? o(activity.getClass()) : null, l4Var.f20553c, l4Var.f20555e, l4Var.f20556f);
        } else {
            l4Var2 = l4Var;
        }
        this.f20652v = this.f20651u;
        this.f20651u = l4Var2;
        Objects.requireNonNull(((w2) this.f20505s).F);
        ((w2) this.f20505s).B().q(new n4(this, l4Var2, l4Var3, SystemClock.elapsedRealtime(), z10));
    }

    public final void l(l4 l4Var, l4 l4Var2, long j3, boolean z10, Bundle bundle) {
        long j10;
        g();
        boolean z11 = false;
        boolean z12 = l4Var2 == null || l4Var2.f20553c != l4Var.f20553c || !h6.Z(l4Var2.f20552b, l4Var.f20552b) || !h6.Z(l4Var2.f20551a, l4Var.f20551a);
        if (z10 && this.f20653w != null) {
            z11 = true;
        }
        if (z12) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            h6.v(l4Var, bundle2, true);
            if (l4Var2 != null) {
                String str = l4Var2.f20551a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = l4Var2.f20552b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", l4Var2.f20553c);
            }
            if (z11) {
                o5 o5Var = ((w2) this.f20505s).y().f20674w;
                long j11 = j3 - o5Var.f20627b;
                o5Var.f20627b = j3;
                if (j11 > 0) {
                    ((w2) this.f20505s).z().t(bundle2, j11);
                }
            }
            if (!((w2) this.f20505s).y.u()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = true != l4Var.f20555e ? "auto" : "app";
            Objects.requireNonNull(((w2) this.f20505s).F);
            long currentTimeMillis = System.currentTimeMillis();
            if (l4Var.f20555e) {
                long j12 = l4Var.f20556f;
                if (j12 != 0) {
                    j10 = j12;
                    ((w2) this.f20505s).u().o(str3, "_vs", j10, bundle2);
                }
            }
            j10 = currentTimeMillis;
            ((w2) this.f20505s).u().o(str3, "_vs", j10, bundle2);
        }
        if (z11) {
            m(this.f20653w, true, j3);
        }
        this.f20653w = l4Var;
        if (l4Var.f20555e) {
            this.B = l4Var;
        }
        e5 x10 = ((w2) this.f20505s).x();
        x10.g();
        x10.h();
        x10.s(new an1(x10, l4Var));
    }

    public final void m(l4 l4Var, boolean z10, long j3) {
        m0 m10 = ((w2) this.f20505s).m();
        Objects.requireNonNull(((w2) this.f20505s).F);
        m10.j(SystemClock.elapsedRealtime());
        if (!((w2) this.f20505s).y().f20674w.a(l4Var != null && l4Var.f20554d, z10, j3) || l4Var == null) {
            return;
        }
        l4Var.f20554d = false;
    }

    public final l4 n(boolean z10) {
        h();
        g();
        if (!z10) {
            return this.f20653w;
        }
        l4 l4Var = this.f20653w;
        return l4Var != null ? l4Var : this.B;
    }

    public final String o(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str = length > 0 ? split[length - 1] : "";
        int length2 = str.length();
        Objects.requireNonNull((w2) this.f20505s);
        if (length2 <= 100) {
            return str;
        }
        Objects.requireNonNull((w2) this.f20505s);
        return str.substring(0, 100);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.concurrent.ConcurrentHashMap, java.util.Map<android.app.Activity, y4.l4>] */
    public final void p(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!((w2) this.f20505s).y.u() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f20654x.put(activity, new l4(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void q(String str) {
        g();
        synchronized (this) {
            String str2 = this.E;
            if (str2 == null || str2.equals(str)) {
                this.E = str;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.ConcurrentHashMap, java.util.Map<android.app.Activity, y4.l4>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.concurrent.ConcurrentHashMap, java.util.Map<android.app.Activity, y4.l4>] */
    public final l4 r(Activity activity) {
        Objects.requireNonNull(activity, "null reference");
        l4 l4Var = (l4) this.f20654x.get(activity);
        if (l4Var == null) {
            l4 l4Var2 = new l4(null, o(activity.getClass()), ((w2) this.f20505s).z().o0());
            this.f20654x.put(activity, l4Var2);
            l4Var = l4Var2;
        }
        return this.A != null ? this.A : l4Var;
    }
}
