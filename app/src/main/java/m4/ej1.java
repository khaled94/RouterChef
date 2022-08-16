package m4;

import d.a;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class ej1 implements nd2<cj1> {

    /* renamed from: a */
    public final vd2<z80> f7982a;

    /* renamed from: b */
    public final vd2<Boolean> f7983b;

    /* renamed from: c */
    public final vd2<String> f7984c;

    /* renamed from: d */
    public final vd2<ScheduledExecutorService> f7985d;

    public ej1(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3, vd2 vd2Var4) {
        this.f7982a = vd2Var;
        this.f7983b = vd2Var2;
        this.f7984c = vd2Var3;
        this.f7985d = vd2Var4;
    }

    @Override // m4.vd2
    public final Object a() {
        boolean booleanValue = Boolean.valueOf(((o50) ((wi1) this.f7983b).f15030a.f13474b).f11995s.getBoolean("is_gbid")).booleanValue();
        t90 t90Var = u90.f14294a;
        a.d(t90Var);
        ((ui1) this.f7984c).b();
        return new cj1(this.f7982a.a(), booleanValue, t90Var, this.f7985d.a());
    }
}
