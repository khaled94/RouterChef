package m4;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class oa1 implements g71<ym1, p81> {
    @GuardedBy("this")

    /* renamed from: a */
    public final Map<String, h71<ym1, p81>> f12076a = new HashMap();

    /* renamed from: b */
    public final h01 f12077b;

    public oa1(h01 h01Var) {
        this.f12077b = h01Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, m4.h71<m4.ym1, m4.p81>>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map<java.lang.String, m4.h71<m4.ym1, m4.p81>>, java.util.HashMap] */
    @Override // m4.g71
    public final h71<ym1, p81> a(String str, JSONObject jSONObject) {
        h71<ym1, p81> h71Var;
        synchronized (this) {
            h71Var = (h71) this.f12076a.get(str);
            if (h71Var == null) {
                h71Var = new h71<>(this.f12077b.b(str, jSONObject), new p81(), str);
                this.f12076a.put(str, h71Var);
            }
        }
        return h71Var;
    }
}
