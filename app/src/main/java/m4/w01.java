package m4;

import java.util.Map;

/* loaded from: classes.dex */
public final class w01 implements ap1 {

    /* renamed from: s */
    public final Map<wo1, v01> f14817s;

    /* renamed from: t */
    public final wj f14818t;

    public w01(wj wjVar, Map<wo1, v01> map) {
        this.f14817s = map;
        this.f14818t = wjVar;
    }

    @Override // m4.ap1
    public final void a(wo1 wo1Var, String str) {
        if (this.f14817s.containsKey(wo1Var)) {
            this.f14818t.b(this.f14817s.get(wo1Var).f14547b);
        }
    }

    @Override // m4.ap1
    public final void b(wo1 wo1Var, String str) {
        if (this.f14817s.containsKey(wo1Var)) {
            this.f14818t.b(this.f14817s.get(wo1Var).f14546a);
        }
    }

    @Override // m4.ap1
    public final void f(String str) {
    }

    @Override // m4.ap1
    public final void h(wo1 wo1Var, String str, Throwable th) {
        if (this.f14817s.containsKey(wo1Var)) {
            this.f14818t.b(this.f14817s.get(wo1Var).f14548c);
        }
    }
}
