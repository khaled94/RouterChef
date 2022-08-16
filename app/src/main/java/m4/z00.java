package m4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import l3.s;
import org.json.JSONArray;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class z00 {

    /* renamed from: a */
    public final List<String> f15941a;

    /* renamed from: b */
    public final List<String> f15942b;

    /* renamed from: c */
    public final List<String> f15943c;

    /* renamed from: d */
    public final List<String> f15944d;

    /* renamed from: e */
    public final List<String> f15945e;

    /* renamed from: f */
    public final List<String> f15946f;

    /* renamed from: g */
    public final String f15947g;

    /* renamed from: h */
    public final List<String> f15948h;

    /* renamed from: i */
    public final List<String> f15949i;

    /* renamed from: j */
    public final List<String> f15950j;

    /* renamed from: k */
    public final List<String> f15951k;

    /* renamed from: l */
    public final String f15952l;

    public z00(JSONObject jSONObject) {
        List<String> list;
        jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(jSONArray.getString(i10));
        }
        this.f15941a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        s sVar = s.B;
        b10 b10Var = sVar.f5805t;
        this.f15942b = b10.a(jSONObject, "clickurl");
        b10 b10Var2 = sVar.f5805t;
        this.f15943c = b10.a(jSONObject, "imp_urls");
        b10 b10Var3 = sVar.f5805t;
        this.f15944d = b10.a(jSONObject, "downloaded_imp_urls");
        b10 b10Var4 = sVar.f5805t;
        this.f15946f = b10.a(jSONObject, "fill_urls");
        b10 b10Var5 = sVar.f5805t;
        this.f15948h = b10.a(jSONObject, "video_start_urls");
        b10 b10Var6 = sVar.f5805t;
        this.f15950j = b10.a(jSONObject, "video_complete_urls");
        b10 b10Var7 = sVar.f5805t;
        this.f15949i = b10.a(jSONObject, "video_reward_urls");
        jSONObject.optString("transaction_id");
        jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            b10 b10Var8 = sVar.f5805t;
            list = b10.a(optJSONObject, "manual_impression_urls");
        } else {
            list = null;
        }
        this.f15945e = list;
        if (optJSONObject != null) {
            optJSONObject.toString();
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.f15947g = optJSONObject2 != null ? optJSONObject2.toString() : null;
        if (optJSONObject2 != null) {
            optJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        if (optJSONObject3 != null) {
            optJSONObject3.toString();
        }
        b10 b10Var9 = sVar.f5805t;
        this.f15951k = b10.a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (optJSONObject4 != null) {
            optJSONObject4.toString();
        }
        this.f15952l = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
