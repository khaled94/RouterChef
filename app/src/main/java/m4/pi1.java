package m4;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class pi1 implements eh1<fd1> {

    /* renamed from: a */
    public final uz1 f12522a;

    /* renamed from: b */
    public final List<String> f12523b;

    public pi1(uz1 uz1Var, List list) {
        this.f12522a = uz1Var;
        this.f12523b = list;
    }

    @Override // m4.eh1
    public final tz1<fd1> a() {
        return this.f12522a.Z(new Callable() { // from class: m4.oi1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new fd1(pi1.this.f12523b, 2);
            }
        });
    }
}
