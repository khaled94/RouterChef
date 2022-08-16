package p1;

import android.content.Context;
import android.util.Log;
import e.o;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import m4.ar0;
import m4.fg2;
import m4.gg2;
import m4.gq0;
import m4.im1;
import m4.km1;
import m4.ko1;
import m4.o50;
import m4.rx;
import m4.th0;
import m4.uh0;
import m4.v0;
import m4.v91;
import m4.wm0;
import m4.ze2;
import org.json.JSONObject;
import s6.e;

/* loaded from: classes.dex */
public final class r implements ko1, ar0, v91 {

    /* renamed from: s */
    public final /* synthetic */ int f16939s;

    /* renamed from: t */
    public final Object f16940t;

    public /* synthetic */ r(Object obj, int i10) {
        this.f16939s = i10;
        this.f16940t = obj;
    }

    public final File a() {
        return new File(new o((Context) this.f16940t, 5).a(), "com.crashlytics.settings.json");
    }

    public final JSONObject b() {
        Throwable th;
        FileInputStream fileInputStream;
        Exception e10;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File a10 = a();
            if (!a10.exists()) {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            } else {
                fileInputStream = new FileInputStream(a10);
                try {
                    try {
                        jSONObject = new JSONObject(e.n(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e11) {
                        e10 = e11;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e10);
                        e.a(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    e.a(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            }
            e.a(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e12) {
            e10 = e12;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            e.a(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<m4.im1>, java.util.ArrayList] */
    @Override // m4.ko1
    /* renamed from: h */
    public final Object mo30h(Object obj) {
        km1 km1Var = (km1) obj;
        v0 v0Var = ((wm0) this.f16940t).f15054d;
        Objects.requireNonNull(v0Var);
        Iterator it = km1Var.f10489b.f10127c.iterator();
        while (it.hasNext()) {
            im1 im1Var = (im1) it.next();
            if (((Map) v0Var.f14544s).containsKey(im1Var.f9697a)) {
                ((uh0) ((Map) v0Var.f14544s).get(im1Var.f9697a)).b(im1Var.f9698b);
            } else if (((Map) v0Var.f14545t).containsKey(im1Var.f9697a)) {
                th0 th0Var = (th0) ((Map) v0Var.f14545t).get(im1Var.f9697a);
                JSONObject jSONObject = im1Var.f9698b;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                th0Var.a(hashMap);
            }
        }
        return km1Var;
    }

    public /* synthetic */ r(fg2 fg2Var) {
        this.f16939s = 5;
        this.f16940t = fg2Var;
    }

    @Override // m4.ko1
    /* renamed from: h */
    public final void mo30h(Object obj) {
        switch (this.f16939s) {
            case 3:
                ((gq0) obj).v0((o50) this.f16940t);
                return;
            case 4:
                ((rx) obj).q0(((ze2) this.f16940t).f16169e);
                return;
            default:
                gg2 gg2Var = (gg2) obj;
                return;
        }
    }
}
