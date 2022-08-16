package y4;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import r.a;
import r.f;

/* loaded from: classes.dex */
public final class m0 extends h1 {

    /* renamed from: v */
    public long f20572v;

    /* renamed from: u */
    public final Map<String, Integer> f20571u = new a();

    /* renamed from: t */
    public final Map<String, Long> f20570t = new a();

    public m0(w2 w2Var) {
        super(w2Var);
    }

    public final void h(String str, long j3) {
        if (str == null || str.length() == 0) {
            ((w2) this.f20505s).C().f20710x.a("Ad unit id must be a non-empty string");
        } else {
            ((w2) this.f20505s).B().q(new a(this, str, j3));
        }
    }

    public final void i(String str, long j3) {
        if (str == null || str.length() == 0) {
            ((w2) this.f20505s).C().f20710x.a("Ad unit id must be a non-empty string");
        } else {
            ((w2) this.f20505s).B().q(new r(this, str, j3, 0));
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Map<java.lang.String, java.lang.Long>, r.g] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map<java.lang.String, java.lang.Long>, r.g] */
    public final void j(long j3) {
        l4 n10 = ((w2) this.f20505s).w().n(false);
        Iterator it = ((f.c) this.f20570t.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            l(str, j3 - ((Long) this.f20570t.getOrDefault(str, null)).longValue(), n10);
        }
        if (!this.f20570t.isEmpty()) {
            k(j3 - this.f20572v, n10);
        }
        m(j3);
    }

    public final void k(long j3, l4 l4Var) {
        if (l4Var == null) {
            ((w2) this.f20505s).C().F.a("Not logging ad exposure. No active activity");
        } else if (j3 < 1000) {
            ((w2) this.f20505s).C().F.b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j3));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j3);
            h6.v(l4Var, bundle, true);
            ((w2) this.f20505s).u().n("am", "_xa", bundle);
        }
    }

    public final void l(String str, long j3, l4 l4Var) {
        if (l4Var == null) {
            ((w2) this.f20505s).C().F.a("Not logging ad unit exposure. No active activity");
        } else if (j3 < 1000) {
            ((w2) this.f20505s).C().F.b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j3));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j3);
            h6.v(l4Var, bundle, true);
            ((w2) this.f20505s).u().n("am", "_xu", bundle);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Map<java.lang.String, java.lang.Long>, r.g] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map<java.lang.String, java.lang.Long>, r.g] */
    public final void m(long j3) {
        Iterator it = ((f.c) this.f20570t.keySet()).iterator();
        while (it.hasNext()) {
            this.f20570t.put((String) it.next(), Long.valueOf(j3));
        }
        if (!this.f20570t.isEmpty()) {
            this.f20572v = j3;
        }
    }
}
