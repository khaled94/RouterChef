package m4;

import d.a;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class ce1 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f6799a;

    /* renamed from: b */
    public final vd2 f6800b;

    /* renamed from: c */
    public final vd2 f6801c;

    /* renamed from: d */
    public final vd2 f6802d;

    /* renamed from: e */
    public final vd2 f6803e;

    /* renamed from: f */
    public final vd2 f6804f;

    public /* synthetic */ ce1(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3, vd2 vd2Var4, vd2 vd2Var5, int i10) {
        this.f6799a = i10;
        this.f6800b = vd2Var;
        this.f6801c = vd2Var2;
        this.f6802d = vd2Var3;
        this.f6803e = vd2Var4;
        this.f6804f = vd2Var5;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f6799a) {
            case 0:
                return new be1(((ko0) this.f6800b).a(), (String) this.f6801c.a(), (bn0) this.f6802d.a(), (cn1) this.f6803e.a(), ((mo0) this.f6804f).b());
            default:
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return new rh1(new s80(), ((lf0) this.f6801c).b(), (ScheduledExecutorService) this.f6802d.a(), t90Var, ((vi1) this.f6804f).a().intValue());
        }
    }
}
