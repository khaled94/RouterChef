package m4;

import android.content.Context;
import h4.a;
import h4.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import l3.s;
import n3.g1;
import n3.i1;
import n3.k1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n70 {

    /* renamed from: j */
    public static n70 f11528j;

    /* renamed from: a */
    public final a f11529a;

    /* renamed from: b */
    public final vd2<Context> f11530b;

    /* renamed from: c */
    public final vd2<i1> f11531c;

    /* renamed from: d */
    public final vd2<x70> f11532d;

    /* renamed from: e */
    public final vd2<h70> f11533e;

    /* renamed from: f */
    public final vd2<a> f11534f;

    /* renamed from: g */
    public final vd2<j70> f11535g;

    /* renamed from: h */
    public final vd2<l70> f11536h;

    /* renamed from: i */
    public final vd2<b80> f11537i;

    public n70(Context context, a aVar, i1 i1Var, x70 x70Var) {
        this.f11529a = aVar;
        nd2 b10 = od2.b(context);
        this.f11530b = (od2) b10;
        nd2 b11 = od2.b(i1Var);
        this.f11531c = (od2) b11;
        nd2 b12 = od2.b(x70Var);
        this.f11532d = (od2) b12;
        this.f11533e = md2.c(new i70(b10, b11, b12));
        nd2 b13 = od2.b(aVar);
        this.f11534f = (od2) b13;
        vd2<j70> c10 = md2.c(new k70(b13, b11, b12));
        this.f11535g = c10;
        m70 m70Var = new m70(b13, c10);
        this.f11536h = m70Var;
        this.f11537i = md2.c(new c80(b10, m70Var, 0));
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.List<m4.z70>, java.util.ArrayList] */
    public static synchronized n70 b(Context context) {
        synchronized (n70.class) {
            n70 n70Var = f11528j;
            if (n70Var != null) {
                return n70Var;
            }
            Context applicationContext = context.getApplicationContext();
            es.c(applicationContext);
            s sVar = s.B;
            k1 k1Var = (k1) sVar.f5793g.c();
            k1Var.A(applicationContext);
            Objects.requireNonNull(applicationContext);
            c cVar = sVar.f5796j;
            Objects.requireNonNull(cVar);
            x70 x70Var = sVar.f5809x;
            d.a.g(x70Var, x70.class);
            n70 n70Var2 = new n70(applicationContext, cVar, k1Var, x70Var);
            f11528j = n70Var2;
            h70 a10 = n70Var2.f11533e.a();
            a10.f9123b.registerOnSharedPreferenceChangeListener(a10);
            a10.onSharedPreferenceChanged(a10.f9123b, "IABTCF_PurposeConsents");
            a10.onSharedPreferenceChanged(a10.f9123b, "gad_has_consent_for_cookies");
            ((j70) f11528j.a().f10667t).a();
            b80 a11 = f11528j.f11537i.a();
            yr<Boolean> yrVar = es.f8111i0;
            jo joVar = jo.f10145d;
            if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
                HashMap hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject((String) joVar.f10148c.a(es.f8119j0));
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        HashSet hashSet = new HashSet();
                        JSONArray optJSONArray = jSONObject.optJSONArray(next);
                        if (optJSONArray != null) {
                            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                                String optString = optJSONArray.optString(i10);
                                if (optString != null) {
                                    hashSet.add(optString);
                                }
                            }
                            hashMap.put(next, hashSet);
                        }
                    }
                    for (String str : hashMap.keySet()) {
                        a11.a(str);
                    }
                    z70 z70Var = new z70(a11, hashMap);
                    synchronized (a11) {
                        a11.f6416b.add(z70Var);
                    }
                } catch (JSONException e10) {
                    g1.f("Failed to parse listening list", e10);
                }
            }
            return f11528j;
        }
    }

    public final l70 a() {
        return new l70(this.f11529a, this.f11535g.a());
    }
}
