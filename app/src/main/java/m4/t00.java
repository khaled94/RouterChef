package m4;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class t00 implements yx {

    /* renamed from: a */
    public final w90 f13889a;

    public t00(w90 w90Var) {
        this.f13889a = w90Var;
    }

    @Override // m4.yx
    public final void b(String str) {
        try {
            if (str == null) {
                this.f13889a.c(new h00());
            } else {
                this.f13889a.c(new h00(str));
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // m4.yx
    public final void c(JSONObject jSONObject) {
        try {
            this.f13889a.a(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e10) {
            this.f13889a.c(e10);
        }
    }
}
