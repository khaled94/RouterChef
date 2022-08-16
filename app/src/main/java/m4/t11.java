package m4;

import i0.b;
import n3.g1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class t11 {

    /* renamed from: a */
    public Long f13896a;

    /* renamed from: b */
    public final String f13897b;

    /* renamed from: c */
    public String f13898c;

    /* renamed from: d */
    public Integer f13899d;

    /* renamed from: e */
    public String f13900e;

    /* renamed from: f */
    public Integer f13901f;

    public /* synthetic */ t11(String str) {
        this.f13897b = str;
    }

    public static String a(t11 t11Var) {
        String str = (String) jo.f10145d.f10148c.a(es.f8164o6);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", t11Var.f13896a);
            jSONObject.put("eventCategory", t11Var.f13897b);
            jSONObject.putOpt("event", t11Var.f13898c);
            jSONObject.putOpt("errorCode", t11Var.f13899d);
            jSONObject.putOpt("rewardType", t11Var.f13900e);
            jSONObject.putOpt("rewardAmount", t11Var.f13901f);
        } catch (JSONException unused) {
            g1.j("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        return b.a(new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(jSONObject2).length()), str, "(\"h5adsEvent\",", jSONObject2, ");");
    }
}
