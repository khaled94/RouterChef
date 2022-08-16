package m4;

import d.a;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class wh0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f15023a;

    /* renamed from: b */
    public final Object f15024b;

    public /* synthetic */ wh0(Object obj, int i10) {
        this.f15023a = i10;
        this.f15024b = obj;
    }

    @Override // m4.vd2
    public final /* synthetic */ Object a() {
        switch (this.f15023a) {
            case 0:
                return new vh0(((dn1) ((vd2) this.f15024b)).a());
            case 1:
                return new lp0(((td2) ((vd2) this.f15024b)).a());
            case 2:
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return new k01(t90Var);
            case 3:
                return new n21(((lf0) ((vd2) this.f15024b)).b());
            case 4:
                return new yd1(((en1) ((vd2) this.f15024b)).b());
            default:
                Set emptySet = Collections.emptySet();
                a.d(emptySet);
                return emptySet;
        }
    }
}
