package y4;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import d4.m;
import e1.j;
import j4.c;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e extends i3 {

    /* renamed from: t */
    public Boolean f20368t;

    /* renamed from: u */
    public d f20369u = j.I;

    /* renamed from: v */
    public Boolean f20370v;

    public e(w2 w2Var) {
        super(w2Var);
    }

    public static final long h() {
        return f1.D.a(null).longValue();
    }

    public static final long y() {
        return f1.f20403d.a(null).longValue();
    }

    public final String i(String str) {
        Object e10;
        String str2;
        q1 q1Var;
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            m.h(str3);
            return str3;
        } catch (ClassNotFoundException e11) {
            e10 = e11;
            q1Var = ((w2) this.f20505s).C().f20710x;
            str2 = "Could not find SystemProperties class";
            q1Var.b(str2, e10);
            return "";
        } catch (IllegalAccessException e12) {
            e10 = e12;
            q1Var = ((w2) this.f20505s).C().f20710x;
            str2 = "Could not access SystemProperties.get()";
            q1Var.b(str2, e10);
            return "";
        } catch (NoSuchMethodException e13) {
            e10 = e13;
            q1Var = ((w2) this.f20505s).C().f20710x;
            str2 = "Could not find SystemProperties.get() method";
            q1Var.b(str2, e10);
            return "";
        } catch (InvocationTargetException e14) {
            e10 = e14;
            q1Var = ((w2) this.f20505s).C().f20710x;
            str2 = "SystemProperties.get() threw an exception";
            q1Var.b(str2, e10);
            return "";
        }
    }

    public final int j(String str) {
        return n(str, f1.H, 500, 2000);
    }

    public final int k() {
        h6 z10 = ((w2) this.f20505s).z();
        Boolean bool = ((w2) z10.f20505s).x().f20390w;
        if (z10.m0() < 201500) {
            return (bool == null || bool.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    public final int l(String str) {
        return n(str, f1.I, 25, 100);
    }

    public final int m(String str, e1<Integer> e1Var) {
        if (str != null) {
            String e10 = this.f20369u.e(str, e1Var.f20373a);
            if (!TextUtils.isEmpty(e10)) {
                try {
                    return e1Var.a(Integer.valueOf(Integer.parseInt(e10))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return e1Var.a(null).intValue();
    }

    public final int n(String str, e1<Integer> e1Var, int i10, int i11) {
        return Math.max(Math.min(m(str, e1Var), i11), i10);
    }

    public final long o() {
        Objects.requireNonNull((w2) this.f20505s);
        return 43042L;
    }

    public final long p(String str, e1<Long> e1Var) {
        if (str != null) {
            String e10 = this.f20369u.e(str, e1Var.f20373a);
            if (!TextUtils.isEmpty(e10)) {
                try {
                    return e1Var.a(Long.valueOf(Long.parseLong(e10))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return e1Var.a(null).longValue();
    }

    public final Bundle q() {
        try {
            if (((w2) this.f20505s).f20786s.getPackageManager() == null) {
                ((w2) this.f20505s).C().f20710x.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo b10 = c.a(((w2) this.f20505s).f20786s).b(((w2) this.f20505s).f20786s.getPackageName(), 128);
            if (b10 != null) {
                return b10.metaData;
            }
            ((w2) this.f20505s).C().f20710x.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            ((w2) this.f20505s).C().f20710x.b("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    public final Boolean r(String str) {
        m.e(str);
        Bundle q10 = q();
        if (q10 == null) {
            ((w2) this.f20505s).C().f20710x.a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (q10.containsKey(str)) {
            return Boolean.valueOf(q10.getBoolean(str));
        } else {
            return null;
        }
    }

    public final boolean s(String str, e1<Boolean> e1Var) {
        Boolean bool;
        if (str != null) {
            String e10 = this.f20369u.e(str, e1Var.f20373a);
            if (!TextUtils.isEmpty(e10)) {
                bool = e1Var.a(Boolean.valueOf(((w2) this.f20505s).y.s(null, f1.f20441w0) ? "1".equals(e10) : Boolean.parseBoolean(e10)));
                return bool.booleanValue();
            }
        }
        bool = e1Var.a(null);
        return bool.booleanValue();
    }

    public final boolean t(String str) {
        return "1".equals(this.f20369u.e(str, "gaia_collection_enabled"));
    }

    public final boolean u() {
        Boolean r10 = r("google_analytics_automatic_screen_reporting_enabled");
        return r10 == null || r10.booleanValue();
    }

    public final boolean v() {
        Objects.requireNonNull((w2) this.f20505s);
        Boolean r10 = r("firebase_analytics_collection_deactivated");
        return r10 != null && r10.booleanValue();
    }

    public final boolean w(String str) {
        return "1".equals(this.f20369u.e(str, "measurement.event_sampling_enabled"));
    }

    public final boolean x() {
        if (this.f20368t == null) {
            Boolean r10 = r("app_measurement_lite");
            this.f20368t = r10;
            if (r10 == null) {
                this.f20368t = Boolean.FALSE;
            }
        }
        return this.f20368t.booleanValue() || !((w2) this.f20505s).f20790w;
    }
}
