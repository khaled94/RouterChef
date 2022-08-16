package m4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class y51 implements ap1 {

    /* renamed from: s */
    public final Map<wo1, String> f15593s = new HashMap();

    /* renamed from: t */
    public final Map<wo1, String> f15594t = new HashMap();

    /* renamed from: u */
    public final dp1 f15595u;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<m4.wo1, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<m4.wo1, java.lang.String>] */
    public y51(Set<x51> set, dp1 dp1Var) {
        this.f15595u = dp1Var;
        for (x51 x51Var : set) {
            this.f15593s.put(x51Var.f15223a, "ttc");
            this.f15594t.put(x51Var.f15224b, "ttc");
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<m4.wo1, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.HashMap, java.util.Map<m4.wo1, java.lang.String>] */
    @Override // m4.ap1
    public final void a(wo1 wo1Var, String str) {
        dp1 dp1Var = this.f15595u;
        String valueOf = String.valueOf(str);
        dp1Var.d(valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task."), "s.");
        if (this.f15594t.containsKey(wo1Var)) {
            dp1 dp1Var2 = this.f15595u;
            String valueOf2 = String.valueOf((String) this.f15594t.get(wo1Var));
            dp1Var2.d(valueOf2.length() != 0 ? "label.".concat(valueOf2) : new String("label."), "s.");
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<m4.wo1, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.HashMap, java.util.Map<m4.wo1, java.lang.String>] */
    @Override // m4.ap1
    public final void b(wo1 wo1Var, String str) {
        dp1 dp1Var = this.f15595u;
        String valueOf = String.valueOf(str);
        dp1Var.c(valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task."));
        if (this.f15593s.containsKey(wo1Var)) {
            dp1 dp1Var2 = this.f15595u;
            String valueOf2 = String.valueOf((String) this.f15593s.get(wo1Var));
            dp1Var2.c(valueOf2.length() != 0 ? "label.".concat(valueOf2) : new String("label."));
        }
    }

    @Override // m4.ap1
    public final void f(String str) {
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.HashMap, java.util.Map<m4.wo1, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.HashMap, java.util.Map<m4.wo1, java.lang.String>] */
    @Override // m4.ap1
    public final void h(wo1 wo1Var, String str, Throwable th) {
        dp1 dp1Var = this.f15595u;
        String valueOf = String.valueOf(str);
        dp1Var.d(valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task."), "f.");
        if (this.f15594t.containsKey(wo1Var)) {
            dp1 dp1Var2 = this.f15595u;
            String valueOf2 = String.valueOf((String) this.f15594t.get(wo1Var));
            dp1Var2.d(valueOf2.length() != 0 ? "label.".concat(valueOf2) : new String("label."), "f.");
        }
    }
}
