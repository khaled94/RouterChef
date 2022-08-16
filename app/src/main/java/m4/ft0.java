package m4;

import d.a;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class ft0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f8639a = 0;

    /* renamed from: b */
    public final vd2 f8640b;

    /* renamed from: c */
    public final vd2 f8641c;

    public ft0(vd2 vd2Var) {
        this.f8640b = vd2Var;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f8639a) {
            case 0:
                Set singleton = Collections.singleton(new es0((xn0) this.f8640b.a(), u90.f14299f));
                a.d(singleton);
                return singleton;
            default:
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return new es0((p21) this.f8640b.a(), t90Var);
        }
    }

    public ft0(vd2 vd2Var, vd2 vd2Var2) {
        go1 go1Var = eb.f7756v;
        this.f8640b = vd2Var;
        this.f8641c = go1Var;
    }
}
