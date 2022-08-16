package m4;

import h2.u;
import javax.annotation.ParametersAreNonnullByDefault;
import z.a;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class o00<I, O> implements xy1<Object, Object> {

    /* renamed from: a */
    public final j00<O> f11968a;

    /* renamed from: b */
    public final k00<I> f11969b;

    /* renamed from: c */
    public final e00 f11970c;

    /* renamed from: d */
    public final String f11971d;

    public o00(e00 e00Var, String str, k00<I> k00Var, j00<O> j00Var) {
        this.f11970c = e00Var;
        this.f11971d = str;
        this.f11969b = k00Var;
        this.f11968a = j00Var;
    }

    public final tz1<O> a(I i10) {
        w90 w90Var = new w90();
        a00 a10 = this.f11970c.a();
        a10.f(new a(this, a10, i10, w90Var), new u(this, w90Var, a10, 4));
        return w90Var;
    }

    @Override // m4.xy1
    public final tz1<O> h(I i10) {
        return a(i10);
    }
}
