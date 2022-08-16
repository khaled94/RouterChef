package m4;

import n3.s0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class hv0 extends iv0 {

    /* renamed from: b */
    public final JSONObject f9456b;

    /* renamed from: c */
    public final boolean f9457c;

    /* renamed from: d */
    public final boolean f9458d;

    /* renamed from: e */
    public final boolean f9459e;

    /* renamed from: f */
    public final boolean f9460f;

    /* renamed from: g */
    public final String f9461g;

    public hv0(cm1 cm1Var, JSONObject jSONObject) {
        super(cm1Var);
        String[] strArr = {"tracking_urls_and_actions", "active_view"};
        JSONObject k10 = s0.k(jSONObject, strArr);
        boolean z10 = true;
        this.f9456b = k10 == null ? null : k10.optJSONObject(strArr[1]);
        this.f9457c = s0.i(jSONObject, "allow_pub_owned_ad_view");
        this.f9458d = s0.i(jSONObject, "attribution", "allow_pub_rendering");
        this.f9459e = s0.i(jSONObject, "enable_omid");
        String[] strArr2 = {"watermark_overlay_png_base64"};
        JSONObject k11 = s0.k(jSONObject, strArr2);
        String str = "";
        this.f9461g = k11 != null ? k11.optString(strArr2[0], str) : str;
        this.f9460f = jSONObject.optJSONObject("overlay") == null ? false : z10;
    }

    @Override // m4.iv0
    public final String a() {
        return this.f9461g;
    }

    @Override // m4.iv0
    public final boolean b() {
        return this.f9459e;
    }

    @Override // m4.iv0
    public final boolean c() {
        return this.f9457c;
    }

    @Override // m4.iv0
    public final boolean d() {
        return this.f9458d;
    }

    @Override // m4.iv0
    public final boolean e() {
        return this.f9460f;
    }
}
