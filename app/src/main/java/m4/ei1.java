package m4;

import android.text.TextUtils;
import n3.g1;
import n3.s0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ei1 implements dh1<JSONObject> {

    /* renamed from: a */
    public final String f7973a;

    public ei1(String str) {
        this.f7973a = str;
    }

    @Override // m4.dh1
    public final /* bridge */ /* synthetic */ void h(JSONObject jSONObject) {
        try {
            JSONObject e10 = s0.e(jSONObject, "pii");
            if (TextUtils.isEmpty(this.f7973a)) {
                return;
            }
            e10.put("attok", this.f7973a);
        } catch (JSONException e11) {
            g1.b("Failed putting attestation token.", e11);
        }
    }
}
