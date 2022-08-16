package m4;

import java.util.concurrent.Executor;
import m4.am0;
import m4.fo0;

/* loaded from: classes.dex */
public final class jk1<U extends fo0<A>, A extends am0> implements wn1<U, A> {

    /* renamed from: a */
    public final cl1<U> f10104a;

    /* renamed from: b */
    public final el1 f10105b;

    /* renamed from: c */
    public final jn f10106c;

    /* renamed from: d */
    public final String f10107d;

    /* renamed from: e */
    public final Executor f10108e;

    /* renamed from: f */
    public final un f10109f;

    /* renamed from: g */
    public final qn1 f10110g;

    public jk1(cl1<U> cl1Var, el1 el1Var, jn jnVar, String str, Executor executor, un unVar, qn1 qn1Var) {
        this.f10104a = cl1Var;
        this.f10105b = el1Var;
        this.f10106c = jnVar;
        this.f10107d = str;
        this.f10108e = executor;
        this.f10109f = unVar;
        this.f10110g = qn1Var;
    }

    @Override // m4.wn1
    public final Executor a() {
        return this.f10108e;
    }

    @Override // m4.wn1
    public final qn1 zza() {
        return this.f10110g;
    }
}
