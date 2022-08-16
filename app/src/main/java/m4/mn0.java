package m4;

import d.a;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class mn0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f11251a;

    /* renamed from: b */
    public final vd2 f11252b;

    /* renamed from: c */
    public final Object f11253c;

    public mn0(ct0 ct0Var, vd2 vd2Var) {
        this.f11251a = 2;
        this.f11253c = ct0Var;
        this.f11252b = vd2Var;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f11251a) {
            case 0:
                return new es0((oq0) this.f11252b.a(), (Executor) ((vd2) this.f11253c).a());
            case 1:
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return new oh1(t90Var, ((en1) ((vd2) this.f11253c)).b());
            default:
                return new es0((fz0) this.f11252b.a(), u90.f14299f);
        }
    }

    public /* synthetic */ mn0(vd2 vd2Var, vd2 vd2Var2, int i10) {
        this.f11251a = i10;
        this.f11252b = vd2Var;
        this.f11253c = vd2Var2;
    }
}
