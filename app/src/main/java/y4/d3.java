package y4;

import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import n9.d;
import s4.a;
import s4.dc;
import s4.l1;
import s4.p0;
import z3.v;

/* loaded from: classes.dex */
public final class d3 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ p f20355s;

    /* renamed from: t */
    public final /* synthetic */ k6 f20356t;

    /* renamed from: u */
    public final /* synthetic */ h3 f20357u;

    public d3(h3 h3Var, p pVar, k6 k6Var) {
        this.f20357u = h3Var;
        this.f20355s = pVar;
        this.f20356t = k6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q1 q1Var;
        String str;
        String str2;
        n nVar;
        h3 h3Var = this.f20357u;
        p pVar = this.f20355s;
        Objects.requireNonNull(h3Var);
        if ("_cmp".equals(pVar.f20634s) && (nVar = pVar.f20635t) != null && nVar.f20587s.size() != 0) {
            String x10 = pVar.f20635t.x("_cis");
            if ("referrer broadcast".equals(x10) || "referrer API".equals(x10)) {
                h3Var.f20483s.C().D.b("Event has been filtered ", pVar.toString());
                pVar = new p("_cmpx", pVar.f20635t, pVar.f20636u, pVar.f20637v);
            }
        }
        dc.b();
        e K = this.f20357u.f20483s.K();
        e1<Boolean> e1Var = f1.f20433s0;
        p0 p0Var = null;
        if (K.s(null, e1Var)) {
            h3 h3Var2 = this.f20357u;
            k6 k6Var = this.f20356t;
            p2 p2Var = h3Var2.f20483s.f20292s;
            a6.I(p2Var);
            if (p2Var.n(k6Var.f20535s)) {
                h3Var2.f20483s.C().F.b("EES config found for", k6Var.f20535s);
                p2 p2Var2 = h3Var2.f20483s.f20292s;
                a6.I(p2Var2);
                String str3 = k6Var.f20535s;
                dc.b();
                if (((w2) p2Var2.f20505s).y.s(null, e1Var) && !TextUtils.isEmpty(str3)) {
                    p0Var = p2Var2.A.b(str3);
                }
                if (p0Var != null) {
                    try {
                        c6 c6Var = h3Var2.f20483s.y;
                        a6.I(c6Var);
                        Map<String, Object> J = c6Var.J(pVar.f20635t.s(), true);
                        String d5 = d.d(pVar.f20634s);
                        if (d5 == null) {
                            d5 = pVar.f20634s;
                        }
                        if (p0Var.c(new a(d5, pVar.f20637v, J))) {
                            v vVar = p0Var.f18054c;
                            if (!((a) vVar.f20973u).equals((a) vVar.f20972t)) {
                                h3Var2.f20483s.C().F.b("EES edited event", pVar.f20634s);
                                c6 c6Var2 = h3Var2.f20483s.y;
                                a6.I(c6Var2);
                                pVar = c6Var2.z((a) p0Var.f18054c.f20973u);
                            }
                            h3Var2.e0(pVar, k6Var);
                            if (!(!((List) p0Var.f18054c.f20974v).isEmpty())) {
                                return;
                            }
                            for (a aVar : (List) p0Var.f18054c.f20974v) {
                                h3Var2.f20483s.C().F.b("EES logging created event", aVar.f17702a);
                                c6 c6Var3 = h3Var2.f20483s.y;
                                a6.I(c6Var3);
                                h3Var2.e0(c6Var3.z(aVar), k6Var);
                            }
                            return;
                        }
                    } catch (l1 unused) {
                        h3Var2.f20483s.C().f20710x.c("EES error. appId, eventName", k6Var.f20536t, pVar.f20634s);
                    }
                    q1Var = h3Var2.f20483s.C().F;
                    str = pVar.f20634s;
                    str2 = "EES was not applied to event";
                } else {
                    q1Var = h3Var2.f20483s.C().F;
                    str = k6Var.f20535s;
                    str2 = "EES not loaded for";
                }
                q1Var.b(str2, str);
            }
            h3Var2.e0(pVar, k6Var);
            return;
        }
        this.f20357u.e0(pVar, this.f20356t);
    }
}
