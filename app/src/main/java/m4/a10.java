package m4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l3.s;
import n3.g1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a10 {

    /* renamed from: a */
    public final List<z00> f6003a;

    /* renamed from: b */
    public final List<String> f6004b;

    /* renamed from: c */
    public final List<String> f6005c;

    /* renamed from: d */
    public final List<String> f6006d;

    /* renamed from: e */
    public final List<String> f6007e;

    /* renamed from: f */
    public final List<String> f6008f;

    public a10(JSONObject jSONObject) {
        if (g1.m(2)) {
            String valueOf = String.valueOf(jSONObject.toString(2));
            g1.a(valueOf.length() != 0 ? "Mediation Response JSON: ".concat(valueOf) : new String("Mediation Response JSON: "));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i10 = -1;
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                z00 z00Var = new z00(jSONArray.getJSONObject(i11));
                "banner".equalsIgnoreCase(z00Var.f15952l);
                arrayList.add(z00Var);
                if (i10 < 0) {
                    Iterator<String> it = z00Var.f15941a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (it.next().equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                            i10 = i11;
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.f6003a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            optJSONObject.optLong("ad_network_timeout_millis", -1L);
            b10 b10Var = s.B.f5805t;
            this.f6004b = b10.a(optJSONObject, "click_urls");
            this.f6005c = b10.a(optJSONObject, "imp_urls");
            this.f6006d = b10.a(optJSONObject, "downloaded_imp_urls");
            this.f6007e = b10.a(optJSONObject, "nofill_urls");
            this.f6008f = b10.a(optJSONObject, "remote_ping_urls");
            optJSONObject.optBoolean("render_in_browser", false);
            optJSONObject.optLong("refresh", -1L);
            k60.s(optJSONObject.optJSONArray("rewards"));
            optJSONObject.optBoolean("use_displayed_impression", false);
            optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            optJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
