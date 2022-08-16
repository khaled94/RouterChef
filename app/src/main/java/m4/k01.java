package m4;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import l3.s;
import n3.k1;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k01 {

    /* renamed from: a */
    public final Map<String, Map<String, JSONObject>> f10227a = new ConcurrentHashMap();

    /* renamed from: b */
    public JSONObject f10228b;

    /* renamed from: c */
    public final Executor f10229c;

    /* renamed from: d */
    public boolean f10230d;

    /* renamed from: e */
    public JSONObject f10231e;

    public k01(Executor executor) {
        this.f10229c = executor;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.concurrent.ConcurrentHashMap, java.util.Map<java.lang.String, java.util.Map<java.lang.String, org.json.JSONObject>>] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.concurrent.ConcurrentHashMap, java.util.Map<java.lang.String, java.util.Map<java.lang.String, org.json.JSONObject>>] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.concurrent.ConcurrentHashMap, java.util.Map<java.lang.String, java.util.Map<java.lang.String, org.json.JSONObject>>] */
    public final synchronized void a() {
        Map map;
        this.f10230d = true;
        v80 e10 = ((k1) s.B.f5793g.c()).e();
        if (e10 == null) {
            return;
        }
        JSONObject jSONObject = e10.f14604g;
        if (jSONObject == null) {
            return;
        }
        this.f10228b = ((Boolean) jo.f10145d.f10148c.a(es.f8160o2)).booleanValue() ? jSONObject.optJSONObject("common_settings") : null;
        this.f10231e = jSONObject.optJSONObject("ad_unit_patterns");
        JSONArray optJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
        if (optJSONArray == null) {
            return;
        }
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("ad_unit_id");
                String optString2 = optJSONObject.optString("format");
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                if (optString != null && optJSONObject2 != null && optString2 != null) {
                    if (this.f10227a.containsKey(optString2)) {
                        map = (Map) this.f10227a.get(optString2);
                    } else {
                        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                        this.f10227a.put(optString2, concurrentHashMap);
                        map = concurrentHashMap;
                    }
                    map.put(optString, optJSONObject2);
                }
            }
        }
    }
}
