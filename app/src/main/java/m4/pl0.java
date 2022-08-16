package m4;

import d.a;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class pl0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f12554a;

    /* renamed from: b */
    public final vd2 f12555b;

    /* renamed from: c */
    public final vd2 f12556c;

    /* renamed from: d */
    public final vd2 f12557d;

    /* renamed from: e */
    public final vd2 f12558e;

    public /* synthetic */ pl0(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3, vd2 vd2Var4, int i10) {
        this.f12554a = i10;
        this.f12555b = vd2Var;
        this.f12556c = vd2Var2;
        this.f12557d = vd2Var3;
        this.f12558e = vd2Var4;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f12554a) {
            case 0:
                zl0 a10 = ((fn0) this.f12555b).a();
                zv zvVar = (zv) ((ol0) this.f12556c).f12195a.f4818s;
                a.d(zvVar);
                return new ml0(a10, zvVar, (Runnable) ((nl0) this.f12557d).f11825a.f4819t, (Executor) this.f12558e.a());
            case 1:
                yo0 yo0Var = new yo0(((td2) ((ap0) this.f12555b).f6227a).a());
                Set a11 = ((td2) this.f12556c).a();
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return new zo0(yo0Var, a11, t90Var, (ScheduledExecutorService) this.f12558e.a());
            case 2:
                return new jy0(((en1) this.f12555b).b(), ((ov0) this.f12556c).b(), ((uv0) this.f12557d).a(), (av0) this.f12558e.a());
            default:
                t90 t90Var2 = u90.f14294a;
                a.d(t90Var2);
                return new od1(t90Var2, (h01) this.f12556c.a(), (j21) this.f12557d.a(), (qd1) this.f12558e.a());
        }
    }
}
