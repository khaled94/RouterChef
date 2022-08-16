package m4;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n00 implements yx {

    /* renamed from: a */
    public final a00 f11378a;

    /* renamed from: b */
    public final w90 f11379b;

    /* renamed from: c */
    public final /* synthetic */ o00 f11380c;

    public n00(o00 o00Var, a00 a00Var, w90 w90Var) {
        this.f11380c = o00Var;
        this.f11378a = a00Var;
        this.f11379b = w90Var;
    }

    @Override // m4.yx
    public final void b(String str) {
        try {
            if (str == null) {
                this.f11379b.c(new h00());
            } else {
                this.f11379b.c(new h00(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            this.f11378a.g();
            throw th;
        }
        this.f11378a.g();
    }

    @Override // m4.yx
    public final void c(JSONObject jSONObject) {
        try {
            try {
                this.f11379b.a(this.f11380c.f11968a.b(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e10) {
                this.f11379b.c(e10);
            }
        } finally {
            this.f11378a.g();
        }
    }
}
