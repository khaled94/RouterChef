package m4;

import java.util.Iterator;
import n3.g1;
import n3.s0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zh1 implements dh1<JSONObject> {

    /* renamed from: a */
    public final JSONObject f16236a;

    public zh1(JSONObject jSONObject) {
        this.f16236a = jSONObject;
    }

    @Override // m4.dh1
    public final /* bridge */ /* synthetic */ void h(JSONObject jSONObject) {
        try {
            JSONObject e10 = s0.e(jSONObject, "content_info");
            JSONObject jSONObject2 = this.f16236a;
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                e10.put(next, jSONObject2.get(next));
            }
        } catch (JSONException unused) {
            g1.a("Failed putting app indexing json.");
        }
    }
}
