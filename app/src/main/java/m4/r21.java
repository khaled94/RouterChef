package m4;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r21 {

    /* renamed from: a */
    public final String f13124a;

    /* renamed from: b */
    public final String f13125b;

    /* renamed from: c */
    public final int f13126c;

    /* renamed from: d */
    public final String f13127d;

    /* renamed from: e */
    public final int f13128e;

    public r21(String str, String str2, int i10, String str3, int i11) {
        this.f13124a = str;
        this.f13125b = str2;
        this.f13126c = i10;
        this.f13127d = str3;
        this.f13128e = i11;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f13124a);
        jSONObject.put("version", this.f13125b);
        jSONObject.put("status", this.f13126c);
        jSONObject.put("description", this.f13127d);
        jSONObject.put("initializationLatencyMillis", this.f13128e);
        return jSONObject;
    }
}
