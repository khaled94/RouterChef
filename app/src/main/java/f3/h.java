package f3;

import androidx.annotation.RecentlyNonNull;
import m4.es;
import m4.jo;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: e */
    public final l f4511e;

    public h(int i10, @RecentlyNonNull String str, @RecentlyNonNull String str2, a aVar, l lVar) {
        super(i10, str, str2, aVar);
        this.f4511e = lVar;
    }

    @Override // f3.a
    @RecentlyNonNull
    public final JSONObject b() {
        JSONObject b10 = super.b();
        l lVar = ((Boolean) jo.f10145d.f10148c.a(es.f8226w5)).booleanValue() ? this.f4511e : null;
        b10.put("Response Info", lVar == null ? "null" : lVar.a());
        return b10;
    }

    @Override // f3.a
    @RecentlyNonNull
    public final String toString() {
        try {
            return b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
