package m4;

import android.os.Build;
import android.webkit.WebView;
import androidx.fragment.app.a;
import java.util.Collections;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class br1 {

    /* renamed from: a */
    public int f6604a;

    /* renamed from: b */
    public long f6605b;

    /* renamed from: c */
    public Object f6606c;

    public br1(int i10) {
        if (i10 != 1) {
            this.f6605b = System.nanoTime();
            this.f6604a = 1;
            this.f6606c = new wr1(null);
        }
    }

    public final WebView a() {
        return ((wr1) this.f6606c).get();
    }

    public void b() {
        ((wr1) this.f6606c).clear();
    }

    public void c(jq1 jq1Var, hq1 hq1Var) {
        d(jq1Var, hq1Var, null);
    }

    public final void d(jq1 jq1Var, hq1 hq1Var, JSONObject jSONObject) {
        String str = jq1Var.f10166g;
        JSONObject jSONObject2 = new JSONObject();
        er1.c(jSONObject2, "environment", "app");
        er1.c(jSONObject2, "adSessionType", hq1Var.f9416g);
        JSONObject jSONObject3 = new JSONObject();
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        er1.c(jSONObject3, "deviceType", a.b(new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(str3).length()), str2, "; ", str3));
        er1.c(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        er1.c(jSONObject3, "os", "Android");
        er1.c(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        er1.c(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        er1.c(jSONObject4, "partnerName", (String) hq1Var.f9410a.f12269a);
        er1.c(jSONObject4, "partnerVersion", (String) hq1Var.f9410a.f12270b);
        er1.c(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        er1.c(jSONObject5, "libraryVersion", "1.3.3-google_20200416");
        er1.c(jSONObject5, "appId", vq1.f14771b.f14772a.getApplicationContext().getPackageName());
        er1.c(jSONObject2, "app", jSONObject5);
        String str4 = hq1Var.f9415f;
        if (str4 != null) {
            er1.c(jSONObject2, "contentUrl", str4);
        }
        er1.c(jSONObject2, "customReferenceData", hq1Var.f9414e);
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = Collections.unmodifiableList(hq1Var.f9412c).iterator();
        if (!it.hasNext()) {
            wq1.f15090a.a(a(), "startSession", str, jSONObject2, jSONObject6, jSONObject);
        } else {
            pq1 pq1Var = (pq1) it.next();
            throw null;
        }
    }

    public final void e(float f10) {
        wq1.f15090a.a(a(), "setDeviceVolume", Float.valueOf(f10));
    }

    public void f() {
    }
}
