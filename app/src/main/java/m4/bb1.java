package m4;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class bb1 implements g71<u20, o81> {

    /* renamed from: a */
    public final yb1 f6437a;

    public bb1(yb1 yb1Var) {
        this.f6437a = yb1Var;
    }

    @Override // m4.g71
    public final h71<u20, o81> a(String str, JSONObject jSONObject) {
        yb1 yb1Var = this.f6437a;
        u20 u20Var = yb1Var.f15649a.containsKey(str) ? yb1Var.f15649a.get(str) : null;
        if (u20Var == null) {
            return null;
        }
        return new h71<>(u20Var, new o81(), str);
    }
}
