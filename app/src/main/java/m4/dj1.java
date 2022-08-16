package m4;

import android.text.TextUtils;
import n3.g1;
import n3.s0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class dj1 implements dh1<JSONObject> {

    /* renamed from: a */
    public final String f7527a;

    public dj1(String str) {
        this.f7527a = str;
    }

    @Override // m4.dh1
    public final /* bridge */ /* synthetic */ void h(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        try {
            if (TextUtils.isEmpty(this.f7527a)) {
                return;
            }
            s0.e(jSONObject2, "pii").put("adsid", this.f7527a);
        } catch (JSONException e10) {
            g1.k("Failed putting trustless token.", e10);
        }
    }
}
