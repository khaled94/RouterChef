package y4;

import d4.m;
import m4.an1;

/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f20682s;

    /* renamed from: t */
    public final /* synthetic */ long f20683t;

    /* renamed from: u */
    public final /* synthetic */ Object f20684u;

    /* renamed from: v */
    public final /* synthetic */ h1 f20685v;

    public /* synthetic */ r(h1 h1Var, Object obj, long j3, int i10) {
        this.f20682s = i10;
        this.f20685v = h1Var;
        this.f20684u = obj;
        this.f20683t = j3;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [r.g, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [r.g, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Map<java.lang.String, java.lang.Long>, r.g] */
    /* JADX WARN: Type inference failed for: r6v0, types: [r.g, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r6v5, types: [r.g, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.Map<java.lang.String, java.lang.Long>, r.g] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20682s) {
            case 0:
                m0 m0Var = (m0) this.f20685v;
                String str = (String) this.f20684u;
                long j3 = this.f20683t;
                m0Var.g();
                m.e(str);
                Integer num = (Integer) m0Var.f20571u.getOrDefault(str, null);
                if (num == null) {
                    ((w2) m0Var.f20505s).C().f20710x.b("Call to endAdUnitExposure for unknown ad unit id", str);
                    return;
                }
                l4 n10 = ((w2) m0Var.f20505s).w().n(false);
                int intValue = num.intValue() - 1;
                if (intValue != 0) {
                    m0Var.f20571u.put(str, Integer.valueOf(intValue));
                    return;
                }
                m0Var.f20571u.remove(str);
                Long l10 = (Long) m0Var.f20570t.getOrDefault(str, null);
                if (l10 == null) {
                    ((w2) m0Var.f20505s).C().f20710x.a("First ad unit exposure time was never set");
                } else {
                    long longValue = l10.longValue();
                    m0Var.f20570t.remove(str);
                    m0Var.l(str, j3 - longValue, n10);
                }
                if (!m0Var.f20571u.isEmpty()) {
                    return;
                }
                long j10 = m0Var.f20572v;
                if (j10 == 0) {
                    ((w2) m0Var.f20505s).C().f20710x.a("First ad exposure time was never set");
                    return;
                }
                m0Var.k(j3 - j10, n10);
                m0Var.f20572v = 0L;
                return;
            default:
                ((p4) this.f20685v).m((l4) this.f20684u, false, this.f20683t);
                p4 p4Var = (p4) this.f20685v;
                p4Var.f20653w = null;
                e5 x10 = ((w2) p4Var.f20505s).x();
                x10.g();
                x10.h();
                x10.s(new an1(x10, null));
                return;
        }
    }
}
