package m4;

import android.util.JsonReader;
import n3.s0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class gm1 {

    /* renamed from: a */
    public final String f8966a;

    /* renamed from: b */
    public final String f8967b;

    /* renamed from: c */
    public final JSONObject f8968c;

    /* renamed from: d */
    public final JSONObject f8969d;

    public gm1(JsonReader jsonReader) {
        JSONObject f10 = s0.f(jsonReader);
        this.f8969d = f10;
        this.f8966a = f10.optString("ad_html", null);
        this.f8967b = f10.optString("ad_base_url", null);
        this.f8968c = f10.optJSONObject("ad_json");
    }
}
