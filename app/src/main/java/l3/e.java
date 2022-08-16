package l3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.text.TextUtils;
import j4.c;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;
import m4.es;
import m4.jo;
import m4.l00;
import m4.m00;
import m4.mz1;
import m4.o00;
import m4.o90;
import m4.t90;
import m4.tz1;
import m4.u90;
import m4.v80;
import m4.w90;
import n3.g1;
import org.json.JSONObject;
import x.d;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public Context f5750a;

    /* renamed from: b */
    public long f5751b = 0;

    public final void a(Context context, o90 o90Var, boolean z10, v80 v80Var, String str, String str2, Runnable runnable) {
        PackageInfo d5;
        s sVar = s.B;
        Objects.requireNonNull(sVar.f5796j);
        if (SystemClock.elapsedRealtime() - this.f5751b < 5000) {
            g1.j("Not retrying to fetch app settings");
            return;
        }
        Objects.requireNonNull(sVar.f5796j);
        this.f5751b = SystemClock.elapsedRealtime();
        if (v80Var != null) {
            long j3 = v80Var.f14603f;
            Objects.requireNonNull(sVar.f5796j);
            if (System.currentTimeMillis() - j3 <= ((Long) jo.f10145d.f10148c.a(es.f8175q2)).longValue() && v80Var.f14605h) {
                return;
            }
        }
        if (context == null) {
            g1.j("Context not provided to fetch application settings");
        } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            g1.j("App settings could not be fetched. Required parameters missing");
        } else {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            this.f5750a = applicationContext;
            m00 a10 = sVar.p.a(applicationContext, o90Var);
            d dVar = l00.f10626b;
            o00 a11 = a10.a("google.afma.config.fetchAppSettings", dVar, dVar);
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z10);
                jSONObject.put("pn", context.getPackageName());
                jSONObject.put("experiment_ids", TextUtils.join(",", es.a()));
                try {
                    ApplicationInfo applicationInfo = this.f5750a.getApplicationInfo();
                    if (applicationInfo != null && (d5 = c.a(context).d(applicationInfo.packageName, 0)) != null) {
                        jSONObject.put("version", d5.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    g1.a("Error fetching PackageInfo.");
                }
                tz1 a12 = a11.a(jSONObject);
                d dVar2 = d.f5749a;
                t90 t90Var = u90.f14299f;
                tz1 p = mz1.p(a12, dVar2, t90Var);
                if (runnable != null) {
                    ((w90) a12).b(runnable, t90Var);
                }
                a6.d.e(p, "ConfigLoader.maybeFetchNewAppSettings");
            } catch (Exception e10) {
                g1.h("Error requesting application settings", e10);
            }
        }
    }
}
