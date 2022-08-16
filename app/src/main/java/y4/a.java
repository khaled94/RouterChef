package y4;

import d4.m;
import r.g;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ String f20268s;

    /* renamed from: t */
    public final /* synthetic */ long f20269t;

    /* renamed from: u */
    public final /* synthetic */ m0 f20270u;

    public a(m0 m0Var, String str, long j3) {
        this.f20270u = m0Var;
        this.f20268s = str;
        this.f20269t = j3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map<java.lang.String, java.lang.Long>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r4v0, types: [r.g, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [r.g, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r4v5, types: [r.g, java.util.Map<java.lang.String, java.lang.Integer>] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        g gVar;
        m0 m0Var = this.f20270u;
        String str = this.f20268s;
        long j3 = this.f20269t;
        m0Var.g();
        m.e(str);
        if (m0Var.f20571u.isEmpty()) {
            m0Var.f20572v = j3;
        }
        Integer num = (Integer) m0Var.f20571u.getOrDefault(str, null);
        if (num != null) {
            ?? r02 = m0Var.f20571u;
            obj = Integer.valueOf(num.intValue() + 1);
            gVar = r02;
        } else {
            ?? r42 = m0Var.f20571u;
            if (r42.f17201u >= 100) {
                ((w2) m0Var.f20505s).C().A.a("Too many ads visible");
                return;
            }
            r42.put(str, 1);
            ?? r03 = m0Var.f20570t;
            obj = Long.valueOf(j3);
            gVar = r03;
        }
        gVar.put(str, obj);
    }
}
