package y4;

import d4.m;
import java.util.LinkedHashMap;
import r.e;
import s4.d3;
import s4.dc;
import s4.p0;

/* loaded from: classes.dex */
public final class o2 extends e<String, p0> {

    /* renamed from: f */
    public final /* synthetic */ p2 f20620f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(p2 p2Var) {
        super(20);
        this.f20620f = p2Var;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.Map<java.lang.String, s4.d3>, r.g] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Map<java.lang.String, s4.d3>, r.g] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.Map<java.lang.String, s4.d3>, r.g] */
    @Override // r.e
    public final p0 a(String str) {
        LinkedHashMap linkedHashMap;
        String str2 = str;
        m.e(str2);
        p2 p2Var = this.f20620f;
        p2Var.h();
        m.e(str2);
        dc.b();
        if (((w2) p2Var.f20505s).y.s(null, f1.f20433s0) && p2Var.n(str2)) {
            if (!p2Var.y.containsKey(str2) || p2Var.y.getOrDefault(str2, null) == null) {
                p2Var.v(str2);
            } else {
                p2Var.w(str2, (d3) p2Var.y.getOrDefault(str2, null));
            }
            e<String, p0> eVar = p2Var.A;
            synchronized (eVar) {
                linkedHashMap = new LinkedHashMap(eVar.f17176a);
            }
            return (p0) linkedHashMap.get(str2);
        }
        return null;
    }
}
