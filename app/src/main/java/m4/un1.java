package m4;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class un1 {

    /* renamed from: a */
    public final HashMap<mn1, tn1<?, ?>> f14463a = new HashMap<>();

    public final <R extends fo0<AdT>, AdT extends am0> tn1<R, AdT> a(mn1 mn1Var, Context context, gn1 gn1Var, rb1 rb1Var) {
        nn1 nn1Var;
        tn1<R, AdT> tn1Var = (tn1<R, AdT>) this.f14463a.get(mn1Var);
        if (tn1Var == null) {
            if (mn1Var == mn1.Rewarded) {
                yr<Integer> yrVar = es.f8122j4;
                jo joVar = jo.f10145d;
                nn1Var = new nn1(context, mn1Var, ((Integer) joVar.f10148c.a(yrVar)).intValue(), ((Integer) joVar.f10148c.a(es.f8169p4)).intValue(), ((Integer) joVar.f10148c.a(es.f8185r4)).intValue(), (String) joVar.f10148c.a(es.f8201t4), (String) joVar.f10148c.a(es.f8138l4), (String) joVar.f10148c.a(es.f8154n4));
            } else if (mn1Var == mn1.Interstitial) {
                yr<Integer> yrVar2 = es.f8130k4;
                jo joVar2 = jo.f10145d;
                nn1Var = new nn1(context, mn1Var, ((Integer) joVar2.f10148c.a(yrVar2)).intValue(), ((Integer) joVar2.f10148c.a(es.f8177q4)).intValue(), ((Integer) joVar2.f10148c.a(es.f8193s4)).intValue(), (String) joVar2.f10148c.a(es.f8209u4), (String) joVar2.f10148c.a(es.f8146m4), (String) joVar2.f10148c.a(es.f8162o4));
            } else if (mn1Var == mn1.AppOpen) {
                yr<Integer> yrVar3 = es.f8232x4;
                jo joVar3 = jo.f10145d;
                nn1Var = new nn1(context, mn1Var, ((Integer) joVar3.f10148c.a(yrVar3)).intValue(), ((Integer) joVar3.f10148c.a(es.f8246z4)).intValue(), ((Integer) joVar3.f10148c.a(es.A4)).intValue(), (String) joVar3.f10148c.a(es.f8217v4), (String) joVar3.f10148c.a(es.f8225w4), (String) joVar3.f10148c.a(es.f8238y4));
            } else {
                nn1Var = null;
            }
            jn1 jn1Var = new jn1(nn1Var);
            tn1<R, AdT> tn1Var2 = new tn1<>(jn1Var, new xn1(jn1Var, gn1Var, rb1Var));
            this.f14463a.put(mn1Var, tn1Var2);
            return tn1Var2;
        }
        return tn1Var;
    }
}
