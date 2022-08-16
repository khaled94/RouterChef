package m4;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ii0 implements uh0 {

    /* renamed from: a */
    public final l70 f9658a;

    public ii0(l70 l70Var) {
        this.f9658a = l70Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [m4.j70] */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // m4.uh0
    public final void b(JSONObject jSONObject) {
        ((j70) this.f9658a.f10667t).b(jSONObject.optBoolean("npa_reset") ? -1 : jSONObject.optBoolean("npa"), jSONObject.optLong("timestamp"));
    }
}
