package m4;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzcaf;
import java.util.concurrent.atomic.AtomicReference;
import n3.g1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h01 {

    /* renamed from: a */
    public final g01 f9072a;

    /* renamed from: b */
    public final AtomicReference<f10> f9073b = new AtomicReference<>();

    public h01(g01 g01Var) {
        this.f9072a = g01Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map<java.lang.String, m4.f01>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map<java.lang.String, m4.f01>, java.util.HashMap] */
    public final u20 a(String str) {
        u20 X = c().X(str);
        g01 g01Var = this.f9072a;
        synchronized (g01Var) {
            if (!g01Var.f8696a.containsKey(str)) {
                try {
                    g01Var.f8696a.put(str, new f01(str, X.d(), X.e()));
                } catch (Throwable unused) {
                }
            }
        }
        return X;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map<java.lang.String, m4.f01>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.Map<java.lang.String, m4.f01>, java.util.HashMap] */
    public final ym1 b(String str, JSONObject jSONObject) {
        pm1 pm1Var;
        i10 i10Var;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                i10Var = new a20(new AdMobAdapter());
            } else if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                i10Var = new a20(new AdUrlAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                i10Var = new a20(new zzcaf());
            } else {
                f10 c10 = c();
                if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        if (c10.O(string)) {
                            string = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
                        } else if (!c10.P(string)) {
                            string = "com.google.ads.mediation.customevent.CustomEventAdapter";
                        }
                        i10Var = c10.z(string);
                    } catch (JSONException e10) {
                        g1.h("Invalid custom event.", e10);
                    }
                }
                i10Var = c10.z(str);
            }
            ym1 ym1Var = new ym1(i10Var);
            g01 g01Var = this.f9072a;
            synchronized (g01Var) {
                try {
                    if (!g01Var.f8696a.containsKey(str)) {
                        try {
                            try {
                                g01Var.f8696a.put(str, new f01(str, i10Var.l(), i10Var.o()));
                            } finally {
                            }
                        } finally {
                        }
                    }
                } catch (pm1 unused) {
                }
            }
            return ym1Var;
        } finally {
        }
    }

    public final f10 c() {
        f10 f10Var = this.f9073b.get();
        if (f10Var != null) {
            return f10Var;
        }
        g1.j("Unexpected call to adapter creator.");
        throw new RemoteException();
    }
}
