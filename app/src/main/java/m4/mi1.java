package m4;

import n3.g1;
import n3.s0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class mi1 implements dh1<JSONObject> {

    /* renamed from: a */
    public final String f11213a;

    /* renamed from: b */
    public final String f11214b;

    public mi1(String str, String str2) {
        this.f11213a = str;
        this.f11214b = str2;
    }

    @Override // m4.dh1
    public final /* bridge */ /* synthetic */ void h(JSONObject jSONObject) {
        try {
            JSONObject e10 = s0.e(jSONObject, "pii");
            e10.put("doritos", this.f11213a);
            e10.put("doritos_v2", this.f11214b);
        } catch (JSONException unused) {
            g1.a("Failed putting doritos string.");
        }
    }
}
