package m4;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class hd1 implements eh1 {

    /* renamed from: a */
    public final tz1<String> f9196a;

    /* renamed from: b */
    public final Executor f9197b;

    public hd1(tz1<String> tz1Var, Executor executor) {
        this.f9196a = tz1Var;
        this.f9197b = executor;
    }

    @Override // m4.eh1
    public final tz1 a() {
        return mz1.p(this.f9196a, gd1.f8832a, this.f9197b);
    }
}
