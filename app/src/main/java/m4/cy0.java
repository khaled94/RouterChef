package m4;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class cy0 implements nd2<ay0> {

    /* renamed from: a */
    public final vd2<Executor> f7154a;

    /* renamed from: b */
    public final vd2<lj0> f7155b;

    /* renamed from: c */
    public final vd2<fs0> f7156c;

    public cy0(vd2<Executor> vd2Var, vd2<lj0> vd2Var2, vd2<fs0> vd2Var3) {
        this.f7154a = vd2Var;
        this.f7155b = vd2Var2;
        this.f7156c = vd2Var3;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        return new ay0(this.f7154a.a(), this.f7155b.a(), this.f7156c.a());
    }
}
