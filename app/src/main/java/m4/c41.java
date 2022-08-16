package m4;

import android.content.Context;
import java.io.StringReader;
import java.util.concurrent.Executor;
import l3.s;
import n3.g1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x.d;

/* loaded from: classes.dex */
public final class c41 {

    /* renamed from: a */
    public final if0 f6720a;

    /* renamed from: b */
    public final Context f6721b;

    /* renamed from: c */
    public final o90 f6722c;

    /* renamed from: d */
    public final om1 f6723d;

    /* renamed from: e */
    public final Executor f6724e;

    /* renamed from: f */
    public final String f6725f;

    /* renamed from: g */
    public final eq0 f6726g;

    /* renamed from: h */
    public final hq0 f6727h;

    public c41(if0 if0Var, Context context, o90 o90Var, om1 om1Var, Executor executor, String str, eq0 eq0Var, hq0 hq0Var) {
        this.f6720a = if0Var;
        this.f6721b = context;
        this.f6722c = o90Var;
        this.f6723d = om1Var;
        this.f6724e = executor;
        this.f6725f = str;
        this.f6726g = eq0Var;
        this.f6727h = hq0Var;
    }

    public static final String c(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    public final tz1<km1> a(final String str, final String str2) {
        m00 a10 = s.B.p.a(this.f6721b, this.f6722c);
        d dVar = l00.f10626b;
        tz1<km1> p = mz1.p(mz1.p(mz1.p(mz1.m(""), new xy1() { // from class: m4.b41
            @Override // m4.xy1
            public final tz1 h(Object obj) {
                String str3 = str;
                String str4 = str2;
                String str5 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return mz1.m(jSONObject);
                } catch (JSONException e10) {
                    String valueOf = String.valueOf(e10.getMessage());
                    throw new JSONException(valueOf.length() != 0 ? "Preloaded loader: ".concat(valueOf) : new String("Preloaded loader: "));
                }
            }
        }, this.f6724e), new z31(a10.a("google.afma.response.normalize", dVar, dVar), 0), this.f6724e), new xy1() { // from class: m4.a41
            @Override // m4.xy1
            public final tz1 h(Object obj) {
                return mz1.m(new km1(new f7(c41.this.f6723d, 4), jm1.a(new StringReader(((JSONObject) obj).toString()))));
            }
        }, this.f6724e);
        if (((Boolean) jo.f10145d.f10148c.a(es.N4)).booleanValue()) {
            mz1.t(p, new vc0(this), u90.f14299f);
        }
        return p;
    }

    public final String b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f6725f));
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            g1.j("Failed to update the ad types for rendering. ".concat(e10.toString()));
            return str;
        }
    }
}
