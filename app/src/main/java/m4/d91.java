package m4;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d91 implements g71<ym1, o81> {

    /* renamed from: a */
    public final h01 f7271a;

    public d91(h01 h01Var) {
        this.f7271a = h01Var;
    }

    @Override // m4.g71
    public final h71<ym1, o81> a(String str, JSONObject jSONObject) {
        return new h71<>(this.f7271a.b(str, jSONObject), new o81(), str);
    }
}
