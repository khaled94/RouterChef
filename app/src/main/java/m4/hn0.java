package m4;

import d.a;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class hn0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f9381a;

    /* renamed from: b */
    public final vd2 f9382b;

    /* renamed from: c */
    public final vd2 f9383c;

    public /* synthetic */ hn0(vd2 vd2Var, vd2 vd2Var2, int i10) {
        this.f9381a = i10;
        this.f9382b = vd2Var;
        this.f9383c = vd2Var2;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f9381a) {
            case 0:
                return new es0((oq0) this.f9382b.a(), (Executor) this.f9383c.a());
            case 1:
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return new f11((j11) this.f9382b.a(), t90Var);
            default:
                t90 t90Var2 = u90.f14294a;
                a.d(t90Var2);
                return new es0((p21) this.f9382b.a(), t90Var2);
        }
    }
}
