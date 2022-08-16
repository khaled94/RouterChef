package m4;

import d.a;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class gn0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f8978a;

    /* renamed from: b */
    public final vd2 f8979b;

    /* renamed from: c */
    public final vd2 f8980c;

    public /* synthetic */ gn0(vd2 vd2Var, vd2 vd2Var2, int i10) {
        this.f8978a = i10;
        this.f8979b = vd2Var;
        this.f8980c = vd2Var2;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f8978a) {
            case 0:
                return new es0((oq0) this.f8979b.a(), (Executor) this.f8980c.a());
            case 1:
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return new es0((p21) this.f8979b.a(), t90Var);
            case 2:
                t90 t90Var2 = u90.f14294a;
                a.d(t90Var2);
                return new hf1(t90Var2, (x21) this.f8980c.a());
            default:
                t90 t90Var3 = u90.f14294a;
                a.d(t90Var3);
                return new ch1(t90Var3, ((en1) this.f8980c).b());
        }
    }
}
