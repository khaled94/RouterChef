package m4;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import l3.s;
import n3.g1;
import n3.k1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zb1 {

    /* renamed from: a */
    public final Map<String, ac1> f16082a = new HashMap();

    /* renamed from: b */
    public final Map<String, cc1> f16083b = new HashMap();

    /* renamed from: c */
    public final Map<String, Map<String, List<ac1>>> f16084c = new HashMap();

    /* renamed from: d */
    public final Executor f16085d;

    /* renamed from: e */
    public JSONObject f16086e;

    public zb1(Executor executor) {
        this.f16085d = executor;
    }

    public static final Bundle f(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, m4.ac1>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map<java.lang.String, m4.ac1>, java.util.HashMap] */
    public final synchronized void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f16082a.containsKey(str)) {
            return;
        }
        this.f16082a.put(str, new ac1(str, new Bundle()));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map<java.lang.String, m4.ac1>, java.util.HashMap] */
    public final synchronized List<ac1> b(JSONObject jSONObject, String str) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        Bundle f10 = f(jSONObject.optJSONObject("data"));
        JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
        if (optJSONArray == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            String optString = optJSONArray.optString(i10, "");
            if (!TextUtils.isEmpty(optString)) {
                arrayList2.add(optString);
            }
        }
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            String str2 = (String) arrayList2.get(i11);
            a(str2);
            if (((ac1) this.f16082a.get(str2)) != null) {
                arrayList.add(new ac1(str2, f10));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<m4.ac1>>>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<m4.ac1>>>] */
    public final synchronized void c(String str, String str2, List<ac1> list) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Map map = (Map) this.f16084c.get(str);
        if (map == null) {
            map = new HashMap();
        }
        this.f16084c.put(str, map);
        List list2 = (List) map.get(str2);
        if (list2 == null) {
            list2 = new ArrayList();
        }
        list2.addAll(list);
        map.put(str2, list2);
    }

    public final synchronized void d() {
        JSONArray optJSONArray;
        JSONObject jSONObject = ((k1) s.B.f5793g.c()).e().f14604g;
        if (jSONObject != null) {
            try {
                JSONArray optJSONArray2 = jSONObject.optJSONArray("ad_unit_id_settings");
                this.f16086e = jSONObject.optJSONObject("ad_unit_patterns");
                if (optJSONArray2 != null) {
                    for (int i10 = 0; i10 < optJSONArray2.length(); i10++) {
                        JSONObject jSONObject2 = optJSONArray2.getJSONObject(i10);
                        String lowerCase = ((Boolean) jo.f10145d.f10148c.a(es.F6)).booleanValue() ? jSONObject2.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject2.optString("ad_unit_id", "");
                        String optString = jSONObject2.optString("format", "");
                        ArrayList arrayList = new ArrayList();
                        JSONObject optJSONObject = jSONObject2.optJSONObject("mediation_config");
                        if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                arrayList.addAll(b(optJSONArray.getJSONObject(i11), optString));
                            }
                        }
                        c(optString, lowerCase, arrayList);
                    }
                }
            } catch (JSONException e10) {
                g1.b("Malformed config loading JSON.", e10);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.Map<java.lang.String, m4.cc1>, java.util.HashMap] */
    public final synchronized void e() {
        if (!rt.f13430d.e().booleanValue()) {
            if (((Boolean) jo.f10145d.f10148c.a(es.f1)).booleanValue()) {
                JSONObject jSONObject = ((k1) s.B.f5793g.c()).e().f14604g;
                if (jSONObject == null) {
                    return;
                }
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("signal_adapters");
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                        Bundle f10 = f(jSONObject2.optJSONObject("data"));
                        String optString = jSONObject2.optString("adapter_class_name");
                        boolean optBoolean = jSONObject2.optBoolean("render", false);
                        boolean optBoolean2 = jSONObject2.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(optString)) {
                            this.f16083b.put(optString, new cc1(optString, optBoolean2, optBoolean, f10));
                        }
                    }
                } catch (JSONException e10) {
                    g1.b("Malformed config loading JSON.", e10);
                }
            }
        }
    }
}
