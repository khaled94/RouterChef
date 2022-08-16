package z6;

import a7.a;
import a7.c;
import a7.e;
import a7.f;
import android.content.Context;
import android.util.Log;
import c5.j;
import j0.d;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import m4.rc;
import m4.rz;
import org.json.JSONObject;
import p1.r;
import s.h;
import s6.z;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a */
    public final Context f20992a;

    /* renamed from: b */
    public final f f20993b;

    /* renamed from: c */
    public final rc f20994c;

    /* renamed from: d */
    public final d f20995d;

    /* renamed from: e */
    public final r f20996e;

    /* renamed from: f */
    public final rz f20997f;

    /* renamed from: g */
    public final z f20998g;

    /* renamed from: h */
    public final AtomicReference<a7.d> f20999h;

    /* renamed from: i */
    public final AtomicReference<j<a>> f21000i = new AtomicReference<>(new j());

    public b(Context context, f fVar, d dVar, rc rcVar, r rVar, rz rzVar, z zVar) {
        AtomicReference<a7.d> atomicReference = new AtomicReference<>();
        this.f20999h = atomicReference;
        this.f20992a = context;
        this.f20993b = fVar;
        this.f20995d = dVar;
        this.f20994c = rcVar;
        this.f20996e = rVar;
        this.f20997f = rzVar;
        this.f20998g = zVar;
        JSONObject jSONObject = new JSONObject();
        atomicReference.set(new e(e9.d.f(dVar, 3600L, jSONObject), null, new c(jSONObject.optInt("max_custom_exception_events", 8)), new a7.b(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false))));
    }

    public final e a(int i10) {
        Exception e10;
        e eVar = null;
        try {
            if (!h.a(2, i10)) {
                JSONObject b10 = this.f20996e.b();
                boolean z10 = false;
                if (b10 != null) {
                    e a10 = this.f20994c.a(b10);
                    if (a10 != null) {
                        c(b10, "Loaded cached settings: ");
                        Objects.requireNonNull(this.f20995d);
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!h.a(3, i10)) {
                            if (a10.f288d < currentTimeMillis) {
                                z10 = true;
                            }
                            if (z10) {
                                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                    Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                                }
                            }
                        }
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            eVar = a10;
                        } catch (Exception e11) {
                            e10 = e11;
                            eVar = a10;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e10);
                            return eVar;
                        }
                    } else {
                        Log.e("FirebaseCrashlytics", "Failed to parse cached settings data.", null);
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
        } catch (Exception e12) {
            e10 = e12;
        }
        return eVar;
    }

    public final a7.d b() {
        return this.f20999h.get();
    }

    public final void c(JSONObject jSONObject, String str) {
        StringBuilder c10 = androidx.activity.result.a.c(str);
        c10.append(jSONObject.toString());
        String sb = c10.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb, null);
        }
    }
}
