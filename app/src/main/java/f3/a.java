package f3;

import androidx.annotation.RecentlyNonNull;
import m4.cn;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    public final int f4481a;

    /* renamed from: b */
    public final String f4482b;

    /* renamed from: c */
    public final String f4483c;

    /* renamed from: d */
    public final a f4484d;

    public a(int i10, @RecentlyNonNull String str, @RecentlyNonNull String str2, a aVar) {
        this.f4481a = i10;
        this.f4482b = str;
        this.f4483c = str2;
        this.f4484d = aVar;
    }

    public final cn a() {
        a aVar = this.f4484d;
        return new cn(this.f4481a, this.f4482b, this.f4483c, aVar == null ? null : new cn(aVar.f4481a, aVar.f4482b, aVar.f4483c, null, null), null);
    }

    @RecentlyNonNull
    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f4481a);
        jSONObject.put("Message", this.f4482b);
        jSONObject.put("Domain", this.f4483c);
        a aVar = this.f4484d;
        jSONObject.put("Cause", aVar == null ? "null" : aVar.b());
        return jSONObject;
    }

    @RecentlyNonNull
    public String toString() {
        try {
            return b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
