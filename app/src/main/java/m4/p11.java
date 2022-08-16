package m4;

import d.a;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class p11 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f12372a = 0;

    /* renamed from: b */
    public final vd2 f12373b;

    /* renamed from: c */
    public final vd2 f12374c;

    /* renamed from: d */
    public final Object f12375d;

    public p11(qi qiVar, vd2 vd2Var) {
        go1 go1Var = eb.f7756v;
        this.f12375d = qiVar;
        this.f12373b = vd2Var;
        this.f12374c = go1Var;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f12372a) {
            case 0:
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                Set e10 = qi.e((r11) this.f12373b.a(), t90Var);
                a.d(e10);
                return e10;
            default:
                t90 t90Var2 = u90.f14294a;
                a.d(t90Var2);
                return new zo1(t90Var2, (ScheduledExecutorService) this.f12374c.a(), new yo1(((td2) ((bp1) ((vd2) this.f12375d)).f6586a).a()));
        }
    }

    public p11(vd2 vd2Var, vd2 vd2Var2) {
        go1 go1Var = eb.f7756v;
        this.f12373b = go1Var;
        this.f12374c = vd2Var;
        this.f12375d = vd2Var2;
    }
}
