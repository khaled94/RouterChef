package s4;

import android.os.Bundle;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import q6.b;
import r6.a;

/* loaded from: classes.dex */
public final class h6 implements b, r6.b {

    /* renamed from: s */
    public Object f17907s;

    public h6(int i10) {
        if (i10 != 1) {
            this.f17907s = new HashMap();
        }
    }

    public static String c(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // r6.b
    public final void a(a aVar) {
        this.f17907s = aVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // q6.b
    public final void b(String str, Bundle bundle) {
        a aVar = (a) this.f17907s;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + c(str, bundle));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    public final void d(String str, Callable callable) {
        ((Map) this.f17907s).put(str, callable);
    }
}
