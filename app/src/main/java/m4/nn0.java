package m4;

import d.a;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class nn0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f11863a;

    /* renamed from: b */
    public final vd2 f11864b;

    /* renamed from: c */
    public final Object f11865c;

    public nn0(pj0 pj0Var, vd2 vd2Var) {
        this.f11863a = 2;
        this.f11865c = pj0Var;
        this.f11864b = vd2Var;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f11863a) {
            case 0:
                return new es0((oq0) this.f11864b.a(), (Executor) ((vd2) this.f11865c).a());
            case 1:
                return new s21((j21) this.f11864b.a(), (g01) ((vd2) this.f11865c).a());
            default:
                Set singleton = Collections.singleton(new es0((tl0) this.f11864b.a(), u90.f14299f));
                a.d(singleton);
                return singleton;
        }
    }

    public /* synthetic */ nn0(vd2 vd2Var, vd2 vd2Var2, int i10) {
        this.f11863a = i10;
        this.f11864b = vd2Var;
        this.f11865c = vd2Var2;
    }
}
