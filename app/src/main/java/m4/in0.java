package m4;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class in0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f9699a;

    /* renamed from: b */
    public final vd2 f9700b;

    /* renamed from: c */
    public final vd2 f9701c;

    public /* synthetic */ in0(vd2 vd2Var, vd2 vd2Var2, int i10) {
        this.f9699a = i10;
        this.f9700b = vd2Var;
        this.f9701c = vd2Var2;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f9699a) {
            case 0:
                return new es0((oq0) this.f9700b.a(), (Executor) this.f9701c.a());
            default:
                return new p21((x21) this.f9700b.a(), ((mo0) this.f9701c).b());
        }
    }
}
