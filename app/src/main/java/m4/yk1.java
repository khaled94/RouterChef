package m4;

import java.util.concurrent.Executor;
import m4.fo0;

/* loaded from: classes.dex */
public final class yk1<R extends fo0<? extends am0>> {

    /* renamed from: a */
    public final in1 f15803a;

    /* renamed from: b */
    public final R f15804b;

    /* renamed from: c */
    public final Executor f15805c;

    /* renamed from: d */
    public xk1 f15806d;

    public yk1(in1 in1Var, R r10, Executor executor) {
        this.f15803a = in1Var;
        this.f15804b = r10;
        this.f15805c = executor;
    }

    @Deprecated
    public final qn1 a() {
        om1 e10 = this.f15804b.e();
        jn jnVar = e10.f12203d;
        String str = e10.f12205f;
        un unVar = e10.f12209j;
        jn1 jn1Var = (jn1) this.f15803a;
        return new rn1(jnVar, str, new r50(jn1Var.f10139b.f11866s).a().f13524j, jn1Var.f10139b.y, unVar);
    }
}
