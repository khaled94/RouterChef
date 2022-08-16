package m4;

import android.content.Context;
import l3.s;
import n3.k1;

/* loaded from: classes.dex */
public final class hl1 implements nd2<dl1<kz0, hz0>> {

    /* renamed from: a */
    public final vd2<Context> f9375a;

    /* renamed from: b */
    public final vd2<gn1> f9376b;

    /* renamed from: c */
    public final vd2<un1> f9377c;

    public hl1(vd2<Context> vd2Var, vd2<gn1> vd2Var2, vd2<un1> vd2Var3) {
        this.f9375a = vd2Var;
        this.f9376b = vd2Var2;
        this.f9377c = vd2Var3;
    }

    /* renamed from: b */
    public final dl1<kz0, hz0> a() {
        v80 v80Var;
        Context a10 = this.f9375a.a();
        gn1 a11 = this.f9376b.a();
        un1 a12 = this.f9377c.a();
        yr<Boolean> yrVar = es.f8107h4;
        jo joVar = jo.f10145d;
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            v80Var = ((k1) s.B.f5793g.c()).e();
        } else {
            k1 k1Var = (k1) s.B.f5793g.c();
            synchronized (k1Var.f16496a) {
                v80Var = k1Var.f16507l;
            }
        }
        boolean z10 = false;
        if (v80Var != null && v80Var.f14607j) {
            z10 = true;
        }
        if (((Integer) joVar.f10148c.a(es.f8122j4)).intValue() > 0) {
            if (!((Boolean) joVar.f10148c.a(es.f8099g4)).booleanValue() || z10) {
                tn1 a13 = a12.a(mn1.Rewarded, a10, a11, new rb1(new hk1(), 3));
                tk1 tk1Var = new tk1(new sk1());
                in1 in1Var = a13.f14119a;
                t90 t90Var = u90.f14294a;
                return new kk1(tk1Var, new qk1(in1Var, t90Var), a13.f14120b, ((jn1) a13.f14119a).f10139b.y, t90Var);
            }
        }
        return new sk1();
    }
}
