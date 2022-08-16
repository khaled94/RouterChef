package m4;

import android.text.TextUtils;
import i3.a;
import n3.g1;
import n3.s0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class sh1 implements dh1<JSONObject> {

    /* renamed from: a */
    public final a.C0075a f13647a;

    /* renamed from: b */
    public final String f13648b;

    public sh1(a.C0075a c0075a, String str) {
        this.f13647a = c0075a;
        this.f13648b = str;
    }

    @Override // m4.dh1
    public final void h(JSONObject jSONObject) {
        try {
            JSONObject e10 = s0.e(jSONObject, "pii");
            a.C0075a c0075a = this.f13647a;
            if (c0075a == null || TextUtils.isEmpty(c0075a.f5258a)) {
                e10.put("pdid", this.f13648b);
                e10.put("pdidtype", "ssaid");
                return;
            }
            e10.put("rdid", this.f13647a.f5258a);
            e10.put("is_lat", this.f13647a.f5259b);
            e10.put("idtype", "adid");
        } catch (JSONException e11) {
            g1.b("Failed putting Ad ID.", e11);
        }
    }
}
