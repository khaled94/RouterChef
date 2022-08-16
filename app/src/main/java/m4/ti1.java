package m4;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class ti1 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f14074a;

    /* renamed from: b */
    public final vd2 f14075b;

    /* renamed from: c */
    public final vd2 f14076c;

    /* renamed from: d */
    public final vd2 f14077d;

    public /* synthetic */ ti1(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3, int i10) {
        this.f14074a = i10;
        this.f14075b = vd2Var;
        this.f14076c = vd2Var2;
        this.f14077d = vd2Var3;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f14074a) {
            case 0:
                ((lf0) this.f14077d).b();
                return new ri1((ScheduledExecutorService) this.f14076c.a());
            default:
                return new am1((wl1) this.f14075b.a(), (sl1) this.f14076c.a(), (mm1) this.f14077d.a());
        }
    }
}
