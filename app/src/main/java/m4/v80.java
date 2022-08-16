package m4;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l3.s;
import n3.g1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v80 {

    /* renamed from: d */
    public String f14601d;

    /* renamed from: e */
    public String f14602e;

    /* renamed from: f */
    public long f14603f;

    /* renamed from: g */
    public JSONObject f14604g;

    /* renamed from: h */
    public boolean f14605h;

    /* renamed from: j */
    public boolean f14607j;

    /* renamed from: a */
    public final List<String> f14598a = new ArrayList();

    /* renamed from: b */
    public final List<String> f14599b = new ArrayList();

    /* renamed from: c */
    public final Map<String, a10> f14600c = new HashMap();

    /* renamed from: i */
    public final List<String> f14606i = new ArrayList();

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.Map<java.lang.String, m4.a10>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    public v80(String str, long j3) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        JSONObject optJSONObject3;
        this.f14605h = false;
        this.f14607j = false;
        this.f14602e = str;
        this.f14603f = j3;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f14604g = jSONObject;
            if (jSONObject.optInt("status", -1) != 1) {
                this.f14605h = false;
                g1.j("App settings could not be fetched successfully.");
                return;
            }
            this.f14605h = true;
            this.f14601d = this.f14604g.optString("app_id");
            JSONArray optJSONArray2 = this.f14604g.optJSONArray("ad_unit_id_settings");
            if (optJSONArray2 != null) {
                for (int i10 = 0; i10 < optJSONArray2.length(); i10++) {
                    JSONObject jSONObject2 = optJSONArray2.getJSONObject(i10);
                    String optString = jSONObject2.optString("format");
                    String optString2 = jSONObject2.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        if ("interstitial".equalsIgnoreCase(optString)) {
                            this.f14599b.add(optString2);
                        } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject3 = jSONObject2.optJSONObject("mediation_config")) != null) {
                            this.f14600c.put(optString2, new a10(optJSONObject3));
                        }
                    }
                }
            }
            JSONArray optJSONArray3 = this.f14604g.optJSONArray("persistable_banner_ad_unit_ids");
            if (optJSONArray3 != null) {
                for (int i11 = 0; i11 < optJSONArray3.length(); i11++) {
                    this.f14598a.add(optJSONArray3.optString(i11));
                }
            }
            if (((Boolean) jo.f10145d.f10148c.a(es.H4)).booleanValue() && (optJSONObject2 = this.f14604g.optJSONObject("common_settings")) != null && (optJSONArray = optJSONObject2.optJSONArray("loeid")) != null) {
                for (int i12 = 0; i12 < optJSONArray.length(); i12++) {
                    this.f14606i.add(optJSONArray.get(i12).toString());
                }
            }
            if (!((Boolean) jo.f10145d.f10148c.a(es.f8091f4)).booleanValue() || (optJSONObject = this.f14604g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.f14607j = optJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e10) {
            g1.k("Exception occurred while processing app setting json", e10);
            s.B.f5793g.g(e10, "AppSettings.parseAppSettingsJson");
        }
    }
}
