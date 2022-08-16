package m4;

import d.a;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import l3.s;
import n3.g1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g00 implements kz, f00 {

    /* renamed from: s */
    public final f00 f8694s;

    /* renamed from: t */
    public final HashSet<AbstractMap.SimpleEntry<String, lx<? super f00>>> f8695t = new HashSet<>();

    public g00(f00 f00Var) {
        this.f8694s = f00Var;
    }

    @Override // m4.qz
    public final /* synthetic */ void I0(String str, String str2) {
        a.h(this, str, str2);
    }

    @Override // m4.qz
    public final void P0(String str, JSONObject jSONObject) {
        a.h(this, str, jSONObject.toString());
    }

    @Override // m4.jz
    public final void a(String str, Map map) {
        try {
            a.f(this, str, s.B.f5789c.F(map));
        } catch (JSONException unused) {
            g1.j("Could not convert parameters to JSON.");
        }
    }

    @Override // m4.kz, m4.qz
    public final void b(String str) {
        this.f8694s.b(str);
    }

    @Override // m4.jz
    public final /* synthetic */ void l(String str, JSONObject jSONObject) {
        a.f(this, str, jSONObject);
    }

    @Override // m4.f00
    public final void l0(String str, lx<? super f00> lxVar) {
        this.f8694s.l0(str, lxVar);
        this.f8695t.add(new AbstractMap.SimpleEntry<>(str, lxVar));
    }

    @Override // m4.f00
    public final void v0(String str, lx<? super f00> lxVar) {
        this.f8694s.v0(str, lxVar);
        this.f8695t.remove(new AbstractMap.SimpleEntry(str, lxVar));
    }
}
