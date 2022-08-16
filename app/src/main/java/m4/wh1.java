package m4;

import n3.g1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class wh1 implements dh1<JSONObject> {

    /* renamed from: a */
    public final String f15025a;

    public wh1(String str) {
        this.f15025a = str;
    }

    @Override // m4.dh1
    public final /* bridge */ /* synthetic */ void h(JSONObject jSONObject) {
        try {
            jSONObject.put("ms", this.f15025a);
        } catch (JSONException e10) {
            g1.b("Failed putting Ad ID.", e10);
        }
    }
}
