package m4;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q50 {

    /* renamed from: a */
    public final List<String> f12698a;

    /* renamed from: b */
    public final String f12699b;

    /* renamed from: c */
    public final String f12700c;

    /* renamed from: d */
    public final boolean f12701d;

    /* renamed from: e */
    public final boolean f12702e;

    /* renamed from: f */
    public final String f12703f;

    /* renamed from: g */
    public final int f12704g;

    /* renamed from: h */
    public final JSONObject f12705h;

    /* renamed from: i */
    public final String f12706i;

    public q50(JSONObject jSONObject) {
        this.f12703f = jSONObject.optString("url");
        this.f12699b = jSONObject.optString("base_uri");
        this.f12700c = jSONObject.optString("post_parameters");
        this.f12701d = a(jSONObject.optString("drt_include"));
        this.f12702e = a(jSONObject.optString("cookies_include", "true"));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        String optString = jSONObject.optString("errors");
        this.f12698a = optString == null ? null : Arrays.asList(optString.split(","));
        this.f12704g = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f12705h = optJSONObject == null ? new JSONObject() : optJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f12706i = jSONObject.optString("pool_key");
    }

    public static boolean a(String str) {
        return str != null && (str.equals("1") || str.equals("true"));
    }
}
