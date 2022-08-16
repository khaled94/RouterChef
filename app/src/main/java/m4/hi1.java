package m4;

import n3.g1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class hi1 implements dh1<JSONObject> {

    /* renamed from: a */
    public final JSONObject f9347a;

    public hi1(JSONObject jSONObject) {
        this.f9347a = jSONObject;
    }

    @Override // m4.dh1
    public final /* bridge */ /* synthetic */ void h(JSONObject jSONObject) {
        try {
            jSONObject.put("cache_state", this.f9347a);
        } catch (JSONException unused) {
            g1.a("Unable to get cache_state");
        }
    }
}
