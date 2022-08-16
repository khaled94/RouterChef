package m4;

import android.os.Bundle;
import l3.s;
import n3.g1;
import n3.s0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class si1 implements dh1<JSONObject> {

    /* renamed from: a */
    public final Bundle f13666a;

    public si1(Bundle bundle) {
        this.f13666a = bundle;
    }

    @Override // m4.dh1
    public final void h(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (this.f13666a != null) {
            try {
                s0.e(s0.e(jSONObject2, "device"), "play_store").put("parental_controls", s.B.f5789c.E(this.f13666a));
            } catch (JSONException unused) {
                g1.a("Failed putting parental controls bundle.");
            }
        }
    }
}
