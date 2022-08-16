package m4;

import java.util.Map;
import java.util.Objects;
import p1.r;

/* loaded from: classes.dex */
public final class q41 implements s41 {

    /* renamed from: a */
    public final Map<String, vd2<s41>> f12694a;

    /* renamed from: b */
    public final uz1 f12695b;

    /* renamed from: c */
    public final eq0 f12696c;

    public q41(Map<String, vd2<s41>> map, uz1 uz1Var, eq0 eq0Var) {
        this.f12694a = map;
        this.f12695b = uz1Var;
        this.f12696c = eq0Var;
    }

    @Override // m4.s41
    public final tz1<km1> a(final o50 o50Var) {
        eq0 eq0Var = this.f12696c;
        Objects.requireNonNull(eq0Var);
        eq0Var.M0(new r(o50Var, 3));
        tz1<km1> nz1Var = new nz1<>(new c31(3));
        for (String str : ((String) jo.f10145d.f10148c.a(es.f8178q5)).split(",")) {
            final vd2<s41> vd2Var = this.f12694a.get(str.trim());
            if (vd2Var != null) {
                nz1Var = mz1.j(nz1Var, c31.class, new xy1() { // from class: m4.o41
                    @Override // m4.xy1
                    public final tz1 h(Object obj) {
                        vd2 vd2Var2 = vd2.this;
                        c31 c31Var = (c31) obj;
                        return ((s41) vd2Var2.a()).a(o50Var);
                    }
                }, this.f12695b);
            }
        }
        mz1.t(nz1Var, new p41(this), u90.f14299f);
        return nz1Var;
    }
}
