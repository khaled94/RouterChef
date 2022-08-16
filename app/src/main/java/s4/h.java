package s4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m0.h0;

/* loaded from: classes.dex */
public abstract class h implements n, j {

    /* renamed from: s */
    public final String f17900s;

    /* renamed from: t */
    public final Map<String, n> f17901t = new HashMap();

    public h(String str) {
        this.f17900s = str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, s4.n>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<java.lang.String, s4.n>] */
    @Override // s4.j
    public final n O(String str) {
        return this.f17901t.containsKey(str) ? (n) this.f17901t.get(str) : n.f18009j;
    }

    public abstract n a(a4 a4Var, List<n> list);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, s4.n>] */
    @Override // s4.j
    public final boolean d(String str) {
        return this.f17901t.containsKey(str);
    }

    @Override // s4.n
    public final Boolean e() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        String str = this.f17900s;
        if (str == null) {
            return false;
        }
        return str.equals(hVar.f17900s);
    }

    @Override // s4.n
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // s4.n
    public n g() {
        return this;
    }

    @Override // s4.n
    public final String h() {
        return this.f17900s;
    }

    public final int hashCode() {
        String str = this.f17900s;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // s4.n
    public final n i(String str, a4 a4Var, List<n> list) {
        return "toString".equals(str) ? new r(this.f17900s) : h0.e(this, new r(str), a4Var, list);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, s4.n>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.HashMap, java.util.Map<java.lang.String, s4.n>] */
    @Override // s4.j
    public final void k(String str, n nVar) {
        if (nVar == null) {
            this.f17901t.remove(str);
        } else {
            this.f17901t.put(str, nVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, s4.n>] */
    @Override // s4.n
    public final Iterator<n> l() {
        return new i(this.f17901t.keySet().iterator());
    }
}
