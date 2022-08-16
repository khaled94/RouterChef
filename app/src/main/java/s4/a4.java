package s4;

import h2.u;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class a4 {

    /* renamed from: a */
    public final a4 f17710a;

    /* renamed from: b */
    public final u f17711b;

    /* renamed from: c */
    public final Map<String, n> f17712c = new HashMap();

    /* renamed from: d */
    public final Map<String, Boolean> f17713d = new HashMap();

    public a4(a4 a4Var, u uVar) {
        this.f17710a = a4Var;
        this.f17711b = uVar;
    }

    public final a4 a() {
        return new a4(this, this.f17711b);
    }

    public final n b(n nVar) {
        return this.f17711b.g(this, nVar);
    }

    public final n c(d dVar) {
        n nVar = n.f18009j;
        Iterator<Integer> q10 = dVar.q();
        while (q10.hasNext()) {
            nVar = this.f17711b.g(this, dVar.o(q10.next().intValue()));
            if (nVar instanceof f) {
                break;
            }
        }
        return nVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, s4.n>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<java.lang.String, s4.n>] */
    public final n d(String str) {
        if (this.f17712c.containsKey(str)) {
            return (n) this.f17712c.get(str);
        }
        a4 a4Var = this.f17710a;
        if (a4Var == null) {
            throw new IllegalArgumentException(String.format("%s is not defined", str));
        }
        return a4Var.d(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, java.lang.Boolean>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<java.lang.String, s4.n>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.HashMap, java.util.Map<java.lang.String, s4.n>] */
    public final void e(String str, n nVar) {
        if (this.f17713d.containsKey(str)) {
            return;
        }
        if (nVar == null) {
            this.f17712c.remove(str);
        } else {
            this.f17712c.put(str, nVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, s4.n>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map<java.lang.String, java.lang.Boolean>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<java.lang.String, s4.n>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.HashMap, java.util.Map<java.lang.String, s4.n>] */
    public final void f(String str, n nVar) {
        a4 a4Var;
        if (!this.f17712c.containsKey(str) && (a4Var = this.f17710a) != null && a4Var.g(str)) {
            this.f17710a.f(str, nVar);
        } else if (this.f17713d.containsKey(str)) {
        } else {
            if (nVar == null) {
                this.f17712c.remove(str);
            } else {
                this.f17712c.put(str, nVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, s4.n>] */
    public final boolean g(String str) {
        if (this.f17712c.containsKey(str)) {
            return true;
        }
        a4 a4Var = this.f17710a;
        if (a4Var == null) {
            return false;
        }
        return a4Var.g(str);
    }
}
