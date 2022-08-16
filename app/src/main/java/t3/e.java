package t3;

import d.a;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import m4.dj0;
import m4.do0;
import m4.es;
import m4.es0;
import m4.jo;
import m4.nd2;
import m4.t90;
import m4.to1;
import m4.u31;
import m4.u90;
import m4.vd2;
import m4.wo1;
import m4.yr;
import m4.zo1;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f18583a;

    /* renamed from: b */
    public final vd2 f18584b;

    /* renamed from: c */
    public final vd2 f18585c;

    /* renamed from: d */
    public final vd2 f18586d;

    public /* synthetic */ e(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3, int i10) {
        this.f18583a = i10;
        this.f18584b = vd2Var;
        this.f18585c = vd2Var2;
        this.f18586d = vd2Var3;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f18583a) {
            case 0:
                h hVar = (h) this.f18585c;
                Objects.requireNonNull(hVar);
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                to1 f10 = ((zo1) this.f18584b.a()).b(wo1.GENERATE_SIGNALS, ((do0) this.f18586d).a().b()).f(new g(t90Var, ((u31) hVar.f18591b).a()));
                yr<Integer> yrVar = es.f8208u3;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                return f10.h(((Integer) jo.f10145d.f10148c.a(yrVar)).intValue()).a();
            default:
                dj0 dj0Var = (dj0) this.f18584b.a();
                t90 t90Var2 = u90.f14294a;
                a.d(t90Var2);
                Set emptySet = ((JSONObject) this.f18586d.a()) == null ? Collections.emptySet() : Collections.singleton(new es0(dj0Var, t90Var2));
                a.d(emptySet);
                return emptySet;
        }
    }
}
