package m4;

import d.a;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ih1<T> implements nd2<hh1<T>> {

    /* renamed from: a */
    public final vd2<Executor> f9653a = eb.f7756v;

    /* renamed from: b */
    public final vd2<Set<eh1<? extends dh1<T>>>> f9654b;

    public ih1(vd2 vd2Var) {
        this.f9654b = vd2Var;
    }

    @Override // m4.vd2
    public final Object a() {
        t90 t90Var = u90.f14294a;
        a.d(t90Var);
        return new hh1(t90Var, ((td2) this.f9654b).a());
    }
}
