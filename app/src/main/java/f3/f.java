package f3;

import androidx.annotation.RecentlyNonNull;
import m4.cn;
import m4.sn;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public final sn f4508a;

    /* renamed from: b */
    public final a f4509b;

    public f(sn snVar) {
        this.f4508a = snVar;
        cn cnVar = snVar.f13764u;
        this.f4509b = cnVar == null ? null : cnVar.s();
    }

    @RecentlyNonNull
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.f4508a.f13762s);
        jSONObject.put("Latency", this.f4508a.f13763t);
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f4508a.f13765v.keySet()) {
            jSONObject2.put(str, this.f4508a.f13765v.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        a aVar = this.f4509b;
        jSONObject.put("Ad Error", aVar == null ? "null" : aVar.b());
        return jSONObject;
    }

    @RecentlyNonNull
    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
