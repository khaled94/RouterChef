package m4;

import android.os.IBinder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import n3.g1;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class p21 implements vo0, gq0, qp0 {

    /* renamed from: s */
    public final x21 f12387s;

    /* renamed from: t */
    public final String f12388t;

    /* renamed from: u */
    public int f12389u = 0;

    /* renamed from: v */
    public o21 f12390v = o21.AD_REQUESTED;

    /* renamed from: w */
    public oo0 f12391w;

    /* renamed from: x */
    public cn f12392x;

    public p21(x21 x21Var, om1 om1Var) {
        this.f12387s = x21Var;
        this.f12388t = om1Var.f12205f;
    }

    public static JSONObject b(cn cnVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", cnVar.f7069u);
        jSONObject.put("errorCode", cnVar.f7067s);
        jSONObject.put("errorDescription", cnVar.f7068t);
        cn cnVar2 = cnVar.f7070v;
        jSONObject.put("underlyingError", cnVar2 == null ? null : b(cnVar2));
        return jSONObject;
    }

    public static JSONObject c(oo0 oo0Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", oo0Var.f12238s);
        jSONObject.put("responseSecsSinceEpoch", oo0Var.f12242w);
        jSONObject.put("responseId", oo0Var.f12239t);
        if (((Boolean) jo.f10145d.f10148c.a(es.f8124j6)).booleanValue()) {
            String str = oo0Var.f12243x;
            if (!TextUtils.isEmpty(str)) {
                String valueOf = String.valueOf(str);
                g1.e(valueOf.length() != 0 ? "Bidding data: ".concat(valueOf) : new String("Bidding data: "));
                jSONObject.put("biddingData", new JSONObject(str));
            }
        }
        JSONArray jSONArray = new JSONArray();
        List<sn> e10 = oo0Var.e();
        if (e10 != null) {
            for (sn snVar : e10) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("adapterClassName", snVar.f13762s);
                jSONObject2.put("latencyMillis", snVar.f13763t);
                cn cnVar = snVar.f13764u;
                jSONObject2.put("error", cnVar == null ? null : b(cnVar));
                jSONArray.put(jSONObject2);
            }
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // m4.qp0
    public final void Q(am0 am0Var) {
        this.f12391w = am0Var.f6195f;
        this.f12390v = o21.AD_LOADED;
    }

    public final JSONObject a() {
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.f12390v);
        jSONObject.put("format", cm1.a(this.f12389u));
        oo0 oo0Var = this.f12391w;
        JSONObject jSONObject2 = null;
        if (oo0Var != null) {
            jSONObject2 = c(oo0Var);
        } else {
            cn cnVar = this.f12392x;
            if (cnVar != null && (iBinder = cnVar.f7071w) != null) {
                oo0 oo0Var2 = (oo0) iBinder;
                jSONObject2 = c(oo0Var2);
                List<sn> e10 = oo0Var2.e();
                if (e10 != null && e10.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(b(this.f12392x));
                    jSONObject2.put("errors", jSONArray);
                }
            }
        }
        jSONObject.put("responseInfo", jSONObject2);
        return jSONObject;
    }

    @Override // m4.vo0
    public final void d(cn cnVar) {
        this.f12390v = o21.AD_LOAD_FAILED;
        this.f12392x = cnVar;
    }

    @Override // m4.gq0
    public final void l0(km1 km1Var) {
        if (!km1Var.f10489b.f10125a.isEmpty()) {
            this.f12389u = km1Var.f10489b.f10125a.get(0).f7034b;
        }
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.Map<java.lang.String, java.util.List<m4.p21>>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.Map<java.lang.String, java.util.List<m4.p21>>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.Map<java.lang.String, java.util.List<m4.p21>>, java.util.HashMap] */
    @Override // m4.gq0
    public final void v0(o50 o50Var) {
        x21 x21Var = this.f12387s;
        String str = this.f12388t;
        synchronized (x21Var) {
            yr<Boolean> yrVar = es.S5;
            jo joVar = jo.f10145d;
            if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue() && x21Var.d()) {
                if (x21Var.f15205m >= ((Integer) joVar.f10148c.a(es.U5)).intValue()) {
                    g1.j("Maximum number of ad requests stored reached. Dropping the current request.");
                } else {
                    if (!x21Var.f15199g.containsKey(str)) {
                        x21Var.f15199g.put(str, new ArrayList());
                    }
                    x21Var.f15205m++;
                    ((List) x21Var.f15199g.get(str)).add(this);
                }
            }
        }
    }
}
