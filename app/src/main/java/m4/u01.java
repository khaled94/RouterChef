package m4;

import android.content.Context;
import d.a;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import l3.s;

/* loaded from: classes.dex */
public final class u01 implements nd2<Set<es0<ap1>>> {

    /* renamed from: a */
    public final vd2<String> f14236a;

    /* renamed from: b */
    public final vd2<Context> f14237b;

    /* renamed from: c */
    public final vd2<Map<wo1, v01>> f14238c;

    public u01(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3) {
        this.f14236a = vd2Var;
        this.f14237b = vd2Var2;
        this.f14238c = vd2Var3;
    }

    @Override // m4.vd2
    public final Object a() {
        Set set;
        String str = ((o50) ((xi1) this.f14236a).f15371a.f13474b).f12001z;
        a.d(str);
        Context b10 = ((lf0) this.f14237b).b();
        t90 t90Var = u90.f14294a;
        a.d(t90Var);
        Map a10 = ((qd2) this.f14238c).a();
        if (((Boolean) jo.f10145d.f10148c.a(es.f8053a3)).booleanValue()) {
            wj wjVar = new wj(new xj(b10));
            synchronized (wjVar) {
                if (wjVar.f15033c) {
                    try {
                        cl clVar = wjVar.f15032b;
                        if (clVar.f9884u) {
                            clVar.m();
                            clVar.f9884u = false;
                        }
                        dl.A((dl) clVar.f9883t, str);
                    } catch (NullPointerException e10) {
                        s.B.f5793g.g(e10, "AdMobClearcutLogger.modify");
                    }
                }
            }
            set = Collections.singleton(new es0(new w01(wjVar, a10), t90Var));
        } else {
            set = Collections.emptySet();
        }
        a.d(set);
        return set;
    }
}
